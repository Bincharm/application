    <%--<%@page pageEncoding="UTF-8"%>--%>
<html>
<head>
</head>
    <body>
        ${pageContext.request.contextPath}
        <form action="${pageContext.request.contextPath}/application" method="post">
            <p>Full name
            <input type="text" name="fullName">
            </p>
            <p>Course name
            <select name="course">
                <option value="JAVA">JAVA</option>
                <option value="PYTHON">PYTHON</option>
                <option value="JAVASCRIPT">JAVASCRIPT</option>
        </select>
            </p>
        <p>Email
        <input type="text" name="email">
        </p>

        <p>Is Online?
        <input type="checkbox" value="true" name="isOnline">
        </p>

        <input type="submit" name="submit">
        </form>

    </body>
</html>