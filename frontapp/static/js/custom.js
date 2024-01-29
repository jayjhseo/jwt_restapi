$(document).ready(function(){
    
    $("").click(function(){
        $("").addClass("active");
        $("").removeClass("active");
        $("").toggleClass("active");
        $("").siblings().next().nextAll().nextUntil().prev().prevAll().prevUntil();
        $("").parent().parents();
        $("").css("", "");
    });
    //  텝메뉴
    // function tabMenu(no) {
    //     $(".tab-cnt-box-" + no + " > li:not("+$(".tab-menu-box-" + no + " > li > a.active").attr("href")+")").hide();
    //     $(".tab-menu-box-" + no + " > li > a").click(function(){ 
    //         $(".tab-menu-box-" + no + " > li > a").removeClass("active"); 			
    //         $(this).addClass("active");	
    //         $(".tab-cnt-box-" + no + " > li").hide(); 
    //         $($(this).attr("href")).show(); 
    //         return false;       
    //     }); 
    // }
    
    // for (let tabMenuNum = 1; tabMenuNum <= 20; tabMenuNum++) {
    //     tabMenu(tabMenuNum);
    // }

    //top 스크롤 버튼 클릭시
    $(".top-btn-box").click( function() {
        $("html, body").animate( { scrollTop : 0 }, 400 );
        return false;
    });

    //하트 버튼 클릭시
    $('button#favor_btn').click(function(event) {
     event.preventDefault();
      var matchingId = Number($(this).data('matching-id'));

     // CSRF 토큰 가져오기
      var token = $("meta[name='_csrf']").attr("content");
      var header = $("meta[name='_csrf_header']").attr("content");

     $.ajax({
         type: 'POST',
         url: '/toggleFavorite/' + matchingId,
         beforeSend: function (xhr) {
             // CSRF 토큰을 헤더에 포함
             xhr.setRequestHeader(header, token);
         },
         success: function(response) {
             console.log('success');
         },
         error: function(error) {
            console.error('Error toggling favorite', error);
         }
     });

        $(this).toggleClass("active");
    });

    //금액 input에 입력시
    $('#moneyInput').on('input', function() {
      var inputVal = $(this).val();
      var sanitizedValue = inputVal.replace(/[^\d]/g, '');
      sanitizedValue = sanitizedValue.replace(/^0+/, '');
      var numberWithCommas = sanitizedValue.replace(/\B(?=(\d{3})+(?!\d))/g, ',');
      $(this).val(numberWithCommas);
    });

    //채팅 부분 스크립트
    $(".chat-list-box > li > a").click(function(){ 
        $(".chat-list-box > li > a").removeClass("active"); 			
        $(this).addClass("active");	
        $(".chat-detail-box > li").hide(); 
        $($(this).attr("href")).css("display", "flex"); 
        $(".chat-area .chat-box .chat-detail-area .input-area").css("display", "flex");
        $(".chat-area .chat-box .chat-detail-area .no-select-text-box").hide();
        var scrollContainer = $(".scrollBottomContainer");
        scrollContainer.scrollTop(scrollContainer.prop("scrollHeight"));
        return false;       
    }); 

    //채팅 입력 부분 아무것도 입력하지 않으면 버튼 비활
    $('#chat_input').on('input', function () {
        var chatInputLength = $('#chat_input').val().length;
        if (chatInputLength > 0) {
          $('#chat_submit_btn').addClass('active');
        } else {
            $('#chat_submit_btn').removeClass('active');
        }
    });

});