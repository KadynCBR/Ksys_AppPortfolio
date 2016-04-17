package xyz.ksystems.appspace.k_systemsportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View thisview = inflater.inflate(R.layout.fragment_main, container, false);


        Button btnPopularMovies = (Button) thisview.findViewById(R.id.btnPopularMovies);
        btnPopularMovies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(thisview.getContext(), "This will launch Popular Movies App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnStockHawk = (Button) thisview.findViewById(R.id.btnStockHawk);
        btnStockHawk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(thisview.getContext(), "This will launch Stock Hawk App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnBuild = (Button) thisview.findViewById(R.id.btnBuild);
        btnBuild.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(thisview.getContext(), "This will launch Build It Bigger App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnMaterialism = (Button) thisview.findViewById(R.id.btnMaterialism);
        btnMaterialism.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(thisview.getContext(), "This will launch Materialism App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnUbiquitous = (Button) thisview.findViewById(R.id.btnUbiquitous);
        btnUbiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(thisview.getContext(), "This will launch Ubiquitous App", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnMiniATC = (Button) thisview.findViewById(R.id.btnMiniATC);
        btnMiniATC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(thisview.getContext(), "This will launch MiniATC App", Toast.LENGTH_SHORT).show();
            }
        });

        return thisview;
    }
}
