package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n61  reason: default package */
/* loaded from: classes.dex */
public abstract class n61 extends defpackage.r0 implements defpackage.j61 {
    public static final defpackage.m61 B = null;

    static {
            m61 r0 = new m61
            d90 r1 = defpackage.d90.r0
            vn0 r2 = new vn0
            r3 = 17
            r2.<init>(r3)
            r0.<init>(r1, r2)
            defpackage.n61.B = r0
            return
    }

    public n61() {
            r1 = this;
            d90 r0 = defpackage.d90.r0
            r1.<init>(r0)
            return
    }

    @Override // defpackage.r0, defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.m61
            if (r0 == 0) goto L1e
            m61 r3 = (defpackage.m61) r3
            k61 r0 = r2.A
            if (r0 == r3) goto L13
            k61 r1 = r3.B
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            qn2 r3 = r3.A
            java.lang.Object r3 = r3.g(r2)
            j61 r3 = (defpackage.j61) r3
            if (r3 == 0) goto L24
            goto L22
        L1e:
            d90 r0 = defpackage.d90.r0
            if (r0 != r3) goto L24
        L22:
            vt1 r2 = defpackage.vt1.A
        L24:
            return r2
    }

    @Override // defpackage.r0, defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof defpackage.m61
            r1 = 0
            if (r0 == 0) goto L1f
            m61 r4 = (defpackage.m61) r4
            k61 r0 = r3.A
            if (r0 == r4) goto L14
            k61 r2 = r4.B
            if (r2 != r0) goto L13
            goto L14
        L13:
            return r1
        L14:
            qn2 r4 = r4.A
            java.lang.Object r3 = r4.g(r3)
            j61 r3 = (defpackage.j61) r3
            if (r3 == 0) goto L24
            return r3
        L1f:
            d90 r0 = defpackage.d90.r0
            if (r0 != r4) goto L24
            return r3
        L24:
            return r1
    }

    public abstract void j0(defpackage.l61 r1, java.lang.Runnable r2);

    public void k0(defpackage.l61 r1, java.lang.Runnable r2) {
            r0 = this;
            defpackage.ok1.b(r0, r1, r2)
            return
    }

    public boolean l0(defpackage.l61 r1) {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.dg7
            r0 = r0 ^ 1
            return r0
    }

    public defpackage.n61 m0(int r2) {
            r1 = this;
            defpackage.kn2.u(r2)
            ru3 r0 = new ru3
            r0.<init>(r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r2 = defpackage.nc1.P(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
