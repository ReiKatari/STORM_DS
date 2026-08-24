package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs5  reason: default package */
/* loaded from: classes.dex */
public final class gs5 implements defpackage.go2 {
    public final /* synthetic */ java.util.ArrayList A;
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.qn2 L;
    public final /* synthetic */ java.util.Map R;
    public final /* synthetic */ java.util.Map X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ java.util.Set Z;
    public final /* synthetic */ defpackage.qn2 d0;
    public final /* synthetic */ defpackage.qn2 e0;
    public final /* synthetic */ java.util.Map f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ defpackage.qn2 h0;
    public final /* synthetic */ int i0;

    public gs5(java.util.ArrayList r1, int r2, defpackage.qn2 r3, java.util.Map r4, java.util.Map r5, boolean r6, java.util.Set r7, defpackage.qn2 r8, defpackage.qn2 r9, java.util.Map r10, int r11, defpackage.qn2 r12, int r13) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            r0.g0 = r11
            r0.h0 = r12
            r0.i0 = r13
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            ro3 r1 = (defpackage.ro3) r1
            r2 = r20
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r21
            px0 r3 = (defpackage.px0) r3
            r4 = r22
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            if (r5 != 0) goto L2c
            r5 = r3
            xq2 r5 = (defpackage.xq2) r5
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L29
            r1 = 4
            goto L2a
        L29:
            r1 = 2
        L2a:
            r1 = r1 | r4
            goto L2d
        L2c:
            r1 = r4
        L2d:
            r4 = r4 & 48
            if (r4 != 0) goto L40
            r4 = r3
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.d(r2)
            if (r4 == 0) goto L3d
            r4 = 32
            goto L3f
        L3d:
            r4 = 16
        L3f:
            r1 = r1 | r4
        L40:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L4a
            r4 = r6
            goto L4b
        L4a:
            r4 = r7
        L4b:
            r1 = r1 & r6
            r13 = r3
            xq2 r13 = (defpackage.xq2) r13
            boolean r1 = r13.S(r1, r4)
            if (r1 == 0) goto L14d
            java.util.ArrayList r1 = r0.A
            java.lang.Object r1 = r1.get(r2)
            mr5 r1 = (defpackage.mr5) r1
            r3 = -791923249(0xffffffffd0cc35cf, float:-2.7408628E10)
            r13.b0(r3)
            int r3 = r0.B
            int r8 = r3 + r2
            pq5 r2 = r1.a
            android.net.Uri r3 = r2.d
            qn2 r4 = r0.L
            boolean r5 = r13.f(r4)
            boolean r9 = r13.h(r1)
            r5 = r5 | r9
            java.lang.Object r9 = r13.P()
            r10 = 0
            vs0 r11 = defpackage.ox0.a
            if (r5 != 0) goto L81
            if (r9 != r11) goto L89
        L81:
            ds5 r9 = new ds5
            r9.<init>(r4, r1, r10, r7)
            r13.l0(r9)
        L89:
            eo2 r9 = (defpackage.eo2) r9
            defpackage.mb3.i(r13, r9, r3)
            pq5 r4 = r1.a
            java.util.Map r5 = r0.R
            java.lang.String r9 = r4.i
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r9 = r2.i
            java.lang.String r12 = r3.toString()
            java.util.Map r14 = r0.X
            java.lang.Object r12 = r14.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto Lb2
            int r15 = r12.length()
            if (r15 <= 0) goto Lb2
            r15 = r12
            goto Lb3
        Lb2:
            r15 = r10
        Lb3:
            java.lang.String r10 = r3.toString()
            java.lang.Object r10 = r14.get(r10)
            if (r10 != 0) goto Lc0
            r16 = r6
            goto Lc2
        Lc0:
            r16 = r7
        Lc2:
            boolean r10 = r0.Y
            if (r10 == 0) goto Ldc
            java.util.Set r10 = r0.Z
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto Lda
            boolean r9 = defpackage.qs6.v0(r9)
            if (r9 != 0) goto Ldc
            boolean r2 = r2.c()
            if (r2 != 0) goto Ldc
        Lda:
            r2 = r6
            goto Ldd
        Ldc:
            r2 = r7
        Ldd:
            qn2 r9 = r0.d0
            boolean r10 = r13.f(r9)
            boolean r12 = r13.h(r1)
            r10 = r10 | r12
            java.lang.Object r12 = r13.P()
            if (r10 != 0) goto Lf0
            if (r12 != r11) goto Lf8
        Lf0:
            es5 r12 = new es5
            r12.<init>(r9, r1, r7)
            r13.l0(r12)
        Lf8:
            r17 = r12
            on2 r17 = (defpackage.on2) r17
            qn2 r9 = r0.e0
            boolean r10 = r13.f(r9)
            boolean r12 = r13.h(r1)
            r10 = r10 | r12
            java.lang.Object r12 = r13.P()
            if (r10 != 0) goto L10f
            if (r12 != r11) goto L117
        L10f:
            es5 r12 = new es5
            r12.<init>(r9, r1, r6)
            r13.l0(r12)
        L117:
            r1 = r12
            on2 r1 = (defpackage.on2) r1
            java.lang.String r9 = "rom:"
            java.lang.String r9 = defpackage.xg6.n(r3, r9)
            qn2 r12 = r0.h0
            r14 = 0
            java.util.Map r10 = r0.f0
            int r11 = r0.g0
            a74 r3 = defpackage.nw7.o0(r8, r9, r10, r11, r12, r13, r14)
            int r0 = r0.i0
            if (r8 < r0) goto L130
            goto L131
        L130:
            r6 = r7
        L131:
            a74 r0 = defpackage.nw7.N(r3, r6)
            r12 = r17
            r17 = 0
            r14 = r1
            r8 = r4
            r9 = r5
            r10 = r15
            r11 = r16
            r15 = r0
            r16 = r13
            r13 = r12
            r12 = r2
            defpackage.ii2.l(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r13 = r16
            r13.p(r7)
            goto L150
        L14d:
            r13.V()
        L150:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
