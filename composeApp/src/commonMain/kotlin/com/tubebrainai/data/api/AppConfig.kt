package com.tubebrainai.data.api

object AppConfig {
    // Replace with your actual API keys
    var YOUTUBE_API_KEY: String = "YOUR_YOUTUBE_API_KEY"
    var GEMINI_API_KEY: String = "YOUR_GEMINI_API_KEY"
    var PIXABAY_API_KEY: String = "YOUR_PIXABAY_API_KEY"
    var PEXELS_API_KEY: String = "YOUR_PEXELS_API_KEY"

    const val YOUTUBE_BASE_URL = "https://www.googleapis.com/youtube/v3"
    const val GEMINI_BASE_URL = "https://generativelanguage.googleapis.com/v1beta"
    const val PIXABAY_BASE_URL = "https://pixabay.com/api"
    const val PEXELS_BASE_URL = "https://api.pexels.com/v1"
    const val GEMINI_MODEL = "gemini-2.0-flash"
}
