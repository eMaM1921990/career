/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.career.utils;

/**
 *
 * @author emam
 */
public class SQLCommon {

    public String REGISTER = "INSERT INTO employment.users("
            + "            u_name, password, f_name, l_name, bod, nationality_id, mail,"
            + "            hear_about_us, gender, notification_register)"
            + "    VALUES (?, ?, ?, ?, ?::date, ?, ?,"
            + "            ?, ?, ?);";

    public String GET_NATIONAL = "SELECT id, name"
            + "  FROM employment.nationality_type;";

    public String GET_CAREER_LEVEL = "SELECT id, name"
            + "  FROM employment.career_level;";

    public String EMPLOYMENT_STATUS = "SELECT id, name"
            + "  FROM employment.employment_status;";

    public String GET_EMP_TYPE = "SELECT id, name FROM employment.employment_type;";

    public String GET_SALARY = "SELECT id, name"
            + "  FROM employment.salary_type;";

    public String GET_PERID = "SELECT id, name"
            + "  FROM employment.notice_period;";

    public String GET_VISA = "SELECT id, name"
            + "  FROM employment.visa_status;";

    public String GET_CITY = "SELECT id, name, nationality_fk"
            + "  FROM employment.cities;";

    public String GET_LOGIN = "SELECT u_name, password, f_name, l_name, bod, nationality_id, mail, "
            + "       hear_about_us, gender, notification_register"
            + "  FROM employment.users WHERE u_name=? AND password=?;";

    public String GET_JOB = "SELECT  id,job_name, job_desc, employment_type_id, employement_status_id, \n"
            + "       salary_amount, salary_id, career_level_id, notice_period_id, \n"
            + "       last_salary_amount, last_salary_id\n"
            + "  FROM employment.required_job WHERE users_cvs_id=?::integer;";

    public String GET_JOB_BYID = "SELECT  id,job_name, job_desc, employment_type_id, employement_status_id, \n"
            + "       salary_amount, salary_id, career_level_id, notice_period_id, \n"
            + "       last_salary_amount, last_salary_id\n"
            + "  FROM employment.required_job WHERE id=?::integer;";

    public String INSERT_JOB = "INSERT INTO employment.required_job("
            + "             job_name, job_desc, employment_type_id, employement_status_id, "
            + "            salary_amount, salary_id, career_level_id, notice_period_id, "
            + "            last_salary_amount, last_salary_id, users_cvs_id)"
            + "    VALUES ( ?, ?, ?, ?, "
            + "            ?, ?, ?, ?, "
            + "            ?, ?, ?);";

    public String UPDATE_JOB = "UPDATE employment.required_job"
            + "   SET  job_name=?,job_desc=?, employment_type_id=?, employement_status_id=?, "
            + "       salary_amount=?, salary_id=?, career_level_id=?, notice_period_id=?, "
            + "       last_salary_amount=?, last_salary_id=?, users_cvs_id=? "
            + " WHERE id=?::integer;";

    public String INSERT_CV = "INSERT INTO employment.users_cvs("
            + "             username)"
            + "    VALUES ( ?);";

    public String GET_INFO = "SELECT id, f_name, surename, dob, gender, nationality_id, visa_status_id, "
            + "       material_status, no_of_own, driving_license, cv_user_id"
            + "  FROM employment.info WHERE cv_user_id=?::integer;";

    public String INSERT_INFO = "INSERT INTO employment.info("
            + "             f_name, surename, dob, gender, nationality_id, visa_status_id, "
            + "            material_status, no_of_own, driving_license, cv_user_id)"
            + "    VALUES (?, ?, ?::date, ?, ?, ?, "
            + "            ?, ?, ?, ?);";

    public String UPDATE_INFO = "UPDATE employment.info"
            + "   SET  f_name=?, surename=?, dob=?::date, gender=?, nationality_id=?, "
            + "       visa_status_id=?, material_status=?, no_of_own=?, driving_license=? "
            + " WHERE id=?;";

    public String GET_CONTACT_INFO = "SELECT id, mail, phone1, phone2, counrty_id, citiy_id, if_other, address1, "
            + "       address2, postalcode, box, fax, weburl, cv_id, mobile"
            + "  FROM employment.contact_info WHERE cv_id=?::integer;";

    public String INSERT_CONTACT_INFO = "INSERT INTO employment.contact_info("
            + "             mail, phone1, phone2, counrty_id, citiy_id, address1, "
            + "            address2, postalcode, box, fax, weburl, cv_id, mobile)"
            + "    VALUES ( ?, ?, ?, ?, ?, ?, "
            + "            ?, ?, ?, ?, ?, ?,?);";

    public String UPDATE_CONTACT_INFO = "UPDATE employment.contact_info"
            + "   SET  mail=?, phone1=?, phone2=?, counrty_id=?, citiy_id=?,"
            + "       address1=?, address2=?, postalcode=?, box=?, fax=?, weburl=?,"
            + "       cv_id=?, mobile=?"
            + " WHERE id=?;";

    public String INSERT_EXPERIENCE = "INSERT INTO employment.experience("
            + "             startdate, enddate, national_id, address, companyname, company_industry_id, "
            + "            career_role_id, role_name, jobdesc, cv_id)"
            + "    VALUES (?::date, ?::date, ?, ?, ?, ?, ?, "
            + "            ?, ?, ?);";

    public String DELETE_EXPERINCE = "DELETE FROM employment.experience"
            + " WHERE id=?;";

    public String UPDATE_EXPERIENCE = "UPDATE employment.experience"
            + "   SET  startdate=?, enddate=?, national_id=?, address=?, companyname=?, "
            + "       company_industry_id=?, career_role_id=?, role_name=?, jobdesc=?, "
            + "       cv_id=?"
            + " WHERE id=?;";

    public String GET_CURRENT_EXPER = "SELECT id, startdate, enddate, national_id, address, companyname, company_industry_id, "
            + "       career_role_id, role_name, jobdesc, cv_id"
            + "  FROM employment.experience WHERE cv_id=?;";

    public String GET_INDUSRTY = "SELECT id, name"
            + "  FROM employment.company_industry_type;";

    public String GET_CAREER_ROLE = "SELECT id, name"
            + "  FROM employment.career_role;";
    
    public String GET_CURRENT_EXPER_BYID = "SELECT id, startdate, enddate, national_id, address, companyname, company_industry_id, "
            + "       career_role_id, role_name, jobdesc, cv_id"
            + "  FROM employment.experience WHERE id=?;";
}
