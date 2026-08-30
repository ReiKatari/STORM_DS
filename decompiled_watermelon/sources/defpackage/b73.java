package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b73  reason: default package */
/* loaded from: classes.dex */
public final class b73 implements m93 {
    public static final b73 a = new Object();
    public static final a73 b = a73.b;

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        sn2.m(b91Var);
        return new y63((List) new zt(o73.a, 0).j(b91Var, null));
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        y63 y63Var = (y63) obj;
        y63Var.getClass();
        sn2.j(mz1Var);
        o73 o73Var = o73.a;
        h06 e = o73Var.e();
        e.getClass();
        vt vtVar = new vt(e, 1);
        int size = y63Var.size();
        zu0 f0 = mz1Var.f0(vtVar, size);
        Iterator<k73> it = y63Var.iterator();
        for (int i = 0; i < size; i++) {
            f0.F(vtVar, i, o73Var, it.next());
        }
        f0.a(vtVar);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
