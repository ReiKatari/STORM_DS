package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni  reason: default package */
/* loaded from: classes.dex */
public final class ni implements sk0 {
    public final jr6 a;

    public ni(jr6 jr6Var, t57 t57Var) {
        t57Var.getClass();
        this.a = jr6Var;
    }

    @Override // defpackage.sk0
    public final rk0 a(bf0 bf0Var, Map map, yk0 yk0Var) {
        bf0Var.getClass();
        map.getClass();
        yk0Var.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add((Surface) entry.getValue());
        }
        if (!bf0Var.F(arrayList, yk0Var)) {
            Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + bf0Var + " for " + yk0Var + '!');
            yk0Var.a();
            return d90.q0;
        }
        return new qk0(zt1.A, l.g(map, this.a));
    }
}
