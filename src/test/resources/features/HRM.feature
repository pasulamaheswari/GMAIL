Feature:HRM Application Automation
Scenario:Login
Given open browser and enter application url
When enter Username,Password and click login
Then Verification for Homepage
When click on logout button
And close browser 

Scenario::parameters
Given open browser and enter application url
When  enter "Admin","admin123" and click on login
Then Verification for Home page
When click on logout button
And close browser

   

