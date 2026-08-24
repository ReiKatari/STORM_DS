package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s9  reason: default package */
/* loaded from: classes.dex */
public final class s9 implements defpackage.as4 {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;

    public s9(int r2) {
            r1 = this;
            r0 = 0
            switch(r2) {
                case 13: goto L24;
                default: goto L4;
            }
        L4:
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.a = r2
            vw r2 = new vw
            r2.<init>(r0)
            r1.c = r2
            ca4 r2 = new ca4
            r2.<init>()
            r1.d = r2
            ca4 r2 = new ca4
            r2.<init>()
            r1.e = r2
            return
        L24:
            r1.<init>()
            eu1 r2 = defpackage.eu1.b
            r1.e = r2
            java.lang.String r2 = "GET"
            r1.b = r2
            ww2 r2 = new ww2
            r2.<init>(r0, r0)
            r1.c = r2
            return
    }

    public s9(defpackage.fp r31, defpackage.s47 r32, java.util.List r33, defpackage.qh1 r34, defpackage.ki2 r35) {
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r0.<init>()
            r0.a = r1
            r3 = r33
            r0.b = r3
            xr3 r3 = defpackage.xr3.NONE
            w84 r4 = new w84
            r5 = 0
            r4.<init>(r0, r5)
            go3 r4 = defpackage.kj2.M(r3, r4)
            r0.c = r4
            w84 r4 = new w84
            r6 = 1
            r4.<init>(r0, r6)
            go3 r3 = defpackage.kj2.M(r3, r4)
            r0.d = r3
            ds4 r3 = r2.b
            fp r4 = defpackage.gp.a
            java.util.ArrayList r4 = r1.R
            java.lang.String r6 = r1.B
            yt1 r7 = defpackage.yt1.A
            if (r4 == 0) goto L41
            zh2 r8 = new zh2
            r9 = 8
            r8.<init>(r9)
            java.util.List r4 = defpackage.gt0.d1(r4, r8)
            goto L42
        L41:
            r4 = r7
        L42:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            pu r9 = new pu
            r9.<init>()
            int r10 = r4.size()
            r11 = r5
            r12 = r11
        L52:
            if (r11 >= r10) goto L136
            java.lang.Object r13 = r4.get(r11)
            ep r13 = (defpackage.ep) r13
            java.lang.Object r14 = r13.a
            ds4 r14 = (defpackage.ds4) r14
            ds4 r14 = r3.a(r14)
            r15 = 14
            ep r13 = defpackage.ep.a(r13, r14, r5, r15)
            java.lang.Object r14 = r13.a
            int r15 = r13.c
            int r13 = r13.b
        L6e:
            if (r12 >= r13) goto Lbe
            boolean r16 = r9.isEmpty()
            if (r16 != 0) goto Lbe
            java.lang.Object r16 = r9.last()
            r5 = r16
            ep r5 = (defpackage.ep) r5
            r16 = r4
            int r4 = r5.c
            r17 = r7
            java.lang.Object r7 = r5.a
            if (r13 >= r4) goto L97
            ep r4 = new ep
            r4.<init>(r7, r12, r13)
            r8.add(r4)
            r12 = r13
            r4 = r16
            r7 = r17
        L95:
            r5 = 0
            goto L6e
        L97:
            r18 = r10
            ep r10 = new ep
            r10.<init>(r7, r12, r4)
            r8.add(r10)
            int r12 = r5.c
        La3:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Lb7
            java.lang.Object r4 = r9.last()
            ep r4 = (defpackage.ep) r4
            int r4 = r4.c
            if (r12 != r4) goto Lb7
            r9.removeLast()
            goto La3
        Lb7:
            r4 = r16
            r7 = r17
            r10 = r18
            goto L95
        Lbe:
            r16 = r4
            r17 = r7
            r18 = r10
            if (r12 >= r13) goto Lcf
            ep r4 = new ep
            r4.<init>(r3, r12, r13)
            r8.add(r4)
            r12 = r13
        Lcf:
            java.lang.Object r4 = r9.h()
            ep r4 = (defpackage.ep) r4
            if (r4 == 0) goto L123
            int r5 = r4.c
            java.lang.Object r7 = r4.a
            int r4 = r4.b
            if (r4 != r13) goto Lf5
            if (r5 != r15) goto Lf5
            r9.removeLast()
            ep r4 = new ep
            ds4 r7 = (defpackage.ds4) r7
            ds4 r14 = (defpackage.ds4) r14
            ds4 r5 = r7.a(r14)
            r4.<init>(r5, r13, r15)
            r9.addLast(r4)
            goto L12b
        Lf5:
            if (r4 != r5) goto L10b
            ep r10 = new ep
            r10.<init>(r7, r4, r5)
            r8.add(r10)
            r9.removeLast()
            ep r4 = new ep
            r4.<init>(r14, r13, r15)
            r9.addLast(r4)
            goto L12b
        L10b:
            if (r5 < r15) goto L11e
            ep r4 = new ep
            ds4 r7 = (defpackage.ds4) r7
            ds4 r14 = (defpackage.ds4) r14
            ds4 r5 = r7.a(r14)
            r4.<init>(r5, r13, r15)
            r9.addLast(r4)
            goto L12b
        L11e:
            defpackage.u34.t()
            r0 = 0
            throw r0
        L123:
            ep r4 = new ep
            r4.<init>(r14, r13, r15)
            r9.addLast(r4)
        L12b:
            int r11 = r11 + 1
            r4 = r16
            r7 = r17
            r10 = r18
            r5 = 0
            goto L52
        L136:
            r17 = r7
        L138:
            int r4 = r6.length()
            if (r12 > r4) goto L16c
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L16c
            java.lang.Object r4 = r9.last()
            ep r4 = (defpackage.ep) r4
            ep r5 = new ep
            java.lang.Object r7 = r4.a
            int r4 = r4.c
            r5.<init>(r7, r12, r4)
            r8.add(r5)
        L156:
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L16a
            java.lang.Object r5 = r9.last()
            ep r5 = (defpackage.ep) r5
            int r5 = r5.c
            if (r4 != r5) goto L16a
            r9.removeLast()
            goto L156
        L16a:
            r12 = r4
            goto L138
        L16c:
            int r4 = r6.length()
            if (r12 >= r4) goto L17e
            ep r4 = new ep
            int r5 = r6.length()
            r4.<init>(r3, r12, r5)
            r8.add(r4)
        L17e:
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L18e
            ep r4 = new ep
            r5 = 0
            r4.<init>(r3, r5, r5)
            r8.add(r4)
            goto L18f
        L18e:
            r5 = 0
        L18f:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r7 = r8.size()
            r4.<init>(r7)
            int r7 = r8.size()
            r9 = r5
        L19d:
            if (r9 >= r7) goto L28f
            java.lang.Object r10 = r8.get(r9)
            ep r10 = (defpackage.ep) r10
            int r11 = r10.b
            int r12 = r10.c
            fp r13 = new fp
            if (r11 == r12) goto L1b2
            java.lang.String r14 = r6.substring(r11, r12)
            goto L1b4
        L1b2:
            java.lang.String r14 = ""
        L1b4:
            k4 r15 = new k4
            r5 = 11
            r15.<init>(r5)
            java.util.List r5 = defpackage.gp.a(r1, r11, r12, r15)
            if (r5 != 0) goto L1c3
            r5 = r17
        L1c3:
            r13.<init>(r14, r5)
            java.lang.Object r5 = r10.a
            ds4 r5 = (defpackage.ds4) r5
            int r10 = r5.b
            if (r10 != 0) goto L1fe
            int r10 = r3.b
            int r15 = r5.a
            r16 = r6
            r29 = r7
            long r6 = r5.c
            g37 r1 = r5.d
            r23 = r1
            ux4 r1 = r5.e
            r24 = r1
            xu3 r1 = r5.f
            r25 = r1
            int r1 = r5.g
            r26 = r1
            int r1 = r5.h
            i47 r5 = r5.i
            ds4 r18 = new ds4
            r27 = r1
            r28 = r5
            r21 = r6
            r20 = r10
            r19 = r15
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28)
            r5 = r18
            goto L202
        L1fe:
            r16 = r6
            r29 = r7
        L202:
            zr4 r1 = new zr4
            s47 r6 = new s47
            nn6 r7 = r2.a
            ds4 r5 = r3.a(r5)
            r6.<init>(r7, r5)
            java.util.List r5 = r13.A
            if (r5 != 0) goto L216
            r21 = r17
            goto L218
        L216:
            r21 = r5
        L218:
            java.lang.Object r5 = r0.b
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            int r10 = r5.size()
            r7.<init>(r10)
            int r10 = r5.size()
            r13 = 0
        L22a:
            if (r13 >= r10) goto L269
            java.lang.Object r15 = r5.get(r13)
            ep r15 = (defpackage.ep) r15
            int r2 = r15.b
            r25 = r3
            int r3 = r15.c
            boolean r18 = defpackage.gp.b(r11, r12, r2, r3)
            if (r18 == 0) goto L25e
            if (r11 > r2) goto L245
            if (r3 > r12) goto L245
        L242:
            r18 = r2
            goto L24b
        L245:
            java.lang.String r18 = "placeholder can not overlap with paragraph."
            defpackage.q53.a(r18)
            goto L242
        L24b:
            ep r2 = new ep
            java.lang.Object r15 = r15.a
            r19 = r3
            int r3 = r18 - r11
            r18 = r5
            int r5 = r19 - r11
            r2.<init>(r15, r3, r5)
            r7.add(r2)
            goto L260
        L25e:
            r18 = r5
        L260:
            int r13 = r13 + 1
            r2 = r32
            r5 = r18
            r3 = r25
            goto L22a
        L269:
            r25 = r3
            gj r18 = new gj
            r24 = r34
            r23 = r35
            r20 = r6
            r22 = r7
            r19 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r2 = r18
            r1.<init>(r2, r11, r12)
            r4.add(r1)
            int r9 = r9 + 1
            r1 = r31
            r2 = r32
            r6 = r16
            r7 = r29
            r5 = 0
            goto L19d
        L28f:
            r0.e = r4
            return
    }

    public /* synthetic */ s9(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.<init>()
            return
    }

    public s9(java.util.Map r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
            r1.a = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.c = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.d = r2
            gv0 r2 = new gv0
            r0 = 4
            r2.<init>(r1, r0)
            r1.e = r2
            return
    }

    public s9(defpackage.jq r8, defpackage.ax1 r9) {
            r7 = this;
            r7.<init>()
            r7.a = r8
            r7.b = r9
            cx1 r9 = new cx1
            r0 = 0
            r9.<init>(r8, r0)
            uo7 r1 = new uo7
            java.lang.Class<vw1> r2 = defpackage.vw1.class
            ar0 r2 = defpackage.gh5.a(r2)
            cx1 r3 = new cx1
            r4 = 1
            r3.<init>(r8, r4)
            cx1 r5 = new cx1
            r6 = 2
            r5.<init>(r8, r6)
            r1.<init>(r2, r3, r9, r5)
            r7.c = r1
            c9 r9 = new c9
            r1 = 5
            r9.<init>(r1)
            ww1 r2 = new ww1
            r2.<init>(r7, r0)
            d9 r9 = r8.s(r9, r2)
            i9 r9 = (defpackage.i9) r9
            r7.d = r9
            c9 r9 = new c9
            r9.<init>(r1)
            ww1 r0 = new ww1
            r0.<init>(r7, r4)
            d9 r9 = r8.s(r9, r0)
            i9 r9 = (defpackage.i9) r9
            r7.e = r9
            au3 r8 = defpackage.bl2.C(r8)
            zw1 r9 = new zw1
            r0 = 0
            r9.<init>(r7, r0, r4)
            r7 = 3
            defpackage.hv.L(r8, r0, r0, r9, r7)
            return
    }

    public s9(defpackage.rc4 r5) {
            r4 = this;
            r5.getClass()
            android.content.Context r0 = r5.a
            r0.getClass()
            r4.<init>()
            r4.a = r0
            rh r1 = new rh
            r2 = 0
            r1.<init>(r0, r2)
            r4.b = r1
            x84 r1 = new x84
            r2 = 8
            r1.<init>(r2)
            qb6 r1 = defpackage.sb6.Z(r0, r1)
            x84 r2 = new x84
            r3 = 9
            r2.<init>(r3)
            pc2 r1 = defpackage.sb6.b0(r1, r2)
            oc2 r2 = new oc2
            r2.<init>(r1)
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L38
            r1 = 0
            goto L3c
        L38:
            java.lang.Object r1 = r2.next()
        L3c:
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L4a
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class r1 = r1.getClass()
            r2.<init>(r0, r1)
            goto L5d
        L4a:
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            java.lang.String r0 = r0.getPackageName()
            android.content.Intent r2 = r1.getLaunchIntentForPackage(r0)
            if (r2 != 0) goto L5d
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
        L5d:
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r2.addFlags(r0)
            r4.c = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.e = r0
            zb4 r5 = r5.b
            mc4 r5 = r5.g()
            r4.d = r5
            return
    }

    public s9(defpackage.xi3 r7) {
            r6 = this;
            r6.<init>()
            r6.e = r7
            r7 = 2
            short[] r0 = new short[r7]
            r6.a = r0
            int[] r0 = new int[r7]
            r1 = 1
            r2 = 8
            r0[r1] = r2
            r3 = 0
            r4 = 16
            r0[r3] = r4
            java.lang.Class r5 = java.lang.Short.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r0)
            short[][] r0 = (short[][]) r0
            r6.b = r0
            int[] r7 = new int[r7]
            r7[r1] = r2
            r7[r3] = r4
            java.lang.Object r7 = java.lang.reflect.Array.newInstance(r5, r7)
            short[][] r7 = (short[][]) r7
            r6.c = r7
            r7 = 256(0x100, float:3.59E-43)
            short[] r7 = new short[r7]
            r6.d = r7
            return
    }

    public static final defpackage.x61 d(defpackage.s9 r7, defpackage.s41 r8) {
            java.lang.Object r0 = r7.d
            v80 r0 = (defpackage.v80) r0
            java.lang.Object r1 = r7.e
            pu r1 = (defpackage.pu) r1
            boolean r2 = r8 instanceof defpackage.m35
            if (r2 == 0) goto L1b
            r2 = r8
            m35 r2 = (defpackage.m35) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.Z = r3
            goto L20
        L1b:
            m35 r2 = new m35
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L36
            int r4 = r2.R
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L34
            goto L7d
        L34:
            r8 = move-exception
            goto L82
        L36:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L3d:
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L34
            goto L50
        L41:
            defpackage.oi2.Y(r8)
        L44:
            r2.Z = r6     // Catch: java.lang.Throwable -> L34
            r0.getClass()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = defpackage.v80.L(r0, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L50
            goto L7c
        L50:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L53:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L44
            java.lang.Object r8 = r0.m()     // Catch: java.lang.Throwable -> L34
        L5d:
            boolean r4 = r8 instanceof defpackage.fm0     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L6c
            defpackage.gm0.b(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.m()     // Catch: java.lang.Throwable -> L34
            goto L5d
        L6c:
            int r4 = r1.L     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> L34
            h4 r8 = (defpackage.h4) r8     // Catch: java.lang.Throwable -> L34
            r2.R = r4     // Catch: java.lang.Throwable -> L34
            r2.Z = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.o(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r3) goto L7d
        L7c:
            return r3
        L7d:
            int r8 = r1.L     // Catch: java.lang.Throwable -> L34
            if (r4 != r8) goto L53
            goto L44
        L82:
            r7.E(r8)
            throw r8
    }

    public static final void e(defpackage.s9 r4, me.magnum.melonds.domain.model.VideoRenderer r5) {
            java.lang.Object r0 = r4.a
            jq r0 = (defpackage.jq) r0
            int[] r1 = defpackage.bx1.a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            r1 = 1
            if (r5 == r1) goto L25
            r1 = 2
            if (r5 == r1) goto L22
            r1 = 3
            if (r5 == r1) goto L1f
            r1 = 4
            if (r5 != r1) goto L1b
            java.lang.String r5 = "Compute"
            goto L27
        L1b:
            defpackage.i.d()
            return
        L1f:
            java.lang.String r5 = "Vulkan"
            goto L27
        L22:
            java.lang.String r5 = "OpenGL"
            goto L27
        L25:
            java.lang.String r5 = "Software"
        L27:
            zb r1 = new zb
            r1.<init>(r0)
            java.lang.Object r2 = r1.L
            wb r2 = (defpackage.wb) r2
            r3 = 2131952442(0x7f13033a, float:1.9541327E38)
            r1.z(r3)
            r3 = 2131952441(0x7f130339, float:1.9541325E38)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = r0.getString(r3, r5)
            r2.f = r5
            xw1 r5 = new xw1
            r0 = 10
            r5.<init>(r4, r0)
            r0 = 2131952616(0x7f1303e8, float:1.954168E38)
            r1.y(r0, r5)
            xw1 r5 = new xw1
            r0 = 0
            r5.<init>(r4, r0)
            r3 = 2131951750(0x7f130086, float:1.9539923E38)
            r1.x(r3, r5)
            yw1 r5 = new yw1
            r5.<init>(r4, r0)
            r2.n = r5
            r1.B()
            return
    }

    public static final void f(defpackage.s9 r7, me.magnum.melonds.domain.model.VideoRenderer r8) {
            java.lang.Object r0 = r7.a
            jq r0 = (defpackage.jq) r0
            int[] r1 = defpackage.bx1.a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            r1 = 1
            r2 = 4
            r3 = 3
            r4 = 2
            if (r8 == r1) goto L25
            if (r8 == r4) goto L22
            if (r8 == r3) goto L1f
            if (r8 != r2) goto L1b
            java.lang.String r8 = "Compute"
            goto L27
        L1b:
            defpackage.i.d()
            return
        L1f:
            java.lang.String r8 = "Vulkan"
            goto L27
        L22:
            java.lang.String r8 = "OpenGL"
            goto L27
        L25:
            java.lang.String r8 = "Software"
        L27:
            zb r1 = new zb
            r1.<init>(r0)
            java.lang.Object r5 = r1.L
            wb r5 = (defpackage.wb) r5
            r6 = 2131952444(0x7f13033c, float:1.954133E38)
            r1.z(r6)
            r6 = 2131952443(0x7f13033b, float:1.9541329E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r8 = r0.getString(r6, r8)
            r5.f = r8
            xw1 r8 = new xw1
            r8.<init>(r7, r3)
            r0 = 2131952616(0x7f1303e8, float:1.954168E38)
            r1.y(r0, r8)
            xw1 r8 = new xw1
            r8.<init>(r7, r2)
            r0 = 2131951750(0x7f130086, float:1.9539923E38)
            r1.x(r0, r8)
            yw1 r8 = new yw1
            r8.<init>(r7, r4)
            r5.n = r8
            r1.B()
            return
    }

    public defpackage.vw1 A() {
            r0 = this;
            java.lang.Object r0 = r0.c
            uo7 r0 = (defpackage.uo7) r0
            java.lang.Object r0 = r0.getValue()
            vw1 r0 = (defpackage.vw1) r0
            return r0
    }

    public void B(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            java.lang.Object r0 = r0.c
            ww2 r0 = (defpackage.ww2) r0
            r0.getClass()
            defpackage.ft7.c(r1)
            defpackage.ft7.d(r2, r1)
            r0.r(r1)
            defpackage.ft7.a(r0, r1, r2)
            return
    }

    public int C(int r3, int r4) {
            r2 = this;
        L0:
            if (r3 <= r4) goto L3d
            java.lang.Object r0 = r2.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.CharSequence r0 = r0.getText()
            int r1 = r3 + (-1)
            char r0 = r0.charAt(r1)
            r1 = 32
            if (r0 == r1) goto L3a
            r1 = 10
            if (r0 == r1) goto L3a
            r1 = 5760(0x1680, float:8.071E-42)
            if (r0 == r1) goto L3a
            r1 = 8192(0x2000, float:1.148E-41)
            int r1 = defpackage.nb3.p(r0, r1)
            if (r1 < 0) goto L30
            r1 = 8202(0x200a, float:1.1493E-41)
            int r1 = defpackage.nb3.p(r0, r1)
            if (r1 > 0) goto L30
            r1 = 8199(0x2007, float:1.1489E-41)
            if (r0 != r1) goto L3a
        L30:
            r1 = 8287(0x205f, float:1.1613E-41)
            if (r0 == r1) goto L3a
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L39
            goto L3a
        L39:
            return r3
        L3a:
            int r3 = r3 + (-1)
            goto L0
        L3d:
            return r3
    }

    public void D(java.lang.String r3, defpackage.mk5 r4) {
            r2 = this;
            r3.getClass()
            int r0 = r3.length()
            if (r0 <= 0) goto L5d
            java.lang.String r0 = "method "
            if (r4 != 0) goto L48
            java.lang.String r1 = "POST"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "PUT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "PATCH"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "PROPPATCH"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "QUERY"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            java.lang.String r1 = "REPORT"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3e
            goto L4e
        L3e:
            java.lang.String r2 = " must have a request body."
            java.lang.String r2 = defpackage.lb1.A(r0, r3, r2)
            defpackage.i.f(r2)
            return
        L48:
            boolean r1 = defpackage.ii2.J(r3)
            if (r1 == 0) goto L53
        L4e:
            r2.b = r3
            r2.d = r4
            return
        L53:
            java.lang.String r2 = " must not have a request body."
            java.lang.String r2 = defpackage.lb1.A(r0, r3, r2)
            defpackage.i.f(r2)
            return
        L5d:
            java.lang.String r2 = "method.isEmpty() == true"
            defpackage.i.h(r2)
            return
    }

    public void E(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.e
            pu r0 = (defpackage.pu) r0
            java.lang.Object r1 = r3.d
            v80 r1 = (defpackage.v80) r1
            r2 = 0
            boolean r4 = r1.k(r4, r2)
            if (r4 == 0) goto L37
            java.lang.Object r4 = r1.m()
        L13:
            boolean r2 = r4 instanceof defpackage.fm0
            if (r2 != 0) goto L22
            defpackage.gm0.b(r4)
            r0.addLast(r4)
            java.lang.Object r4 = r1.m()
            goto L13
        L22:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L37
            java.lang.Object r3 = r3.a
            qn2 r3 = (defpackage.qn2) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3.g(r4)
            r0.clear()
        L37:
            return
    }

    public void F() {
            r4 = this;
            java.lang.Object r0 = r4.a
            short[] r0 = (short[]) r0
            defpackage.ao4.e(r0)
            r0 = 0
            r1 = r0
        L9:
            java.lang.Object r2 = r4.b
            short[][] r2 = (short[][]) r2
            int r3 = r2.length
            if (r1 >= r3) goto L18
            r2 = r2[r1]
            defpackage.ao4.e(r2)
            int r1 = r1 + 1
            goto L9
        L18:
            java.lang.Object r1 = r4.c
            short[][] r1 = (short[][]) r1
            int r2 = r1.length
            if (r0 >= r2) goto L27
            r1 = r1[r0]
            defpackage.ao4.e(r1)
            int r0 = r0 + 1
            goto L18
        L27:
            java.lang.Object r4 = r4.d
            short[] r4 = (short[]) r4
            defpackage.ao4.e(r4)
            return
    }

    public void G(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            r3.getClass()
            java.lang.Object r0 = r1.a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.put(r3, r2)
            java.lang.Object r0 = r1.c
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r3)
            tp6 r0 = (defpackage.tp6) r0
            if (r0 == 0) goto L19
            r0.l(r2)
        L19:
            java.lang.Object r1 = r1.d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r3)
            tp6 r1 = (defpackage.tp6) r1
            if (r1 == 0) goto L28
            r1.l(r2)
        L28:
            return
    }

    public boolean H(defpackage.at2 r1) {
            r0 = this;
            java.lang.Object r0 = r0.d
            v80 r0 = (defpackage.v80) r0
            java.lang.Object r0 = r0.c(r1)
            boolean r0 = r0 instanceof defpackage.fm0
            r0 = r0 ^ 1
            return r0
    }

    public void I(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "ws:"
            r1 = 1
            boolean r0 = defpackage.xs6.g0(r3, r0, r1)
            if (r0 == 0) goto L18
            r0 = 3
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = "http:"
            java.lang.String r3 = r0.concat(r3)
            goto L2b
        L18:
            java.lang.String r0 = "wss:"
            boolean r0 = defpackage.xs6.g0(r3, r0, r1)
            if (r0 == 0) goto L2b
            r0 = 4
            java.lang.String r3 = r3.substring(r0)
            java.lang.String r0 = "https:"
            java.lang.String r3 = r0.concat(r3)
        L2b:
            h03 r0 = new h03
            r1 = 0
            r0.<init>(r1)
            r1 = 0
            r0.e(r1, r3)
            i03 r3 = r0.b()
            r2.a = r3
            return
    }

    public void J() {
            r5 = this;
            java.lang.Object r0 = r5.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L35
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            gc4 r3 = (defpackage.gc4) r3
            int r3 = r3.a
            ic4 r4 = r5.u(r3)
            if (r4 == 0) goto L1c
            goto L9
        L1c:
            int r0 = defpackage.ic4.X
            java.lang.Object r0 = r5.b
            rh r0 = (defpackage.rh) r0
            java.lang.String r0 = defpackage.mp2.C(r0, r3)
            java.lang.String r1 = "Navigation destination "
            java.lang.String r2 = " cannot be found in the navigation graph "
            java.lang.StringBuilder r0 = defpackage.i61.t(r1, r0, r2)
            java.lang.Object r5 = r5.d
            mc4 r5 = (defpackage.mc4) r5
            defpackage.i.j(r0, r5)
        L35:
            return
    }

    @Override // defpackage.as4
    public boolean a() {
            r4 = this;
            java.lang.Object r4 = r4.e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L1f
            java.lang.Object r3 = r4.get(r2)
            zr4 r3 = (defpackage.zr4) r3
            gj r3 = r3.a
            boolean r3 = r3.a()
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto La
        L1f:
            return r1
    }

    @Override // defpackage.as4
    public float b() {
            r0 = this;
            java.lang.Object r0 = r0.c
            go3 r0 = (defpackage.go3) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }

    @Override // defpackage.as4
    public float c() {
            r0 = this;
            java.lang.Object r0 = r0.d
            go3 r0 = (defpackage.go3) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }

    public void g(defpackage.s90 r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Object r1 = r1.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            vr4 r0 = new vr4
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    public void h(defpackage.ka2 r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Object r1 = r1.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            vr4 r0 = new vr4
            r0.<init>(r2, r3)
            r1.add(r0)
            return
    }

    public defpackage.tj0 i(defpackage.vz r8, defpackage.on2 r9) {
            r7 = this;
            bh5 r0 = new bh5
            r0.<init>()
            r1 = -1
            r0.A = r1
            java.lang.Object r1 = r7.a
            monitor-enter(r1)
            java.lang.Object r2 = r7.b     // Catch: java.lang.Throwable -> L18
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L1b
            r8.b(r2)     // Catch: java.lang.Throwable -> L18
            i r7 = defpackage.xd5.X     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return r7
        L18:
            r7 = move-exception
            goto L9d
        L1b:
            java.lang.Object r2 = r7.c     // Catch: java.lang.Throwable -> L18
            vw r2 = (defpackage.vw) r2     // Catch: java.lang.Throwable -> L18
        L1f:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L18
            int r4 = r3 + 1
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1f
            r2 = 134217727(0x7ffffff, float:3.8518597E-34)
            r2 = r2 & r4
            r3 = 1
            r5 = 0
            if (r2 != r3) goto L35
            r2 = r3
            goto L36
        L35:
            r2 = r5
        L36:
            int r4 = r4 >>> 27
            r4 = r4 & 15
            r0.A = r4     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r7.d     // Catch: java.lang.Throwable -> L18
            ca4 r4 = (defpackage.ca4) r4     // Catch: java.lang.Throwable -> L18
            r4.a(r8)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            if (r2 == 0) goto L91
            if (r9 == 0) goto L91
            r9.c()     // Catch: java.lang.Throwable -> L4c
            goto L91
        L4c:
            r9 = move-exception
            java.lang.Object r1 = r7.a
            monitor-enter(r1)
            java.lang.Object r2 = r7.b     // Catch: java.lang.Throwable -> L6e
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L58
        L56:
            monitor-exit(r1)
            goto L91
        L58:
            r7.b = r9     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r7.d     // Catch: java.lang.Throwable -> L6e
            ca4 r2 = (defpackage.ca4) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object[] r4 = r2.a     // Catch: java.lang.Throwable -> L6e
            int r2 = r2.b     // Catch: java.lang.Throwable -> L6e
        L62:
            if (r5 >= r2) goto L70
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L6e
            vz r6 = (defpackage.vz) r6     // Catch: java.lang.Throwable -> L6e
            r6.b(r9)     // Catch: java.lang.Throwable -> L6e
            int r5 = r5 + 1
            goto L62
        L6e:
            r7 = move-exception
            goto L8f
        L70:
            java.lang.Object r9 = r7.d     // Catch: java.lang.Throwable -> L6e
            ca4 r9 = (defpackage.ca4) r9     // Catch: java.lang.Throwable -> L6e
            r9.d()     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r9 = r7.c     // Catch: java.lang.Throwable -> L6e
            vw r9 = (defpackage.vw) r9     // Catch: java.lang.Throwable -> L6e
        L7b:
            int r2 = r9.get()     // Catch: java.lang.Throwable -> L6e
            int r4 = r2 >>> 27
            r4 = r4 & 15
            int r4 = r4 + r3
            r4 = r4 & 15
            int r4 = r4 << 27
            boolean r2 = r9.compareAndSet(r2, r4)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L7b
            goto L56
        L8f:
            monitor-exit(r1)
            throw r7
        L91:
            ap3 r9 = new ap3
            u6 r1 = new u6
            r2 = 2
            r1.<init>(r8, r7, r0, r2)
            r9.<init>(r1)
            return r9
        L9d:
            monitor-exit(r1)
            throw r7
    }

    public java.text.Bidi j(int r15) {
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.z(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
    }

    public defpackage.wy k() {
            r8 = this;
            java.lang.Object r0 = r8.a
            ig1 r0 = (defpackage.ig1) r0
            if (r0 != 0) goto L9
            java.lang.String r0 = " surface"
            goto Lb
        L9:
            java.lang.String r0 = ""
        Lb:
            java.lang.Object r1 = r8.b
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L17
            java.lang.String r1 = " sharedSurfaces"
            java.lang.String r0 = r0.concat(r1)
        L17:
            java.lang.Object r1 = r8.c
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L23
            java.lang.String r1 = " mirrorMode"
            java.lang.String r0 = r0.concat(r1)
        L23:
            java.lang.Object r1 = r8.d
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L2f
            java.lang.String r1 = " surfaceGroupId"
            java.lang.String r0 = r0.concat(r1)
        L2f:
            java.lang.Object r1 = r8.e
            yq1 r1 = (defpackage.yq1) r1
            if (r1 != 0) goto L3b
            java.lang.String r1 = " dynamicRange"
            java.lang.String r0 = r0.concat(r1)
        L3b:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L66
            wy r2 = new wy
            java.lang.Object r0 = r8.a
            r3 = r0
            ig1 r3 = (defpackage.ig1) r3
            java.lang.Object r0 = r8.b
            r4 = r0
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r8.c
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r8.d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r6 = r0.intValue()
            java.lang.Object r8 = r8.e
            r7 = r8
            yq1 r7 = (defpackage.yq1) r7
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L66:
            java.lang.String r8 = "Missing required properties:"
            java.lang.String r8 = r8.concat(r0)
            defpackage.i.m(r8)
            r8 = 0
            return r8
    }

    public void l(defpackage.ma0 r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r3 = r3.toString()
            int r0 = r3.length()
            java.lang.String r1 = "Cache-Control"
            if (r0 != 0) goto L17
            java.lang.Object r2 = r2.c
            ww2 r2 = (defpackage.ww2) r2
            r2.r(r1)
            return
        L17:
            r2.B(r1, r3)
            return
    }

    public java.lang.Object m(defpackage.pq5 r20, defpackage.s41 r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.d
            fg r3 = (defpackage.fg) r3
            boolean r4 = r2 instanceof defpackage.pw1
            if (r4 == 0) goto L1d
            r4 = r2
            pw1 r4 = (defpackage.pw1) r4
            int r5 = r4.f0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.f0 = r5
            goto L22
        L1d:
            pw1 r4 = new pw1
            r4.<init>(r0, r2)
        L22:
            java.lang.Object r2 = r4.d0
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r4.f0
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r13 = 0
            r14 = 1
            r15 = 0
            if (r6 == 0) goto L88
            if (r6 == r14) goto L84
            if (r6 == r10) goto L77
            if (r6 == r9) goto L69
            if (r6 == r8) goto L52
            if (r6 != r7) goto L4c
            long r0 = r4.Y
            pq5 r4 = r4.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L49
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L15c
        L49:
            r0 = move-exception
            goto L1b3
        L4c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r15
        L52:
            int r0 = r4.Z
            long r8 = r4.Y
            pq5 r1 = r4.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L49
            r6 = r1
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r18 = r2
            r2 = r0
            r0 = r8
            r8 = r18
            goto L144
        L69:
            long r0 = r4.Y
            pq5 r6 = r4.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L49
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L107
        L77:
            lx5 r0 = r4.X
            pq5 r1 = r4.R
            defpackage.oi2.Y(r2)
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto Lce
        L84:
            defpackage.oi2.Y(r2)
            return r2
        L88:
            defpackage.oi2.Y(r2)
            boolean r2 = r1.c()
            android.net.Uri r6 = r1.d
            if (r2 != 0) goto L1b7
            java.lang.String r2 = r6.getScheme()
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            java.lang.String r11 = "dsiware-installed"
            boolean r2 = defpackage.nb3.k(r2, r11)
            if (r2 == 0) goto La6
            goto L1b7
        La6:
            java.lang.Object r0 = r0.c
            mp r0 = (defpackage.mp) r0
            pw5 r0 = r0.b(r6)
            if (r0 == 0) goto Lb5
            lx5 r0 = r0.a(r1)
            goto Lb6
        Lb5:
            r0 = r15
        Lb6:
            if (r0 != 0) goto Lc0
            sx5 r0 = new sx5
            rx5 r1 = defpackage.rx5.f
            r0.<init>(r1)
            return r0
        Lc0:
            r4.R = r1
            r4.X = r0
            r4.f0 = r10
            java.lang.Enum r2 = r3.i(r4)
            if (r2 != r5) goto Lce
            goto L1c1
        Lce:
            mm4 r2 = (defpackage.mm4) r2
            boolean r2 = r2.isFailure()
            if (r2 == 0) goto Lde
            sx5 r0 = new sx5
            rx5 r1 = defpackage.rx5.e
            r0.<init>(r1)
            return r0
        Lde:
            java.lang.String r0 = r0.a
            byte[] r0 = defpackage.xs6.X(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r2)
            int r0 = r0.getInt()
            long r10 = (long) r0
            long r10 = r10 & r16
            r4.R = r1     // Catch: java.lang.Throwable -> L49
            r4.X = r15     // Catch: java.lang.Throwable -> L49
            r4.Y = r10     // Catch: java.lang.Throwable -> L49
            r4.f0 = r9     // Catch: java.lang.Throwable -> L49
            java.io.Serializable r2 = r3.h(r4)     // Catch: java.lang.Throwable -> L49
            if (r2 != r5) goto L105
            goto L1c1
        L105:
            r6 = r1
            r0 = r10
        L107:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L113
            boolean r9 = r2.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto L113
        L111:
            r2 = r13
            goto L12e
        L113:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L49
        L117:
            boolean r9 = r2.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r9 == 0) goto L111
            java.lang.Object r9 = r2.next()     // Catch: java.lang.Throwable -> L49
            me.magnum.melonds.domain.model.DSiWareTitle r9 = (me.magnum.melonds.domain.model.DSiWareTitle) r9     // Catch: java.lang.Throwable -> L49
            long r9 = r9.getTitleId()     // Catch: java.lang.Throwable -> L49
            long r9 = r9 & r16
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L117
            r2 = r14
        L12e:
            if (r2 != 0) goto L18a
            android.net.Uri r9 = r6.d     // Catch: java.lang.Throwable -> L49
            r4.R = r6     // Catch: java.lang.Throwable -> L49
            r4.X = r15     // Catch: java.lang.Throwable -> L49
            r4.Y = r0     // Catch: java.lang.Throwable -> L49
            r4.Z = r2     // Catch: java.lang.Throwable -> L49
            r4.f0 = r8     // Catch: java.lang.Throwable -> L49
            java.lang.Enum r8 = r3.f(r9, r4)     // Catch: java.lang.Throwable -> L49
            if (r8 != r5) goto L144
            goto L1c1
        L144:
            t33 r8 = (defpackage.t33) r8     // Catch: java.lang.Throwable -> L49
            t33 r9 = defpackage.t33.SUCCESS     // Catch: java.lang.Throwable -> L49
            if (r8 != r9) goto L188
            r4.R = r6     // Catch: java.lang.Throwable -> L49
            r4.X = r15     // Catch: java.lang.Throwable -> L49
            r4.Y = r0     // Catch: java.lang.Throwable -> L49
            r4.Z = r2     // Catch: java.lang.Throwable -> L49
            r4.f0 = r7     // Catch: java.lang.Throwable -> L49
            java.io.Serializable r2 = r3.h(r4)     // Catch: java.lang.Throwable -> L49
            if (r2 != r5) goto L15b
            goto L1c1
        L15b:
            r4 = r6
        L15c:
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L49
            boolean r5 = r2 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L16c
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L16c
            goto L18c
        L16c:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L49
        L170:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L18c
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L49
            me.magnum.melonds.domain.model.DSiWareTitle r5 = (me.magnum.melonds.domain.model.DSiWareTitle) r5     // Catch: java.lang.Throwable -> L49
            long r5 = r5.getTitleId()     // Catch: java.lang.Throwable -> L49
            long r5 = r5 & r16
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L170
        L186:
            r13 = r14
            goto L18c
        L188:
            r4 = r6
            goto L18c
        L18a:
            r4 = r6
            goto L186
        L18c:
            r3.b()
            if (r13 != 0) goto L199
            sx5 r0 = new sx5
            rx5 r1 = defpackage.rx5.g
            r0.<init>(r1)
            return r0
        L199:
            vx5 r2 = new vx5
            java.lang.Long r14 = new java.lang.Long
            r14.<init>(r0)
            r15 = 6143(0x17ff, float:8.608E-42)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            pq5 r0 = defpackage.pq5.a(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            r2.<init>(r0)
            return r2
        L1b3:
            r3.b()
            throw r0
        L1b7:
            r4.R = r15
            r4.f0 = r14
            java.lang.Object r0 = r0.o(r1, r4)
            if (r0 != r5) goto L1c2
        L1c1:
            return r5
        L1c2:
            return r0
    }

    public java.lang.Object n(me.magnum.melonds.domain.model.ConsoleType r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qw1
            if (r0 == 0) goto L13
            r0 = r8
            qw1 r0 = (defpackage.qw1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qw1 r0 = new qw1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            me.magnum.melonds.domain.model.ConsoleType r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L30:
            defpackage.oi2.Y(r8)
            java.lang.Object r8 = r6.e
            kd6 r8 = (defpackage.kd6) r8
            ng6 r8 = (defpackage.ng6) r8
            me.magnum.melonds.domain.model.VideoRenderer r8 = r8.e()
            r0.R = r7
            r0.Z = r4
            me.magnum.melonds.domain.model.VideoRenderer r2 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r8 == r2) goto L47
            r8 = r3
            goto L53
        L47:
            xe1 r8 = defpackage.xk1.a
            xd1 r2 = new xd1
            r5 = 4
            r2.<init>(r6, r3, r5)
            java.lang.Object r8 = defpackage.hv.d0(r8, r2, r0)
        L53:
            if (r8 != r1) goto L56
            return r1
        L56:
            nw1 r8 = (defpackage.nw1) r8
            if (r8 == 0) goto L7b
            int[] r6 = defpackage.ow1.a
            int r7 = r8.ordinal()
            r6 = r6[r7]
            if (r6 == r4) goto L73
            r7 = 2
            if (r6 != r7) goto L6f
            vc2 r6 = new vc2
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r6.<init>(r7)
            return r6
        L6f:
            defpackage.i.d()
            return r3
        L73:
            wc2 r6 = new wc2
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r6.<init>(r7)
            return r6
        L7b:
            java.lang.Object r6 = r6.b
            fb2 r6 = (defpackage.fb2) r6
            dz0 r6 = r6.b(r7)
            cz0 r8 = r6.b
            cz0 r0 = defpackage.cz0.VALID
            if (r8 == r0) goto L8f
            uc2 r7 = new uc2
            r7.<init>(r6)
            return r7
        L8f:
            xc2 r6 = new xc2
            r6.<init>(r7)
            return r6
    }

    public java.lang.Object o(defpackage.pq5 r10, defpackage.s41 r11) {
            r9 = this;
            java.lang.Object r0 = r9.d
            fg r0 = (defpackage.fg) r0
            boolean r1 = r11 instanceof defpackage.rw1
            if (r1 == 0) goto L17
            r1 = r11
            rw1 r1 = (defpackage.rw1) r1
            int r2 = r1.d0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d0 = r2
            goto L1c
        L17:
            rw1 r1 = new rw1
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r9 = r1.Y
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.d0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L35
            long r10 = r1.X
            pq5 r1 = r1.R
            defpackage.oi2.Y(r9)     // Catch: java.lang.Throwable -> L32
            goto L7b
        L32:
            r9 = move-exception
            goto Lbf
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L3c:
            long r5 = r1.X
            pq5 r10 = r1.R
            defpackage.oi2.Y(r9)
            goto L5c
        L44:
            defpackage.oi2.Y(r9)
            java.lang.Long r9 = r10.l
            if (r9 == 0) goto Lc3
            long r5 = r9.longValue()
            r1.R = r10
            r1.X = r5
            r1.d0 = r4
            java.lang.Enum r9 = r0.i(r1)
            if (r9 != r11) goto L5c
            goto L78
        L5c:
            mm4 r9 = (defpackage.mm4) r9
            boolean r9 = r9.isFailure()
            if (r9 == 0) goto L6c
            sx5 r9 = new sx5
            rx5 r10 = defpackage.rx5.e
            r9.<init>(r10)
            return r9
        L6c:
            r1.R = r10     // Catch: java.lang.Throwable -> L32
            r1.X = r5     // Catch: java.lang.Throwable -> L32
            r1.d0 = r3     // Catch: java.lang.Throwable -> L32
            java.io.Serializable r9 = r0.h(r1)     // Catch: java.lang.Throwable -> L32
            if (r9 != r11) goto L79
        L78:
            return r11
        L79:
            r1 = r10
            r10 = r5
        L7b:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L32
            boolean r2 = r9 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 == 0) goto L8d
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L32
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L8d
        L8b:
            r4 = r3
            goto Lac
        L8d:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L32
        L91:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L32
            me.magnum.melonds.domain.model.DSiWareTitle r2 = (me.magnum.melonds.domain.model.DSiWareTitle) r2     // Catch: java.lang.Throwable -> L32
            long r5 = r2.getTitleId()     // Catch: java.lang.Throwable -> L32
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r7 = r7 & r10
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L91
        Lac:
            r0.b()
            if (r4 != 0) goto Lb9
            sx5 r9 = new sx5
            rx5 r10 = defpackage.rx5.g
            r9.<init>(r10)
            return r9
        Lb9:
            vx5 r9 = new vx5
            r9.<init>(r1)
            return r9
        Lbf:
            r0.b()
            throw r9
        Lc3:
            sx5 r9 = new sx5
            rx5 r10 = defpackage.rx5.f
            r9.<init>(r10)
            return r9
    }

    public java.lang.Object p(defpackage.pq5 r9, defpackage.s41 r10) {
            r8 = this;
            java.lang.Object r0 = r8.e
            kd6 r0 = (defpackage.kd6) r0
            boolean r1 = r10 instanceof defpackage.sw1
            if (r1 == 0) goto L17
            r1 = r10
            sw1 r1 = (defpackage.sw1) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.Z = r2
            goto L1c
        L17:
            sw1 r1 = new sw1
            r1.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r1.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Z
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            defpackage.oi2.Y(r10)
            goto L9c
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r6
        L35:
            pq5 r9 = r1.R
            defpackage.oi2.Y(r10)
            goto L69
        L3b:
            defpackage.oi2.Y(r10)
            jt5 r10 = r9.f
            r3 = r0
            ng6 r3 = (defpackage.ng6) r3
            r10.getClass()
            me.magnum.melonds.domain.model.VideoRenderer r10 = r10.i
            me.magnum.melonds.domain.model.VideoRenderer r7 = r3.e()
            me.magnum.melonds.domain.model.VideoRenderer r10 = r3.J(r10, r7)
            r1.R = r9
            r1.Z = r5
            me.magnum.melonds.domain.model.VideoRenderer r3 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r10 == r3) goto L5a
            r10 = r6
            goto L66
        L5a:
            xe1 r10 = defpackage.xk1.a
            xd1 r3 = new xd1
            r7 = 4
            r3.<init>(r8, r6, r7)
            java.lang.Object r10 = defpackage.hv.d0(r10, r3, r1)
        L66:
            if (r10 != r2) goto L69
            goto L9b
        L69:
            nw1 r10 = (defpackage.nw1) r10
            if (r10 == 0) goto L8d
            int[] r8 = defpackage.ow1.a
            int r9 = r10.ordinal()
            r8 = r8[r9]
            if (r8 == r5) goto L85
            if (r8 != r4) goto L81
            tx5 r8 = new tx5
            me.magnum.melonds.domain.model.VideoRenderer r9 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r8.<init>(r9)
            return r8
        L81:
            defpackage.i.d()
            return r6
        L85:
            ux5 r8 = new ux5
            me.magnum.melonds.domain.model.VideoRenderer r9 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            r8.<init>(r9)
            return r8
        L8d:
            boolean r10 = r9.h
            if (r10 == 0) goto La7
            r1.R = r6
            r1.Z = r4
            java.lang.Object r10 = r8.m(r9, r1)
            if (r10 != r2) goto L9c
        L9b:
            return r2
        L9c:
            wx5 r10 = (defpackage.wx5) r10
            boolean r9 = r10 instanceof defpackage.vx5
            if (r9 != 0) goto La3
            return r10
        La3:
            vx5 r10 = (defpackage.vx5) r10
            pq5 r9 = r10.a
        La7:
            ng6 r0 = (defpackage.ng6) r0
            boolean r10 = r0.Q()
            r1 = 0
            if (r10 != 0) goto Lc6
            jt5 r10 = r9.f
            u26 r10 = r10.a
            u26 r2 = defpackage.u26.DEFAULT
            if (r10 != r2) goto Lc6
            dz0 r8 = new dz0
            me.magnum.melonds.domain.model.ConsoleType r10 = me.magnum.melonds.domain.model.ConsoleType.DS
            cz0 r0 = defpackage.cz0.VALID
            java.lang.String[] r2 = new java.lang.String[r1]
            vr4[] r1 = new defpackage.vr4[r1]
            r8.<init>(r10, r0, r2, r1)
            goto Lf2
        Lc6:
            jt5 r10 = r9.f
            u26 r10 = r10.a
            me.magnum.melonds.domain.model.ConsoleType r10 = r10.getTargetConsoleType()
            if (r10 != 0) goto Ld4
            me.magnum.melonds.domain.model.ConsoleType r10 = r0.f()
        Ld4:
            boolean r0 = r0.Q()
            if (r0 != 0) goto Lea
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DS
            if (r10 != r0) goto Lea
            dz0 r8 = new dz0
            cz0 r10 = defpackage.cz0.VALID
            java.lang.String[] r2 = new java.lang.String[r1]
            vr4[] r1 = new defpackage.vr4[r1]
            r8.<init>(r0, r10, r2, r1)
            goto Lf2
        Lea:
            java.lang.Object r8 = r8.b
            fb2 r8 = (defpackage.fb2) r8
            dz0 r8 = r8.b(r10)
        Lf2:
            cz0 r10 = r8.b
            cz0 r0 = defpackage.cz0.VALID
            if (r10 == r0) goto Lfe
            qx5 r9 = new qx5
            r9.<init>(r8)
            return r9
        Lfe:
            vx5 r8 = new vx5
            r8.<init>(r9)
            return r8
    }

    public defpackage.xc0 q(defpackage.me0 r10, java.util.Map r11, java.util.Map r12) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            r12.getClass()
            xc0 r0 = new xc0
            java.lang.Object r1 = r9.a
            r2 = r1
            t57 r2 = (defpackage.t57) r2
            java.lang.Object r1 = r9.b
            kf0 r1 = (defpackage.kf0) r1
            int r3 = r1.i
            java.lang.Object r4 = r9.c
            r6 = r4
            jr6 r6 = (defpackage.jr6) r6
            java.lang.Object r4 = r9.e
            r7 = r4
            ks6 r7 = (defpackage.ks6) r7
            java.lang.Object r9 = r9.d
            nd0 r9 = (defpackage.nd0) r9
            r9.getClass()
            ks6 r4 = r9.b
            r4.getClass()
            mf0 r4 = r1.o
            r4.getClass()
            kg0 r4 = defpackage.lg0.g
            ld0 r9 = r9.a
            java.lang.String r1 = r1.a
            lg0 r9 = r9.d(r1)
            r4.getClass()
            boolean r8 = defpackage.kg0.c(r9)
            r1 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public void r(defpackage.eg0 r11, defpackage.eg0 r12, defpackage.qv6 r13, defpackage.qv6 r14, java.util.Map.Entry r15) {
            r10 = this;
            java.lang.Object r0 = r15.getValue()
            r2 = r0
            qv6 r2 = (defpackage.qv6) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "     -> outputEdge = "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DualSurfaceProcessorNode"
            defpackage.kj2.t(r1, r0)
            yy r0 = r13.g
            android.util.Size r4 = r0.a
            java.lang.Object r0 = r15.getKey()
            ay r0 = (defpackage.ay) r0
            ry r0 = r0.a
            android.graphics.Rect r5 = r0.d
            boolean r13 = r13.c
            r0 = 0
            if (r13 == 0) goto L2f
            r6 = r11
            goto L30
        L2f:
            r6 = r0
        L30:
            java.lang.Object r11 = r15.getKey()
            ay r11 = (defpackage.ay) r11
            ry r11 = r11.a
            int r7 = r11.f
            java.lang.Object r11 = r15.getKey()
            ay r11 = (defpackage.ay) r11
            ry r11 = r11.a
            boolean r8 = r11.g
            zy r3 = new zy
            r3.<init>(r4, r5, r6, r7, r8)
            yy r11 = r14.g
            android.util.Size r5 = r11.a
            java.lang.Object r11 = r15.getKey()
            ay r11 = (defpackage.ay) r11
            ry r11 = r11.b
            android.graphics.Rect r6 = r11.d
            boolean r11 = r14.c
            if (r11 == 0) goto L5d
            r7 = r12
            goto L5e
        L5d:
            r7 = r0
        L5e:
            java.lang.Object r11 = r15.getKey()
            ay r11 = (defpackage.ay) r11
            ry r11 = r11.b
            int r8 = r11.f
            java.lang.Object r11 = r15.getKey()
            ay r11 = (defpackage.ay) r11
            ry r11 = r11.b
            boolean r9 = r11.g
            zy r4 = new zy
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = r15.getKey()
            ay r11 = (defpackage.ay) r11
            ry r11 = r11.a
            int r11 = r11.c
            r2.getClass()
            defpackage.nj2.h()
            r2.a()
            boolean r12 = r2.j
            r13 = 1
            r12 = r12 ^ r13
            java.lang.String r14 = "Consumer can only be linked once."
            defpackage.np2.A(r14, r12)
            r2.j = r13
            r5 = r3
            pv6 r3 = r2.l
            gx3 r12 = r3.c()
            ov6 r1 = new ov6
            r6 = r4
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            ov2 r11 = defpackage.u24.x()
            ll0 r11 = defpackage.l.T(r12, r1, r11)
            yc1 r12 = new yc1
            r13 = 0
            r12.<init>(r10, r2, r13)
            ov2 r10 = defpackage.u24.x()
            uo2 r14 = new uo2
            r14.<init>(r13, r11, r12)
            r11.a(r10, r14)
            return
    }

    public defpackage.rz6 s() {
            r15 = this;
            java.lang.Object r0 = r15.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r15.c
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r2 = r15.d
            mc4 r2 = (defpackage.mc4) r2
            r3 = 0
            if (r2 == 0) goto Lb8
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Lb2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r0.size()
            r7 = 0
            r8 = r3
            r9 = r7
        L26:
            if (r9 >= r6) goto L65
            java.lang.Object r10 = r0.get(r9)
            int r9 = r9 + 1
            gc4 r10 = (defpackage.gc4) r10
            int r11 = r10.a
            android.os.Bundle r10 = r10.b
            ic4 r12 = r15.u(r11)
            if (r12 == 0) goto L53
            int[] r8 = r12.b(r8)
            int r11 = r8.length
            r13 = r7
        L40:
            if (r13 >= r11) goto L51
            r14 = r8[r13]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r4.add(r14)
            r5.add(r10)
            int r13 = r13 + 1
            goto L40
        L51:
            r8 = r12
            goto L26
        L53:
            int r0 = defpackage.ic4.X
            java.lang.Object r15 = r15.b
            rh r15 = (defpackage.rh) r15
            java.lang.String r15 = defpackage.mp2.C(r15, r11)
            java.lang.String r0 = "Navigation destination "
            java.lang.String r1 = " cannot be found in the navigation graph "
            defpackage.fa6.f(r0, r15, r1, r2)
            return r3
        L65:
            int[] r0 = defpackage.gt0.j1(r4)
            java.lang.String r2 = "android-support-nav:controller:deepLinkIds"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "android-support-nav:controller:deepLinkArgs"
            r1.putParcelableArrayListExtra(r0, r5)
            java.lang.Object r15 = r15.a
            android.content.Context r15 = (android.content.Context) r15
            rz6 r0 = new rz6
            r0.<init>(r15)
            android.content.Intent r15 = new android.content.Intent
            r15.<init>(r1)
            android.content.ComponentName r2 = r15.getComponent()
            if (r2 != 0) goto L91
            android.content.Context r2 = r0.B
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r15.resolveActivity(r2)
        L91:
            if (r2 == 0) goto L96
            r0.a(r2)
        L96:
            java.util.ArrayList r2 = r0.A
            r2.add(r15)
            int r15 = r2.size()
        L9f:
            if (r7 >= r15) goto Lb1
            java.lang.Object r3 = r2.get(r7)
            android.content.Intent r3 = (android.content.Intent) r3
            if (r3 == 0) goto Lae
            java.lang.String r4 = "android-support-nav:controller:deepLinkIntent"
            r3.putExtra(r4, r1)
        Lae:
            int r7 = r7 + 1
            goto L9f
        Lb1:
            return r0
        Lb2:
            java.lang.String r15 = "You must call setDestination() or addDestination() before constructing the deep link"
            defpackage.i.m(r15)
            return r3
        Lb8:
            java.lang.String r15 = "You must call setGraph() before constructing the deep link"
            defpackage.i.m(r15)
            return r3
    }

    public int t(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.e
            xi3 r0 = (defpackage.xi3) r0
            ao4 r0 = r0.n
            java.lang.Object r1 = r3.a
            short[] r1 = (short[]) r1
            r2 = 0
            int r2 = r0.a(r1, r2)
            if (r2 != 0) goto L1e
            java.lang.Object r3 = r3.b
            short[][] r3 = (short[][]) r3
            r3 = r3[r4]
            int r3 = r0.b(r3)
            int r3 = r3 + 2
            return r3
        L1e:
            r2 = 1
            int r1 = r0.a(r1, r2)
            if (r1 != 0) goto L32
            java.lang.Object r3 = r3.c
            short[][] r3 = (short[][]) r3
            r3 = r3[r4]
            int r3 = r0.b(r3)
            int r3 = r3 + 10
            return r3
        L32:
            java.lang.Object r3 = r3.d
            short[] r3 = (short[]) r3
            int r3 = r0.b(r3)
            int r3 = r3 + 18
            return r3
    }

    public defpackage.ic4 u(int r4) {
            r3 = this;
            pu r0 = new pu
            r0.<init>()
            java.lang.Object r3 = r3.d
            mc4 r3 = (defpackage.mc4) r3
            r3.getClass()
            r0.addLast(r3)
        Lf:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L3f
            java.lang.Object r3 = r0.removeFirst()
            ic4 r3 = (defpackage.ic4) r3
            z9 r1 = r3.B
            int r1 = r1.a
            if (r1 != r4) goto L22
            return r3
        L22:
            boolean r1 = r3 instanceof defpackage.mc4
            if (r1 == 0) goto Lf
            mc4 r3 = (defpackage.mc4) r3
            java.util.Iterator r3 = r3.iterator()
        L2c:
            r1 = r3
            oc4 r1 = (defpackage.oc4) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf
            java.lang.Object r1 = r1.next()
            ic4 r1 = (defpackage.ic4) r1
            r0.addLast(r1)
            goto L2c
        L3f:
            r3 = 0
            return r3
    }

    public void v(defpackage.qn2 r5) {
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.lang.Object r1 = r4.d     // Catch: java.lang.Throwable -> L36
            ca4 r1 = (defpackage.ca4) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r4.e     // Catch: java.lang.Throwable -> L36
            ca4 r2 = (defpackage.ca4) r2     // Catch: java.lang.Throwable -> L36
            r4.d = r2     // Catch: java.lang.Throwable -> L36
            r4.e = r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.c     // Catch: java.lang.Throwable -> L36
            vw r4 = (defpackage.vw) r4     // Catch: java.lang.Throwable -> L36
        L13:
            int r2 = r4.get()     // Catch: java.lang.Throwable -> L36
            int r3 = r2 >>> 27
            r3 = r3 & 15
            int r3 = r3 + 1
            r3 = r3 & 15
            int r3 = r3 << 27
            boolean r2 = r4.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L13
            int r4 = r1.b     // Catch: java.lang.Throwable -> L36
            r2 = 0
        L2a:
            if (r2 >= r4) goto L38
            java.lang.Object r3 = r1.f(r2)     // Catch: java.lang.Throwable -> L36
            r5.g(r3)     // Catch: java.lang.Throwable -> L36
            int r2 = r2 + 1
            goto L2a
        L36:
            r4 = move-exception
            goto L3d
        L38:
            r1.d()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)
            return
        L3d:
            monitor-exit(r0)
            throw r4
    }

    public float w(int r2, boolean r3) {
            r1 = this;
            java.lang.Object r1 = r1.a
            android.text.Layout r1 = (android.text.Layout) r1
            int r0 = r1.getLineForOffset(r2)
            int r0 = r1.getLineEnd(r0)
            if (r2 <= r0) goto Lf
            r2 = r0
        Lf:
            if (r3 == 0) goto L16
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L16:
            float r1 = r1.getSecondaryHorizontal(r2)
            return r1
    }

    public float x(int r18, boolean r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            java.lang.Object r3 = r0.a
            android.text.Layout r3 = (android.text.Layout) r3
            if (r2 != 0) goto L11
            float r0 = r17.w(r18, r19)
            return r0
        L11:
            int r4 = defpackage.hi2.C(r3, r1, r2)
            int r5 = r3.getLineStart(r4)
            int r6 = r3.getLineEnd(r4)
            if (r1 == r5) goto L26
            if (r1 == r6) goto L26
            float r0 = r17.w(r18, r19)
            return r0
        L26:
            if (r1 == 0) goto L16b
            java.lang.CharSequence r7 = r3.getText()
            int r7 = r7.length()
            if (r1 != r7) goto L34
            goto L16b
        L34:
            int r2 = r0.y(r1, r2)
            int r7 = r0.z(r2)
            int r7 = r3.getLineForOffset(r7)
            int r7 = r3.getParagraphDirection(r7)
            r8 = -1
            r10 = 1
            if (r7 != r8) goto L4a
            r7 = r10
            goto L4b
        L4a:
            r7 = 0
        L4b:
            int r6 = r0.C(r6, r5)
            int r11 = r0.z(r2)
            int r12 = r5 - r11
            int r11 = r6 - r11
            java.text.Bidi r2 = r0.j(r2)
            if (r2 == 0) goto L62
            java.text.Bidi r2 = r2.createLineBidi(r12, r11)
            goto L63
        L62:
            r2 = 0
        L63:
            if (r2 == 0) goto L6b
            int r11 = r2.getRunCount()
            if (r11 != r10) goto L6e
        L6b:
            r13 = 0
            goto L149
        L6e:
            int r11 = r2.getRunCount()
            am3[] r12 = new defpackage.am3[r11]
            r13 = 0
        L75:
            if (r13 >= r11) goto L98
            am3 r14 = new am3
            int r15 = r2.getRunStart(r13)
            int r15 = r15 + r5
            int r16 = r2.getRunLimit(r13)
            int r8 = r16 + r5
            int r16 = r2.getRunLevel(r13)
            int r9 = r16 % 2
            if (r9 != r10) goto L8e
            r9 = r10
            goto L8f
        L8e:
            r9 = 0
        L8f:
            r14.<init>(r15, r9, r8)
            r12[r13] = r14
            int r13 = r13 + 1
            r8 = -1
            goto L75
        L98:
            int r8 = r2.getRunCount()
            byte[] r9 = new byte[r8]
            r13 = 0
        L9f:
            if (r13 >= r8) goto Lab
            int r14 = r2.getRunLevel(r13)
            byte r14 = (byte) r14
            r9[r13] = r14
            int r13 = r13 + 1
            goto L9f
        Lab:
            r13 = 0
            java.text.Bidi.reorderVisually(r9, r13, r12, r13, r11)
            if (r1 != r5) goto Lf9
            r0 = r13
        Lb2:
            if (r0 >= r11) goto Lbf
            r2 = r12[r0]
            int r2 = r2.a
            if (r2 != r1) goto Lbc
            r8 = r0
            goto Lc0
        Lbc:
            int r0 = r0 + 1
            goto Lb2
        Lbf:
            r8 = -1
        Lc0:
            r0 = r12[r8]
            if (r19 != 0) goto Lcb
            boolean r0 = r0.c
            if (r7 != r0) goto Lc9
            goto Lcb
        Lc9:
            r9 = r7
            goto Ld0
        Lcb:
            if (r7 != 0) goto Lcf
            r9 = r10
            goto Ld0
        Lcf:
            r9 = r13
        Ld0:
            if (r8 != 0) goto Ld9
            if (r9 == 0) goto Ld9
            float r0 = r3.getLineLeft(r4)
            return r0
        Ld9:
            int r11 = r11 - r10
            if (r8 != r11) goto Le3
            if (r9 != 0) goto Le3
            float r0 = r3.getLineRight(r4)
            return r0
        Le3:
            if (r9 == 0) goto Lef
            int r8 = r8 - r10
            r0 = r12[r8]
            int r0 = r0.a
            float r0 = r3.getPrimaryHorizontal(r0)
            return r0
        Lef:
            int r8 = r8 + r10
            r0 = r12[r8]
            int r0 = r0.a
            float r0 = r3.getPrimaryHorizontal(r0)
            return r0
        Lf9:
            if (r1 <= r6) goto L100
            int r0 = r0.C(r1, r5)
            goto L101
        L100:
            r0 = r1
        L101:
            r1 = r13
        L102:
            if (r1 >= r11) goto L10f
            r2 = r12[r1]
            int r2 = r2.b
            if (r2 != r0) goto L10c
            r8 = r1
            goto L110
        L10c:
            int r1 = r1 + 1
            goto L102
        L10f:
            r8 = -1
        L110:
            r0 = r12[r8]
            if (r19 != 0) goto L11f
            boolean r0 = r0.c
            if (r7 != r0) goto L119
            goto L11f
        L119:
            if (r7 != 0) goto L11d
            r9 = r10
            goto L120
        L11d:
            r9 = r13
            goto L120
        L11f:
            r9 = r7
        L120:
            if (r8 != 0) goto L129
            if (r9 == 0) goto L129
            float r0 = r3.getLineLeft(r4)
            return r0
        L129:
            int r11 = r11 - r10
            if (r8 != r11) goto L133
            if (r9 != 0) goto L133
            float r0 = r3.getLineRight(r4)
            return r0
        L133:
            if (r9 == 0) goto L13f
            int r8 = r8 - r10
            r0 = r12[r8]
            int r0 = r0.b
            float r0 = r3.getPrimaryHorizontal(r0)
            return r0
        L13f:
            int r8 = r8 + r10
            r0 = r12[r8]
            int r0 = r0.b
            float r0 = r3.getPrimaryHorizontal(r0)
            return r0
        L149:
            boolean r0 = r3.isRtlCharAt(r5)
            if (r19 != 0) goto L151
            if (r7 != r0) goto L156
        L151:
            if (r7 != 0) goto L155
            r7 = r10
            goto L156
        L155:
            r7 = r13
        L156:
            if (r1 != r5) goto L15a
            r9 = r7
            goto L15f
        L15a:
            if (r7 != 0) goto L15e
            r9 = r10
            goto L15f
        L15e:
            r9 = r13
        L15f:
            if (r9 == 0) goto L166
            float r0 = r3.getLineLeft(r4)
            return r0
        L166:
            float r0 = r3.getLineRight(r4)
            return r0
        L16b:
            float r0 = r17.w(r18, r19)
            return r0
    }

    public int y(int r2, boolean r3) {
            r1 = this;
            java.lang.Object r1 = r1.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            int r0 = defpackage.hf.y(r1, r0)
            if (r0 >= 0) goto L12
            int r0 = r0 + 1
            int r0 = -r0
            goto L14
        L12:
            int r0 = r0 + 1
        L14:
            if (r3 == 0) goto L27
            if (r0 <= 0) goto L27
            int r3 = r0 + (-1)
            java.lang.Object r1 = r1.get(r3)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r2 != r1) goto L27
            return r3
        L27:
            return r0
    }

    public int z(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Object r0 = r0.b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }
}
