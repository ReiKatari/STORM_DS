package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu6  reason: default package */
/* loaded from: classes.dex */
public final class bu6 extends defpackage.a33 {
    public final android.graphics.drawable.Drawable a;
    public final defpackage.z23 b;
    public final defpackage.zb1 c;
    public final defpackage.c44 d;
    public final java.lang.String e;
    public final boolean f;
    public final boolean g;

    public bu6(android.graphics.drawable.Drawable r1, defpackage.z23 r2, defpackage.zb1 r3, defpackage.c44 r4, java.lang.String r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    @Override // defpackage.a33
    public final android.graphics.drawable.Drawable a() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.a
            return r0
    }

    @Override // defpackage.a33
    public final defpackage.z23 b() {
            r0 = this;
            z23 r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.bu6
            if (r1 == 0) goto L45
            bu6 r4 = (defpackage.bu6) r4
            android.graphics.drawable.Drawable r1 = r4.a
            android.graphics.drawable.Drawable r2 = r3.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L45
            z23 r1 = r3.b
            z23 r2 = r4.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L45
            zb1 r1 = r3.c
            zb1 r2 = r4.c
            if (r1 != r2) goto L45
            c44 r1 = r3.d
            c44 r2 = r4.d
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L45
            java.lang.String r1 = r3.e
            java.lang.String r2 = r4.e
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L45
            boolean r1 = r3.f
            boolean r2 = r4.f
            if (r1 != r2) goto L45
            boolean r3 = r3.g
            boolean r4 = r4.g
            if (r3 != r4) goto L45
            return r0
        L45:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            z23 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            zb1 r0 = r4.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            c44 r3 = r4.d
            if (r3 == 0) goto L23
            int r3 = r3.hashCode()
            goto L24
        L23:
            r3 = r2
        L24:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.e
            if (r3 == 0) goto L2e
            int r2 = r3.hashCode()
        L2e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r4 = r4.g
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }
}
