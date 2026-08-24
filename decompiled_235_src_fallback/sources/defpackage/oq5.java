package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq5  reason: default package */
/* loaded from: classes.dex */
public final class oq5 {
    public static final int h = 8;
    @defpackage.gc6("a")
    private final java.lang.String a;
    @defpackage.gc6("b")
    private final java.lang.String b;
    @defpackage.gc6("c")
    private final android.net.Uri c;
    @defpackage.gc6("d")
    private final android.net.Uri d;
    @defpackage.gc6("e")
    private final defpackage.it5 e;
    @defpackage.gc6("f")
    private final java.util.Date f;
    @defpackage.gc6("g")
    private final boolean g;

    public oq5(java.lang.String r1, java.lang.String r2, android.net.Uri r3, android.net.Uri r4, defpackage.it5 r5, java.util.Date r6, boolean r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
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

    public /* synthetic */ oq5(java.lang.String r9, java.lang.String r10, android.net.Uri r11, android.net.Uri r12, defpackage.it5 r13, java.util.Date r14, boolean r15, int r16, defpackage.id1 r17) {
            r8 = this;
            r0 = r16 & 32
            if (r0 == 0) goto L5
            r14 = 0
        L5:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static /* synthetic */ defpackage.oq5 i(defpackage.oq5 r0, java.lang.String r1, java.lang.String r2, android.net.Uri r3, android.net.Uri r4, defpackage.it5 r5, java.util.Date r6, boolean r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            android.net.Uri r3 = r0.c
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            android.net.Uri r4 = r0.d
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L1e
            it5 r5 = r0.e
        L1e:
            r9 = r8 & 32
            if (r9 == 0) goto L24
            java.util.Date r6 = r0.f
        L24:
            r8 = r8 & 64
            if (r8 == 0) goto L2a
            boolean r7 = r0.g
        L2a:
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            oq5 r0 = r2.h(r3, r4, r5, r6, r7, r8, r9)
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

    public final android.net.Uri c() {
            r0 = this;
            android.net.Uri r0 = r0.c
            return r0
    }

    public final android.net.Uri d() {
            r0 = this;
            android.net.Uri r0 = r0.d
            return r0
    }

    public final defpackage.it5 e() {
            r0 = this;
            it5 r0 = r0.e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.oq5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oq5 r5 = (defpackage.oq5) r5
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
            android.net.Uri r1 = r4.c
            android.net.Uri r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            android.net.Uri r1 = r4.d
            android.net.Uri r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            it5 r1 = r4.e
            it5 r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.util.Date r1 = r4.f
            java.util.Date r3 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L55
            return r2
        L55:
            return r0
    }

    public final java.util.Date f() {
            r0 = this;
            java.util.Date r0 = r0.f
            return r0
    }

    public final boolean g() {
            r0 = this;
            boolean r0 = r0.g
            return r0
    }

    public final defpackage.oq5 h(java.lang.String r1, java.lang.String r2, android.net.Uri r3, android.net.Uri r4, defpackage.it5 r5, java.util.Date r6, boolean r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            oq5 r0 = new oq5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            android.net.Uri r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            android.net.Uri r0 = r3.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            it5 r2 = r3.e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Date r0 = r3.f
            if (r0 != 0) goto L2d
            r0 = 0
            goto L31
        L2d:
            int r0 = r0.hashCode()
        L31:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r3 = r3.g
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r2
            return r3
    }

    public final defpackage.it5 j() {
            r0 = this;
            it5 r0 = r0.e
            return r0
    }

    public final java.lang.String k() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final java.util.Date l() {
            r0 = this;
            java.util.Date r0 = r0.f
            return r0
    }

    public final java.lang.String m() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final android.net.Uri n() {
            r0 = this;
            android.net.Uri r0 = r0.d
            return r0
    }

    public final android.net.Uri o() {
            r0 = this;
            android.net.Uri r0 = r0.c
            return r0
    }

    public final boolean p() {
            r0 = this;
            boolean r0 = r0.g
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.String r0 = r9.a
            java.lang.String r1 = r9.b
            android.net.Uri r2 = r9.c
            android.net.Uri r3 = r9.d
            it5 r4 = r9.e
            java.util.Date r5 = r9.f
            boolean r9 = r9.g
            java.lang.String r6 = ", fileName="
            java.lang.String r7 = ", uri="
            java.lang.String r8 = "Rom22(name="
            java.lang.StringBuilder r0 = defpackage.i61.u(r8, r0, r6, r1, r7)
            r0.append(r2)
            java.lang.String r1 = ", parentTreeUri="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", config="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", lastPlayed="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", isDsiWareTitle="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r9 = defpackage.i61.o(r0, r9, r1)
            return r9
    }
}
