package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj  reason: default package */
/* loaded from: classes.dex */
public final class xj implements defpackage.e34 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public /* synthetic */ xj(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r24, java.util.List r25, long r26) {
            r23 = this;
            r0 = r23
            r3 = r24
            r1 = r25
            int r2 = r0.a
            zt1 r8 = defpackage.zt1.A
            java.lang.Object r4 = r0.b
            java.lang.Object r0 = r0.c
            switch(r2) {
                case 0: goto L1b1;
                case 1: goto Lf2;
                default: goto L11;
            }
        L11:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = r1.size()
            r2.<init>(r7)
            int r7 = r1.size()
            r9 = 0
        L1f:
            if (r9 >= r7) goto L36
            java.lang.Object r10 = r1.get(r9)
            r11 = r10
            x24 r11 = (defpackage.x24) r11
            java.lang.Object r11 = r11.B()
            boolean r11 = r11 instanceof defpackage.l47
            if (r11 != 0) goto L33
            r2.add(r10)
        L33:
            int r9 = r9 + 1
            goto L1f
        L36:
            on2 r0 = (defpackage.on2) r0
            java.lang.Object r0 = r0.c()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lb2
            java.util.ArrayList r7 = new java.util.ArrayList
            int r9 = r0.size()
            r7.<init>(r9)
            int r9 = r0.size()
            r10 = 0
        L4e:
            if (r10 >= r9) goto Lb0
            java.lang.Object r11 = r0.get(r10)
            of5 r11 = (defpackage.of5) r11
            if (r11 == 0) goto La3
            float r12 = r11.b
            float r13 = r11.a
            vr4 r14 = new vr4
            java.lang.Object r15 = r2.get(r10)
            x24 r15 = (defpackage.x24) r15
            float r6 = r11.c
            float r6 = r6 - r13
            double r5 = (double) r6
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            float r6 = r11.d
            float r6 = r6 - r12
            r11 = r9
            r16 = r10
            double r9 = (double) r6
            double r9 = java.lang.Math.floor(r9)
            float r6 = (float) r9
            int r6 = (int) r6
            r9 = 5
            r10 = 0
            long r5 = defpackage.s21.b(r10, r5, r10, r6, r9)
            dx4 r5 = r15.y(r5)
            int r6 = java.lang.Math.round(r13)
            int r9 = java.lang.Math.round(r12)
            long r12 = (long) r6
            r6 = 32
            long r12 = r12 << r6
            long r9 = (long) r9
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r17
            long r9 = r9 | r12
            i93 r6 = new i93
            r6.<init>(r9)
            r14.<init>(r5, r6)
            goto La7
        La3:
            r11 = r9
            r16 = r10
            r14 = 0
        La7:
            if (r14 == 0) goto Lac
            r7.add(r14)
        Lac:
            int r10 = r16 + 1
            r9 = r11
            goto L4e
        Lb0:
            r6 = r7
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r1.size()
            r0.<init>(r2)
            int r2 = r1.size()
            r5 = 0
        Lc1:
            if (r5 >= r2) goto Ld8
            java.lang.Object r7 = r1.get(r5)
            r9 = r7
            x24 r9 = (defpackage.x24) r9
            java.lang.Object r9 = r9.B()
            boolean r9 = r9 instanceof defpackage.l47
            if (r9 == 0) goto Ld5
            r0.add(r7)
        Ld5:
            int r5 = r5 + 1
            goto Lc1
        Ld8:
            on2 r4 = (defpackage.on2) r4
            java.util.ArrayList r0 = defpackage.jw2.i(r0, r4)
            int r1 = defpackage.q21.h(r26)
            int r2 = defpackage.q21.g(r26)
            qk4 r4 = new qk4
            r5 = 27
            r4.<init>(r5, r6, r0)
            f34 r0 = r3.K(r1, r2, r8, r4)
            return r0
        Lf2:
            eo2 r4 = (defpackage.eo2) r4
            java.lang.String r2 = "Collection contains no element matching the predicate."
            if (r4 == 0) goto L132
            int r4 = r1.size()
            r10 = 0
        Lfd:
            if (r10 >= r4) goto L129
            java.lang.Object r5 = r1.get(r10)
            x24 r5 = (defpackage.x24) r5
            java.lang.Object r6 = defpackage.lb4.u(r5)
            java.lang.String r7 = "text"
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L126
            r21 = 0
            r22 = 11
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r26
            long r6 = defpackage.q21.a(r16, r18, r19, r20, r21, r22)
            dx4 r4 = r5.y(r6)
            goto L133
        L126:
            int r10 = r10 + 1
            goto Lfd
        L129:
            defpackage.ex3.b(r2)
            defpackage.e41.c()
        L12f:
            r6 = 0
            goto L1b0
        L132:
            r4 = 0
        L133:
            eo2 r0 = (defpackage.eo2) r0
            if (r0 == 0) goto L164
            int r0 = r1.size()
            r10 = 0
        L13c:
            if (r10 >= r0) goto L15d
            java.lang.Object r5 = r1.get(r10)
            x24 r5 = (defpackage.x24) r5
            java.lang.Object r6 = defpackage.lb4.u(r5)
            java.lang.String r7 = "icon"
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L158
            r6 = r26
            dx4 r0 = r5.y(r6)
            r2 = r0
            goto L165
        L158:
            r6 = r26
            int r10 = r10 + 1
            goto L13c
        L15d:
            defpackage.ex3.b(r2)
            defpackage.e41.c()
            goto L12f
        L164:
            r2 = 0
        L165:
            if (r4 == 0) goto L16a
            int r10 = r4.A
            goto L16b
        L16a:
            r10 = 0
        L16b:
            if (r2 == 0) goto L170
            int r5 = r2.A
            goto L171
        L170:
            r5 = 0
        L171:
            int r0 = java.lang.Math.max(r10, r5)
            if (r4 == 0) goto L17e
            if (r2 == 0) goto L17e
            int r1 = defpackage.ey6.b
            r1 = 1116733440(0x42900000, float:72.0)
            goto L182
        L17e:
            int r1 = defpackage.ey6.b
            r1 = 1111490560(0x42400000, float:48.0)
        L182:
            int r5 = r3.r0(r1)
            if (r4 == 0) goto L194
            ey2 r1 = defpackage.lc.a
            int r1 = r4.X(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = r1
            goto L195
        L194:
            r6 = 0
        L195:
            if (r4 == 0) goto L1a5
            ey2 r1 = defpackage.lc.b
            int r1 = r4.X(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r7 = r1
        L1a2:
            r1 = r4
            r4 = r0
            goto L1a7
        L1a5:
            r7 = 0
            goto L1a2
        L1a7:
            dy6 r0 = new dy6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            f34 r6 = r3.K(r4, r5, r8, r0)
        L1b0:
            return r6
        L1b1:
            c05 r4 = (defpackage.c05) r4
            kk3 r0 = (defpackage.kk3) r0
            r4.setParentLayoutDirection(r0)
            ne r0 = defpackage.ne.e0
            r10 = 0
            f34 r0 = r3.K(r10, r10, r8, r0)
            return r0
    }
}
