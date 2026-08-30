package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci implements ki0 {
    public final /* synthetic */ int a;
    public final tf6 b;
    public final bd0 c;

    public ci(ct6 ct6Var, tf6 tf6Var, bd0 bd0Var, int i) {
        this.a = i;
        ct6Var.getClass();
        bd0Var.getClass();
        switch (i) {
            case 1:
                this.b = tf6Var;
                this.c = bd0Var;
                return;
            default:
                this.b = tf6Var;
                this.c = bd0Var;
                return;
        }
    }

    @Override // defpackage.ki0
    public final ji0 a(sc0 sc0Var, Map map, qi0 qi0Var) {
        boolean C;
        int i = this.a;
        qp1 qp1Var = qp1.A;
        tf6 tf6Var = this.b;
        bd0 bd0Var = this.c;
        switch (i) {
            case 0:
                k45 k45Var = k45.X;
                sc0Var.getClass();
                map.getClass();
                qi0Var.getClass();
                ArrayList arrayList = bd0Var.d;
                if (arrayList != null) {
                    mg4 mg4Var = (mg4) tq0.e1(((r13) tq0.e1(arrayList)).a.a);
                    InputConfiguration inputConfiguration = new InputConfiguration(mg4Var.a.getWidth(), mg4Var.a.getHeight(), mg4Var.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList2.add((Surface) entry.getValue());
                    }
                    if (!sc0Var.j0(inputConfiguration, arrayList2, qi0Var)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + sc0Var + " for " + qi0Var + '!');
                        qi0Var.b();
                        return k45Var;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    for (Map.Entry entry2 : map.entrySet()) {
                        arrayList3.add((Surface) entry2.getValue());
                    }
                    if (!sc0Var.d(arrayList3, qi0Var)) {
                        Log.w("CXCP", "Failed to create captures session from " + sc0Var + " for " + qi0Var + '!');
                        qi0Var.b();
                        return k45Var;
                    }
                }
                return new ii0(qp1Var, tq5.d(map, tf6Var));
            default:
                k45 k45Var2 = k45.X;
                sc0Var.getClass();
                map.getClass();
                qi0Var.getClass();
                zf4 g = tq5.g(bd0Var, tf6Var, map);
                ArrayList arrayList4 = g.a;
                if (arrayList4.isEmpty()) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + bd0Var);
                    qi0Var.b();
                    return k45Var2;
                }
                ArrayList arrayList5 = bd0Var.d;
                if (arrayList5 == null) {
                    C = sc0Var.i(arrayList4, qi0Var);
                } else {
                    mg4 mg4Var2 = (mg4) tq0.e1(((r13) tq0.e1(arrayList5)).a.a);
                    C = sc0Var.C(new g03(mg4Var2.a.getWidth(), mg4Var2.a.getHeight(), mg4Var2.b), arrayList4, qi0Var);
                }
                if (!C) {
                    Log.w("CXCP", "Failed to create capture session from " + sc0Var + " for " + qi0Var + '!');
                    qi0Var.b();
                    return k45Var2;
                }
                return new ii0(qp1Var, g.d);
        }
    }
}
