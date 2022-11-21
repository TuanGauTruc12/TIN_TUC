$(".toggle-password").click(function() {
	$(this).toggleClass("fa-eye fa-eye-slash");
	var input = $($(this).attr("toggle"));
	if (input.attr("type") == "password") {
		input.attr("type", "text");
	} else {
		input.attr("type", "password");
	}
});

$("#login").click(function() {
	const email = $('#email').val();
	const password = $('#password-field').val();
	location.href = `http://localhost:8080/TinTuc/login-signup/login/email=${email}&password=${password}`;
});

function comment(newSlug, idUser) {
	const contentComment = $('#comment').val();
	location.href = `http://localhost:8080/TinTuc/comments/${newSlug}/${idUser}/${contentComment}`;
};

$(document).ready(function() {
	$(document).on('submit', '#form', function() {
		let select = true;
		if ($('#password').val().length < 8) {
			$('#error').text("Mật khẩu phải từ 8 ký tự trở lên");
			select = false;
		} else if ($('#role').val() == 0 || $("#danhmuc").val() == 0 || $("#thuoctinh".val() == 0)) {
			$('#error').text("Vui lòng chọn thông tin phù hợp");
			select = false;
		}
		return select;
	});
});

function ChangeToSlug() {

	//Lấy text từ thẻ input title 
	let title = document.getElementById("title").value;

	//Đổi chữ hoa thành chữ thường
	let slug = title.toLowerCase();

	//Đổi ký tự có dấu thành không dấu
	slug = slug.replace(/á|à|ả|ạ|ã|ă|ắ|ằ|ẳ|ẵ|ặ|â|ấ|ầ|ẩ|ẫ|ậ/gi, 'a');
	slug = slug.replace(/é|è|ẻ|ẽ|ẹ|ê|ế|ề|ể|ễ|ệ/gi, 'e');
	slug = slug.replace(/i|í|ì|ỉ|ĩ|ị/gi, 'i');
	slug = slug.replace(/ó|ò|ỏ|õ|ọ|ô|ố|ồ|ổ|ỗ|ộ|ơ|ớ|ờ|ở|ỡ|ợ/gi, 'o');
	slug = slug.replace(/ú|ù|ủ|ũ|ụ|ư|ứ|ừ|ử|ữ|ự/gi, 'u');
	slug = slug.replace(/ý|ỳ|ỷ|ỹ|ỵ/gi, 'y');
	slug = slug.replace(/đ/gi, 'd');
	//Xóa các ký tự đặt biệt
	slug = slug.replace(/\`|\~|\!|\@|\#|\||\$|\%|\^|\&|\*|\(|\)|\+|\=|\,|\.|\/|\?|\>|\<|\'|\"|\:|\;|_/gi, '');
	//Đổi khoảng trắng thành ký tự gạch ngang
	slug = slug.replace(/ /gi, "-");
	//Đổi nhiều ký tự gạch ngang liên tiếp thành 1 ký tự gạch ngang
	//Phòng trường hợp người nhập vào quá nhiều ký tự trắng
	slug = slug.replace(/\-\-\-\-\-/gi, '-');
	slug = slug.replace(/\-\-\-\-/gi, '-');
	slug = slug.replace(/\-\-\-/gi, '-');
	slug = slug.replace(/\-\-/gi, '-');
	//Xóa các ký tự gạch ngang ở đầu và cuối
	slug = '@' + slug + '@';
	slug = slug.replace(/\@\-|\-\@|\@/gi, '');
	//In slug ra textbox có id “slug”
	document.getElementById('slug').value = slug;
}

$(document).ready(function() {
	$('#content').summernote();
});

$("#danhmuc").change(function(e) {
	var idDanhMuc = $("#danhmuc").val();
	var action = $(this).attr('id');
	var result = '';
	if (action == 'danhmuc') {
		result = 'thuoctinh';
	}
	if (idDanhMuc != 0) {
		$.ajax({
			type: "POST",
			url: "http://localhost:8080/TinTuc/admin/new-admin/write-new/selectproperty/",
			data: { category: idDanhMuc ,},
			success: function(data) {
				console.log(data);
				$('#' + result).html(data);
			}
		});
	}
});