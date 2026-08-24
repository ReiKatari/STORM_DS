package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d43  reason: default package */
/* loaded from: classes.dex */
public final class d43 {
    public final int a;
    public final defpackage.ig1 b;
    public final defpackage.sf0 c;

    public d43(int r1, defpackage.ig1 r2, defpackage.sf0 r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.d43
            r2 = 0
            if (r1 != 0) goto La
            goto L25
        La:
            d43 r5 = (defpackage.d43) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L25
            ig1 r1 = r4.b
            ig1 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1d
            goto L25
        L1d:
            sf0 r4 = r4.c
            sf0 r5 = r5.c
            if (r4 == r5) goto L24
            return r2
        L24:
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            ig1 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            sf0 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConfiguredOutput(streamId="
            r0.<init>(r1)
            int r1 = r2.a
            java.lang.String r1 = defpackage.kr6.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", deferrableSurface="
            r0.append(r1)
            ig1 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", graph="
            r0.append(r1)
            sf0 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
