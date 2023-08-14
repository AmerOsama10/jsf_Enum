package com.learn.jsf.model;

public enum Category {
    WALLET("Wallet"),
    VODAFONE("Vodafone"),
    CREDIT("Credit");
    
    private final String label;
    
    Category(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
