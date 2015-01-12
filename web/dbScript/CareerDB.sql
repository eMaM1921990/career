--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.5
-- Dumped by pg_dump version 9.3.5
-- Started on 2015-01-13 00:22:47 EET

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 7 (class 2615 OID 108888)
-- Name: employment; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA employment;


ALTER SCHEMA employment OWNER TO postgres;

--
-- TOC entry 208 (class 3079 OID 11821)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2234 (class 0 OID 0)
-- Dependencies: 208
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = employment, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 178 (class 1259 OID 108915)
-- Name: career_level; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE career_level (
    id integer NOT NULL,
    name character varying
);


ALTER TABLE employment.career_level OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 108913)
-- Name: career_level_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE career_level_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.career_level_id_seq OWNER TO postgres;

--
-- TOC entry 2235 (class 0 OID 0)
-- Dependencies: 177
-- Name: career_level_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE career_level_id_seq OWNED BY career_level.id;


--
-- TOC entry 190 (class 1259 OID 108968)
-- Name: career_role; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE career_role (
    id integer NOT NULL,
    name character varying
);


ALTER TABLE employment.career_role OWNER TO postgres;

--
-- TOC entry 189 (class 1259 OID 108966)
-- Name: career_role_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE career_role_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.career_role_id_seq OWNER TO postgres;

--
-- TOC entry 2236 (class 0 OID 0)
-- Dependencies: 189
-- Name: career_role_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE career_role_id_seq OWNED BY career_role.id;


--
-- TOC entry 186 (class 1259 OID 108947)
-- Name: cities; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE cities (
    id integer NOT NULL,
    name character varying,
    nationality_fk integer
);


ALTER TABLE employment.cities OWNER TO postgres;

--
-- TOC entry 185 (class 1259 OID 108945)
-- Name: cities_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE cities_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.cities_id_seq OWNER TO postgres;

--
-- TOC entry 2237 (class 0 OID 0)
-- Dependencies: 185
-- Name: cities_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE cities_id_seq OWNED BY cities.id;


--
-- TOC entry 188 (class 1259 OID 108960)
-- Name: company_industry_type; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE company_industry_type (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.company_industry_type OWNER TO postgres;

--
-- TOC entry 187 (class 1259 OID 108958)
-- Name: company_industry_type_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE company_industry_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.company_industry_type_id_seq OWNER TO postgres;

--
-- TOC entry 2238 (class 0 OID 0)
-- Dependencies: 187
-- Name: company_industry_type_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE company_industry_type_id_seq OWNED BY company_industry_type.id;


--
-- TOC entry 207 (class 1259 OID 109172)
-- Name: contact_info; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE contact_info (
    id integer NOT NULL,
    mail character varying,
    phone1 character varying,
    phone2 character varying,
    counrty_id integer,
    citiy_id integer,
    if_other character varying,
    address1 character varying,
    address2 character varying,
    postalcode integer,
    box character varying,
    fax character varying,
    weburl character varying,
    cv_id integer,
    mobile character varying
);


ALTER TABLE employment.contact_info OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 109170)
-- Name: contact_info_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE contact_info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.contact_info_id_seq OWNER TO postgres;

--
-- TOC entry 2239 (class 0 OID 0)
-- Dependencies: 206
-- Name: contact_info_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE contact_info_id_seq OWNED BY contact_info.id;


--
-- TOC entry 174 (class 1259 OID 108899)
-- Name: employment_status; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE employment_status (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.employment_status OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 108897)
-- Name: employment_status_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE employment_status_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.employment_status_id_seq OWNER TO postgres;

--
-- TOC entry 2240 (class 0 OID 0)
-- Dependencies: 173
-- Name: employment_status_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE employment_status_id_seq OWNED BY employment_status.id;


--
-- TOC entry 172 (class 1259 OID 108891)
-- Name: employment_type; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE employment_type (
    id integer NOT NULL,
    name character(40)
);


ALTER TABLE employment.employment_type OWNER TO postgres;

--
-- TOC entry 171 (class 1259 OID 108889)
-- Name: employment_type_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE employment_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.employment_type_id_seq OWNER TO postgres;

--
-- TOC entry 2241 (class 0 OID 0)
-- Dependencies: 171
-- Name: employment_type_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE employment_type_id_seq OWNED BY employment_type.id;


--
-- TOC entry 196 (class 1259 OID 108993)
-- Name: skillexperience_level; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE skillexperience_level (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.skillexperience_level OWNER TO postgres;

--
-- TOC entry 195 (class 1259 OID 108991)
-- Name: experience_level_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE experience_level_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.experience_level_id_seq OWNER TO postgres;

--
-- TOC entry 2242 (class 0 OID 0)
-- Dependencies: 195
-- Name: experience_level_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE experience_level_id_seq OWNED BY skillexperience_level.id;


--
-- TOC entry 205 (class 1259 OID 109146)
-- Name: info; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE info (
    id integer NOT NULL,
    f_name character varying,
    surename character varying,
    dob date,
    gender character varying,
    nationality_id integer,
    visa_status_id integer,
    material_status character varying,
    no_of_own integer,
    driving_license integer,
    cv_user_id integer
);


ALTER TABLE employment.info OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 109144)
-- Name: info_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE info_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.info_id_seq OWNER TO postgres;

--
-- TOC entry 2243 (class 0 OID 0)
-- Dependencies: 204
-- Name: info_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE info_id_seq OWNED BY info.id;


--
-- TOC entry 182 (class 1259 OID 108931)
-- Name: nationality_type; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE nationality_type (
    id integer NOT NULL,
    name character varying
);


ALTER TABLE employment.nationality_type OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 108929)
-- Name: nationality_type_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE nationality_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.nationality_type_id_seq OWNER TO postgres;

--
-- TOC entry 2244 (class 0 OID 0)
-- Dependencies: 181
-- Name: nationality_type_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE nationality_type_id_seq OWNED BY nationality_type.id;


--
-- TOC entry 180 (class 1259 OID 108923)
-- Name: notice_period; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE notice_period (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.notice_period OWNER TO postgres;

--
-- TOC entry 179 (class 1259 OID 108921)
-- Name: notice_period_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE notice_period_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.notice_period_id_seq OWNER TO postgres;

--
-- TOC entry 2245 (class 0 OID 0)
-- Dependencies: 179
-- Name: notice_period_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE notice_period_id_seq OWNED BY notice_period.id;


--
-- TOC entry 192 (class 1259 OID 108976)
-- Name: rate_level; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE rate_level (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.rate_level OWNER TO postgres;

--
-- TOC entry 191 (class 1259 OID 108974)
-- Name: rate_level_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE rate_level_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.rate_level_id_seq OWNER TO postgres;

--
-- TOC entry 2246 (class 0 OID 0)
-- Dependencies: 191
-- Name: rate_level_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE rate_level_id_seq OWNED BY rate_level.id;


--
-- TOC entry 203 (class 1259 OID 109110)
-- Name: required_job; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE required_job (
    id integer NOT NULL,
    job_name character varying,
    employment_type_id integer,
    employement_status_id integer,
    salary_amount double precision,
    salary_id integer,
    career_level_id integer,
    notice_period_id integer,
    last_salary_amount double precision,
    last_salary_id integer,
    users_cvs_id integer,
    job_desc text
);


ALTER TABLE employment.required_job OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 109108)
-- Name: required_job_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE required_job_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.required_job_id_seq OWNER TO postgres;

--
-- TOC entry 2247 (class 0 OID 0)
-- Dependencies: 202
-- Name: required_job_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE required_job_id_seq OWNED BY required_job.id;


--
-- TOC entry 176 (class 1259 OID 108907)
-- Name: salary_type; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE salary_type (
    id integer NOT NULL,
    name character varying
);


ALTER TABLE employment.salary_type OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 108905)
-- Name: salary_type_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE salary_type_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.salary_type_id_seq OWNER TO postgres;

--
-- TOC entry 2248 (class 0 OID 0)
-- Dependencies: 175
-- Name: salary_type_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE salary_type_id_seq OWNED BY salary_type.id;


--
-- TOC entry 194 (class 1259 OID 108985)
-- Name: skill_level; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE skill_level (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.skill_level OWNER TO postgres;

--
-- TOC entry 193 (class 1259 OID 108983)
-- Name: skill_level_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE skill_level_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.skill_level_id_seq OWNER TO postgres;

--
-- TOC entry 2249 (class 0 OID 0)
-- Dependencies: 193
-- Name: skill_level_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE skill_level_id_seq OWNED BY skill_level.id;


--
-- TOC entry 198 (class 1259 OID 109001)
-- Name: skill_level_last_working; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE skill_level_last_working (
    id integer NOT NULL,
    name character(1)
);


ALTER TABLE employment.skill_level_last_working OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 108999)
-- Name: skill_level_last_working_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE skill_level_last_working_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.skill_level_last_working_id_seq OWNER TO postgres;

--
-- TOC entry 2250 (class 0 OID 0)
-- Dependencies: 197
-- Name: skill_level_last_working_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE skill_level_last_working_id_seq OWNED BY skill_level_last_working.id;


--
-- TOC entry 199 (class 1259 OID 109010)
-- Name: users; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE users (
    u_name character varying(20) NOT NULL,
    password character varying,
    f_name character varying(20),
    l_name character varying(20),
    bod date,
    nationality_id integer,
    mail character varying,
    hear_about_us character varying,
    gender character varying,
    notification_register integer DEFAULT 0
);


ALTER TABLE employment.users OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 109023)
-- Name: users_cvs; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE users_cvs (
    id integer NOT NULL,
    username character varying
);


ALTER TABLE employment.users_cvs OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 109021)
-- Name: users_cvs_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE users_cvs_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.users_cvs_id_seq OWNER TO postgres;

--
-- TOC entry 2251 (class 0 OID 0)
-- Dependencies: 200
-- Name: users_cvs_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE users_cvs_id_seq OWNED BY users_cvs.id;


--
-- TOC entry 184 (class 1259 OID 108939)
-- Name: visa_status; Type: TABLE; Schema: employment; Owner: postgres; Tablespace: 
--

CREATE TABLE visa_status (
    id integer NOT NULL,
    name character varying
);


ALTER TABLE employment.visa_status OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 108937)
-- Name: visa_status_id_seq; Type: SEQUENCE; Schema: employment; Owner: postgres
--

CREATE SEQUENCE visa_status_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE employment.visa_status_id_seq OWNER TO postgres;

--
-- TOC entry 2252 (class 0 OID 0)
-- Dependencies: 183
-- Name: visa_status_id_seq; Type: SEQUENCE OWNED BY; Schema: employment; Owner: postgres
--

ALTER SEQUENCE visa_status_id_seq OWNED BY visa_status.id;


--
-- TOC entry 2014 (class 2604 OID 108918)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY career_level ALTER COLUMN id SET DEFAULT nextval('career_level_id_seq'::regclass);


--
-- TOC entry 2020 (class 2604 OID 108971)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY career_role ALTER COLUMN id SET DEFAULT nextval('career_role_id_seq'::regclass);


--
-- TOC entry 2018 (class 2604 OID 108950)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY cities ALTER COLUMN id SET DEFAULT nextval('cities_id_seq'::regclass);


--
-- TOC entry 2019 (class 2604 OID 108963)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY company_industry_type ALTER COLUMN id SET DEFAULT nextval('company_industry_type_id_seq'::regclass);


--
-- TOC entry 2029 (class 2604 OID 109175)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY contact_info ALTER COLUMN id SET DEFAULT nextval('contact_info_id_seq'::regclass);


--
-- TOC entry 2012 (class 2604 OID 108902)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY employment_status ALTER COLUMN id SET DEFAULT nextval('employment_status_id_seq'::regclass);


--
-- TOC entry 2011 (class 2604 OID 108894)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY employment_type ALTER COLUMN id SET DEFAULT nextval('employment_type_id_seq'::regclass);


--
-- TOC entry 2028 (class 2604 OID 109149)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY info ALTER COLUMN id SET DEFAULT nextval('info_id_seq'::regclass);


--
-- TOC entry 2016 (class 2604 OID 108934)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY nationality_type ALTER COLUMN id SET DEFAULT nextval('nationality_type_id_seq'::regclass);


--
-- TOC entry 2015 (class 2604 OID 108926)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY notice_period ALTER COLUMN id SET DEFAULT nextval('notice_period_id_seq'::regclass);


--
-- TOC entry 2021 (class 2604 OID 108979)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY rate_level ALTER COLUMN id SET DEFAULT nextval('rate_level_id_seq'::regclass);


--
-- TOC entry 2027 (class 2604 OID 109113)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job ALTER COLUMN id SET DEFAULT nextval('required_job_id_seq'::regclass);


--
-- TOC entry 2013 (class 2604 OID 108910)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY salary_type ALTER COLUMN id SET DEFAULT nextval('salary_type_id_seq'::regclass);


--
-- TOC entry 2022 (class 2604 OID 108988)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY skill_level ALTER COLUMN id SET DEFAULT nextval('skill_level_id_seq'::regclass);


--
-- TOC entry 2024 (class 2604 OID 109004)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY skill_level_last_working ALTER COLUMN id SET DEFAULT nextval('skill_level_last_working_id_seq'::regclass);


--
-- TOC entry 2023 (class 2604 OID 108996)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY skillexperience_level ALTER COLUMN id SET DEFAULT nextval('experience_level_id_seq'::regclass);


--
-- TOC entry 2026 (class 2604 OID 109026)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY users_cvs ALTER COLUMN id SET DEFAULT nextval('users_cvs_id_seq'::regclass);


--
-- TOC entry 2017 (class 2604 OID 108942)
-- Name: id; Type: DEFAULT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY visa_status ALTER COLUMN id SET DEFAULT nextval('visa_status_id_seq'::regclass);


--
-- TOC entry 2197 (class 0 OID 108915)
-- Dependencies: 178
-- Data for Name: career_level; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY career_level (id, name) FROM stdin;
1	testing
\.


--
-- TOC entry 2253 (class 0 OID 0)
-- Dependencies: 177
-- Name: career_level_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('career_level_id_seq', 1, false);


--
-- TOC entry 2209 (class 0 OID 108968)
-- Dependencies: 190
-- Data for Name: career_role; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY career_role (id, name) FROM stdin;
\.


--
-- TOC entry 2254 (class 0 OID 0)
-- Dependencies: 189
-- Name: career_role_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('career_role_id_seq', 1, false);


--
-- TOC entry 2205 (class 0 OID 108947)
-- Dependencies: 186
-- Data for Name: cities; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY cities (id, name, nationality_fk) FROM stdin;
1	1	1
2	2	1
\.


--
-- TOC entry 2255 (class 0 OID 0)
-- Dependencies: 185
-- Name: cities_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('cities_id_seq', 2, true);


--
-- TOC entry 2207 (class 0 OID 108960)
-- Dependencies: 188
-- Data for Name: company_industry_type; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY company_industry_type (id, name) FROM stdin;
\.


--
-- TOC entry 2256 (class 0 OID 0)
-- Dependencies: 187
-- Name: company_industry_type_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('company_industry_type_id_seq', 1, false);


--
-- TOC entry 2226 (class 0 OID 109172)
-- Dependencies: 207
-- Data for Name: contact_info; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY contact_info (id, mail, phone1, phone2, counrty_id, citiy_id, if_other, address1, address2, postalcode, box, fax, weburl, cv_id, mobile) FROM stdin;
1	dhbdj	bsjhbsdj	s 	1	1	\N	hfdbfj	hbj	987897	hbjhb9	7897987		41	hsbdjh
\.


--
-- TOC entry 2257 (class 0 OID 0)
-- Dependencies: 206
-- Name: contact_info_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('contact_info_id_seq', 1, true);


--
-- TOC entry 2193 (class 0 OID 108899)
-- Dependencies: 174
-- Data for Name: employment_status; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY employment_status (id, name) FROM stdin;
1	1
2	2
3	3
\.


--
-- TOC entry 2258 (class 0 OID 0)
-- Dependencies: 173
-- Name: employment_status_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('employment_status_id_seq', 3, true);


--
-- TOC entry 2191 (class 0 OID 108891)
-- Dependencies: 172
-- Data for Name: employment_type; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY employment_type (id, name) FROM stdin;
1	s                                       
2	s                                       
3	f                                       
4	g                                       
5	g                                       
6	r                                       
7	y                                       
\.


--
-- TOC entry 2259 (class 0 OID 0)
-- Dependencies: 171
-- Name: employment_type_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('employment_type_id_seq', 7, true);


--
-- TOC entry 2260 (class 0 OID 0)
-- Dependencies: 195
-- Name: experience_level_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('experience_level_id_seq', 1, false);


--
-- TOC entry 2224 (class 0 OID 109146)
-- Dependencies: 205
-- Data for Name: info; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY info (id, f_name, surename, dob, gender, nationality_id, visa_status_id, material_status, no_of_own, driving_license, cv_user_id) FROM stdin;
1	Ahed	Soltan	2015-01-09	m	1	1	غير محدد	9	1	10
\.


--
-- TOC entry 2261 (class 0 OID 0)
-- Dependencies: 204
-- Name: info_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('info_id_seq', 1, true);


--
-- TOC entry 2201 (class 0 OID 108931)
-- Dependencies: 182
-- Data for Name: nationality_type; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY nationality_type (id, name) FROM stdin;
1	Egy
2	KW
\.


--
-- TOC entry 2262 (class 0 OID 0)
-- Dependencies: 181
-- Name: nationality_type_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('nationality_type_id_seq', 1, false);


--
-- TOC entry 2199 (class 0 OID 108923)
-- Dependencies: 180
-- Data for Name: notice_period; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY notice_period (id, name) FROM stdin;
1	4
2	2
3	5
\.


--
-- TOC entry 2263 (class 0 OID 0)
-- Dependencies: 179
-- Name: notice_period_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('notice_period_id_seq', 3, true);


--
-- TOC entry 2211 (class 0 OID 108976)
-- Dependencies: 192
-- Data for Name: rate_level; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY rate_level (id, name) FROM stdin;
\.


--
-- TOC entry 2264 (class 0 OID 0)
-- Dependencies: 191
-- Name: rate_level_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('rate_level_id_seq', 1, false);


--
-- TOC entry 2222 (class 0 OID 109110)
-- Dependencies: 203
-- Data for Name: required_job; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY required_job (id, job_name, employment_type_id, employement_status_id, salary_amount, salary_id, career_level_id, notice_period_id, last_salary_amount, last_salary_id, users_cvs_id, job_desc) FROM stdin;
\.


--
-- TOC entry 2265 (class 0 OID 0)
-- Dependencies: 202
-- Name: required_job_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('required_job_id_seq', 1, true);


--
-- TOC entry 2195 (class 0 OID 108907)
-- Dependencies: 176
-- Data for Name: salary_type; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY salary_type (id, name) FROM stdin;
1	fdf
2	fdv
3	fwe
4	fer
\.


--
-- TOC entry 2266 (class 0 OID 0)
-- Dependencies: 175
-- Name: salary_type_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('salary_type_id_seq', 4, true);


--
-- TOC entry 2213 (class 0 OID 108985)
-- Dependencies: 194
-- Data for Name: skill_level; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY skill_level (id, name) FROM stdin;
\.


--
-- TOC entry 2267 (class 0 OID 0)
-- Dependencies: 193
-- Name: skill_level_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('skill_level_id_seq', 1, false);


--
-- TOC entry 2217 (class 0 OID 109001)
-- Dependencies: 198
-- Data for Name: skill_level_last_working; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY skill_level_last_working (id, name) FROM stdin;
\.


--
-- TOC entry 2268 (class 0 OID 0)
-- Dependencies: 197
-- Name: skill_level_last_working_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('skill_level_last_working_id_seq', 1, false);


--
-- TOC entry 2215 (class 0 OID 108993)
-- Dependencies: 196
-- Data for Name: skillexperience_level; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY skillexperience_level (id, name) FROM stdin;
\.


--
-- TOC entry 2218 (class 0 OID 109010)
-- Dependencies: 199
-- Data for Name: users; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY users (u_name, password, f_name, l_name, bod, nationality_id, mail, hear_about_us, gender, notification_register) FROM stdin;
asd	123	122	321	2015-01-09	1	50510	\N	m	1
ahmed	ahmed	ahme	has	2015-01-09	1	sdad	\N	m	1
dasd	e10adc3949ba59abbe56e057f20f883e	152	414	2015-01-07	1	cdsdsf	\N	m	1
\.


--
-- TOC entry 2220 (class 0 OID 109023)
-- Dependencies: 201
-- Data for Name: users_cvs; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY users_cvs (id, username) FROM stdin;
1	dasd
2	dasd
3	dasd
4	dasd
5	dasd
6	dasd
7	dasd
8	dasd
9	dasd
10	dasd
11	dasd
12	dasd
13	dasd
14	dasd
15	dasd
16	dasd
17	dasd
18	dasd
19	dasd
20	dasd
21	dasd
22	dasd
23	dasd
24	dasd
25	dasd
26	dasd
27	dasd
28	dasd
29	dasd
30	dasd
31	dasd
32	dasd
33	dasd
34	dasd
35	dasd
36	dasd
37	dasd
38	dasd
39	dasd
40	dasd
41	dasd
42	dasd
43	dasd
\.


--
-- TOC entry 2269 (class 0 OID 0)
-- Dependencies: 200
-- Name: users_cvs_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('users_cvs_id_seq', 43, true);


--
-- TOC entry 2203 (class 0 OID 108939)
-- Dependencies: 184
-- Data for Name: visa_status; Type: TABLE DATA; Schema: employment; Owner: postgres
--

COPY visa_status (id, name) FROM stdin;
1	1
\.


--
-- TOC entry 2270 (class 0 OID 0)
-- Dependencies: 183
-- Name: visa_status_id_seq; Type: SEQUENCE SET; Schema: employment; Owner: postgres
--

SELECT pg_catalog.setval('visa_status_id_seq', 1, true);


--
-- TOC entry 2037 (class 2606 OID 108920)
-- Name: career_level_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY career_level
    ADD CONSTRAINT career_level_pk PRIMARY KEY (id);


--
-- TOC entry 2049 (class 2606 OID 108973)
-- Name: career_role_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY career_role
    ADD CONSTRAINT career_role_pk PRIMARY KEY (id);


--
-- TOC entry 2045 (class 2606 OID 108952)
-- Name: cities_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY cities
    ADD CONSTRAINT cities_pk PRIMARY KEY (id);


--
-- TOC entry 2047 (class 2606 OID 108965)
-- Name: company_industry_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY company_industry_type
    ADD CONSTRAINT company_industry_pk PRIMARY KEY (id);


--
-- TOC entry 2067 (class 2606 OID 109180)
-- Name: contact_info_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY contact_info
    ADD CONSTRAINT contact_info_pk PRIMARY KEY (id);


--
-- TOC entry 2031 (class 2606 OID 108896)
-- Name: employment__type_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY employment_type
    ADD CONSTRAINT employment__type_pk PRIMARY KEY (id);


--
-- TOC entry 2033 (class 2606 OID 108904)
-- Name: employment_status_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY employment_status
    ADD CONSTRAINT employment_status_pk PRIMARY KEY (id);


--
-- TOC entry 2055 (class 2606 OID 108998)
-- Name: experience_level_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY skillexperience_level
    ADD CONSTRAINT experience_level_pk PRIMARY KEY (id);


--
-- TOC entry 2065 (class 2606 OID 109154)
-- Name: info_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY info
    ADD CONSTRAINT info_pk PRIMARY KEY (id);


--
-- TOC entry 2063 (class 2606 OID 109118)
-- Name: job_required_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT job_required_pk PRIMARY KEY (id);


--
-- TOC entry 2041 (class 2606 OID 108936)
-- Name: nationality_type_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY nationality_type
    ADD CONSTRAINT nationality_type_pk PRIMARY KEY (id);


--
-- TOC entry 2039 (class 2606 OID 108928)
-- Name: notice_period_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY notice_period
    ADD CONSTRAINT notice_period_pk PRIMARY KEY (id);


--
-- TOC entry 2051 (class 2606 OID 108981)
-- Name: role_level_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY rate_level
    ADD CONSTRAINT role_level_pk PRIMARY KEY (id);


--
-- TOC entry 2035 (class 2606 OID 108912)
-- Name: salary_type_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY salary_type
    ADD CONSTRAINT salary_type_pk PRIMARY KEY (id);


--
-- TOC entry 2057 (class 2606 OID 109006)
-- Name: skill_leve_last_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY skill_level_last_working
    ADD CONSTRAINT skill_leve_last_pk PRIMARY KEY (id);


--
-- TOC entry 2053 (class 2606 OID 108990)
-- Name: skill_level_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY skill_level
    ADD CONSTRAINT skill_level_pk PRIMARY KEY (id);


--
-- TOC entry 2059 (class 2606 OID 109199)
-- Name: username_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY users
    ADD CONSTRAINT username_pk PRIMARY KEY (u_name);


--
-- TOC entry 2061 (class 2606 OID 109192)
-- Name: users_cvspk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY users_cvs
    ADD CONSTRAINT users_cvspk PRIMARY KEY (id);


--
-- TOC entry 2043 (class 2606 OID 108944)
-- Name: visa_status_pk; Type: CONSTRAINT; Schema: employment; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY visa_status
    ADD CONSTRAINT visa_status_pk PRIMARY KEY (id);


--
-- TOC entry 2073 (class 2606 OID 109134)
-- Name: career_level_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT career_level_fk FOREIGN KEY (career_level_id) REFERENCES career_level(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2081 (class 2606 OID 109186)
-- Name: city_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY contact_info
    ADD CONSTRAINT city_fk FOREIGN KEY (citiy_id) REFERENCES cities(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2080 (class 2606 OID 109181)
-- Name: country_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY contact_info
    ADD CONSTRAINT country_fk FOREIGN KEY (counrty_id) REFERENCES nationality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2075 (class 2606 OID 109229)
-- Name: cv_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT cv_fk FOREIGN KEY (users_cvs_id) REFERENCES users_cvs(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2079 (class 2606 OID 109254)
-- Name: cv_fk_1; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY info
    ADD CONSTRAINT cv_fk_1 FOREIGN KEY (cv_user_id) REFERENCES users_cvs(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2082 (class 2606 OID 109193)
-- Name: cv_user_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY contact_info
    ADD CONSTRAINT cv_user_fk FOREIGN KEY (cv_id) REFERENCES users_cvs(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2071 (class 2606 OID 109124)
-- Name: emp_status_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT emp_status_fk FOREIGN KEY (employement_status_id) REFERENCES employment_status(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2070 (class 2606 OID 109119)
-- Name: emp_type_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT emp_type_fk FOREIGN KEY (employment_type_id) REFERENCES employment_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2078 (class 2606 OID 109165)
-- Name: license_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY info
    ADD CONSTRAINT license_fk FOREIGN KEY (driving_license) REFERENCES nationality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2068 (class 2606 OID 108953)
-- Name: nationality_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY cities
    ADD CONSTRAINT nationality_fk FOREIGN KEY (nationality_fk) REFERENCES nationality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2076 (class 2606 OID 109155)
-- Name: nationality_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY info
    ADD CONSTRAINT nationality_fk FOREIGN KEY (nationality_id) REFERENCES nationality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2069 (class 2606 OID 109016)
-- Name: nationality_pk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY users
    ADD CONSTRAINT nationality_pk FOREIGN KEY (nationality_id) REFERENCES nationality_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2074 (class 2606 OID 109139)
-- Name: notice_period_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT notice_period_fk FOREIGN KEY (notice_period_id) REFERENCES notice_period(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2072 (class 2606 OID 109129)
-- Name: salaru_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY required_job
    ADD CONSTRAINT salaru_fk FOREIGN KEY (salary_id) REFERENCES salary_type(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2077 (class 2606 OID 109160)
-- Name: visa_status_fk; Type: FK CONSTRAINT; Schema: employment; Owner: postgres
--

ALTER TABLE ONLY info
    ADD CONSTRAINT visa_status_fk FOREIGN KEY (visa_status_id) REFERENCES visa_status(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2233 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2015-01-13 00:22:48 EET

--
-- PostgreSQL database dump complete
--

