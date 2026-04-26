/**
 * Modulo de seguridad de una expedicion, 
 * 1 a 4 buen tiempo, 5 a 6 precaucion, 7 a 8 alerta, 9 a 10 cancelar mision
 * 
 * @Autor(Maximo Zalazar)
 * version 1.0
 */

public class Modulo_Seguridad
{
    private int estado;//0 nulo, 1 a 4 buen tiempo, 5 a 6 precaucion, 7 a 8 alerta, 9 a 10 cancelar mision
    private Modulo_Seguridad()
    {
        estado = 0;
    }
    
    public void setModuloSeguridad(int estado)
    {
        try
        {
            if (estado == 0)
                throw new IllegalArgumentException("Estado nulo.\n");
            else if (estado <= 1 && estado >= 10)
                this.estado = estado;
            else 
                throw new IllegalArgumentException("Estado no parametrado.\n");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Por favor, revise el modulo de seguridad en caso de estar dañado o revise los datos cargados.\n" + e.getMessage());
        }
    }
    
    public int getModuloSeguridad()
    {
        return this.estado;
    }
}
