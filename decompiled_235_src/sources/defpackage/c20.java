package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c20  reason: default package */
/* loaded from: classes.dex */
public abstract class c20 implements k11 {
    public final a21 a;

    public c20(a21 a21Var) {
        a21Var.getClass();
        this.a = a21Var;
    }

    @Override // defpackage.k11
    public final boolean a(yw7 yw7Var) {
        if (c(yw7Var) && e(this.a.d())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.k11
    public final pb0 b(p21 p21Var) {
        p21Var.getClass();
        return f04.p(new z(this, (r41) null, 8));
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
