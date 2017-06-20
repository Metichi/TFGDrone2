package es.p32gocamuco.tfgdrone;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap gMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;

    }

    public void encontrarMando(View view) {
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        Location phone_location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
        LatLng phone_latlng = new LatLng(phone_location.getLatitude(),phone_location.getLongitude());

        gMap.animateCamera(CameraUpdateFactory.newLatLngZoom(phone_latlng,(float) 17));
        gMap.addMarker(new MarkerOptions().position(phone_latlng).title("Control remoto"));
    }

    public void settingsMenu(View view){
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }
}
