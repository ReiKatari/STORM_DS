package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i05  reason: default package */
/* loaded from: classes.dex */
public final class i05 {
    public static final int c = 0;
    @defpackage.gc6("a")
    private final defpackage.nf5 a;
    @defpackage.gc6("b")
    private final java.lang.String b;

    public i05(defpackage.nf5 r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static /* synthetic */ defpackage.i05 d(defpackage.i05 r0, defpackage.nf5 r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            nf5 r1 = r0.a
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            i05 r0 = r0.c(r1, r2)
            return r0
    }

    public final defpackage.nf5 a() {
            r0 = this;
            nf5 r0 = r0.a
            return r0
    }

    public final java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final defpackage.i05 c(defpackage.nf5 r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            i05 r0 = new i05
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.String e() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.i05
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i05 r5 = (defpackage.i05) r5
            nf5 r1 = r4.a
            nf5 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.b
            java.lang.String r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final defpackage.nf5 f() {
            r0 = this;
            nf5 r0 = r0.a
            return r0
    }

    public int hashCode() {
            r1 = this;
            nf5 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            nf5 r0 = r3.a
            java.lang.String r3 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PositionedLayoutComponent25(rect="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", component="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
