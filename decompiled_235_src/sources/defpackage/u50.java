package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u50  reason: default package */
/* loaded from: classes.dex */
public final class u50 implements gg3 {
    public static final u50 a = new Object();
    public static final x25 b = new x25("kotlin.Boolean", v25.e);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        return Boolean.valueOf(sc1Var.g());
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        x32Var.r(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
