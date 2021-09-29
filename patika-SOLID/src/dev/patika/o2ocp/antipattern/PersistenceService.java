package dev.patika.o2ocp.antipattern;

public class PersistenceService {
    InvoicePersistence invoicePersistence;

    public PersistenceService(InvoicePersistence invoicePersistence) {
        this.invoicePersistence = invoicePersistence;
    }
}
