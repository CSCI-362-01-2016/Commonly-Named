#!/bin/bash

#Delete Report.txt & Report.html
rm Report.txt
rm Report.html

#Compile java code
javac MainDriver.java
javac ContainsDriver.java
javac StringUtil.java

#run all test cases
java MainDriver

#compare test output to oracles and create report
./compare.py Results.txt Oracle.txt Report.txt

#change report.txt to report.html
echo "<!DOCTYPE html>" > Report.html
echo "<html>" >> Report.html
echo "<body>" >> Report.html
echo "<h1>" >> Report.html
echo "Failed Tests" >> Report.html
echo "</h1>" >> Report.html

for f in Report.txt;
do
	echo "$f" >> Report.html
	echo "</br>" >> Report.html
done

echo "</br>" >> Report.html
echo "ALL OTHER TESTS HAVE PASSED" >> Report.html
echo "</body>" >> Report.html
echo "</html>" >> Report.html

#launch reports.html 
x-www-browser reports.html
