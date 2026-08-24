package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw5  reason: default package */
/* loaded from: classes.dex */
public final class nw5 {
    public static final int j = 8;
    @defpackage.gc6("name")
    private final java.lang.String a;
    @defpackage.gc6("developerName")
    private final java.lang.String b;
    @defpackage.gc6("fileName")
    private final java.lang.String c;
    @defpackage.gc6("uri")
    private final java.lang.String d;
    @defpackage.gc6("parentTreeUri")
    private final java.lang.String e;
    @defpackage.gc6("config")
    private defpackage.nt5 f;
    @defpackage.gc6("lastPlayed")
    private java.util.Date g;
    @defpackage.gc6("isDsiWareTitle")
    private final boolean h;
    @defpackage.gc6("retroAchievementsHash")
    private final java.lang.String i;

    public nw5(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, defpackage.nt5 r6, java.util.Date r7, boolean r8, java.lang.String r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r9.getClass()
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
            return
    }

    public /* synthetic */ nw5(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, defpackage.nt5 r17, java.util.Date r18, boolean r19, java.lang.String r20, int r21, defpackage.id1 r22) {
            r11 = this;
            r0 = r21 & 64
            if (r0 == 0) goto L14
            r0 = 0
            r8 = r0
        L6:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r10 = r20
            goto L17
        L14:
            r8 = r18
            goto L6
        L17:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ defpackage.nw5 k(defpackage.nw5 r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, defpackage.nt5 r6, java.util.Date r7, boolean r8, java.lang.String r9, int r10, java.lang.Object r11) {
            r11 = r10 & 1
            if (r11 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L12
            java.lang.String r3 = r0.c
        L12:
            r11 = r10 & 8
            if (r11 == 0) goto L18
            java.lang.String r4 = r0.d
        L18:
            r11 = r10 & 16
            if (r11 == 0) goto L1e
            java.lang.String r5 = r0.e
        L1e:
            r11 = r10 & 32
            if (r11 == 0) goto L24
            nt5 r6 = r0.f
        L24:
            r11 = r10 & 64
            if (r11 == 0) goto L2a
            java.util.Date r7 = r0.g
        L2a:
            r11 = r10 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L30
            boolean r8 = r0.h
        L30:
            r10 = r10 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L36
            java.lang.String r9 = r0.i
        L36:
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            nw5 r0 = r2.j(r3, r4, r5, r6, r7, r8, r9, r10, r11)
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

    public final java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    public final java.lang.String d() {
            r0 = this;
            java.lang.String r0 = r0.d
            return r0
    }

    public final java.lang.String e() {
            r0 = this;
            java.lang.String r0 = r0.e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.nw5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nw5 r5 = (defpackage.nw5) r5
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
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            nt5 r1 = r4.f
            nt5 r3 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.util.Date r1 = r4.g
            java.util.Date r3 = r5.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            boolean r1 = r4.h
            boolean r3 = r5.h
            if (r1 == r3) goto L60
            return r2
        L60:
            java.lang.String r4 = r4.i
            java.lang.String r5 = r5.i
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L6b
            return r2
        L6b:
            return r0
    }

    public final defpackage.nt5 f() {
            r0 = this;
            nt5 r0 = r0.f
            return r0
    }

    public final java.util.Date g() {
            r0 = this;
            java.util.Date r0 = r0.g
            return r0
    }

    public final boolean h() {
            r0 = this;
            boolean r0 = r0.h
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
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            nt5 r2 = r3.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Date r0 = r3.g
            if (r0 != 0) goto L2f
            r0 = 0
            goto L33
        L2f:
            int r0 = r0.hashCode()
        L33:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.h
            int r0 = defpackage.xg6.e(r2, r0, r1)
            java.lang.String r3 = r3.i
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String i() {
            r0 = this;
            java.lang.String r0 = r0.i
            return r0
    }

    public final defpackage.nw5 j(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, defpackage.nt5 r6, java.util.Date r7, boolean r8, java.lang.String r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r9.getClass()
            nw5 r0 = new nw5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final defpackage.nt5 l() {
            r0 = this;
            nt5 r0 = r0.f
            return r0
    }

    public final java.lang.String m() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final java.lang.String n() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    public final java.util.Date o() {
            r0 = this;
            java.util.Date r0 = r0.g
            return r0
    }

    public final java.lang.String p() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final java.lang.String q() {
            r0 = this;
            java.lang.String r0 = r0.e
            return r0
    }

    public final java.lang.String r() {
            r0 = this;
            java.lang.String r0 = r0.i
            return r0
    }

    public final java.lang.String s() {
            r0 = this;
            java.lang.String r0 = r0.d
            return r0
    }

    public final boolean t() {
            r0 = this;
            boolean r0 = r0.h
            return r0
    }

    public java.lang.String toString() {
            r11 = this;
            java.lang.String r0 = r11.a
            java.lang.String r1 = r11.b
            java.lang.String r2 = r11.c
            java.lang.String r3 = r11.d
            java.lang.String r4 = r11.e
            nt5 r5 = r11.f
            java.util.Date r6 = r11.g
            boolean r7 = r11.h
            java.lang.String r11 = r11.i
            java.lang.String r8 = ", developerName="
            java.lang.String r9 = ", fileName="
            java.lang.String r10 = "RomDto25(name="
            java.lang.StringBuilder r0 = defpackage.i61.u(r10, r0, r8, r1, r9)
            java.lang.String r1 = ", uri="
            java.lang.String r8 = ", parentTreeUri="
            defpackage.i61.B(r0, r2, r1, r3, r8)
            r0.append(r4)
            java.lang.String r1 = ", config="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", lastPlayed="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", isDsiWareTitle="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", retroAchievementsHash="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r11 = defpackage.i61.n(r0, r11, r1)
            return r11
    }

    public final void u(defpackage.nt5 r1) {
            r0 = this;
            r1.getClass()
            r0.f = r1
            return
    }

    public final void v(java.util.Date r1) {
            r0 = this;
            r0.g = r1
            return
    }
}
