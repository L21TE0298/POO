/*NO OLVIDEN CAMBIAR EL PACKAGE*/
package universidad;

public abstract class Persona {

    private String curp;
    private String nombre;
    private String fechaDeAlta;
    private short diasAsistidos;
    private float apoyoEconomico;

    Persona() {
        this("sin Curp", "Sin nombre", "Sin fecha", (short) 1, (float) 1);
    }

    public Persona(String curp, String nombre, String alta, short dias, float apoyoEconomico) {
        setCurp(curp);
        setNombre(nombre);
        setFechaDeAlta(alta);
        setDiasAsistidos(dias);
        setApoyoEconomico(apoyoEconomico);
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(String fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public short getDiasAsistidos() {
        return diasAsistidos;
    }

    public void setDiasAsistidos(short diasAsistidos) {
        this.diasAsistidos = diasAsistidos;
    }

    public float getApoyoEconomico() {
        return apoyoEconomico;
    }

    public void setApoyoEconomico(float apoyoEconomico) {
        this.apoyoEconomico = apoyoEconomico;
    }
    /*Se establecen Metodos Abstractos*/
    public abstract double apoyoEconomico();
    /**/

    /**
     *
     * @return
     */

    public abstract double bonoPuntualidad();

}
