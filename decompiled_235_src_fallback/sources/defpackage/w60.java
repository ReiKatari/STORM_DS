package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w60  reason: default package */
/* loaded from: classes.dex */
public final class w60 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
            w60 r0 = new w60
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            return
    }

    public w60(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            if (r1 > r3) goto L1d
            if (r2 > r4) goto L10
            return
        L10:
            java.lang.String r0 = "top must be less than or equal to bottom, top: "
            java.lang.String r1 = ", bottom: "
            java.lang.String r0 = defpackage.lb1.j(r0, r2, r4, r1)
            defpackage.i.f(r0)
            r0 = 0
            throw r0
        L1d:
            java.lang.String r0 = "Left must be less than or equal to right, left: "
            java.lang.String r2 = ", right: "
            java.lang.String r0 = defpackage.lb1.j(r0, r1, r3, r2)
            defpackage.i.f(r0)
            r0 = 0
            throw r0
    }

    public w60(android.graphics.Rect r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r4 = r4.bottom
            r3.<init>(r0, r1, r2, r4)
            return
    }

    public final int a() {
            r1 = this;
            int r0 = r1.d
            int r1 = r1.b
            int r0 = r0 - r1
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.c
            int r1 = r1.a
            int r0 = r0 - r1
            return r0
    }

    public final android.graphics.Rect c() {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.c
            int r2 = r4.d
            int r3 = r4.a
            int r4 = r4.b
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<w60> r2 = defpackage.w60.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            w60 r5 = (defpackage.w60) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L22
            return r2
        L22:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L30
            return r2
        L30:
            int r4 = r4.d
            int r5 = r5.d
            if (r4 == r5) goto L37
            return r2
        L37:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.d
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<w60> r1 = defpackage.w60.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " { ["
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            r1 = 44
            r0.append(r1)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.c
            r0.append(r2)
            r0.append(r1)
            int r3 = r3.d
            java.lang.String r1 = "] }"
            java.lang.String r3 = defpackage.lb1.o(r0, r3, r1)
            return r3
    }
}
