package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ax6  reason: default package */
/* loaded from: classes.dex */
public final class ax6 {
    public final bz6 a;
    public final tj4 b = me2.G(null);
    public final /* synthetic */ kx6 c;

    public ax6(kx6 kx6Var, bz6 bz6Var, String str) {
        this.c = kx6Var;
        this.a = bz6Var;
    }

    public final zw6 a(mi2 mi2Var, mi2 mi2Var2) {
        tj4 tj4Var = this.b;
        zw6 zw6Var = (zw6) tj4Var.getValue();
        kx6 kx6Var = this.c;
        if (zw6Var == null) {
            Object n = mi2Var2.n(kx6Var.a.f());
            Object n2 = mi2Var2.n(kx6Var.a.f());
            bz6 bz6Var = this.a;
            oo ooVar = (oo) bz6Var.a.n(n2);
            ooVar.d();
            gx6 gx6Var = new gx6(kx6Var, n, ooVar, bz6Var);
            zw6Var = new zw6(this, gx6Var, mi2Var, mi2Var2);
            tj4Var.setValue(zw6Var);
            kx6Var.i.add(gx6Var);
        }
        zw6Var.L = mi2Var2;
        zw6Var.B = mi2Var;
        zw6Var.b(kx6Var.f());
        return zw6Var;
    }
}
