package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we1  reason: default package */
/* loaded from: classes.dex */
public final class we1 {
    public final defpackage.n61 a;
    public final defpackage.n61 b;
    public final defpackage.n61 c;
    public final defpackage.n61 d;
    public final defpackage.x97 e;
    public final defpackage.n05 f;
    public final android.graphics.Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final android.graphics.drawable.Drawable j;
    public final android.graphics.drawable.Drawable k;
    public final android.graphics.drawable.Drawable l;
    public final defpackage.ra0 m;
    public final defpackage.ra0 n;
    public final defpackage.ra0 o;

    public we1(defpackage.n61 r1, defpackage.n61 r2, defpackage.n61 r3, defpackage.n61 r4, defpackage.x97 r5, defpackage.n05 r6, android.graphics.Bitmap.Config r7, boolean r8, boolean r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11, android.graphics.drawable.Drawable r12, defpackage.ra0 r13, defpackage.ra0 r14, defpackage.ra0 r15) {
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
            boolean r1 = r4 instanceof defpackage.we1
            if (r1 == 0) goto L85
            we1 r4 = (defpackage.we1) r4
            n61 r1 = r4.a
            n61 r2 = r3.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L85
            n61 r1 = r3.b
            n61 r2 = r4.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            n61 r1 = r3.c
            n61 r2 = r4.c
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            n61 r1 = r3.d
            n61 r2 = r4.d
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            x97 r1 = r3.e
            x97 r2 = r4.e
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            n05 r1 = r3.f
            n05 r2 = r4.f
            if (r1 != r2) goto L85
            android.graphics.Bitmap$Config r1 = r3.g
            android.graphics.Bitmap$Config r2 = r4.g
            if (r1 != r2) goto L85
            boolean r1 = r3.h
            boolean r2 = r4.h
            if (r1 != r2) goto L85
            boolean r1 = r3.i
            boolean r2 = r4.i
            if (r1 != r2) goto L85
            android.graphics.drawable.Drawable r1 = r3.j
            android.graphics.drawable.Drawable r2 = r4.j
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            android.graphics.drawable.Drawable r1 = r3.k
            android.graphics.drawable.Drawable r2 = r4.k
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            android.graphics.drawable.Drawable r1 = r3.l
            android.graphics.drawable.Drawable r2 = r4.l
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 == 0) goto L85
            ra0 r1 = r3.m
            ra0 r2 = r4.m
            if (r1 != r2) goto L85
            ra0 r1 = r3.n
            ra0 r2 = r4.n
            if (r1 != r2) goto L85
            ra0 r3 = r3.o
            ra0 r4 = r4.o
            if (r3 != r4) goto L85
            return r0
        L85:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r4 = this;
            n61 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            n61 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            n61 r0 = r4.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            n61 r2 = r4.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            x97 r0 = r4.e
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            n05 r2 = r4.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            android.graphics.Bitmap$Config r0 = r4.g
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.i
            int r0 = defpackage.xg6.e(r0, r2, r1)
            r2 = 0
            android.graphics.drawable.Drawable r3 = r4.j
            if (r3 == 0) goto L4f
            int r3 = r3.hashCode()
            goto L50
        L4f:
            r3 = r2
        L50:
            int r0 = r0 + r3
            int r0 = r0 * r1
            android.graphics.drawable.Drawable r3 = r4.k
            if (r3 == 0) goto L5b
            int r3 = r3.hashCode()
            goto L5c
        L5b:
            r3 = r2
        L5c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            android.graphics.drawable.Drawable r3 = r4.l
            if (r3 == 0) goto L66
            int r2 = r3.hashCode()
        L66:
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
