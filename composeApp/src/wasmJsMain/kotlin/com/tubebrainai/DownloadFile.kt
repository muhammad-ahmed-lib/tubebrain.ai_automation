package com.tubebrainai

import kotlinx.browser.document
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.url.URL
import org.w3c.files.Blob
import org.w3c.files.BlobPropertyBag



actual fun downloadTextFile(content: String, filename: String) {
    // Explicitly create an Array<JsAny?> so it converts to JsArray<JsAny?>
    val blobParts = arrayOf<JsAny?>(content.toJsString()).toJsArray()

    val blob = Blob(blobParts, BlobPropertyBag(type = "text/plain"))
    val url = URL.createObjectURL(blob)
    val link = document.createElement("a") as HTMLAnchorElement
    link.href = url
    link.download = filename
    link.click()
    URL.revokeObjectURL(url)
}
