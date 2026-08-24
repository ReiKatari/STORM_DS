package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni7  reason: default package */
/* loaded from: classes.dex */
public final class ni7 {
    public final defpackage.jd0 a;
    public final java.util.Map b;
    public final java.util.Set c;
    public defpackage.bl5 d;

    public /* synthetic */ ni7(defpackage.jd0 r2, java.util.LinkedHashMap r3, defpackage.bl5 r4, int r5) {
            r1 = this;
            r0 = r5 & 1
            if (r0 == 0) goto La
            jd0 r2 = new jd0
            r0 = 0
            r2.<init>(r0)
        La:
            r0 = r5 & 2
            if (r0 == 0) goto L13
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L13:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r5 = r5 & 8
            if (r5 == 0) goto L1d
            r4 = 0
        L1d:
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public ni7(defpackage.jd0 r1, java.util.Map r2, java.util.Set r3, defpackage.bl5 r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ni7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ni7 r5 = (defpackage.ni7) r5
            jd0 r1 = r4.a
            jd0 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.Map r1 = r4.b
            java.util.Map r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.Set r1 = r4.c
            java.util.Set r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            bl5 r4 = r4.d
            bl5 r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            jd0 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Set r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            bl5 r2 = r2.d
            if (r2 != 0) goto L20
            r2 = 0
            goto L26
        L20:
            int r2 = r2.a
            int r2 = java.lang.Integer.hashCode(r2)
        L26:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InfoBundle(options="
            r0.<init>(r1)
            jd0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.Map r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", listeners="
            r0.append(r1)
            java.util.Set r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", template="
            r0.append(r1)
            bl5 r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
