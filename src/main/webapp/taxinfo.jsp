<%@page import="com.ssi.TaxModel"%>
<%
	//fetching the model from request scope
	TaxModel model=(TaxModel)request.getAttribute("data");
%>
<html>
<body>
	<h3>Tax-Information</h3>
	<hr>
		<pre>
		Income	:	<%=model.getIncome()%>
		Age	:	<%=model.getAge()%>
		Tax	:	<%=model.getTax()%>
		Rebate	:	<%=model.getRebate()%>
		NetTax	:	<%=model.getNettax() %>
		</pre>
	<hr>
</body>
</html>