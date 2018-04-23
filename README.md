In the program is assumes that a user can use the command line interface to enter the desired string and also enter the character, 
not just the letter I, and check how many times it appears.

Requirements for executing of program are installed Java 1.8 and Apache Maven.

Program can be executed from both CLI and IDE.

Steps to execute program via CLI:

1) mvn package
2) jar tvf target/zadatak4-0.0.1-SNAPSHOT.
3) java -cp target/zadatak4-0.0.1-SNAPSHOT.jar zadatak.App

In Eclipse IDE, after importing Maven project steps are:
1) Run as -> Maven Clean
2) Run as -> Maven Test
3) Run as -> Java application
