package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b07  reason: default package */
/* loaded from: classes.dex */
public final class b07 {
    public final defpackage.fp a;
    public defpackage.fp b;
    public boolean c;
    public defpackage.y84 d;

    public b07(defpackage.fp r1, defpackage.fp r2) {
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
            boolean r1 = r5 instanceof defpackage.b07
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b07 r5 = (defpackage.b07) r5
            fp r1 = r4.a
            fp r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            fp r1 = r4.b
            fp r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L29
            return r2
        L29:
            y84 r4 = r4.d
            y84 r5 = r5.d
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            fp r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            fp r2 = r3.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.c
            int r0 = defpackage.xg6.e(r2, r0, r1)
            y84 r3 = r3.d
            if (r3 != 0) goto L1d
            r3 = 0
            goto L21
        L1d:
            int r3 = r3.hashCode()
        L21:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextSubstitutionValue(original="
            r0.<init>(r1)
            fp r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", substitution="
            r0.append(r1)
            fp r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", isShowingSubstitution="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", layoutCache="
            r0.append(r1)
            y84 r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
