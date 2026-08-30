package me.magnum.melondualds;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RetroAchievementsHostOverrideReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kd5 c;
        Object kc5Var;
        boolean z;
        context.getClass();
        intent.getClass();
        SharedPreferences a = ts4.a(context.getApplicationContext());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 263098673) {
                if (hashCode == 938132102 && action.equals("me.magnum.melondualds.action.SET_RETROACHIEVEMENTS_HOST_OVERRIDE")) {
                    Set set = ld5.a;
                    a.getClass();
                    Object b0 = ve2.b0(intent.getStringExtra("host"));
                    Throwable a2 = nc5.a(b0);
                    if (a2 == null) {
                        l67 l67Var = (l67) b0;
                        if (ld5.c(a).b == qd5.RA_OFFLINE_PROXY) {
                            z = true;
                        } else {
                            z = false;
                        }
                        SharedPreferences.Editor putLong = a.edit().putBoolean("ra_offline_proxy_external_active", true).putString("ra_offline_proxy_client_host", l67Var.a).putLong("ra_endpoint_generation", ld5.b(a));
                        if (!z && a.getBoolean("ra_hardcore_enabled", false)) {
                            putLong.putBoolean("ra_proxy_hardcore_restore_pending", true).putBoolean("ra_hardcore_enabled", false);
                        }
                        if (putLong.commit()) {
                            kc5Var = ld5.c(a);
                        } else {
                            i.n("Could not persist RAOfflineProxy activation");
                            return;
                        }
                    } else {
                        kc5Var = new kc5(a2);
                    }
                    if (!(kc5Var instanceof kc5)) {
                        ld5.a((kd5) kc5Var, "external_set");
                    }
                    Throwable a3 = nc5.a(kc5Var);
                    if (a3 != null) {
                        Log.w("RAHostOverrideReceiver", "Rejected RAOfflineProxy host: " + a3.getMessage());
                        return;
                    }
                    return;
                }
            } else if (action.equals("me.magnum.melondualds.action.CLEAR_RETROACHIEVEMENTS_HOST_OVERRIDE")) {
                Set set2 = ld5.a;
                a.getClass();
                if (!a.getBoolean("ra_offline_proxy_external_active", false) && !a.contains("ra_offline_proxy_client_host")) {
                    c = ld5.c(a);
                } else {
                    pd5 pd5Var = qd5.Companion;
                    qd5 qd5Var = qd5.BUILT_IN;
                    String string = a.getString("ra_offline_backend", qd5Var.getPreferenceValue());
                    pd5Var.getClass();
                    qd5 a4 = pd5.a(string);
                    SharedPreferences.Editor putLong2 = a.edit().putBoolean("ra_offline_proxy_external_active", false).remove("ra_offline_proxy_client_host").putLong("ra_endpoint_generation", ld5.b(a));
                    if (a4 == qd5Var) {
                        putLong2.getClass();
                        if (a.getBoolean("ra_proxy_hardcore_restore_pending", false) && !a.getBoolean("ra_hardcore_enabled", false)) {
                            putLong2.putBoolean("ra_hardcore_enabled", true);
                        }
                        putLong2.remove("ra_proxy_hardcore_restore_pending");
                    }
                    if (putLong2.commit()) {
                        c = ld5.c(a);
                    } else {
                        i.n("Could not persist RAOfflineProxy clear");
                        return;
                    }
                }
                ld5.a(c, "external_clear");
                return;
            }
        }
        Log.w("RAHostOverrideReceiver", "Ignored unsupported action");
    }
}
