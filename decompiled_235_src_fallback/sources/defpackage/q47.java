package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q47  reason: default package */
/* loaded from: classes.dex */
public final class q47 {
    public final java.lang.String a;
    public java.lang.String b;
    public boolean c;
    public defpackage.bs4 d;

    public q47(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            r1 = 0
            r0.d = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.q47
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q47 r5 = (defpackage.q47) r5
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
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L29
            return r2
        L29:
            bs4 r4 = r4.d
            bs4 r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            bs4 r3 = r3.d
            if (r3 != 0) goto L1b
            r3 = 0
            goto L1f
        L1b:
            int r3 = r3.hashCode()
        L1f:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextSubstitution(layoutCache="
            r0.<init>(r1)
            bs4 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isShowingSubstitution="
            r0.append(r1)
            boolean r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
