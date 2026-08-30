package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p0  reason: default package */
/* loaded from: classes.dex */
public abstract class p0 extends p63 implements j11, o31 {
    public final e31 X;

    public p0(e31 e31Var, boolean z) {
        super(z);
        X((c63) e31Var.I(k45.d0));
        this.X = e31Var.C(this);
    }

    @Override // defpackage.p63
    public final void W(hg hgVar) {
        w81.t(this.X, hgVar);
    }

    @Override // defpackage.j11
    public final e31 a() {
        return this.X;
    }

    @Override // defpackage.p63
    public final void i0(Object obj) {
        if (obj instanceof ns0) {
            ns0 ns0Var = (ns0) obj;
            Throwable th = ns0Var.a;
            boolean z = true;
            if (ns0.b.get(ns0Var) != 1) {
                z = false;
            }
            u0(th, z);
            return;
        }
        v0(obj);
    }

    @Override // defpackage.j11
    public final void k(Object obj) {
        Throwable a = nc5.a(obj);
        if (a != null) {
            obj = new ns0(a, false);
        }
        Object d0 = d0(obj);
        if (d0 == q63.b) {
            return;
        }
        f(d0);
    }

    @Override // defpackage.o31
    public final e31 w() {
        return this.X;
    }

    @Override // defpackage.p63
    public final String y() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void v0(Object obj) {
    }

    public void u0(Throwable th, boolean z) {
    }
}
