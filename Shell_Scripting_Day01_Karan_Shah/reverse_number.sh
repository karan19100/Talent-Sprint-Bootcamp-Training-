#!/bin/bash

ReverseNumber(){
        prev_number=0
        rev_number=0
        read -p "Enter a number to reverse: " number
        while [ $number -gt 0 ]
        do
                prev_number=$(( $number % 10 ))
                rev_number=$(( $rev_number * 10 + $prev_number ))
                number=$(( $number / 10 ))
        done 
        return $rev_number
}

ReverseNumber $num

echo "Reversed Number : $rev_number"
