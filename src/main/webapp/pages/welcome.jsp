<%@ taglib uri="/struts-tags" prefix="html" %>
<html>
<body>
<h1>hello world</h1>
product ID:<html:property value="id"/><br/>
Product Name:<html:property value="name"/><br/>
product Price:<html:property value="price"/><br/>
<html:iterator value="context" var="Element">

<html:set var="key" value="Elment.key"/>
<html:set var="value" value="Elment.value"/>
<tr>
<td><html:property value="key"/>:<html:property value="value"/></td></br>
</tr>
</html:iterator>
</body>
</html>