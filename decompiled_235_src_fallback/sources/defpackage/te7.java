package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te7  reason: default package */
/* loaded from: classes.dex */
public final class te7 {
    public final defpackage.li2 a;
    public final defpackage.oj2 b;
    public final int c;
    public final int d;
    public final java.lang.Object e;

    public te7(defpackage.li2 r1, defpackage.oj2 r2, int r3, int r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.te7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            te7 r5 = (defpackage.te7) r5
            li2 r1 = r4.a
            li2 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            oj2 r1 = r4.b
            oj2 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 != r3) goto L3a
            int r1 = r4.d
            int r3 = r5.d
            if (r1 != r3) goto L3a
            java.lang.Object r4 = r4.e
            java.lang.Object r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L39
            return r2
        L39:
            return r0
        L3a:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            li2 r1 = r4.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            oj2 r3 = r4.b
            int r3 = r3.A
            int r1 = r1 + r3
            int r1 = r1 * r2
            int r3 = r4.c
            int r1 = defpackage.lb1.a(r3, r1, r2)
            int r3 = r4.d
            int r1 = defpackage.lb1.a(r3, r1, r2)
            java.lang.Object r4 = r4.e
            if (r4 != 0) goto L25
            goto L29
        L25:
            int r0 = r4.hashCode()
        L29:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TypefaceRequest(fontFamily="
            r0.<init>(r1)
            li2 r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", fontWeight="
            r0.append(r1)
            oj2 r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", fontStyle="
            r0.append(r1)
            java.lang.String r1 = "Invalid"
            r2 = 1
            int r3 = r4.c
            if (r3 != 0) goto L25
            java.lang.String r3 = "Normal"
            goto L2b
        L25:
            if (r3 != r2) goto L2a
            java.lang.String r3 = "Italic"
            goto L2b
        L2a:
            r3 = r1
        L2b:
            r0.append(r3)
            java.lang.String r3 = ", fontSynthesis="
            r0.append(r3)
            int r3 = r4.d
            if (r3 != 0) goto L3a
            java.lang.String r1 = "None"
            goto L4c
        L3a:
            if (r3 != r2) goto L3f
            java.lang.String r1 = "Weight"
            goto L4c
        L3f:
            r2 = 2
            if (r3 != r2) goto L45
            java.lang.String r1 = "Style"
            goto L4c
        L45:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r2) goto L4c
            java.lang.String r1 = "All"
        L4c:
            r0.append(r1)
            java.lang.String r1 = ", resourceLoaderCacheKey="
            r0.append(r1)
            java.lang.Object r4 = r4.e
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
