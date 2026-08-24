package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef7  reason: default package */
/* loaded from: classes.dex */
public final class ef7 {
    public static final int d = 8;
    @defpackage.gc6("a")
    private final java.lang.String a;
    @defpackage.gc6("b")
    private final java.lang.String b;
    @defpackage.gc6("c")
    private final java.util.List<defpackage.i05> c;

    public ef7(java.lang.String r1, java.lang.String r2, java.util.List<defpackage.i05> r3) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static /* synthetic */ defpackage.ef7 e(defpackage.ef7 r0, java.lang.String r1, java.lang.String r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L12
            java.util.List<i05> r3 = r0.c
        L12:
            ef7 r0 = r0.d(r1, r2, r3)
            return r0
    }

    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final java.util.List<defpackage.i05> c() {
            r0 = this;
            java.util.List<i05> r0 = r0.c
            return r0
    }

    public final defpackage.ef7 d(java.lang.String r1, java.lang.String r2, java.util.List<defpackage.i05> r3) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            ef7 r0 = new ef7
            r0.<init>(r1, r2, r3)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ef7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ef7 r5 = (defpackage.ef7) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
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
            java.util.List<i05> r4 = r4.c
            java.util.List<i05> r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final java.lang.String f() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final java.lang.String g() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final java.util.List<defpackage.i05> h() {
            r0 = this;
            java.util.List<i05> r0 = r0.c
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.util.List<i05> r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.a
            java.lang.String r1 = r5.b
            java.util.List<i05> r5 = r5.c
            java.lang.String r2 = ", backgroundMode="
            java.lang.String r3 = ", components="
            java.lang.String r4 = "UILayout25(backgroundId="
            java.lang.StringBuilder r0 = defpackage.i61.u(r4, r0, r2, r1, r3)
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
