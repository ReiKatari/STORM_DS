package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bi  reason: default package */
/* loaded from: classes.dex */
public final class bi implements ki0 {
    public final tf6 a;

    public bi(tf6 tf6Var, ct6 ct6Var) {
        ct6Var.getClass();
        this.a = tf6Var;
    }

    @Override // defpackage.ki0
    public final ji0 a(sc0 sc0Var, Map map, qi0 qi0Var) {
        sc0Var.getClass();
        map.getClass();
        qi0Var.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add((Surface) entry.getValue());
        }
        if (!sc0Var.Z(arrayList, qi0Var)) {
            Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + sc0Var + " for " + qi0Var + '!');
            qi0Var.b();
            return k45.X;
        }
        return new ii0(qp1.A, tq5.d(map, this.a));
    }
}
