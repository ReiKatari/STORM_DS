package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uz0  reason: default package */
/* loaded from: classes.dex */
public final class uz0 implements defpackage.qz0 {
    public final defpackage.iz4 A;
    public final defpackage.iz4 B;
    public final defpackage.d90 L;
    public final java.lang.ThreadLocal R;
    public volatile boolean X;
    public final long Y;
    public final int Z;

    public uz0(defpackage.u63 r4) {
            r3 = this;
            r3.<init>()
            d90 r0 = new d90
            r1 = 29
            r0.<init>(r1)
            r3.L = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r3.R = r0
            jd1 r0 = defpackage.oq1.B
            r0 = 30
            uq1 r1 = defpackage.uq1.SECONDS
            long r0 = defpackage.n16.L(r0, r1)
            r3.Y = r0
            r0 = 2
            r3.Z = r0
            iz4 r0 = new iz4
            a5 r1 = new a5
            r2 = 18
            r1.<init>(r4, r2)
            r4 = 1
            r0.<init>(r4, r1)
            r3.A = r0
            r3.B = r0
            return
    }

    public uz0(defpackage.u63 r4, java.lang.String r5, int r6) {
            r3 = this;
            r5.getClass()
            r3.<init>()
            d90 r0 = new d90
            r1 = 29
            r0.<init>(r1)
            r3.L = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r3.R = r0
            jd1 r0 = defpackage.oq1.B
            r0 = 30
            uq1 r1 = defpackage.uq1.SECONDS
            long r0 = defpackage.n16.L(r0, r1)
            r3.Y = r0
            r0 = 2
            r3.Z = r0
            if (r6 <= 0) goto L42
            iz4 r0 = new iz4
            rz0 r1 = new rz0
            r2 = 0
            r1.<init>(r4, r5, r2)
            r0.<init>(r6, r1)
            r3.A = r0
            iz4 r6 = new iz4
            rz0 r0 = new rz0
            r1 = 1
            r0.<init>(r4, r5, r1)
            r6.<init>(r1, r0)
            r3.B = r6
            return
        L42:
            java.lang.String r3 = "Maximum number of readers must be greater than 0"
            defpackage.i.h(r3)
            r3 = 0
            throw r3
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.X
            if (r0 != 0) goto L11
            r0 = 1
            r1.X = r0
            iz4 r0 = r1.A
            r0.c()
            iz4 r1 = r1.B
            r1.c()
        L11:
            return
    }

    @Override // defpackage.qz0
    public final java.lang.Object s(boolean r18, defpackage.eo2 r19, defpackage.s41 r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof defpackage.tz0
            if (r4 == 0) goto L1b
            r4 = r3
            tz0 r4 = (defpackage.tz0) r4
            int r5 = r4.i0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.i0 = r5
            goto L20
        L1b:
            tz0 r4 = new tz0
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.g0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.i0
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r6 == 0) goto L7c
            if (r6 == r11) goto L78
            if (r6 == r10) goto L74
            if (r6 == r9) goto L51
            if (r6 != r8) goto L4b
            java.lang.Object r0 = r4.Y
            r1 = r0
            dh5 r1 = (defpackage.dh5) r1
            java.lang.Object r0 = r4.X
            r2 = r0
            iz4 r2 = (defpackage.iz4) r2
            defpackage.oi2.Y(r3)     // Catch: java.lang.Throwable -> L46
            goto L180
        L46:
            r0 = move-exception
            r6 = r1
            r1 = r0
            goto L1b5
        L4b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r12
        L51:
            boolean r1 = r4.R
            d90 r2 = r4.f0
            dh5 r6 = r4.e0
            l61 r9 = r4.d0
            dh5 r10 = r4.Z
            java.lang.Object r13 = r4.Y
            iz4 r13 = (defpackage.iz4) r13
            java.lang.Object r14 = r4.X
            eo2 r14 = (defpackage.eo2) r14
            defpackage.oi2.Y(r3)     // Catch: java.lang.Throwable -> L6e
            r16 = r9
            r9 = r6
            r6 = r10
            r10 = r16
            goto L124
        L6e:
            r0 = move-exception
            r1 = r0
            r6 = r10
        L71:
            r2 = r13
            goto L1b5
        L74:
            defpackage.oi2.Y(r3)
            return r3
        L78:
            defpackage.oi2.Y(r3)
            return r3
        L7c:
            defpackage.oi2.Y(r3)
            boolean r3 = r0.X
            if (r3 != 0) goto L1e3
            java.lang.ThreadLocal r3 = r0.R
            java.lang.Object r3 = r3.get()
            rz4 r3 = (defpackage.rz4) r3
            if (r3 != 0) goto La0
            l61 r3 = r4.B
            r3.getClass()
            d90 r6 = r0.L
            j61 r3 = r3.Z(r6)
            pz0 r3 = (defpackage.pz0) r3
            if (r3 == 0) goto L9f
            rz4 r3 = r3.B
            goto La0
        L9f:
            r3 = r12
        La0:
            if (r3 == 0) goto Lee
            if (r1 != 0) goto Laf
            boolean r1 = r3.c
            if (r1 != 0) goto La9
            goto Laf
        La9:
            java.lang.String r0 = "Cannot upgrade connection from reader to writer"
            defpackage.ii2.T(r11, r0)
            throw r12
        Laf:
            l61 r1 = r4.B
            r1.getClass()
            d90 r6 = r0.L
            j61 r1 = r1.Z(r6)
            if (r1 != 0) goto Le3
            pz0 r1 = new pz0
            d90 r6 = r0.L
            r1.<init>(r6, r3)
            java.lang.ThreadLocal r0 = r0.R
            r0.getClass()
            l57 r6 = new l57
            r6.<init>(r3, r0)
            l61 r0 = defpackage.jw2.y(r1, r6)
            z r1 = new z
            r6 = 24
            r1.<init>(r2, r3, r12, r6)
            r4.i0 = r11
            java.lang.Object r0 = defpackage.hv.d0(r0, r1, r4)
            if (r0 != r5) goto Le2
            goto L17d
        Le2:
            return r0
        Le3:
            r4.i0 = r10
            java.lang.Object r0 = r2.o(r3, r4)
            if (r0 != r5) goto Led
            goto L17d
        Led:
            return r0
        Lee:
            if (r1 == 0) goto Lf3
            iz4 r3 = r0.A
            goto Lf5
        Lf3:
            iz4 r3 = r0.B
        Lf5:
            dh5 r6 = new dh5
            r6.<init>()
            l61 r10 = r4.B     // Catch: java.lang.Throwable -> L1b2
            r10.getClass()     // Catch: java.lang.Throwable -> L1b2
            d90 r13 = r0.L     // Catch: java.lang.Throwable -> L1b2
            long r14 = r0.Y     // Catch: java.lang.Throwable -> L1b2
            sz0 r11 = new sz0     // Catch: java.lang.Throwable -> L1b2
            r11.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1b2
            r4.X = r2     // Catch: java.lang.Throwable -> L1b2
            r4.Y = r3     // Catch: java.lang.Throwable -> L1b2
            r4.Z = r6     // Catch: java.lang.Throwable -> L1b2
            r4.d0 = r10     // Catch: java.lang.Throwable -> L1b2
            r4.e0 = r6     // Catch: java.lang.Throwable -> L1b2
            r4.f0 = r13     // Catch: java.lang.Throwable -> L1b2
            r4.R = r1     // Catch: java.lang.Throwable -> L1b2
            r4.i0 = r9     // Catch: java.lang.Throwable -> L1b2
            java.lang.Object r9 = r3.b(r14, r11, r4)     // Catch: java.lang.Throwable -> L1b2
            if (r9 != r5) goto L11f
            goto L17d
        L11f:
            r14 = r2
            r2 = r13
            r13 = r3
            r3 = r9
            r9 = r6
        L124:
            b01 r3 = (defpackage.b01) r3     // Catch: java.lang.Throwable -> L1a6
            r3.getClass()     // Catch: java.lang.Throwable -> L1a6
            r10.getClass()     // Catch: java.lang.Throwable -> L1a6
            r3.L = r10     // Catch: java.lang.Throwable -> L1a6
            java.lang.Throwable r10 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L1a6
            r10.<init>()     // Catch: java.lang.Throwable -> L1a6
            r3.R = r10     // Catch: java.lang.Throwable -> L1a6
            iz4 r10 = r0.A     // Catch: java.lang.Throwable -> L1a6
            iz4 r11 = r0.B     // Catch: java.lang.Throwable -> L1a6
            if (r10 == r11) goto L13f
            if (r1 == 0) goto L13f
            r1 = 1
            goto L140
        L13f:
            r1 = 0
        L140:
            rz4 r10 = new rz4     // Catch: java.lang.Throwable -> L1a6
            r10.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L1a6
            r9.A = r10     // Catch: java.lang.Throwable -> L1a6
            java.lang.Object r1 = r6.A     // Catch: java.lang.Throwable -> L1a6
            if (r1 == 0) goto L1aa
            rz4 r1 = (defpackage.rz4) r1     // Catch: java.lang.Throwable -> L1a6
            pz0 r2 = new pz0     // Catch: java.lang.Throwable -> L1a6
            d90 r3 = r0.L     // Catch: java.lang.Throwable -> L1a6
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1a6
            java.lang.ThreadLocal r0 = r0.R     // Catch: java.lang.Throwable -> L1a6
            r0.getClass()     // Catch: java.lang.Throwable -> L1a6
            l57 r3 = new l57     // Catch: java.lang.Throwable -> L1a6
            r3.<init>(r1, r0)     // Catch: java.lang.Throwable -> L1a6
            l61 r0 = defpackage.jw2.y(r2, r3)     // Catch: java.lang.Throwable -> L1a6
            z r1 = new z     // Catch: java.lang.Throwable -> L1a6
            r2 = 25
            r1.<init>(r14, r6, r12, r2)     // Catch: java.lang.Throwable -> L1a6
            r4.X = r13     // Catch: java.lang.Throwable -> L1a6
            r4.Y = r6     // Catch: java.lang.Throwable -> L1a6
            r4.Z = r12     // Catch: java.lang.Throwable -> L1a6
            r4.d0 = r12     // Catch: java.lang.Throwable -> L1a6
            r4.e0 = r12     // Catch: java.lang.Throwable -> L1a6
            r4.f0 = r12     // Catch: java.lang.Throwable -> L1a6
            r4.i0 = r8     // Catch: java.lang.Throwable -> L1a6
            java.lang.Object r3 = defpackage.hv.d0(r0, r1, r4)     // Catch: java.lang.Throwable -> L1a6
            if (r3 != r5) goto L17e
        L17d:
            return r5
        L17e:
            r1 = r6
            r2 = r13
        L180:
            java.lang.Object r0 = r1.A
            rz4 r0 = (defpackage.rz4) r0
            if (r0 == 0) goto L1a5
            boolean r1 = r0.e
            if (r1 != 0) goto L19c
            r1 = 1
            r0.e = r1
            b01 r1 = r0.b
            e36 r1 = r1.A
            boolean r1 = r1.Y()
            if (r1 == 0) goto L19c
            b01 r1 = r0.b
            defpackage.ii2.s(r1, r7)
        L19c:
            b01 r0 = r0.b
            r0.L = r12
            r0.R = r12
            r2.e(r0)
        L1a5:
            return r3
        L1a6:
            r0 = move-exception
            r1 = r0
            goto L71
        L1aa:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1a6
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1a6
            throw r1     // Catch: java.lang.Throwable -> L1a6
        L1b2:
            r0 = move-exception
            r1 = r0
            r2 = r3
        L1b5:
            throw r1     // Catch: java.lang.Throwable -> L1b6
        L1b6:
            r0 = move-exception
            r3 = r0
            java.lang.Object r0 = r6.A     // Catch: java.lang.Throwable -> L1de
            rz4 r0 = (defpackage.rz4) r0     // Catch: java.lang.Throwable -> L1de
            if (r0 == 0) goto L1e2
            boolean r4 = r0.e     // Catch: java.lang.Throwable -> L1de
            if (r4 != 0) goto L1d4
            r4 = 1
            r0.e = r4     // Catch: java.lang.Throwable -> L1de
            b01 r4 = r0.b     // Catch: java.lang.Throwable -> L1de
            e36 r4 = r4.A     // Catch: java.lang.Throwable -> L1de
            boolean r4 = r4.Y()     // Catch: java.lang.Throwable -> L1de
            if (r4 == 0) goto L1d4
            b01 r4 = r0.b     // Catch: java.lang.Throwable -> L1de
            defpackage.ii2.s(r4, r7)     // Catch: java.lang.Throwable -> L1de
        L1d4:
            b01 r0 = r0.b     // Catch: java.lang.Throwable -> L1de
            r0.L = r12     // Catch: java.lang.Throwable -> L1de
            r0.R = r12     // Catch: java.lang.Throwable -> L1de
            r2.e(r0)     // Catch: java.lang.Throwable -> L1de
            goto L1e2
        L1de:
            r0 = move-exception
            defpackage.mb3.q(r1, r0)
        L1e2:
            throw r3
        L1e3:
            r0 = 21
            java.lang.String r1 = "Connection pool is closed"
            defpackage.ii2.T(r0, r1)
            throw r12
    }
}
