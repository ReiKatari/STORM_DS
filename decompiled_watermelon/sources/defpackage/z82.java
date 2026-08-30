package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z82  reason: default package */
/* loaded from: classes.dex */
final class z82 implements m93 {
    public static final z82 a = new Object();
    public static final vt4 b = oo2.j("FlexibleInt", tt4.m);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        int L;
        if (b91Var instanceof f73) {
            k83 h = m73.h(((f73) b91Var).I());
            Integer o0 = gh6.o0(h.b());
            if (o0 != null) {
                L = o0.intValue();
            } else {
                L = m73.e(h);
            }
        } else {
            L = b91Var.L();
        }
        return Integer.valueOf(L);
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        mz1Var.E(((Number) obj).intValue());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
