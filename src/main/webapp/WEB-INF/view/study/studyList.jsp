<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Study up!</title>
</head>
<body>
    <h1>Study up!</h1>
    <form>
        <label for="search">검색</label>
        <input type="text" name="search" id="search">
        <button id="searchButton">검색</button>
    </form>

    <h2>스터디 목록</h2>
    <ul>
        <!-- 서버에서 받아온 스터디 목록을 동적으로 표시합니다. -->
        <% 
            List<Study> studyList = studyService.getAllStudies(); // 서버에서 스터디 목록을 가져옵니다.
            for (Study study : studyList) { %>
                <li>
                    <a href="studyDetail.jsp?studyId=<%= study.getStudyId() %>">
                        <%= study.getStudyName() %>
                    </a>
                </li>
            <% } 
        %>
    </ul>
</body>
</html>