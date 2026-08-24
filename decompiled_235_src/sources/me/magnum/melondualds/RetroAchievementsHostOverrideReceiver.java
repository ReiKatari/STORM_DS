package me.magnum.melondualds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RetroAchievementsHostOverrideReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        en5 c;
        Object em5Var;
        boolean z;
        context.getClass();
        intent.getClass();
        SharedPreferences a = v15.a(context.getApplicationContext());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 263098673) {
                if (hashCode == 938132102 && action.equals("me.magnum.melondualds.action.SET_RETROACHIEVEMENTS_HOST_OVERRIDE")) {
                    Set set = fn5.a;
                    a.getClass();
                    Object c0 = ej2.c0(intent.getStringExtra("host"));
                    Throwable a2 = hm5.a(c0);
                    if (a2 == null) {
                        ik7 ik7Var = (ik7) c0;
                        if (fn5.c(a).b == ln5.RA_OFFLINE_PROXY) {
                            z = true;
                        } else {
                            z = false;
                        }
                        SharedPreferences.Editor putLong = a.edit().putBoolean("ra_offline_proxy_external_active", true).putString("ra_offline_proxy_client_host", ik7Var.a).putLong("ra_endpoint_generation", fn5.b(a));
                        if (!z && a.getBoolean("ra_hardcore_enabled", false)) {
                            putLong.putBoolean("ra_proxy_hardcore_restore_pending", true).putBoolean("ra_hardcore_enabled", false);
                        }
                        if (putLong.commit()) {
                            em5Var = fn5.c(a);
                        } else {
                            i.m("Could not persist RAOfflineProxy activation");
                            return;
                        }
                    } else {
                        em5Var = new em5(a2);
                    }
                    if (!(em5Var instanceof em5)) {
                        fn5.a((en5) em5Var, "external_set");
                    }
                    Throwable a3 = hm5.a(em5Var);
                    if (a3 != null) {
                        Log.w("RAHostOverrideReceiver", "Rejected RAOfflineProxy host: " + a3.getMessage());
                        return;
                    }
                    return;
                }
            } else if (action.equals("me.magnum.melondualds.action.CLEAR_RETROACHIEVEMENTS_HOST_OVERRIDE")) {
                Set set2 = fn5.a;
                a.getClass();
                if (!a.getBoolean("ra_offline_proxy_external_active", false) && !a.contains("ra_offline_proxy_client_host")) {
                    c = fn5.c(a);
                } else {
                    kn5 kn5Var = ln5.Companion;
                    ln5 ln5Var = ln5.BUILT_IN;
                    String string = a.getString("ra_offline_backend", ln5Var.getPreferenceValue());
                    kn5Var.getClass();
                    ln5 a4 = kn5.a(string);
                    SharedPreferences.Editor putLong2 = a.edit().putBoolean("ra_offline_proxy_external_active", false).remove("ra_offline_proxy_client_host").putLong("ra_endpoint_generation", fn5.b(a));
                    if (a4 == ln5Var) {
                        putLong2.getClass();
                        if (a.getBoolean("ra_proxy_hardcore_restore_pending", false) && !a.getBoolean("ra_hardcore_enabled", false)) {
                            putLong2.putBoolean("ra_hardcore_enabled", true);
                        }
                        putLong2.remove("ra_proxy_hardcore_restore_pending");
                    }
                    if (putLong2.commit()) {
                        c = fn5.c(a);
                    } else {
                        i.m("Could not persist RAOfflineProxy clear");
                        return;
                    }
                }
                fn5.a(c, "external_clear");
                return;
            }
        }
        Log.w("RAHostOverrideReceiver", "Ignored unsupported action");
    }
}
