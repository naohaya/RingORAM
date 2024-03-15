#!/bin/sh
FILE=./exp_`date +"%Y%m%d%H%M"`.txt
COM=`pwd`/measurement.sh
$COM &
time java -cp .:./lib/guava-33.0.0-jre.jar com.client.Client 10 > $FILE
ps aux | grep /bin/sh | grep measurement | kill `awk '{print $2}'`
