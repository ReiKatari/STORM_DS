package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t62  reason: default package */
/* loaded from: classes.dex */
public final class t62 extends defpackage.kk2 {
    public final long B;
    public final boolean L;
    public long R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final /* synthetic */ defpackage.bk1 d0;

    public t62(defpackage.bk1 r1, defpackage.in6 r2, long r3, boolean r5) {
            r0 = this;
            r2.getClass()
            r0.d0 = r1
            r0.<init>(r2)
            r0.B = r3
            r0.L = r5
            r1 = 1
            r0.X = r1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L19
            r1 = 0
            r0.e(r1)
        L19:
            return
    }

    @Override // defpackage.kk2, defpackage.in6
    public final long b0(defpackage.k80 r10, long r11) {
            r9 = this;
            bk1 r0 = r9.d0
            java.lang.String r1 = "expected "
            r10.getClass()
            boolean r2 = r9.Z
            if (r2 != 0) goto L66
            in6 r2 = r9.A     // Catch: java.io.IOException -> L19
            long r10 = r2.b0(r10, r11)     // Catch: java.io.IOException -> L19
            boolean r12 = r9.X     // Catch: java.io.IOException -> L19
            if (r12 == 0) goto L1b
            r12 = 0
            r9.X = r12     // Catch: java.io.IOException -> L19
            goto L1b
        L19:
            r10 = move-exception
            goto L5e
        L1b:
            r2 = -1
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r4 = 0
            if (r12 != 0) goto L26
            r9.e(r4)     // Catch: java.io.IOException -> L19
            return r2
        L26:
            long r5 = r9.R     // Catch: java.io.IOException -> L19
            long r5 = r5 + r10
            long r7 = r9.B
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 == 0) goto L4e
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 > 0) goto L34
            goto L4e
        L34:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.io.IOException -> L19
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L19
            r11.<init>(r1)     // Catch: java.io.IOException -> L19
            r11.append(r7)     // Catch: java.io.IOException -> L19
            java.lang.String r12 = " bytes but received "
            r11.append(r12)     // Catch: java.io.IOException -> L19
            r11.append(r5)     // Catch: java.io.IOException -> L19
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> L19
            r10.<init>(r11)     // Catch: java.io.IOException -> L19
            throw r10     // Catch: java.io.IOException -> L19
        L4e:
            r9.R = r5     // Catch: java.io.IOException -> L19
            java.lang.Object r12 = r0.R     // Catch: java.io.IOException -> L19
            v62 r12 = (defpackage.v62) r12     // Catch: java.io.IOException -> L19
            boolean r12 = r12.c()     // Catch: java.io.IOException -> L19
            if (r12 == 0) goto L5d
            r9.e(r4)     // Catch: java.io.IOException -> L19
        L5d:
            return r10
        L5e:
            java.io.IOException r9 = r9.e(r10)
            r9.getClass()
            throw r9
        L66:
            java.lang.String r9 = "closed"
            defpackage.i.m(r9)
            r9 = 0
            return r9
    }

    @Override // defpackage.kk2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.Z
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.Z = r0
            super.close()     // Catch: java.io.IOException -> L10
            r0 = 0
            r1.e(r0)     // Catch: java.io.IOException -> L10
            return
        L10:
            r0 = move-exception
            java.io.IOException r1 = r1.e(r0)
            r1.getClass()
            throw r1
    }

    public final java.io.IOException e(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.Y
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.Y = r0
            if (r3 != 0) goto L11
            boolean r0 = r2.X
            if (r0 == 0) goto L11
            r0 = 0
            r2.X = r0
        L11:
            boolean r0 = r2.L
            r1 = 8
            bk1 r2 = r2.d0
            java.io.IOException r2 = defpackage.bk1.b(r2, r0, r3, r1)
            return r2
    }
}
