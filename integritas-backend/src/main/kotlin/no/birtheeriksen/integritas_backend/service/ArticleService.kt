package no.birtheeriksen.integritas_backend.service

import no.birtheeriksen.integritas_backend.models.ArticleEntity
import no.birtheeriksen.integritas_backend.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(private val articleRepo: ArticleRepository) {

    fun getArticles(): List<ArticleEntity> {
        return articleRepo.findAll()
    }

    fun getArticle(id: Long): ArticleEntity {
        return articleRepo.findById(id).orElseThrow {
            RuntimeException("Couldn't find article by id $id")
        }
    }

    fun createArticle(title: String, content: String): ArticleEntity {
        val article = ArticleEntity().apply {
            this.title = title
            this.content = content
            this.slug = slugify(title)
        }
        return articleRepo.save(article)
    }

    fun updateArticle(id: Long, title: String, content: String): ArticleEntity {
        val article = getArticle(id).apply {
            this.title = title
            this.content = content
        }
        return articleRepo.save(article)
    }

    fun deleteArticle(id: Long) {
        articleRepo.delete(getArticle(id))
    }

    private fun slugify(title: String): String {
        return title.lowercase().replace("æ", "ae")
            .replace("ø", "o")
            .replace("å", "aa")
            .replace("[^a-z0-9]+".toRegex(), "-")
            .trim('-')
    }
}