package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic3  reason: default package */
/* loaded from: classes.dex */
public final class ic3 extends defpackage.yc7 {
    public final java.util.List a;
    public final /* synthetic */ int b;

    public ic3(java.lang.String[] r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.<init>()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.a = r1
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r12) {
            r11 = this;
            jf3 r0 = r12.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r0 != r1) goto Ld
            r12.j0()
            r11 = 0
            return r11
        Ld:
            r12.h()
            java.util.List r0 = r11.a
            int r1 = r0.size()
            long[] r1 = new long[r1]
        L18:
            jf3 r2 = r12.n0()
            jf3 r3 = defpackage.jf3.END_OBJECT
            if (r2 == r3) goto L35
            java.lang.String r2 = r12.c0()
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto L31
            long r3 = r12.a0()
            r1[r2] = r3
            goto L18
        L31:
            r12.u0()
            goto L18
        L35:
            r12.u()
            int r11 = r11.b
            r12 = 3
            r0 = 2
            r2 = 1
            r3 = 0
            switch(r11) {
                case 0: goto Lee;
                case 1: goto Ldd;
                case 2: goto Ld4;
                case 3: goto Lcb;
                case 4: goto Lb4;
                case 5: goto L97;
                case 6: goto L86;
                case 7: goto L6e;
                default: goto L41;
            }
        L41:
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar
            r5 = r1[r3]
            int r5 = defpackage.fe7.b(r5)
            r2 = r1[r2]
            int r6 = defpackage.fe7.b(r2)
            r2 = r1[r0]
            int r7 = defpackage.fe7.b(r2)
            r11 = r1[r12]
            int r8 = defpackage.fe7.b(r11)
            r11 = 4
            r11 = r1[r11]
            int r9 = defpackage.fe7.b(r11)
            r11 = 5
            r11 = r1[r11]
            int r10 = defpackage.fe7.b(r11)
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto Lf8
        L6e:
            r11 = r1[r3]
            int r11 = java.lang.Math.toIntExact(r11)
            r2 = r1[r2]
            int r12 = java.lang.Math.toIntExact(r2)
            r0 = r1[r0]
            int r0 = java.lang.Math.toIntExact(r0)
            java.time.Period r4 = defpackage.oc3.i(r11, r12, r0)
            goto Lf8
        L86:
            r11 = r1[r3]
            int r11 = java.lang.Math.toIntExact(r11)
            r0 = r1[r2]
            int r12 = java.lang.Math.toIntExact(r0)
            java.time.MonthDay r4 = defpackage.mc3.p(r11, r12)
            goto Lf8
        L97:
            r3 = r1[r3]
            int r11 = java.lang.Math.toIntExact(r3)
            r2 = r1[r2]
            int r2 = java.lang.Math.toIntExact(r2)
            r3 = r1[r0]
            int r0 = java.lang.Math.toIntExact(r3)
            r3 = r1[r12]
            int r12 = java.lang.Math.toIntExact(r3)
            java.time.LocalTime r4 = defpackage.mc3.l(r11, r2, r0, r12)
            goto Lf8
        Lb4:
            r11 = r1[r3]
            int r11 = java.lang.Math.toIntExact(r11)
            r2 = r1[r2]
            int r12 = java.lang.Math.toIntExact(r2)
            r0 = r1[r0]
            int r0 = java.lang.Math.toIntExact(r0)
            java.time.LocalDate r4 = defpackage.mc3.g(r11, r12, r0)
            goto Lf8
        Lcb:
            r11 = r1[r3]
            r0 = r1[r2]
            java.time.Instant r4 = defpackage.wa2.r(r11, r0)
            goto Lf8
        Ld4:
            r11 = r1[r3]
            r0 = r1[r2]
            java.time.Duration r4 = defpackage.wa2.o(r11, r0)
            goto Lf8
        Ldd:
            r11 = r1[r3]
            int r11 = java.lang.Math.toIntExact(r11)
            r0 = r1[r2]
            int r12 = java.lang.Math.toIntExact(r0)
            java.time.YearMonth r4 = defpackage.jc3.g(r11, r12)
            goto Lf8
        Lee:
            r11 = r1[r3]
            int r11 = java.lang.Math.toIntExact(r11)
            java.time.Year r4 = defpackage.wa2.s(r11)
        Lf8:
            return r4
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r22, java.lang.Object r23) {
            r21 = this;
            r0 = r21
            r1 = r22
            if (r23 != 0) goto La
            r1.A()
            return
        La:
            r1.k()
            int r2 = r0.b
            r3 = 4
            r4 = 3
            r5 = 2
            r7 = 1
            switch(r2) {
                case 0: goto L11f;
                case 1: goto L107;
                case 2: goto Lf0;
                case 3: goto Ld9;
                case 4: goto Lba;
                case 5: goto L93;
                case 6: goto L7a;
                case 7: goto L59;
                default: goto L16;
            }
        L16:
            r2 = r23
            java.util.Calendar r2 = (java.util.Calendar) r2
            int r8 = r2.get(r7)
            long r8 = (long) r8
            int r10 = r2.get(r5)
            long r10 = (long) r10
            r12 = 5
            int r13 = r2.get(r12)
            long r13 = (long) r13
            r15 = 11
            int r15 = r2.get(r15)
            r23 = r12
            r16 = r13
            long r12 = (long) r15
            r14 = 12
            int r14 = r2.get(r14)
            long r14 = (long) r14
            r18 = 0
            r6 = 13
            int r2 = r2.get(r6)
            r6 = r7
            r19 = r8
            long r7 = (long) r2
            r2 = 6
            long[] r2 = new long[r2]
            r2[r18] = r19
            r2[r6] = r10
            r2[r5] = r16
            r2[r4] = r12
            r2[r3] = r14
            r2[r23] = r7
            goto L131
        L59:
            r6 = r7
            r18 = 0
            java.time.Period r2 = defpackage.oc3.j(r23)
            int r3 = defpackage.oc3.b(r2)
            long r7 = (long) r3
            int r3 = defpackage.oc3.x(r2)
            long r9 = (long) r3
            int r2 = defpackage.oc3.B(r2)
            long r2 = (long) r2
            long[] r4 = new long[r4]
            r4[r18] = r7
            r4[r6] = r9
            r4[r5] = r2
        L77:
            r2 = r4
            goto L131
        L7a:
            r6 = r7
            r18 = 0
            java.time.MonthDay r2 = defpackage.mc3.q(r23)
            int r3 = defpackage.mc3.d(r2)
            long r3 = (long) r3
            int r2 = defpackage.mc3.y(r2)
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        L93:
            r6 = r7
            r18 = 0
            java.time.LocalTime r2 = defpackage.mc3.m(r23)
            int r7 = defpackage.mc3.c(r2)
            long r7 = (long) r7
            int r9 = defpackage.mc3.x(r2)
            long r9 = (long) r9
            int r11 = defpackage.mc3.C(r2)
            long r11 = (long) r11
            int r2 = defpackage.mc3.D(r2)
            long r13 = (long) r2
            long[] r2 = new long[r3]
            r2[r18] = r7
            r2[r6] = r9
            r2[r5] = r11
            r2[r4] = r13
            goto L131
        Lba:
            r6 = r7
            r18 = 0
            java.time.LocalDate r2 = defpackage.mc3.h(r23)
            int r3 = defpackage.mc3.b(r2)
            long r7 = (long) r3
            int r3 = defpackage.mc3.w(r2)
            long r9 = (long) r3
            int r2 = defpackage.mc3.B(r2)
            long r2 = (long) r2
            long[] r4 = new long[r4]
            r4[r18] = r7
            r4[r6] = r9
            r4[r5] = r2
            goto L77
        Ld9:
            r6 = r7
            r18 = 0
            java.time.Instant r2 = defpackage.mc3.f(r23)
            long r3 = defpackage.mc3.e(r2)
            int r2 = defpackage.mc3.a(r2)
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        Lf0:
            r6 = r7
            r18 = 0
            java.time.Duration r2 = defpackage.wa2.p(r23)
            long r3 = defpackage.wa2.d(r2)
            int r2 = defpackage.wa2.a(r2)
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        L107:
            r6 = r7
            r18 = 0
            java.time.YearMonth r2 = defpackage.jc3.h(r23)
            int r3 = defpackage.jc3.a(r2)
            long r3 = (long) r3
            int r2 = defpackage.jc3.r(r2)
            long r7 = (long) r2
            long[] r2 = new long[r5]
            r2[r18] = r3
            r2[r6] = r7
            goto L131
        L11f:
            r6 = r7
            r18 = 0
            java.time.Year r2 = defpackage.wa2.t(r23)
            int r2 = defpackage.wa2.b(r2)
            long r2 = (long) r2
            long[] r4 = new long[r6]
            r4[r18] = r2
            goto L77
        L131:
            r6 = r18
        L133:
            java.util.List r3 = r0.a
            int r4 = r3.size()
            if (r6 >= r4) goto L14c
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r1.v(r3)
            r3 = r2[r6]
            r1.X(r3)
            int r6 = r6 + 1
            goto L133
        L14c:
            r1.u()
            return
    }
}
