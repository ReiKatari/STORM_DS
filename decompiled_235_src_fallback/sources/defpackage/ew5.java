package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ew5  reason: default package */
/* loaded from: classes.dex */
public final class ew5 extends defpackage.hw6 implements defpackage.io2 {
    public int X;
    public /* synthetic */ defpackage.jt5 Y;
    public /* synthetic */ defpackage.vr4 Z;
    public /* synthetic */ defpackage.cw5 d0;
    public /* synthetic */ defpackage.oc7 e0;
    public /* synthetic */ boolean f0;
    public final /* synthetic */ defpackage.hw5 g0;

    public ew5(defpackage.hw5 r1, defpackage.r41 r2) {
            r0 = this;
            r0.g0 = r1
            r1 = 6
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r1 = this;
            jt5 r2 = (defpackage.jt5) r2
            vr4 r3 = (defpackage.vr4) r3
            cw5 r4 = (defpackage.cw5) r4
            oc7 r5 = (defpackage.oc7) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r41 r7 = (defpackage.r41) r7
            ew5 r0 = new ew5
            hw5 r1 = r1.g0
            r0.<init>(r1, r7)
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            r0.f0 = r6
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            jt5 r1 = r14.Y
            vr4 r0 = r14.Z
            cw5 r2 = r14.d0
            oc7 r3 = r14.e0
            boolean r11 = r14.f0
            x61 r13 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r14.X
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1e
            if (r4 != r5) goto L18
            defpackage.oi2.Y(r15)
            return r15
        L18:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r14)
            return r6
        L1e:
            defpackage.oi2.Y(r15)
            hw5 r15 = r14.g0
            bw5 r15 = r15.b
            java.lang.Object r4 = r0.A
            me.magnum.melonds.domain.model.ConsoleType r4 = (me.magnum.melonds.domain.model.ConsoleType) r4
            java.lang.Object r0 = r0.B
            me.magnum.melonds.domain.model.MicSource r0 = (me.magnum.melonds.domain.model.MicSource) r0
            r7 = r2
            r2 = r4
            me.magnum.melonds.domain.model.VideoRenderer r4 = r7.a
            r8 = r5
            boolean r5 = r7.b
            r9 = r6
            int r6 = r7.c
            me.magnum.melonds.domain.model.VideoFiltering r7 = r7.d
            java.lang.Object r10 = r3.A
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r3.B
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r3 = r3.L
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r14.Y = r9
            r14.Z = r9
            r14.d0 = r9
            r14.e0 = r9
            r14.f0 = r11
            r14.X = r8
            r8 = r10
            r9 = r12
            r12 = r14
            r10 = r3
            r3 = r0
            r0 = r15
            java.lang.Object r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r13) goto L62
            return r13
        L62:
            return r14
    }
}
