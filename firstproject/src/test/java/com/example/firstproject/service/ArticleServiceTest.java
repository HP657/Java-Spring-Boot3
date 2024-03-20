package com.example.firstproject.service;

import com.example.firstproject.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleServiceTest {
    @Autowired
    ArticleService articleService;

    @Test
    void index() {
        Article a = new Article(1L, "제목1", "내용1");
        Article b = new Article(2L, "제목2", "내용2");
        Article c = new Article(3L, "제목3", "내용3");

        List<Article> expected = new ArrayList<Article>(Arrays.asList(a, b ,c));
        List<Article> articles = articleService.index();

        assertEquals(expected.toString(), articles.toString());
    }

    @Test
    void show_성공_존재하는_id_입력() {
        long id = 1L;
        Article expected = new Article(id, "제목1", "내용1");

        Article article = articleService.show(id);

        assertEquals(expected.toString(), article.toString());
    }
    @Test
    void show_실패_존재하지_않는_id_입력() {
        long id = 1L;
        Article expeted = null;

        Article article = articleService.show(id);

        assertEquals(expeted, article);
    }
}