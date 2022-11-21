<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!-- Sidebar -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<li>
		<div class="sidebar-brand-text">
			<a href="<c:url value = "/admin/${ admin.id_role }"/>"
			class="sidebar-brand d-flex align-items-center justify-content-center">
				<i class="fa-solid fa-house p-2"></i>
			</a>
		</div>
	</li>
	<!-- Divider -->
	<li>
		<hr class="sidebar-divider">
	</li>	
	
	<!-- Nav Item - Pages Collapse Menu -->
	<li class="nav-item">
	<c:if test="${ role.id == 1 }">
		<a class="nav-link" href="<c:url value = "/admin/1"/>"> <i class="fa fa-users"></i>
			 <span> ${ role.name } </span>
		</a>
		<a class="nav-link" href="<c:url value = "/admin/1/quan-ly-vai-tro/"/>"> <i class="fa fa-users"></i>
			 <span> Quản lý vai trò </span>
		</a>
	</c:if>
	</li>
</ul>
<!-- End of Sidebar -->

