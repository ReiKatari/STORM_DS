package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pq0  reason: default package */
/* loaded from: classes.dex */
public abstract class pq0 extends l0 {
    public final m93 a;

    public pq0(m93 m93Var) {
        this.a = m93Var;
    }

    @Override // defpackage.m93
    public void d(mz1 mz1Var, Object obj) {
        int i = i(obj);
        h06 e = e();
        zu0 f0 = mz1Var.f0(e, i);
        Iterator h = h(obj);
        for (int i2 = 0; i2 < i; i2++) {
            f0.F(e(), i2, this.a, h.next());
        }
        f0.a(e);
    }

    @Override // defpackage.l0
    public void k(yu0 yu0Var, int i, Object obj) {
        n(i, obj, yu0Var.U(e(), i, this.a, null));
    }

    public abstract void n(int i, Object obj, Object obj2);
}
