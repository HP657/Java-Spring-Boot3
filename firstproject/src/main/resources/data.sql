INSERT INTO article(title, content) VALUES('제목1', '내용1');
INSERT INTO article(title, content) VALUES('제목2', '내용2');
INSERT INTO article(title, content) VALUES('제목3', '내용3');


INSERT INTO member(id, email, password) VALUES(1, '123@gamil.com', '123123');
INSERT INTO member(id, email, password) VALUES(2, '123@naver.com', '123123');
INSERT INTO member(id, email, password) VALUES(3, '123@daum.com', '123123');


INSERT INTO coffee(name, price) VALUES('아메리카노', '4500');
INSERT INTO coffee(name, price) VALUES('라떼', '5000');
INSERT INTO coffee(name, price) VALUES('카페 모카', '5500');


INSERT INTO article(title, content) VALUES('당신의 인생 영화는?', '댓글 고');
INSERT INTO article(title, content) VALUES('당신의 소울 푸드는?', '댓글 고고');
INSERT INTO article(title, content) VALUES('당신의 취미는?', '댓글 고고고');

INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Park', '굿 윌 헌팅');
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Kim', '아이 엠 샘');
INSERT INTO comment(article_id, nickname, body) VALUES(4, 'Choi', '쇼생크 탈출');

INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Park', '치킨');
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Kim', '샤브샤브');
INSERT INTO comment(article_id, nickname, body) VALUES(5, 'Choi', '초밥');

INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Park', '조깅');
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Kim', '유튜브 시청');
INSERT INTO comment(article_id, nickname, body) VALUES(6, 'Choi', '독서');


INSERT INTO pizza (name, price) VALUES ('페페로니 피자', 25900);
INSERT INTO pizza (name, price) VALUES ('불고기 피자', 29900);
INSERT INTO pizza (name, price) VALUES ('고구마 피자', 30900);
INSERT INTO pizza (name, price) VALUES ('포테이토 피자', 27900);
INSERT INTO pizza (name, price) VALUES ('치즈 피자', 23900);