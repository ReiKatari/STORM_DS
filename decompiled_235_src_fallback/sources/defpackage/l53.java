package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l53  reason: default package */
/* loaded from: classes.dex */
public final class l53 extends defpackage.ly4 {
    public final boolean l;

    public l53(java.lang.String r2, defpackage.m53 r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            r1.l = r0
            return
    }

    @Override // defpackage.ly4
    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r5 != r6) goto L4
            goto L74
        L4:
            boolean r0 = r6 instanceof defpackage.l53
            r1 = 0
            if (r0 != 0) goto Lb
            goto L76
        Lb:
            r0 = r6
            wb6 r0 = (defpackage.wb6) r0
            java.lang.String r2 = r0.a()
            java.lang.String r3 = r5.a
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            goto L76
        L1b:
            l53 r6 = (defpackage.l53) r6
            boolean r2 = r6.l
            if (r2 == 0) goto L76
            go3 r2 = r5.j
            java.lang.Object r2 = r2.getValue()
            wb6[] r2 = (defpackage.wb6[]) r2
            go3 r6 = r6.j
            java.lang.Object r6 = r6.getValue()
            wb6[] r6 = (defpackage.wb6[]) r6
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 == 0) goto L76
            int r6 = r0.f()
            int r2 = r5.c
            if (r2 == r6) goto L40
            goto L76
        L40:
            r6 = r1
        L41:
            if (r6 >= r2) goto L74
            wb6 r3 = r5.j(r6)
            java.lang.String r3 = r3.a()
            wb6 r4 = r0.j(r6)
            java.lang.String r4 = r4.a()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L5a
            goto L76
        L5a:
            wb6 r3 = r5.j(r6)
            np2 r3 = r3.e()
            wb6 r4 = r0.j(r6)
            np2 r4 = r4.e()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L71
            goto L76
        L71:
            int r6 = r6 + 1
            goto L41
        L74:
            r5 = 1
            return r5
        L76:
            return r1
    }

    @Override // defpackage.wb6
    public final boolean h() {
            r0 = this;
            boolean r0 = r0.l
            return r0
    }

    @Override // defpackage.ly4
    public final int hashCode() {
            r0 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            return r0
    }
}
