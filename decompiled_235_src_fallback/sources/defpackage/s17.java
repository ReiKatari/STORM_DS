package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s17  reason: default package */
/* loaded from: classes.dex */
public final class s17 implements defpackage.io2 {
    public final /* synthetic */ defpackage.eo2 A;
    public final /* synthetic */ defpackage.eo2 B;
    public final /* synthetic */ java.lang.String L;
    public final /* synthetic */ defpackage.i17 R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ defpackage.r94 Z;
    public final /* synthetic */ defpackage.ke6 d0;
    public final /* synthetic */ defpackage.b37 e0;
    public final /* synthetic */ defpackage.eo2 f0;
    public final /* synthetic */ boolean g0;
    public final /* synthetic */ defpackage.lq4 h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ defpackage.zv0 j0;

    public s17(defpackage.eo2 r1, defpackage.eo2 r2, java.lang.String r3, defpackage.i17 r4, boolean r5, boolean r6, defpackage.r94 r7, defpackage.ke6 r8, defpackage.b37 r9, defpackage.eo2 r10, boolean r11, defpackage.lq4 r12, boolean r13, defpackage.zv0 r14) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            r0.g0 = r11
            r0.h0 = r12
            r0.i0 = r13
            r0.j0 = r14
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.Object r25) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Number r1 = (java.lang.Number) r1
            float r9 = r1.floatValue()
            r1 = r21
            kt0 r1 = (defpackage.kt0) r1
            long r1 = r1.a
            r3 = r22
            kt0 r3 = (defpackage.kt0) r3
            long r4 = r3.a
            r3 = r23
            java.lang.Number r3 = (java.lang.Number) r3
            float r10 = r3.floatValue()
            r3 = r24
            px0 r3 = (defpackage.px0) r3
            r6 = r25
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r7 = r6 & 6
            r11 = 4
            r12 = 2
            if (r7 != 0) goto L3e
            r7 = r3
            xq2 r7 = (defpackage.xq2) r7
            boolean r7 = r7.c(r9)
            if (r7 == 0) goto L3b
            r7 = r11
            goto L3c
        L3b:
            r7 = r12
        L3c:
            r7 = r7 | r6
            goto L3f
        L3e:
            r7 = r6
        L3f:
            r8 = r6 & 48
            if (r8 != 0) goto L52
            r8 = r3
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.e(r1)
            if (r8 == 0) goto L4f
            r8 = 32
            goto L51
        L4f:
            r8 = 16
        L51:
            r7 = r7 | r8
        L52:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L65
            r8 = r3
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.e(r4)
            if (r8 == 0) goto L62
            r8 = 256(0x100, float:3.59E-43)
            goto L64
        L62:
            r8 = 128(0x80, float:1.8E-43)
        L64:
            r7 = r7 | r8
        L65:
            r6 = r6 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L78
            r6 = r3
            xq2 r6 = (defpackage.xq2) r6
            boolean r6 = r6.c(r10)
            if (r6 == 0) goto L75
            r6 = 2048(0x800, float:2.87E-42)
            goto L77
        L75:
            r6 = 1024(0x400, float:1.435E-42)
        L77:
            r7 = r7 | r6
        L78:
            r13 = r7
            r6 = r13 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            r14 = 1
            r15 = 0
            if (r6 == r7) goto L83
            r6 = r14
            goto L84
        L83:
            r6 = r15
        L84:
            r7 = r13 & 1
            xq2 r3 = (defpackage.xq2) r3
            boolean r6 = r3.S(r7, r6)
            if (r6 == 0) goto L1d5
            r16 = 0
            eo2 r6 = r0.A
            if (r6 != 0) goto La1
            r1 = 986681709(0x3acf916d, float:0.0015836187)
            r3.b0(r1)
            r3.p(r15)
            r1 = r3
            r4 = r16
            goto Lc0
        La1:
            r7 = 986681710(0x3acf916e, float:0.0015836188)
            r3.b0(r7)
            r17 = r1
            r1 = r3
            r3 = r9
            r8 = r17
            p17 r2 = new p17
            boolean r7 = r0.i0
            r2.<init>(r3, r4, r6, r7, r8)
            r9 = r3
            r3 = 723429411(0x2b1ea823, float:5.636621E-13)
            zv0 r2 = defpackage.n16.I(r3, r2, r1)
            r1.p(r15)
            r4 = r2
        Lc0:
            boolean r2 = r0.X
            i17 r3 = r0.R
            eo2 r5 = r0.B
            if (r5 == 0) goto Leb
            java.lang.String r6 = r0.L
            int r6 = r6.length()
            if (r6 != 0) goto Leb
            r6 = 0
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto Leb
            r6 = 987666549(0x3ade9875, float:0.0016982692)
            r1.b0(r6)
            q17 r6 = new q17
            r6.<init>(r10, r3, r2, r5)
            r5 = -426706263(0xffffffffe690faa9, float:-3.4232232E23)
            zv0 r5 = defpackage.n16.I(r5, r6, r1)
            r1.p(r15)
            goto Lf6
        Leb:
            r5 = 988093542(0x3ae51c66, float:0.0017479777)
            r1.b0(r5)
            r1.p(r15)
            r5 = r16
        Lf6:
            boolean r6 = r0.Y
            pp6 r7 = r3.a(r2, r6, r1)
            java.lang.Object r7 = r7.getValue()
            kt0 r7 = (defpackage.kt0) r7
            long r7 = r7.a
            r7 = 988282301(0x3ae7fdbd, float:0.0017699521)
            r1.b0(r7)
            r1.p(r15)
            r94 r7 = r0.Z
            qa4 r2 = r3.g(r2, r6, r7, r1)
            java.lang.Object r2 = r2.getValue()
            kt0 r2 = (defpackage.kt0) r2
            long r6 = r2.a
            r2 = 988575964(0x3aec78dc, float:0.001804139)
            r1.b0(r2)
            r1.p(r15)
            qa4 r2 = r3.d(r1)
            java.lang.Object r2 = r2.getValue()
            kt0 r2 = (defpackage.kt0) r2
            long r2 = r2.a
            ke6 r6 = r0.d0
            x64 r7 = defpackage.x64.a
            a74 r2 = defpackage.vy7.L(r7, r2, r6)
            int[] r3 = defpackage.r17.a
            b37 r6 = r0.e0
            int r6 = r6.ordinal()
            r3 = r3[r6]
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            if (r3 == r14) goto L1b8
            if (r3 != r12) goto L1af
            r3 = 989436742(0x3af99b46, float:0.0019043467)
            r1.b0(r3)
            java.lang.Object r3 = r1.P()
            vs0 r7 = defpackage.ox0.a
            if (r3 != r7) goto L164
            xi6 r3 = new xi6
            r14 = 0
            r3.<init>(r14)
            vs4 r3 = defpackage.np2.Y(r3)
            r1.l0(r3)
        L164:
            qa4 r3 = (defpackage.qa4) r3
            e46 r8 = new e46
            lq4 r10 = r0.h0
            zv0 r14 = r0.j0
            r8.<init>(r3, r10, r14, r12)
            r10 = -1107746014(0xffffffffbdf92322, float:-0.12164904)
            zv0 r8 = defpackage.n16.I(r10, r8, r1)
            r10 = r13 & 14
            if (r10 != r11) goto L17c
            r10 = 1
            goto L17d
        L17c:
            r10 = 0
        L17d:
            java.lang.Object r11 = r1.P()
            if (r10 != 0) goto L185
            if (r11 != r7) goto L18e
        L185:
            n4 r11 = new n4
            r7 = 1
            r11.<init>(r9, r3, r7)
            r1.l0(r11)
        L18e:
            r10 = r11
            qn2 r10 = (defpackage.qn2) r10
            int r3 = r13 << 21
            r3 = r3 & r6
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r14 = r3 | r6
            eo2 r3 = r0.f0
            r11 = r8
            boolean r8 = r0.g0
            lq4 r12 = r0.h0
            r7 = r16
            r6 = r5
            r5 = r4
            r4 = r6
            r13 = r1
            r6 = r16
            defpackage.zo4.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            r1.p(r14)
            goto L1d9
        L1af:
            r14 = r15
            r0 = 1971561250(0x7583a322, float:3.3374005E32)
            ug r0 = defpackage.xg6.f(r1, r0, r14)
            throw r0
        L1b8:
            r3 = r6
            r14 = r15
            r6 = r16
            r7 = 988856360(0x3af0c028, float:0.0018367814)
            r1.b0(r7)
            int r7 = r13 << 21
            r12 = r7 & r3
            eo2 r3 = r0.f0
            boolean r8 = r0.g0
            lq4 r10 = r0.h0
            r7 = r6
            r11 = r1
            defpackage.uj2.h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.p(r14)
            goto L1d9
        L1d5:
            r1 = r3
            r1.V()
        L1d9:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
