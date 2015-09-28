FLEX=jflex
JCUP=java -jar parser/java-cup-11a.jar -parser MeggyJavaParser 

all: FrontEnd

MeggyJavaLex: lexer/MeggyJava.flex
	$(FLEX) $<

MeggyJavaParser: parser/MeggyJava.cup
	$(JCUP) $<

FrontEnd: MeggyJavaLex MeggyJavaParser
	

clean:
	rm -f *~ *.java
	rm -f lexer/*~ lexer/*.java
	rm -f parser/*~ parser/*.java
