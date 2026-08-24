package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd2  reason: default package */
/* loaded from: classes.dex */
final class rd2 implements gg3 {
    public static final rd2 a = new Object();
    public static final x25 b = mp2.b("FlexibleInt", v25.j);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        int B;
        if (sc1Var instanceof yd3) {
            df3 h = fe3.h(((yd3) sc1Var).y());
            Integer h0 = xs6.h0(h.a());
            if (h0 != null) {
                B = h0.intValue();
            } else {
                B = fe3.e(h);
            }
        } else {
            B = sc1Var.B();
        }
        return Integer.valueOf(B);
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        x32Var.T(((Number) obj).intValue());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
