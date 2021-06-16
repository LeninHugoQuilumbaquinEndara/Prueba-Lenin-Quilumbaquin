
package prueba;

public class serieEstufiantes {
    private String nombre;
    private String sexo;
    private double nota;
          public int cantidad;

    public serieEstufiantes(String nombre, String sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getNota() {
        return nota;
    }
    public void setSexo(char sexo){
        int alm=0;
        int almH=0;
    for( int i = 0 ; i < cantidad ;i++)
          if (sexo == 'm' || sexo == 'M'){
          System.out.println("Es hombre");
           alm =alm+1;
        }
        else {
            System.out.println("Es mujer");
            almH=almH+1;
        }
    }
    @Override
    public String toString(){
       return this.nombre+" "+this.sexo+" "+this.nota; 
    }
    
}
