package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gq4  reason: default package */
/* loaded from: classes.dex */
public final class gq4 implements ns5 {
    public final ns5 A;
    public final long B;
    public final /* synthetic */ nq4 L;

    public gq4(nq4 nq4Var, ns5 ns5Var) {
        ns5Var.getClass();
        this.L = nq4Var;
        this.A = ns5Var;
        this.B = gk2.D();
    }

    @Override // defpackage.ns5
    public final void M(int i, String str) {
        str.getClass();
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.M(i, str);
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final boolean a0() {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.a0();
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.close();
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final void e(int i) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.e(i);
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final void g(int i, long j) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.g(i, j);
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final byte[] getBlob(int i) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.getBlob(i);
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final int getColumnCount() {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.getColumnCount();
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final String getColumnName(int i) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.getColumnName(i);
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final long getLong(int i) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.getLong(i);
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final void h() {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.h();
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final boolean isNull(int i) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.isNull(i);
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final void j(int i, byte[] bArr) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.j(i, bArr);
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final String q(int i) {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                return this.A.q(i);
            }
            yf2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.ns5
    public final void reset() {
        if (!this.L.e) {
            if (this.B == gk2.D()) {
                this.A.reset();
                return;
            } else {
                yf2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        yf2.T(21, "Statement is recycled");
        throw null;
    }
}
