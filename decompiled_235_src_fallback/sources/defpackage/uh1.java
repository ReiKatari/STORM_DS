package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh1  reason: default package */
/* loaded from: classes.dex */
public final class uh1 implements defpackage.qh1 {
    public final float A;
    public final float B;
    public final defpackage.fj2 L;

    public uh1(float r1, float r2, defpackage.fj2 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            float r0 = r0.B
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            float r0 = r0.A
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.uh1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            uh1 r3 = (defpackage.uh1) r3
            float r0 = r2.A
            float r1 = r3.A
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L2a
        L15:
            float r0 = r2.B
            float r1 = r3.B
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L2a
        L20:
            fj2 r2 = r2.L
            fj2 r3 = r3.L
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.A
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.B
            int r0 = defpackage.xg6.a(r2, r0, r1)
            fj2 r3 = r3.L
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    @Override // defpackage.qh1
    public final long p(float r3) {
            r2 = this;
            fj2 r2 = r2.L
            float r2 = r2.a(r3)
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = defpackage.hi2.J(r2, r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DensityWithConverter(density="
            r0.<init>(r1)
            float r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            float r1 = r2.B
            r0.append(r1)
            java.lang.String r1 = ", converter="
            r0.append(r1)
            fj2 r2 = r2.L
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.qh1
    public final float x(long r5) {
            r4 = this;
            long r0 = defpackage.x47.b(r5)
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = defpackage.y47.a(r0, r2)
            if (r0 == 0) goto L1a
            fj2 r4 = r4.L
            float r5 = defpackage.x47.c(r5)
            float r4 = r4.b(r5)
            return r4
        L1a:
            java.lang.String r4 = "Only Sp can convert to Px"
            defpackage.i.m(r4)
            r4 = 0
            return r4
    }
}
