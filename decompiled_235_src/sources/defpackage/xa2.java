package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa2  reason: default package */
/* loaded from: classes.dex */
public final class xa2 extends b33 {
    public final lt4 A;
    public final db2 B;
    public final String L;
    public final Closeable R;
    public boolean X;
    public fe5 Y;

    public xa2(lt4 lt4Var, db2 db2Var, String str, Closeable closeable) {
        this.A = lt4Var;
        this.B = db2Var;
        this.L = str;
        this.R = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.X = true;
            fe5 fe5Var = this.Y;
            if (fe5Var != null) {
                k.a(fe5Var);
            }
            Closeable closeable = this.R;
            if (closeable != null) {
                k.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.b33
    public final qo2 e() {
        return null;
    }

    @Override // defpackage.b33
    public final synchronized z80 h() {
        if (!this.X) {
            fe5 fe5Var = this.Y;
            if (fe5Var != null) {
                return fe5Var;
            }
            fe5 u = hi2.u(this.B.N(this.A));
            this.Y = u;
            return u;
        }
        throw new IllegalStateException("closed");
    }
}
