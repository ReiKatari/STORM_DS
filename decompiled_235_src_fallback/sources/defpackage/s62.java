package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s62  reason: default package */
/* loaded from: classes.dex */
public final class s62 extends defpackage.jk2 {
    public final long B;
    public final boolean L;
    public boolean R;
    public long X;
    public boolean Y;
    public boolean Z;
    public final /* synthetic */ defpackage.bk1 d0;

    public s62(defpackage.bk1 r1, defpackage.ui6 r2, long r3, boolean r5) {
            r0 = this;
            r2.getClass()
            r0.d0 = r1
            r0.<init>(r2)
            r0.B = r3
            r0.L = r5
            r0.Y = r5
            return
    }

    @Override // defpackage.jk2, defpackage.ui6
    public final void O(defpackage.k80 r5, long r6) {
            r4 = this;
            boolean r0 = r4.Z
            if (r0 != 0) goto L49
            r0 = -1
            long r2 = r4.B
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r0 = r4.X
            long r0 = r0 + r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L14
            goto L2c
        L14:
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.String r0 = "expected "
            java.lang.String r1 = " bytes but received "
            java.lang.StringBuilder r0 = defpackage.xg6.s(r2, r0, r1)
            long r1 = r4.X
            long r1 = r1 + r6
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L2c:
            boolean r0 = r4.Y     // Catch: java.io.IOException -> L34
            if (r0 == 0) goto L36
            r0 = 0
            r4.Y = r0     // Catch: java.io.IOException -> L34
            goto L36
        L34:
            r5 = move-exception
            goto L41
        L36:
            ui6 r0 = r4.A     // Catch: java.io.IOException -> L34
            r0.O(r5, r6)     // Catch: java.io.IOException -> L34
            long r0 = r4.X     // Catch: java.io.IOException -> L34
            long r0 = r0 + r6
            r4.X = r0     // Catch: java.io.IOException -> L34
            return
        L41:
            java.io.IOException r4 = r4.e(r5)
            r4.getClass()
            throw r4
        L49:
            java.lang.String r4 = "closed"
            defpackage.i.m(r4)
            return
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.Z
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.Z = r0
            r0 = -1
            long r2 = r4.B
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1f
            long r0 = r4.X
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            goto L1f
        L17:
            java.net.ProtocolException r4 = new java.net.ProtocolException
            java.lang.String r0 = "unexpected end of stream"
            r4.<init>(r0)
            throw r4
        L1f:
            super.close()     // Catch: java.io.IOException -> L27
            r0 = 0
            r4.e(r0)     // Catch: java.io.IOException -> L27
            return
        L27:
            r0 = move-exception
            java.io.IOException r4 = r4.e(r0)
            r4.getClass()
            throw r4
    }

    public final java.io.IOException e(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.R
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.R = r0
            boolean r0 = r2.L
            r1 = 4
            bk1 r2 = r2.d0
            java.io.IOException r2 = defpackage.bk1.b(r2, r0, r3, r1)
            return r2
    }

    @Override // defpackage.jk2, defpackage.ui6, java.io.Flushable
    public final void flush() {
            r1 = this;
            super.flush()     // Catch: java.io.IOException -> L4
            return
        L4:
            r0 = move-exception
            java.io.IOException r1 = r1.e(r0)
            r1.getClass()
            throw r1
    }
}
