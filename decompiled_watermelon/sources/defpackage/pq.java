package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pq  reason: default package */
/* loaded from: classes.dex */
public final class pq extends b2 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ tq d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(tq tqVar, Context context) {
        super(tqVar);
        this.d = tqVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.b2
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

    @Override // defpackage.b2
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (lq.a((PowerManager) obj)) {
                    return 2;
                }
                return 1;
            default:
                n85 n85Var = (n85) obj;
                qj qjVar = (qj) n85Var.R;
                LocationManager locationManager = (LocationManager) n85Var.L;
                if (qjVar.b > System.currentTimeMillis()) {
                    z = qjVar.a;
                } else {
                    Context context = (Context) n85Var.B;
                    Location location3 = null;
                    if (nk2.u(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (nk2.u(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (yy6.e == null) {
                            yy6.e = new yy6();
                        }
                        yy6 yy6Var = yy6.e;
                        yy6Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        yy6Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (yy6Var.b == 1) {
                            z = true;
                        }
                        long j2 = yy6Var.d;
                        long j3 = yy6Var.c;
                        yy6Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = yy6Var.d;
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
                        qjVar.a = z;
                        qjVar.b = j;
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

    @Override // defpackage.b2
    public final void p() {
        int i = this.c;
        tq tqVar = this.d;
        switch (i) {
            case 0:
                tqVar.l(true, true);
                return;
            default:
                tqVar.l(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(tq tqVar, n85 n85Var) {
        super(tqVar);
        this.d = tqVar;
        this.e = n85Var;
    }
}
