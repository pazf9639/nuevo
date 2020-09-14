package mx.com.example.facebook;

import android.widget.ImageView;

public class Color {
    private String nombre;
    private String apellido;
    private String descripcion;
    private ImageView imagen;

    public Color() {

    }
    public Color(String nombre, String apellido, String descripcion) {
this.nombre=nombre;
this.apellido=apellido;
this.descripcion=descripcion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

}
