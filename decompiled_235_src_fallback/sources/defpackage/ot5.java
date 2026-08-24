package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot5  reason: default package */
/* loaded from: classes.dex */
public final class ot5 {
    public static final int e = 0;
    @defpackage.gc6("runtimeConsoleType")
    private final defpackage.u26 a;
    @defpackage.gc6("runtimeMicSource")
    private final defpackage.a36 b;
    @defpackage.gc6("layoutId")
    private final java.lang.String c;
    @defpackage.gc6("gbaSlotConfig")
    private final defpackage.xw5 d;

    public ot5(defpackage.u26 r1, defpackage.a36 r2, java.lang.String r3, defpackage.xw5 r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static /* synthetic */ defpackage.ot5 f(defpackage.ot5 r0, defpackage.u26 r1, defpackage.a36 r2, java.lang.String r3, defpackage.xw5 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            u26 r1 = r0.a
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            a36 r2 = r0.b
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            java.lang.String r3 = r0.c
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            xw5 r4 = r0.d
        L18:
            ot5 r0 = r0.e(r1, r2, r3, r4)
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

    public final java.lang.String c() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    public final defpackage.xw5 d() {
            r0 = this;
            xw5 r0 = r0.d
            return r0
    }

    public final defpackage.ot5 e(defpackage.u26 r1, defpackage.a36 r2, java.lang.String r3, defpackage.xw5 r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            ot5 r0 = new ot5
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ot5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ot5 r5 = (defpackage.ot5) r5
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
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            xw5 r4 = r4.d
            xw5 r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final defpackage.xw5 g() {
            r0 = this;
            xw5 r0 = r0.d
            return r0
    }

    public final java.lang.String h() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    public int hashCode() {
            r2 = this;
            u26 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            a36 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            xw5 r2 = r2.d
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final defpackage.u26 i() {
            r0 = this;
            u26 r0 = r0.a
            return r0
    }

    public final defpackage.a36 j() {
            r0 = this;
            a36 r0 = r0.b
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            u26 r0 = r5.a
            a36 r1 = r5.b
            java.lang.String r2 = r5.c
            xw5 r5 = r5.d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RomConfigDto31(runtimeConsoleType="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", runtimeMicSource="
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", layoutId="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", gbaSlotConfig="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
