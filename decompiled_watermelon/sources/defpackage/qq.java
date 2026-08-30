package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qq  reason: default package */
/* loaded from: classes.dex */
public final class qq extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public qq(qg1 qg1Var) {
        this.a = 2;
        this.b = qg1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b2) obj).p();
                return;
            case 1:
                context.getClass();
                intent.getClass();
                b20 b20Var = (b20) obj;
                switch (b20Var.h) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            y70.f().b(c20.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        b20Var.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        b20Var.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        b20Var.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        b20Var.f(Boolean.TRUE);
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
                            y70 f = y70.f();
                            String str = d20.a;
                            f.b(str, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        b20Var.f(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    b20Var.f(Boolean.TRUE);
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
                            y70 f2 = y70.f();
                            String str2 = mf6.a;
                            f2.b(str2, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        b20Var.f(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    b20Var.f(Boolean.FALSE);
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
                qg1 qg1Var = (qg1) obj;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if ("android.intent.action.AIRPLANE_MODE".equals(action4)) {
                        if (intent.hasExtra("state")) {
                            boolean booleanExtra = intent.getBooleanExtra("state", false);
                            og1 og1Var = (og1) qg1Var.j;
                            og1Var.sendMessage(og1Var.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                            return;
                        }
                        return;
                    } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action4)) {
                        StringBuilder sb = e67.a;
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                        og1 og1Var2 = (og1) qg1Var.j;
                        og1Var2.sendMessage(og1Var2.obtainMessage(9, activeNetworkInfo));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ qq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
