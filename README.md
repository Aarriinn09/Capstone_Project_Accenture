SAP CPI – Employee Data Integration

1. Overview

An end-to-end SAP Cloud Integration (CPI) capstone project integrating employee data from SAP SuccessFactors to SAP S/4HANA, generating a CSV file and transferring it to an SFTP server for payroll processing, with robust error and success notifications.


2. Architecture

Source: SAP SuccessFactors (OData)

Middleware: SAP Cloud Integration (CPI)

Target: SAP S/4HANA (OData)

Output: CSV on SFTP

Alerts: SMTP Email Notifications


3. Flow Summary

Fetch employee data from SuccessFactors

Handle missing records using routing logic

Map and send data to S/4HANA (OData POST)

Fetch full employee data from S/4HANA

Convert data to CSV

Transfer file to SFTP

Send success email / error alert


4. Key CPI Components

OData Adapter, Message Mapping, Router, Parallel Multicast, XML-to-CSV Converter, SFTP Adapter, Exception Subprocess, SMTP Adapter


5. Error Handling

Missing employee data handled using routing logic

Duplicate S/4HANA records handled via unique mapping strategy


6. Agile Execution

Methodology: Agile Scrum

Sprints: 3

Incremental delivery with sprint reviews and retrospectives


7. Author

Arin Rathore
SAP Cloud Integration | Capstone Project
