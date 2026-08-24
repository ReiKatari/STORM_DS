package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it5  reason: default package */
/* loaded from: classes.dex */
public final class it5 {
    public static final int g = 8;
    @defpackage.gc6("a")
    private final defpackage.u26 a;
    @defpackage.gc6("b")
    private final defpackage.a36 b;
    @defpackage.gc6("c")
    private final java.util.UUID c;
    @defpackage.gc6("d")
    private final boolean d;
    @defpackage.gc6("e")
    private final android.net.Uri e;
    @defpackage.gc6("f")
    private final android.net.Uri f;

    public it5(defpackage.u26 r1, defpackage.a36 r2, java.util.UUID r3, boolean r4, android.net.Uri r5, android.net.Uri r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public static /* synthetic */ defpackage.it5 h(defpackage.it5 r0, defpackage.u26 r1, defpackage.a36 r2, java.util.UUID r3, boolean r4, android.net.Uri r5, android.net.Uri r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            u26 r1 = r0.a
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            a36 r2 = r0.b
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            java.util.UUID r3 = r0.c
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            boolean r4 = r0.d
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            android.net.Uri r5 = r0.e
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            android.net.Uri r6 = r0.f
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            it5 r0 = r2.g(r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final defpackage.u26 a() {
            r0 = this;
            u26 r0 = r0.a
            return r0
    }

    public final defpackage.a36 b() {
            r0 = this;
            a36 r0 = r0.b
            return r0
    }

    public final java.util.UUID c() {
            r0 = this;
            java.util.UUID r0 = r0.c
            return r0
    }

    public final boolean d() {
            r0 = this;
            boolean r0 = r0.d
            return r0
    }

    public final android.net.Uri e() {
            r0 = this;
            android.net.Uri r0 = r0.e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.it5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            it5 r5 = (defpackage.it5) r5
            u26 r1 = r4.a
            u26 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            a36 r1 = r4.b
            a36 r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.util.UUID r1 = r4.c
            java.util.UUID r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L2c
            return r2
        L2c:
            android.net.Uri r1 = r4.e
            android.net.Uri r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L37
            return r2
        L37:
            android.net.Uri r4 = r4.f
            android.net.Uri r5 = r5.f
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L42
            return r2
        L42:
            return r0
    }

    public final android.net.Uri f() {
            r0 = this;
            android.net.Uri r0 = r0.f
            return r0
    }

    public final defpackage.it5 g(defpackage.u26 r1, defpackage.a36 r2, java.util.UUID r3, boolean r4, android.net.Uri r5, android.net.Uri r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            it5 r0 = new it5
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public int hashCode() {
            r4 = this;
            u26 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            a36 r2 = r4.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.UUID r0 = r4.c
            r3 = 0
            if (r0 != 0) goto L18
            r0 = r3
            goto L1c
        L18:
            int r0 = r0.hashCode()
        L1c:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.d
            int r0 = defpackage.xg6.e(r2, r0, r1)
            android.net.Uri r2 = r4.e
            if (r2 != 0) goto L2a
            r2 = r3
            goto L2e
        L2a:
            int r2 = r2.hashCode()
        L2e:
            int r0 = r0 + r2
            int r0 = r0 * r1
            android.net.Uri r4 = r4.f
            if (r4 != 0) goto L35
            goto L39
        L35:
            int r3 = r4.hashCode()
        L39:
            int r0 = r0 + r3
            return r0
    }

    public final android.net.Uri i() {
            r0 = this;
            android.net.Uri r0 = r0.e
            return r0
    }

    public final android.net.Uri j() {
            r0 = this;
            android.net.Uri r0 = r0.f
            return r0
    }

    public final java.util.UUID k() {
            r0 = this;
            java.util.UUID r0 = r0.c
            return r0
    }

    public final boolean l() {
            r0 = this;
            boolean r0 = r0.d
            return r0
    }

    public final defpackage.u26 m() {
            r0 = this;
            u26 r0 = r0.a
            return r0
    }

    public final defpackage.a36 n() {
            r0 = this;
            a36 r0 = r0.b
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            u26 r0 = r7.a
            a36 r1 = r7.b
            java.util.UUID r2 = r7.c
            boolean r3 = r7.d
            android.net.Uri r4 = r7.e
            android.net.Uri r7 = r7.f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "RomConfig1(runtimeConsoleType="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", runtimeMicSource="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", layoutId="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", loadGbaCart="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ", gbaCartPath="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", gbaSavePath="
            r5.append(r0)
            r5.append(r7)
            java.lang.String r7 = ")"
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            return r7
    }
}
