package com.birtheeriksen.integritas_backend.dto

import java.time.Instant

data class ArticleResponseDTO(
    val title: String,
    val slug: String,
    val author: String,
    val imageUrl: String?,
    val publishedAt: Instant? = null,
    val content: String? = null
)