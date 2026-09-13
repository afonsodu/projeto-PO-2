PO_UILIB_DIR=/usr/share/java
#PO_UILIB_DIR=../../po-uilib
JARNAME=erp-app

all:
	(cd src; javac -cp $(PO_UILIB_DIR)/po-uilib.jar:../../erp-core/erp-core.jar -encoding UTF-8 `find . -name \*.java`)
	(cd src; jar cf ../$(JARNAME).jar `find . -name \*.class -o -name \*.java` )

clean:
	$(RM) $(JARNAME).jar `find . -name \*.class`
