package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk3  reason: default package */
/* loaded from: classes.dex */
public final class hk3 {
    public static final int i = 8;
    @defpackage.gc6("id")
    private final java.lang.String a;
    @defpackage.gc6("name")
    private final java.lang.String b;
    @defpackage.gc6("type")
    private final java.lang.String c;
    @defpackage.gc6("orientation")
    private final java.lang.String d;
    @defpackage.gc6("useCustomOpacity")
    private final boolean e;
    @defpackage.gc6("opacity")
    private final int f;
    @defpackage.gc6("portraitLayout")
    private final defpackage.hf7 g;
    @defpackage.gc6("landscapeLayout")
    private final defpackage.hf7 h;

    public hk3(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6, defpackage.hf7 r7, defpackage.hf7 r8) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            return
    }

    public static /* synthetic */ defpackage.hk3 j(defpackage.hk3 r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6, defpackage.hf7 r7, defpackage.hf7 r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            java.lang.String r2 = r0.b
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            java.lang.String r3 = r0.c
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            java.lang.String r4 = r0.d
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1e
            boolean r5 = r0.e
        L1e:
            r10 = r9 & 32
            if (r10 == 0) goto L24
            int r6 = r0.f
        L24:
            r10 = r9 & 64
            if (r10 == 0) goto L2a
            hf7 r7 = r0.g
        L2a:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L30
            hf7 r8 = r0.h
        L30:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            hk3 r0 = r2.i(r3, r4, r5, r6, r7, r8, r9, r10)
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

    public final boolean e() {
            r0 = this;
            boolean r0 = r0.e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.hk3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            hk3 r5 = (defpackage.hk3) r5
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
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L46
            return r2
        L46:
            hf7 r1 = r4.g
            hf7 r3 = r5.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            hf7 r4 = r4.h
            hf7 r5 = r5.h
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L5c
            return r2
        L5c:
            return r0
    }

    public final int f() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    public final defpackage.hf7 g() {
            r0 = this;
            hf7 r0 = r0.g
            return r0
    }

    public final defpackage.hf7 h() {
            r0 = this;
            hf7 r0 = r0.h
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 31
            int r0 = r0 * r2
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r1 = r3.hashCode()
        L17:
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = r4.c
            int r0 = defpackage.xg6.d(r0, r2, r1)
            java.lang.String r1 = r4.d
            int r0 = defpackage.xg6.d(r0, r2, r1)
            boolean r1 = r4.e
            int r0 = defpackage.xg6.e(r0, r1, r2)
            int r1 = r4.f
            int r0 = defpackage.lb1.a(r1, r0, r2)
            hf7 r1 = r4.g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            hf7 r4 = r4.h
            int r4 = r4.hashCode()
            int r4 = r4 + r1
            return r4
    }

    public final defpackage.hk3 i(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5, int r6, defpackage.hf7 r7, defpackage.hf7 r8) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r7.getClass()
            r8.getClass()
            hk3 r0 = new hk3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final java.lang.String k() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final defpackage.hf7 l() {
            r0 = this;
            hf7 r0 = r0.h
            return r0
    }

    public final java.lang.String m() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final int n() {
            r0 = this;
            int r0 = r0.f
            return r0
    }

    public final java.lang.String o() {
            r0 = this;
            java.lang.String r0 = r0.d
            return r0
    }

    public final defpackage.hf7 p() {
            r0 = this;
            hf7 r0 = r0.g
            return r0
    }

    public final java.lang.String q() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    public final boolean r() {
            r0 = this;
            boolean r0 = r0.e
            return r0
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.String r0 = r10.a
            java.lang.String r1 = r10.b
            java.lang.String r2 = r10.c
            java.lang.String r3 = r10.d
            boolean r4 = r10.e
            int r5 = r10.f
            hf7 r6 = r10.g
            hf7 r10 = r10.h
            java.lang.String r7 = ", name="
            java.lang.String r8 = ", type="
            java.lang.String r9 = "LayoutConfigurationDto31(id="
            java.lang.StringBuilder r0 = defpackage.i61.u(r9, r0, r7, r1, r8)
            java.lang.String r1 = ", orientation="
            java.lang.String r7 = ", useCustomOpacity="
            defpackage.i61.B(r0, r2, r1, r3, r7)
            r0.append(r4)
            java.lang.String r1 = ", opacity="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", portraitLayout="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", landscapeLayout="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = ")"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
    }
}
