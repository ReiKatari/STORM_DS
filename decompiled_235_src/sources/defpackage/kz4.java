package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz4  reason: default package */
/* loaded from: classes.dex */
public final class kz4 implements j36 {
    public final j36 A;
    public final long B;
    public final /* synthetic */ rz4 L;

    public kz4(rz4 rz4Var, j36 j36Var) {
        j36Var.getClass();
        this.L = rz4Var;
        this.A = j36Var;
        this.B = oi2.r();
    }

    @Override // defpackage.j36
    public final String R(int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.R(i);
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final void c(int i, long j) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.c(i, j);
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.close();
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final void d(byte[] bArr, int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.d(bArr, i);
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final void f(int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.f(i);
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final boolean f0() {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.f0();
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final void g() {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.g();
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.getBlob(i);
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.getColumnCount();
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final String getColumnName(int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.getColumnName(i);
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final long getLong(int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.getLong(i);
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final boolean isNull(int i) {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                return this.A.isNull(i);
            }
            ii2.T(21, "Attempted to use statement on a different thread");
            throw null;
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final void reset() {
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.reset();
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }

    @Override // defpackage.j36
    public final void w(int i, String str) {
        str.getClass();
        if (!this.L.e) {
            if (this.B == oi2.r()) {
                this.A.w(i, str);
                return;
            } else {
                ii2.T(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        ii2.T(21, "Statement is recycled");
        throw null;
    }
}
