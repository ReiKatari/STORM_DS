package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s52  reason: default package */
/* loaded from: classes.dex */
public final class s52 extends defpackage.ly4 {
    public final defpackage.bc6 l;
    public final defpackage.ex6 m;

    public s52(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            bc6 r0 = defpackage.bc6.e
            r1.l = r0
            r52 r0 = new r52
            r0.<init>(r3, r2, r1)
            ex6 r2 = new ex6
            r2.<init>(r0)
            r1.m = r2
            return
    }

    @Override // defpackage.ly4, defpackage.wb6
    public final defpackage.np2 e() {
            r0 = this;
            bc6 r0 = r0.l
            return r0
    }

    @Override // defpackage.ly4
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            if (r3 != 0) goto L6
            goto L31
        L6:
            boolean r0 = r3 instanceof defpackage.wb6
            if (r0 != 0) goto Lb
            goto L31
        Lb:
            wb6 r3 = (defpackage.wb6) r3
            np2 r0 = r3.e()
            bc6 r1 = defpackage.bc6.e
            if (r0 == r1) goto L16
            goto L31
        L16:
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L31
        L23:
            java.util.Set r2 = defpackage.q60.k(r2)
            java.util.Set r3 = defpackage.q60.k(r3)
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    @Override // defpackage.ly4
    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            w0 r1 = new w0
            r1.<init>(r3)
            r3 = 1
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            int r3 = r3 * 31
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L21
            int r2 = r2.hashCode()
            goto L22
        L21:
            r2 = 0
        L22:
            int r3 = r3 + r2
            goto Lc
        L24:
            int r0 = r0 * 31
            int r0 = r0 + r3
            return r0
    }

    @Override // defpackage.ly4, defpackage.wb6
    public final defpackage.wb6 j(int r1) {
            r0 = this;
            ex6 r0 = r0.m
            java.lang.Object r0 = r0.getValue()
            wb6[] r0 = (defpackage.wb6[]) r0
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.ly4
    public final java.lang.String toString() {
            r6 = this;
            dv r0 = new dv
            r1 = 5
            r0.<init>(r6, r1)
            java.lang.String r6 = r6.a
            java.lang.String r1 = "("
            java.lang.String r2 = r6.concat(r1)
            r4 = 0
            r5 = 56
            java.lang.String r1 = ", "
            java.lang.String r3 = ")"
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
