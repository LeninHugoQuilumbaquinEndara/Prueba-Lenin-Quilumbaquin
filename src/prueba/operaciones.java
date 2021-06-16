
package prueba;

public class operaciones {
  private double [] notas;
  private double promedio;
  private int studiantesEncimaPromedio;

    public operaciones(double[] notas, double promedio, int studiantesEncimaPromedio) {
        this.notas = notas;
        this.promedio = promedio;
        this.studiantesEncimaPromedio = studiantesEncimaPromedio;
    }  
    public double[] getNotas() {
        return notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getStudiantesEncimaPromedio() {
        return studiantesEncimaPromedio;
    }
  
    
}
