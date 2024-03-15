#!/bin/sh
ps aux | grep /bin/sh | grep measurement | kill `awk '{print $2}'`
