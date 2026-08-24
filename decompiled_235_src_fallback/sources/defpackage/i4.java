package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 extends defpackage.po2 implements defpackage.on2 {
    public final /* synthetic */ int d0;

    public /* synthetic */ i4(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.d0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r24 = this;
            r0 = r24
            int r1 = r0.d0
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            java.lang.Object r0 = r0.B
            switch(r1) {
                case 0: goto L1cb;
                case 1: goto L1ac;
                case 2: goto L19c;
                case 3: goto L195;
                case 4: goto L65;
                case 5: goto L58;
                case 6: goto L4b;
                case 7: goto L45;
                case 8: goto L3f;
                case 9: goto L12;
                default: goto Lc;
            }
        Lc:
            j37 r0 = (defpackage.j37) r0
            r0.a()
            return r4
        L12:
            m16 r0 = (defpackage.m16) r0
            o41 r1 = r0.a
            if (r1 == 0) goto L39
            defpackage.g04.x(r1, r3)
            r0.g()
            ai1 r0 = r0.e
            if (r0 == 0) goto L33
            java.lang.Object r1 = r0.g
            qz0 r1 = (defpackage.qz0) r1
            r1.close()
            java.lang.Object r0 = r0.h
            pu6 r0 = (defpackage.pu6) r0
            if (r0 == 0) goto L32
            r0.close()
        L32:
            return r4
        L33:
            java.lang.String r0 = "connectionManager"
            defpackage.nb3.a0(r0)
            throw r3
        L39:
            java.lang.String r0 = "coroutineScope"
            defpackage.nb3.a0(r0)
            throw r3
        L3f:
            me.magnum.melonds.ui.layouts.LayoutSelectorActivity r0 = (me.magnum.melonds.ui.layouts.LayoutSelectorActivity) r0
            r0.finish()
            return r4
        L45:
            me.magnum.melonds.ui.layouts.LayoutListActivity r0 = (me.magnum.melonds.ui.layouts.LayoutListActivity) r0
            r0.finish()
            return r4
        L4b:
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            tp6 r1 = r0.i
            r1.l(r3)
            tp6 r0 = r0.k
            r0.l(r3)
            return r4
        L58:
            di2 r0 = (defpackage.di2) r0
            vh2 r0 = r0.r0
            boolean r0 = defpackage.vh2.Z0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L65:
            xg2 r0 = (defpackage.xg2) r0
            ka4 r1 = r0.c
            ka4 r5 = r0.d
            eh2 r6 = r0.a
            vh2 r7 = r6.f()
            r15 = 8
            if (r7 != 0) goto Lbd
            java.lang.Object[] r3 = r5.b
            long[] r7 = r5.a
            r16 = 128(0x80, double:6.3E-322)
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L178
            r9 = 0
            r18 = 255(0xff, double:1.26E-321)
        L83:
            r10 = r7[r9]
            r24 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = ~r10
            long r12 = r12 << r24
            long r12 = r12 & r10
            long r12 = r12 & r20
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto Lb8
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = 0
        L9e:
            if (r13 >= r12) goto Lb6
            long r22 = r10 & r18
            int r14 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r14 >= 0) goto Lb2
            int r14 = r9 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            rg2 r14 = (defpackage.rg2) r14
            sh2 r2 = defpackage.sh2.Inactive
            r14.D(r2)
        Lb2:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L9e
        Lb6:
            if (r12 != r15) goto L178
        Lb8:
            if (r9 == r8) goto L178
            int r9 = r9 + 1
            goto L83
        Lbd:
            r24 = 7
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            boolean r2 = r7.j0
            if (r2 == 0) goto L178
            boolean r2 = r1.c(r7)
            if (r2 == 0) goto Ld5
            r7.X0()
        Ld5:
            sh2 r2 = r7.W0()
            z64 r8 = r7.A
            boolean r8 = r8.j0
            if (r8 != 0) goto Le4
            java.lang.String r8 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r8)
        Le4:
            z64 r8 = r7.A
            sm3 r7 = defpackage.nc1.f0(r7)
            r9 = 0
        Leb:
            if (r7 == 0) goto L13b
            if0 r10 = r7.B0
            java.lang.Object r10 = r10.g
            z64 r10 = (defpackage.z64) r10
            int r10 = r10.R
            r10 = r10 & 5120(0x1400, float:7.175E-42)
            if (r10 == 0) goto L12a
        Lf9:
            if (r8 == 0) goto L12a
            int r10 = r8.L
            r11 = r10 & 5120(0x1400, float:7.175E-42)
            if (r11 == 0) goto L127
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L107
            int r9 = r9 + 1
        L107:
            boolean r10 = r8 instanceof defpackage.rg2
            if (r10 == 0) goto L127
            boolean r10 = r5.c(r8)
            if (r10 != 0) goto L112
            goto L127
        L112:
            r10 = 1
            if (r9 > r10) goto L11c
            r10 = r8
            rg2 r10 = (defpackage.rg2) r10
            r10.D(r2)
            goto L124
        L11c:
            r10 = r8
            rg2 r10 = (defpackage.rg2) r10
            sh2 r11 = defpackage.sh2.ActiveParent
            r10.D(r11)
        L124:
            r5.l(r8)
        L127:
            z64 r8 = r8.X
            goto Lf9
        L12a:
            sm3 r7 = r7.v()
            if (r7 == 0) goto L139
            if0 r8 = r7.B0
            if (r8 == 0) goto L139
            java.lang.Object r8 = r8.f
            vy6 r8 = (defpackage.vy6) r8
            goto Leb
        L139:
            r8 = r3
            goto Leb
        L13b:
            java.lang.Object[] r2 = r5.b
            long[] r3 = r5.a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L178
            r8 = 0
        L145:
            r9 = r3[r8]
            long r11 = ~r9
            long r11 = r11 << r24
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L173
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L159:
            if (r12 >= r11) goto L171
            long r13 = r9 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L16d
            int r13 = r8 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            rg2 r13 = (defpackage.rg2) r13
            sh2 r14 = defpackage.sh2.Inactive
            r13.D(r14)
        L16d:
            long r9 = r9 >> r15
            int r12 = r12 + 1
            goto L159
        L171:
            if (r11 != r15) goto L178
        L173:
            if (r8 == r7) goto L178
            int r8 = r8 + 1
            goto L145
        L178:
            vh2 r2 = r6.f()
            if (r2 == 0) goto L188
            vh2 r2 = r6.c
            sh2 r2 = r2.W0()
            sh2 r3 = defpackage.sh2.Inactive
            if (r2 != r3) goto L18b
        L188:
            r6.c()
        L18b:
            r1.b()
            r5.b()
            r1 = 0
            r0.e = r1
            return r4
        L195:
            m07 r0 = (defpackage.m07) r0
            l07 r0 = r0.R()
            return r0
        L19c:
            la1 r0 = (defpackage.la1) r0
            tp6 r1 = r0.g
            r1.getClass()
            da1 r2 = defpackage.da1.a
            r1.m(r3, r2)
            r0.f()
            return r4
        L1ac:
            android.view.View r0 = (android.view.View) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L1b7
            defpackage.q2.j(r0)
        L1b7:
            r2 = 29
            if (r1 < r2) goto L1ca
            android.view.contentcapture.ContentCaptureSession r1 = defpackage.rp.c(r0)
            if (r1 != 0) goto L1c2
            goto L1ca
        L1c2:
            u63 r3 = new u63
            r2 = 27
            r4 = 0
            r3.<init>(r2, r1, r0, r4)
        L1ca:
            return r3
        L1cb:
            nx1 r0 = (defpackage.nx1) r0
            tp6 r1 = r0.d
            r1.getClass()
            f06 r2 = defpackage.f06.a
            r1.m(r3, r2)
            r0.m()
            return r4
    }
}
