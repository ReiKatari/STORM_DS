package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz4  reason: default package */
/* loaded from: classes.dex */
public final class kz4 implements defpackage.j36 {
    public final defpackage.j36 A;
    public final long B;
    public final /* synthetic */ defpackage.rz4 L;

    public kz4(defpackage.rz4 r1, defpackage.j36 r2) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.L = r1
            r0.A = r2
            long r1 = defpackage.oi2.r()
            r0.B = r1
            return
    }

    @Override // defpackage.j36
    public final java.lang.String R(int r8) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            java.lang.String r7 = r7.R(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final void c(int r8, long r9) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            j36 r7 = r7.A
            r7.c(r8, r9)
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            j36 r7 = r7.A
            r7.close()
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final void d(byte[] r8, int r9) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            j36 r7 = r7.A
            r7.d(r8, r9)
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final void f(int r8) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            j36 r7 = r7.A
            r7.f(r8)
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final boolean f0() {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            boolean r7 = r7.f0()
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final void g() {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            j36 r7 = r7.A
            r7.g()
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int r8) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            byte[] r7 = r7.getBlob(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            int r7 = r7.getColumnCount()
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final java.lang.String getColumnName(int r8) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            java.lang.String r7 = r7.getColumnName(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final long getLong(int r8) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            long r7 = r7.getLong(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final boolean isNull(int r8) {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L20
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1a
            j36 r7 = r7.A
            boolean r7 = r7.isNull(r8)
            return r7
        L1a:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L20:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final void reset() {
            r7 = this;
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L1f
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L19
            j36 r7 = r7.A
            r7.reset()
            return
        L19:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L1f:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }

    @Override // defpackage.j36
    public final void w(int r8, java.lang.String r9) {
            r7 = this;
            r9.getClass()
            rz4 r0 = r7.L
            boolean r0 = r0.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L22
            long r3 = r7.B
            long r5 = defpackage.oi2.r()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1c
            j36 r7 = r7.A
            r7.w(r8, r9)
            return
        L1c:
            java.lang.String r7 = "Attempted to use statement on a different thread"
            defpackage.ii2.T(r2, r7)
            throw r1
        L22:
            java.lang.String r7 = "Statement is recycled"
            defpackage.ii2.T(r2, r7)
            throw r1
    }
}
