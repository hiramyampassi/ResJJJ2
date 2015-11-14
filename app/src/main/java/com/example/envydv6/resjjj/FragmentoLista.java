package com.example.envydv6.resjjj;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Fragmento que permite al usuario insertar un nueva meta
 */
public class FragmentoLista extends Fragment {
    /**
     * Etiqueta para depuración
     */
    private static final String TAG = FragmentoLista.class.getSimpleName();

    /*
    Instancias de Views
     */
    private ImageView cabecera;
    private TextView titulo;
    private TextView descripcion;
    private TextView prioridad;
    private TextView fechaLim;
    private TextView categoria;
    private ImageButton editButton;

    public FragmentoLista() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Habilitar al fragmento para contribuir en la action bar
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflando layout del fragmento
        View v = inflater.inflate(R.layout.fragmento_detalle, container, false);

        cabecera = (ImageView) v.findViewById(R.id.cabecera);
        titulo = (TextView) v.findViewById(R.id.titulo);
        descripcion = (TextView) v.findViewById(R.id.descripcion);
        prioridad = (TextView) v.findViewById(R.id.prioridad);
        fechaLim = (TextView) v.findViewById(R.id.fecha);
        categoria = (TextView) v.findViewById(R.id.categoria);

        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        // Remover el action button de borrar
        menu.removeItem(R.id.action_delete);
    }

}

