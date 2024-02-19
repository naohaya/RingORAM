#!/bin/sh
if [ ! -d ./log ]; then
        mkdir ./log
fi
while true ; do
  nicstat -i eno2 -t >> ./log/log_`date +"%Y%m%d%H%M"`.txt
  sleep 5
done

