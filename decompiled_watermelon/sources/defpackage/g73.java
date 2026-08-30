package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g73  reason: default package */
/* loaded from: classes.dex */
public final class g73 extends ct3 {
    public final t0 o0;
    public final vn1 p0;

    public g73(t0 t0Var, t63 t63Var) {
        t63Var.getClass();
        this.o0 = t0Var;
        this.p0 = t63Var.b;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final int L() {
        t0 t0Var = this.o0;
        String m = t0Var.m();
        try {
            m.getClass();
            r17 d0 = nl2.d0(10, m);
            if (d0 != null) {
                return d0.A;
            }
            gh6.h0(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.q(t0Var, b31.n('\'', "Failed to parse type 'UInt' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ct3, defpackage.b91
    public final byte Q() {
        t0 t0Var = this.o0;
        String m = t0Var.m();
        try {
            m.getClass();
            e17 c0 = nl2.c0(10, m);
            if (c0 != null) {
                return c0.A;
            }
            gh6.h0(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.q(t0Var, b31.n('\'', "Failed to parse type 'UByte' for input '", m), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:11:0x002b, B:13:0x002e, B:14:0x0031), top: B:17:0x0007 }] */
    @Override // defpackage.ct3, defpackage.b91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final short W() {
        /*
            r5 = this;
            t0 r5 = r5.o0
            java.lang.String r0 = r5.m()
            r1 = 0
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L32
            r2 = 10
            r17 r2 = defpackage.nl2.d0(r2, r0)     // Catch: java.lang.IllegalArgumentException -> L32
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
            c27 r3 = new c27     // Catch: java.lang.IllegalArgumentException -> L32
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L29
        L28:
            r3 = r1
        L29:
            if (r3 == 0) goto L2e
            short r5 = r3.A     // Catch: java.lang.IllegalArgumentException -> L32
            return r5
        L2e:
            defpackage.gh6.h0(r0)     // Catch: java.lang.IllegalArgumentException -> L32
            throw r1     // Catch: java.lang.IllegalArgumentException -> L32
        L32:
            java.lang.String r2 = "Failed to parse type 'UShort' for input '"
            r3 = 39
            java.lang.String r0 = defpackage.b31.n(r3, r2, r0)
            r2 = 0
            r3 = 6
            defpackage.t0.q(r5, r0, r2, r1, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g73.W():short");
    }

    @Override // defpackage.yu0
    public final vn1 b() {
        return this.p0;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final long e() {
        t0 t0Var = this.o0;
        String m = t0Var.m();
        try {
            m.getClass();
            w17 e0 = nl2.e0(m);
            if (e0 != null) {
                return e0.A;
            }
            gh6.h0(m);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.q(t0Var, b31.n('\'', "Failed to parse type 'ULong' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        throw new IllegalStateException("unsupported");
    }
}
