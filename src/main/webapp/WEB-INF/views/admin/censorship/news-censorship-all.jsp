<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<title>Kiểm duyệt tin tức</title>

<body>
	<div class=" row mt-3 col-12">
		<table
			class="container rotable table-bordered col-12 text-center ml-2">
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
				<c:forEach var="newAdmin" items="${ newAdmins }">

					<tr>
						<td class="col-3">${ newAdmin.newTitle }</td>
						<td class="col-2">${ newAdmin.property }</td>
						<td>${ newAdmin.category }</td>
						<td>${ newAdmin.approvalDate }</td>
						<c:if test="${ newAdmin.status == true }">
							<td>Đã được duyệt</td>
						</c:if>
						<c:if test="${ newAdmin.status == false }">
							<td>Chưa được duyệt</td>
						</c:if>
						
						<td>
							<div class="btn-group">
								<a type="button"
									href="<c:url value = "/admin/new-admin/write-new/showNew/${ newAdmin.idNew }"/>"
									class="btn btn-info"> <i class="fa fa-eye"></i>
								</a>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<ul class="pagination justify-content-center mt-3">
		<li class="page-item disabled"><a class="page-link">1</a></li>
		<li class="page-item"><a class="page-link" href="#">2</a></li>
		<li class="page-item"><a class="page-link" href="#">3</a></li>
	</ul>
</body>