package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p1  reason: default package */
/* loaded from: classes.dex */
public final class p1 extends q60 {
    @Override // defpackage.q60
    public final void S(q1 q1Var, q1 q1Var2) {
        q1Var.b = q1Var2;
    }

    @Override // defpackage.q60
    public final void T(q1 q1Var, Thread thread) {
        q1Var.a = thread;
    }

    @Override // defpackage.q60
    public final boolean m(r1 r1Var, n1 n1Var, n1 n1Var2) {
        synchronized (r1Var) {
            try {
                if (r1Var.B == n1Var) {
                    r1Var.B = n1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q60
    public final boolean n(r1 r1Var, Object obj, Object obj2) {
        synchronized (r1Var) {
            try {
                if (r1Var.A == obj) {
                    r1Var.A = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.q60
    public final boolean o(r1 r1Var, q1 q1Var, q1 q1Var2) {
        synchronized (r1Var) {
            try {
                if (r1Var.L == q1Var) {
                    r1Var.L = q1Var2;
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
