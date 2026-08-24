package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss5  reason: default package */
/* loaded from: classes.dex */
public final class ss5 {
    public final java.util.List a;
    public final java.util.List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final defpackage.n06 f;
    public final defpackage.qw5 g;
    public final defpackage.gn6 h;
    public final defpackage.hn6 i;
    public final java.util.List j;
    public final java.util.Map k;

    public ss5(java.util.List r1, java.util.List r2, boolean r3, boolean r4, boolean r5, defpackage.n06 r6, defpackage.qw5 r7, defpackage.gn6 r8, defpackage.hn6 r9, java.util.List r10, java.util.Map r11) {
            r0 = this;
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L6a
        L4:
            boolean r0 = r3 instanceof defpackage.ss5
            if (r0 != 0) goto La
            goto L68
        La:
            ss5 r3 = (defpackage.ss5) r3
            java.util.List r0 = r2.a
            java.util.List r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L68
        L17:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L68
        L22:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L29
            goto L68
        L29:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L30
            goto L68
        L30:
            boolean r0 = r2.e
            boolean r1 = r3.e
            if (r0 == r1) goto L37
            goto L68
        L37:
            n06 r0 = r2.f
            n06 r1 = r3.f
            if (r0 == r1) goto L3e
            goto L68
        L3e:
            qw5 r0 = r2.g
            qw5 r1 = r3.g
            if (r0 == r1) goto L45
            goto L68
        L45:
            gn6 r0 = r2.h
            gn6 r1 = r3.h
            if (r0 == r1) goto L4c
            goto L68
        L4c:
            hn6 r0 = r2.i
            hn6 r1 = r3.i
            if (r0 == r1) goto L53
            goto L68
        L53:
            java.util.List r0 = r2.j
            java.util.List r1 = r3.j
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L5e
            goto L68
        L5e:
            java.util.Map r2 = r2.k
            java.util.Map r3 = r3.k
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L6a
        L68:
            r2 = 0
            return r2
        L6a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r3.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            n06 r2 = r3.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            qw5 r0 = r3.g
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            gn6 r2 = r3.h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            hn6 r0 = r3.i
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List r2 = r3.j
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.Map r3 = r3.k
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RomBrowserUiState(entries="
            r0.<init>(r1)
            java.util.List r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", breadcrumbs="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", canNavigateUp="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", isSearchActive="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isAtVirtualRoot="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", viewMode="
            r0.append(r1)
            n06 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", filter="
            r0.append(r1)
            qw5 r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", sortingMode="
            r0.append(r1)
            gn6 r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", sortingOrder="
            r0.append(r1)
            hn6 r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", continuePlaying="
            r0.append(r1)
            java.util.List r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", alphabetIndex="
            r0.append(r1)
            java.util.Map r2 = r2.k
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
