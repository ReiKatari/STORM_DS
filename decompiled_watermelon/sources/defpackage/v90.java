package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v90  reason: default package */
/* loaded from: classes.dex */
public final class v90 implements i47 {
    public final w90 a;
    public final n57 b;
    public final bs0 c;
    public n47 d;

    public v90(w90 w90Var, n57 n57Var, bs0 bs0Var) {
        this.a = w90Var;
        this.b = n57Var;
        this.c = bs0Var;
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.d = n47Var;
        if (n47Var != null) {
            bs0 bs0Var = this.c;
            w90 w90Var = this.a;
            bs0Var.b(w90Var);
            bs0Var.a(w90Var, this.b.e);
            w90Var.a(n47Var, false);
        }
    }

    @Override // defpackage.i47
    public final void reset() {
        w90 w90Var = this.a;
        synchronized (w90Var.B) {
            try {
                gs0 gs0Var = w90Var.R;
                if (gs0Var != null) {
                    w90Var.R = null;
                    gs0Var.v0(new Exception("The camera control has became inactive."));
                }
                gs0 gs0Var2 = w90Var.X;
                if (gs0Var2 != null) {
                    w90Var.X = null;
                    gs0Var2.v0(new Exception("The camera control has became inactive."));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.b(this.a);
    }
}
