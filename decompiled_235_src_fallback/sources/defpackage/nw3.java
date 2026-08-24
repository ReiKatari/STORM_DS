package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw3  reason: default package */
/* loaded from: classes.dex */
public final class nw3 extends defpackage.ow3 {
    @Override // defpackage.ow3
    public final void a(long r1, java.lang.Object r3) {
            r0 = this;
            fh7 r0 = defpackage.gh7.d
            java.lang.Object r0 = r0.i(r1, r3)
            z93 r0 = (defpackage.z93) r0
            j1 r0 = (defpackage.j1) r0
            r1 = 0
            r0.A = r1
            return
    }

    @Override // defpackage.ow3
    public final void b(java.lang.Object r4, long r5, java.lang.Object r7) {
            r3 = this;
            fh7 r3 = defpackage.gh7.d
            java.lang.Object r0 = r3.i(r5, r4)
            z93 r0 = (defpackage.z93) r0
            java.lang.Object r3 = r3.i(r5, r7)
            z93 r3 = (defpackage.z93) r3
            int r7 = r0.size()
            int r1 = r3.size()
            if (r7 <= 0) goto L29
            if (r1 <= 0) goto L29
            r2 = r0
            j1 r2 = (defpackage.j1) r2
            boolean r2 = r2.A
            if (r2 != 0) goto L26
            int r1 = r1 + r7
            z93 r0 = r0.k(r1)
        L26:
            r0.addAll(r3)
        L29:
            if (r7 <= 0) goto L2c
            r3 = r0
        L2c:
            defpackage.gh7.o(r4, r5, r3)
            return
    }

    @Override // defpackage.ow3
    public final java.util.List c(long r2, java.lang.Object r4) {
            r1 = this;
            fh7 r1 = defpackage.gh7.d
            java.lang.Object r1 = r1.i(r2, r4)
            z93 r1 = (defpackage.z93) r1
            r0 = r1
            j1 r0 = (defpackage.j1) r0
            boolean r0 = r0.A
            if (r0 != 0) goto L21
            int r0 = r1.size()
            if (r0 != 0) goto L18
            r0 = 10
            goto L1a
        L18:
            int r0 = r0 * 2
        L1a:
            z93 r1 = r1.k(r0)
            defpackage.gh7.o(r4, r2, r1)
        L21:
            return r1
    }
}
