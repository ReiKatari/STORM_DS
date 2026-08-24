package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv2  reason: default package */
/* loaded from: classes.dex */
public final class jv2 extends defpackage.n61 implements defpackage.ug1 {
    public final android.os.Handler L;
    public final java.lang.String R;
    public final boolean X;
    public final defpackage.jv2 Y;

    public jv2(android.os.Handler r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public jv2(android.os.Handler r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.X = r4
            if (r4 == 0) goto Ld
            r4 = r1
            goto L13
        Ld:
            jv2 r4 = new jv2
            r0 = 1
            r4.<init>(r2, r3, r0)
        L13:
            r1.Y = r4
            return
    }

    @Override // defpackage.ug1
    public final defpackage.il1 A(long r4, java.lang.Runnable r6, defpackage.l61 r7) {
            r3 = this;
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto La
            r4 = r0
        La:
            android.os.Handler r0 = r3.L
            boolean r4 = r0.postDelayed(r6, r4)
            if (r4 == 0) goto L18
            iv2 r4 = new iv2
            r4.<init>(r3, r6)
            return r4
        L18:
            r3.n0(r7, r6)
            lg4 r3 = defpackage.lg4.A
            return r3
    }

    @Override // defpackage.ug1
    public final void J(long r5, defpackage.rj0 r7) {
            r4 = this;
            mf r0 = new mf
            r1 = 23
            r0.<init>(r1, r7, r4)
            r1 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L11
            r5 = r1
        L11:
            android.os.Handler r1 = r4.L
            boolean r5 = r1.postDelayed(r0, r5)
            if (r5 == 0) goto L23
            bi2 r5 = new bi2
            r6 = 6
            r5.<init>(r6, r4, r0)
            r7.z(r5)
            return
        L23:
            l61 r5 = r7.X
            r4.n0(r5, r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.jv2
            if (r0 == 0) goto L14
            jv2 r3 = (defpackage.jv2) r3
            android.os.Handler r0 = r3.L
            android.os.Handler r1 = r2.L
            if (r0 != r1) goto L14
            boolean r3 = r3.X
            boolean r2 = r2.X
            if (r3 != r2) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.os.Handler r0 = r1.L
            int r0 = java.lang.System.identityHashCode(r0)
            boolean r1 = r1.X
            if (r1 == 0) goto Ld
            r1 = 1231(0x4cf, float:1.725E-42)
            goto Lf
        Ld:
            r1 = 1237(0x4d5, float:1.733E-42)
        Lf:
            r1 = r1 ^ r0
            return r1
    }

    @Override // defpackage.n61
    public final void j0(defpackage.l61 r2, java.lang.Runnable r3) {
            r1 = this;
            android.os.Handler r0 = r1.L
            boolean r0 = r0.post(r3)
            if (r0 != 0) goto Lb
            r1.n0(r2, r3)
        Lb:
            return
    }

    @Override // defpackage.n61
    public final boolean l0(defpackage.l61 r1) {
            r0 = this;
            boolean r1 = r0.X
            if (r1 == 0) goto L17
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r0 = r0.L
            android.os.Looper r0 = r0.getLooper()
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            return r0
        L17:
            r0 = 1
            return r0
    }

    @Override // defpackage.n61
    public final defpackage.n61 m0(int r1) {
            r0 = this;
            r1 = 1
            defpackage.kn2.u(r1)
            return r0
    }

    public final void n0(defpackage.l61 r4, java.lang.Runnable r5) {
            r3 = this;
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The task was rejected, the handler underlying the dispatcher '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' was closed"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            defpackage.yh2.m(r4, r0)
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            r3.j0(r4, r5)
            return
    }

    @Override // defpackage.n61
    public final java.lang.String toString() {
            r2 = this;
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            if (r2 != r0) goto L9
            java.lang.String r0 = "Dispatchers.Main"
            goto L14
        L9:
            r1 = 0
            jv2 r0 = r0.Y     // Catch: java.lang.UnsupportedOperationException -> Ld
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r2 != r0) goto L13
            java.lang.String r0 = "Dispatchers.Main.immediate"
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 != 0) goto L36
            java.lang.String r0 = r2.R
            if (r0 != 0) goto L20
            android.os.Handler r0 = r2.L
            java.lang.String r0 = r0.toString()
        L20:
            boolean r2 = r2.X
            if (r2 == 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ".immediate"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r0 = r2
        L36:
            return r0
    }
}
