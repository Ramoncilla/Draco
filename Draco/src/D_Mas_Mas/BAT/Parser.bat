
SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Ramonella\Documents\Repositorios\Draco\Draco\src\D_Mas_Mas\Analizador
java -classpath C:\Fuentes\ java_cup.Main -parser ParserDMM -symbols simbolosDMM Parser.cup
pause
