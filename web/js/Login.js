/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$(document).ready(function() {
    $('#login').click(function() {
        var username = $('#u_name').val().trim();
        var password = $('#password').val().trim();
        $.post('LogAuth', {u: username, p: password}, function(responseText) {
            
            if(responseText==="y"){
                window.open('Home','_self');
            }else{
                $('#err').text("Invalid username or password");
            }
        });
    });
    
    $('#newuser').click(function(){
       window.open('Register','_self'); 
    });
    
    $('#search').click(function(event) {
        var searchjob = $('#searchjob').val().trim();
       
        $.post('searchforjob', {searchjob: searchjob}, function(responseText) {
            
            $('#result').html(responseText);
           
        });
    });
    
    
    
       
   
    
    
});



function getJobId(id){
    $("#modal-1").show(500);
    
     $('#applyjob').click(function(event) {
        var cv_id = $('#cvid').val();
        
       
        $.post('ApplyforJob',{cvid:cv_id,id:id}, function(responseText) {
            $("#modal-1").hide(500);
            var msg='<div class=\"alert alert-info\"><button type=\"button\" class\"close\" data-dismiss=\"alert\">×</button>'+responseText+'</div>';
            $('#response').html(msg);
           
        });
    });
    
    
    
    $('#close').click(function(event) {
         $("#modal-1").hide(500);
    });
    
}