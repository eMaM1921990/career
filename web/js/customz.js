/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



// Form validation code will come here.


function on(evt) {
    var theEvent = evt || window.event;
    var key = theEvent.keyCode || theEvent.which;
    key = String.fromCharCode(key);
    var regex = /^[0-9.]+$/;
    if (!regex.test(key)) {
        theEvent.returnValue = false;
        if (theEvent.preventDefault)
            theEvent.preventDefault();
    }
}


function onAlfa(evt) {

    var k;
    document.all ? k = evt.keyCode : k = evt.which;
    return ((k > 64 && k < 91) || (k > 96 && k < 123) || k === 8 || k === 32);

}

function isNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
    return true;

}
function validate()
{

    if (document.myForm.gender.value !== "")
    {

        var e = document.getElementById("gendx_lang");
        var strUser = e.options[e.selectedIndex].value;
        if (strUser === "E") {
            //alert( "Welcome"+strUser);

            var elem = document.getElementById("textfield210");
            var elem2 = document.getElementById("textfield121");
            var elem3 = document.getElementById("lang_score");
            elem.value = "ﻻ يوجد";
            elem2.value = "1111-11-11";
            elem3.value = "0";

        } else {
            var elem = document.getElementById("textfield210");
            var elem2 = document.getElementById("textfield121");
            var elem3 = document.getElementById("lang_score");
            elem.value = "";
            elem2.value = "";
            elem3.value = "";
        }


    }

    return(true);
}

function MaxIDPassword() {
    if (document.myForm.passport_number.value.length !== 9) {

        var elem = document.getElementById("passport_number");
        elem.value = "";
        alert("رقم جواز السفر لا يتجاوز 9 ارقام");
        document.myForm.passport_number.focus();
    }




}


function MaxID() {
    if (document.myForm.civil_id.value.length > 12 || document.myForm.civil_id.value.length < 12) {

        var elem = document.getElementById("civil_id");

        alert("الرقم المدنى لا يزيد او يقل عن 12 رقم");
        document.myForm.civil_id.focus();
    }




}


function validateForm() {
    var x = document.myForm.email_input.value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {
        alert("هذا الايميل غير صحيح");
        return false;
    }
}




function OnSub() {
    if (document.myForm.civil_id.value === "") {
        document.myForm.civil_id.focus();
        alert("ادخل الرقم الصحيح");
        return false;
    }

    if (document.myForm.first_name_ar.value === "") {
        document.myForm.first_name_ar.focus();
        alert("ادخل الاسم الاول");
        return false;
    }

    if (document.myForm.second_name_ar.value === "") {
        document.myForm.second_name_ar.focus();
        alert("ادخل الاسم الثانى");
        return false;
    }

    if (document.myForm.third_name_ar.value === "") {
        document.myForm.third_name_ar.focus();
        alert("ادخل الاسم الثالت");
        return false;
    }

    if (document.myForm.forth_name_ar.value === "") {
        document.myForm.forth_name_ar.focus();
        alert("ادخل الاسم الرابع");
        return false;
    }


    if (document.myForm.english_name.value === "") {
        document.myForm.english_name.focus();
        alert("ادخل الاسم باللغة الانجليزية");
        return false;
    }

    if (document.myForm.date_of_birth.value === "") {
        document.myForm.date_of_birth.focus();
        alert("ادخل تاريخ الميلاد");
        return false;
    }

    if (document.myForm.place_of_birth.value === "") {
        document.myForm.place_of_birth.focus();
        alert("ادخل مكان الميلاد");
        return false;
    }

    if (document.myForm.passport_number.value === "") {
        document.myForm.passport_number.focus();
        alert("ادخل رقم جواز السفر");
        return false;
    }

    if (document.myForm.passport_date_of_issuance.value === "") {
        document.myForm.passport_date_of_issuance.focus();
        alert("ادخل تاريخ  اصدار جواز السفر");
        return false;
    }

    if (document.myForm.passport_expiry_date.value === "") {
        document.myForm.passport_expiry_date.focus();
        alert("ادخل تاريخ انتهاء جواز السفر");
        return false;
    }

    if (document.myForm.email_input.value === "") {
        document.myForm.email_input.focus();
        alert("ادخل البريد الالكترونى");
        return false;
    }



    if (document.getElementById("gendz").value === "-1") {
        //var e = document.getElementById("gendz");
        //var strUser = e.options[e.selectedIndex].value;
        //if (strUser === "-- --") {
        alert("اختر النوع");
        return false;
        //}

    }


    if (document.myForm.city.value === "") {
        document.myForm.city.focus();
        alert("ادخل المدينة");
        return false;
    }

    if (document.myForm.block_number.value === "") {
        document.myForm.block_number.focus();
        alert("ادخل رقم القطعة");
        return false;
    }


    if (document.myForm.street.value === "") {
        document.myForm.street.focus();
        alert("ادخل اسم الشارع");
        return false;
    }


    if (document.myForm.residence_number.value === "") {
        document.myForm.residence_number.focus();
        alert("ادخل المبنى ");
        return false;
    }

    if (document.getElementById("gendz_type").value === "-1") {
        document.myForm.unittype.focus();
        alert("ادخل نوع الوحدة");
        return false;
    }


    if (document.myForm.unitnum.value === "") {
        document.myForm.unitnum.focus();
        alert("ادخل رقم الوحدة");
        return false;
    }


    if (document.myForm.mobile_number.value === "") {
        document.myForm.mobile_number.focus();
        alert("ادخل رقم التليفون النقال");
        return false;
    }


    if (document.getElementById("edu_name").value === "-1") {
        document.myForm.edu_name.focus();
        alert("ادخل المؤهل الدراسى");
        return false;
    }

    if (document.getElementById("mjor").value === "-1") {

        alert("اختر التخصص");
        return false;


    }


    if (document.getElementById("mjor").value === document.getElementById("mjor2").value) {
        alert("لا يجب ان يكون التخصصان متطابقان");
        return false;
    }

    if (document.myForm.edu_institute.value === "") {
        document.myForm.edu_institute.focus();
        alert("ادخل المؤسسة التعليمية");
        return false;
    }


    if (document.myForm.edu_date.value === "") {
        document.myForm.edu_date.focus();
        alert("ادخل تاريخ الحصول على المؤهل");
        return false;
    }


    if (document.myForm.edu_score.value === "") {
        document.myForm.edu_score.focus();
        alert("ادخل المعدل");
        return false;
    }



    if (document.getElementById("gendx_lang").value === "-1") {

        alert("اختر  مؤهل اللغة الانجليزية");
        return false;


    }

    if (document.myForm.lang_institute.value === "") {
        document.myForm.lang_institute.focus();
        alert("ادخل اسم المؤسسة التدريبية");
        return false;
    }


    if (document.myForm.lang_date.value === "") {
        document.myForm.lang_date.focus();
        alert("ادخل تاريخ الحصول على المؤهل");
        return false;
    }

    if (document.myForm.edu_score.value === "") {
        document.myForm.edu_score.focus();
        alert("ادخل تاريخ الحصول على المؤهل");
        return false;
    }

    if (document.myForm.lang_score.value === "") {
        document.myForm.lang_score.focus();
        alert("ادخل معدل اللغة الانجليزية");
        return false;
    }


    if (document.myForm.a2.value === "") {
        document.myForm.a2.focus();
        alert("ادخل صورة البطاقة الامامية");
        return false;
    }
    
    



    if (document.myForm.a5.value === "") {
        document.myForm.a5.focus();
        alert("ادخل صورة جواز السفر الصفحة الثانية");
        return false;
    }

    if (document.myForm.a6.value === "") {
        document.myForm.a6.focus();
        alert("ادخل صورة الشهادة الجامعية ");
        return false;
    }



    if (document.myForm.a11.value === "") {
        document.myForm.a11.focus();
        alert("ادخل الصورة الشخصية  ");
        return false;
    }

    if (document.myForm.a13.value === "") {
        document.myForm.a13.focus();
        alert("ادخل الشهادة اللغة الانجليزية");
        return false;
    }

    if (document.myForm.policy.checked) {
        document.myForm.policy.focus();
        //alert("ادخل الشهادة اللغة الانجليزية");
        // return false;
    } else {
        alert("اختر موافق على الشروط");
        return false;
    }


}

function post_date() {
    var dat = document.getElementById("date_of_birth").value;
    var today_date = document.myForm.endsys.value;

    var birth_year = dat.substring(0, 4);
    var birth_month = dat.substring(5, 7);
    var birth_day = dat.substring(8, 10);

    var endsys_year = today_date.substring(0, 4);
    var endsys_month = today_date.substring(5, 7);
    var endsys_day = today_date.substring(8, 10);

    var birth_obj = new Date(birth_year, birth_month, birth_day);
    var endsys_obj = new Date(endsys_year, endsys_month, endsys_day);
    var timeDiff = Math.abs(endsys_obj.getTime() - birth_obj.getTime());
    var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));
    diffDays=diffDays+1;
    
    diffDays = diffDays *0.00273790700698851;
    
    var Mnths = Math.round((diffDays - Math.round(Math.floor(diffDays))) * 12);
    var Yrs = Math.floor(diffDays);
    
    var mod_Mnths;
    var mod_Yrs;

    
   
    if (diffDays > 26) {
        var answer = confirm(" ﻻ يجب ان يزيد سن المتقدم عن 26 سنة . . .  هل تريد الخروج من النظام");
        if (answer) {

            window.location = "index.jsp";
        } else {
            document.getElementById("date_of_birth").focus();
            document.getElementById("date_of_birth").value = "";
        }
    }  
 
    if (diffDays < 17) {
        var answer = confirm("ﻻ يجب أن يقل سن المتقدم عن 17 سنة  . . . هل تريد الخروج من النظام ؟");
        if (answer) {

            window.location = "index.jsp";
        } else {
            document.getElementById("date_of_birth").focus();
            
             document.getElementById("date_of_birth").value="";
        }

    }

    


    


}



function grad_date() {
    var dat = document.getElementById("edu_date").value;
    var today_date = document.myForm.endsys.value;

    var birth_year = dat.substring(0, 4);
    var birth_month = dat.substring(5, 7);
    var birth_day = dat.substring(8, 10);

    var endsys_year = today_date.substring(0, 4);
    var endsys_month = today_date.substring(5, 7);
    var endsys_day = today_date.substring(8, 10);

    var birth_obj = new Date(birth_year, birth_month, birth_day);
    var endsys_obj = new Date(endsys_year, endsys_month, endsys_day);
    var timeDiff = Math.abs(endsys_obj.getTime() - birth_obj.getTime());
    var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));
    diffDays=diffDays+1;
     diffDays = diffDays *0.00273790700698851;
    


    if (diffDays > 2 ) {
        var answer = confirm("لا يجوز ان يكون تاريخ الحصول على المؤهل أكثر من سنتين . . . هل تريد الخروج من النظام");
        if (answer) {

            window.location = "index.jsp";
        } else {
            //document.getElementById("edu_date").value="";
            document.getElementById("edu_date").focus();
            return false;
        }
    }


}



function grad_date_lang() {
    var dat = document.getElementById("textfield121").value;
    var today_date = document.myForm.endsys.value;
    var birth_year = dat.substring(0, 4);
    var birth_month = dat.substring(5, 7);
    var birth_day = dat.substring(8, 10);

    var endsys_year = today_date.substring(0, 4);
    var endsys_month = today_date.substring(5, 7);
    var endsys_day = today_date.substring(8, 10);

    var birth_obj = new Date(birth_year, birth_month, birth_day);
    var endsys_obj = new Date(endsys_year, endsys_month, endsys_day);
    var timeDiff = Math.abs(endsys_obj.getTime() - birth_obj.getTime());
    var diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));
    diffDays=diffDays+1;
     diffDays = diffDays *0.00273790700698851;
   


    if (diffDays > 1 ) {
        var answer = confirm("لا يجب ان يكون مر علي تاريخ الحصول على مؤهل اللغة الانجليزية أكثر من عام . . .هل تريد الخروج من النظام");
        if (answer) {

            window.location = "index.jsp";
        } else {
            // document.getElementById("textfield121").value="";
            document.getElementById("textfield121").focus();
            return false;
        }




    }
}






function Score() {
    var e = document.getElementById("gendx_lang");
    var strUser = e.options[e.selectedIndex].value;
    var score = document.getElementById("lang_score").value;

    if (strUser === "T" && score < 500) {
        alert("ﻻ يجب ان يكون معدل التوفل أقل من 500");
        var elem3 = document.getElementById("lang_score");
        elem3.value = "";
        document.myForm.lang_score.focus();

    } else if (strUser === "I" && score < 5.5) {
        alert("ﻻ يجب ان يكون معدل  ايلتز أقل من 5.5");
        var elem3 = document.getElementById("lang_score");
        elem3.value = "";
        document.myForm.lang_score.focus();

    }

}
//-->


function MaxLenght() {
    if (document.myForm.edu_score.value.length > 20) {
        alert("ﻻ يجب ان يزيد عن 20 حرفا او رقم");
        document.myForm.edu_score.focus();

    }
}

function checkPassportSetupDate() {
    var dat = document.myForm.passport_date_of_issuance.value;


    var birth_year = dat.substring(0, 4);
    var birth_month = dat.substring(5, 7);
    var birth_day = dat.substring(8, 10);



    var passportdat = new Date(birth_year, birth_month, birth_day);

    //alert(dat.substring(0,4));
    //alert(dat.substring(5,7));
    //alert(dat.substring(8,10));
    if (new Date(birth_year, birth_month, birth_day).getTime() > new Date().getTime()) {
        alert("تاريخ اﻷصدار غير صحيح");
        //document.myForm.passport_date_of_issuance.value="";
        document.myForm.passport_date_of_issuance.focus();
        return false;
    }
}


function endPassportDate() {
    var dat = document.myForm.passport_date_of_issuance.value;
    var dat2 = document.myForm.passport_expiry_date.value;


    var passstart_year = dat.substring(0, 4);
    var passstart_month = dat.substring(5, 7);
    var passstart_day = dat.substring(8, 10);

    var passend_year = dat2.substring(0, 4);
    var passend_month = dat2.substring(5, 7);
    var passend_day = dat2.substring(8, 10);



    var passportdat = new Date(passstart_year, passstart_month, passstart_day);
    var passenddat = new Date(passend_year, passend_month, passend_day);

    if (new Date(passstart_year, passstart_month, passstart_day).getTime() >= new Date(passend_year, passend_month, passend_day).getTime() || new Date().getTime() > new Date(passend_year, passend_month, passend_day).getTime()) {
        alert("تاريخ الانتهاء غير صحيح");
        // document.myForm.passport_date_of_issuance.value="";
        document.myForm.passport_date_of_issuance.focus();
        return false;
    }
}





var xmlHttp;
var xmlHttp;
function showStateAvailablebutton(str) {
    if (typeof XMLHttpRequest !== "undefined") {
        xmlHttp = new XMLHttpRequest();
    }
    else if (window.ActiveXObject) {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    if (xmlHttp === null) {
        alert("Browser does not support XMLHTTP Request")
        return;
    }
    var url = "CheckCivilID";
    url += "?id=" + encodeURI(str);
    xmlHttp.onreadystatechange = stateChangeAvailablebutton;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}

function stateChangeAvailablebutton() {
    if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
        document.getElementById("message").innerHTML = xmlHttp.responseText;
        if (xmlHttp.responseText.trim().length > 0) {
            alert(xmlHttp.responseText);
            document.myForm.civil_id.focus();
            return false;
            // document.myForm.civil_id.value = "";
        }



    }
}



var xmlHttp;
var xmlHttp;
function showStateAvailablemail(str) {
    if (typeof XMLHttpRequest !== "undefined") {
        xmlHttp = new XMLHttpRequest();
    }
    else if (window.ActiveXObject) {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    if (xmlHttp === null) {
        alert("Browser does not support XMLHTTP Request")
        return;
    }
    var url = "Checkemail";
    url += "?id=" + encodeURI(str);
    xmlHttp.onreadystatechange = stateChangeAvailablemail;
    xmlHttp.open("GET", url, true);
    xmlHttp.send(null);
}

function stateChangeAvailablemail() {
    if (xmlHttp.readyState === 4 || xmlHttp.readyState === "complete") {
        document.getElementById("message2").innerHTML = xmlHttp.responseText;
        if (xmlHttp.responseText.trim().length > 0) {
            alert(xmlHttp.responseText);
            document.myForm.email_input.focus();
            return false;
            // document.myForm.email_input.value = "";
        }



    }
}






 
 var _validFileExtensions = [".jpg",".png"];

function Validate() {
    var arrInputs = document.myForm.getElementsByTagName("input");
    for (var i = 0; i < arrInputs.length; i++) {
        var oInput = arrInputs[i];
        if (oInput.type === "file") {
            var sFileName = oInput.value;
            if (sFileName.length > 0) {
                var blnValid = false;
                for (var j = 0; j < _validFileExtensions.length; j++) {
                    var sCurExtension = _validFileExtensions[j];
                    if (sFileName.substr(sFileName.length - sCurExtension.length, sCurExtension.length).toLowerCase() === sCurExtension.toLowerCase()) {
                        blnValid = true;
                        
                        break;
                    }
                }

                if (!blnValid) {
                    alert("غير مسموح بهذا اﻻمتداد");
                    
                    return false;
                }
            }
        }
    }

    return true;
}