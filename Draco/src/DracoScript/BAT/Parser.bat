
SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_161\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Ramonella\Documents\Repositorios\Draco\Draco\src\DracoScript\Analizador
java -classpath C:\Fuentes\ java_cup.Main -parser ParserDraco -symbols simbolosDraco parserD.cup
pause
