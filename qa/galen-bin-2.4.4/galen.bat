@echo off
SET mypath=%~dp0
java -cp "%mypath%\galen.jar;lib/*;libs/*" com.galenframework.GalenMain %*



