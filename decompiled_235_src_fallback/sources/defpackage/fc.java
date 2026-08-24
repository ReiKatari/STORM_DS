package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc  reason: default package */
/* loaded from: classes.dex */
public final class fc implements defpackage.e34 {
    public static final defpackage.fc b = null;
    public static final defpackage.fc c = null;
    public static final defpackage.fc d = null;
    public static final defpackage.fc e = null;
    public static final defpackage.fc f = null;
    public static final defpackage.fc g = null;
    public static final defpackage.fc h = null;
    public static final defpackage.bz1 i = null;
    public static final defpackage.fc j = null;
    public static final defpackage.fc k = null;
    public static final defpackage.fc l = null;
    public static final defpackage.fc m = null;
    public final /* synthetic */ int a;

    static {
            fc r0 = new fc
            r1 = 0
            r0.<init>(r1)
            defpackage.fc.b = r0
            fc r0 = new fc
            r1 = 1
            r0.<init>(r1)
            defpackage.fc.c = r0
            fc r0 = new fc
            r1 = 2
            r0.<init>(r1)
            defpackage.fc.d = r0
            fc r0 = new fc
            r1 = 3
            r0.<init>(r1)
            defpackage.fc.e = r0
            fc r0 = new fc
            r1 = 4
            r0.<init>(r1)
            defpackage.fc.f = r0
            fc r0 = new fc
            r1 = 5
            r0.<init>(r1)
            defpackage.fc.g = r0
            fc r0 = new fc
            r1 = 6
            r0.<init>(r1)
            defpackage.fc.h = r0
            bz1 r0 = new bz1
            r1 = 22
            r0.<init>(r1)
            defpackage.fc.i = r0
            fc r0 = new fc
            r1 = 7
            r0.<init>(r1)
            defpackage.fc.j = r0
            fc r0 = new fc
            r1 = 8
            r0.<init>(r1)
            defpackage.fc.k = r0
            fc r0 = new fc
            r1 = 9
            r0.<init>(r1)
            defpackage.fc.l = r0
            fc r0 = new fc
            r1 = 10
            r0.<init>(r1)
            defpackage.fc.m = r0
            return
    }

    public /* synthetic */ fc(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.e34
    public final defpackage.f34 d(defpackage.g34 r24, java.util.List r25, long r26) {
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r23
            r3 = r26
            int r2 = r2.a
            r8 = 1116209152(0x42880000, float:68.0)
            r9 = 1111490560(0x42400000, float:48.0)
            java.lang.String r10 = "text"
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 22
            zt1 r6 = defpackage.zt1.A
            switch(r2) {
                case 0: goto L30e;
                case 1: goto L2c6;
                case 2: goto L262;
                case 3: goto L22e;
                case 4: goto L21b;
                case 5: goto L208;
                case 6: goto L1f8;
                case 7: goto L1e5;
                case 8: goto L1ab;
                case 9: goto L12d;
                case 10: goto L10a;
                default: goto L19;
            }
        L19:
            int r2 = r1.size()
            r5 = 0
        L1e:
            java.lang.String r7 = "Collection contains no element matching the predicate."
            if (r5 >= r2) goto L102
            java.lang.Object r16 = r1.get(r5)
            r12 = r16
            x24 r12 = (defpackage.x24) r12
            java.lang.Object r14 = defpackage.lb4.u(r12)
            java.lang.String r15 = "action"
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 == 0) goto Lfb
            dx4 r12 = r12.y(r3)
            int r2 = defpackage.q21.h(r3)
            int r5 = r12.A
            int r2 = r2 - r5
            r5 = 1090519040(0x41000000, float:8.0)
            int r5 = r0.r0(r5)
            int r2 = r2 - r5
            int r5 = defpackage.q21.j(r3)
            if (r2 >= r5) goto L4f
            r2 = r5
        L4f:
            int r5 = r1.size()
            r14 = 0
        L54:
            if (r14 >= r5) goto Lf3
            java.lang.Object r15 = r1.get(r14)
            x24 r15 = (defpackage.x24) r15
            r17 = 2
            java.lang.Object r11 = defpackage.lb4.u(r15)
            boolean r11 = defpackage.nb3.k(r11, r10)
            if (r11 == 0) goto Lec
            r11 = r6
            r6 = 0
            r7 = 9
            r3 = 0
            r5 = 0
            r4 = r2
            r1 = r26
            long r3 = defpackage.q21.a(r1, r3, r4, r5, r6, r7)
            dx4 r1 = r15.y(r3)
            ey2 r2 = defpackage.lc.a
            int r3 = r1.X(r2)
            ey2 r4 = defpackage.lc.b
            int r4 = r1.X(r4)
            if (r3 == r13) goto L8b
            if (r4 == r13) goto L8b
            r5 = 1
            goto L8c
        L8b:
            r5 = 0
        L8c:
            if (r3 == r4) goto L93
            if (r5 != 0) goto L91
            goto L93
        L91:
            r14 = 0
            goto L94
        L93:
            r14 = 1
        L94:
            int r4 = defpackage.q21.h(r26)
            int r5 = r12.A
            int r21 = r4 - r5
            if (r14 == 0) goto Lbe
            int r4 = r0.r0(r9)
            int r5 = r12.B
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r1.B
            int r5 = r4 - r5
            int r5 = r5 / 2
            int r2 = r12.X(r2)
            if (r2 == r13) goto Lb8
            int r3 = r3 + r5
            int r15 = r3 - r2
            goto Lb9
        Lb8:
            r15 = 0
        Lb9:
            r19 = r5
            r22 = r15
            goto Ld8
        Lbe:
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = r0.r0(r2)
            int r5 = r2 - r3
            int r2 = r0.r0(r8)
            int r3 = r1.B
            int r3 = r3 + r5
            int r4 = java.lang.Math.max(r2, r3)
            int r2 = r12.B
            int r2 = r4 - r2
            int r15 = r2 / 2
            goto Lb9
        Ld8:
            int r2 = defpackage.q21.h(r26)
            jl6 r17 = new jl6
            r18 = r1
            r20 = r12
            r17.<init>(r18, r19, r20, r21, r22)
            r1 = r17
            f34 r12 = r0.K(r2, r4, r11, r1)
            goto L109
        Lec:
            r11 = r6
            r20 = r12
            int r14 = r14 + 1
            goto L54
        Lf3:
            defpackage.ex3.b(r7)
            defpackage.e41.c()
        Lf9:
            r12 = 0
            goto L109
        Lfb:
            r11 = r6
            r17 = 2
            int r5 = r5 + 1
            goto L1e
        L102:
            defpackage.ex3.b(r7)
            defpackage.e41.c()
            goto Lf9
        L109:
            return r12
        L10a:
            r11 = r6
            boolean r1 = defpackage.q21.f(r3)
            if (r1 == 0) goto L116
            int r1 = defpackage.q21.h(r3)
            goto L117
        L116:
            r1 = 0
        L117:
            boolean r2 = defpackage.q21.e(r3)
            if (r2 == 0) goto L122
            int r15 = defpackage.q21.g(r3)
            goto L123
        L122:
            r15 = 0
        L123:
            bz1 r2 = new bz1
            r2.<init>(r5)
            f34 r0 = r0.K(r1, r15, r11, r2)
            return r0
        L12d:
            r11 = r6
            r17 = 2
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.size()
            r2.<init>(r5)
            int r5 = r1.size()
            r10 = r13
            r12 = r10
            r6 = 0
            r7 = 0
        L141:
            if (r6 >= r5) goto L183
            java.lang.Object r14 = r1.get(r6)
            x24 r14 = (defpackage.x24) r14
            dx4 r14 = r14.y(r3)
            r2.add(r14)
            ey2 r15 = defpackage.lc.a
            int r8 = r14.X(r15)
            if (r8 == r13) goto L164
            if (r10 == r13) goto L160
            int r8 = r14.X(r15)
            if (r8 >= r10) goto L164
        L160:
            int r10 = r14.X(r15)
        L164:
            ey2 r8 = defpackage.lc.b
            int r15 = r14.X(r8)
            if (r15 == r13) goto L178
            if (r12 == r13) goto L174
            int r15 = r14.X(r8)
            if (r15 <= r12) goto L178
        L174:
            int r12 = r14.X(r8)
        L178:
            int r8 = r14.B
            int r7 = java.lang.Math.max(r7, r8)
            int r6 = r6 + 1
            r8 = 1116209152(0x42880000, float:68.0)
            goto L141
        L183:
            if (r10 == r13) goto L189
            if (r12 == r13) goto L189
            r14 = 1
            goto L18a
        L189:
            r14 = 0
        L18a:
            if (r10 == r12) goto L192
            if (r14 != 0) goto L18f
            goto L192
        L18f:
            r8 = 1116209152(0x42880000, float:68.0)
            goto L193
        L192:
            r8 = r9
        L193:
            int r1 = r0.r0(r8)
            int r1 = java.lang.Math.max(r1, r7)
            int r3 = defpackage.q21.h(r3)
            fp3 r4 = new fp3
            r5 = r17
            r4.<init>(r2, r1, r5)
            f34 r0 = r0.K(r3, r1, r11, r4)
            return r0
        L1ab:
            r11 = r6
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.size()
            r2.<init>(r5)
            int r5 = r1.size()
            r6 = 0
            r7 = 0
            r15 = 0
        L1bc:
            if (r15 >= r5) goto L1da
            java.lang.Object r8 = r1.get(r15)
            x24 r8 = (defpackage.x24) r8
            dx4 r8 = r8.y(r3)
            int r9 = r8.A
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r8.B
            int r7 = java.lang.Math.max(r7, r9)
            r2.add(r8)
            int r15 = r15 + 1
            goto L1bc
        L1da:
            ip r1 = new ip
            r3 = 3
            r1.<init>(r3, r2)
            f34 r0 = r0.K(r6, r7, r11, r1)
            return r0
        L1e5:
            r11 = r6
            int r1 = defpackage.q21.j(r3)
            int r2 = defpackage.q21.i(r3)
            bz1 r3 = new bz1
            r3.<init>(r5)
            f34 r0 = r0.K(r1, r2, r11, r3)
            return r0
        L1f8:
            r11 = r6
            int r1 = defpackage.q21.h(r3)
            int r2 = defpackage.q21.g(r3)
            bz1 r3 = defpackage.fc.i
            f34 r0 = r0.K(r1, r2, r11, r3)
            return r0
        L208:
            r11 = r6
            int r1 = defpackage.q21.j(r3)
            int r2 = defpackage.q21.i(r3)
            bz1 r3 = new bz1
            r3.<init>(r5)
            f34 r0 = r0.K(r1, r2, r11, r3)
            return r0
        L21b:
            r11 = r6
            int r1 = defpackage.q21.j(r3)
            int r2 = defpackage.q21.i(r3)
            bz1 r3 = new bz1
            r3.<init>(r5)
            f34 r0 = r0.K(r1, r2, r11, r3)
            return r0
        L22e:
            r11 = r6
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.size()
            r2.<init>(r5)
            int r5 = r1.size()
            r6 = 0
        L23d:
            if (r6 >= r5) goto L24f
            java.lang.Object r7 = r1.get(r6)
            x24 r7 = (defpackage.x24) r7
            dx4 r7 = r7.y(r3)
            r2.add(r7)
            int r6 = r6 + 1
            goto L23d
        L24f:
            int r1 = defpackage.q21.h(r3)
            int r3 = defpackage.q21.g(r3)
            ip r4 = new ip
            r5 = 0
            r4.<init>(r5, r2)
            f34 r0 = r0.K(r1, r3, r11, r4)
            return r0
        L262:
            r11 = r6
            int r2 = r1.size()
            if (r2 == 0) goto L2be
            r5 = 1
            if (r2 == r5) goto L2a5
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.size()
            r2.<init>(r5)
            int r5 = r1.size()
            r6 = 0
            r7 = 0
            r15 = 0
        L27c:
            if (r15 >= r5) goto L29a
            java.lang.Object r8 = r1.get(r15)
            x24 r8 = (defpackage.x24) r8
            dx4 r8 = r8.y(r3)
            int r9 = r8.A
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r8.B
            int r7 = java.lang.Math.max(r7, r9)
            r2.add(r8)
            int r15 = r15 + 1
            goto L27c
        L29a:
            kg r1 = new kg
            r5 = 1
            r1.<init>(r5, r2)
            f34 r0 = r0.K(r6, r7, r11, r1)
            goto L2c5
        L2a5:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            x24 r1 = (defpackage.x24) r1
            dx4 r1 = r1.y(r3)
            int r2 = r1.A
            int r3 = r1.B
            he r4 = new he
            r4.<init>(r1, r5)
            f34 r0 = r0.K(r2, r3, r11, r4)
            goto L2c5
        L2be:
            r2 = 0
            ne r1 = defpackage.ne.g0
            f34 r0 = r0.K(r2, r2, r11, r1)
        L2c5:
            return r0
        L2c6:
            r11 = r6
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.size()
            r2.<init>(r5)
            int r5 = r1.size()
            r6 = 0
            r7 = 0
            r8 = 0
        L2d7:
            if (r6 >= r5) goto L2f5
            java.lang.Object r9 = r1.get(r6)
            x24 r9 = (defpackage.x24) r9
            dx4 r9 = r9.y(r3)
            int r10 = r9.A
            int r7 = java.lang.Math.max(r7, r10)
            int r10 = r9.B
            int r8 = java.lang.Math.max(r8, r10)
            r2.add(r9)
            int r6 = r6 + 1
            goto L2d7
        L2f5:
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L303
            int r7 = defpackage.q21.j(r3)
            int r8 = defpackage.q21.i(r3)
        L303:
            kg r1 = new kg
            r9 = 0
            r1.<init>(r9, r2)
            f34 r0 = r0.K(r7, r8, r11, r1)
            return r0
        L30e:
            r11 = r6
            r9 = 0
            int r2 = r1.size()
            r5 = r9
        L315:
            if (r5 >= r2) goto L32e
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            x24 r7 = (defpackage.x24) r7
            java.lang.Object r7 = defpackage.lb4.u(r7)
            java.lang.String r8 = "title"
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L32b
            goto L32f
        L32b:
            int r5 = r5 + 1
            goto L315
        L32e:
            r6 = 0
        L32f:
            r12 = r6
            x24 r12 = (defpackage.x24) r12
            if (r12 == 0) goto L346
            r7 = 0
            r8 = 11
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r26
            long r4 = defpackage.q21.a(r2, r4, r5, r6, r7, r8)
            dx4 r2 = r12.y(r4)
            r8 = r2
            goto L347
        L346:
            r8 = 0
        L347:
            int r2 = r1.size()
            r5 = r9
        L34c:
            if (r5 >= r2) goto L363
            java.lang.Object r3 = r1.get(r5)
            r4 = r3
            x24 r4 = (defpackage.x24) r4
            java.lang.Object r4 = defpackage.lb4.u(r4)
            boolean r4 = defpackage.nb3.k(r4, r10)
            if (r4 == 0) goto L360
            goto L364
        L360:
            int r5 = r5 + 1
            goto L34c
        L363:
            r3 = 0
        L364:
            r10 = r3
            x24 r10 = (defpackage.x24) r10
            if (r10 == 0) goto L37a
            r6 = 0
            r7 = 11
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r26
            long r1 = defpackage.q21.a(r1, r3, r4, r5, r6, r7)
            dx4 r1 = r10.y(r1)
            goto L37b
        L37a:
            r1 = 0
        L37b:
            if (r8 == 0) goto L380
            int r5 = r8.A
            goto L381
        L380:
            r5 = r9
        L381:
            if (r1 == 0) goto L386
            int r2 = r1.A
            goto L387
        L386:
            r2 = r9
        L387:
            int r2 = java.lang.Math.max(r5, r2)
            if (r8 == 0) goto L3a2
            ey2 r3 = defpackage.lc.a
            int r3 = r8.X(r3)
            if (r3 != r13) goto L397
            r3 = 0
            goto L39b
        L397:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L39b:
            if (r3 == 0) goto L3a2
            int r5 = r3.intValue()
            goto L3a3
        L3a2:
            r5 = r9
        L3a3:
            if (r8 == 0) goto L3ba
            ey2 r3 = defpackage.lc.b
            int r3 = r8.X(r3)
            if (r3 != r13) goto L3af
            r3 = 0
            goto L3b3
        L3af:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L3b3:
            if (r3 == 0) goto L3ba
            int r3 = r3.intValue()
            goto L3bb
        L3ba:
            r3 = r9
        L3bb:
            long r6 = defpackage.hc.c
            int r4 = r0.k0(r6)
            int r4 = r4 - r5
            if (r1 == 0) goto L3d9
            ey2 r5 = defpackage.lc.a
            int r5 = r1.X(r5)
            if (r5 != r13) goto L3ce
            r12 = 0
            goto L3d2
        L3ce:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
        L3d2:
            if (r12 == 0) goto L3d9
            int r5 = r12.intValue()
            goto L3da
        L3d9:
            r5 = r9
        L3da:
            if (r8 != 0) goto L3e3
            long r6 = defpackage.hc.e
            int r6 = r0.k0(r6)
            goto L3e9
        L3e3:
            long r6 = defpackage.hc.d
            int r6 = r0.k0(r6)
        L3e9:
            if (r8 == 0) goto L3ef
            int r7 = r8.B
            int r7 = r7 + r4
            goto L3f0
        L3ef:
            r7 = r9
        L3f0:
            if (r8 != 0) goto L3f5
            int r10 = r6 - r5
            goto L3ff
        L3f5:
            if (r3 != 0) goto L3fb
            int r10 = r7 - r5
        L3f9:
            int r10 = r10 + r6
            goto L3ff
        L3fb:
            int r10 = r4 + r3
            int r10 = r10 - r5
            goto L3f9
        L3ff:
            if (r1 == 0) goto L414
            int r12 = r1.B
            if (r3 != 0) goto L409
            int r12 = r12 + r6
            int r12 = r12 - r5
        L407:
            r15 = r12
            goto L415
        L409:
            int r12 = r12 + r6
            int r12 = r12 - r5
            if (r8 == 0) goto L410
            int r15 = r8.B
            goto L411
        L410:
            r15 = r9
        L411:
            int r15 = r15 - r3
            int r12 = r12 - r15
            goto L407
        L414:
            r15 = r9
        L415:
            int r7 = r7 + r15
            ec r3 = new ec
            r3.<init>(r8, r4, r1, r10)
            f34 r0 = r0.K(r2, r7, r11, r3)
            return r0
    }
}
