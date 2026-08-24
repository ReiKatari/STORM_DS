package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fn5  reason: default package */
/* loaded from: classes.dex */
public abstract class fn5 {
    public static final Set a = fv.V0(new String[]{"ra_offline_backend", "ra_offline_proxy_external_active", "ra_offline_proxy_client_host", "ra_endpoint_generation", "ra_hardcore_enabled", "ra_offline_softcore_enabled"});

    public static void a(en5 en5Var, String str) {
        String str2;
        boolean z;
        en5Var.getClass();
        String name = en5Var.a.name();
        String name2 = en5Var.b.name();
        dn5 dn5Var = en5Var.c;
        String lowerCase = dn5Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (dn5Var == dn5.OFFICIAL) {
            str2 = "official";
        } else {
            str2 = "loopback-redacted";
        }
        boolean z2 = en5Var.h;
        boolean z3 = en5Var.i;
        if (en5Var.e != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder u = i61.u("reason=", str, " backendSelected=", name, " backendEffective=");
        i61.B(u, name2, " hostSource=", lowerCase, " host=");
        u.append(str2);
        u.append(" builtInLedgerEnabled=");
        u.append(z2);
        u.append(" builtInSyncEnabled=");
        u.append(z3);
        u.append(" nativeClientHostConfigured=");
        u.append(z);
        Log.i("RAEndpoint", u.toString());
    }

    public static long b(SharedPreferences sharedPreferences) {
        long j = sharedPreferences.getLong("ra_endpoint_generation", 0L);
        if (j == Long.MAX_VALUE) {
            return 1L;
        }
        return j + 1;
    }

    public static en5 c(SharedPreferences sharedPreferences) {
        ln5 ln5Var;
        ik7 ik7Var;
        boolean z;
        boolean z2;
        dn5 dn5Var;
        String str;
        String str2;
        String str3;
        kn5 kn5Var = ln5.Companion;
        ln5 ln5Var2 = ln5.BUILT_IN;
        String string = sharedPreferences.getString("ra_offline_backend", ln5Var2.getPreferenceValue());
        kn5Var.getClass();
        ln5 a2 = kn5.a(string);
        boolean z3 = sharedPreferences.getBoolean("ra_offline_proxy_external_active", false);
        if (z3) {
            ln5Var = ln5.RA_OFFLINE_PROXY;
        } else {
            ln5Var = a2;
        }
        String string2 = sharedPreferences.getString("ra_offline_proxy_client_host", null);
        if (string2 != null) {
            Object c0 = ej2.c0(string2);
            if (c0 instanceof em5) {
                c0 = null;
            }
            ik7Var = (ik7) c0;
        } else {
            ik7Var = null;
        }
        if (ln5Var == ln5.RA_OFFLINE_PROXY && ik7Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (ln5Var == ln5Var2 && sharedPreferences.getBoolean("ra_offline_softcore_enabled", true)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ln5Var == ln5Var2) {
            dn5Var = dn5.OFFICIAL;
        } else if (z) {
            dn5Var = dn5.RA_OFFLINE_PROXY;
        } else {
            dn5Var = dn5.RA_OFFLINE_PROXY_UNAVAILABLE;
        }
        if (ln5Var == ln5Var2) {
            str = "https://retroachievements.org/dorequest.php";
        } else if (ik7Var != null) {
            str = ik7Var.b;
        } else {
            str = null;
        }
        if (ln5Var == ln5Var2) {
            str3 = "https://retroachievements.org";
        } else if (ik7Var != null) {
            str3 = ik7Var.a;
        } else {
            str2 = null;
            return new en5(a2, ln5Var, dn5Var, str, str2, sharedPreferences.getLong("ra_endpoint_generation", 0L), z3, z2, z2);
        }
        str2 = str3;
        return new en5(a2, ln5Var, dn5Var, str, str2, sharedPreferences.getLong("ra_endpoint_generation", 0L), z3, z2, z2);
    }
}
