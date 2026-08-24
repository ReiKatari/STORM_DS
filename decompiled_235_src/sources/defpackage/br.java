package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br  reason: default package */
/* loaded from: classes.dex */
public final class br extends d2 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ fr d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(fr frVar, Context context) {
        super(frVar);
        this.d = frVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.d2
    public final IntentFilter e() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.d2
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (xq.a((PowerManager) obj)) {
                    return 2;
                }
                return 1;
            default:
                m44 m44Var = (m44) obj;
                ck ckVar = (ck) m44Var.R;
                LocationManager locationManager = (LocationManager) m44Var.L;
                if (ckVar.b > System.currentTimeMillis()) {
                    z = ckVar.a;
                } else {
                    Context context = (Context) m44Var.B;
                    Location location3 = null;
                    if (mp2.p(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (mp2.p(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (tc7.e == null) {
                            tc7.e = new tc7();
                        }
                        tc7 tc7Var = tc7.e;
                        tc7Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        tc7Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (tc7Var.b == 1) {
                            z = true;
                        }
                        long j2 = tc7Var.d;
                        long j3 = tc7Var.c;
                        tc7Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = tc7Var.d;
                        if (j2 != -1 && j3 != -1) {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        } else {
                            j = currentTimeMillis + 43200000;
                        }
                        ckVar.a = z;
                        ckVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    @Override // defpackage.d2
    public final void p() {
        int i = this.c;
        fr frVar = this.d;
        switch (i) {
            case 0:
                frVar.q(true, true);
                return;
            default:
                frVar.q(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(fr frVar, m44 m44Var) {
        super(frVar);
        this.d = frVar;
        this.e = m44Var;
    }
}
