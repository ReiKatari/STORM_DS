package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr4  reason: default package */
/* loaded from: classes.dex */
final class tr4 extends defpackage.e74 {
    public final defpackage.sr4 a;
    public final defpackage.ic b;
    public final defpackage.z31 c;
    public final float d;
    public final defpackage.z40 e;

    public tr4(defpackage.sr4 r1, defpackage.ic r2, defpackage.z31 r3, float r4, defpackage.z40 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r2 = this;
            ur4 r0 = new ur4
            r0.<init>()
            sr4 r1 = r2.a
            r0.k0 = r1
            r1 = 1
            r0.l0 = r1
            ic r1 = r2.b
            r0.m0 = r1
            z31 r1 = r2.c
            r0.n0 = r1
            float r1 = r2.d
            r0.o0 = r1
            z40 r2 = r2.e
            r0.p0 = r2
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof defpackage.tr4
            if (r0 != 0) goto L8
            goto L40
        L8:
            tr4 r3 = (defpackage.tr4) r3
            sr4 r0 = r2.a
            sr4 r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            ic r0 = r2.b
            ic r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            z31 r0 = r2.c
            z31 r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            float r0 = r2.d
            float r1 = r3.d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L40
        L36:
            z40 r2 = r2.e
            z40 r3 = r3.e
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r8) {
            r7 = this;
            ur4 r8 = (defpackage.ur4) r8
            boolean r0 = r8.l0
            sr4 r1 = r7.a
            r2 = 1
            if (r0 != r2) goto L1c
            sr4 r0 = r8.k0
            long r3 = r0.h()
            long r5 = r1.h()
            boolean r0 = defpackage.xi6.b(r3, r5)
            if (r0 != 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r8.k0 = r1
            r8.l0 = r2
            ic r1 = r7.b
            r8.m0 = r1
            z31 r1 = r7.c
            r8.n0 = r1
            float r1 = r7.d
            r8.o0 = r1
            z40 r7 = r7.e
            r8.p0 = r7
            if (r0 == 0) goto L36
            defpackage.xk2.w(r8)
        L36:
            defpackage.f04.I(r8)
            return
    }

    public final int hashCode() {
            r3 = this;
            sr4 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 1
            int r0 = defpackage.xg6.e(r0, r2, r1)
            ic r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            z31 r0 = r3.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r3.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            z40 r3 = r3.e
            if (r3 != 0) goto L2a
            r3 = 0
            goto L2e
        L2a:
            int r3 = r3.hashCode()
        L2e:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PainterElement(painter="
            r0.<init>(r1)
            sr4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", sizeToIntrinsics=true, alignment="
            r0.append(r1)
            ic r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", contentScale="
            r0.append(r1)
            z31 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", colorFilter="
            r0.append(r1)
            z40 r2 = r2.e
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
