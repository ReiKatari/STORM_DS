package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om0  reason: default package */
/* loaded from: classes.dex */
public final class om0 implements gg3 {
    public static final om0 a = new Object();
    public static final x25 b = new x25("kotlin.Char", v25.g);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        return Character.valueOf(sc1Var.h());
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        x32Var.E(((Character) obj).charValue());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
