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
    
    
    
       
    $('#applyjob').click(function(event) {
        var id = $('#id').val().trim();
       
        $.post('ApplyforJob', {searchjob: searchjob}, function(responseText) {
            $('.alert-info').removeClass("display");
            $('#result').html(responseText);
           
        });
    });
    
    
});