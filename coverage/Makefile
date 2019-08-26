# binary search program makefile
# Yaseen Hull
# 27 March 2017



SRCDIR = src
BIN = bin
JARFILE = lib
CLASSFILES = testAVLTree.java 

JAVAC = javac
JAVAFLAGS = -g -d $(BIN) -cp $(BIN) 

.SUFFIXES: .java .class

vpath %.java $(SRCDIR)
vpath %.class $(BIN)

.java.class:
	$(JAVAC) $(JAVAFLAGS) $<

jar: 
	jar cvf $(JARFILE) $(CLASSFILES)

all: BinaryTreeNode.class BinaryTree.class \
     AVLTree.class AVLbook.class testAVLTree.class     
     

clean:
	rm *.class

