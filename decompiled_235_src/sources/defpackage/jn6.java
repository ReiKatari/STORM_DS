package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jn6  reason: default package */
/* loaded from: classes.dex */
public final class jn6 extends b33 {
    public final qo2 A;
    public boolean B;
    public final z80 L;

    public jn6(z80 z80Var, qo2 qo2Var) {
        this.A = qo2Var;
        this.L = z80Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.B = true;
        z80 z80Var = this.L;
        if (z80Var != null) {
            k.a(z80Var);
        }
    }

    @Override // defpackage.b33
    public final qo2 e() {
        return this.A;
    }

    @Override // defpackage.b33
    public final synchronized z80 h() {
        z80 z80Var;
        try {
            if (!this.B) {
                z80Var = this.L;
                if (z80Var == null) {
                    xf3 xf3Var = db2.A;
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return z80Var;
    }
}
