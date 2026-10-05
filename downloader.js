window.downloadAssetFromUrl = function(url, fileName) {
    // Fetch the image as a blob to bypass display-only handling
    fetch(url)
        .then(response => {
            if (!response.ok) throw new Error('Network response failed');
            return response.blob();
        })
        .then(blob => {
            const blobUrl = URL.createObjectURL(blob);
            const anchor = document.createElement("a");
            anchor.href = blobUrl;
            anchor.download = fileName; // Forces the browser to save as this exact filename
            document.body.appendChild(anchor);
            anchor.click();
            document.body.removeChild(anchor);
            URL.revokeObjectURL(blobUrl);
        })
        .catch(err => {
            // Fallback: If direct blob fetching is restricted, use an object URL image trick
            const anchor = document.createElement("a");
            anchor.href = url;
            anchor.download = fileName;
            anchor.target = "_blank";
            document.body.appendChild(anchor);
            anchor.click();
            document.body.removeChild(anchor);
        });
};
