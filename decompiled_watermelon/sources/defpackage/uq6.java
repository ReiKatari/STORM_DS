package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uq6  reason: default package */
/* loaded from: classes.dex */
public final class uq6 {
    public final tj4 a = me2.G(Boolean.FALSE);
    public final tj4 b = me2.G(new oq6((String) null, 7, 0));
    public final tj4 c = me2.G(new fb3(0, 0, 7, 119));
    public final tj4 d = me2.G(null);
    public final tj4 e = me2.G(null);

    public static void c(uq6 uq6Var, String str, mi2 mi2Var) {
        d5 d5Var = new d5(17);
        fb3 fb3Var = new fb3(0, 0, 7, 119);
        uq6Var.getClass();
        str.getClass();
        tj4 tj4Var = uq6Var.a;
        if (((Boolean) tj4Var.getValue()).booleanValue()) {
            return;
        }
        int length = str.length();
        uq6Var.b.setValue(new oq6(str, 4, ve2.g(length, length)));
        uq6Var.d.setValue(mi2Var);
        uq6Var.e.setValue(d5Var);
        uq6Var.c.setValue(fb3Var);
        tj4Var.setValue(Boolean.TRUE);
    }

    public final void a() {
        this.a.setValue(Boolean.FALSE);
        tj4 tj4Var = this.e;
        ki2 ki2Var = (ki2) tj4Var.getValue();
        if (ki2Var != null) {
            ki2Var.c();
        }
        this.d.setValue(null);
        tj4Var.setValue(null);
    }

    public final void b() {
        tj4 tj4Var = this.d;
        mi2 mi2Var = (mi2) tj4Var.getValue();
        if (mi2Var != null) {
            mi2Var.n(((oq6) this.b.getValue()).a.B);
        }
        this.a.setValue(Boolean.FALSE);
        tj4Var.setValue(null);
        this.e.setValue(null);
    }
}
