@REM Copyright 2013 Dell Inc.
@REM ALL RIGHTS RESERVED.
@REM 
@REM This software is the confidential and proprietary information of
@REM Dell Inc. ("Confidential Information").  You shall not
@REM disclose such Confidential Information and shall use it only in
@REM accordance with the terms of the license agreement you entered
@REM into with Dell Inc.
@REM 
@REM DELL INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
@REM THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
@REM INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
@REM MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
@REM NON-INFRINGEMENT. DELL SHALL NOT BE LIABLE FOR ANY
@REM DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
@REM OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
@REM Copyright 2013 Dell Inc.
@REM ALL RIGHTS RESERVED.
@REM 
@REM This software is the confidential and proprietary information of
@REM Dell Inc. ("Confidential Information").  You shall not
@REM disclose such Confidential Information and shall use it only in
@REM accordance with the terms of the license agreement you entered
@REM into with Dell Inc.
@REM 
@REM DELL INC. MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT
@REM THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED,
@REM INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
@REM MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
@REM NON-INFRINGEMENT. DELL SHALL NOT BE LIABLE FOR ANY
@REM DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
@REM OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.

@echo off

setlocal ENABLEDELAYEDEXPANSION

set OLDDIR=%CD%
set BASEDIR=%~dp0\..
chdir %BASEDIR%
set BASEDIR=%CD%

rem Make sure prerequisite environment variables are set
if not "%JAVA_HOME%" == "" goto gotJdkHome
if not "%JRE_HOME%" == "" goto gotJreHome
echo Neither the JAVA_HOME nor the JRE_HOME environment variable is defined
echo At least one of these environment variable is needed to run this program
goto exit

:gotJreHome
if not exist "%JRE_HOME%\bin\java.exe" goto noJavaHome
if not exist "%JRE_HOME%\bin\javaw.exe" goto noJavaHome
goto exit

:gotJdkHome
if not exist "%JAVA_HOME%\bin\java.exe" goto noJavaHome
if not exist "%JAVA_HOME%\bin\javaw.exe" goto noJavaHome
if not "%JRE_HOME%" == "" goto okJavaHome
set "JRE_HOME=%JAVA_HOME%"
goto okJavaHome

:noJavaHome
echo The JAVA_HOME environment variable is not defined correctly
echo This environment variable is needed to run this program
echo NB: JAVA_HOME can point to a JDK or a JRE
goto exit
:okJavaHome

rem Build up the classpath that will be needed. First, make sure to
rem destroy any classpath settings from the user.
set CLASSPATH="
for /R "%BASEDIR%/lib" %%a in (*.jar) do (
    set CLASSPATH=!CLASSPATH!;%%a
)
set CLASSPATH=!CLASSPATH!"

rem Now we're ready to run JAVA
"%JRE_HOME%\bin\java.exe" %JAVA_OPTIONS% -classpath "%CLASSPATH%" com.quest.glue.tools.wizards.newagent.Main

rem All done.
goto end

:exit
chdir "%OLDDIR%"
endlocal
exit /b 1

:end
chdir "%OLDDIR%"
endlocal
exit /b 0
