package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf3  reason: default package */
/* loaded from: classes.dex */
public final class tf3 extends defpackage.vf3 {
    public static final defpackage.sf3 n0 = null;
    public static final defpackage.ef3 o0 = null;
    public final java.util.ArrayList k0;
    public java.lang.String l0;
    public defpackage.ee3 m0;

    static {
            sf3 r0 = new sf3
            r0.<init>()
            defpackage.tf3.n0 = r0
            ef3 r0 = new ef3
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            defpackage.tf3.o0 = r0
            return
    }

    public tf3() {
            r1 = this;
            sf3 r0 = defpackage.tf3.n0
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.k0 = r0
            ve3 r0 = defpackage.ve3.A
            r1.m0 = r0
            return
    }

    @Override // defpackage.vf3
    public final defpackage.vf3 A() {
            r1 = this;
            ve3 r0 = defpackage.ve3.A
            r1.l0(r0)
            return r1
    }

    @Override // defpackage.vf3
    public final void U(double r3) {
            r2 = this;
            ls6 r0 = r2.d0
            ls6 r1 = defpackage.ls6.LENIENT
            if (r0 != r1) goto L7
            goto L13
        L7:
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L20
            boolean r0 = java.lang.Double.isInfinite(r3)
            if (r0 != 0) goto L20
        L13:
            ef3 r0 = new ef3
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0.<init>(r3)
            r2.l0(r0)
            return
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JSON forbids NaN and infinities: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.vf3
    public final void X(long r2) {
            r1 = this;
            ef3 r0 = new ef3
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r2)
            r1.l0(r0)
            return
    }

    @Override // defpackage.vf3
    public final void Z(java.lang.Boolean r2) {
            r1 = this;
            if (r2 != 0) goto L8
            ve3 r2 = defpackage.ve3.A
            r1.l0(r2)
            return
        L8:
            ef3 r0 = new ef3
            r0.<init>(r2)
            r1.l0(r0)
            return
    }

    @Override // defpackage.vf3
    public final void a0(java.lang.Number r4) {
            r3 = this;
            if (r4 != 0) goto L8
            ve3 r4 = defpackage.ve3.A
            r3.l0(r4)
            return
        L8:
            ls6 r0 = r3.d0
            ls6 r1 = defpackage.ls6.LENIENT
            if (r0 != r1) goto Lf
            goto L1f
        Lf:
            double r0 = r4.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L28
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 != 0) goto L28
        L1f:
            ef3 r0 = new ef3
            r0.<init>(r4)
            r3.l0(r0)
            return
        L28:
            java.lang.String r3 = "JSON forbids NaN and infinities: "
            defpackage.e41.w(r4, r3)
            return
    }

    @Override // defpackage.vf3
    public final void c0(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L8
            ve3 r2 = defpackage.ve3.A
            r1.l0(r2)
            return
        L8:
            ef3 r0 = new ef3
            r0.<init>(r2)
            r1.l0(r0)
            return
    }

    @Override // defpackage.vf3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.util.ArrayList r1 = r1.k0
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Le
            ef3 r0 = defpackage.tf3.o0
            r1.add(r0)
            return
        Le:
            java.lang.String r1 = "Incomplete document"
            defpackage.e41.i(r1)
            return
    }

    @Override // defpackage.vf3
    public final void e0(boolean r2) {
            r1 = this;
            ef3 r0 = new ef3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.<init>(r2)
            r1.l0(r0)
            return
    }

    @Override // defpackage.vf3, java.io.Flushable
    public final void flush() {
            r0 = this;
            return
    }

    @Override // defpackage.vf3
    public final void h() {
            r1 = this;
            od3 r0 = new od3
            r0.<init>()
            r1.l0(r0)
            java.util.ArrayList r1 = r1.k0
            r1.add(r0)
            return
    }

    @Override // defpackage.vf3
    public final void k() {
            r1 = this;
            ze3 r0 = new ze3
            r0.<init>()
            r1.l0(r0)
            java.util.ArrayList r1 = r1.k0
            r1.add(r0)
            return
    }

    public final defpackage.ee3 k0() {
            r1 = this;
            java.util.ArrayList r1 = r1.k0
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            ee3 r1 = (defpackage.ee3) r1
            return r1
    }

    public final void l0(defpackage.ee3 r3) {
            r2 = this;
            java.lang.String r0 = r2.l0
            if (r0 == 0) goto L1b
            boolean r0 = r3 instanceof defpackage.ve3
            if (r0 == 0) goto Lc
            boolean r0 = r2.g0
            if (r0 == 0) goto L17
        Lc:
            ee3 r0 = r2.k0()
            ze3 r0 = (defpackage.ze3) r0
            java.lang.String r1 = r2.l0
            r0.d(r1, r3)
        L17:
            r3 = 0
            r2.l0 = r3
            return
        L1b:
            java.util.ArrayList r0 = r2.k0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            r2.m0 = r3
            return
        L26:
            ee3 r2 = r2.k0()
            boolean r0 = r2 instanceof defpackage.od3
            if (r0 == 0) goto L36
            od3 r2 = (defpackage.od3) r2
            java.util.ArrayList r2 = r2.A
            r2.add(r3)
            return
        L36:
            defpackage.e41.m()
            return
    }

    @Override // defpackage.vf3
    public final void r() {
            r2 = this;
            java.util.ArrayList r0 = r2.k0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L22
            java.lang.String r1 = r2.l0
            if (r1 != 0) goto L22
            ee3 r2 = r2.k0()
            boolean r2 = r2 instanceof defpackage.od3
            if (r2 == 0) goto L1e
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r0.remove(r2)
            return
        L1e:
            defpackage.e41.m()
            return
        L22:
            defpackage.e41.m()
            return
    }

    @Override // defpackage.vf3
    public final void u() {
            r2 = this;
            java.util.ArrayList r0 = r2.k0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L22
            java.lang.String r1 = r2.l0
            if (r1 != 0) goto L22
            ee3 r2 = r2.k0()
            boolean r2 = r2 instanceof defpackage.ze3
            if (r2 == 0) goto L1e
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r0.remove(r2)
            return
        L1e:
            defpackage.e41.m()
            return
        L22:
            defpackage.e41.m()
            return
    }

    @Override // defpackage.vf3
    public final void v(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name == null"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.ArrayList r0 = r1.k0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            java.lang.String r0 = r1.l0
            if (r0 != 0) goto L22
            ee3 r0 = r1.k0()
            boolean r0 = r0 instanceof defpackage.ze3
            if (r0 == 0) goto L1c
            r1.l0 = r2
            return
        L1c:
            java.lang.String r1 = "Please begin an object before writing a name."
            defpackage.i.m(r1)
            return
        L22:
            java.lang.String r1 = "Did not expect a name"
            defpackage.i.m(r1)
            return
    }
}
