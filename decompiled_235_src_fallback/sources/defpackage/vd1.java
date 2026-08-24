package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd1  reason: default package */
/* loaded from: classes.dex */
public final class vd1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ float Z;
    public java.io.Serializable d0;
    public java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ java.lang.Object g0;

    public vd1(float r2, defpackage.r41 r3, defpackage.kq2 r4, defpackage.qq2 r5, java.lang.String r6, java.lang.String r7) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r6
            r1.e0 = r4
            r1.f0 = r5
            r1.g0 = r7
            r1.Z = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    public vd1(float r2, defpackage.wd1 r3, defpackage.i86 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.Z = r2
            r1.f0 = r3
            r1.g0 = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public vd1(defpackage.ql6 r2, float r3, defpackage.qn2 r4, defpackage.p76 r5, defpackage.r41 r6) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.e0 = r2
            r1.Z = r3
            r1.f0 = r4
            r1.g0 = r5
            r1.<init>(r0, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            vd1 r2 = (defpackage.vd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            vd1 r2 = (defpackage.vd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            vd1 r2 = (defpackage.vd1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r11, java.lang.Object r12) {
            r10 = this;
            int r12 = r10.X
            java.lang.Object r0 = r10.g0
            java.lang.Object r1 = r10.f0
            switch(r12) {
                case 0: goto L36;
                case 1: goto L1d;
                default: goto L9;
            }
        L9:
            vd1 r2 = new vd1
            java.lang.Object r12 = r10.e0
            r3 = r12
            ql6 r3 = (defpackage.ql6) r3
            r5 = r1
            qn2 r5 = (defpackage.qn2) r5
            r6 = r0
            p76 r6 = (defpackage.p76) r6
            float r4 = r10.Z
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L1d:
            r5 = r11
            vd1 r3 = new vd1
            java.io.Serializable r11 = r10.d0
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r10.e0
            r6 = r11
            kq2 r6 = (defpackage.kq2) r6
            r7 = r1
            qq2 r7 = (defpackage.qq2) r7
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            float r4 = r10.Z
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L36:
            r5 = r11
            vd1 r11 = new vd1
            wd1 r1 = (defpackage.wd1) r1
            i86 r0 = (defpackage.i86) r0
            float r10 = r10.Z
            r11.<init>(r10, r1, r0, r5)
            return r11
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r40) {
            r39 = this;
            r5 = r39
            int r0 = r5.X
            r6 = 0
            r7 = 2
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            float r2 = r5.Z
            r8 = 0
            java.lang.Object r9 = r5.g0
            r10 = 1
            java.lang.Object r3 = r5.f0
            switch(r0) {
                case 0: goto L618;
                case 1: goto L24f;
                default: goto L13;
            }
        L13:
            r12 = r3
            qn2 r12 = (defpackage.qn2) r12
            java.lang.Object r0 = r5.e0
            ql6 r0 = (defpackage.ql6) r0
            ap3 r13 = r0.a
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r5.Y
            if (r3 == 0) goto L40
            if (r3 == r10) goto L33
            if (r3 != r7) goto L2d
            defpackage.oi2.Y(r40)
            r14 = r40
            goto L24e
        L2d:
            defpackage.i.m(r1)
            r14 = 0
            goto L24e
        L33:
            java.io.Serializable r1 = r5.d0
            ah5 r1 = (defpackage.ah5) r1
            defpackage.oi2.Y(r40)
            r15 = r6
            r6 = r1
            r1 = r40
            goto L11a
        L40:
            defpackage.oi2.Y(r40)
            oc1 r1 = r0.b
            eb r3 = new eb
            s35 r1 = r1.a
            r4 = 26
            r3.<init>(r1, r4)
            wo r1 = new wo
            r1.<init>(r6)
            wo r4 = new wo
            r4.<init>(r2)
            ap r1 = r3.E(r1, r4)
            wo r1 = (defpackage.wo) r1
            float r1 = r1.a
            java.lang.Object r3 = r13.B
            ue1 r3 = (defpackage.ue1) r3
            vs4 r4 = r3.m
            int r15 = r3.o()
            java.lang.Object r16 = r4.getValue()
            r7 = r16
            cr4 r7 = (defpackage.cr4) r7
            int r7 = r7.c
            int r7 = r7 + r15
            if (r7 != 0) goto L7a
            r1 = r6
            r15 = r1
            goto Lde
        L7a:
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            int r11 = r3.e
            if (r15 >= 0) goto L82
            int r11 = r11 + 1
        L82:
            float r15 = (float) r7
            float r1 = r1 / r15
            int r1 = (int) r1
            int r1 = r1 + r11
            int r15 = r3.n()
            int r1 = defpackage.gi2.q(r1, r8, r15)
            r3.o()
            java.lang.Object r4 = r4.getValue()
            cr4 r4 = (defpackage.cr4) r4
            int r4 = r4.c
            r15 = r6
            r40 = r7
            long r6 = (long) r11
            r17 = 1
            long r19 = r6 - r17
            r21 = 0
            int r4 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r4 >= 0) goto Lab
            r4 = r11
            r10 = r21
            goto Lae
        Lab:
            r4 = r11
            r10 = r19
        Lae:
            int r10 = (int) r10
            long r6 = r6 + r17
            r17 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r11 <= 0) goto Lba
            r6 = r17
        Lba:
            int r6 = (int) r6
            int r1 = defpackage.gi2.q(r1, r10, r6)
            int r3 = r3.n()
            int r1 = defpackage.gi2.q(r1, r8, r3)
            int r1 = r1 - r4
            int r1 = r1 * r40
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 - r40
            if (r1 >= 0) goto Ld3
            r1 = r8
        Ld3:
            if (r1 != 0) goto Ld7
            float r1 = (float) r1
            goto Lde
        Ld7:
            float r1 = (float) r1
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r1
            r1 = r3
        Lde:
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 == 0) goto Le9
            java.lang.String r3 = "calculateApproachOffset returned NaN. Please use a valid value."
            defpackage.s53.c(r3)
        Le9:
            ah5 r6 = new ah5
            r6.<init>()
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.signum(r2)
            float r2 = r2 * r1
            r6.A = r2
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r12.g(r1)
            r1 = r9
            p76 r1 = (defpackage.p76) r1
            float r2 = r6.A
            nl6 r4 = new nl6
            r4.<init>(r6, r12, r8)
            r5.d0 = r6
            r3 = 1
            r5.Y = r3
            float r3 = r5.Z
            java.lang.Object r1 = defpackage.ql6.b(r0, r1, r2, r3, r4, r5)
            if (r1 != r14) goto L11a
            goto L24e
        L11a:
            uo r1 = (defpackage.uo) r1
            java.lang.Object r2 = r1.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            java.lang.Object r3 = r13.B
            ue1 r3 = (defpackage.ue1) r3
            cr4 r4 = r3.m()
            cs1 r4 = r4.n
            cr4 r7 = r3.m()
            java.util.List r7 = r7.a
            int r10 = r7.size()
            r17 = 2139095040(0x7f800000, float:Infinity)
            r19 = r17
            r18 = -8388608(0xffffffffff800000, float:-Infinity)
        L140:
            if (r8 >= r10) goto L18b
            java.lang.Object r20 = r7.get(r8)
            r40 = -8388608(0xffffffffff800000, float:-Infinity)
            r11 = r20
            i34 r11 = (defpackage.i34) r11
            cr4 r20 = r3.m()
            defpackage.gi2.G(r20)
            r20 = r15
            cr4 r15 = r3.m()
            int r15 = r15.f
            cr4 r15 = r3.m()
            int r15 = r15.d
            cr4 r15 = r3.m()
            int r15 = r15.b
            int r11 = r11.j
            r3.n()
            r4.getClass()
            float r11 = (float) r11
            float r11 = r11 - r20
            int r15 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r15 > 0) goto L17c
            int r15 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r15 <= 0) goto L17c
            r18 = r11
        L17c:
            int r15 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r15 < 0) goto L186
            int r15 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r15 >= 0) goto L186
            r19 = r11
        L186:
            int r8 = r8 + 1
            r15 = r20
            goto L140
        L18b:
            r20 = r15
            r40 = -8388608(0xffffffffff800000, float:-Infinity)
            int r4 = (r18 > r40 ? 1 : (r18 == r40 ? 0 : -1))
            if (r4 != 0) goto L196
            r15 = r19
            goto L198
        L196:
            r15 = r18
        L198:
            int r4 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r4 != 0) goto L19e
            r19 = r15
        L19e:
            boolean r4 = r3.c()
            if (r4 != 0) goto L1b1
            boolean r4 = defpackage.oi2.K(r3, r2)
            if (r4 == 0) goto L1af
            r15 = r20
            r19 = r15
            goto L1b1
        L1af:
            r19 = r20
        L1b1:
            boolean r4 = r3.b()
            if (r4 != 0) goto L1c6
            boolean r3 = defpackage.oi2.K(r3, r2)
            if (r3 != 0) goto L1c1
            r3 = r20
            r15 = r3
            goto L1c8
        L1c1:
            r3 = r19
            r15 = r20
            goto L1c8
        L1c6:
            r3 = r19
        L1c8:
            java.lang.Object r4 = r13.L
            l4 r4 = (defpackage.l4) r4
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Float r7 = java.lang.Float.valueOf(r15)
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            java.lang.Object r2 = r4.e(r2, r7, r8)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 != 0) goto L1e7
            goto L20f
        L1e7:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L1ec
            goto L20f
        L1ec:
            int r4 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r4 != 0) goto L1f1
            goto L20f
        L1f1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "Final Snapping Offset Should Be one of "
            r4.<init>(r7)
            r4.append(r15)
            java.lang.String r7 = ", "
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = " or 0.0"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.s53.c(r3)
        L20f:
            int r3 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r3 != 0) goto L214
            goto L218
        L214:
            int r3 = (r2 > r40 ? 1 : (r2 == r40 ? 0 : -1))
            if (r3 != 0) goto L21b
        L218:
            r15 = r20
            goto L21c
        L21b:
            r15 = r2
        L21c:
            boolean r2 = java.lang.Float.isNaN(r15)
            if (r2 == 0) goto L227
            java.lang.String r2 = "calculateSnapOffset returned NaN. Please use a valid value."
            defpackage.s53.c(r2)
        L227:
            r6.A = r15
            p76 r9 = (defpackage.p76) r9
            r2 = 30
            r3 = r20
            uo r3 = defpackage.ak7.O(r1, r3, r3, r2)
            io6 r4 = r0.c
            nl6 r0 = new nl6
            r1 = 1
            r0.<init>(r6, r12, r1)
            r1 = 0
            r5.d0 = r1
            r1 = 2
            r5.Y = r1
            r2 = r15
            r6 = r5
            r1 = r15
            r5 = r0
            r0 = r9
            java.lang.Object r0 = defpackage.kn2.j(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r14) goto L24d
            goto L24e
        L24d:
            r14 = r0
        L24e:
            return r14
        L24f:
            r0 = r3
            qq2 r0 = (defpackage.qq2) r0
            r23 = r9
            java.lang.String r23 = (java.lang.String) r23
            java.io.Serializable r4 = r5.d0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r6 = r5.e0
            kq2 r6 = (defpackage.kq2) r6
            java.lang.String r7 = "storm_neural_"
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r5.Y
            r10 = 3
            if (r9 == 0) goto L299
            r11 = 1
            if (r9 == r11) goto L287
            r4 = 2
            if (r9 == r4) goto L27a
            if (r9 != r10) goto L274
            defpackage.oi2.Y(r40)
            goto L615
        L274:
            defpackage.i.m(r1)
            r11 = 0
            goto L617
        L27a:
            defpackage.oi2.Y(r40)     // Catch: java.lang.Throwable -> L27f
            goto L615
        L27f:
            r0 = move-exception
            r18 = r3
            r19 = r6
            r1 = r8
            goto L5ca
        L287:
            defpackage.oi2.Y(r40)     // Catch: java.lang.Throwable -> L27f
            r30 = r0
            r20 = r2
            r18 = r3
            r19 = r6
            r29 = r7
            r1 = r8
            r0 = r40
            goto L569
        L299:
            defpackage.oi2.Y(r40)
            boolean r1 = defpackage.qs6.v0(r4)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r9 = "ru"
            if (r1 == 0) goto L2a6
            r1 = r9
            goto L2af
        L2a6:
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L27f
            java.lang.String r1 = r4.toLowerCase(r1)     // Catch: java.lang.Throwable -> L27f
            r1.getClass()     // Catch: java.lang.Throwable -> L27f
        L2af:
            boolean r4 = r1.equals(r9)     // Catch: java.lang.Throwable -> L27f
            java.lang.String r9 = "-28%"
            java.lang.String r11 = "+26%"
            java.lang.String r12 = "-22%"
            java.lang.String r13 = "-16%"
            java.lang.String r14 = "+20%"
            java.lang.String r15 = "+22%"
            java.lang.String r10 = "-14%"
            r18 = r3
            java.lang.String r3 = "-12%"
            r40 = r4
            java.lang.String r4 = "+14%"
            r19 = r6
            java.lang.String r6 = "-8%"
            r20 = r2
            java.lang.String r2 = "+18%"
            r29 = r7
            java.lang.String r7 = "-20%"
            r30 = r0
            java.lang.String r0 = "+28%"
            r31 = r8
            java.lang.String r8 = "+6%"
            java.lang.String r5 = "+4%"
            r22 = r1
            java.lang.String r1 = "+12%"
            r24 = r9
            java.lang.String r9 = "-10%"
            r25 = r10
            java.lang.String r10 = "-6%"
            r26 = r11
            java.lang.String r11 = "+16%"
            r27 = r12
            java.lang.String r12 = "+10%"
            r28 = r3
            java.lang.String r3 = "+2%"
            r32 = r4
            java.lang.String r4 = "-4%"
            r33 = r12
            java.lang.String r12 = "0%"
            if (r40 == 0) goto L3f6
            int[] r22 = defpackage.pq2.a     // Catch: java.lang.Throwable -> L31e
            int r34 = r19.ordinal()     // Catch: java.lang.Throwable -> L31e
            r22 = r22[r34]     // Catch: java.lang.Throwable -> L31e
            r40 = r5
            java.lang.String r5 = "+32%"
            r34 = r6
            java.lang.String r6 = "ru-RU-SvetlanaNeural"
            r35 = r13
            java.lang.String r13 = "ru-RU-DmitryNeural"
            switch(r22) {
                case 1: goto L3eb;
                case 2: goto L3e0;
                case 3: goto L3d7;
                case 4: goto L3cc;
                case 5: goto L3c3;
                case 6: goto L3b8;
                case 7: goto L3af;
                case 8: goto L3a6;
                case 9: goto L39f;
                case 10: goto L394;
                case 11: goto L389;
                case 12: goto L382;
                case 13: goto L379;
                case 14: goto L370;
                case 15: goto L369;
                case 16: goto L362;
                case 17: goto L35b;
                case 18: goto L352;
                case 19: goto L34b;
                case 20: goto L341;
                case 21: goto L33a;
                case 22: goto L333;
                case 23: goto L32c;
                case 24: goto L325;
                default: goto L318;
            }
        L318:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L31e
            r0.<init>()     // Catch: java.lang.Throwable -> L31e
            throw r0     // Catch: java.lang.Throwable -> L31e
        L31e:
            r0 = move-exception
            r5 = r39
        L321:
            r1 = r31
            goto L5ca
        L325:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r12, r12)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L32c:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r8, r3)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L333:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r3, r12)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L33a:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r11, r10)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L341:
            oc7 r1 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r2 = "+38%"
            r1.<init>(r13, r2, r0)     // Catch: java.lang.Throwable -> L31e
        L348:
            r0 = r1
            goto L53b
        L34b:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r9, r4)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L352:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r2 = "-25%"
            r0.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L35b:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r4, r4)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L362:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r5, r15)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L369:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r10, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L370:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "+45%"
            r0.<init>(r6, r1, r14)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L379:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "-5%"
            r0.<init>(r6, r1, r7)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L382:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r2, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L389:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "+8%"
            r5 = r35
            r0.<init>(r13, r5, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L394:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r40
            r6 = r34
            r0.<init>(r13, r6, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L39f:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r13, r1, r11)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3a6:
            r1 = r40
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r1, r4)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3af:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r13 = r33
            r0.<init>(r6, r5, r13)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3b8:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "+25%"
            r2 = r32
            r0.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3c3:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r28
            r0.<init>(r13, r1, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3cc:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "-38%"
            r2 = r27
            r0.<init>(r13, r1, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3d7:
            oc7 r1 = new oc7     // Catch: java.lang.Throwable -> L31e
            r2 = r26
            r1.<init>(r13, r0, r2)     // Catch: java.lang.Throwable -> L31e
            goto L348
        L3e0:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r24
            r2 = r25
            r0.<init>(r13, r1, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3eb:
            r6 = r34
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "-18%"
            r0.<init>(r13, r1, r6)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L3f6:
            r40 = r0
            r38 = r5
            r34 = r6
            r35 = r13
            r5 = r24
            r0 = r26
            r36 = r27
            r37 = r28
            r13 = r33
            r24 = r1
            r1 = r25
            r25 = r15
            r15 = r32
            java.lang.String r6 = "ja"
            r26 = r1
            r1 = r22
            boolean r1 = r1.equals(r6)     // Catch: java.lang.Throwable -> L31e
            if (r1 == 0) goto L44d
            int[] r0 = defpackage.pq2.a     // Catch: java.lang.Throwable -> L31e
            int r1 = r19.ordinal()     // Catch: java.lang.Throwable -> L31e
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L31e
            r1 = 7
            if (r0 == r1) goto L444
            r1 = 8
            if (r0 == r1) goto L444
            r1 = 12
            if (r0 == r1) goto L444
            r1 = 14
            if (r0 == r1) goto L444
            r1 = 21
            if (r0 == r1) goto L444
            r1 = 22
            if (r0 == r1) goto L444
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "ja-JP-KeitaNeural"
            r0.<init>(r1, r12, r12)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L444:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "ja-JP-NanamiNeural"
            r0.<init>(r1, r3, r12)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L44d:
            int[] r1 = defpackage.pq2.a     // Catch: java.lang.Throwable -> L31e
            int r6 = r19.ordinal()     // Catch: java.lang.Throwable -> L31e
            r1 = r1[r6]     // Catch: java.lang.Throwable -> L31e
            java.lang.String r6 = "+30%"
            r22 = r1
            java.lang.String r1 = "en-US-ChristopherNeural"
            r27 = r11
            java.lang.String r11 = "en-US-RogerNeural"
            r28 = r7
            java.lang.String r7 = "en-US-JennyNeural"
            r32 = r2
            java.lang.String r2 = "en-US-AnaNeural"
            r33 = r6
            java.lang.String r6 = "en-US-GuyNeural"
            switch(r22) {
                case 1: goto L534;
                case 2: goto L52a;
                case 3: goto L520;
                case 4: goto L516;
                case 5: goto L50e;
                case 6: goto L504;
                case 7: goto L4fc;
                case 8: goto L4f4;
                case 9: goto L4ee;
                case 10: goto L4e4;
                case 11: goto L4dc;
                case 12: goto L4d3;
                case 13: goto L4ca;
                case 14: goto L4bf;
                case 15: goto L4b8;
                case 16: goto L4af;
                case 17: goto L4a8;
                case 18: goto L4a1;
                case 19: goto L49a;
                case 20: goto L490;
                case 21: goto L489;
                case 22: goto L482;
                case 23: goto L47b;
                case 24: goto L474;
                default: goto L46e;
            }
        L46e:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L31e
            r0.<init>()     // Catch: java.lang.Throwable -> L31e
            throw r0     // Catch: java.lang.Throwable -> L31e
        L474:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r12, r12)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L47b:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r8, r3)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L482:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r7, r3, r12)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L489:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r7, r15, r10)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L490:
            oc7 r2 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r3 = "+36%"
            r2.<init>(r1, r3, r0)     // Catch: java.lang.Throwable -> L31e
            r0 = r2
            goto L53b
        L49a:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r11, r9, r4)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4a1:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r2, r13, r5)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4a8:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r4, r4)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4af:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r3 = r33
            r0.<init>(r1, r3, r14)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4b8:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r10, r13)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4bf:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r1 = "+42%"
            r3 = r32
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4ca:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r28
            r0.<init>(r2, r4, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4d3:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r27
            r0.<init>(r7, r1, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4dc:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r26
            r0.<init>(r6, r1, r8)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4e4:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r34
            r2 = r38
            r0.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4ee:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r6, r13, r15)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4f4:
            r2 = r38
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r7, r2, r4)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L4fc:
            r3 = r33
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r0.<init>(r2, r3, r13)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L504:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r3 = r24
            r1 = r25
            r0.<init>(r2, r1, r3)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L50e:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r1 = r37
            r0.<init>(r11, r1, r9)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L516:
            r1 = r28
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r2 = "-36%"
            r0.<init>(r11, r2, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L520:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            java.lang.String r2 = "+24%"
            r3 = r40
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L52a:
            r1 = r26
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r2 = r36
            r0.<init>(r11, r2, r1)     // Catch: java.lang.Throwable -> L31e
            goto L53b
        L534:
            oc7 r0 = new oc7     // Catch: java.lang.Throwable -> L31e
            r5 = r35
            r0.<init>(r6, r5, r9)     // Catch: java.lang.Throwable -> L31e
        L53b:
            java.lang.Object r1 = r0.A     // Catch: java.lang.Throwable -> L31e
            r24 = r1
            java.lang.String r24 = (java.lang.String) r24     // Catch: java.lang.Throwable -> L31e
            java.lang.Object r1 = r0.B     // Catch: java.lang.Throwable -> L31e
            r25 = r1
            java.lang.String r25 = (java.lang.String) r25     // Catch: java.lang.Throwable -> L31e
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L31e
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26     // Catch: java.lang.Throwable -> L31e
            l5 r22 = new l5     // Catch: java.lang.Throwable -> L31e
            r27 = 0
            r28 = 17
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch: java.lang.Throwable -> L31e
            r0 = r22
            r1 = 1
            r5 = r39
            r5.Y = r1     // Catch: java.lang.Throwable -> L5c7
            r1 = 4500(0x1194, double:2.2233E-320)
            java.lang.Object r0 = defpackage.xk2.N(r1, r0, r5)     // Catch: java.lang.Throwable -> L5c7
            r1 = r31
            if (r0 != r1) goto L569
            goto L613
        L569:
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L5b5
            if (r0 == 0) goto L5bf
            int r2 = r0.length     // Catch: java.lang.Throwable -> L5b5
            if (r2 == 0) goto L5bf
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L5b5
            r3 = r30
            android.app.Activity r4 = r3.a     // Catch: java.lang.Throwable -> L5b5
            java.io.File r4 = r4.getCacheDir()     // Catch: java.lang.Throwable -> L5b5
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b5
            r9 = r29
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L5b5
            r8.append(r6)     // Catch: java.lang.Throwable -> L5b5
            java.lang.String r6 = ".mp3"
            r8.append(r6)     // Catch: java.lang.Throwable -> L5b5
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L5b5
            r2.<init>(r4, r6)     // Catch: java.lang.Throwable -> L5b5
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b5
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L5b5
            r4.write(r0)     // Catch: java.lang.Throwable -> L5b7
            r4.close()     // Catch: java.lang.Throwable -> L5b5
            xe1 r0 = defpackage.xk1.a     // Catch: java.lang.Throwable -> L5b5
            jv2 r0 = defpackage.e04.a     // Catch: java.lang.Throwable -> L5b5
            nq2 r4 = new nq2     // Catch: java.lang.Throwable -> L5b5
            r6 = r20
            r7 = 0
            r4.<init>(r3, r2, r6, r7)     // Catch: java.lang.Throwable -> L5b5
            r2 = 2
            r5.Y = r2     // Catch: java.lang.Throwable -> L5b5
            java.lang.Object r0 = defpackage.hv.d0(r0, r4, r5)     // Catch: java.lang.Throwable -> L5b5
            if (r0 != r1) goto L615
            goto L613
        L5b5:
            r0 = move-exception
            goto L5ca
        L5b7:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L5ba
        L5ba:
            r0 = move-exception
            defpackage.ge7.t(r4, r2)     // Catch: java.lang.Throwable -> L5b5
            throw r0     // Catch: java.lang.Throwable -> L5b5
        L5bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5b5
            java.lang.String r2 = "Edge Neural fallback trigger"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5b5
            throw r0     // Catch: java.lang.Throwable -> L5b5
        L5c7:
            r0 = move-exception
            goto L321
        L5ca:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Routing ["
            r2.<init>(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = "] to local multi-voice synthesis: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "GameTtsManager"
            android.util.Log.i(r2, r0)
            xe1 r0 = defpackage.xk1.a
            jv2 r0 = defpackage.e04.a
            oq2 r22 = new oq2
            r26 = r18
            qq2 r26 = (defpackage.qq2) r26
            java.io.Serializable r2 = r5.d0
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            r24 = 0
            float r2 = r5.Z
            r25 = r6
            r27 = r23
            r23 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r2 = r22
            r3 = 3
            r5.Y = r3
            java.lang.Object r0 = defpackage.hv.d0(r0, r2, r5)
            if (r0 != r1) goto L615
        L613:
            r11 = r1
            goto L617
        L615:
            jg7 r11 = defpackage.jg7.a
        L617:
            return r11
        L618:
            r6 = r2
            r18 = r3
            r7 = 0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r5.Y
            if (r2 == 0) goto L636
            r3 = 1
            if (r2 != r3) goto L631
            java.lang.Object r0 = r5.e0
            uo r0 = (defpackage.uo) r0
            java.io.Serializable r1 = r5.d0
            ah5 r1 = (defpackage.ah5) r1
            defpackage.oi2.Y(r40)     // Catch: java.util.concurrent.CancellationException -> L673
            goto L67f
        L631:
            defpackage.i.m(r1)
            r11 = r7
            goto L688
        L636:
            defpackage.oi2.Y(r40)
            float r1 = java.lang.Math.abs(r6)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L682
            ah5 r1 = new ah5
            r1.<init>()
            r1.A = r6
            ah5 r2 = new ah5
            r2.<init>()
            r3 = 28
            r15 = 0
            uo r3 = defpackage.ak7.f(r15, r6, r3)
            r4 = r18
            wd1 r4 = (defpackage.wd1) r4     // Catch: java.util.concurrent.CancellationException -> L672
            oc1 r6 = r4.a     // Catch: java.util.concurrent.CancellationException -> L672
            i86 r9 = (defpackage.i86) r9     // Catch: java.util.concurrent.CancellationException -> L672
            t00 r7 = new t00     // Catch: java.util.concurrent.CancellationException -> L672
            r7.<init>(r2, r9, r1, r4)     // Catch: java.util.concurrent.CancellationException -> L672
            r5.d0 = r1     // Catch: java.util.concurrent.CancellationException -> L672
            r5.e0 = r3     // Catch: java.util.concurrent.CancellationException -> L672
            r11 = 1
            r5.Y = r11     // Catch: java.util.concurrent.CancellationException -> L672
            java.lang.Object r2 = defpackage.kj2.m(r3, r6, r8, r7, r5)     // Catch: java.util.concurrent.CancellationException -> L672
            if (r2 != r0) goto L67f
            r11 = r0
            goto L688
        L672:
            r0 = r3
        L673:
            java.lang.Object r0 = r0.a()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1.A = r0
        L67f:
            float r2 = r1.A
            goto L683
        L682:
            r2 = r6
        L683:
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r2)
        L688:
            return r11
    }
}
