package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg1  reason: default package */
/* loaded from: classes.dex */
public final class yg1 implements m55 {
    public m55 a;

    public static void a(yg1 yg1Var, m55 m55Var) {
        if (yg1Var.a == null) {
            yg1Var.a = m55Var;
        } else {
            e41.m();
        }
    }

    @Override // defpackage.n55
    public final Object get() {
        m55 m55Var = this.a;
        if (m55Var != null) {
            return m55Var.get();
        }
        e41.m();
        return null;
    }
}
