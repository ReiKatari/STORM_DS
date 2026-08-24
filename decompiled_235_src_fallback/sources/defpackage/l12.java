package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l12  reason: default package */
/* loaded from: classes.dex */
public final class l12 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.sz1 Y;
    public final /* synthetic */ defpackage.qz1 Z;
    public final /* synthetic */ long d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;

    public l12(defpackage.sz1 r1, defpackage.qz1 r2, long r3, long r5, long r7, long r9, defpackage.r41 r11) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r5
            r0.f0 = r7
            r0.g0 = r9
            r1 = 2
            r0.<init>(r1, r11)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            l12 r0 = (defpackage.l12) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r13, java.lang.Object r14) {
            r12 = this;
            l12 r0 = new l12
            long r7 = r12.f0
            long r9 = r12.g0
            sz1 r1 = r12.Y
            qz1 r2 = r12.Z
            long r3 = r12.d0
            long r5 = r12.e0
            r11 = r13
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            qz1 r3 = r0.Z
            sz1 r4 = r0.Y
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L27
            if (r2 == r6) goto L23
            if (r2 != r5) goto L1c
            defpackage.oi2.Y(r20)
            r0 = r20
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            goto L72
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L23:
            defpackage.oi2.Y(r20)
            goto L41
        L27:
            defpackage.oi2.Y(r20)
            qf4 r2 = r4.h
            fb5 r7 = new fb5
            long r8 = r3.c
            r12 = 1
            r13 = 0
            long r10 = r0.d0
            r7.<init>(r8, r10, r12, r13)
            r0.X = r6
            java.lang.Object r2 = r2.b(r7, r0)
            if (r2 != r1) goto L41
            r0 = r1
            goto L70
        L41:
            oj4 r2 = r4.i
            r4 = r1
            r1 = r2
            java.lang.String r2 = r3.a
            java.lang.String r6 = r3.b
            long r7 = r3.c
            r9 = r7
            java.lang.String r8 = r3.f
            gk4 r15 = defpackage.gk4.SOFTCORE
            ik4 r3 = r3.e
            r0.X = r5
            r16 = r3
            r3 = r6
            long r6 = r0.d0
            r11 = r4
            r4 = r9
            long r9 = r0.e0
            r13 = r11
            long r11 = r0.f0
            r17 = r13
            long r13 = r0.g0
            r18 = r17
            r17 = r0
            r0 = r18
            java.lang.Object r1 = r1.b(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16, r17)
            if (r1 != r0) goto L71
        L70:
            return r0
        L71:
            r0 = r1
        L72:
            defpackage.oi2.Y(r0)
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
