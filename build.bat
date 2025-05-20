echo on

del build\libs\*.jar

call .\gradlew.bat build

if not exist "c:\project"  mkdir c:\project

IF exist build\libs copy build\libs\*.jar C:\project

if not exist build\libs\*.jar echo missing file compilation error

