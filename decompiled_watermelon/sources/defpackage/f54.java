package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f54  reason: default package */
/* loaded from: classes.dex */
public abstract class f54 {
    public q9 a;
    public boolean b;

    public final void a() {
        q9 q9Var = this.a;
        if (q9Var != null) {
            if (!this.b) {
                q9Var.v(this, null);
            }
            g54 g54Var = (g54) q9Var.L;
            a31 a31Var = (a31) q9Var.B;
            g54Var.getClass();
            if (equals(g54Var.h) && -1 == g54Var.g) {
                d54 d54Var = g54Var.f;
                if (d54Var == null) {
                    d54Var = g54Var.c(-1);
                }
                g54Var.f = null;
                g54Var.g = 0;
                g54Var.h = null;
                if (d54Var == null) {
                    ((kc4) a31Var.B).a.run();
                } else {
                    d54Var.b();
                }
                ee6 ee6Var = g54Var.a;
                ee6Var.getClass();
                ee6Var.l(null, h54.e);
            }
            this.b = false;
            return;
        }
        i.n("This input is not added to any dispatcher.");
    }

    public void b(boolean z) {
    }
}
