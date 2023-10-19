<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이 페이지</title>
</head>
<body>
    <h1>마이 페이지</h1>
    
    <ul>
        <%
            // 여기에서 백엔드에서 받아온 스터디 목록을 반복하여 표시
            List<Study> myStudies = (List<Study>) request.getAttribute("myStudies"); // 백엔드에서 받아온 스터디 목록
            
            if (myStudies != null && !myStudies.isEmpty()) {
                for (Study study : myStudies) {
        %>
        <li>
            <strong><%= study.getStudyName() %></strong>
            <p>카테고리: <%= study.getCategory() %></p>
            <p>상태: <%= study.getStatus() %></p>
        </li>
        <%
                }
            } else {
        %>
        <li>참여한 스터디가 없습니다.</li>
        <%
            }
        %>
    </ul>
    
    <button onclick="location.href='/studyDetail.jsp'">스터디 상세 정보로 이동</button>
</body>
</html>
