package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c27  reason: default package */
/* loaded from: classes.dex */
public final class c27 extends defpackage.hw6 implements defpackage.fo2 {
    public int X;
    public /* synthetic */ defpackage.j25 Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ defpackage.w61 d0;
    public final /* synthetic */ defpackage.qa4 e0;
    public final /* synthetic */ defpackage.r94 f0;

    public c27(defpackage.w61 r1, defpackage.qa4 r2, defpackage.r94 r3, defpackage.r41 r4) {
            r0 = this;
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r1 = 3
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            j25 r5 = (defpackage.j25) r5
            jk4 r6 = (defpackage.jk4) r6
            long r0 = r6.a
            r41 r7 = (defpackage.r41) r7
            c27 r6 = new c27
            qa4 r2 = r4.e0
            r94 r3 = r4.f0
            w61 r4 = r4.d0
            r6.<init>(r4, r2, r3, r7)
            r6.Y = r5
            r6.Z = r0
            jg7 r4 = defpackage.jg7.a
            java.lang.Object r4 = r6.s(r4)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r13.X
            r2 = 3
            w61 r3 = r13.d0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L17
            if (r1 != r5) goto L11
            defpackage.oi2.Y(r14)
            goto L35
        L11:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r4
        L17:
            defpackage.oi2.Y(r14)
            j25 r14 = r13.Y
            long r8 = r13.Z
            c0 r6 = new c0
            r10 = 0
            r7 = 5
            qa4 r11 = r13.e0
            r94 r12 = r13.f0
            r6.<init>(r7, r8, r10, r11, r12)
            defpackage.hv.L(r3, r4, r4, r6, r2)
            r13.X = r5
            java.lang.Object r14 = r14.i(r13)
            if (r14 != r0) goto L35
            return r0
        L35:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            f12 r0 = new f12
            qa4 r1 = r13.e0
            r94 r13 = r13.f0
            r0.<init>(r1, r14, r13, r4)
            defpackage.hv.L(r3, r4, r4, r0, r2)
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}
