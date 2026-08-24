package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he3  reason: default package */
/* loaded from: classes.dex */
public final class he3 implements gg3 {
    public static final he3 a = new Object();
    public static final yb6 b = mp2.l("kotlinx.serialization.json.JsonElement", dz4.f, new wb6[0], new v83(4));

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        return gi2.l(sc1Var).y();
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        de3 de3Var = (de3) obj;
        de3Var.getClass();
        gi2.j(x32Var);
        if (de3Var instanceof df3) {
            x32Var.j(gf3.a, de3Var);
        } else if (de3Var instanceof ye3) {
            x32Var.j(bf3.a, de3Var);
        } else if (de3Var instanceof nd3) {
            x32Var.j(qd3.a, de3Var);
        } else {
            i.d();
        }
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
