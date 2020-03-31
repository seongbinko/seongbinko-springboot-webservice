$('#index-tbody tr td:eq(1)').on('click',function(){
    if(!$('#user').text()) {
        alert('로그인 후 이용가능 합니다.');
        return false;
    }
});