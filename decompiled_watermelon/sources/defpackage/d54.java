package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d54  reason: default package */
/* loaded from: classes.dex */
public abstract class d54 {
    public ve2 a;
    public boolean b;
    public q9 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(b54 b54Var);

    public abstract void d(b54 b54Var);

    public final void e() {
        q9 q9Var = this.c;
        if (q9Var != null && ((LinkedHashSet) q9Var.R).remove(this)) {
            g54 g54Var = (g54) q9Var.L;
            g54Var.getClass();
            if (equals(g54Var.f)) {
                if (g54Var.g == -1) {
                    a();
                }
                g54Var.f = null;
                g54Var.g = 0;
                g54Var.h = null;
            }
            g54Var.d.remove(this);
            g54Var.e.remove(this);
            this.c = null;
            g54Var.b();
        }
    }

    public final void f(boolean z) {
        g54 g54Var;
        if (this.b != z) {
            this.b = z;
            q9 q9Var = this.c;
            if (q9Var != null && (g54Var = (g54) q9Var.L) != null) {
                g54Var.b();
            }
        }
    }
}
