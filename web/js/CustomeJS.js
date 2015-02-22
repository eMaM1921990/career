/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function() {

    $('#saveuser').click(function(event) {
        var u_name = $('#u_name').val();

        var password = $('#password').val();
        var f_name = $('#f_name').val();
        var l_name = $('#l_name').val();
        var nationality_id = $('#national').val();
        var mail = $('#mail').val();
        var hear_about_us = $('#hear_about_us').val();
        var gender = $('#Gender').val();
        var notification_register = $('#notification_register').val();
        var datebirth = $('#dob').val();
        $.post('saveuser', {u: u_name, p: password, fn: f_name, ln: l_name, n_id: nationality_id, m: mail, h: hear_about_us, g: gender, n: notification_register, dob: datebirth}, function() {
            $('#message').html("<p>data saved</p>");
        });



    });






    $.post('getcurrentJob', null, function(responseText) {
        $('#job').html(responseText);

        $('#getjob').click(function(event) {
            $.get('getJobDescription', null, function(responseText) {
                $('#job').html(responseText);
                $('#savejob').click(function() {
                    var job_name = $('#job_name').val();
                    var job_desc = $('#job_desc').val();
                    var employment_type_id = $('#employment_type_id').val();
                    var employement_status_id = $('#employement_status_id').val();
                    var salary_amount = $('#salary_amount').val();
                    var salary_id = $('#salary_id').val();
                    var career_level_id = $('#career_level_id').val();
                    var notice_period_id = $('#notice_period_id').val();
                    var last_salary_amount = $('#last_salary_amount').val();
                    var last_salary_id = $('#last_salary_id').val();

                    $.post('saveJob', {job_name: job_name, job_desc: job_desc, employment_type_id: employment_type_id, employement_status_id: employement_status_id, salary_amount: salary_amount, salary_id: salary_id, career_level_id: career_level_id, notice_period_id: notice_period_id, last_salary_amount: last_salary_amount, last_salary_id: last_salary_id}, function(responseText) {

                    });

                });

            });
        });


        $('#editjob').click(function(event) {
            var id = $('#jobid').val();
            $.post('getEditJob', {id: id}, function(responseText) {
                $('#job').html(responseText);
                $('#editjob').click(function() {
                    var job_name = $('#job_name').val();
                    var job_desc = $('#job_desc').val();
                    var employment_type_id = $('#employment_type_id').val();
                    var employement_status_id = $('#employement_status_id').val();
                    var salary_amount = $('#salary_amount').val();
                    var salary_id = $('#salary_id').val();
                    var career_level_id = $('#career_level_id').val();
                    var notice_period_id = $('#notice_period_id').val();
                    var last_salary_amount = $('#last_salary_amount').val();
                    var last_salary_id = $('#last_salary_id').val();

                    $.post('editJob', {job_name: job_name, job_desc: job_desc, employment_type_id: employment_type_id, employement_status_id: employement_status_id, salary_amount: salary_amount, salary_id: salary_id, career_level_id: career_level_id, notice_period_id: notice_period_id, last_salary_amount: last_salary_amount, last_salary_id: last_salary_id, id: id}, function(responseText) {

                    });
                });
            });
        });


    });





    $.post('getCurrentInfo', null, function(responseText) {
        $('#info').html(responseText);

        $('#addinfo').click(function(event) {
            $.post('getInfo', null, function(responseText) {
                $('#info').html(responseText);
                $('#saveinfo').click(function() {
                    var f_name = $('#f_name').val();
                    var surename = $('#surename').val();
                    var dob = $('#dob').val();
                    var gender = $('#gender').val();
                    var nationality_id = $('#nationality_id').val();
                    var visa_status_id = $('#visa_status_id').val();
                    var material_status = $('#material_status').val();
                    var no_of_own = $('#no_of_own').val();
                    var driving_license = $('#driving_license').val();
                    $.post('saveinfo', {f_name: f_name, surename: surename, dob: dob, gender: gender, nationality_id: nationality_id, visa_status_id: visa_status_id, material_status: material_status, no_of_own: no_of_own, driving_license: driving_license}, function() {

                    });
                });

            });
        });


        $('#editinfo').click(function(event) {
            var id = $('#id').val();

            $.post('getEditInfo', {id: id}, function(responseText) {
                $('#info').html(responseText);
                $('#editinfo').click(function() {
                    var f_name = $('#f_name').val();
                    var surename = $('#surename').val();
                    var dob = $('#dob').val();
                    var gender = $('#gender').val();
                    var nationality_id = $('#nationality_id').val();
                    var visa_status_id = $('#visa_status_id').val();
                    var material_status = $('#material_status').val();
                    var no_of_own = $('#no_of_own').val();
                    var driving_license = $('#driving_license').val();
                    $.post('editInfo', {f_name: f_name, surename: surename, dob: dob, gender: gender, nationality_id: nationality_id, visa_status_id: visa_status_id, material_status: material_status, no_of_own: no_of_own, driving_license: driving_license, id: id}, function() {

                    });
                });
            });
        });

    });
    /*
     $.post('getInfo', null, function(responseText) {
     $('#info').html(responseText);
     });
     */


    $.post('getCurrentContactInfo', null, function(responseText) {
        $('#contactinfo').html(responseText);
        $('#addcontactinfo').click(function(event) {
            $.post('getContactInfo', null, function(responseText) {
                $('#contactinfo').html(responseText);
                $('#savecontactinfo').click(function() {
                    var mail = $('#mail').val();
                    var phone1 = $('#phone1').val();
                    var phone2 = $('#phone2').val();
                    var counrty_id = $('#counrty_id').val();
                    var citiy_id = $('#citiy_id').val();
                    var if_other = '';
                    var address1 = $('#address1').val();
                    var address2 = $('#address2').val();
                    var postalcode = $('#postalcode').val();
                    var box = $('#box').val();
                    var fax = $('#fax').val();
                    var weburl = $('#weburl').val();
                    var mobile = $('#mobile').val();
                    $.post('savecontactinfo', {mail: mail, phone1: phone1, phone2: phone2, counrty_id: counrty_id, citiy_id: citiy_id, address1: address1, address2: address2, postalcode: postalcode, box: box, fax: fax, weburl: weburl, mobile: mobile}, function(responseText) {

                    });
                });
            });
        });

        $('#editcontactinfo').click(function(event) {
            var id = $('#id').val();
            $.post('getEditContactInfo', null, function(responseText) {
                $('#contactinfo').html(responseText);
                $('#editcontactinfo').click(function() {
                    var mail = $('#mail').val();
                    var phone1 = $('#phone1').val();
                    var phone2 = $('#phone2').val();
                    var counrty_id = $('#counrty_id').val();
                    var citiy_id = $('#citiy_id').val();
                    var if_other = '';
                    var address1 = $('#address1').val();
                    var address2 = $('#address2').val();
                    var postalcode = $('#postalcode').val();
                    var box = $('#box').val();
                    var fax = $('#fax').val();
                    var weburl = $('#weburl').val();
                    var mobile = $('#mobile').val();
                    $.post('editContactInfo', {mail: mail, phone1: phone1, phone2: phone2, counrty_id: counrty_id, citiy_id: citiy_id, address1: address1, address2: address2, postalcode: postalcode, box: box, fax: fax, weburl: weburl, mobile: mobile, id: id}, function(responseText) {

                    });
                });
            });
        });





    });



    $.get('getCurrentExperience', null, function(responseText) {


        /// Prepare view for current experince 
        $('#experience').html(responseText);

        ///Prepare add button action 

        $('#addexperince').click(function(event) {
            $.post('getExperince', null, function(responseText) {
                $('#experience').html(responseText);

                $('#saveexp').click(function(event) {
                    var startdate=$('#startdate').val();
                    var enddate=$('#enddate').val();
                    var national_id=$('#national_id').val();
                    var address=$('#address').val();
                    var companyname=$('#companyname').val();
                    var company_industry_id=$('#company_industry_id').val();
                    var career_role_id=$('#career_role_id').val();
                    var role_name=$('#role_name').val();
                    var jobdesc=$('#jobdesc').val();
                    $.post('saveexperience', {startdate:startdate,enddate:enddate,national_id:national_id,address:address,companyname:companyname,company_industry_id:company_industry_id,career_role_id:career_role_id,role_name:role_name,jobdesc:jobdesc}, function(responseText) {
                        $.get('getCurrentExperience', null, function(responseText) {
                            $('#experience').html(responseText);
                        });
                    });
                    
                });
            });
        });
        
        
        ///prepare edit action 
        
        $('#editexp').click(function(event) {
            var id=$('#editexp').attr("class");
            
            $.post('getEditExperience', {id:id}, function(responseText) {
                $('#experience').html(responseText);
                $('#editexpert').click(function(event) {
                    var startdate=$('#startdate').val();
                    var enddate=$('#enddate').val();
                    var national_id=$('#national_id').val();
                    var address=$('#address').val();
                    var companyname=$('#companyname').val();
                    var company_industry_id=$('#company_industry_id').val();
                    var career_role_id=$('#career_role_id').val();
                    var role_name=$('#role_name').val();
                    var jobdesc=$('#jobdesc').val();
                    var id=$('#id').val();
                    $.post('editExperince',{startdate:startdate,enddate:enddate,national_id:national_id,address:address,companyname:companyname,company_industry_id:company_industry_id,career_role_id:career_role_id,role_name:role_name,jobdesc:jobdesc,id:id}, function(responseText) {
                        
                    });
                    
                    
                });
            });
            
        });


    });
    
    
    
    
    //// Eduction Block 
    $.get('getCurrentEdu', null, function(responseText) {
        
        $('#edu').html(responseText);
        
        $('#addedu').get('getEdu',null,function (responseText){
            $('#edu').html(responseText);
            $('#saveedu').click(function(event) {
                
            });
        });
        
    });
    
    /*
     $.post('getContactInfo', null, function(responseText) {
     $('#contactinfo').html(responseText);
     });
     */

});