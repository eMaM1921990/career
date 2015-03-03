/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $('#submit').click(function() {
        var cv_name=$('#cv_name').val();
        var IS_DEFAULT=$('#IS_DEFAULT').is(':checked') ? 1 : 0;
        $.post('CreateCV',{cv_name:cv_name,IS_DEFAULT:IS_DEFAULT},function(responseText){
            window.open('myCvs?id='+responseText,'_self');
        });
    });
    
});