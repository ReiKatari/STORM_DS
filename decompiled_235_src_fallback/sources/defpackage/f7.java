package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f7  reason: default package */
/* loaded from: classes.dex */
public final class f7 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qa4 B;
    public final /* synthetic */ defpackage.rs4 L;

    public /* synthetic */ f7(defpackage.qa4 r1, defpackage.rs4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r2, defpackage.r41 r3) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            b00 r2 = (defpackage.b00) r2
            qa4 r3 = r1.B
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.setValue(r0)
            rs4 r1 = r1.L
            float r2 = r2.c
            r1.i(r2)
            jg7 r1 = defpackage.jg7.a
            return r1
        L18:
            zz4 r2 = (defpackage.zz4) r2
            java.lang.Object r1 = r1.b(r2, r3)
            return r1
    }

    public java.lang.Object b(defpackage.zz4 r14, defpackage.r41 r15) {
            r13 = this;
            boolean r0 = r15 instanceof defpackage.e7
            if (r0 == 0) goto L14
            r0 = r15
            e7 r0 = (defpackage.e7) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            e7 r0 = new e7
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r5.R
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r5.Y
            rs4 r7 = r13.L
            qa4 r13 = r13.B
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 3
            r12 = 0
            if (r1 == 0) goto L43
            if (r1 == r9) goto L3f
            if (r1 == r8) goto L3b
            if (r1 != r11) goto L35
            defpackage.oi2.Y(r15)
            goto L84
        L35:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r12
        L3b:
            defpackage.oi2.Y(r15)
            goto L6c
        L3f:
            defpackage.oi2.Y(r15)
            goto L61
        L43:
            defpackage.oi2.Y(r15)
            r13.setValue(r14)
            e41 r14 = defpackage.ir1.c
            sc7 r3 = defpackage.ge7.Y(r10, r10, r14, r11)
            d7 r4 = new d7
            r4.<init>(r7, r10)
            r5.Y = r9
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            r6 = 4
            java.lang.Object r14 = defpackage.kj2.l(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L61
            goto L83
        L61:
            r5.Y = r8
            r14 = 5500(0x157c, double:2.7174E-320)
            java.lang.Object r14 = defpackage.q60.t(r14, r5)
            if (r14 != r0) goto L6c
            goto L83
        L6c:
            e41 r14 = defpackage.ir1.c
            sc7 r3 = defpackage.ge7.Y(r10, r10, r14, r11)
            d7 r4 = new d7
            r4.<init>(r7, r9)
            r5.Y = r11
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 4
            java.lang.Object r14 = defpackage.kj2.l(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L84
        L83:
            return r0
        L84:
            r13.setValue(r12)
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}
