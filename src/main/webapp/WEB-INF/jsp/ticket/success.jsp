<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<style>
h1 {
    font-size: 400%;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>報到結果</title>
</head>
<body>
	<h1>${ticketResult.ticket.customer.name} <br> 加菲貓活動 <br> 報到成功 <br></h1>
	<font size="+3">系統將在<span id="secSpan">3</span>秒後自動關閉</font>
    <script type="text/javascript">
		countDown();
	</script>
</body>
</html>