package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xf4 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ defpackage.ao2 X;

    public /* synthetic */ xf4(java.lang.String r1, boolean r2, boolean r3, defpackage.qn2 r4, int r5) {
            r0 = this;
            r5 = 1
            r0.A = r5
            r0.<init>()
            r0.R = r1
            r0.B = r2
            r0.L = r3
            r0.X = r4
            return
    }

    public /* synthetic */ xf4(boolean r1, boolean r2, defpackage.on2 r3, defpackage.on2 r4, int r5) {
            r0 = this;
            r5 = 0
            r0.A = r5
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r19, java.lang.Object r20) {
            r18 = this;
            r0 = r18
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 1
            ao2 r4 = r0.X
            java.lang.Object r5 = r0.R
            switch(r1) {
                case 0: goto L2b;
                default: goto Le;
            }
        Le:
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r9 = r4
            qn2 r9 = (defpackage.qn2) r9
            r10 = r19
            px0 r10 = (defpackage.px0) r10
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r11 = defpackage.ii2.a0(r3)
            boolean r7 = r0.B
            boolean r8 = r0.L
            defpackage.lt5.c(r6, r7, r8, r9, r10, r11)
            return r2
        L2b:
            r14 = r5
            on2 r14 = (defpackage.on2) r14
            r15 = r4
            on2 r15 = (defpackage.on2) r15
            r16 = r19
            px0 r16 = (defpackage.px0) r16
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r17 = defpackage.ii2.a0(r3)
            boolean r12 = r0.B
            boolean r13 = r0.L
            defpackage.f04.j(r12, r13, r14, r15, r16, r17)
            return r2
    }
}
