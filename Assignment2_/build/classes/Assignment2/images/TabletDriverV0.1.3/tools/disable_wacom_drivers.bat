:: BatchGotAdmin  
:-------------------------------------  
REM  --> Check for permissions  
>nul 2>&1 "%SYSTEMROOT%\system32\cacls.exe" "%SYSTEMROOT%\system32\config\system"  
  
REM --> If error flag set, we do not have admin.  
if '%errorlevel%' NEQ '0' (  
    echo Requesting administrative privileges...  
    goto UACPrompt  
) else ( goto gotAdmin )  
  
:UACPrompt  
    echo Set UAC = CreateObject^("Shell.Application"^) > "%temp%\getadmin.vbs"  
    echo UAC.ShellExecute "%~s0", "", "", "runas", 1 >> "%temp%\getadmin.vbs"  
  
    "%temp%\getadmin.vbs"  
    exit /B  
  
:gotAdmin  
    if exist "%temp%\getadmin.vbs" ( del "%temp%\getadmin.vbs" )  
    pushd "%CD%"  
    CD /D "%~dp0"  
:-------------------------------------- 

taskkill /F /IM Wacom_Tablet.exe
taskkill /F /IM Pen_Tablet.exe

net stop WTabletServicePro
net start WTabletServicePro
net stop WTabletServiceCon
timeout /t 1
net start WTabletServiceCon
taskkill /F /IM WacomDesktopCenter.exe
timeout /t 10
taskkill /F /IM Wacom_Tablet.exe
taskkill /F /IM Pen_Tablet.exe