
package parcial2julianescobar;

public class Obra {
    
    private String nombreObra,descripcion,estilo;
    private double valor;
    private Pintor p;
    
    
    
    public Obra(Pintor p,String nombreObra, String descripcion, String estilo, double valor) {
        this.p = p;
        this.nombreObra = nombreObra;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.valor = valor;
    }       

    

    public String getNombreObra() {
        return nombreObra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstilo() {
        return estilo;
    }

    public double getValor() {
        return valor;
    }

    public Pintor getP() {
        return p;
    }
    
    
    
    
    
}
