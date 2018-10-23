
SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_161\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= C:\Fuentes\jflex-1.4.3
cd C:\Users\Ramonella\Documents\Repositorios\Draco\Draco\src\ASM\Analizador
java -jar %JFLEX_HOME%\lib\JFlex.jar Scanner.jflex
pause

