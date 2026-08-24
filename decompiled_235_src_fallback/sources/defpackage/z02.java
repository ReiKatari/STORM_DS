package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z02  reason: default package */
/* loaded from: classes.dex */
public final class z02 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.sz1 Z;
    public final /* synthetic */ defpackage.qz1 d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ long f0;

    public /* synthetic */ z02(defpackage.sz1 r1, defpackage.qz1 r2, long r3, long r5, defpackage.r41 r7, int r8) {
            r0 = this;
            r0.X = r8
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r5
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            z02 r2 = (defpackage.z02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            z02 r2 = (defpackage.z02) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r11, java.lang.Object r12) {
            r10 = this;
            int r12 = r10.X
            switch(r12) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            z02 r0 = new z02
            long r5 = r10.f0
            r8 = 1
            sz1 r1 = r10.Z
            qz1 r2 = r10.d0
            long r3 = r10.e0
            r7 = r11
            r0.<init>(r1, r2, r3, r5, r7, r8)
            return r0
        L15:
            r7 = r11
            z02 r1 = new z02
            r8 = r7
            long r6 = r10.f0
            r9 = 0
            sz1 r2 = r10.Z
            qz1 r3 = r10.d0
            long r4 = r10.e0
            r1.<init>(r2, r3, r4, r6, r8, r9)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r17) {
            r16 = this;
            r13 = r16
            int r0 = r13.X
            jg7 r14 = defpackage.jg7.a
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            switch(r0) {
                case 0: goto L3e;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r13.Y
            if (r4 == 0) goto L1e
            if (r4 != r3) goto L19
            defpackage.oi2.Y(r17)
            goto L3d
        L19:
            defpackage.i.m(r2)
            r14 = r1
            goto L3d
        L1e:
            defpackage.oi2.Y(r17)
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            z02 r4 = new z02
            r11 = 0
            r12 = 0
            sz1 r5 = r13.Z
            qz1 r6 = r13.d0
            long r7 = r13.e0
            long r9 = r13.f0
            r4.<init>(r5, r6, r7, r9, r11, r12)
            r13.Y = r3
            java.lang.Object r1 = defpackage.hv.d0(r1, r4, r13)
            if (r1 != r0) goto L3d
            r14 = r0
        L3d:
            return r14
        L3e:
            x61 r15 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r13.Y
            if (r0 == 0) goto L56
            if (r0 != r3) goto L51
            defpackage.oi2.Y(r17)
            r0 = r17
            hm5 r0 = (defpackage.hm5) r0
            r0.getClass()
            goto L84
        L51:
            defpackage.i.m(r2)
            r14 = r1
            goto L84
        L56:
            defpackage.oi2.Y(r17)
            sz1 r0 = r13.Z
            oj4 r0 = r0.i
            qz1 r1 = r13.d0
            java.lang.String r2 = r1.a
            r4 = r2
            java.lang.String r2 = r1.b
            long r5 = r1.c
            r6 = r5
            java.lang.String r5 = r1.f
            gk4 r11 = r1.d
            gk4 r8 = defpackage.gk4.HARDCORE
            if (r11 != r8) goto L71
            r10 = r3
            goto L73
        L71:
            r8 = 0
            r10 = r8
        L73:
            ik4 r12 = r1.e
            r13.Y = r3
            r1 = r4
            r3 = r6
            long r6 = r13.e0
            long r8 = r13.f0
            java.lang.Object r0 = r0.d(r1, r2, r3, r5, r6, r8, r10, r11, r12, r13)
            if (r0 != r15) goto L84
            r14 = r15
        L84:
            return r14
    }
}
