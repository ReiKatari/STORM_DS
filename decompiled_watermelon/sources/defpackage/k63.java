package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k63  reason: default package */
/* loaded from: classes.dex */
public final class k63 extends f63 {
    public final jy5 c0;
    public final /* synthetic */ p63 d0;

    public k63(p63 p63Var, jy5 jy5Var) {
        this.d0 = p63Var;
        this.c0 = jy5Var;
    }

    @Override // defpackage.f63
    public final boolean q() {
        return false;
    }

    @Override // defpackage.f63
    public final void r(Throwable th) {
        p63 p63Var = this.d0;
        Object S = p63Var.S();
        if (!(S instanceof ns0)) {
            S = q63.a(S);
        }
        this.c0.k(p63Var, S);
    }
}
