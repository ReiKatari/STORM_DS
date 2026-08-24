package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u31  reason: default package */
/* loaded from: classes.dex */
public final class u31 extends defpackage.e74 {
    public final defpackage.lw a;
    public final defpackage.ic b;
    public final defpackage.z31 c;
    public final float d;

    public u31(defpackage.lw r1, defpackage.ic r2, defpackage.z31 r3, float r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            v31 r0 = new v31
            r0.<init>()
            lw r1 = r2.a
            r0.k0 = r1
            ic r1 = r2.b
            r0.l0 = r1
            z31 r1 = r2.c
            r0.m0 = r1
            float r2 = r2.d
            r0.n0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L3
            goto L33
        L3:
            boolean r0 = r4 instanceof defpackage.u31
            r1 = 0
            if (r0 != 0) goto L9
            goto L32
        L9:
            u31 r4 = (defpackage.u31) r4
            lw r0 = r3.a
            lw r2 = r4.a
            if (r0 == r2) goto L12
            return r1
        L12:
            ic r0 = r3.b
            ic r2 = r4.b
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L1d
            goto L32
        L1d:
            z31 r0 = r3.c
            z31 r2 = r4.c
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 != 0) goto L28
            goto L32
        L28:
            float r3 = r3.d
            float r4 = r4.d
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 == 0) goto L33
        L32:
            return r1
        L33:
            r3 = 1
            return r3
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r6) {
            r5 = this;
            v31 r6 = (defpackage.v31) r6
            lw r0 = r6.k0
            long r0 = r0.h()
            lw r2 = r5.a
            long r3 = r2.h()
            boolean r0 = defpackage.xi6.b(r0, r3)
            r6.k0 = r2
            ic r1 = r5.b
            r6.l0 = r1
            z31 r1 = r5.c
            r6.m0 = r1
            float r5 = r5.d
            r6.n0 = r5
            if (r0 != 0) goto L25
            defpackage.xk2.w(r6)
        L25:
            defpackage.f04.I(r6)
            return
    }

    public final int hashCode() {
            r3 = this;
            lw r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            ic r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            z31 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r3 = r3.d
            int r3 = defpackage.xg6.a(r3, r0, r1)
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentPainterElement(painter="
            r0.<init>(r1)
            lw r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", alignment="
            r0.append(r1)
            ic r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", contentScale="
            r0.append(r1)
            z31 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ", colorFilter=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
