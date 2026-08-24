package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yl implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ int R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ yl(defpackage.a74 r2, defpackage.on2 r3, boolean r4, int r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.X = r2
            r1.L = r3
            r1.B = r4
            r1.R = r5
            return
    }

    public /* synthetic */ yl(java.lang.String r1, boolean r2, defpackage.on2 r3, int r4, int r5) {
            r0 = this;
            r4 = 1
            r0.A = r4
            r0.<init>()
            r0.X = r1
            r0.B = r2
            r0.L = r3
            r0.R = r5
            return
    }

    public /* synthetic */ yl(boolean r2, defpackage.jl5 r3, defpackage.p27 r4, int r5) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.X = r3
            r1.L = r4
            r1.R = r5
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.A
            int r1 = r13.R
            boolean r2 = r13.B
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            java.lang.Object r5 = r13.L
            java.lang.Object r6 = r13.X
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L25;
                default: goto L10;
            }
        L10:
            jl5 r6 = (defpackage.jl5) r6
            p27 r5 = (defpackage.p27) r5
            px0 r14 = (defpackage.px0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            r13 = r1 | 1
            int r13 = defpackage.ii2.a0(r13)
            defpackage.bl2.k(r2, r6, r5, r14, r13)
            return r3
        L25:
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            r9 = r5
            on2 r9 = (defpackage.on2) r9
            r10 = r14
            px0 r10 = (defpackage.px0) r10
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            int r11 = defpackage.ii2.a0(r4)
            boolean r8 = r13.B
            int r12 = r13.R
            defpackage.q60.b(r7, r8, r9, r10, r11, r12)
            return r3
        L3f:
            a74 r6 = (defpackage.a74) r6
            on2 r5 = (defpackage.on2) r5
            px0 r14 = (defpackage.px0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            r13 = r1 | 1
            int r13 = defpackage.ii2.a0(r13)
            defpackage.mb3.m(r6, r5, r2, r14, r13)
            return r3
    }
}
