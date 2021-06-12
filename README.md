# Mobile Computing Lab Task - 14

## Question

```
Integrate google maps with your android application.
The maps should have a marker of your home/area/nearbyspot near home
The title of marker should be your name
```

<br/>

## Solution

### [MapsActivity.java :](./MyApplication/app/src/main/java/com/example/myapplication/MapsActivity.java)

```
package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng marker = new LatLng(33.9705881,71.3978144);
        mMap.addMarker(new MarkerOptions().position(marker).title("Mustafa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(marker));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 13.0f ) );
    }
}
```

<br/>

## Screenshot

<br/>

<div align="center">
    <a href="screenshot.png">
        <img src="screenshot.png" alt="screenshot[0]" height="400px">
    </a>
</div>
