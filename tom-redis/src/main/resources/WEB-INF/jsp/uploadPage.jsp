<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.List" import="java.util.ArrayList"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传列表</title>
</head>
<body>
    <form method="post" action="/upload" enctype="multipart/form-data">
        <table>
            <tr>
                <td>选择上传文件： <input name="inputFile" type="file" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交" /></td>
            </tr>
        </table>
    </form>
</body>
</html>