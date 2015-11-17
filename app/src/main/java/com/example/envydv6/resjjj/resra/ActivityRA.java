package com.example.envydv6.resjjj.resra;

import android.hardware.SensorManager;
import android.location.LocationListener;
import android.widget.Toast;

import com.example.envydv6.resjjj.R;
import com.wikitude.architect.ArchitectView;
import com.wikitude.architect.StartupConfiguration;

public class ActivityRA extends AbstractArchitectCamActivity{
    /**
     * last time the calibration toast was shown, this avoids too many toast shown when compass needs calibration
     */
    private long lastCalibrationToastShownTimeMillis = System.currentTimeMillis();

    /*@Override
    public String getARchitectWorldPath() {
        return "samples/4_Point$Of$Interest_1_Poi$At$Location/index.html";
    }*/
    @Override
    public String getARchitectWorldPath() {
        return "samples/1_Client$Recognition_1_Image$On$Target/index.html";
    }

    @Override
    public String getActivityTitle() {
        return  "Test-World";
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_ra;
    }

    @Override
    public int getArchitectViewId() {
        return R.id.architectView;
    }

    @Override
    public String getWikitudeSDKLicenseKey() {
        return WikitudeSDKConstants.WIKITUDE_SDK_KEY;
    }

    @Override
    public ArchitectView.SensorAccuracyChangeListener getSensorAccuracyListener() {
        return new ArchitectView.SensorAccuracyChangeListener() {
            @Override
            public void onCompassAccuracyChanged( int accuracy ) {
				/* UNRELIABLE = 0, LOW = 1, MEDIUM = 2, HIGH = 3 */
                if ( accuracy < SensorManager.SENSOR_STATUS_ACCURACY_MEDIUM && ActivityRA.this != null && !ActivityRA.this.isFinishing() && System.currentTimeMillis() - ActivityRA.this.lastCalibrationToastShownTimeMillis > 5 * 1000) {
                    Toast.makeText( ActivityRA.this, R.string.compass_accuracy_low, Toast.LENGTH_LONG ).show();
                    ActivityRA.this.lastCalibrationToastShownTimeMillis = System.currentTimeMillis();
                }
            }
        };
    }

    @Override
    public ArchitectView.ArchitectUrlListener getUrlListener() {
        return new ArchitectView.ArchitectUrlListener() {

            @Override
            public boolean urlWasInvoked(String uriString) {

                return true;
            }
        };
    }

    @Override
    public ILocationProvider getLocationProvider(final LocationListener locationListener) {
        return new LocationProvider(this, locationListener);
    }

    @Override
    public float getInitialCullingDistanceMeters() {
        // you need to adjust this in case your POIs are more than 50km away from user here while loading or in JS code (compare 'AR.context.scene.cullingDistance')
        return ArchitectViewHolderInterface.CULLING_DISTANCE_DEFAULT_METERS;
    }

    @Override
    protected boolean hasGeo() {
        return true;
    }

    @Override
    protected boolean hasIR() {
        return false;
    }

    @Override
    protected StartupConfiguration.CameraPosition getCameraPosition() {
        return StartupConfiguration.CameraPosition.DEFAULT;
    }
}
