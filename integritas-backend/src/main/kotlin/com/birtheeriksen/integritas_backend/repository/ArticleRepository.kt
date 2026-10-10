package com.birtheeriksen.integritas_backend.repository

import com.birtheeriksen.integritas_backend.models.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ArticleRepository: JpaRepository<com.birtheeriksen.integritas_backend.models.ArticleEntity, Long> {

}