package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf7  reason: default package */
/* loaded from: classes.dex */
public final class lf7 {
    public static final int d = 8;
    @defpackage.gc6("uiSize")
    private final defpackage.ny4 a;
    @defpackage.gc6("orientation")
    private final java.lang.String b;
    @defpackage.gc6("folds")
    private final java.util.List<defpackage.y66> c;

    public lf7(defpackage.ny4 r1, java.lang.String r2, java.util.List<defpackage.y66> r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static /* synthetic */ defpackage.lf7 e(defpackage.lf7 r0, defpackage.ny4 r1, java.lang.String r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            ny4 r1 = r0.a
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.util.List<y66> r3 = r0.c
        L12:
            lf7 r0 = r0.d(r1, r2, r3)
            return r0
    }

    public final defpackage.ny4 a() {
            r0 = this;
            ny4 r0 = r0.a
            return r0
    }

    public final java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final java.util.List<defpackage.y66> c() {
            r0 = this;
            java.util.List<y66> r0 = r0.c
            return r0
    }

    public final defpackage.lf7 d(defpackage.ny4 r1, java.lang.String r2, java.util.List<defpackage.y66> r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            lf7 r0 = new lf7
            r0.<init>(r1, r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.lf7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lf7 r5 = (defpackage.lf7) r5
            ny4 r1 = r4.a
            ny4 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List<y66> r4 = r4.c
            java.util.List<y66> r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.util.List<defpackage.y66> f() {
            r0 = this;
            java.util.List<y66> r0 = r0.c
            return r0
    }

    public final java.lang.String g() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final defpackage.ny4 h() {
            r0 = this;
            ny4 r0 = r0.a
            return r0
    }

    public int hashCode() {
            r3 = this;
            ny4 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.List<y66> r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public java.lang.String toString() {
            r4 = this;
            ny4 r0 = r4.a
            java.lang.String r1 = r4.b
            java.util.List<y66> r4 = r4.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UILayoutVariantDto35(uiSize="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", orientation="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", folds="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
