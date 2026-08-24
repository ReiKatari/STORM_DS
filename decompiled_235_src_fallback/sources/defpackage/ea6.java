package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea6  reason: default package */
/* loaded from: classes.dex */
public final class ea6 {
    public final defpackage.da6 a;
    public final defpackage.da6 b;
    public final boolean c;

    public ea6(defpackage.da6 r1, defpackage.da6 r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.ea6 a(defpackage.ea6 r1, defpackage.da6 r2, defpackage.da6 r3, boolean r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            da6 r2 = r1.a
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            da6 r3 = r1.b
        Lc:
            r1.getClass()
            ea6 r1 = new ea6
            r1.<init>(r2, r3, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ea6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ea6 r5 = (defpackage.ea6) r5
            da6 r1 = r4.a
            da6 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            da6 r1 = r4.b
            da6 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            da6 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            da6 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r2 = r2.c
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Selection(start="
            r0.<init>(r1)
            da6 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            da6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", handlesCrossed="
            r0.append(r1)
            boolean r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
