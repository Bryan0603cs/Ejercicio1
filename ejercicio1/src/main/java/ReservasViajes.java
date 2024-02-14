import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class ReservasViajes {
    private LocalDate fechaSalida;
    private String duracionViajeDias;
    private Collection<ActividadPlaneada> actividadesPlaneadas = new LinkedList<>();
    private String dietasEspeciales;
    private String preferenciaTransporte;
    private String tipoAlojamiento;

    
    public ReservasViajes(LocalDate fechaSalida, String duracionViajeDias, String dietasEspeciales, String preferenciaTransporte, String tipoAlojamiento, Collection<ActividadPlaneada> actividades) {
        this.actividadesPlaneadas.addAll(actividades);
        this.dietasEspeciales = dietasEspeciales;
        this.fechaSalida = fechaSalida;
        this.duracionViajeDias = duracionViajeDias;
        this.preferenciaTransporte = preferenciaTransporte;
        this.tipoAlojamiento = tipoAlojamiento;
    }

    
    public void agregarActividad(ActividadPlaneada actividad) {
        actividadesPlaneadas.add(actividad);
    }

    public void eliminarActividad(ActividadPlaneada actividad) {
        actividadesPlaneadas.remove(actividad);
    }

    public void modificarActividad(ActividadPlaneada actividadExistente, ActividadPlaneada nuevaActividad) {
        if (actividadesPlaneadas.contains(actividadExistente)) {
            actividadesPlaneadas.remove(actividadExistente);
            actividadesPlaneadas.add(nuevaActividad);
        } else {
            System.out.println("La actividad no existe en la colección.");
        }
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public String getDuracionViajeDias() {
        return duracionViajeDias;
    }

    public String getDietasEspeciales() {
        return dietasEspeciales;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setDuracionViajeDias(String duracionViajeDias) {
        this.duracionViajeDias = duracionViajeDias;
    }

    public void setDietasEspeciales(String dietasEspeciales) {
        this.dietasEspeciales = dietasEspeciales;
    }

    public String getPreferenciaTransporte() {
        return preferenciaTransporte;
    }

    public void setPreferenciaTransporte(String preferenciaTransporte) {
        this.preferenciaTransporte = preferenciaTransporte;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

}
