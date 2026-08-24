package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc4  reason: default package */
/* loaded from: classes.dex */
public final class yc4 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ defpackage.ga7 X;
    public final /* synthetic */ defpackage.rc4 Y;
    public final /* synthetic */ defpackage.sb4 Z;
    public final /* synthetic */ defpackage.x94 d0;
    public final /* synthetic */ defpackage.pp6 e0;
    public final /* synthetic */ defpackage.uw0 f0;

    public yc4(defpackage.ga7 r1, defpackage.rc4 r2, defpackage.sb4 r3, defpackage.x94 r4, defpackage.pp6 r5, defpackage.uw0 r6, defpackage.r41 r7) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            r0.f0 = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            yc4 r0 = (defpackage.yc4) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            yc4 r0 = new yc4
            pp6 r5 = r8.e0
            uw0 r6 = r8.f0
            ga7 r1 = r8.X
            rc4 r2 = r8.Y
            sb4 r3 = r8.Z
            x94 r4 = r8.d0
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r21)
            ga7 r1 = r0.X
            gx0 r2 = r1.a
            java.lang.Object r2 = r2.f()
            vs4 r1 = r1.d
            java.lang.Object r3 = r1.getValue()
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto Ldc
            rc4 r2 = r0.Y
            zb4 r2 = r2.b
            pu r2 = r2.f
            java.lang.Object r2 = r2.h()
            sb4 r2 = (defpackage.sb4) r2
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.getValue()
            sb4 r3 = r0.Z
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto Ldc
        L35:
            pp6 r2 = r0.e0
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()
            sb4 r3 = (defpackage.sb4) r3
            uw0 r4 = r0.f0
            vb4 r4 = r4.b()
            r4.c(r3)
            goto L41
        L57:
            x94 r0 = r0.d0
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto Ldc
            r5 = 0
        L61:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto Ld7
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r11 = 0
        L7b:
            if (r11 >= r8) goto Ld5
            r12 = 255(0xff, double:1.26E-321)
            long r14 = r6 & r12
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto Ld1
            int r14 = r5 << 3
            int r14 = r14 + r11
            java.lang.Object[] r15 = r0.b
            r15 = r15[r14]
            float[] r4 = r0.c
            r4 = r4[r14]
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r4 = r1.getValue()
            sb4 r4 = (defpackage.sb4) r4
            java.lang.String r4 = r4.Y
            boolean r4 = defpackage.nb3.k(r15, r4)
            if (r4 != 0) goto Ld1
            int r4 = r0.e
            int r4 = r4 + (-1)
            r0.e = r4
            long[] r4 = r0.a
            int r15 = r0.d
            int r16 = r14 >> 3
            r17 = r14 & 7
            int r17 = r17 << 3
            r18 = r4[r16]
            long r12 = r12 << r17
            long r12 = ~r12
            long r12 = r18 & r12
            r18 = 254(0xfe, double:1.255E-321)
            long r17 = r18 << r17
            long r12 = r12 | r17
            r4[r16] = r12
            int r16 = r14 + (-7)
            r16 = r16 & r15
            r15 = r15 & r10
            int r16 = r16 + r15
            int r15 = r16 >> 3
            r4[r15] = r12
            java.lang.Object[] r4 = r0.b
            r12 = 0
            r4[r14] = r12
        Ld1:
            long r6 = r6 >> r9
            int r11 = r11 + 1
            goto L7b
        Ld5:
            if (r8 != r9) goto Ldc
        Ld7:
            if (r5 == r3) goto Ldc
            int r5 = r5 + 1
            goto L61
        Ldc:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
