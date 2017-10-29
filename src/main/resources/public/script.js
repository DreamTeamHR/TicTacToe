$(document).ready(function(){
    var form = $('#btnID');
    $(form).click(function(){
        console.log("button clicked");
        $.ajax({
            url: form.attr('action'),
            type: form.attr('method'),
            success: function(result){
                location.reload();
            }
        });
    });
});

$(document).ready(function() {
    var form = $('#form1');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=1',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile1").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form2');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=2',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile2").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form3');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=3',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile3").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form4');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=4',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile4").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form5');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=5',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile5").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form6');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=6',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile6").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form7');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=7',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile7").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form8');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=8',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile8").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});

$(document).ready(function() {
    var form = $('#form9');
    $(form).one("click",function( ) {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: 'tileNumber=9',
            success: function( result ){
                var obj = JSON.parse(result);
                var img = $('<img alt="Player"/>').attr({"src" : obj.play});
                $("#tile9").html(img);
                $("#gameOver").html(obj.isOver);
                $("#gameOver").html(obj.currPlayer);
                if(obj.isOver != ""){
                    $(".tile").css("pointer-events", "none");
                }
        }});
    });
});