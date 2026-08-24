package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc4  reason: default package */
/* loaded from: classes.dex */
public class mc4 extends defpackage.ic4 implements java.lang.Iterable, defpackage.zf3 {
    public static final /* synthetic */ int Z = 0;
    public final defpackage.dk0 Y;

    public mc4(defpackage.qc4 r1) {
            r0 = this;
            r0.<init>(r1)
            dk0 r1 = new dk0
            r1.<init>(r0)
            r0.Y = r1
            return
    }

    @Override // defpackage.ic4
    public final defpackage.hc4 d(defpackage.m44 r4) {
            r3 = this;
            hc4 r0 = super.d(r4)
            dk0 r3 = r3.Y
            r3.getClass()
            java.lang.Object r1 = r3.R
            mc4 r1 = (defpackage.mc4) r1
            r2 = 0
            hc4 r3 = r3.v(r0, r4, r2, r1)
            return r3
    }

    @Override // defpackage.ic4
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L64
        L3:
            if (r4 == 0) goto L66
            boolean r0 = r4 instanceof defpackage.mc4
            if (r0 != 0) goto La
            goto L66
        La:
            boolean r0 = super.equals(r4)
            if (r0 == 0) goto L66
            dk0 r3 = r3.Y
            java.lang.Object r0 = r3.X
            un6 r0 = (defpackage.un6) r0
            int r0 = r0.f()
            mc4 r4 = (defpackage.mc4) r4
            dk0 r4 = r4.Y
            java.lang.Object r1 = r4.X
            un6 r1 = (defpackage.un6) r1
            int r1 = r1.f()
            if (r0 != r1) goto L66
            int r0 = r3.L
            int r1 = r4.L
            if (r0 != r1) goto L66
            java.lang.Object r3 = r3.X
            un6 r3 = (defpackage.un6) r3
            r3.getClass()
            w0 r0 = new w0
            r1 = 5
            r0.<init>(r3, r1)
            qb6 r3 = defpackage.sb6.Y(r0)
            f11 r3 = (defpackage.f11) r3
            java.util.Iterator r3 = r3.iterator()
        L45:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r3.next()
            ic4 r0 = (defpackage.ic4) r0
            java.lang.Object r1 = r4.X
            un6 r1 = (defpackage.un6) r1
            z9 r2 = r0.B
            int r2 = r2.a
            java.lang.Object r1 = r1.c(r2)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L45
            goto L66
        L64:
            r3 = 1
            return r3
        L66:
            r3 = 0
            return r3
    }

    public final defpackage.hc4 f(defpackage.m44 r3, defpackage.ic4 r4) {
            r2 = this;
            hc4 r0 = super.d(r3)
            dk0 r2 = r2.Y
            r1 = 1
            hc4 r2 = r2.v(r0, r3, r1, r4)
            return r2
    }

    public final defpackage.hc4 g(java.lang.String r7, boolean r8, defpackage.ic4 r9) {
            r6 = this;
            dk0 r6 = r6.Y
            r6.getClass()
            java.lang.Object r6 = r6.R
            mc4 r6 = (defpackage.mc4) r6
            z9 r0 = r6.B
            hc4 r0 = r0.l(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r6.iterator()
        L18:
            r3 = r2
            oc4 r3 = (defpackage.oc4) r3
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L4a
            java.lang.Object r3 = r3.next()
            ic4 r3 = (defpackage.ic4) r3
            boolean r4 = defpackage.nb3.k(r3, r9)
            if (r4 == 0) goto L2f
            goto L44
        L2f:
            boolean r4 = r3 instanceof defpackage.mc4
            if (r4 == 0) goto L3b
            mc4 r3 = (defpackage.mc4) r3
            r4 = 0
            hc4 r5 = r3.g(r7, r4, r6)
            goto L44
        L3b:
            r3.getClass()
            z9 r3 = r3.B
            hc4 r5 = r3.l(r7)
        L44:
            if (r5 == 0) goto L18
            r1.add(r5)
            goto L18
        L4a:
            java.lang.Comparable r1 = defpackage.gt0.S0(r1)
            hc4 r1 = (defpackage.hc4) r1
            mc4 r2 = r6.L
            if (r2 == 0) goto L61
            if (r8 == 0) goto L61
            boolean r8 = r2.equals(r9)
            if (r8 != 0) goto L61
            r8 = 1
            hc4 r5 = r2.g(r7, r8, r6)
        L61:
            hc4[] r6 = new defpackage.hc4[]{r0, r1, r5}
            java.util.ArrayList r6 = defpackage.fv.C0(r6)
            java.lang.Comparable r6 = defpackage.gt0.S0(r6)
            hc4 r6 = (defpackage.hc4) r6
            return r6
    }

    @Override // defpackage.ic4
    public final int hashCode() {
            r5 = this;
            dk0 r5 = r5.Y
            int r0 = r5.L
            java.lang.Object r5 = r5.X
            un6 r5 = (defpackage.un6) r5
            int r1 = r5.f()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L26
            int r3 = r5.d(r2)
            java.lang.Object r4 = r5.g(r2)
            ic4 r4 = (defpackage.ic4) r4
            int r0 = r0 * 31
            int r0 = r0 + r3
            int r0 = r0 * 31
            int r3 = r4.hashCode()
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto Ld
        L26:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            dk0 r1 = r1.Y
            r1.getClass()
            oc4 r0 = new oc4
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.ic4
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            dk0 r3 = r3.Y
            java.lang.Object r1 = r3.Y
            java.lang.String r1 = (java.lang.String) r1
            r3.getClass()
            if (r1 == 0) goto L24
            boolean r2 = defpackage.qs6.v0(r1)
            if (r2 == 0) goto L1e
            goto L24
        L1e:
            r2 = 1
            ic4 r1 = r3.m(r1, r2)
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 != 0) goto L2d
            int r1 = r3.L
            ic4 r1 = r3.l(r1)
        L2d:
            java.lang.String r2 = " startDestination="
            r0.append(r2)
            if (r1 != 0) goto L60
            java.lang.Object r1 = r3.Y
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3e
            r0.append(r1)
            goto L71
        L3e:
            java.lang.Object r1 = r3.B
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L48
            r0.append(r1)
            goto L71
        L48:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "0x"
            r1.<init>(r2)
            int r3 = r3.L
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            goto L71
        L60:
            java.lang.String r3 = "{"
            r0.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
        L71:
            java.lang.String r3 = r0.toString()
            return r3
    }
}
