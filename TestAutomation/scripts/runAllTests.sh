#!/bin/bash

#Delete Report.html
rm Report.html

#run all test cases
#
#for each .txt file in testCases..
FILES="/testCases/*.txt"
for f in $FILES
do
  echo "Processing $f file..."
  # Reads each line in file to a cell in an array called lines
  # ${lines[0]} = testCaseNumber
  # ${lines[1]} = requirement being tested
  # ${lines[2]} = class.method
  # ${lines[3]} = driver.java
  # ${lines[4]} = oracle
  # ${lines[5]} = inputs
  IFS=$'\n' read -d '' -r -a lines < $f
  cat $f
  #compile ${lines[3]}
  #run driver with arguments in ${lines[5]}
  #store result in ${lines[6]}
  #compare ${lines[4]} to ${lines[6]}
  #store report in ${lines[7]}
  #format row of table
  
done

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

#launch Report.html 
x-www-browser Report.html
