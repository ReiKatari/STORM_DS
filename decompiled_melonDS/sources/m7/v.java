package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements t7.c {
    public final t7.c A;
    public final long B;
    public final /* synthetic */ c0 L;

    public v(c0 c0Var, t7.c cVar) {
        cVar.getClass();
        this.L = c0Var;
        this.A = cVar;
        this.B = l0.f.i();
    }

    @Override // t7.c
    public final void C(int i2, String str) {
        str.getClass();
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.C(i2, str);
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final boolean N() {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.N();
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.close();
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final void e(int i2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.e(i2);
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final void g(int i2, long j2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.g(i2, j2);
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final byte[] getBlob(int i2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.getBlob(i2);
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final int getColumnCount() {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.getColumnCount();
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final String getColumnName(int i2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.getColumnName(i2);
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final long getLong(int i2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.getLong(i2);
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final void h() {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.h();
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final boolean isNull(int i2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.isNull(i2);
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final void j(int i2, byte[] bArr) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.j(i2, bArr);
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final String n(int i2) {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                return this.A.n(i2);
            }
            zb.k.L(21, "Attempted to use statement on a different thread");
            throw null;
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }

    @Override // t7.c
    public final void reset() {
        if (!this.L.f9316e) {
            if (this.B == l0.f.i()) {
                this.A.reset();
                return;
            } else {
                zb.k.L(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        zb.k.L(21, "Statement is recycled");
        throw null;
    }
}
