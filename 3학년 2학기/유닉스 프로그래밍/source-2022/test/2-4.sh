#!/bin/bash

echo -n "Is it morning?"
read answer
case $answer in
	y* | Y* ) echo Good morning ;;
	n* | N* ) echo Have a good day ;;
	*) echo Sorry your answer is no proper ;;
esac

exit 0
