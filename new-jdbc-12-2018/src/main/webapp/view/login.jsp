
<%@include file="/common/taglib.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
<div class="container">


    <div class="login-form">


        <div class="main-div">

            <c:if test="${not empty message}">
                <div class="alert alert-${alert}">
                        ${message}
                </div>
            </c:if>


            <form action="<c:url value='/dang-nhap'/>" id="formLogin" method="post">
                <div class="form-group">
                    <input type="text" class="form-control" id="userName" name="userName" placeholder="Tên đăng nhập ">
                </div>

                <div class="form-group">
                    <input type="password" class="form-control" id="password" name="password"  placeholder="Mật khẩu">
                </div>

                <input type="hidden" value="login"  name="action"/>
                <button type="submit" class="btn btn-primary">Đăng nhập </button>

            </form>
        </div>

    </div>
</div>
</div>
</body>
</html>
