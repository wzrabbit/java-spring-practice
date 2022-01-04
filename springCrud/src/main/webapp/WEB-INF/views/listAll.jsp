<%@ page language="java" contentType="text/html; charset=EUC-KR"

    pageEncoding="EUC-KR"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>

<!DOCTYPE html> 

<html>

<head>

<title>게시판 목록</title>

</head>

<form action = "write" method = "get">

<body>

<table border="1" width="880">

        <tr>

        <td width="77">

            <p align="center">글번호</p>

        </td>

        <td width="327">

            <p align="center">제목</p>

        </td>

        <td width="155">

            <p align="center">작성일</p>

        </td>

        </tr>

        

        <c:forEach items="${list}" var="boardVO">

	<tr>

        <td>${boardVO.id}</td>

        <td><a href='/read?id=${boardVO.id}'>${boardVO.title}</a></td>

        <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"

				value="${boardVO.date_}" /></td>

	</tr>

		</c:forEach>

    </table>

    <button type ="submit">글쓰기</button>

   </body>

    </form>

</html>