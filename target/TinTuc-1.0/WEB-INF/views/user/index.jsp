<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<title>Trang chủ</title>
<body>
	<!-- Main Content Section Start -->
	<div class="main-content--section pbottom--30">
		<div class="container">
			<!-- Main Content Start -->
			<div class="main--content">
				<!-- Post Items Start -->
				<div class="post--items post--items-1 pd--30-0">
					<div class="row">
						<c:forEach items="${ newSixs }" var="nexSix">
							<div class="col-1 col-md-6 col-lg-4">
								<!-- Post Item Start -->
								<div class="post--item post--layout-1 post--title-large">
									<div class="post--img" style ="">
										<a
											href="http://localhost/KCNEW/bai-viet-tphcm-ra-mat-dich-vu-xe-dap-cong-cong">
											<img class = "img-fluid" height="400"
											src='<c:url value = "/public/user/uploads/tintuc/${ nexSix.image }"/>'
											alt=""></a> <a href="http://localhost/KCNEW/category/xe-co"
											class="cat">Xe cộ</a> <a href="#" class="icon"><i
											class="fa fa-flash"></i></a>

										<div class="post--info">
											<ul class="nav meta">
												<li><a href="#">Lâm Thùy Linh</a></li>

												<li><a href="#">2022-05-19</a></li>
											</ul>

											<div class="title">
												<h2 class="h4">
													<a
														href="http://localhost/KCNEW/bai-viet-tphcm-ra-mat-dich-vu-xe-dap-cong-cong"
														class="btn-link">TPHCM ra mắt dịch vụ xe đạp công cộng</a>
												</h2>
											</div>
										</div>
									</div>
								</div>
								<!-- Post Item End -->
							</div>
						</c:forEach>
					</div>
				</div>
				<!-- Post Items End -->
			</div>
			<!-- Main Content End -->
		</div>
	</div>


</body>
