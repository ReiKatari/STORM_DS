package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ch1 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.eh1 B;

    public /* synthetic */ ch1(defpackage.eh1 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r7 = this;
            int r0 = r7.A
            eh1 r7 = r7.B
            switch(r0) {
                case 0: goto L3b;
                default: goto L7;
            }
        L7:
            py0 r0 = defpackage.jq5.a
            java.lang.Object r0 = defpackage.hf.K(r7, r0)
            fq5 r0 = (defpackage.fq5) r0
            py0 r0 = defpackage.j31.a
            java.lang.Object r0 = defpackage.hf.K(r7, r0)
            kt0 r0 = (defpackage.kt0) r0
            long r0 = r0.a
            nq6 r2 = defpackage.vt0.a
            java.lang.Object r7 = defpackage.hf.K(r7, r2)
            ut0 r7 = (defpackage.ut0) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L38
            float r7 = defpackage.hv.N(r0)
            double r0 = (double) r7
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L35
            eq5 r7 = defpackage.jq5.d
            goto L3a
        L35:
            eq5 r7 = defpackage.jq5.e
            goto L3a
        L38:
            eq5 r7 = defpackage.jq5.f
        L3a:
            return r7
        L3b:
            py0 r0 = defpackage.jq5.a
            java.lang.Object r0 = defpackage.hf.K(r7, r0)
            fq5 r0 = (defpackage.fq5) r0
            ql r1 = r7.q0
            if (r0 != 0) goto L50
            if (r1 == 0) goto L4c
            r7.S0(r1)
        L4c:
            r0 = 0
            r7.q0 = r0
            goto L70
        L50:
            if (r1 != 0) goto L70
            dh1 r5 = new dh1
            r0 = 0
            r5.<init>(r7, r0)
            ch1 r6 = new ch1
            r0 = 1
            r6.<init>(r7, r0)
            r94 r2 = r7.m0
            boolean r3 = r7.n0
            float r4 = r7.o0
            sc7 r0 = defpackage.iq5.a
            ql r1 = new ql
            r1.<init>(r2, r3, r4, r5, r6)
            r7.R0(r1)
            r7.q0 = r1
        L70:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
