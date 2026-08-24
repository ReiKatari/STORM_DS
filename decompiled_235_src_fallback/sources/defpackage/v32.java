package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v32  reason: default package */
/* loaded from: classes.dex */
public final class v32 implements defpackage.go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;
    public final /* synthetic */ defpackage.qn2 L;

    public /* synthetic */ v32(java.util.List r1, defpackage.qn2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23) {
            r19 = this;
            r0 = r19
            int r1 = r0.A
            r2 = 1065353216(0x3f800000, float:1.0)
            x64 r3 = defpackage.x64.a
            jg7 r4 = defpackage.jg7.a
            vs0 r5 = defpackage.ox0.a
            java.util.List r6 = r0.B
            r7 = 146(0x92, float:2.05E-43)
            r11 = 0
            r12 = 1
            qn2 r0 = r0.L
            r13 = 4
            r14 = 6
            switch(r1) {
                case 0: goto L1ae;
                case 1: goto L126;
                case 2: goto L9c;
                default: goto L19;
            }
        L19:
            r1 = r20
            lp3 r1 = (defpackage.lp3) r1
            r2 = r21
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r22
            px0 r3 = (defpackage.px0) r3
            r14 = r23
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r15 = r14 & 6
            if (r15 != 0) goto L44
            r15 = r3
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.f(r1)
            if (r1 == 0) goto L40
            r10 = r13
            goto L41
        L40:
            r10 = 2
        L41:
            r1 = r14 | r10
            goto L45
        L44:
            r1 = r14
        L45:
            r10 = r14 & 48
            if (r10 != 0) goto L58
            r10 = r3
            xq2 r10 = (defpackage.xq2) r10
            boolean r10 = r10.d(r2)
            if (r10 == 0) goto L55
            r8 = 32
            goto L57
        L55:
            r8 = 16
        L57:
            r1 = r1 | r8
        L58:
            r8 = r1 & 147(0x93, float:2.06E-43)
            if (r8 == r7) goto L5e
            r7 = r12
            goto L5f
        L5e:
            r7 = r11
        L5f:
            r1 = r1 & r12
            xq2 r3 = (defpackage.xq2) r3
            boolean r1 = r3.S(r1, r7)
            if (r1 == 0) goto L98
            java.lang.Object r1 = r6.get(r2)
            qe4 r1 = (defpackage.qe4) r1
            r2 = -567447365(0xffffffffde2d70bb, float:-3.1244236E18)
            r3.b0(r2)
            boolean r2 = r3.f(r0)
            boolean r6 = r3.f(r1)
            r2 = r2 | r6
            java.lang.Object r6 = r3.P()
            if (r2 != 0) goto L85
            if (r6 != r5) goto L8f
        L85:
            i5 r6 = new i5
            r2 = 8
            r6.<init>(r2, r0, r1)
            r3.l0(r6)
        L8f:
            on2 r6 = (defpackage.on2) r6
            defpackage.bl2.h(r1, r6, r3, r11)
            r3.p(r11)
            goto L9b
        L98:
            r3.V()
        L9b:
            return r4
        L9c:
            r1 = r20
            lp3 r1 = (defpackage.lp3) r1
            r15 = r21
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r16 = r22
            px0 r16 = (defpackage.px0) r16
            r17 = r23
            java.lang.Number r17 = (java.lang.Number) r17
            int r17 = r17.intValue()
            r18 = r17 & 6
            if (r18 != 0) goto Lc8
            r8 = r16
            xq2 r8 = (defpackage.xq2) r8
            boolean r1 = r8.f(r1)
            if (r1 == 0) goto Lc4
            r10 = r13
            goto Lc5
        Lc4:
            r10 = 2
        Lc5:
            r1 = r17 | r10
            goto Lca
        Lc8:
            r1 = r17
        Lca:
            r8 = r17 & 48
            if (r8 != 0) goto Lde
            r8 = r16
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.d(r15)
            if (r8 == 0) goto Ldb
            r8 = 32
            goto Ldd
        Ldb:
            r8 = 16
        Ldd:
            r1 = r1 | r8
        Lde:
            r8 = r1 & 147(0x93, float:2.06E-43)
            if (r8 == r7) goto Le4
            r7 = r12
            goto Le5
        Le4:
            r7 = r11
        Le5:
            r1 = r1 & r12
            r8 = r16
            xq2 r8 = (defpackage.xq2) r8
            boolean r1 = r8.S(r1, r7)
            if (r1 == 0) goto L122
            java.lang.Object r1 = r6.get(r15)
            cp2 r1 = (defpackage.cp2) r1
            r6 = -196696351(0xfffffffff446a6e1, float:-6.295529E31)
            r8.b0(r6)
            a74 r2 = defpackage.dj6.c(r3, r2)
            boolean r3 = r8.f(r0)
            boolean r6 = r8.h(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r8.P()
            if (r3 != 0) goto L111
            if (r6 != r5) goto L119
        L111:
            i5 r6 = new i5
            r6.<init>(r14, r0, r1)
            r8.l0(r6)
        L119:
            on2 r6 = (defpackage.on2) r6
            defpackage.mp2.a(r2, r1, r6, r8, r14)
            r8.p(r11)
            goto L125
        L122:
            r8.V()
        L125:
            return r4
        L126:
            r1 = r20
            lp3 r1 = (defpackage.lp3) r1
            r8 = r21
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r15 = r22
            px0 r15 = (defpackage.px0) r15
            r16 = r23
            java.lang.Number r16 = (java.lang.Number) r16
            int r16 = r16.intValue()
            r17 = r16 & 6
            if (r17 != 0) goto L151
            r9 = r15
            xq2 r9 = (defpackage.xq2) r9
            boolean r1 = r9.f(r1)
            if (r1 == 0) goto L14d
            r10 = r13
            goto L14e
        L14d:
            r10 = 2
        L14e:
            r1 = r16 | r10
            goto L153
        L151:
            r1 = r16
        L153:
            r9 = r16 & 48
            if (r9 != 0) goto L167
            r9 = r15
            xq2 r9 = (defpackage.xq2) r9
            boolean r9 = r9.d(r8)
            if (r9 == 0) goto L163
            r17 = 32
            goto L165
        L163:
            r17 = 16
        L165:
            r1 = r1 | r17
        L167:
            r9 = r1 & 147(0x93, float:2.06E-43)
            if (r9 == r7) goto L16d
            r7 = r12
            goto L16e
        L16d:
            r7 = r11
        L16e:
            r1 = r1 & r12
            xq2 r15 = (defpackage.xq2) r15
            boolean r1 = r15.S(r1, r7)
            if (r1 == 0) goto L1aa
            java.lang.Object r1 = r6.get(r8)
            an0 r1 = (defpackage.an0) r1
            r6 = -476599689(0xffffffffe397aa77, float:-5.5954833E21)
            r15.b0(r6)
            a74 r2 = defpackage.dj6.c(r3, r2)
            boolean r3 = r15.f(r0)
            boolean r6 = r15.h(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r15.P()
            if (r3 != 0) goto L198
            if (r6 != r5) goto L1a1
        L198:
            i5 r6 = new i5
            r3 = 5
            r6.<init>(r3, r0, r1)
            r15.l0(r6)
        L1a1:
            on2 r6 = (defpackage.on2) r6
            defpackage.gi2.c(r2, r1, r6, r15, r14)
            r15.p(r11)
            goto L1ad
        L1aa:
            r15.V()
        L1ad:
            return r4
        L1ae:
            r1 = r20
            lp3 r1 = (defpackage.lp3) r1
            r8 = r21
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9 = r22
            px0 r9 = (defpackage.px0) r9
            r15 = r23
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            r16 = r15 & 6
            if (r16 != 0) goto L1d9
            r10 = r9
            xq2 r10 = (defpackage.xq2) r10
            boolean r1 = r10.f(r1)
            if (r1 == 0) goto L1d5
            r10 = r13
            goto L1d6
        L1d5:
            r10 = 2
        L1d6:
            r1 = r15 | r10
            goto L1da
        L1d9:
            r1 = r15
        L1da:
            r10 = r15 & 48
            if (r10 != 0) goto L1ee
            r10 = r9
            xq2 r10 = (defpackage.xq2) r10
            boolean r10 = r10.d(r8)
            if (r10 == 0) goto L1ea
            r17 = 32
            goto L1ec
        L1ea:
            r17 = 16
        L1ec:
            r1 = r1 | r17
        L1ee:
            r10 = r1 & 147(0x93, float:2.06E-43)
            if (r10 == r7) goto L1f4
            r7 = r12
            goto L1f5
        L1f4:
            r7 = r11
        L1f5:
            r1 = r1 & r12
            xq2 r9 = (defpackage.xq2) r9
            boolean r1 = r9.S(r1, r7)
            if (r1 == 0) goto L230
            java.lang.Object r1 = r6.get(r8)
            co0 r1 = (defpackage.co0) r1
            r6 = 1158729181(0x4510cddd, float:2316.8665)
            r9.b0(r6)
            a74 r2 = defpackage.dj6.c(r3, r2)
            boolean r3 = r9.f(r0)
            boolean r6 = r9.f(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r9.P()
            if (r3 != 0) goto L21f
            if (r6 != r5) goto L227
        L21f:
            i5 r6 = new i5
            r6.<init>(r13, r0, r1)
            r9.l0(r6)
        L227:
            on2 r6 = (defpackage.on2) r6
            defpackage.ge7.d(r2, r1, r6, r9, r14)
            r9.p(r11)
            goto L233
        L230:
            r9.V()
        L233:
            return r4
    }
}
