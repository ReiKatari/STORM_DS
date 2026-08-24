package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o17  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o17 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ int L;
    public final /* synthetic */ int R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ o17(long r2, defpackage.s47 r4, defpackage.eo2 r5, int r6, int r7) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.X = r4
            r1.Y = r5
            r1.L = r6
            r1.R = r7
            return
    }

    public /* synthetic */ o17(java.lang.String r2, defpackage.a74 r3, long r4, int r6, int r7) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.X = r2
            r1.Y = r3
            r1.B = r4
            r1.L = r6
            r1.R = r7
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r21, java.lang.Object r22) {
            r20 = this;
            r0 = r20
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            int r3 = r0.L
            java.lang.Object r4 = r0.Y
            java.lang.Object r5 = r0.X
            switch(r1) {
                case 0: goto L2e;
                default: goto Lf;
            }
        Lf:
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = r4
            a74 r7 = (defpackage.a74) r7
            r10 = r21
            px0 r10 = (defpackage.px0) r10
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = r3 | 1
            int r11 = defpackage.ii2.a0(r1)
            long r8 = r0.B
            int r12 = r0.R
            defpackage.hf.i(r6, r7, r8, r10, r11, r12)
            return r2
        L2e:
            r15 = r5
            s47 r15 = (defpackage.s47) r15
            r16 = r4
            eo2 r16 = (defpackage.eo2) r16
            r17 = r21
            px0 r17 = (defpackage.px0) r17
            r1 = r22
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = r3 | 1
            int r18 = defpackage.ii2.a0(r1)
            long r13 = r0.B
            int r0 = r0.R
            r19 = r0
            defpackage.nj2.b(r13, r15, r16, r17, r18, r19)
            return r2
    }
}
