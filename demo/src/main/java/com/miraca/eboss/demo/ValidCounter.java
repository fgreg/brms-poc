package com.miraca.eboss.demo;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(fc5d73791ab2d9f7c67733077fe58d62)
 */
public class ValidCounter  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer counter;

    public ValidCounter() {
    }

    public ValidCounter(java.lang.Integer counter) {
        this.counter = counter;
    }


    
    public java.lang.Integer getCounter() {
        return this.counter;
    }

    public void setCounter(java.lang.Integer counter) {
        this.counter = counter;
    }
}