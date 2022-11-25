<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<title>Text</title>

<body>
	<input id="fileName" type="file">
	<!--
	<div style="width: 200px; height: 200px; background-color: #c298; margin-top: 8px;">
		<img src="" alt="">
	</div>

-->
	<input type="button" id="tao" value="Thêm tin tức">
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
	<content tag="script"> <script>
		$("#tao").click(function(e) {
			let input = document.getElementById("fileName");
			let fReader = new FileReader();
			let file = input.files[0];
			fReader.readAsDataURL(file);
			fReader.onloadend = function(event) {
				let base64 = event.target.result;
				let fileName = file.name;
				console.log(fileName);
				$.ajax({
					type : "POST",
					url : "http://localhost:8080/TinTuc/haha/kkk/huhu",
					contentType : "application/json; charset=UTF-8",
					dataType : "text",
					data : {
						fileName : fileName,
						base64 : base64
					},

					success : function(data) {
						console.log(data);
					}
				});
			}
		});
	</script> </content>
</body>
