<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<title>Thêm tin tức</title>
<body>

	<div class="container">
		<!-- form start -->
		<form method="POST" action="#" id="form">
			<div class="form-group">
				<div class="row">
					<div class="col">
						<label>Tên bài viết <span style="color: red"> *</span></label> <input
							type="text" class="form-control" id="title" name="title"
							placeholder="Nhập tên bài viết" onkeyup="ChangeToSlug();">
					</div>
					<div class="col">
						<label for="slug">Đường dẫn <span style="color: red">
								*</span></label> <input type="text" class="form-control" id="slug" name="slug"
							readonly>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="tomtat">Tóm tắt (Ngắn)</label>
				<textarea id="tomtat" name="tomtat" class="form-control" required></textarea>
			</div>
			<div class="form-group">
				<div class="row">
					<div class="col">
						<label for="danhmuc">Danh mục <span style="color: red">
								*</span></label> <select name="danhmuc" id="danhmuc" class="form-control">
							<option value="0">-- Chọn danh mục --</option>
							<c:forEach var="cate" items="${ categoriesAdmin }">
								<option value="${ cate.id }">${ cate.title }</option>
							</c:forEach>
						</select>
					</div>
					<div class="col">
						<label for="thuoctinh">Thuộc tính danh Mục <span
							style="color: red"> *</span>
							</label> 
							
							<select name="thuoctinh"
							id="thuoctinh" class="form-control thuoctinh">
							
							
							<c:forEach var="property" items="${ propertiesAdmin }">
								<option value="${ property.id }">${ property.title }</option>
							</c:forEach>
							
						</select>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="content">Nội dung bài biết <span
					style="color: red"> *</span></label>
				<textarea id="content" name="content" class="form-control" required></textarea>
			</div>

			<div class="form-group">

				<div class="row">
					<div class="col">
						<label for="examleInput">Thêm hình ảnh <span
							style="color: red"> *</span></label> <input type="file" id="hinhanh"
							name="hinhanh" class="form-control">
					</div>
					<div class="col">
						<label for="examleInput">Thêm video(Không bắt buộc)</label> <input
							type="text" id="video" name="video" class="form-control">
					</div>
				</div>
			</div>

			<div class="form-group mb-3 clearfix">
				<input type="submit" class="btn btn-primary" value="Thêm"> <a
					class="btn btn-outline-info"
					href="<c:url value = "/admin/new-admin/write-new/${id_user }"/>"><i
					class="fa-solid fa-arrow-left"></i>Quay lại</a>
			</div>
		</form>
	</div>
</body>