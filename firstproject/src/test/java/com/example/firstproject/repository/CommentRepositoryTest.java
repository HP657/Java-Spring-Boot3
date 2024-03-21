package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findByArticleId() {
        {
            Long articleId = 4L;
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            Article article = new Article(4L, "당신의 인생 영화는?", "댓글 고");

            Comment a = new Comment(1L, article, "Park", "굿 윌 헌팅");
            Comment b = new Comment(2L, article, "Kim", "아이 엠 샘");
            Comment c = new Comment(3L, article, "Choi", "쇼생크 탈출");
            List<Comment> expected = Arrays.asList(a, b, c);

            assertEquals(expected.toString(), comments.toString(), "4번 글의 모든 댓글을 출력!");
        }
        {
            Long articleId = 1L;
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            Article article = new Article(1L, "제목1", "내용1");
            List<Comment> expected = Arrays.asList();

            assertEquals(expected.toString(), comments.toString(), "1번 글의 댓글이 없음");
        }
        {
            Long articleId = 9L;
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            Article article = null;
            List<Comment> expected = Arrays.asList();

            assertEquals(expected.toString(), comments.toString(), "글이 없기에 댓글도 없음");
        }
        {
            Long articleId = 999L;
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            Article article = null;
            List<Comment> expected = Arrays.asList();

            assertEquals(expected.toString(), comments.toString(), "글이 없기에 댓글도 없음");
        }
        {
            Long articleId = -1L;
            List<Comment> comments = commentRepository.findByArticleId(articleId);

            Article article = null;
            List<Comment> expected = Arrays.asList();

            assertEquals(expected.toString(), comments.toString(), "글이 없기에 댓글도 없음");
        }
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        {
            String nickname = "Park";
            List<Comment> comments = commentRepository.findByNickname(nickname);

            Comment a = new Comment(1L, new Article(4L, "당신의 인생 영화는?", "댓글 고"), nickname, "굿 윌 헌팅");
            Comment b = new Comment(4L, new Article(5L, "당신의 소울 푸드는?", "댓글 고고"), nickname, "치킨");
            Comment c = new Comment(7L, new Article(6L, "당신의 취미는?", "댓글 고고고"), nickname, "조깅");

            List<Comment> expected = Arrays.asList(a, b, c);

            assertEquals(expected.toString(), comments.toString(), "Park의 모든 댓글을 출력!");
        }
        {
            String nickname = "Kim";
            List<Comment> comments = commentRepository.findByNickname(nickname);

            Comment a = new Comment(2L, new Article(4L, "당신의 인생 영화는?", "댓글 고"), nickname, "아이 엠 샘");
            Comment b = new Comment(5L, new Article(5L, "당신의 소울 푸드는?", "댓글 고고"), nickname, "샤브샤브");
            Comment c = new Comment(8L, new Article(6L, "당신의 취미는?", "댓글 고고고"), nickname, "유튜브 시청");

            List<Comment> expected = Arrays.asList(a, b, c);

            assertEquals(expected.toString(), comments.toString(), "Kim의 모든 댓글을 출력!");
        }
        {
            String nickname = null;
            List<Comment> comments = commentRepository.findByNickname(nickname);


            List<Comment> expected = Arrays.asList();

            assertEquals(expected.toString(), comments.toString(), "null의 모든 댓글을 출력!");
        }
        {
            String nickname = "";
            List<Comment> comments = commentRepository.findByNickname(nickname);

            List<Comment> expected = Arrays.asList();

            assertEquals(expected.toString(), comments.toString(), "\"\"의 모든 댓글을 출력!");
        }
    }
}