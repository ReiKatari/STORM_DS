package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd3  reason: default package */
/* loaded from: classes.dex */
public final class zd3 extends defpackage.nw7 {
    public final defpackage.u0 t0;
    public final defpackage.jd1 u0;

    public zd3(defpackage.u0 r1, defpackage.id3 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.t0 = r1
            jd1 r1 = r2.b
            r0.u0 = r1
            return
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final int B() {
            r4 = this;
            u0 r4 = r4.t0
            java.lang.String r0 = r4.m()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L19
            r2 = 10
            mf7 r2 = defpackage.qo2.U(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L19
            if (r2 == 0) goto L15
            int r4 = r2.A     // Catch: java.lang.IllegalArgumentException -> L19
            return r4
        L15:
            defpackage.xs6.a0(r0)     // Catch: java.lang.IllegalArgumentException -> L19
            throw r1     // Catch: java.lang.IllegalArgumentException -> L19
        L19:
            java.lang.String r2 = "Failed to parse type 'UInt' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.i61.k(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.u0.q(r4, r0, r2, r1, r3)
            throw r1
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final long L() {
            r4 = this;
            u0 r4 = r4.t0
            java.lang.String r0 = r4.m()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L17
            rf7 r2 = defpackage.qo2.V(r0)     // Catch: java.lang.IllegalArgumentException -> L17
            if (r2 == 0) goto L13
            long r0 = r2.A     // Catch: java.lang.IllegalArgumentException -> L17
            return r0
        L13:
            defpackage.xs6.a0(r0)     // Catch: java.lang.IllegalArgumentException -> L17
            throw r1     // Catch: java.lang.IllegalArgumentException -> L17
        L17:
            java.lang.String r2 = "Failed to parse type 'ULong' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.i61.k(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.u0.q(r4, r0, r2, r1, r3)
            throw r1
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final byte Y() {
            r4 = this;
            u0 r4 = r4.t0
            java.lang.String r0 = r4.m()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L19
            r2 = 10
            ze7 r2 = defpackage.qo2.T(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L19
            if (r2 == 0) goto L15
            byte r4 = r2.A     // Catch: java.lang.IllegalArgumentException -> L19
            return r4
        L15:
            defpackage.xs6.a0(r0)     // Catch: java.lang.IllegalArgumentException -> L19
            throw r1     // Catch: java.lang.IllegalArgumentException -> L19
        L19:
            java.lang.String r2 = "Failed to parse type 'UByte' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.i61.k(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.u0.q(r4, r0, r2, r1, r3)
            throw r1
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final short Z() {
            r5 = this;
            u0 r5 = r5.t0
            java.lang.String r0 = r5.m()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L32
            r2 = 10
            mf7 r2 = defpackage.qo2.U(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r2 == 0) goto L28
            int r2 = r2.A     // Catch: java.lang.IllegalArgumentException -> L32
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 ^ r2
            r4 = -2147418113(0xffffffff8000ffff, float:-9.1834E-41)
            int r3 = java.lang.Integer.compare(r3, r4)     // Catch: java.lang.IllegalArgumentException -> L32
            if (r3 <= 0) goto L21
            goto L28
        L21:
            short r2 = (short) r2     // Catch: java.lang.IllegalArgumentException -> L32
            xf7 r3 = new xf7     // Catch: java.lang.IllegalArgumentException -> L32
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L29
        L28:
            r3 = r1
        L29:
            if (r3 == 0) goto L2e
            short r5 = r3.A     // Catch: java.lang.IllegalArgumentException -> L32
            return r5
        L2e:
            defpackage.xs6.a0(r0)     // Catch: java.lang.IllegalArgumentException -> L32
            throw r1     // Catch: java.lang.IllegalArgumentException -> L32
        L32:
            java.lang.String r2 = "Failed to parse type 'UShort' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.i61.k(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.u0.q(r5, r0, r2, r1, r3)
            throw r1
    }

    @Override // defpackage.ux0
    public final defpackage.jd1 b() {
            r0 = this;
            jd1 r0 = r0.u0
            return r0
    }

    @Override // defpackage.ux0
    public final int q(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }
}
