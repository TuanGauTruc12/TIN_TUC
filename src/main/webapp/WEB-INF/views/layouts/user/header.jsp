<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<!-- Header Section Start -->
<header class="header--section header--style-3">
	<!-- Header Topbar Start -->
	<div class="header--topbar bg--color-1">
		<div class="container">
			<div class="float--left float--xs-none text-xs-center">
				<!-- Header Topbar Info Start -->
				<ul class="header--topbar-info nav">
					<li><i class="fa fm fa-map-marker"></i><span id= "container__location"></span></li>
					<li><i class="fa fm fa-mixcloud"></i><span id= "container__tempera"></span><sup>0</sup> C</li>
					<li><i class="fa fm fa-calendar"></i><span id= "container__date"></span></li>
				</ul>
				<!-- Header Topbar Info End -->
			</div>

			<div class="float--right float--xs-none text-xs-center">
				<!-- Header Topbar Action Start -->
				<ul class="header--topbar-action nav">
					<li><a href="http://localhost/KCNEW/login"><i
							class="fa fm fa-user-o"></i>Đăng nhập/Đăng ký</a></li>
				</ul>
				<!-- Header Topbar Action End -->

				<!-- Header Topbar Language Start -->

				<!-- Header Topbar Language End -->

				<!-- Header Topbar Social Start -->
				<ul class="header--topbar-social nav hidden-sm hidden-xxs">
					<li><a href="https://www.facebook.com/ngoccam651"><i
							class="fa fa-facebook"></i></a></li>
					<li><a href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
					<li><a href="#"><i class="fa fa-rss"></i></a></li>
					<li><a
						href="https://www.youtube.com/channel/UCk8UM8PAAV6PTn3eNuMthRQ"><i
							class="fa fa-youtube-play"></i></a></li>
				</ul>
				<!-- Header Topbar Social End -->
			</div>
		</div>
	</div>
	<!-- Header Topbar End -->

	<!-- Header Mainbar Start -->
	<div class="header--mainbar">
		<div class="container">
			<!-- Header Logo Start -->
			<div class="header--logo float--left float--sm-none text-sm-center">
				<h1 class="h1">
					<a href="http://localhost/KCNEW" class="btn-link"> <video
							autoplay loop muted plays-inline width="60%">
							<source
								src="<c:url value = "/public/user/frontend/img/KCN (online-video-cutter.com).mp4"/>"
								style="" />
						</video> <span class="hidden">Kcnew - logo</span>
					</a>
				</h1>
			</div>
			<!-- Header Logo End -->

			<!-- Header Ad Start -->
			<div class="header--ad float--right float--sm-none hidden-xs"
				style="width: 60%; margin-top: 60px">
				<a
					href="https://masterisehomes.com/the-rivus/?utm_source=adtima&utm_medium=impression&utm_campaign=rivus-adtima-impression-phase1-na-cpd-8B115F30-mastheadtoppc">
					<img
					src="<c:url value = "/public/user/frontend/img/ads-img/728x90_baner1.png"/>"
					alt="Advertisement" />
				</a>
			</div>
			<!-- Header Ad End -->
		</div>
	</div>
	<!-- Header Mainbar End -->

	<!-- Header Navbar Start -->
	<div class="header--navbar navbar bd--color-1 bg--color-0"
		data-trigger="sticky">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#headerNav"
					aria-expanded="false" aria-controls="headerNav">
					<span class="sr-only">Toggle Navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>

			<div id="headerNav" class="navbar-collapse collapse float--left">
				<!-- Header Menu Links Start -->
				<ul class="header--menu-links nav navbar-nav"
					data-trigger="hoverIntent">

					<c:forEach var="item" items="${ categories }">
						<li>
							<a href='<c:url value="/${ item.slug }"/>'>${ item.title }</a>
						</li>
					</c:forEach>
				</ul>
				<!-- Header Menu Links End -->
			</div>

			<!-- Header Search Form Start -->
			<form method="POST" action="http://localhost/KCNEW/search"
				class="header--search-form float--right" data-form="validate">
				<input type="hidden" name="_token"
					value="tN7wwlY5SleuIOoI545rZT8qySnpix8Vd9mMB01v" /> <input
					type="search" name="search" placeholder="Search..."
					class="header--search-control form-control" required />

				<button type="submit" class="header--search-btn btn">
					<i class="header--search-icon fa fa-search"></i>
				</button>
			</form>
			<!-- Header Search Form End -->
		</div>
	</div>
	<!-- Header Navbar End -->
</header>

<!-- Header Section End -->

<!-- Posts Filter Bar Start -->
<div class="posts--filter-bar style--3 hidden-xs">
    <div class="container">
        <ul class="nav">
            <li>
                <a href="http://localhost/KCNEW/tintucmoinhat">
                    <i class="fa fa-star-o"></i>
                    <span>Tin tức mới nhất</span>
                </a>
            </li>
         
            <li>
                <a href="http://localhost/KCNEW/tinnong">
                    <i class="fa fa-fire"></i>
                    <span>Tin nóng</span>
                </a>
            </li>
            <li>
                <a href="http://localhost/KCNEW/xemnhieunhat">
                    <i class="fa fa-eye"></i>
                    <span>Xem nhiều nhất</span>
                </a>
            </li>
        </ul>
    </div>
</div>
<!-- Posts Filter Bar End -->

<!-- News Ticker Start -->
<div class="news--ticker">
    <div class="container">
        <div class="title">
            <h2>Tin mới cập nhật</h2>
            <
        </div>

        <div class="news-updates--list" data-marquee="true">
            <ul class="nav">
                                <li>
                    <h3 class="h3"><a href="http://localhost/KCNEW/bai-viet-droptop-phien-ban-tien-linh">Droptop phiên bản Tiến Linh.</a></h3>
                </li>
                                <li>
                    <h3 class="h3"><a href="http://localhost/KCNEW/bai-viet-tphcm-ra-mat-dich-vu-xe-dap-cong-cong">TPHCM ra mắt dịch vụ xe đạp công cộng.</a></h3>
                </li>
                                <li>
                    <h3 class="h3"><a href="http://localhost/KCNEW/bai-viet-nhieu-dau-hieu-la-tu-lo-den-trung-tam-ngan-ha-quai-vat-troi-day">Nhiều dấu hiệu lạ từ lỗ đen trung tâm Ngân Hà: Quái vật trỗi dậy?.</a></h3>
                </li>
                                <li>
                    <h3 class="h3"><a href="http://localhost/KCNEW/bai-viet-vong-tron-lua-tu-vu-tru-khac-hien-ra-gan-chung-ta-khoa-hoc-boi-roi">Vòng tròn lửa &quot;từ vũ trụ khác&quot; hiện ra gần chúng ta, khoa học bối rối.</a></h3>
                </li>
                                <li>
                    <h3 class="h3"><a href="http://localhost/KCNEW/bai-viet-5-phat-minh-vi-dai-nhat-cua-nhan-loai-lam-thay-doi-ca-the-gioi">5 phát minh vĩ đại nhất của nhân loại làm thay đổi cả thế giới.</a></h3>
                </li>
                            </ul>
        </div>
    </div>
</div>
<!-- News Ticker End -->
