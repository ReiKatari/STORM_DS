package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we3  reason: default package */
/* loaded from: classes.dex */
public final class we3 implements gg3 {
    public static final we3 a = new Object();
    public static final yb6 b = mp2.m("kotlinx.serialization.json.JsonNull", bc6.e, new wb6[0]);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        gi2.l(sc1Var);
        if (!sc1Var.M()) {
            return ue3.INSTANCE;
        }
        throw new me3(hi2.x("Expected 'null' literal", null, -1, null, null));
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        ((ue3) obj).getClass();
        gi2.j(x32Var);
        x32Var.f();
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
