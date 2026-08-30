package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: au2  reason: default package */
/* loaded from: classes.dex */
public final class au2 extends bu2 {
    public final a90 d;
    public final boolean e;

    public au2(db5 db5Var, zb4 zb4Var, t11 t11Var, a90 a90Var, boolean z) {
        super(db5Var, zb4Var, t11Var);
        this.d = a90Var;
        this.e = z;
    }

    @Override // defpackage.bu2
    public final Object a(xb4 xb4Var, Object[] objArr) {
        y80 y80Var = (y80) this.d.d(xb4Var);
        j11 j11Var = (j11) objArr[objArr.length - 1];
        try {
            if (this.e) {
                try {
                    y80Var.getClass();
                    return nl2.x(y80Var, j11Var);
                } catch (ThreadDeath e) {
                    throw e;
                }
            }
            return nl2.w(y80Var, j11Var);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e2) {
            throw e2;
        } catch (Throwable th) {
            return nl2.W(th, j11Var);
        }
    }
}
