<html>
<script src="js/jquery-3.1.0.min.js"></script>
<body>
<h2>Hello World!</h2>
<input id="ok" type="button" value="oklalal">
<input id="login">
</body>
<script>
    $('#ok').click(function () {
        console.log('ok');
        $.ajax({
            type: 'POST',
            url: 'login/login.ajax',
            data: '',
            success: function (res) {
                console.log(res);
                $('#login').val(res);
            }
        })
    })
</script>
</html>
