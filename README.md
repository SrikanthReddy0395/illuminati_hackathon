# Arcesium Gradle Archetype (Multi-Module)

This provides a template for gradle based multi-module web application. 

## Features
  * Runs on Gradle 5.2
  * Compatible with Java 11
  * Integrated with Frames 6.x
  * Metric collection is embedded
  * Uses arcesium-commons for most of its functions

## Startup Command

  * Use service director to start  bash console with associated dns
`> sdexec -s u/$USER/dev-arc --dnsentry A:$USER-dev-arc.nyc.deshaw.com --keytab --multi /bin/bash`

  *  Create keytabs for the dns entry
`> ktextract -k /u/$USER/$USER-dev-arc.keytab HTTP/$USER-dev-arc.nyc.deshaw.com`
`> export KRB5_KTNAME=/u/$USER/$USER-dev-arc.keytab`

  *  Set TOMCAT_HOME in the environment
`export TOMCAT_HOME=/codemill/viswanat/softwares/apache-tomcat-7.0.85`
  * Start the web application using the below command
`> ./gradlew stop clean start -PjmxPort=<Unused_Port>`