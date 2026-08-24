package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id0  reason: default package */
/* loaded from: classes.dex */
public final class id0 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(String str, int i, boolean z) {
        pq7 pq7Var;
        str.getClass();
        synchronized (this.a) {
            pq7Var = (pq7) this.b.get(new xf0(str));
        }
        if (pq7Var == null) {
            return;
        }
        pq7Var.b.a(new kt2(i, z));
    }
}
