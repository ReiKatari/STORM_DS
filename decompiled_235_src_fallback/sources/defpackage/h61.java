package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h61 implements defpackage.rb0, defpackage.hu, defpackage.ph4, defpackage.zk4, defpackage.aw, defpackage.mo2, defpackage.u23, defpackage.y05, defpackage.ou6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ h61(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r7, defpackage.vu7 r8) {
            r6 = this;
            int r0 = r6.A
            d83 r1 = defpackage.d83.e
            java.lang.String r2 = "system_ignore_display_cutout_in_layouts"
            r3 = 519(0x207, float:7.27E-43)
            r4 = 0
            r5 = 128(0x80, float:1.8E-43)
            java.lang.Object r6 = r6.B
            switch(r0) {
                case 7: goto Lec;
                case 8: goto L10;
                case 9: goto L10;
                case 10: goto Lb1;
                case 11: goto L5d;
                default: goto L10;
            }
        L10:
            hx6 r6 = (defpackage.hx6) r6
            java.util.ArrayList r7 = r6.b
            ru7 r0 = r8.a
            e83 r1 = r0.h(r3)
            r2 = 64
            e83 r4 = r0.h(r2)
            e83 r1 = defpackage.e83.b(r1, r4)
            e83 r3 = r0.i(r3)
            e83 r0 = r0.i(r2)
            e83 r0 = defpackage.e83.b(r3, r0)
            e83 r2 = r6.c
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L40
            e83 r2 = r6.d
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5c
        L40:
            r6.c = r1
            r6.d = r0
            int r6 = r7.size()
            int r6 = r6 + (-1)
        L4a:
            if (r6 < 0) goto L5c
            java.lang.Object r2 = r7.get(r6)
            l45 r2 = (defpackage.l45) r2
            r2.c = r1
            r2.d = r0
            r2.c()
            int r6 = r6 + (-1)
            goto L4a
        L5c:
            return r8
        L5d:
            me.magnum.melonds.ui.layouteditor.b r6 = (me.magnum.melonds.ui.layouteditor.b) r6
            r7.getClass()
            ru7 r7 = r8.a
            e83 r8 = r7.h(r5)
            r8.getClass()
            e83 r7 = r7.h(r3)
            r7.getClass()
            int r0 = r8.b
            int r1 = r7.b
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r8.d
            int r2 = r7.d
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r8.a
            int r3 = r7.a
            int r2 = java.lang.Math.max(r2, r3)
            int r8 = r8.c
            int r7 = r7.c
            int r7 = java.lang.Math.max(r8, r7)
            nb1 r6 = r6.L
            java.lang.Object r8 = r6.k
            android.widget.ScrollView r8 = (android.widget.ScrollView) r8
            r8.setPadding(r2, r4, r7, r1)
            java.lang.Object r8 = r6.i
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r8.setPadding(r2, r0, r7, r4)
            java.lang.Object r6 = r6.A
            me.magnum.melonds.ui.layouteditor.LayoutEditorView r6 = (me.magnum.melonds.ui.layouteditor.LayoutEditorView) r6
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r2, r0, r7, r1)
            r6.setSafeAreaInsets(r8)
            vu7 r6 = defpackage.vu7.b
            return r6
        Lb1:
            me.magnum.melonds.ui.layouteditor.LayoutEditorActivity r6 = (me.magnum.melonds.ui.layouteditor.LayoutEditorActivity) r6
            int r0 = me.magnum.melonds.ui.layouteditor.LayoutEditorActivity.N0
            r7.getClass()
            ru7 r7 = r8.a
            e83 r7 = r7.h(r5)
            r7.getClass()
            yl3 r0 = r6.C()
            kd6 r0 = r0.e
            ng6 r0 = (defpackage.ng6) r0
            android.content.SharedPreferences r0 = r0.b
            boolean r0 = r0.getBoolean(r2, r4)
            if (r0 == 0) goto Ld2
            goto Ldf
        Ld2:
            d83 r1 = new d83
            int r0 = r7.a
            int r2 = r7.b
            int r3 = r7.c
            int r7 = r7.d
            r1.<init>(r0, r2, r3, r7)
        Ldf:
            r6.D()
            yl3 r6 = r6.C()
            ci0 r6 = r6.d
            r6.o(r1)
            return r8
        Lec:
            me.magnum.melonds.ui.emulator.EmulatorActivity r6 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r6
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r7.getClass()
            ru7 r7 = r8.a
            e83 r7 = r7.h(r5)
            r7.getClass()
            int r8 = r7.d
            int r0 = r7.c
            int r3 = r7.a
            s8 r5 = r6.B0
            if (r5 == 0) goto L132
            androidx.recyclerview.widget.RecyclerView r5 = r5.f
            r5.setPadding(r3, r4, r0, r8)
            sz1 r5 = r6.W()
            kd6 r5 = r5.c
            ng6 r5 = (defpackage.ng6) r5
            android.content.SharedPreferences r5 = r5.b
            boolean r2 = r5.getBoolean(r2, r4)
            if (r2 == 0) goto L11c
            goto L123
        L11c:
            d83 r1 = new d83
            int r7 = r7.b
            r1.<init>(r3, r7, r0, r8)
        L123:
            sz1 r6 = r6.W()
            r6.getClass()
            ci0 r6 = r6.u
            r6.o(r1)
            vu7 r6 = defpackage.vu7.b
            return r6
        L132:
            java.lang.String r6 = "binding"
            defpackage.nb3.a0(r6)
            r6 = 0
            throw r6
    }

    @Override // defpackage.hu
    public int a(int r2, defpackage.kk3 r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            c40 r1 = (defpackage.c40) r1
            r0 = 0
            int r1 = r1.a(r0, r2, r3)
            return r1
    }

    @Override // defpackage.aw, defpackage.mo2
    public defpackage.gx3 apply(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            bg2 r0 = (defpackage.bg2) r0
            java.lang.Object r0 = r0.g(r1)
            gx3 r0 = (defpackage.gx3) r0
            return r0
    }

    @Override // defpackage.mo2
    public java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            t00 r0 = (defpackage.t00) r0
            java.lang.Object r0 = r0.g(r1)
            java.lang.Void r0 = (java.lang.Void) r0
            return r0
    }

    @Override // defpackage.u23
    public void b(defpackage.v23 r6) {
            r5 = this;
            int r0 = r5.A
            java.lang.Object r5 = r5.B
            switch(r0) {
                case 15: goto L91;
                default: goto L7;
            }
        L7:
            ty7 r5 = (defpackage.ty7) r5
            java.lang.String r0 = "CXCP"
            r6.getClass()
            s23 r6 = r6.a()     // Catch: java.lang.IllegalStateException -> L85
            if (r6 == 0) goto L90
            m44 r5 = r5.c     // Catch: java.lang.IllegalStateException -> L85
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L85
            i23 r1 = r6.S()     // Catch: java.lang.IllegalStateException -> L85
            boolean r2 = r1 instanceof defpackage.ke0     // Catch: java.lang.IllegalStateException -> L85
            r3 = 0
            if (r2 == 0) goto L27
            ke0 r1 = (defpackage.ke0) r1     // Catch: java.lang.IllegalStateException -> L85
            je0 r1 = r1.a     // Catch: java.lang.IllegalStateException -> L85
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 != 0) goto L2b
            goto L4d
        L2b:
            ge0 r2 = r1.g()     // Catch: java.lang.IllegalStateException -> L85
            ge0 r4 = defpackage.ge0.LOCKED_FOCUSED     // Catch: java.lang.IllegalStateException -> L85
            if (r2 == r4) goto L3c
            ge0 r2 = r1.g()     // Catch: java.lang.IllegalStateException -> L85
            ge0 r4 = defpackage.ge0.PASSIVE_FOCUSED     // Catch: java.lang.IllegalStateException -> L85
            if (r2 == r4) goto L3c
            goto L4d
        L3c:
            fe0 r2 = r1.f()     // Catch: java.lang.IllegalStateException -> L85
            fe0 r4 = defpackage.fe0.CONVERGED     // Catch: java.lang.IllegalStateException -> L85
            if (r2 == r4) goto L45
            goto L4d
        L45:
            he0 r1 = r1.d()     // Catch: java.lang.IllegalStateException -> L85
            he0 r2 = defpackage.he0.CONVERGED     // Catch: java.lang.IllegalStateException -> L85
            if (r1 == r2) goto L58
        L4d:
            java.lang.Object r5 = r5.R     // Catch: java.lang.IllegalStateException -> L85
            fa6 r5 = (defpackage.fa6) r5     // Catch: java.lang.IllegalStateException -> L85
            r5.getClass()     // Catch: java.lang.IllegalStateException -> L85
            r6.close()     // Catch: java.lang.IllegalStateException -> L85
            goto L90
        L58:
            java.lang.Object r1 = r5.L     // Catch: java.lang.IllegalStateException -> L85
            monitor-enter(r1)     // Catch: java.lang.IllegalStateException -> L85
            java.lang.Object r2 = r5.B     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L6b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L6b
            r4 = 3
            if (r2 < r4) goto L6d
            java.lang.Object r3 = r5.e()     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r5 = move-exception
            goto L83
        L6d:
            java.lang.Object r2 = r5.B     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch: java.lang.Throwable -> L6b
            r2.addFirst(r6)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r5 = r5.R     // Catch: java.lang.IllegalStateException -> L85
            fa6 r5 = (defpackage.fa6) r5     // Catch: java.lang.IllegalStateException -> L85
            if (r5 == 0) goto L90
            if (r3 == 0) goto L90
            s23 r3 = (defpackage.s23) r3     // Catch: java.lang.IllegalStateException -> L85
            r3.close()     // Catch: java.lang.IllegalStateException -> L85
            goto L90
        L83:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6b
            throw r5     // Catch: java.lang.IllegalStateException -> L85
        L85:
            boolean r5 = defpackage.kj2.G()
            if (r5 == 0) goto L90
            java.lang.String r5 = "Failed to acquire latest image"
            android.util.Log.e(r0, r5)
        L90:
            return
        L91:
            o54 r5 = (defpackage.o54) r5
            java.lang.Object r0 = r5.A
            monitor-enter(r0)
            int r1 = r5.L     // Catch: java.lang.Throwable -> La1
            int r1 = r1 + 1
            r5.L = r1     // Catch: java.lang.Throwable -> La1
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            r5.i(r6)
            return
        La1:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La1
            throw r5
    }

    public void c(defpackage.ed6 r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.A
            java.lang.Object r0 = r0.B
            switch(r2) {
                case 8: goto L227;
                default: goto Lb;
            }
        Lb:
            nw4 r0 = (defpackage.nw4) r0
            s23 r2 = r1.B
            r23[] r3 = r2.j()
            r4 = 0
            r3 = r3[r4]
            java.nio.ByteBuffer r3 = r3.a()
            r3.getClass()
            r23[] r5 = r2.j()
            r6 = 1
            r5 = r5[r6]
            r23[] r2 = r2.j()
            r7 = 2
            r2 = r2[r7]
            r3.rewind()
            java.nio.ByteBuffer r8 = r5.a()
            r8.rewind()
            java.nio.ByteBuffer r8 = r2.a()
            r8.rewind()
            int r8 = r1.Y
            int r9 = r1.Z
            i23 r10 = r1.X
            r10.getClass()
            zb r11 = r0.f
            float[] r12 = r0.j
            if (r8 == 0) goto L21f
            if (r9 == 0) goto L217
            int r13 = r3.remaining()
            if (r13 == 0) goto L20f
            java.nio.ByteBuffer r13 = r5.a()
            int r13 = r13.remaining()
            if (r13 == 0) goto L207
            int r13 = r5.m()
            if (r13 == 0) goto L1ff
            int r13 = r5.C()
            if (r13 == 0) goto L1f7
            java.nio.ByteBuffer r13 = r2.a()
            int r13 = r13.remaining()
            if (r13 == 0) goto L1ef
            int r13 = r2.m()
            if (r13 == 0) goto L1e7
            int r13 = r2.C()
            if (r13 == 0) goto L1df
            int r13 = r10.d()
            r14 = 270(0x10e, float:3.78E-43)
            r15 = 90
            if (r13 == r15) goto L8f
            int r13 = r10.d()
            if (r13 != r14) goto L92
        L8f:
            r16 = r6
            goto La2
        L92:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r16 = r6
            vr4 r6 = new vr4
            r6.<init>(r13, r4)
            goto Lb0
        La2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            vr4 r13 = new vr4
            r13.<init>(r4, r6)
            r6 = r13
        Lb0:
            java.lang.Object r4 = r6.A
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r6 = r6.B
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            float r4 = (float) r4
            float r6 = (float) r6
            float r13 = r4 / r6
            r17 = 1068149419(0x3faaaaab, float:1.3333334)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            r17 = 1142947840(0x44200000, float:640.0)
            r18 = 1139802112(0x43f00000, float:480.0)
            if (r13 <= 0) goto Ld4
            float r13 = r6 / r18
        Ld1:
            r19 = r7
            goto Ld7
        Ld4:
            float r13 = r4 / r17
            goto Ld1
        Ld7:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r14 = -1012940800(0xffffffffc39fc000, float:-319.5)
            r15 = -1016102912(0xffffffffc36f8000, float:-239.5)
            r7.setTranslate(r14, r15)
            int r14 = r10.d()
            float r14 = (float) r14
            float r14 = -r14
            r7.postRotate(r14)
            r7.postScale(r13, r13)
            android.graphics.Matrix r13 = new android.graphics.Matrix
            r13.<init>()
            int r14 = r10.d()
            r22 = 1134542848(0x439fc000, float:319.5)
            r15 = 90
            r23 = 1131380736(0x436f8000, float:239.5)
            if (r14 == r15) goto L119
            int r10 = r10.d()
            r14 = 270(0x10e, float:3.78E-43)
            if (r10 != r14) goto L10d
            goto L119
        L10d:
            float r4 = r4 / r17
            float r4 = r4 * r22
            float r6 = r6 / r18
            float r6 = r6 * r23
            r13.setTranslate(r4, r6)
            goto L124
        L119:
            float r6 = r6 / r18
            float r6 = r6 * r23
            float r4 = r4 / r17
            float r4 = r4 * r22
            r13.setTranslate(r6, r4)
        L124:
            float[] r0 = r0.i
            r7.mapPoints(r12, r0)
            r13.mapPoints(r12)
            int r0 = r5.m()
            int r0 = r8 / r0
            java.nio.ByteBuffer r4 = r5.a()
            int r4 = r4.remaining()
            int r6 = r5.m()
            int r4 = r4 / r6
            int r4 = r9 / r4
            int r6 = r2.m()
            int r6 = r8 / r6
            java.nio.ByteBuffer r7 = r2.a()
            int r7 = r7.remaining()
            int r10 = r2.m()
            int r7 = r7 / r10
            int r9 = r9 / r7
            java.lang.Object r7 = r11.L
            byte[][] r7 = (byte[][]) r7
            int r10 = r11.B
            int r10 = r10 + 1
            int r13 = r7.length
            int r10 = r10 % r13
            r7 = r7[r10]
            r10 = 0
        L162:
            r13 = 480(0x1e0, float:6.73E-43)
            if (r10 >= r13) goto L1cf
            r13 = 0
        L167:
            r14 = 640(0x280, float:8.97E-43)
            if (r13 >= r14) goto L1ca
            int r14 = r10 * 640
            int r14 = r14 + r13
            int r14 = r14 * 2
            r15 = r12[r14]
            int r15 = (int) r15
            int r17 = r14 + 1
            r18 = r0
            r0 = r12[r17]
            int r0 = (int) r0
            int r20 = r0 * r8
            r21 = r0
            int r0 = r20 + r15
            byte r0 = r3.get(r0)
            r7[r14] = r0
            int r0 = r13 % 2
            if (r0 != 0) goto L1a8
            java.nio.ByteBuffer r0 = r5.a()
            int r14 = r21 / r4
            int r14 = r14 * r8
            int r14 = r14 / r18
            int r15 = r15 / r18
            int r20 = r5.C()
            int r15 = r15 / r20
            int r20 = r5.C()
            int r20 = r20 * r15
            int r14 = r20 + r14
            byte r0 = r0.get(r14)
            goto L1c3
        L1a8:
            java.nio.ByteBuffer r0 = r2.a()
            int r14 = r21 / r9
            int r14 = r14 * r8
            int r14 = r14 / r6
            int r15 = r15 / r6
            int r20 = r2.C()
            int r15 = r15 / r20
            int r20 = r2.C()
            int r20 = r20 * r15
            int r14 = r20 + r14
            byte r0 = r0.get(r14)
        L1c3:
            r7[r17] = r0
            int r13 = r13 + 1
            r0 = r18
            goto L167
        L1ca:
            r18 = r0
            int r10 = r10 + 1
            goto L162
        L1cf:
            int r0 = r11.B
            int r0 = r0 + 1
            java.lang.Object r2 = r11.L
            byte[][] r2 = (byte[][]) r2
            int r2 = r2.length
            int r0 = r0 % r2
            r11.B = r0
            r1.close()
            return
        L1df:
            se0 r0 = new se0
            java.lang.String r1 = "V plane pixel stride is 0"
            r0.<init>(r1)
            throw r0
        L1e7:
            se0 r0 = new se0
            java.lang.String r1 = "V plane row stride is 0"
            r0.<init>(r1)
            throw r0
        L1ef:
            se0 r0 = new se0
            java.lang.String r1 = "V buffer is empty"
            r0.<init>(r1)
            throw r0
        L1f7:
            se0 r0 = new se0
            java.lang.String r1 = "U plane pixel stride is 0"
            r0.<init>(r1)
            throw r0
        L1ff:
            se0 r0 = new se0
            java.lang.String r1 = "U plane row stride is 0"
            r0.<init>(r1)
            throw r0
        L207:
            se0 r0 = new se0
            java.lang.String r1 = "U buffer is empty"
            r0.<init>(r1)
            throw r0
        L20f:
            se0 r0 = new se0
            java.lang.String r1 = "Y buffer is empty"
            r0.<init>(r1)
            throw r0
        L217:
            se0 r0 = new se0
            java.lang.String r1 = "Image height is 0"
            r0.<init>(r1)
            throw r0
        L21f:
            se0 r0 = new se0
            java.lang.String r1 = "Image width is 0"
            r0.<init>(r1)
            throw r0
        L227:
            h61 r0 = (defpackage.h61) r0
            r0.c(r1)
            return
    }

    public void d() {
            r2 = this;
            java.lang.Object r2 = r2.B
            eo2 r2 = (defpackage.eo2) r2
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            java.util.List r1 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList r2 = defpackage.gt0.T0(r1, r2)     // Catch: java.lang.Throwable -> L11
            defpackage.bm6.h = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return
        L11:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.ph4
    public java.lang.Object e() {
            r5 = this;
            int r0 = r5.A
            java.lang.Object r5 = r5.B
            switch(r0) {
                case 5: goto L2a;
                default: goto L7;
            }
        L7:
            java.lang.Class r5 = (java.lang.Class) r5
            ah7 r0 = defpackage.ah7.a     // Catch: java.lang.Exception -> L10
            java.lang.Object r5 = r0.a(r5)     // Catch: java.lang.Exception -> L10
            return r5
        L10:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to create instance of "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L2a:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.String r0 = "' with no args"
            java.lang.String r1 = "Failed to invoke constructor '"
            r2 = 0
            java.lang.Object r2 = r5.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> L36 java.lang.reflect.InvocationTargetException -> L3f java.lang.InstantiationException -> L5b
            goto L5a
        L36:
            r5 = move-exception
            uj2 r0 = defpackage.oh5.a
            java.lang.String r0 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.u34.p(r0, r5)
            goto L5a
        L3f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = defpackage.oh5.b(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r0 = r3.getCause()
            defpackage.u34.p(r5, r0)
        L5a:
            return r2
        L5b:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = defpackage.oh5.b(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
    }

    @Override // defpackage.ou6
    public defpackage.pu6 f(defpackage.nu6 r7) {
            r6 = this;
            java.lang.Object r6 = r6.B
            r1 = r6
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = r7.b
            zb r3 = r7.c
            r3.getClass()
            if (r2 == 0) goto L1c
            int r6 = r2.length()
            if (r6 == 0) goto L1c
            bn2 r0 = new bn2
            r4 = 1
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L1c:
            java.lang.String r6 = "Must set a non-null database name to a configuration that uses the no backup directory."
            defpackage.i.h(r6)
            r6 = 0
            return r6
    }

    public boolean g(defpackage.s63 r7, int r8, android.os.Bundle r9) {
            r6 = this;
            java.lang.Object r6 = r6.B
            kr r6 = (defpackage.kr) r6
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L3d
            r8 = r8 & r3
            if (r8 == 0) goto L3d
            java.lang.Object r8 = r7.B     // Catch: java.lang.Exception -> L34
            r63 r8 = (defpackage.r63) r8     // Catch: java.lang.Exception -> L34
            r8.g()     // Catch: java.lang.Exception -> L34
            java.lang.Object r8 = r7.B
            r63 r8 = (defpackage.r63) r8
            java.lang.Object r8 = r8.r()
            android.os.Parcelable r8 = (android.os.Parcelable) r8
            if (r9 != 0) goto L28
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            goto L2e
        L28:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>(r9)
            r9 = r1
        L2e:
            java.lang.String r1 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r9.putParcelable(r1, r8)
            goto L3d
        L34:
            r6 = move-exception
            java.lang.String r7 = "InputConnectionCompat"
            java.lang.String r8 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r7, r8, r6)
            return r2
        L3d:
            android.content.ClipData r8 = new android.content.ClipData
            java.lang.Object r7 = r7.B
            r63 r7 = (defpackage.r63) r7
            android.content.ClipDescription r1 = r7.m()
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            android.net.Uri r5 = r7.c()
            r4.<init>(r5)
            r8.<init>(r1, r4)
            r1 = 31
            r4 = 2
            if (r0 < r1) goto L5e
            os0 r0 = new os0
            r0.<init>(r8, r4)
            goto L67
        L5e:
            r31 r0 = new r31
            r0.<init>()
            r0.B = r8
            r0.L = r4
        L67:
            android.net.Uri r7 = r7.h()
            r0.s(r7)
            r0.setExtras(r9)
            t31 r7 = r0.build()
            t31 r6 = defpackage.ao7.j(r6, r7)
            if (r6 != 0) goto L7c
            return r3
        L7c:
            return r2
    }

    @Override // defpackage.y05
    public void i(androidx.preference.Preference r6) {
            r5 = this;
            int r6 = r5.A
            r0 = 0
            r1 = 1
            java.lang.Object r5 = r5.B
            switch(r6) {
                case 18: goto L40;
                default: goto L9;
            }
        L9:
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment r5 = (me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment) r5
            uo7 r6 = r5.Z
            java.lang.Object r6 = r6.getValue()
            yz5 r6 = (defpackage.yz5) r6
            ud4 r6 = r6.b
            android.content.Context r2 = r6.a
            java.io.File r2 = r2.getExternalCacheDir()
            if (r2 == 0) goto L2f
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "extracted_roms"
            r0.<init>(r2, r3)
            boolean r0 = defpackage.jc2.x0(r0)
            v80 r6 = r6.c
            jg7 r2 = defpackage.jg7.a
            r6.c(r2)
        L2f:
            if (r0 != 0) goto L3f
            android.content.Context r5 = r5.requireContext()
            r6 = 2131951943(0x7f130147, float:1.9540315E38)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r1)
            r5.show()
        L3f:
            return
        L40:
            me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment r5 = (me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment) r5
            sn5 r6 = r5.k()
            ex6 r6 = r6.d
            java.lang.Object r6 = r6.getValue()
            rp6 r6 = (defpackage.rp6) r6
            java.lang.Object r6 = r6.getValue()
            qm5 r6 = (defpackage.qm5) r6
            androidx.fragment.app.p r2 = r5.requireActivity()
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "ra_runtime_identity_locked"
            boolean r2 = r2.getBooleanExtra(r3, r0)
            boolean r4 = r6 instanceof defpackage.nm5
            if (r4 == 0) goto Ld5
            androidx.fragment.app.p r6 = r5.requireActivity()
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r2 = "in_game"
            boolean r6 = r6.getBooleanExtra(r2, r0)
            if (r6 == 0) goto L86
            androidx.fragment.app.p r6 = r5.requireActivity()
            android.content.Intent r6 = r6.getIntent()
            boolean r6 = r6.getBooleanExtra(r3, r0)
            if (r6 == 0) goto L86
            r6 = r1
            goto L87
        L86:
            r6 = r0
        L87:
            if (r6 == 0) goto L9a
            androidx.fragment.app.p r2 = r5.requireActivity()
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r3 = "ra_in_game_logout_supported"
            boolean r2 = r2.getBooleanExtra(r3, r0)
            if (r2 == 0) goto L9a
            r0 = r1
        L9a:
            if (r6 == 0) goto La2
            if (r0 != 0) goto La2
            r5.l()
            goto L106
        La2:
            zb r6 = new zb
            android.content.Context r1 = r5.requireContext()
            r6.<init>(r1)
            r1 = 2131952485(0x7f130365, float:1.9541414E38)
            r6.z(r1)
            if (r0 == 0) goto Lb7
            r2 = 2131952487(0x7f130367, float:1.9541418E38)
            goto Lba
        Lb7:
            r2 = 2131952486(0x7f130366, float:1.9541416E38)
        Lba:
            r6.w(r2)
            mn5 r2 = new mn5
            r2.<init>(r0, r5)
            r6.y(r1, r2)
            qo0 r5 = new qo0
            r0 = 6
            r5.<init>(r0)
            r0 = 2131951750(0x7f130086, float:1.9539923E38)
            r6.x(r0, r5)
            r6.B()
            goto L106
        Ld5:
            boolean r0 = r6 instanceof defpackage.pm5
            if (r0 == 0) goto Le7
            if (r2 == 0) goto Ldf
            r5.l()
            goto L106
        Ldf:
            pm5 r6 = (defpackage.pm5) r6
            java.lang.String r6 = r6.a
            r5.m(r6)
            goto L106
        Le7:
            om5 r0 = defpackage.om5.a
            boolean r0 = defpackage.nb3.k(r6, r0)
            if (r0 == 0) goto Lfa
            if (r2 == 0) goto Lf5
            r5.l()
            goto L106
        Lf5:
            r6 = 0
            r5.m(r6)
            goto L106
        Lfa:
            om5 r5 = defpackage.om5.b
            boolean r5 = defpackage.nb3.k(r6, r5)
            if (r5 == 0) goto L103
            goto L106
        L103:
            defpackage.i.d()
        L106:
            return
    }

    @Override // defpackage.rb0
    public java.lang.Object s(defpackage.qb0 r9) {
            r8 = this;
            int r0 = r8.A
            java.lang.Object r8 = r8.B
            switch(r0) {
                case 0: goto Lb1;
                case 3: goto La3;
                default: goto L7;
            }
        L7:
            gj0 r8 = (defpackage.gj0) r8
            gh0 r0 = r8.n
            r0.f()
            ex6 r0 = r8.o
            boolean r0 = r0.a()
            if (r0 == 0) goto L33
            ex6 r0 = r8.o
            java.lang.Object r0 = r0.getValue()
            t16 r0 = (defpackage.t16) r0
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            r16 r2 = r0.b     // Catch: java.lang.Throwable -> L30
            r2.disable()     // Catch: java.lang.Throwable -> L30
            java.util.LinkedHashMap r2 = r0.c     // Catch: java.lang.Throwable -> L30
            r2.clear()     // Catch: java.lang.Throwable -> L30
            r2 = -1
            r0.d = r2     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)
            goto L33
        L30:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L33:
            kh0 r0 = r8.a
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.util.LinkedHashMap r2 = r0.b     // Catch: java.lang.Throwable -> L47
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L47
            gx3 r3 = r0.d
            if (r2 == 0) goto L4b
            if (r3 != 0) goto L49
            n33 r3 = defpackage.n33.L     // Catch: java.lang.Throwable -> L47
            goto L49
        L47:
            r8 = move-exception
            goto La1
        L49:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            goto L92
        L4b:
            if (r3 != 0) goto L59
            h61 r2 = new h61     // Catch: java.lang.Throwable -> L47
            r3 = 3
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L47
            tb0 r3 = defpackage.ak7.W(r2)     // Catch: java.lang.Throwable -> L47
            r0.d = r3     // Catch: java.lang.Throwable -> L47
        L59:
            java.util.HashSet r2 = r0.c     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r4 = r0.b     // Catch: java.lang.Throwable -> L47
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L47
            r2.addAll(r4)     // Catch: java.lang.Throwable -> L47
            java.util.LinkedHashMap r2 = r0.b     // Catch: java.lang.Throwable -> L47
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L47
        L6e:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L47
            eg0 r4 = (defpackage.eg0) r4     // Catch: java.lang.Throwable -> L47
            gx3 r5 = r4.release()     // Catch: java.lang.Throwable -> L47
            mf r6 = new mf     // Catch: java.lang.Throwable -> L47
            r7 = 7
            r6.<init>(r7, r0, r4)     // Catch: java.lang.Throwable -> L47
            uj1 r4 = defpackage.u24.j()     // Catch: java.lang.Throwable -> L47
            r5.a(r4, r6)     // Catch: java.lang.Throwable -> L47
            goto L6e
        L8c:
            java.util.LinkedHashMap r0 = r0.b     // Catch: java.lang.Throwable -> L47
            r0.clear()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
        L92:
            mf r0 = new mf
            r1 = 9
            r0.<init>(r1, r8, r9)
            java.util.concurrent.Executor r8 = r8.d
            r3.a(r8, r0)
            java.lang.String r8 = "CameraX shutdownInternal"
            return r8
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r8
        La3:
            kh0 r8 = (defpackage.kh0) r8
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            r8.e = r9     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r8 = "CameraRepository-deinit"
            return r8
        Lae:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            throw r8
        Lb1:
            ed3 r8 = (defpackage.ed3) r8
            java.lang.String r0 = "Job.asListenableFuture"
            k0 r1 = new k0
            r2 = 17
            r1.<init>(r9, r2)
            r8.a0(r1)
            return r0
    }
}
