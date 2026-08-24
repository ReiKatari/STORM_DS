package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q0  reason: default package */
/* loaded from: classes.dex */
public abstract class q0 extends ed3 implements r41, w61 {
    public final l61 X;

    public q0(l61 l61Var, boolean z) {
        super(z);
        T((rc3) l61Var.Z(vs0.h0));
        this.X = l61Var.N(this);
    }

    @Override // defpackage.w61
    public final l61 A() {
        return this.X;
    }

    @Override // defpackage.ed3
    public final String C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.ed3
    public final void S(ug ugVar) {
        f04.H(this.X, ugVar);
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.X;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        Throwable a = hm5.a(obj);
        if (a != null) {
            obj = new av0(a, false);
        }
        Object d0 = d0(obj);
        if (d0 == fd3.b) {
            return;
        }
        g(d0);
    }

    @Override // defpackage.ed3
    public final void i0(Object obj) {
        if (obj instanceof av0) {
            av0 av0Var = (av0) obj;
            Throwable th = av0Var.a;
            boolean z = true;
            if (av0.b.get(av0Var) != 1) {
                z = false;
            }
            u0(th, z);
            return;
        }
        v0(obj);
    }

    public void v0(Object obj) {
    }

    public void u0(Throwable th, boolean z) {
    }
}
