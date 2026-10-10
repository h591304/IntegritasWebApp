package com.birtheeriksen.integritas_backend.Mapper

import com.birtheeriksen.integritas_backend.dto.ArticleResponseDTO
import com.birtheeriksen.integritas_backend.models.ArticleEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface ArticleMapper {
    fun toDTO(article: ArticleEntity): ArticleResponseDTO

    @Mapping(target = "content", ignore = true)
    fun toListItemDTO(article: ArticleEntity): ArticleResponseDTO
}