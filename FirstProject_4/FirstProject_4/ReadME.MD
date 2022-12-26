create table Yes24(

    Rank        NUMBER(4) PRIMARY KEY,
    Category    NVARCHAR2(1000),
    Title       NVARCHAR2(1000),
    Price       NVARCHAR2(20), 
    Summary     VARCHAR2(4000), 
    Author      NVARCHAR2(1000),  
    Pub         NVARCHAR2(1000),    
    Grade       NVARCHAR2(20)
);

CREATE SEQUENCE Yes24_sql START WITH 1 INCREMENT BY 1 ;  

DROP TABLE YES24;
DROP sequence yes24_sql;

SELECT * FROM Yes24;

desc Yes24;

commit;