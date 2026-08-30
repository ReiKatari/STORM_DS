package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ag0  reason: default package */
/* loaded from: classes.dex */
public final class ag0 {
    public final List a;

    public ag0(List list) {
        this.a = list;
        mg4 mg4Var = (mg4) tq0.K0(list);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((mg4) it.next()).b != mg4Var.b) {
                    i.n("All outputs must have the same format!");
                    throw null;
                }
            }
        }
    }

    public final String toString() {
        return "CameraStream.Config(outputs=" + this.a + ", imageSourceConfig=null)";
    }
}
