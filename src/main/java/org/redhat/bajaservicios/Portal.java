package org.redhat.bajaservicios;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(012bdf80ac7224fe62879ae39f881864)
 */
@org.kie.api.definition.type.Label(value = "Portal")
public class Portal  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "GeoCodigo")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.Integer geoCodigo;
    
    @org.kie.api.definition.type.Label(value = "IdPortal")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Integer idPortal;

    public Portal() {
    }

    public Portal(java.lang.Integer idPortal, java.lang.Integer geoCodigo) {
        this.idPortal = idPortal;
        this.geoCodigo = geoCodigo;
    }


    
    public java.lang.Integer getGeoCodigo() {
        return this.geoCodigo;
    }

    public void setGeoCodigo(java.lang.Integer geoCodigo) {
        this.geoCodigo = geoCodigo;
    }
    
    public java.lang.Integer getIdPortal() {
        return this.idPortal;
    }

    public void setIdPortal(java.lang.Integer idPortal) {
        this.idPortal = idPortal;
    }
}
