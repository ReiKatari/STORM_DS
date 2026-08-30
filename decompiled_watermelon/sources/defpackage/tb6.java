package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tb6  reason: default package */
/* loaded from: classes.dex */
public final class tb6 extends xw2 {
    public final gk2 A;
    public boolean B;
    public final u60 L;

    public tb6(u60 u60Var, gk2 gk2Var) {
        this.A = gk2Var;
        this.L = u60Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.B = true;
        u60 u60Var = this.L;
        if (u60Var != null) {
            k.a(u60Var);
        }
    }

    @Override // defpackage.xw2
    public final gk2 d() {
        return this.A;
    }

    @Override // defpackage.xw2
    public final synchronized u60 i() {
        u60 u60Var;
        try {
            if (!this.B) {
                u60Var = this.L;
                if (u60Var == null) {
                    d93 d93Var = j62.A;
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return u60Var;
    }
}
