<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="base.jsp"%>
<style type="text/css">
	.big{font-size: 22px;}
/* 	td{color:green;} */
</style>
</head>
<body style=" background-repeat: no-repeat;
  background-size: cover;color: brown;font-size: 20px; " background="<c:url value="/resources/images/4.jpeg" />">

	<div class="container mt-5">
		<div class="row mt-2">
			<div class="col-md-8 offset-md-2">

				<h1 class="text-center mb-4">...My Products...</h1>

				<table class="table table-striped table-hover">
					<thead>
						<tr style="color:green;">
							<!-- <th scope="col">Id</th> -->
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Product Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					   <c:forEach items="${products}" var="item">
						<tr>
							<!-- <td>${item.id }</td> -->
							<td>${item.name }</td>
							<td>${item.description }</td>
							<td>${item.price }</td>
							<td><a href="/delete/${item.id}" class="text-danger big"><i class="fas fa-trash-alt"></i></a>&nbsp;<i class="fas fa-grip-lines-vertical big"></i>&nbsp;<a href="update/${item.id}" class="text-success big"><i class="fas fa-edit"></i></a></td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<div class="container text-center">
					<a href="/add-product" class="btn btn-success">❤Add New Product❤</a>
				</div>
			</div>
		</div>
	</div>

</body>
</html>