package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cr  reason: default package */
/* loaded from: classes.dex */
public final class cr extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public cr(uk1 uk1Var) {
        this.a = 2;
        this.b = uk1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d2) obj).p();
                return;
            case 1:
                context.getClass();
                intent.getClass();
                w30 w30Var = (w30) obj;
                switch (w30Var.h) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            ga0.f().b(x30.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        w30Var.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        w30Var.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        w30Var.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        w30Var.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    case 1:
                        if (intent.getAction() != null) {
                            ga0 f = ga0.f();
                            String str = y30.a;
                            f.b(str, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        w30Var.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    w30Var.f(Boolean.TRUE);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        if (intent.getAction() != null) {
                            ga0 f2 = ga0.f();
                            String str2 = cr6.a;
                            f2.b(str2, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        w30Var.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    w30Var.f(Boolean.FALSE);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                }
            default:
                uk1 uk1Var = (uk1) obj;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if ("android.intent.action.AIRPLANE_MODE".equals(action4)) {
                        if (intent.hasExtra("state")) {
                            boolean booleanExtra = intent.getBooleanExtra("state", false);
                            sk1 sk1Var = (sk1) uk1Var.j;
                            sk1Var.sendMessage(sk1Var.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                            return;
                        }
                        return;
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action4)) {
                        StringBuilder sb = ck7.a;
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        sk1 sk1Var2 = (sk1) uk1Var.j;
                        sk1Var2.sendMessage(sk1Var2.obtainMessage(9, activeNetworkInfo));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ cr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
