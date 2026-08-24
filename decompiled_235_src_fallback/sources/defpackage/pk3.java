package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk3  reason: default package */
/* loaded from: classes.dex */
public final class pk3 {
    @defpackage.gc6("mainScreenDisplay")
    private final defpackage.nk3 a;
    @defpackage.gc6("secondaryScreenDisplay")
    private final defpackage.nk3 b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: pk3$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public pk3(defpackage.nk3 r1, defpackage.nk3 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final defpackage.ok3 a() {
            r2 = this;
            ok3 r0 = new ok3
            nk3 r1 = r2.a
            mk3 r1 = r1.a()
            nk3 r2 = r2.b
            if (r2 == 0) goto L11
            mk3 r2 = r2.a()
            goto L12
        L11:
            r2 = 0
        L12:
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.pk3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pk3 r5 = (defpackage.pk3) r5
            nk3 r1 = r4.a
            nk3 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            nk3 r4 = r4.b
            nk3 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            nk3 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            nk3 r1 = r1.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            nk3 r0 = r3.a
            nk3 r3 = r3.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LayoutDisplayPairDto(mainScreenDisplay="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", secondaryScreenDisplay="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
