package no.birtheeriksen.integritas_backend.repository

import no.birtheeriksen.integritas_backend.models.ArticleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface ArticleRepository: JpaRepository<ArticleEntity, Long> {

}