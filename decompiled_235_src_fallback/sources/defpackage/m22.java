package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m22  reason: default package */
/* loaded from: classes.dex */
public final class m22 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.io.Serializable e0;
    public final /* synthetic */ java.io.Serializable f0;
    public final /* synthetic */ java.lang.Object g0;

    public /* synthetic */ m22(java.lang.Object r1, java.lang.Object r2, java.io.Serializable r3, java.io.Serializable r4, java.lang.Object r5, defpackage.r41 r6, int r7) {
            r0 = this;
            r0.X = r7
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r0.g0 = r5
            r1 = 1
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r14.g0
            java.io.Serializable r3 = r14.f0
            java.io.Serializable r4 = r14.e0
            java.lang.Object r5 = r14.d0
            java.lang.Object r14 = r14.Z
            switch(r0) {
                case 0: goto L2e;
                default: goto L11;
            }
        L11:
            r12 = r15
            r41 r12 = (defpackage.r41) r12
            m22 r6 = new m22
            r7 = r14
            bn5 r7 = (defpackage.bn5) r7
            r8 = r5
            ea5 r8 = (defpackage.ea5) r8
            r9 = r4
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r10 = r3
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r11 = r2
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r13 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r14 = r6.s(r1)
            return r14
        L2e:
            r8 = r15
            r41 r8 = (defpackage.r41) r8
            r15 = r2
            m22 r2 = new m22
            sz1 r14 = (defpackage.sz1) r14
            zg5 r5 = (defpackage.zg5) r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r7 = r15
            nv4 r7 = (defpackage.nv4) r7
            r9 = 0
            r3 = r5
            r5 = r4
            r4 = r3
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r14 = r2.s(r1)
            return r14
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            java.lang.Object r1 = r11.g0
            java.io.Serializable r2 = r11.f0
            java.io.Serializable r3 = r11.e0
            java.lang.Object r4 = r11.d0
            java.lang.Object r6 = r11.Z
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r8 = 1
            r9 = 0
            switch(r0) {
                case 0: goto L45;
                default: goto L13;
            }
        L13:
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r11.Y
            if (r0 == 0) goto L23
            if (r0 != r8) goto L1f
            defpackage.oi2.Y(r12)
            goto L42
        L1f:
            defpackage.i.m(r7)
            goto L44
        L23:
            defpackage.oi2.Y(r12)
            r0 = r6
            bn5 r0 = (defpackage.bn5) r0
            ea5 r4 = (defpackage.ea5) r4
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r11.Y = r8
            r5 = r4
            r4 = r1
            r1 = r5
            r5 = r3
            r3 = r2
            r2 = r5
            r5 = r11
            java.lang.Object r0 = defpackage.vm5.F(r0, r1, r2, r3, r4, r5)
            if (r0 != r10) goto L42
            r9 = r10
            goto L44
        L42:
            jg7 r9 = defpackage.jg7.a
        L44:
            return r9
        L45:
            sz1 r6 = (defpackage.sz1) r6
            zg5 r4 = (defpackage.zg5) r4
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r11.Y
            if (r10 == 0) goto L5b
            if (r10 != r8) goto L56
            defpackage.oi2.Y(r12)
            r5 = r12
            goto L6f
        L56:
            defpackage.i.m(r7)
            goto Le2
        L5b:
            defpackage.oi2.Y(r12)
            pn5 r7 = r6.g
            r11.Y = r8
            pl r7 = (defpackage.pl) r7
            hk r7 = r7.c
            java.lang.Object r5 = r7.b(r11)
            if (r5 != r0) goto L6f
            r9 = r0
            goto Le2
        L6f:
            boolean r0 = r5 instanceof defpackage.hb5
            if (r0 == 0) goto L76
            hb5 r5 = (defpackage.hb5) r5
            goto L77
        L76:
            r5 = r9
        L77:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = (java.lang.String) r2
            if (r5 == 0) goto L80
            java.lang.String r0 = r5.a
            goto L81
        L80:
            r0 = r9
        L81:
            if (r5 == 0) goto L85
            java.lang.String r9 = r5.b
        L85:
            boolean r5 = defpackage.qs6.v0(r3)
            if (r5 == 0) goto L8c
            goto La0
        L8c:
            boolean r5 = defpackage.qs6.v0(r2)
            if (r5 == 0) goto L93
            goto La0
        L93:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto La0
            boolean r0 = r2.equals(r9)
            if (r0 == 0) goto La0
            goto La1
        La0:
            r8 = 0
        La1:
            r4.A = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            vr4 r2 = new vr4
            java.lang.String r3 = "identity_match"
            r2.<init>(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vr4 r3 = new vr4
            java.lang.String r5 = "submission_allowed"
            r3.<init>(r5, r0)
            nv4 r1 = (defpackage.nv4) r1
            de5 r0 = r1.i
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            bv4 r0 = (defpackage.bv4) r0
            lc5 r0 = r0.c
            int r0 = r0.a
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            vr4 r0 = new vr4
            java.lang.String r5 = "pending_total"
            r0.<init>(r5, r1)
            vr4[] r0 = new defpackage.vr4[]{r2, r3, r0}
            java.lang.String r1 = "ra_logout_identity_checked"
            r6.G0(r1, r0)
            boolean r0 = r4.A
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
        Le2:
            return r9
    }
}
