package com.example.envydv6.resjjj;

import com.example.envydv6.resjjj.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Comida(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> BEBIDAS = new ArrayList<>();
    public static final List<Comida> POSTRES = new ArrayList<>();
    public static final List<Comida> PLATILLOS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida(8f, "Flan Celestial", R.drawable.flan_celestial));
        COMIDAS_POPULARES.add(new Comida(25f, "Silpancho", R.drawable.pl_silpancho));
        COMIDAS_POPULARES.add(new Comida(28f, "Saice Tarijeño", R.drawable.pl_saicetarijeno));
        COMIDAS_POPULARES.add(new Comida(12f, "Sandwich", R.drawable.sandwich));
        COMIDAS_POPULARES.add(new Comida(34f, "Lomo De Cerdo", R.drawable.lomo_cerdo));

        PLATILLOS.add(new Comida(25f, "Silpancho", R.drawable.pl_silpancho));
        PLATILLOS.add(new Comida(32f, "Pique Macho", R.drawable.pl_piquemacho));
        PLATILLOS.add(new Comida(25f, "Charkecan", R.drawable.pl_charkecan));
        PLATILLOS.add(new Comida(35f, "Chicarron", R.drawable.pl_chicharron));
        PLATILLOS.add(new Comida(25f, "Majadito", R.drawable.pl_majadito));
        PLATILLOS.add(new Comida(28f, "Saice Tarijeño", R.drawable.pl_saicetarijeno));
        PLATILLOS.add(new Comida(32f, "Fricase", R.drawable.pl_fricase));
        PLATILLOS.add(new Comida(10f, "Chairo", R.drawable.s_chairo));
        PLATILLOS.add(new Comida(10f, "Sopa de Mani", R.drawable.s_mani));
        PLATILLOS.add(new Comida(10f, "Sopa de Quinua", R.drawable.s_quinua));

        BEBIDAS.add(new Comida(5f, "Jugo Natural", R.drawable.jugo_natural));
        BEBIDAS.add(new Comida(18f, "Jarra de Naranja", R.drawable.j_naranja));
        BEBIDAS.add(new Comida(3f, "Taza de Café", R.drawable.cafe));
        BEBIDAS.add(new Comida(18f, "Jarra de Piña", R.drawable.j_pina));
        BEBIDAS.add(new Comida(12f, "Coca Cola 2 Lts", R.drawable.j_cocacola));
        BEBIDAS.add(new Comida(12f, "Sprite 2 Lts", R.drawable.j_sprite));

        POSTRES.add(new Comida(2f, "Postre De Vainilla", R.drawable.postre_vainilla));
        POSTRES.add(new Comida(3f, "Flan Celestial", R.drawable.flan_celestial));
        POSTRES.add(new Comida(2.5f, "Cupcake Festival", R.drawable.cupcakes_festival));
        POSTRES.add(new Comida(4f, "Pastel De Fresa", R.drawable.pastel_fresa));
        POSTRES.add(new Comida(5f, "Muffin Amoroso", R.drawable.muffin_amoroso));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}