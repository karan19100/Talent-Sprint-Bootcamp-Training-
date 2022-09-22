#!/bin/bash
echo "enter the password"
read password
len="${#password}"

if test $len -ge 8 ; then

    echo "$password" | grep -q [0-9]

     if test $? -eq 0 ; then

           echo "$password" | grep -q [A-Z]

                if test $? -eq 0 ; then

                    echo "$password" | grep -q [a-z]

                       if test $? -eq 0 ; then 

                          echo "Strong password"
 
                       else

                         echo "Should include a lower case letter"

                       fi
                   else

                     echo "Should include a UPPER case letter" 

                 fi
          else

       echo "Should include a Number"   

     fi

else

    echo "Password length should have at least 8 characters"

fi
