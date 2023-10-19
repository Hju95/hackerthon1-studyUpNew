<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>스터디 개설 폼</title>
</head>
<body>
    <h1>스터디 개설폼</h1>
    <form action="/createStudy" method="post">
        <label for="title">제목 :</label>
        <input type="text" name="title" id="title">
      
        <label for="summary">이메일 :</label>
        <input type="text" name="summary" id="summary">
      
        <label for="content">내용 :</label>
        <input type="text" name="content" id="content">
        
        <label for="max_member">최대 인원 :</label>
        <input type="number" name="max_member" id="max_member">

        <label for="category">카테고리:</label>
        <select id="category" name="category">
            <option value="cs">cs</option>
            <option value="자바프로그래밍">자바프로그래밍</option>
            <option value="웹 프로그래밍">웹 프로그래밍</option>
            <option value="audi">Audi</option>
        </select>

        <label for="deadline">모집마감일:</label>
        <input type="date" name="deadline" id="deadline">
        
        <label for="start_date">시작일:</label>
        <input type="date" name="start_date" id="start_date">
        
        <label for="end_date">종료일:</label>
        <input type="date" name="end_date" id="end_date">
        
        <button type="submit">스터디 개설하기</button>
      </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>스터디 상세 정보</title>
</head>
<body>
    <h1>스터디 상세 정보</h1>
    
    <%
        // 여기에서 백엔드에서 받아온 스터디 정보를 변수에 저장
        Long studyId = 1L;
        String studyName = "스터디 이름";
        String category = "카테고리";
        int maxMembers = 10;
        String studyContent = "스터디 내용";
        String studyStatus = "진행 중";
    %>

    <h2>스터디명: <%= studyName %></h2>
    <p>분류: <%= category %></p>
    <p>모집인원: <%= maxMembers %></p>
    <p>내용: <%= studyContent %></p>
    <p>상태: <%= studyStatus %></p>
    
    <button onclick="location.href='/studyList.jsp'">스터디 목록으로 이동</button>
    <button>스터디에 참여하기</button>
</body>
</html>
