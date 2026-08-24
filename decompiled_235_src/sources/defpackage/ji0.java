package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ji0  reason: default package */
/* loaded from: classes.dex */
public final class ji0 {
    public final List a;

    public ji0(List list) {
        this.a = list;
        pp4 pp4Var = (pp4) gt0.H0(list);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((pp4) it.next()).b != pp4Var.b) {
                    i.m("All outputs must have the same format!");
                    throw null;
                }
            }
        }
    }

    public final String toString() {
        return "CameraStream.Config(outputs=" + this.a + ", imageSourceConfig=null)";
    }
}
