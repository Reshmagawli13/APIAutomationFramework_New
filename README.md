# API Automation Framework 

### Techstack Used

Use the following 
- JAVA , Rest Assured 
- Maven , TestNG, Asset J 
- Read Parameter properties , Excel - Apache POI,Fillo 
- Payload Management - POJO-GSON,Jackson API 
- Allure Report 
- -Excel sheet for test data 
- SonarLint ,JAVA >17

### Project Details 

Restful booker API automation with the JAVA details 


#### Project URL 
- https://restful-booker.herokuapp.com
- CRUD Operation 
    - Get Booking
    - Post Create Booking
    - Put Update booking 
    - Delete Booking
- AUTH 
    - Token Based 
    - Cookies Based 
    - OAuth 2.0(Utils)

#### Automation Testcases
We are using Hybrid framework to automate the test cases 
1. Payload Management
2. Read from Excel file , YAML , Proeprties file 
3. Allure Reporting 
4. Jenkins file (Run on the Jenkins also)


##### Integration Scenario 
- First Get the token from the post request 
- Create Booking 
- Update Booking 
- Delete Booking 
- Verify that booking is deleted 

#### Utils: 
- Reading Excel file code 
- Any String Manipulation code
- Reading YAML or JSON, Properties file Code.
- Any Misc Util Code like Faker 
- Database Connection -MySqL Connector Code
- -JDBC Connector Code for the MYSQL Data 
