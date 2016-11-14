#!/bin/bash

#delete previous reports
cd /temp
rm reports.txt
rm reports.html
cd..

#run all test cases

#compare test output to oracles and create report
/scripts/compare.py output.txt oracle.txt report.txt

#change report.txt to report.html

#launch reports.html 
x-www-browser reports.html
