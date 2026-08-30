package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o1  reason: default package */
/* loaded from: classes.dex */
public final class o1 extends l07 {
    @Override // defpackage.l07
    public final void l0(p1 p1Var, p1 p1Var2) {
        p1Var.b = p1Var2;
    }

    @Override // defpackage.l07
    public final void m0(p1 p1Var, Thread thread) {
        p1Var.a = thread;
    }

    @Override // defpackage.l07
    public final boolean v(q1 q1Var, m1 m1Var, m1 m1Var2) {
        synchronized (q1Var) {
            try {
                if (q1Var.B == m1Var) {
                    q1Var.B = m1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l07
    public final boolean w(q1 q1Var, Object obj, Object obj2) {
        synchronized (q1Var) {
            try {
                if (q1Var.A == obj) {
                    q1Var.A = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l07
    public final boolean x(q1 q1Var, p1 p1Var, p1 p1Var2) {
        synchronized (q1Var) {
            try {
                if (q1Var.L == p1Var) {
                    q1Var.L = p1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
