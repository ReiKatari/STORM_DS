package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y90  reason: default package */
/* loaded from: classes.dex */
public final class y90 implements gg3 {
    public static final y90 a = new Object();
    public static final x25 b = new x25("kotlin.Byte", v25.f);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        return Byte.valueOf(sc1Var.Y());
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        x32Var.o(((Number) obj).byteValue());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
