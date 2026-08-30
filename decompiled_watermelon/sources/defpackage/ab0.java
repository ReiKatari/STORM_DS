package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ab0  reason: default package */
/* loaded from: classes.dex */
public final class ab0 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(String str, int i, boolean z) {
        nc7 nc7Var;
        str.getClass();
        synchronized (this.a) {
            nc7Var = (nc7) this.b.get(new od0(str));
        }
        if (nc7Var == null) {
            return;
        }
        nc7Var.b.a(new en2(i, z));
    }
}
