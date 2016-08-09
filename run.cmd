@ECHO off
ECHO Enable JDK 6
call 1.6
@ECHO on
call mvn clean compile exec:java
PAUSE