package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ki6 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.mi6 B;

    public /* synthetic */ ki6(defpackage.mi6 r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    public /* synthetic */ ki6(defpackage.mi6 r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.A
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            mi6 r11 = r11.B
            px0 r12 = (defpackage.px0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            switch(r0) {
                case 0: goto L66;
                case 1: goto L5b;
                case 2: goto L19;
                default: goto Le;
            }
        Le:
            r13.getClass()
            int r13 = defpackage.ii2.a0(r2)
            defpackage.jx2.e(r11, r12, r13)
            return r1
        L19:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L25
            r0 = r2
            goto L26
        L25:
            r0 = r4
        L26:
            r13 = r13 & r2
            r8 = r12
            xq2 r8 = (defpackage.xq2) r8
            boolean r12 = r8.S(r13, r0)
            if (r12 == 0) goto L57
            r12 = 2131951750(0x7f130086, float:1.9539923E38)
            java.lang.String r5 = defpackage.yh2.O(r8, r12)
            boolean r12 = r8.f(r11)
            java.lang.Object r13 = r8.P()
            if (r12 != 0) goto L45
            vs0 r12 = defpackage.ox0.a
            if (r13 != r12) goto L4d
        L45:
            ji6 r13 = new ji6
            r13.<init>(r11, r4)
            r8.l0(r13)
        L4d:
            r7 = r13
            on2 r7 = (defpackage.on2) r7
            r9 = 0
            r10 = 2
            r6 = 0
            defpackage.q60.b(r5, r6, r7, r8, r9, r10)
            goto L5a
        L57:
            r8.V()
        L5a:
            return r1
        L5b:
            r13.getClass()
            int r13 = defpackage.ii2.a0(r2)
            defpackage.jx2.e(r11, r12, r13)
            return r1
        L66:
            r13.getClass()
            int r13 = defpackage.ii2.a0(r2)
            defpackage.jx2.e(r11, r12, r13)
            return r1
    }
}
