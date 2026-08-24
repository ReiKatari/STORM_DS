package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he6  reason: default package */
/* loaded from: classes.dex */
public final class he6 extends defpackage.e74 {
    public final float a;
    public final defpackage.ke6 b;
    public final boolean c;
    public final long d;
    public final long e;

    public he6(float r1, defpackage.ke6 r2, boolean r3, long r4, long r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            d50 r0 = new d50
            mc r1 = new mc
            r2 = 24
            r1.<init>(r3, r2)
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof defpackage.he6
            if (r0 != 0) goto L8
            goto L3c
        L8:
            he6 r5 = (defpackage.he6) r5
            float r0 = r4.a
            float r1 = r5.a
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            ke6 r0 = r4.b
            ke6 r1 = r5.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            boolean r0 = r4.c
            boolean r1 = r5.c
            if (r0 == r1) goto L27
            goto L3c
        L27:
            long r0 = r4.d
            long r2 = r5.d
            boolean r0 = defpackage.kt0.d(r0, r2)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            long r0 = r4.e
            long r4 = r5.e
            boolean r4 = defpackage.kt0.d(r0, r4)
            if (r4 != 0) goto L3e
        L3c:
            r4 = 0
            return r4
        L3e:
            r4 = 1
            return r4
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r3) {
            r2 = this;
            d50 r3 = (defpackage.d50) r3
            mc r0 = new mc
            r1 = 24
            r0.<init>(r2, r1)
            r3.k0 = r0
            z64 r2 = r3.A
            boolean r2 = r2.j0
            if (r2 != 0) goto L12
            goto L1f
        L12:
            r2 = 2
            eg4 r2 = defpackage.nc1.d0(r3, r2)
            eg4 r2 = r2.n0
            if (r2 == 0) goto L1f
            r3 = 1
            r2.x1(r0, r3)
        L1f:
            return
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            ke6 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.c
            int r0 = defpackage.xg6.e(r2, r0, r1)
            int r2 = defpackage.kt0.i
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r4.e
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ShadowGraphicsLayerElement(elevation="
            r0.<init>(r1)
            float r1 = r3.a
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", shape="
            r0.append(r1)
            ke6 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", clip="
            r0.append(r1)
            boolean r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", ambientColor="
            r0.append(r1)
            long r1 = r3.d
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", spotColor="
            r0.append(r1)
            long r1 = r3.e
            java.lang.String r3 = defpackage.kt0.j(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
