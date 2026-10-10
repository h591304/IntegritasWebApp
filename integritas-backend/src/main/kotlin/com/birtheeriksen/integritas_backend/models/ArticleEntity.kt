package com.birtheeriksen.integritas_backend.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant

@Entity
@Table(
    name = "article"
)
class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var title: String = ""

    @Column(unique = true, nullable = false)
    var slug: String = ""

    @Column(nullable = false, columnDefinition = "TEXT")
    var  content: String = ""

    @Column(nullable = false, unique = true)
    var  imageUrl: String = ""

    @Column(nullable = false)
    var author: String = ""

    @CreationTimestamp
    var createdAt: Instant = Instant.now()
}