#!/bin/sh
FILE=./log/log_`date +"%Y%m%d%H%M"`.txt
if [ ! -d ./log ]; then
        mkdir ./log
fi
while true ; do
  nicstat -i eno2 -t >> $FILE
  sleep 1
done

