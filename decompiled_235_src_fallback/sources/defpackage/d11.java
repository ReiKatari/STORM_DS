package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d11  reason: default package */
/* loaded from: classes.dex */
public final class d11 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.e33 d;

    public d11(java.lang.String r1, java.lang.String r2, java.lang.String r3, defpackage.e33 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.d11
            if (r0 != 0) goto L8
            goto L35
        L8:
            d11 r3 = (defpackage.d11) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            e33 r2 = r2.d
            e33 r3 = r3.d
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.c
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            e33 r3 = r3.d
            if (r3 != 0) goto L28
            goto L2c
        L28:
            int r1 = r3.hashCode()
        L2c:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", value="
            java.lang.String r1 = ", description="
            java.lang.String r2 = "ConsoleSubmenuEntry(title="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", icon="
            r0.append(r1)
            e33 r5 = r5.d
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
