package no.birtheeriksen.integritas_backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ArticleController {

    @GetMapping("/")
    fun index(): String {
        return "Hello World!"
    }
}