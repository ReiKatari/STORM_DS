package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i63  reason: default package */
/* loaded from: classes.dex */
public final class i63 extends f63 {
    public final p63 c0;
    public final j63 d0;
    public final yn0 e0;
    public final Object f0;

    public i63(p63 p63Var, j63 j63Var, yn0 yn0Var, Object obj) {
        this.c0 = p63Var;
        this.d0 = j63Var;
        this.e0 = yn0Var;
        this.f0 = obj;
    }

    @Override // defpackage.f63
    public final boolean q() {
        return false;
    }

    @Override // defpackage.f63
    public final void r(Throwable th) {
        yn0 yn0Var = this.e0;
        yn0 g0 = p63.g0(yn0Var);
        p63 p63Var = this.c0;
        j63 j63Var = this.d0;
        Object obj = this.f0;
        if (g0 == null || !p63Var.t0(j63Var, g0, obj)) {
            j63Var.A.b(new jp3(2), 2);
            yn0 g02 = p63.g0(yn0Var);
            if (g02 != null && p63Var.t0(j63Var, g02, obj)) {
                return;
            }
            p63Var.e(p63Var.G(j63Var, obj));
        }
    }
}
