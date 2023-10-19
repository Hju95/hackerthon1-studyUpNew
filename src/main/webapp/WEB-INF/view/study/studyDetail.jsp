<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>스터디 상세</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<header>
    <h1>스터디 모집</h1>
</header>
<main>
    <section class="box">
        <h2 class="title">스터디명</h2>
        <p class="category">
            <%= request.getParameter("category") %>
        </p>
    </section>
    <section class="box">
        <h2 class="title">내용</h2>
        <p class="category">
            <%= request.getParameter("category") %>
        </p>
    </section>
    <section class="box">
        <h2 class="title">모집인원</h2>
        <p class="category">
            <%= request.getParameter("category") %>
        </p>
    </section>
    <section class="box">
        <h2 class="title">분류</h2>
        <p class="category">
            <%= request.getParameter("category") %>
        </p>
    </section>
    <footer>
        <a href="list.jsp" class="btn btn-primary">목록</a>
        <a href="join.jsp" class="btn btn-secondary">참여하기</a>
    </footer>
</main>
</body>
</html>
