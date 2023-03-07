set projectLocation=C:\Users\ss\eclipse-workspace\HRMS_AUTOMATION_FRAMEWORKS
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml