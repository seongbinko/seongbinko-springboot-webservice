$('#index-tbody a').on('click',function(){
    if(!$('#user').text()) {
        alert('로그인 후 이용가능 합니다.');
        return false;
    }
});