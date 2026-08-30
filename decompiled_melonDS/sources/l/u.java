package l;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends b4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8443c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f8444d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, Context context) {
        super(xVar);
        this.f8444d = xVar;
        this.f8445e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // b4.b
    public final IntentFilter d() {
        switch (this.f8443c) {
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

    @Override // b4.b
    public final int f() {
        Location location;
        boolean z10;
        long j2;
        Location location2;
        switch (this.f8443c) {
            case 0:
                if (q.a((PowerManager) this.f8445e)) {
                    return 2;
                }
                return 1;
            default:
                a4.n nVar = (a4.n) this.f8445e;
                g0 g0Var = (g0) nVar.R;
                LocationManager locationManager = (LocationManager) nVar.L;
                if (g0Var.f8419b > System.currentTimeMillis()) {
                    z10 = g0Var.f8418a;
                } else {
                    Context context = (Context) nVar.B;
                    Location location3 = null;
                    if (d0.d.L(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
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
                    if (d0.d.L(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z10 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (f0.f8413e == null) {
                            f0.f8413e = new f0();
                        }
                        f0 f0Var = f0.f8413e;
                        f0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        f0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (f0Var.f8415b == 1) {
                            z10 = true;
                        }
                        long j10 = f0Var.f8417d;
                        long j11 = f0Var.f8416c;
                        f0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j12 = f0Var.f8417d;
                        if (j10 != -1 && j11 != -1) {
                            if (currentTimeMillis > j11) {
                                j10 = j12;
                            } else if (currentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j2 = j10 + 60000;
                        } else {
                            j2 = currentTimeMillis + 43200000;
                        }
                        g0Var.f8418a = z10;
                        g0Var.f8419b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // b4.b
    public final void o() {
        switch (this.f8443c) {
            case 0:
                this.f8444d.n(true, true);
                return;
            default:
                this.f8444d.n(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar, a4.n nVar) {
        super(xVar);
        this.f8444d = xVar;
        this.f8445e = nVar;
    }
}
