# AVL search program makefile
# Yaseen Hull
# 23 April 2017



SRCDIR = src
BIN = bin
DOC = doc

JAVAC = javac
JAVAFLAGS = -g -d $(BIN) -cp $(BIN) 

.SUFFIXES: .java .class

vpath %.java $(SRCDIR)
vpath %.class $(BIN)

.java.class:
	$(JAVAC) $(JAVAFLAGS) $<

all: BinaryTreeNode.class BinaryTree.class \
     AVLTree.class AVLbook.class

doc: $(BIN)
	javadoc -version -aurthor -d $(SRCDIR) $(DOC)     
     

clean:
	rm *.class
