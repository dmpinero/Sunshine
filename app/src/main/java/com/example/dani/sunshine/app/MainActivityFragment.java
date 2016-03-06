package com.example.dani.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Crear fake data
        String[] forecastArray = {
                "Hoy - Soleado - 06/22",
                "Mañana - Soleado - 09-21",
                "Lunes - Soleado - 06/22",
                "Martes - Soleado - 06/22",
                "Miércoles - Soleado - 06/22",
                "Jueves - Soleado - 06/22",
                "Viernes - Soleado - 06/22",
                "Sábado - Soleado - 06/22",
                "Domingo - Soleado - 06/22",
                "Lunes 05 - Soleado - 06/22",
                "Martes 06 - Soleado - 06/22",
                "Miércoles 07 - Soleado - 06/22"
        };

        // Obtener vista del padre
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Crear ArrayList con la lista de datos
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        System.out.println(weekForecast);

        // Crear adapter
        ArrayAdapter<String> foreCastAdapter =
                new ArrayAdapter<String>(getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        weekForecast);

        // Vincular (binding) adapter a listview
        ListView myListView = (ListView) rootView.findViewById(R.id.listview_forecast);
        myListView.setAdapter(foreCastAdapter);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
