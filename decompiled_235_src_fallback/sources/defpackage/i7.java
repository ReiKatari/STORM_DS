package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public /* synthetic */ i7(long r2, defpackage.el6 r4, java.lang.String r5) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r4
            r1.R = r5
            return
    }

    public /* synthetic */ i7(java.lang.Object r1, long r2, java.lang.Object r4, int r5, int r6) {
            r0 = this;
            r0.A = r6
            r0.L = r1
            r0.B = r2
            r0.R = r4
            r0.<init>()
            return
    }

    public /* synthetic */ i7(defpackage.ok4 r1, defpackage.a74 r2, long r3, int r5) {
            r0 = this;
            r5 = 1
            r0.A = r5
            r0.<init>()
            r0.L = r1
            r0.R = r2
            r0.B = r3
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r17, java.lang.Object r18) {
            r16 = this;
            r0 = r16
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r0.R
            java.lang.Object r4 = r0.L
            r5 = 1
            switch(r1) {
                case 0: goto La2;
                case 1: goto L87;
                case 2: goto L6a;
                default: goto Le;
            }
        Le:
            el6 r4 = (defpackage.el6) r4
            java.lang.String r3 = (java.lang.String) r3
            r1 = r17
            px0 r1 = (defpackage.px0) r1
            r6 = r18
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r7 = r6 & 3
            r8 = 2
            if (r7 == r8) goto L25
            r7 = r5
            goto L26
        L25:
            r7 = 0
        L26:
            r6 = r6 & r5
            r13 = r1
            xq2 r13 = (defpackage.xq2) r13
            boolean r1 = r13.S(r6, r7)
            if (r1 == 0) goto L66
            r1 = 5
            long r6 = r0.B
            bd1 r11 = defpackage.k90.b(r6, r13, r1)
            boolean r0 = r13.h(r4)
            java.lang.Object r1 = r13.P()
            if (r0 != 0) goto L45
            vs0 r0 = defpackage.ox0.a
            if (r1 != r0) goto L4d
        L45:
            cl6 r1 = new cl6
            r1.<init>(r4, r5)
            r13.l0(r1)
        L4d:
            r8 = r1
            on2 r8 = (defpackage.on2) r8
            e20 r0 = new e20
            r0.<init>(r3, r5)
            r1 = -929149933(0xffffffffc89e4c13, float:-324192.6)
            zv0 r12 = defpackage.n16.I(r1, r0, r13)
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r15 = 382(0x17e, float:5.35E-43)
            r9 = 0
            r10 = 0
            defpackage.mb3.o(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L69
        L66:
            r13.V()
        L69:
            return r2
        L6a:
            n65 r4 = (defpackage.n65) r4
            r6 = r3
            a74 r6 = (defpackage.a74) r6
            r7 = r17
            px0 r7 = (defpackage.px0) r7
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 385(0x181, float:5.4E-43)
            int r8 = defpackage.ii2.a0(r1)
            r3 = r4
            long r4 = r0.B
            defpackage.k65.a(r3, r4, r6, r7, r8)
            return r2
        L87:
            r9 = r4
            ok4 r9 = (defpackage.ok4) r9
            r10 = r3
            a74 r10 = (defpackage.a74) r10
            r13 = r17
            px0 r13 = (defpackage.px0) r13
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r14 = defpackage.ii2.a0(r5)
            long r11 = r0.B
            defpackage.vf.a(r9, r10, r11, r13, r14)
            return r2
        La2:
            java.util.List r4 = (java.util.List) r4
            r6 = r3
            qn2 r6 = (defpackage.qn2) r6
            r7 = r17
            px0 r7 = (defpackage.px0) r7
            r1 = r18
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r8 = defpackage.ii2.a0(r5)
            long r0 = r0.B
            r3 = r4
            r4 = r0
            defpackage.ge7.a(r3, r4, r6, r7, r8)
            return r2
    }
}
