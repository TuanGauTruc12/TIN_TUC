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
									<div class="post--img">
										<a href="<c:url value = "/tin-tuc/${ nexSix.newSlug }"/>">
											<img class="img-fluid" height="400"
											src='<c:url value = "/public/user/uploads/tintuc/${ nexSix.image }"/>'
											alt="">
										</a> <a
											href="<c:url value = "/${nexSix.categorySlug}/${ nexSix.propertySlug }"/>"
											class="cat">${ nexSix.propertyTitle }</a> <a href="#"
											class="icon"><i class="fa fa-flash"></i></a>

										<div class="post--info">
											<ul class="nav meta">
												<li><span class = "d-inline bg-black">${ nexSix.author }</span></li>

												<li><span class = "d-inline bg-black">${ nexSix.approvalDate }</span></li>
											</ul>

											<div class="title">
												<h2 class="h4 d-inline bg-black">
													<a href="<c:url value = "/tin-tuc/${ nexSix.newSlug }"/>"
														class="btn-link">${ nexSix.newTitle }</a>
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
