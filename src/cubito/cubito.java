
package cubito;
/*contiene las propiedades, constructores y metodos de mi cubo*/

public class cubito {
    //declaro las propiedades de mi cubo
    int alto, ancho, profundo;

    public cubito() {
    }

    public cubito(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("cubito{alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundo=").append(profundo);
        sb.append('}');
        return sb.toString();
    }
    
    public int calcularVolumen(int al,int an, int pr){
        return al*an*pr;        
    }
           
}


