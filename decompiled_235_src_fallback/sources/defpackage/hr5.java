package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr5  reason: default package */
/* loaded from: classes.dex */
public final class hr5 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;
    public final /* synthetic */ defpackage.qn2 L;
    public final /* synthetic */ java.util.Map R;
    public final /* synthetic */ java.util.Map X;
    public final /* synthetic */ defpackage.qn2 Y;
    public final /* synthetic */ defpackage.qn2 Z;
    public final /* synthetic */ defpackage.qn2 d0;

    public /* synthetic */ hr5(java.util.List r1, defpackage.qn2 r2, java.util.Map r3, java.util.Map r4, defpackage.qn2 r5, defpackage.qn2 r6, defpackage.qn2 r7, int r8) {
            r0 = this;
            r0.A = r8
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.Y = r5
            r0.Z = r6
            r0.d0 = r7
            r0.<init>()
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
            r30 = this;
            r0 = r30
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            java.util.Map r3 = r0.R
            java.util.List r4 = r0.B
            r5 = 146(0x92, float:2.05E-43)
            vs0 r8 = defpackage.ox0.a
            r9 = 0
            qn2 r10 = r0.L
            java.util.Map r11 = r0.X
            qn2 r12 = r0.Y
            qn2 r13 = r0.Z
            r15 = 4
            r7 = 1
            switch(r1) {
                case 0: goto L122;
                default: goto L1c;
            }
        L1c:
            r1 = r31
            lp3 r1 = (defpackage.lp3) r1
            r17 = r32
            java.lang.Number r17 = (java.lang.Number) r17
            int r14 = r17.intValue()
            r17 = r33
            px0 r17 = (defpackage.px0) r17
            r19 = r34
            java.lang.Number r19 = (java.lang.Number) r19
            int r19 = r19.intValue()
            r20 = r19 & 6
            if (r20 != 0) goto L4a
            r6 = r17
            xq2 r6 = (defpackage.xq2) r6
            boolean r1 = r6.f(r1)
            if (r1 == 0) goto L45
            r18 = r15
            goto L47
        L45:
            r18 = 2
        L47:
            r1 = r19 | r18
            goto L4c
        L4a:
            r1 = r19
        L4c:
            r6 = r19 & 48
            if (r6 != 0) goto L60
            r6 = r17
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.d(r14)
            if (r6 == 0) goto L5d
            r6 = 32
            goto L5f
        L5d:
            r6 = 16
        L5f:
            r1 = r1 | r6
        L60:
            r6 = r1 & 147(0x93, float:2.06E-43)
            if (r6 == r5) goto L66
            r5 = r7
            goto L67
        L66:
            r5 = 0
        L67:
            r1 = r1 & r7
            r6 = r17
            xq2 r6 = (defpackage.xq2) r6
            boolean r1 = r6.S(r1, r5)
            if (r1 == 0) goto L11d
            java.lang.Object r1 = r4.get(r14)
            pq5 r1 = (defpackage.pq5) r1
            r4 = -424800199(0xffffffffe6ae1039, float:-4.109955E23)
            r6.b0(r4)
            android.net.Uri r4 = r1.d
            boolean r5 = r6.f(r10)
            boolean r14 = r6.h(r1)
            r5 = r5 | r14
            java.lang.Object r14 = r6.P()
            if (r5 != 0) goto L91
            if (r14 != r8) goto L99
        L91:
            gr5 r14 = new gr5
            r14.<init>(r10, r1, r9, r7)
            r6.l0(r14)
        L99:
            eo2 r14 = (defpackage.eo2) r14
            defpackage.mb3.i(r6, r14, r4)
            java.lang.String r5 = r1.i
            java.lang.Object r3 = r3.get(r5)
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r3 = r4.toString()
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lbd
            int r5 = r3.length()
            if (r5 <= 0) goto Lbd
            r23 = r3
            goto Lbf
        Lbd:
            r23 = r9
        Lbf:
            java.lang.String r3 = r4.toString()
            java.lang.Object r3 = r11.get(r3)
            if (r3 != 0) goto Lcc
            r24 = r7
            goto Lce
        Lcc:
            r24 = 0
        Lce:
            boolean r3 = r6.f(r12)
            boolean r4 = r6.h(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto Ldf
            if (r4 != r8) goto Le8
        Ldf:
            ua1 r4 = new ua1
            r3 = 3
            r4.<init>(r12, r1, r3)
            r6.l0(r4)
        Le8:
            r25 = r4
            on2 r25 = (defpackage.on2) r25
            boolean r3 = r6.f(r13)
            boolean r4 = r6.h(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto Lfd
            if (r4 != r8) goto L105
        Lfd:
            ua1 r4 = new ua1
            r4.<init>(r13, r1, r15)
            r6.l0(r4)
        L105:
            r26 = r4
            on2 r26 = (defpackage.on2) r26
            qn2 r0 = r0.d0
            r29 = 0
            r27 = r0
            r21 = r1
            r28 = r6
            defpackage.ak7.m(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0 = r28
            r1 = 0
            r0.p(r1)
            goto L121
        L11d:
            r0 = r6
            r0.V()
        L121:
            return r2
        L122:
            r1 = r31
            lp3 r1 = (defpackage.lp3) r1
            r6 = r32
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r14 = r33
            px0 r14 = (defpackage.px0) r14
            r17 = r34
            java.lang.Number r17 = (java.lang.Number) r17
            int r17 = r17.intValue()
            r19 = r17 & 6
            if (r19 != 0) goto L14d
            r15 = r14
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.f(r1)
            if (r1 == 0) goto L149
            r15 = 4
            goto L14a
        L149:
            r15 = 2
        L14a:
            r1 = r17 | r15
            goto L14f
        L14d:
            r1 = r17
        L14f:
            r15 = r17 & 48
            if (r15 != 0) goto L163
            r15 = r14
            xq2 r15 = (defpackage.xq2) r15
            boolean r15 = r15.d(r6)
            if (r15 == 0) goto L15f
            r16 = 32
            goto L161
        L15f:
            r16 = 16
        L161:
            r1 = r1 | r16
        L163:
            r15 = r1 & 147(0x93, float:2.06E-43)
            if (r15 == r5) goto L169
            r5 = r7
            goto L16a
        L169:
            r5 = 0
        L16a:
            r1 = r1 & r7
            xq2 r14 = (defpackage.xq2) r14
            boolean r1 = r14.S(r1, r5)
            if (r1 == 0) goto L21d
            java.lang.Object r1 = r4.get(r6)
            pq5 r1 = (defpackage.pq5) r1
            r4 = 1135582895(0x43af9eaf, float:351.23972)
            r14.b0(r4)
            android.net.Uri r4 = r1.d
            boolean r5 = r14.f(r10)
            boolean r6 = r14.h(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r14.P()
            if (r5 != 0) goto L192
            if (r6 != r8) goto L19b
        L192:
            gr5 r6 = new gr5
            r5 = 0
            r6.<init>(r10, r1, r9, r5)
            r14.l0(r6)
        L19b:
            eo2 r6 = (defpackage.eo2) r6
            defpackage.mb3.i(r14, r6, r4)
            java.lang.String r5 = r1.i
            java.lang.Object r3 = r3.get(r5)
            r22 = r3
            java.lang.String r22 = (java.lang.String) r22
            java.lang.String r3 = r4.toString()
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L1bf
            int r5 = r3.length()
            if (r5 <= 0) goto L1bf
            r23 = r3
            goto L1c1
        L1bf:
            r23 = r9
        L1c1:
            java.lang.String r3 = r4.toString()
            java.lang.Object r3 = r11.get(r3)
            if (r3 != 0) goto L1ce
            r24 = r7
            goto L1d0
        L1ce:
            r24 = 0
        L1d0:
            boolean r3 = r14.f(r12)
            boolean r4 = r14.h(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r14.P()
            if (r3 != 0) goto L1e1
            if (r4 != r8) goto L1e9
        L1e1:
            ua1 r4 = new ua1
            r4.<init>(r12, r1, r7)
            r14.l0(r4)
        L1e9:
            r25 = r4
            on2 r25 = (defpackage.on2) r25
            boolean r3 = r14.f(r13)
            boolean r4 = r14.h(r1)
            r3 = r3 | r4
            java.lang.Object r4 = r14.P()
            if (r3 != 0) goto L1fe
            if (r4 != r8) goto L207
        L1fe:
            ua1 r4 = new ua1
            r3 = 2
            r4.<init>(r13, r1, r3)
            r14.l0(r4)
        L207:
            r26 = r4
            on2 r26 = (defpackage.on2) r26
            qn2 r0 = r0.d0
            r29 = 0
            r27 = r0
            r21 = r1
            r28 = r14
            defpackage.ak7.n(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1 = 0
            r14.p(r1)
            goto L220
        L21d:
            r14.V()
        L220:
            return r2
    }
}
