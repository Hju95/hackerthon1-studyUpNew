<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.kernel360.hackerthon.studyup.study.entity.Study" %>
<%@ page import="java.util.List" %>
<%@ page import="com.kernel360.hackerthon.studyup.study.service.StudyService" %>
<%@ page import="com.kernel360.hackerthon.studyup.study.service.StudyServiceImpl" %>

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
        <c:forEach var="study" items="${studyList}">
            <li>
                이름: ${study.getStudyTitle()}
                <br>
                설명: ${study.getSummary()}
                카테고리: ${study.getCategory()}
                <a href="${pageContext.request.contextPath}/study/" + ${study.getStudyId()}>스터디 자세히보기</a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>