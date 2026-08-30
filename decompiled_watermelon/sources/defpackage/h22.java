package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h22  reason: default package */
/* loaded from: classes.dex */
public final class h22 extends dz6 {
    public volatile dz6 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qo2 d;
    public final /* synthetic */ n07 e;
    public final /* synthetic */ i22 f;

    public h22(i22 i22Var, boolean z, boolean z2, qo2 qo2Var, n07 n07Var) {
        this.f = i22Var;
        this.b = z;
        this.c = z2;
        this.d = qo2Var;
        this.e = n07Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (this.b) {
            o83Var.u0();
            return null;
        }
        dz6 dz6Var = this.a;
        if (dz6Var == null) {
            dz6Var = this.d.e(this.f, this.e);
            this.a = dz6Var;
        }
        return dz6Var.b(o83Var);
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        if (this.c) {
            b93Var.F();
            return;
        }
        dz6 dz6Var = this.a;
        if (dz6Var == null) {
            dz6Var = this.d.e(this.f, this.e);
            this.a = dz6Var;
        }
        dz6Var.c(b93Var, obj);
    }
}
