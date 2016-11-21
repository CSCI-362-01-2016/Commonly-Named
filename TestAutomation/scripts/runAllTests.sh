#!/bin/bash

#Delete Report.html
rm /temp/Report.html

#run all test cases
#
#for each .txt file in testCases..
FILES="/testCases/*.txt"
for f in $FILES
do
  SRC="/testCaseExecutables/"
  echo "Processing $f file..."
  # Reads each line in file to a cell in an array called lines
  # ${lines[0]} = testCaseNumber
  # ${lines[1]} = requirement being tested
  # ${lines[2]} = class.method
  # ${lines[3]} = driver.java
  # ${lines[4]} = oracle
  # ${lines[5]} = inputs
  IFS=$'\n' read -d '' -r -a lines < "$f"
  #create source path from SRC variable and line 3
  SRC+="${lines[3]}"
  echo "$SRC"
  #compile /testCaseExecutables/${lines[3]}
  BUILDCMD="javac $SRC"
  echo "$BUILDCMD"
  eval "$BUILDCMD"  #creates driver.class file in /testCaseExecutables/
  #DRIVER="/testCaseExecutables/" + ${lines[3]} - ".java"
  DRIVER="${SRC%.*}"
  echo "$DRIVER"
  #run driver with arguments in ${lines[5]} and  store result in ${lines[6]}
  RUNCMD="java $DRIVER ${lines[5]}"
  echo "$RUNCMD"
  lines[6]=$(eval "$RUNCMD")
  #compare ${lines[4]} to ${lines[6]} and store report in ${lines[7]}
  if [ "${lines[4]}" == "${lines[6]}" ]; then   
  lines[7]="PASS"
  else
  lines[7]="FAIL"
  fi
  
  
  #format row of table
  
done


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
