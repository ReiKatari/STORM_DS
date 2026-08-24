package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl0  reason: default package */
/* loaded from: classes.dex */
public final class hl0 implements pb7 {
    public final s63 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final wr0 e;
    public final wr0 f;
    public final int g;

    public hl0(Context context, wr0 wr0Var, wr0 wr0Var2) {
        xd3 xd3Var = new xd3();
        d90.n0.configure(xd3Var);
        xd3Var.d = true;
        this.a = new s63(xd3Var, 2);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(fa0.c);
        this.e = wr0Var2;
        this.f = wr0Var;
        this.g = 40000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(i61.m("Invalid url: ", str), e);
        }
    }

    public final hy a(hy hyVar) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        pa c = hyVar.c();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap = (HashMap) c.Z;
        if (hashMap != null) {
            hashMap.put("sdk-version", String.valueOf(i));
            c.b("model", Build.MODEL);
            c.b("hardware", Build.HARDWARE);
            c.b("device", Build.DEVICE);
            c.b("product", Build.PRODUCT);
            c.b("os-uild", Build.ID);
            c.b("manufacturer", Build.MANUFACTURER);
            c.b("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            HashMap hashMap2 = (HashMap) c.Z;
            if (hashMap2 != null) {
                hashMap2.put("tz-offset", String.valueOf(offset));
                if (activeNetworkInfo == null) {
                    type = se4.NONE.getValue();
                } else {
                    type = activeNetworkInfo.getType();
                }
                HashMap hashMap3 = (HashMap) c.Z;
                if (hashMap3 != null) {
                    hashMap3.put("net-type", String.valueOf(type));
                    int i2 = -1;
                    if (activeNetworkInfo == null) {
                        subtype = re4.UNKNOWN_MOBILE_SUBTYPE.getValue();
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            subtype = re4.COMBINED.getValue();
                        } else if (re4.forNumber(subtype) == null) {
                            subtype = 0;
                        }
                    }
                    HashMap hashMap4 = (HashMap) c.Z;
                    if (hashMap4 != null) {
                        hashMap4.put("mobile-subtype", String.valueOf(subtype));
                        c.b("country", Locale.getDefault().getCountry());
                        c.b("locale", Locale.getDefault().getLanguage());
                        Context context = this.c;
                        c.b("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                        try {
                            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Unable to find version code for package", e);
                        }
                        c.b("application_build", Integer.toString(i2));
                        return c.f();
                    }
                    i.m("Property \"autoMetadata\" has not been set");
                    return null;
                }
                i.m("Property \"autoMetadata\" has not been set");
                return null;
            }
            i.m("Property \"autoMetadata\" has not been set");
            return null;
        }
        i.m("Property \"autoMetadata\" has not been set");
        return null;
    }
}
