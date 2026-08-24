package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf7  reason: default package */
/* loaded from: classes.dex */
public final class gf7 {
    @defpackage.gc6("mainScreenLayoutDto")
    private final defpackage.b76 a;
    @defpackage.gc6("secondaryScreenLayoutDto")
    private final defpackage.b76 b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: gf7$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public gf7(defpackage.b76 r1, defpackage.b76 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final defpackage.ff7 a() {
            r2 = this;
            ff7 r0 = new ff7
            b76 r1 = r2.a
            z66 r1 = r1.a()
            b76 r2 = r2.b
            z66 r2 = r2.a()
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.gf7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gf7 r5 = (defpackage.gf7) r5
            b76 r1 = r4.a
            b76 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            b76 r4 = r4.b
            b76 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            b76 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            b76 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            b76 r0 = r3.a
            b76 r3 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "UILayoutDto(mainScreenLayout="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", secondaryScreenLayout="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
