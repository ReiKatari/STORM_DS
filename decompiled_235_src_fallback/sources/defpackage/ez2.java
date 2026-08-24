package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez2  reason: default package */
/* loaded from: classes.dex */
public final class ez2 extends defpackage.cz2 {
    public long X;
    public boolean Y;
    public final /* synthetic */ defpackage.hz2 Z;

    public ez2(defpackage.hz2 r1, defpackage.i03 r2) {
            r0 = this;
            r2.getClass()
            r0.Z = r1
            r0.<init>(r1, r2)
            r1 = -1
            r0.X = r1
            r1 = 1
            r0.Y = r1
            return
    }

    @Override // defpackage.cz2, defpackage.in6
    public final long b0(defpackage.k80 r19, long r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            hz2 r3 = r0.Z
            bt r4 = r3.c
            r19.getClass()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L14f
            boolean r7 = r0.L
            if (r7 != 0) goto L147
            boolean r7 = r0.Y
            r8 = -1
            if (r7 != 0) goto L1d
            goto Lf2
        L1d:
            long r10 = r0.X
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 == 0) goto L27
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto Lf3
        L27:
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r7 == 0) goto L37
            java.lang.Object r7 = r4.L
            fe5 r7 = (defpackage.fe5) r7
            r7.y(r10)
        L37:
            java.lang.Object r7 = r4.L     // Catch: java.lang.NumberFormatException -> L13c
            fe5 r7 = (defpackage.fe5) r7     // Catch: java.lang.NumberFormatException -> L13c
            k80 r12 = r7.B     // Catch: java.lang.NumberFormatException -> L13c
            r13 = 1
            r7.g0(r13)     // Catch: java.lang.NumberFormatException -> L13c
            r13 = 0
            r14 = r13
        L44:
            int r15 = r14 + 1
            r16 = r5
            long r5 = (long) r15     // Catch: java.lang.NumberFormatException -> L13c
            boolean r5 = r7.T(r5)     // Catch: java.lang.NumberFormatException -> L13c
            if (r5 == 0) goto L8c
            long r5 = (long) r14     // Catch: java.lang.NumberFormatException -> L13c
            byte r5 = r12.v(r5)     // Catch: java.lang.NumberFormatException -> L13c
            r6 = 48
            if (r5 < r6) goto L5c
            r6 = 57
            if (r5 <= r6) goto L6d
        L5c:
            r6 = 97
            if (r5 < r6) goto L64
            r6 = 102(0x66, float:1.43E-43)
            if (r5 <= r6) goto L6d
        L64:
            r6 = 65
            if (r5 < r6) goto L71
            r6 = 70
            if (r5 <= r6) goto L6d
            goto L71
        L6d:
            r14 = r15
            r5 = r16
            goto L44
        L71:
            if (r14 == 0) goto L74
            goto L8c
        L74:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L13c
            r1 = 16
            defpackage.g04.y(r1)     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.String r1 = java.lang.Integer.toString(r5, r1)     // Catch: java.lang.NumberFormatException -> L13c
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.NumberFormatException -> L13c
            r0.<init>(r1)     // Catch: java.lang.NumberFormatException -> L13c
            throw r0     // Catch: java.lang.NumberFormatException -> L13c
        L8c:
            long r5 = r12.X()     // Catch: java.lang.NumberFormatException -> L13c
            r0.X = r5     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.Object r4 = r4.L     // Catch: java.lang.NumberFormatException -> L13c
            fe5 r4 = (defpackage.fe5) r4     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.String r4 = r4.y(r10)     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.CharSequence r4 = defpackage.qs6.T0(r4)     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> L13c
            long r5 = r0.X     // Catch: java.lang.NumberFormatException -> L13c
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 < 0) goto L11b
            int r5 = r4.length()     // Catch: java.lang.NumberFormatException -> L13c
            if (r5 <= 0) goto Lb6
            java.lang.String r5 = ";"
            boolean r5 = defpackage.xs6.g0(r4, r5, r13)     // Catch: java.lang.NumberFormatException -> L13c
            if (r5 == 0) goto L11b
        Lb6:
            long r4 = r0.X
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 != 0) goto Lee
            r0.Y = r13
            kk r4 = r3.e
            r4.getClass()
            ww2 r5 = new ww2
            r5.<init>(r13, r13)
        Lc8:
            java.lang.Object r6 = r4.L
            z80 r6 = (defpackage.z80) r6
            long r10 = r4.B
            java.lang.String r6 = r6.y(r10)
            long r10 = r4.B
            int r7 = r6.length()
            long r12 = (long) r7
            long r10 = r10 - r12
            r4.B = r10
            int r7 = r6.length()
            if (r7 != 0) goto Lea
            yw2 r4 = r5.f()
            r0.e(r4)
            goto Lee
        Lea:
            r5.c(r6)
            goto Lc8
        Lee:
            boolean r4 = r0.Y
            if (r4 != 0) goto Lf3
        Lf2:
            return r8
        Lf3:
            long r4 = r0.X
            long r1 = java.lang.Math.min(r1, r4)
            r4 = r19
            long r1 = super.b0(r4, r1)
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 == 0) goto L109
            long r3 = r0.X
            long r3 = r3 - r1
            r0.X = r3
            return r1
        L109:
            u62 r1 = r3.b
            r1.e()
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "unexpected end of stream"
            r1.<init>(r2)
            yw2 r2 = defpackage.hz2.f
            r0.e(r2)
            throw r1
        L11b:
            java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L13c
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.String r3 = "expected chunk size and optional extensions but was \""
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L13c
            long r5 = r0.X     // Catch: java.lang.NumberFormatException -> L13c
            r2.append(r5)     // Catch: java.lang.NumberFormatException -> L13c
            r2.append(r4)     // Catch: java.lang.NumberFormatException -> L13c
            r0 = 34
            r2.append(r0)     // Catch: java.lang.NumberFormatException -> L13c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> L13c
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L13c
            throw r1     // Catch: java.lang.NumberFormatException -> L13c
        L13c:
            r0 = move-exception
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L147:
            r16 = r5
            java.lang.String r0 = "closed"
            defpackage.i.m(r0)
            return r16
        L14f:
            r16 = r5
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = defpackage.lb1.h(r1, r0)
            defpackage.i.f(r0)
            return r16
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.Y
            if (r0 == 0) goto L26
            java.util.TimeZone r0 = defpackage.az7.a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            r0 = 100
            boolean r0 = defpackage.az7.g(r1, r0)     // Catch: java.io.IOException -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 != 0) goto L26
            hz2 r0 = r1.Z
            u62 r0 = r0.b
            r0.e()
            yw2 r0 = defpackage.hz2.f
            r1.e(r0)
        L26:
            r0 = 1
            r1.L = r0
            return
    }
}
