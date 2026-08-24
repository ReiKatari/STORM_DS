package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw  reason: default package */
/* loaded from: classes.dex */
public final class nw {
    public final java.lang.Object a;
    public final defpackage.w31 b;
    public final defpackage.pe5 c;

    public nw(java.lang.Object r1, defpackage.w31 r2, defpackage.pe5 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto Lbe
        L5:
            boolean r1 = r7 instanceof defpackage.nw
            r2 = 0
            if (r1 == 0) goto Lbf
            nw r7 = (defpackage.nw) r7
            java.lang.Object r1 = r7.a
            w31 r3 = r6.b
            r3.getClass()
            java.lang.Object r3 = r6.a
            if (r3 != r1) goto L1a
        L17:
            r1 = r0
            goto Lb2
        L1a:
            boolean r4 = r3 instanceof defpackage.z23
            if (r4 == 0) goto Lae
            boolean r4 = r1 instanceof defpackage.z23
            if (r4 != 0) goto L24
            goto Lae
        L24:
            z23 r3 = (defpackage.z23) r3
            android.content.Context r4 = r3.a
            z23 r1 = (defpackage.z23) r1
            android.content.Context r5 = r1.a
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r3.b
            java.lang.Object r5 = r1.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lac
            c44 r4 = r3.e
            c44 r5 = r1.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto Lac
            android.graphics.Bitmap$Config r4 = r3.f
            android.graphics.Bitmap$Config r5 = r1.f
            if (r4 != r5) goto Lac
            java.util.List r4 = r3.h
            java.util.List r5 = r1.h
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto Lac
            yw2 r4 = r3.j
            yw2 r5 = r1.j
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto Lac
            boolean r4 = r3.l
            boolean r5 = r1.l
            if (r4 != r5) goto Lac
            boolean r4 = r3.m
            boolean r5 = r1.m
            if (r4 != r5) goto Lac
            boolean r4 = r3.n
            boolean r5 = r1.n
            if (r4 != r5) goto Lac
            boolean r4 = r3.o
            boolean r5 = r1.o
            if (r4 != r5) goto Lac
            ra0 r4 = r3.p
            ra0 r5 = r1.p
            if (r4 != r5) goto Lac
            ra0 r4 = r3.q
            ra0 r5 = r1.q
            if (r4 != r5) goto Lac
            ra0 r4 = r3.r
            ra0 r5 = r1.r
            if (r4 != r5) goto Lac
            fj6 r4 = r3.x
            fj6 r5 = r1.x
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lac
            y56 r4 = r3.y
            y56 r5 = r1.y
            if (r4 != r5) goto Lac
            n05 r4 = r3.g
            n05 r5 = r1.g
            if (r4 != r5) goto Lac
            ps4 r3 = r3.z
            ps4 r1 = r1.z
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lac
            goto L17
        Lac:
            r1 = r2
            goto Lb2
        Lae:
            boolean r1 = defpackage.nb3.k(r3, r1)
        Lb2:
            if (r1 == 0) goto Lbf
            pe5 r6 = r6.c
            pe5 r7 = r7.c
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lbf
        Lbe:
            return r0
        Lbf:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            w31 r0 = r5.b
            r0.getClass()
            java.lang.Object r0 = r5.a
            boolean r1 = r0 instanceof defpackage.z23
            r2 = 0
            r3 = 31
            if (r1 != 0) goto L16
            if (r0 == 0) goto L9e
            int r2 = r0.hashCode()
            goto L9e
        L16:
            z23 r0 = (defpackage.z23) r0
            android.content.Context r1 = r0.a
            int r1 = r1.hashCode()
            int r1 = r1 * r3
            java.lang.Object r4 = r0.b
            int r4 = r4.hashCode()
            int r4 = r4 + r1
            int r4 = r4 * 961
            c44 r1 = r0.e
            if (r1 == 0) goto L30
            int r2 = r1.hashCode()
        L30:
            int r4 = r4 + r2
            int r4 = r4 * 961
            android.graphics.Bitmap$Config r1 = r0.f
            int r1 = r1.hashCode()
            int r1 = r1 + r4
            int r1 = r1 * 961
            java.util.List r2 = r0.h
            int r1 = defpackage.i61.b(r1, r2, r3)
            yw2 r2 = r0.j
            java.lang.String[] r2 = r2.A
            int r2 = java.util.Arrays.hashCode(r2)
            int r1 = r1 + r2
            int r1 = r1 * r3
            boolean r2 = r0.l
            int r1 = defpackage.xg6.e(r1, r2, r3)
            boolean r2 = r0.m
            int r1 = defpackage.xg6.e(r1, r2, r3)
            boolean r2 = r0.n
            int r1 = defpackage.xg6.e(r1, r2, r3)
            boolean r2 = r0.o
            int r1 = defpackage.xg6.e(r1, r2, r3)
            ra0 r2 = r0.p
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * r3
            ra0 r1 = r0.q
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * r3
            ra0 r2 = r0.r
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * r3
            fj6 r1 = r0.x
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * r3
            y56 r2 = r0.y
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * r3
            n05 r1 = r0.g
            int r1 = r1.hashCode()
            int r1 = r1 + r2
            int r1 = r1 * r3
            ps4 r0 = r0.z
            java.util.Map r0 = r0.A
            int r0 = r0.hashCode()
            int r2 = r0 + r1
        L9e:
            int r2 = r2 * r3
            pe5 r5 = r5.c
            int r5 = r5.hashCode()
            int r5 = r5 + r2
            return r5
    }
}
