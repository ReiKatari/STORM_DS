package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s95  reason: default package */
/* loaded from: classes.dex */
public final class s95 extends defpackage.ca5 {
    public final java.lang.String a;
    public final java.net.URL b;
    public final java.lang.String c;
    public final defpackage.oq1 d;
    public final boolean e;

    public s95(java.lang.String r1, java.net.URL r2, java.lang.String r3, defpackage.oq1 r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof defpackage.s95
            if (r0 != 0) goto L8
            goto L3c
        L8:
            s95 r3 = (defpackage.s95) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.net.URL r0 = r2.b
            java.net.URL r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            oq1 r0 = r2.d
            oq1 r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r2 = r2.e
            boolean r3 = r3.e
            if (r2 == r3) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.net.URL r1 = r4.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            java.lang.String r2 = r4.c
            if (r2 != 0) goto L18
            r2 = r0
            goto L1c
        L18:
            int r2 = r2.hashCode()
        L1c:
            int r1 = r1 + r2
            int r1 = r1 * 31
            oq1 r2 = r4.d
            if (r2 != 0) goto L24
            goto L2a
        L24:
            long r2 = r2.A
            int r0 = java.lang.Long.hashCode(r2)
        L2a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r4 = r4.e
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GameMastered(gameTitle="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", gameIcon="
            r0.append(r1)
            java.net.URL r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", userName="
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", playTime="
            r0.append(r1)
            oq1 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", forHardcodeMode="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.e
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
