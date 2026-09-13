all:
	(cd erp-core; make $(MFLAGS) all)
	(cd erp-app; make $(MFLAGS) all)

clean:
	(cd erp-core; make $(MFLAGS) clean)
	(cd erp-app; make $(MFLAGS) clean)

install:
	(cd erp-core; make $(MFLAGS) install)
	(cd erp-app; make $(MFLAGS) install)

