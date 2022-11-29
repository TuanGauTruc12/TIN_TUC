<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Text</title>

<body>
	<div class="row text-center mt-3">
		<input id="fileName" style="width: 100%; text-align: center;"
			type="file"> <input type="button"
			class="btn btn-success text-center" id="tao" value="Thêm tin tức">
	</div>
	<content tag="script"> <script>
		$(document)
				.ready(
						function() {
							$("#tao")
									.click(
											function(e) {
												let base64String = '';
												let file = $('#fileName')[0].files[0];
												if (typeof (file) !== 'undefined') {
													let fileName = file.name;
													let reader = new FileReader();
													reader.readAsDataURL(file);
													reader.onload = function() {
														base64String = reader.result
																.replace(
																		"data:",
																		"")
																.replace(
																		/^.+,/,
																		"");
														$
																.ajax({
																	type : "POST",
																	url : "http://localhost:8080/TinTuc/admin/haha/kkk/huhu",
																	contentType : "application/x-www-form-urlencoded; charset=UTF-8",
																	data : {
																		base64String : base64String,
																		fileName : fileName,
																	},

																	success : function(
																			data) {
																		alert("Hello");
																	}
																});
													}
												}
											});
						});
	</script> </content>
</body>
