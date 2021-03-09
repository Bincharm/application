    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>
        <head></head>
        <body>
        <table border=1>
        <tr>
        <th>ID</th>
        <th>Full name</th>
        <th>Email</th>
        <th>Course</th>
        <th>Online</th>
        </tr>


        <c:forEach items="${list}" var="item">
            <tr>
            <td>${item.applicationId}</td>
            <td>${item.fullName}</td>
            <td>${item.email}</td>
            <td>${item.course}</td>
            <td>${item.isOnline}</td>
            </tr>
        </c:forEach>
        </table>

        </body>
        </html>