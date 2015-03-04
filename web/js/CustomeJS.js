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
        
        if(responseText.indexOf('<p>')>-1){
            $('#getjob').show();
            $('#editjob').hide();
        }else{
            $('#getjob').hide();
            $('#editjob').show();
        }

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
                            location.reload();
                    });

                });

            });
        });


        $('#editjob').click(function(event) {
            var id = $('#jobid').val();
            $.post('getEditJob', {id: id}, function(responseText) {
                $('#job').html(responseText);
                $('#editjobaction').click(function() {
                    
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
                        location.reload();
                    });
                });
            });
        });


    });





    $.post('getCurrentInfo', null, function(responseText) {
        $('#info').html(responseText);
        if(responseText.indexOf('<p>')>-1){
            $('#addinfo').show();
            $('#editinfo').hide();
        }else{
            $('#addinfo').hide();
            $('#editinfo').show();
        }

        $('#addinfo').click(function(event) {
            $.post('getInfo', null, function(responseText) {
                $('#info').html(responseText);
                $('#saveinfo').click(function() {
                    var f_name = $('#f_name').val();
                    var surename = $('#surename').val();
                    var dob = $('#dob').val();
                    var gender = $("input[name=Gender]:checked").val();
                    var nationality_id = $('#nationality_id').val();
                    var visa_status_id = $('#visa_status_id').val();
                    var material_status = $("input[name=m]:checked").val();
                    var no_of_own = $('#no_of_own').val();
                    var driving_license = $('#driving_license').val();
                    $.post('saveinfo', {f_name: f_name, surename: surename, dob: dob, gender: gender, nationality_id: nationality_id, visa_status_id: visa_status_id, material_status: material_status, no_of_own: no_of_own, driving_license: driving_license}, function(responseText) {
                        location.reload();
                    });
                });

            });
        });


        $('#editinfo').click(function(event) {
            var id = $('#id').val();

            $.post('getEditInfo', {id: id}, function(responseText) {
                $('#info').html(responseText);
                $('#editinfoaction').click(function() {
                    var f_name = $('#f_name').val();
                    var surename = $('#surename').val();
                    var dob = $('#dob').val();
                    var gender = $("input[name=Gender]:checked").val();
                    var nationality_id = $('#nationality_id').val();
                    var visa_status_id = $('#visa_status_id').val();
                    
                    var material_status = $("input[name=m]:checked").val();
                    var no_of_own = $('#no_of_own').val();
                    var driving_license = $('#driving_license').val();
                    $.post('editInfo', {f_name: f_name, surename: surename, dob: dob, gender: gender, nationality_id: nationality_id, visa_status_id: visa_status_id, material_status: material_status, no_of_own: no_of_own, driving_license: driving_license, id: id}, function() {
                        location.reload();
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
        if(responseText.indexOf('<p>')>-1){
            $('#addcontactinfo').show();
            $('#editcontactinfo').hide();
        }else{
            $('#addcontactinfo').hide();
            $('#editcontactinfo').show();
        }
        $('#addcontactinfo').click(function(event) {
            $.post('getContactInfo', null, function(responseText) {
                $('#contactinfo').html(responseText);
                $('#savecontactinfo').click(function(event) {
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
                        location.reload();
                    });
                });
            });
        });

        $('#editcontactinfo').click(function(event) {
            var id = $('#id').val();
            $.post('getEditContactInfo', null, function(responseText) {
                $('#contactinfo').html(responseText);
                $('#editcontactinfoaction').click(function() {
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
                        location.reload();
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
                    var startdate = $('#startdate').val();
                    var enddate = $('#enddate').val();
                    var national_id = $('#national_id').val();
                    var address = $('#address').val();
                    var companyname = $('#companyname').val();
                    var company_industry_id = $('#company_industry_id').val();
                    var career_role_id = $('#career_role_id').val();
                    var role_name = $('#role_name').val();
                    var jobdesc = $('#jobdesc').val();
                    $.post('saveexperience', {startdate: startdate, enddate: enddate, national_id: national_id, address: address, companyname: companyname, company_industry_id: company_industry_id, career_role_id: career_role_id, role_name: role_name, jobdesc: jobdesc}, function(responseText) {
                        $.get('getCurrentExperience', null, function(responseText) {
                            $('#experience').html(responseText);
                        });
                    });

                });
            });
        });


        ///prepare edit action 

        $('#editexp').click(function(event) {
            var id = $('#editexp').attr("class");

            $.post('getEditExperience', {id: id}, function(responseText) {
                $('#experience').html(responseText);
                $('#editexpert').click(function(event) {
                    var startdate = $('#startdate').val();
                    var enddate = $('#enddate').val();
                    var national_id = $('#national_id').val();
                    var address = $('#address').val();
                    var companyname = $('#companyname').val();
                    var company_industry_id = $('#company_industry_id').val();
                    var career_role_id = $('#career_role_id').val();
                    var role_name = $('#role_name').val();
                    var jobdesc = $('#jobdesc').val();
                    var id = $('#id').val();
                    $.post('editExperince', {startdate: startdate, enddate: enddate, national_id: national_id, address: address, companyname: companyname, company_industry_id: company_industry_id, career_role_id: career_role_id, role_name: role_name, jobdesc: jobdesc, id: id}, function(responseText) {
                        location.reload();
                    });


                });
            });

        });


    });




    //// Eduction Block 
    $.get('getCurrentEdu', null, function(responseText) {

        $('#edu').html(responseText);

        $('#addedu').click(function(event) {
            $.get('getEdu', null, function(responseText) {
                $('#edu').html(responseText);
                $('#saveedu').click(function(event) {
                    var conutry_id = $('#conutry_id').val();
                    var city_id = $('#city_id').val();
                    var major = $('#major').val();
                    var certificate = $('#certificate').val();
                    var rate_id = $('#rate_id').val();
                    var rate_degree = $('#rate_degree').val();
                    var enddate = $('#enddate').val();
                    var desc = $('#desc').val();
                    var instatute_name = $('#instatute_name').val();
                    $.post('saveedu', {conutry_id: conutry_id, city_id: city_id, major: major, certificate: certificate, rate_id: rate_id, rate_degree: rate_degree, enddate: enddate, desc: desc, instatute_name: instatute_name}, function(responseText) {
                            location.reload();
                    });

                });
            });
        });


    });





    //// Eduction skill 
    $.get('getCurrentSkills', null, function(responseText) {
        $('#skill').html(responseText);

        ///Prepare add button action 

        $('#addskills').click(function(event) {

            $.get('getSkills', null, function(responseText) {
                $('#skill').html(responseText);

                $('#saveskill').click(function(event) {
                    var skill_name = $('#skill_name').val();
                    var skill_level_id = $('#skill_level_id').val();
                    var skill_leve_last_work_id = $('#skill_leve_last_work_id').val();
                    var skillexperince_leve_id = $('#skillexperince_leve_id').val();
                    $.post('saveskill', {skill_name: skill_name, skill_level_id: skill_level_id, skill_leve_last_work_id: skill_leve_last_work_id, skillexperince_leve_id: skillexperince_leve_id}, function(responseText) {
                        location.reload();
                    });
                });
            });
        });




    });


    // Language Data Display
    $.get('getCurrentLanguage', null, function(responseText) {
        $('#lang').html(responseText);

        $('#addlang').click(function(event) {
            $.get('getLanguage', null, function(responseText) {
                $('#lang').html(responseText);
                $('#savelang').click(function(event) {
                    var SKILL_LEVEL_ID = $('#SKILL_LEVEL_ID').val();
                    var SKILL_LAST_WORK_ID = $('#SKILL_LAST_WORK_ID').val();
                    var SKILL_EXPERINCE_ID = $('#SKILL_EXPERINCE_ID').val();
                    var LANG_ID = $('#LANG_ID').val();
                    $.post('savelang', {SKILL_LEVEL_ID: SKILL_LEVEL_ID, SKILL_LAST_WORK_ID: SKILL_LAST_WORK_ID, SKILL_EXPERINCE_ID: SKILL_EXPERINCE_ID, LANG_ID: LANG_ID}, function(responseText) {
                        location.reload();
                    });
                });

            });


        });
    });

    ///Identifier Block 

    $.get('getCurrentIdentifier', null, function(responseText) {
        $('#identifier').html(responseText);
        $('#addIden').click(function(event) {

            $.get('getIdentitfier', null, function(responseText) {
                $('#identifier').html(responseText);
                $('#saveiden').click(function(event) {
                    var NAME = $('#NAME').val().trim();
                    var COMPANY_NAME = $('#COMPANY_NAME').val().trim();
                    var POSITION_NAME = $('#POSITION_NAME').val().trim();
                    var PHONE = $('#PHONE').val().trim();
                    var EMAIL = $('#EMAIL').val().trim();
                    $.post('saveIdentifier', {NAME: NAME, COMPANY_NAME: COMPANY_NAME, POSITION_NAME: POSITION_NAME, PHONE: PHONE, EMAIL: EMAIL}, function(responseText) {
                        location.reload();
                    });
                });
            });
        });
    });


    /// Member Block
    $.get('getCurrentMember', null, function(responseText) {
        $('#member').html(responseText);
        $('#addMember').click(function(event) {
            $.get('getMember', null, function(responseText) {
                $('#member').html(responseText);
                $('#savemember').click(function(responseText) {
                    var member_since = $('#member_since').val();
                    var rolement = $('#rolement').val();
                    var COMP_NAME = $('#COMP_NAME').val();
                    $.post('savemember', {member_since: member_since, rolement: rolement, COMP_NAME: COMP_NAME}, function(responseText) {
                        location.reload();
                    });
                });
            });
        });
    });


});


function DeleteSkill(id) {
    $.post('deleteskills', {id: id}, function(responseText) {
        location.reload();
    });

}


function EditSkillView(id) {
    $.post('editskill', {id: id}, function(responseText) {
    });
}


function deleteexp(id){
    $.post('deleteExperience', {id: id}, function(responseText) {
        location.reload();
    });
}

function EditExperView(id){
    $.post('getEditExperience', {id: id}, function(responseText) {
                $('#experience').html(responseText);
                $('#editexpert').click(function(event) {
                    var startdate = $('#startdate').val();
                    var enddate = $('#enddate').val();
                    var national_id = $('#national_id').val();
                    var address = $('#address').val();
                    var companyname = $('#companyname').val();
                    var company_industry_id = $('#company_industry_id').val();
                    var career_role_id = $('#career_role_id').val();
                    var role_name = $('#role_name').val();
                    var jobdesc = $('#jobdesc').val();
                    //var id = $('#id').val();
                    $.post('editExperince', {startdate: startdate, enddate: enddate, national_id: national_id, address: address, companyname: companyname, company_industry_id: company_industry_id, career_role_id: career_role_id, role_name: role_name, jobdesc: jobdesc, id: id}, function(responseText) {
                        location.reload();
                    });


                });
            });
}

function deleteLang(id) {
    $.post('deletelang', {id: id}, function(responseText) {
        location.reload();
    });
}

function editLang(id) {
    $.post('getEditLang', {id: id}, function(responseText) {
        $('#lang').html(responseText);
        $('#editlang').click(function() {
            var SKILL_LEVEL_ID = $('#SKILL_LEVEL_ID').val();
            var SKILL_LAST_WORK_ID = $('#SKILL_LAST_WORK_ID').val();
            var SKILL_EXPERINCE_ID = $('#SKILL_EXPERINCE_ID').val();
            var LANG_ID = $('#LANG_ID').val();
            $.post('EditLang', {id: id, SKILL_LEVEL_ID: SKILL_LEVEL_ID, SKILL_LAST_WORK_ID: SKILL_LAST_WORK_ID, SKILL_EXPERINCE_ID: SKILL_EXPERINCE_ID, LANG_ID: LANG_ID}, function(responseText) {
                   location.reload();
            });
        });
    });
}


function deleteIdentifier(id) {
    $.post('deleteIdentifier', {id: id}, function(responseText) {
        location.reload();
    });
}


function editIdentifier(id) {
    $.get('getEditIdentifier', {id: id}, function(responseText) {
        $('#identifier').html(responseText);
        $('#editiden').click(function(event) {
            var NAME = $('#NAME').val().trim();
            var COMPANY_NAME = $('#COMPANY_NAME').val().trim();
            var POSITION_NAME = $('#POSITION_NAME').val().trim();
            var PHONE = $('#PHONE').val().trim();
            var EMAIL = $('#EMAIL').val().trim();
            $.post('editIdentifier', {id: id, NAME: NAME, COMPANY_NAME: COMPANY_NAME, POSITION_NAME: POSITION_NAME, PHONE: PHONE, EMAIL: EMAIL}, function(responseText) {
                location.reload();
            });
        });
    });
}


function deletemember(id) {
    $.post('deletemember', {id: id}, function(responseText) {
        location.reload();
    });
}

function editmember(id) {
    $.get('getEditMember', {id: id}, function(responseText) {
        $('#member').html(responseText);
        $('#editmember').click(function(event) {
            var member_since = $('#member_since').val();
            var rolement = $('#rolement').val();
            var COMP_NAME = $('#COMP_NAME').val();
            $.post('editMember',{id:id,member_since: member_since, rolement: rolement, COMP_NAME: COMP_NAME},function(responseText){
               location.reload() ;
            });
        });
    });
}


function EnglishOnly(){
    
    var ew = event.which;
    alert(ew);
    if(ew === 32)
        return true;
    if(48 <= ew && ew <= 57)
        return true;
    if(65 <= ew && ew <= 90)
        return true;
    if(97 <= ew && ew <= 122)
        return true;
    return false;
}