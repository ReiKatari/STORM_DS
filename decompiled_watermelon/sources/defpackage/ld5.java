package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ld5  reason: default package */
/* loaded from: classes.dex */
public abstract class ld5 {
    public static final Set a = nu.H0(new String[]{"ra_offline_backend", "ra_offline_proxy_external_active", "ra_offline_proxy_client_host", "ra_endpoint_generation", "ra_hardcore_enabled", "ra_offline_softcore_enabled"});

    public static void a(kd5 kd5Var, String str) {
        String str2;
        boolean z;
        kd5Var.getClass();
        String name = kd5Var.a.name();
        String name2 = kd5Var.b.name();
        jd5 jd5Var = kd5Var.c;
        String lowerCase = jd5Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (jd5Var == jd5.OFFICIAL) {
            str2 = "official";
        } else {
            str2 = "loopback-redacted";
        }
        boolean z2 = kd5Var.h;
        boolean z3 = kd5Var.i;
        if (kd5Var.e != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder v = b31.v("reason=", str, " backendSelected=", name, " backendEffective=");
        b31.B(v, name2, " hostSource=", lowerCase, " host=");
        v.append(str2);
        v.append(" builtInLedgerEnabled=");
        v.append(z2);
        v.append(" builtInSyncEnabled=");
        v.append(z3);
        v.append(" nativeClientHostConfigured=");
        v.append(z);
        Log.i("RAEndpoint", v.toString());
    }

    public static long b(SharedPreferences sharedPreferences) {
        long j = sharedPreferences.getLong("ra_endpoint_generation", 0L);
        if (j == Long.MAX_VALUE) {
            return 1L;
        }
        return j + 1;
    }

    public static kd5 c(SharedPreferences sharedPreferences) {
        qd5 qd5Var;
        l67 l67Var;
        boolean z;
        boolean z2;
        jd5 jd5Var;
        String str;
        String str2;
        String str3;
        pd5 pd5Var = qd5.Companion;
        qd5 qd5Var2 = qd5.BUILT_IN;
        String string = sharedPreferences.getString("ra_offline_backend", qd5Var2.getPreferenceValue());
        pd5Var.getClass();
        qd5 a2 = pd5.a(string);
        boolean z3 = sharedPreferences.getBoolean("ra_offline_proxy_external_active", false);
        if (z3) {
            qd5Var = qd5.RA_OFFLINE_PROXY;
        } else {
            qd5Var = a2;
        }
        String string2 = sharedPreferences.getString("ra_offline_proxy_client_host", null);
        if (string2 != null) {
            Object b0 = ve2.b0(string2);
            if (b0 instanceof kc5) {
                b0 = null;
            }
            l67Var = (l67) b0;
        } else {
            l67Var = null;
        }
        if (qd5Var == qd5.RA_OFFLINE_PROXY && l67Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (qd5Var == qd5Var2 && sharedPreferences.getBoolean("ra_offline_softcore_enabled", true)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (qd5Var == qd5Var2) {
            jd5Var = jd5.OFFICIAL;
        } else if (z) {
            jd5Var = jd5.RA_OFFLINE_PROXY;
        } else {
            jd5Var = jd5.RA_OFFLINE_PROXY_UNAVAILABLE;
        }
        if (qd5Var == qd5Var2) {
            str = "https://retroachievements.org/dorequest.php";
        } else if (l67Var != null) {
            str = l67Var.b;
        } else {
            str = null;
        }
        if (qd5Var == qd5Var2) {
            str3 = "https://retroachievements.org";
        } else if (l67Var != null) {
            str3 = l67Var.a;
        } else {
            str2 = null;
            return new kd5(a2, qd5Var, jd5Var, str, str2, sharedPreferences.getLong("ra_endpoint_generation", 0L), z3, z2, z2);
        }
        str2 = str3;
        return new kd5(a2, qd5Var, jd5Var, str, str2, sharedPreferences.getLong("ra_endpoint_generation", 0L), z3, z2, z2);
    }
}
