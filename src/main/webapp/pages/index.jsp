<%@ taglib uri="/struts-tags" prefix="html" %>
<html>
<body>
<html:form action="Product">
<html:textfield name="id" label="Product Id"></html:textfield>
<html:textfield name="name" label="Product Name"></html:textfield>
<html:textfield name="Price" label="Product Price"></html:textfield>
<html:submit value="save"></html:submit>
</html:form>
</body>
</html>
