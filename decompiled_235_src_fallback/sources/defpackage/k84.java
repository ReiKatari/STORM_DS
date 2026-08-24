package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k84  reason: default package */
/* loaded from: classes.dex */
public final class k84 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.zg5 X;
    public defpackage.zg5 Y;
    public int Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.ah5 f0;
    public final /* synthetic */ defpackage.dh5 g0;
    public final /* synthetic */ defpackage.dh5 h0;
    public final /* synthetic */ float i0;
    public final /* synthetic */ defpackage.m84 j0;
    public final /* synthetic */ float k0;
    public final /* synthetic */ defpackage.m86 l0;

    public k84(defpackage.ah5 r1, defpackage.dh5 r2, defpackage.dh5 r3, float r4, defpackage.m84 r5, float r6, defpackage.m86 r7, defpackage.r41 r8) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r0.h0 = r3
            r0.i0 = r4
            r0.j0 = r5
            r0.k0 = r6
            r0.l0 = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            k86 r1 = (defpackage.k86) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            k84 r0 = (defpackage.k84) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            k84 r0 = new k84
            float r6 = r9.k0
            m86 r7 = r9.l0
            ah5 r1 = r9.f0
            dh5 r2 = r9.g0
            dh5 r3 = r9.h0
            float r4 = r9.i0
            m84 r5 = r9.j0
            r8 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.e0 = r11
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r24) {
            r23 = this;
            r7 = r23
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r7.d0
            dh5 r1 = r7.h0
            r6 = 0
            ah5 r2 = r7.f0
            r3 = 3
            r4 = 2
            r5 = 1
            dh5 r9 = r7.g0
            if (r0 == 0) goto L65
            if (r0 == r5) goto L4d
            if (r0 == r4) goto L36
            if (r0 != r3) goto L30
            zg5 r0 = r7.Y
            zg5 r10 = r7.X
            java.lang.Object r11 = r7.e0
            k86 r11 = (defpackage.k86) r11
            defpackage.oi2.Y(r24)
            r12 = r4
            r15 = r5
            r16 = r6
            r4 = r9
            r14 = r11
            r9 = r3
            r3 = r10
            r10 = r0
            r0 = r24
            goto L18c
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L36:
            int r0 = r7.Z
            zg5 r10 = r7.X
            java.lang.Object r11 = r7.e0
            k86 r11 = (defpackage.k86) r11
            defpackage.oi2.Y(r24)
            r21 = r1
            r22 = r2
            r12 = r4
            r15 = r5
            r20 = r9
            r14 = r11
            r9 = r3
            goto L167
        L4d:
            zg5 r0 = r7.Y
            zg5 r10 = r7.X
            java.lang.Object r11 = r7.e0
            k86 r11 = (defpackage.k86) r11
            defpackage.oi2.Y(r24)
            r12 = r4
            r15 = r5
            r16 = r6
            r4 = r9
            r14 = r11
            r9 = r3
            r3 = r10
            r10 = r0
            r0 = r24
            goto L1c3
        L65:
            defpackage.oi2.Y(r24)
            java.lang.Object r0 = r7.e0
            k86 r0 = (defpackage.k86) r0
            zg5 r10 = new zg5
            r10.<init>()
            r10.A = r5
        L73:
            r14 = r10
        L74:
            boolean r10 = r14.A
            jg7 r17 = defpackage.jg7.a
            if (r10 == 0) goto L1ce
            r10 = 0
            r14.A = r10
            float r11 = r2.A
            java.lang.Object r12 = r9.A
            uo r12 = (defpackage.uo) r12
            vs4 r12 = r12.B
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r11 = r11 - r12
            java.lang.Object r12 = r1.A
            i84 r12 = (defpackage.i84) r12
            boolean r12 = r12.c
            m84 r13 = r7.j0
            if (r12 != 0) goto La4
            float r12 = java.lang.Math.abs(r11)
            float r15 = r7.i0
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 >= 0) goto Lae
        La4:
            r12 = r4
            r15 = r5
            r16 = r6
            r4 = r9
            r10 = r14
            r14 = r0
            r9 = r3
            goto L1aa
        Lae:
            float r11 = java.lang.Math.signum(r11)
            float r11 = r11 * r15
            r13.e(r0, r11)
            java.lang.Object r12 = r9.A
            uo r12 = (defpackage.uo) r12
            vs4 r13 = r12.B
            java.lang.Object r13 = r13.getValue()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r13 = r13 + r11
            r11 = 0
            r15 = 30
            uo r11 = defpackage.ak7.O(r12, r13, r11, r15)
            r9.A = r11
            float r12 = r2.A
            vs4 r11 = r11.B
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            float r12 = r12 - r11
            float r11 = java.lang.Math.abs(r12)
            float r12 = r7.k0
            float r11 = r11 / r12
            int r11 = defpackage.u24.E(r11)
            r12 = 100
            if (r11 <= r12) goto Lef
            r11 = r12
        Lef:
            java.lang.Object r12 = r9.A
            uo r12 = (defpackage.uo) r12
            float r13 = r2.A
            d5 r15 = new d5
            r16 = r9
            r9 = r15
            r15 = 5
            r18 = r10
            m84 r10 = r7.j0
            r19 = r13
            m86 r13 = r7.l0
            r3 = r11
            r11 = r1
            r1 = r3
            r3 = r12
            r12 = r2
            r2 = r3
            r20 = r16
            r5 = r18
            r3 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r13 = r10
            r21 = r11
            r22 = r12
            r10 = r14
            r7.e0 = r0
            r7.X = r10
            r7.Y = r6
            r7.Z = r1
            r7.d0 = r4
            r13.getClass()
            ah5 r12 = new ah5
            r12.<init>()
            vs4 r11 = r2.B
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            r12.A = r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r3)
            e41 r3 = defpackage.ir1.c
            sc7 r3 = defpackage.ge7.Y(r1, r5, r3, r4)
            r5 = r11
            cn r11 = new cn
            r16 = 8
            r14 = r0
            r15 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = r2
            r2 = r3
            r3 = 1
            r12 = r4
            r4 = r11
            r9 = 3
            r15 = 1
            r11 = r1
            r1 = r5
            r5 = r7
            java.lang.Object r0 = defpackage.kj2.n(r0, r1, r2, r3, r4, r5)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto L160
            goto L162
        L160:
            r0 = r17
        L162:
            if (r0 != r8) goto L166
            goto L1c1
        L166:
            r0 = r11
        L167:
            boolean r1 = r10.A
            if (r1 != 0) goto L19e
            r1 = 50
            long r3 = (long) r0
            long r1 = r1 - r3
            r7.e0 = r14
            r7.X = r10
            r7.Y = r10
            r7.d0 = r9
            m84 r0 = r7.j0
            m86 r3 = r7.l0
            r16 = r6
            r4 = r20
            r5 = r1
            r1 = r21
            r2 = r22
            java.lang.Object r0 = defpackage.m84.d(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r8) goto L18b
            goto L1c1
        L18b:
            r3 = r10
        L18c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.A = r0
        L194:
            r0 = r14
            r5 = r15
            r6 = r16
            r14 = r3
            r3 = r9
            r9 = r4
            r4 = r12
            goto L74
        L19e:
            r3 = r9
            r4 = r12
            r0 = r14
            r5 = r15
            r9 = r20
            r1 = r21
            r2 = r22
            goto L73
        L1aa:
            r13.e(r14, r11)
            r7.e0 = r14
            r7.X = r10
            r7.Y = r10
            r7.d0 = r15
            m84 r0 = r7.j0
            m86 r3 = r7.l0
            r5 = 50
            java.lang.Object r0 = defpackage.m84.d(r0, r1, r2, r3, r4, r5, r7)
            if (r0 != r8) goto L1c2
        L1c1:
            return r8
        L1c2:
            r3 = r10
        L1c3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.A = r0
            r7 = r23
            goto L194
        L1ce:
            return r17
    }
}
