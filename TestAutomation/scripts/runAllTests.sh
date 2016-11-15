#!/bin/bash

#Compile java code
javac MainDriver.java
javac ContainsDriver.java
javac StringUtil.java

#run all test cases
java MainDriver
#compare test output to oracles and create report
./compare.py output.txt oracle.txt report.txt

#change report.txt to report.html

#launch reports.html 
x-www-browser reports.html
