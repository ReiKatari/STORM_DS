package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d62  reason: default package */
/* loaded from: classes.dex */
public final class d62 extends xw2 {
    public final jk4 A;
    public final j62 B;
    public final String L;
    public final Closeable R;
    public boolean X;
    public s45 Y;

    public d62(jk4 jk4Var, j62 j62Var, String str, Closeable closeable) {
        this.A = jk4Var;
        this.B = j62Var;
        this.L = str;
        this.R = closeable;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.X = true;
            s45 s45Var = this.Y;
            if (s45Var != null) {
                k.a(s45Var);
            }
            Closeable closeable = this.R;
            if (closeable != null) {
                k.a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.xw2
    public final gk2 d() {
        return null;
    }

    @Override // defpackage.xw2
    public final synchronized u60 i() {
        if (!this.X) {
            s45 s45Var = this.Y;
            if (s45Var != null) {
                return s45Var;
            }
            s45 o = sn2.o(this.B.N(this.A));
            this.Y = o;
            return o;
        }
        throw new IllegalStateException("closed");
    }
}
