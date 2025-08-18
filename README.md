# Automated Login and ApplyLeave Feature of OrangeHRM with JUnit and Selenium


## Overview
This repository contains **automation scripts** for the Login and Apply Leave features of a sample HR management system.  
The automation is implemented using **Selenium WebDriver** with **JUnit 5** and **Gradle**.

---

## Features Tested
- Login to the system with valid credentials
- Navigate to the Leave module
- Apply leave for a selected date range
- Handle dynamic form elements (leave types, date picker)
- Submit leave request

---

## Test Cases
The test cases are written to cover **functional scenarios** for the Apply Leave feature, including:
- Successful login
- Navigating to the Leave module
- Selecting leave type
- Selecting From and To dates
- Submitting leave
- Handling edge cases (e.g., no leave balance)

---

## Manual Testing
Manual testing was performed to validate:
- Form availability and functionality
- Correct display of leave types and balance
- Navigation consistency
- Submission results

**Bugs Found:**
- Direct navigation to Apply Leave via URL sometimes fails.
- Dynamic behavior of the Leave menu can lead to inconsistent redirection (sometimes goes to Leave List instead of Apply Leave).

---

## Automation
Automation scripts are written using:
- **Selenium WebDriver**
- **JUnit 5**
- **Gradle build tool**

**Automation Steps:**
1. Launch Chrome browser
2. Login with valid credentials
3. Navigate to Leave module via menu
4. Select leave type
5. Choose From and To dates
6. Submit leave request

**Notes:**
- Explicit waits are used to handle dynamic elements.
- The Apply Leave form cannot be automated if no leave types with balance are available.

---


## How to Run Automation
1. Clone the repository
```bash
git clone <https://github.com/Prantika71/JUnit_OrangeHRM>
./gradlew test
```
2. Open the Project in any IDE
3. Add Dependency in the build.gradle file and reload gradle from the top right
   - Dependencies Add:
     - [Selenium Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.35.0)
    
## Project Reports
### 1. Webform Automation for OrgangeHRM


#### Report
![Report](https://github.com/user-attachments/assets/7b90b9f7-476d-4c63-8155-fa866868096a)




