public class INVESTIGADOR
{
    private String nombre;
    private String rango;
    private String especialidad;

    public INVESTIGADOR()
    {
        nombre = "";
        rango = "";
        especialidad = "";
    }
    public INVESTIGADOR(String nombre, String rango, String especialidad)
    {
        this.nombre = nombre;
        this.rango = rango;
        this.especialidad = especialidad;
    }
    //SETTERS
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setRango(String rango){this.rango = rango;}
    public void setEspecialidad(String especialidad){this.especialidad = especialidad;}
    //GETTERS
    public String getNombre(){return nombre;}
    public String getRango(){return rango;}
    public String getEspecialidad(){return especialidad;}
}