package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx5  reason: default package */
/* loaded from: classes.dex */
public final class bx5 {
    public final defpackage.ax5 a;
    public final java.lang.String b;
    public final java.lang.String c;

    public bx5(defpackage.ax5 r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
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
            boolean r1 = r5 instanceof defpackage.bx5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bx5 r5 = (defpackage.bx5) r5
            ax5 r1 = r4.a
            ax5 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r4 = r4.c
            java.lang.String r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ax5 r0 = r3.a
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
            java.lang.String r3 = r3.c
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RomGbaSlotConfigUiModel(type="
            r0.<init>(r1)
            ax5 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", gbaRomPath="
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", gbaSavePath="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.c
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
