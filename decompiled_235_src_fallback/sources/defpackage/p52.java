package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p52  reason: default package */
/* loaded from: classes.dex */
public final class p52 extends defpackage.dm5 implements defpackage.eo2 {
    public final /* synthetic */ int L;
    public long[] R;
    public int X;
    public int Y;
    public int Z;
    public int d0;
    public long e0;
    public int f0;
    public /* synthetic */ java.lang.Object g0;
    public java.lang.Object h0;
    public final /* synthetic */ java.lang.Object i0;

    public /* synthetic */ p52(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.L = r3
            r0.i0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            jg7 r1 = defpackage.jg7.a
            rb6 r3 = (defpackage.rb6) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            p52 r2 = (defpackage.p52) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            p52 r2 = (defpackage.p52) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            p52 r2 = (defpackage.p52) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            p52 r2 = (defpackage.p52) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            java.lang.Object r2 = r2.i0
            switch(r0) {
                case 0: goto L28;
                case 1: goto L1d;
                case 2: goto L12;
                default: goto L7;
            }
        L7:
            p52 r0 = new p52
            rt6 r2 = (defpackage.rt6) r2
            r1 = 3
            r0.<init>(r2, r3, r1)
            r0.g0 = r4
            return r0
        L12:
            p52 r0 = new p52
            d66 r2 = (defpackage.d66) r2
            r1 = 2
            r0.<init>(r2, r3, r1)
            r0.g0 = r4
            return r0
        L1d:
            p52 r0 = new p52
            q52 r2 = (defpackage.q52) r2
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.g0 = r4
            return r0
        L28:
            p52 r0 = new p52
            q52 r2 = (defpackage.q52) r2
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.g0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r27) {
            r26 = this;
            r0 = r26
            int r1 = r0.L
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r8 = r0.i0
            r9 = 0
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r11 = 8
            r15 = 1
            switch(r1) {
                case 0: goto L1e7;
                case 1: goto L14e;
                case 2: goto Lb5;
                default: goto L11;
            }
        L11:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            r16 = 128(0x80, double:6.3E-322)
            int r3 = r0.f0
            if (r3 == 0) goto L43
            if (r3 != r15) goto L3d
            int r3 = r0.d0
            int r4 = r0.Z
            long r8 = r0.e0
            int r10 = r0.Y
            r18 = 255(0xff, double:1.26E-321)
            int r5 = r0.X
            long[] r6 = r0.R
            r20 = 7
            java.lang.Object r7 = r0.h0
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            java.lang.Object r12 = r0.g0
            rb6 r12 = (defpackage.rb6) r12
            defpackage.oi2.Y(r27)
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto La5
        L3d:
            defpackage.i.m(r10)
            r2 = r9
            goto Lb4
        L43:
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            defpackage.oi2.Y(r27)
            java.lang.Object r3 = r0.g0
            rb6 r3 = (defpackage.rb6) r3
            rt6 r8 = (defpackage.rt6) r8
            java.lang.Object r4 = r8.B
            ja4 r4 = (defpackage.ja4) r4
            java.lang.Object[] r5 = r4.c
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto Lb4
            r7 = 0
        L5e:
            r8 = r4[r7]
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = ~r8
            long r12 = r13 << r20
            long r12 = r12 & r8
            long r12 = r12 & r21
            int r10 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r10 == 0) goto Laf
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = r6
            r6 = r4
            r4 = r10
            r10 = r7
            r7 = r5
            r5 = r12
            r12 = r3
            r3 = 0
        L7e:
            if (r3 >= r4) goto La8
            long r13 = r8 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto La5
            int r13 = r10 << 3
            int r13 = r13 + r3
            r13 = r7[r13]
            r0.g0 = r12
            r0.h0 = r7
            r0.R = r6
            r0.X = r5
            r0.Y = r10
            r0.e0 = r8
            r0.Z = r4
            r0.d0 = r3
            r0.f0 = r15
            x61 r13 = r12.c(r0, r13)
            if (r13 != r1) goto La5
            r2 = r1
            goto Lb4
        La5:
            long r8 = r8 >> r11
            int r3 = r3 + r15
            goto L7e
        La8:
            if (r4 != r11) goto Lb4
            r4 = r6
            r3 = r12
            r6 = r5
            r5 = r7
            r7 = r10
        Laf:
            if (r7 == r6) goto Lb4
            int r7 = r7 + 1
            goto L5e
        Lb4:
            return r2
        Lb5:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.f0
            if (r3 == 0) goto Le6
            if (r3 != r15) goto Le0
            int r3 = r0.d0
            int r4 = r0.Z
            long r5 = r0.e0
            int r7 = r0.Y
            int r8 = r0.X
            long[] r9 = r0.R
            java.lang.Object r10 = r0.h0
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r12 = r0.g0
            rb6 r12 = (defpackage.rb6) r12
            defpackage.oi2.Y(r27)
            goto L13f
        Le0:
            defpackage.i.m(r10)
            r2 = r9
            goto L14d
        Le6:
            defpackage.oi2.Y(r27)
            java.lang.Object r3 = r0.g0
            rb6 r3 = (defpackage.rb6) r3
            d66 r8 = (defpackage.d66) r8
            ka4 r4 = r8.A
            java.lang.Object[] r5 = r4.b
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L14d
            r7 = 0
        Lfb:
            r8 = r4[r7]
            long r12 = ~r8
            long r12 = r12 << r20
            long r12 = r12 & r8
            long r12 = r12 & r21
            int r10 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r10 == 0) goto L148
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = r3
            r3 = 0
            r24 = r8
            r9 = r4
            r8 = r6
            r4 = r10
            r10 = r5
            r5 = r24
        L118:
            if (r3 >= r4) goto L142
            long r13 = r5 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L13f
            int r13 = r7 << 3
            int r13 = r13 + r3
            r13 = r10[r13]
            r0.g0 = r12
            r0.h0 = r10
            r0.R = r9
            r0.X = r8
            r0.Y = r7
            r0.e0 = r5
            r0.Z = r4
            r0.d0 = r3
            r0.f0 = r15
            x61 r13 = r12.c(r0, r13)
            if (r13 != r1) goto L13f
            r2 = r1
            goto L14d
        L13f:
            long r5 = r5 >> r11
            int r3 = r3 + r15
            goto L118
        L142:
            if (r4 != r11) goto L14d
            r6 = r8
            r4 = r9
            r5 = r10
            r3 = r12
        L148:
            if (r7 == r6) goto L14d
            int r7 = r7 + 1
            goto Lfb
        L14d:
            return r2
        L14e:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.f0
            if (r3 == 0) goto L17f
            if (r3 != r15) goto L179
            int r3 = r0.d0
            int r4 = r0.Z
            long r5 = r0.e0
            int r7 = r0.Y
            int r8 = r0.X
            long[] r9 = r0.R
            java.lang.Object r10 = r0.h0
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            java.lang.Object r12 = r0.g0
            rb6 r12 = (defpackage.rb6) r12
            defpackage.oi2.Y(r27)
            goto L1d8
        L179:
            defpackage.i.m(r10)
            r2 = r9
            goto L1e6
        L17f:
            defpackage.oi2.Y(r27)
            java.lang.Object r3 = r0.g0
            rb6 r3 = (defpackage.rb6) r3
            q52 r8 = (defpackage.q52) r8
            ja4 r4 = r8.B
            java.lang.Object[] r5 = r4.b
            long[] r4 = r4.a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L1e6
            r7 = 0
        L194:
            r8 = r4[r7]
            long r12 = ~r8
            long r12 = r12 << r20
            long r12 = r12 & r8
            long r12 = r12 & r21
            int r10 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r10 == 0) goto L1e1
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = r3
            r3 = 0
            r24 = r8
            r9 = r4
            r8 = r6
            r4 = r10
            r10 = r5
            r5 = r24
        L1b1:
            if (r3 >= r4) goto L1db
            long r13 = r5 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L1d8
            int r13 = r7 << 3
            int r13 = r13 + r3
            r13 = r10[r13]
            r0.g0 = r12
            r0.h0 = r10
            r0.R = r9
            r0.X = r8
            r0.Y = r7
            r0.e0 = r5
            r0.Z = r4
            r0.d0 = r3
            r0.f0 = r15
            x61 r13 = r12.c(r0, r13)
            if (r13 != r1) goto L1d8
            r2 = r1
            goto L1e6
        L1d8:
            long r5 = r5 >> r11
            int r3 = r3 + r15
            goto L1b1
        L1db:
            if (r4 != r11) goto L1e6
            r6 = r8
            r4 = r9
            r5 = r10
            r3 = r12
        L1e1:
            if (r7 == r6) goto L1e6
            int r7 = r7 + 1
            goto L194
        L1e6:
            return r2
        L1e7:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.f0
            if (r3 == 0) goto L219
            if (r3 != r15) goto L213
            int r3 = r0.d0
            int r4 = r0.Z
            long r5 = r0.e0
            int r7 = r0.Y
            int r8 = r0.X
            long[] r9 = r0.R
            java.lang.Object r10 = r0.h0
            q52 r10 = (defpackage.q52) r10
            java.lang.Object r12 = r0.g0
            rb6 r12 = (defpackage.rb6) r12
            defpackage.oi2.Y(r27)
            goto L281
        L213:
            defpackage.i.m(r10)
            r2 = r9
            goto L29b
        L219:
            defpackage.oi2.Y(r27)
            java.lang.Object r3 = r0.g0
            rb6 r3 = (defpackage.rb6) r3
            q52 r8 = (defpackage.q52) r8
            ja4 r4 = r8.B
            long[] r4 = r4.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L29b
            r6 = 0
        L22c:
            r9 = r4[r6]
            long r12 = ~r9
            long r12 = r12 << r20
            long r12 = r12 & r9
            long r12 = r12 & r21
            int r7 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r7 == 0) goto L294
            int r7 = r6 - r5
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r12 = r3
            r3 = 0
            r24 = r9
            r9 = r4
            r4 = r7
            r10 = r8
            r8 = r5
            r7 = r6
            r5 = r24
        L24a:
            if (r3 >= r4) goto L28b
            long r13 = r5 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L281
            int r13 = r7 << 3
            int r13 = r13 + r3
            t04 r14 = new t04
            r23 = r11
            ja4 r11 = r10.B
            java.lang.Object[] r15 = r11.b
            r15 = r15[r13]
            java.lang.Object[] r11 = r11.c
            r11 = r11[r13]
            r13 = 1
            r14.<init>(r13, r15, r11)
            r0.g0 = r12
            r0.h0 = r10
            r0.R = r9
            r0.X = r8
            r0.Y = r7
            r0.e0 = r5
            r0.Z = r4
            r0.d0 = r3
            r0.f0 = r13
            x61 r11 = r12.c(r0, r14)
            if (r11 != r1) goto L284
            r2 = r1
            goto L29b
        L281:
            r23 = r11
            r13 = r15
        L284:
            long r5 = r5 >> r23
            int r3 = r3 + r13
            r15 = r13
            r11 = r23
            goto L24a
        L28b:
            r13 = r15
            if (r4 != r11) goto L29b
            r6 = r7
            r5 = r8
            r4 = r9
            r8 = r10
            r3 = r12
            goto L295
        L294:
            r13 = r15
        L295:
            if (r6 == r5) goto L29b
            int r6 = r6 + 1
            r15 = r13
            goto L22c
        L29b:
            return r2
    }
}
