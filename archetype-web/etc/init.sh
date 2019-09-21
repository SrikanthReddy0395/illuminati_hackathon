#!/bin/sh

if [ $# -ne 4 ]
then
    echo "Usage: $0 {tomcat_dir keytab_location command(start/stop) catalina_opts}"
    exit 1
fi

catalinaHomeDir=$1
keytabLocation=$2
cmdOpt=$3
catalinaOpts=$4

skinit -iq

JAVA_HOME="/usr/local/java/jdk"
CATALINA_HOME=$catalinaHomeDir
CATALINA_BASE=$catalinaHomeDir
CATALINA_OPTS=$catalinaOpts
CATALINA_PID="$catalinaHomeDir/logs/tomcat.pid"
KRB5_KTNAME=$keytabLocation
KRB5RCACHETYPE=none

export JAVA_HOME CATALINA_HOME CATALINA_BASE CATALINA_OPTS CATALINA_PID KRB5_KTNAME KRB5RCACHETYPE

PRGDIR="$catalinaHomeDir/bin"
EXECUTABLE=catalina.sh

# Check that target executable exists
if [ ! -x "$PRGDIR"/"$EXECUTABLE" ]; then
  echo "Cannot find $PRGDIR/$EXECUTABLE"
  echo "This file is needed to run this program"
  exit 1
fi

if [ "$cmdOpt" = "start" ]
then
    rm -f "$catalinaHomeDir/logs/*"
    exec "$PRGDIR/$EXECUTABLE" start
fi

if [ "$cmdOpt" = "stop" ]
then
	exec "$PRGDIR/$EXECUTABLE" stop -force
fi
