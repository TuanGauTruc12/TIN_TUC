<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<title>Quản lý tin tức</title>
<body>
	<div class="container row">
		<a href="<c:url value = "/admin/new-admin/write-new/${ id_user }/addNew/"/>"
			class="btn btn-success m-3">Thêm tin tức</a>
	</div>

	<div class=" row mt-3 col-12">
		<table class="container rotable table-bordered col-12 text-center ml-2">
			<thead>
				<tr>
					<th>Tiêu đề</th>
					<th>Thuộc tính</th>
					<th>Danh mục</th>
					<th>Ngày duyệt</th>
					<th>Tạng thái</th>
					<th>Hành động</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="newAdmin" items="${ newAdmin }">						
					
					<tr>
						<td class = "col-3">${ newAdmin.newTitle }</td>
						<td class = "col-2">${ newAdmin.property }</td>
						<td>${ newAdmin.category }</td>
						<td>${ newAdmin.approvalDate }</td>
						<c:if test="${ newAdmin.status == true }">
							<td>Đã được duyệt</td>
						</c:if>
						<c:if test="${ newAdmin.status == false }">
							<td>Chưa được duyệt</td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>