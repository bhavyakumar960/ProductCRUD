<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@include file="base.jsp"%>
<style>
div {
	margin: 40px;
}

.in {
	padding: 15px;
}

.on {
	padding: 10px;
}
</style>

</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Update the Product Details...</h1>

				<form action="../update-product" method="post">

					<input type="hidden" class="form-control in" name="id"
						value="${product.id }" />
					<!-- isko rkhna must hai update ke liye wrna hmara saveOrUpdate method hmehsa iss product ko
					 new product ki trh treat krega aur ek new id ke saath product save krdega hmara -->

					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control in" name="name" value="${product.name }" />
					</div>

					<div class="form-group">
						<label for="description">Product Description</label>
						<textarea rows="5" class="form-control" name="description">${product.description }</textarea>
					</div>

					<div class="form-group">
						<label for="price">Product Price</label><input type="text"
							class="form-control in" name="price" value="${product.price }" />
					</div>

					<div class="container text-center">
						<a href="/" class="btn btn-outline-danger on">&nbsp;BACK&nbsp;</a>
						<button type="submit" class="btn btn-outline-primary on">&nbsp;UPDATE&nbsp;</button>
					</div>

				</form>

			</div>
		</div>
	</div>
</body>
</html>