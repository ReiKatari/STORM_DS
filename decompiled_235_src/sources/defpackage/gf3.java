package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf3  reason: default package */
/* loaded from: classes.dex */
public final class gf3 implements gg3 {
    public static final gf3 a = new Object();
    public static final yb6 b = mp2.m("kotlinx.serialization.json.JsonPrimitive", v25.m, new wb6[0]);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        String str;
        yd3 l = gi2.l(sc1Var);
        de3 y = l.y();
        if (!(y instanceof df3)) {
            String str2 = "Unexpected JSON element, expected JsonPrimitive, had " + gh5.a(y.getClass());
            if (l.S().a.g) {
                str = hi2.H(-1, y.toString()).toString();
            } else {
                str = null;
            }
            throw new me3(hi2.x(str2, null, -1, null, str));
        }
        return (df3) y;
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        df3 df3Var = (df3) obj;
        df3Var.getClass();
        gi2.j(x32Var);
        if (df3Var instanceof ue3) {
            x32Var.j(we3.a, ue3.INSTANCE);
        } else {
            x32Var.j(re3.a, (qe3) df3Var);
        }
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
