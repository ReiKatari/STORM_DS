package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io  reason: default package */
/* loaded from: classes.dex */
public final class io extends defpackage.aj3 implements defpackage.fo2 {
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ defpackage.ga7 L;

    public io(defpackage.qn2 r1, defpackage.ga7 r2) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
            r7 = this;
            g34 r8 = (defpackage.g34) r8
            x24 r9 = (defpackage.x24) r9
            q21 r10 = (defpackage.q21) r10
            long r0 = r10.a
            dx4 r9 = r9.y(r0)
            boolean r10 = r8.a0()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            if (r10 == 0) goto L32
            ga7 r10 = r7.L
            vs4 r10 = r10.d
            java.lang.Object r10 = r10.getValue()
            qn2 r7 = r7.B
            java.lang.Object r7 = r7.g(r10)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L32
            r3 = 0
            goto L3b
        L32:
            int r7 = r9.A
            int r10 = r9.B
            long r3 = (long) r7
            long r3 = r3 << r2
            long r5 = (long) r10
            long r5 = r5 & r0
            long r3 = r3 | r5
        L3b:
            long r5 = r3 >> r2
            int r7 = (int) r5
            long r0 = r0 & r3
            int r10 = (int) r0
            he r0 = new he
            r1 = 2
            r0.<init>(r9, r1)
            zt1 r9 = defpackage.zt1.A
            f34 r7 = r8.K(r7, r10, r9, r0)
            return r7
    }
}
