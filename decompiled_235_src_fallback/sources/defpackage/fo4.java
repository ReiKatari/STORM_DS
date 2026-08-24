package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo4  reason: default package */
/* loaded from: classes.dex */
public final class fo4 {
    public final android.content.Context a;
    public final android.graphics.Bitmap.Config b;
    public final android.graphics.ColorSpace c;
    public final defpackage.wi6 d;
    public final defpackage.y56 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final java.lang.String i;
    public final defpackage.yw2 j;
    public final defpackage.ty6 k;
    public final defpackage.ps4 l;
    public final defpackage.ra0 m;
    public final defpackage.ra0 n;
    public final defpackage.ra0 o;

    public fo4(android.content.Context r1, android.graphics.Bitmap.Config r2, android.graphics.ColorSpace r3, defpackage.wi6 r4, defpackage.y56 r5, boolean r6, boolean r7, boolean r8, java.lang.String r9, defpackage.yw2 r10, defpackage.ty6 r11, defpackage.ps4 r12, defpackage.ra0 r13, defpackage.ra0 r14, defpackage.ra0 r15) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            r0.n = r14
            r0.o = r15
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.fo4
            if (r1 == 0) goto L87
            fo4 r4 = (defpackage.fo4) r4
            android.content.Context r1 = r4.a
            android.content.Context r2 = r3.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L87
            android.graphics.Bitmap$Config r1 = r3.b
            android.graphics.Bitmap$Config r2 = r4.b
            if (r1 != r2) goto L87
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L2a
            android.graphics.ColorSpace r1 = r3.c
            android.graphics.ColorSpace r2 = r4.c
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L87
        L2a:
            wi6 r1 = r3.d
            wi6 r2 = r4.d
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L87
            y56 r1 = r3.e
            y56 r2 = r4.e
            if (r1 != r2) goto L87
            boolean r1 = r3.f
            boolean r2 = r4.f
            if (r1 != r2) goto L87
            boolean r1 = r3.g
            boolean r2 = r4.g
            if (r1 != r2) goto L87
            boolean r1 = r3.h
            boolean r2 = r4.h
            if (r1 != r2) goto L87
            java.lang.String r1 = r3.i
            java.lang.String r2 = r4.i
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L87
            yw2 r1 = r3.j
            yw2 r2 = r4.j
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L87
            ty6 r1 = r3.k
            ty6 r2 = r4.k
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L87
            ps4 r1 = r3.l
            ps4 r2 = r4.l
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L87
            ra0 r1 = r3.m
            ra0 r2 = r4.m
            if (r1 != r2) goto L87
            ra0 r1 = r3.n
            ra0 r2 = r4.n
            if (r1 != r2) goto L87
            ra0 r3 = r3.o
            ra0 r4 = r4.o
            if (r3 != r4) goto L87
            return r0
        L87:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r4 = this;
            android.content.Context r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            android.graphics.Bitmap$Config r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            android.graphics.ColorSpace r0 = r4.c
            r3 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.hashCode()
            goto L1c
        L1b:
            r0 = r3
        L1c:
            int r2 = r2 + r0
            int r2 = r2 * r1
            wi6 r0 = r4.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            y56 r2 = r4.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f
            int r0 = defpackage.xg6.e(r2, r0, r1)
            boolean r2 = r4.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r4.i
            if (r2 == 0) goto L48
            int r3 = r2.hashCode()
        L48:
            int r0 = r0 + r3
            int r0 = r0 * r1
            yw2 r2 = r4.j
            java.lang.String[] r2 = r2.A
            int r2 = java.util.Arrays.hashCode(r2)
            int r0 = r0 + r2
            int r0 = r0 * r1
            ty6 r2 = r4.k
            java.util.Map r2 = r2.a
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ps4 r0 = r4.l
            java.util.Map r0 = r0.A
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            ra0 r2 = r4.m
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ra0 r0 = r4.n
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            ra0 r4 = r4.o
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }
}
