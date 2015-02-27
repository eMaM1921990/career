/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {
    $('#submit').click(function() {
        var cv_name=$('#cv_name').val();
        $.post('CreateCV',{cv_name:cv_name},function(responseText){
            window.open('myCvs?id='+responseText,'_self');
        });
    });
    
});