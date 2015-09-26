#####################################
# Notes:
# $(patsubst  A, B, C): replace B with A in C.
# $(wildcard *.java): list all files that names end with ".java"
# "%" gnu make wildcard
#####################################
JAR=java -jar
JAVAC=javac
JAVA=java

all: sim_all $(patsubst  %.java, parse_%, $(wildcard *.java)) 

sim_all: $(patsubst  %.java, exec_%, $(wildcard *.java))

####### compile files #######
build_%: %.java
	javac $<

####### execute files #######
exec_%: build_%
	java $(patsubst build_%, %, $<)

####### parse files ####### 
parse_%: %.java
	$(JAR) ../MJ.jar $<	
	mv $<.s output/
	mv $<.ast.dot output/
	mv $<.ST.dot output/

clean:
	rm -f *~ *.dot *.class *.s
	rm -f meggy/*.class
	rm -f output/*.s output/*.dot