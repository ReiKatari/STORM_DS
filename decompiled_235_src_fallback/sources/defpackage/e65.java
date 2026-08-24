package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e65  reason: default package */
/* loaded from: classes.dex */
public final class e65 {
    public final defpackage.mp5 a;
    public final defpackage.gd0 b;
    public final defpackage.id0 c;
    public final defpackage.w61 d;
    public final defpackage.pa e;
    public final java.util.LinkedHashSet f;
    public final java.util.ArrayList g;

    public e65(defpackage.vv4 r10, defpackage.mp5 r11, defpackage.gd0 r12, defpackage.id0 r13, defpackage.t57 r14) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r9.<init>()
            r9.a = r11
            r9.b = r12
            r9.c = r13
            w61 r10 = r14.a
            r9.d = r10
            pa r11 = new pa
            a0 r0 = new a0
            r7 = 0
            r8 = 28
            r1 = 1
            java.lang.Class<e65> r3 = defpackage.e65.class
            java.lang.String r4 = "prune"
            java.lang.String r5 = "prune$camera_camera2_pipe(Ljava/util/List;)V"
            r6 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            bf4 r9 = new bf4
            r12 = 7
            r13 = 0
            r9.<init>(r2, r13, r12)
            r11.<init>(r0, r9)
            r10.getClass()
            java.lang.Object r9 = r11.X
            sw r9 = (defpackage.sw) r9
            boolean r9 = r9.a()
            if (r9 == 0) goto L6b
            ns3 r9 = new ns3
            r12 = 5
            r9.<init>(r11, r13, r12)
            r12 = 3
            ap6 r9 = defpackage.hv.L(r10, r13, r13, r9, r12)
            boolean r9 = r9.isCancelled()
            if (r9 == 0) goto L5a
            defpackage.pa.a(r11, r13)
        L5a:
            r2.e = r11
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r2.f = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r2.g = r9
            return
        L6b:
            java.lang.String r9 = "PruningProcessingQueue cannot be re-started!"
            defpackage.i.m(r9)
            throw r13
    }

    public final void a(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            rk5 r0 = new rk5
            r0.<init>(r3)
            pa r2 = r2.e
            java.lang.Object r2 = r2.Y
            v80 r2 = (defpackage.v80) r2
            java.lang.Object r2 = r2.c(r0)
            boolean r2 = r2 instanceof defpackage.fm0
            if (r2 == 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "Camera close by ID request failed for "
            r2.<init>(r1)
            java.lang.String r3 = defpackage.xf0.b(r3)
            r2.append(r3)
            r3 = 33
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "CXCP"
            android.util.Log.e(r3, r2)
            jg7 r2 = defpackage.jg7.a
            tu0 r3 = r0.b
            r3.b0(r2)
        L39:
            return
    }

    public final java.lang.Object b(java.util.Set r18, defpackage.s41 r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof defpackage.x55
            if (r2 == 0) goto L17
            r2 = r1
            x55 r2 = (defpackage.x55) r2
            int r3 = r2.d0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d0 = r3
            goto L1c
        L17:
            x55 r2 = new x55
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.Y
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.d0
            r5 = 0
            r6 = 0
            java.util.ArrayList r7 = r0.g
            r8 = 1
            if (r4 == 0) goto L3c
            if (r4 != r8) goto L36
            t55 r4 = r2.X
            java.util.Iterator r9 = r2.R
            defpackage.oi2.Y(r1)
            r19 = r5
            goto Lf6
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L3c:
            defpackage.oi2.Y(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r7.size()
            r9 = r6
        L49:
            if (r9 >= r4) goto L6b
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            r11 = r10
            t55 r11 = (defpackage.t55) r11
            al5 r11 = r11.a
            pq7 r11 = r11.a
            java.lang.String r11 = r11.a
            xf0 r12 = new xf0
            r12.<init>(r11)
            r11 = r18
            boolean r12 = r11.contains(r12)
            if (r12 == 0) goto L49
            r1.add(r10)
            goto L49
        L6b:
            java.util.Iterator r1 = r1.iterator()
            r9 = r1
        L70:
            boolean r1 = r9.hasNext()
            jg7 r4 = defpackage.jg7.a
            if (r1 == 0) goto Lfd
            java.lang.Object r1 = r9.next()
            t55 r1 = (defpackage.t55) r1
            al5 r10 = r1.a
            pq7 r11 = r10.a
            java.lang.String r12 = r11.a
            xf0 r13 = new xf0
            r13.<init>(r12)
            java.util.List r12 = defpackage.hf.b0(r13)
            java.util.List r10 = r10.b
            java.util.ArrayList r10 = defpackage.gt0.V0(r12, r10)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L9c
        L99:
            r19 = r5
            goto Le5
        L9c:
            int r12 = r10.size()
            r13 = r6
        La1:
            if (r13 >= r12) goto L99
            java.lang.Object r14 = r10.get(r13)
            int r13 = r13 + 1
            xf0 r14 = (defpackage.xf0) r14
            java.lang.String r14 = r14.a
            java.util.LinkedHashSet r15 = r0.f
            if (r15 == 0) goto Lbb
            boolean r16 = r15.isEmpty()
            if (r16 != 0) goto Lb8
            goto Lbb
        Lb8:
            r19 = r5
            goto Ldf
        Lbb:
            java.util.Iterator r15 = r15.iterator()
        Lbf:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto Lb8
            java.lang.Object r16 = r15.next()
            r19 = r5
            r5 = r16
            n8 r5 = (defpackage.n8) r5
            vd r5 = r5.a
            java.lang.String r5 = r5.a
            boolean r5 = defpackage.nb3.k(r5, r14)
            if (r5 == 0) goto Ldc
            r5 = r19
            goto La1
        Ldc:
            r5 = r19
            goto Lbf
        Ldf:
            java.lang.String r0 = "Check failed."
            defpackage.i.m(r0)
            return r19
        Le5:
            n8 r5 = r1.b
            jb4 r10 = r1.c
            r2.R = r9
            r2.X = r1
            r2.d0 = r8
            r5.d(r11, r10)
            if (r4 != r3) goto Lf5
            return r3
        Lf5:
            r4 = r1
        Lf6:
            r7.remove(r4)
            r5 = r19
            goto L70
        Lfd:
            return r4
    }

    public final void c(java.util.ArrayList r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            java.lang.Object r2 = r5.get(r1)
            int r1 = r1 + 1
            t55 r2 = (defpackage.t55) r2
            jb4 r3 = r2.c
            r3.b()
            java.util.ArrayList r3 = r4.g
            r3.remove(r2)
            goto L5
        L1a:
            return
    }

    public final java.lang.Object d(java.lang.String r5, java.util.List r6, defpackage.fc0 r7, defpackage.w61 r8, defpackage.s41 r9) {
            r4 = this;
            boolean r0 = r9 instanceof defpackage.y55
            if (r0 == 0) goto L13
            r0 = r9
            y55 r0 = (defpackage.y55) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            y55 r0 = new y55
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            w61 r8 = r0.Y
            java.util.List r6 = r0.X
            java.lang.String r5 = r0.R
            defpackage.oi2.Y(r9)
            goto L66
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L34:
            defpackage.oi2.Y(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Opening "
            r9.<init>(r2)
            java.lang.String r2 = defpackage.xf0.b(r5)
            r9.append(r2)
            java.lang.String r2 = " with retries..."
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "CXCP"
            android.util.Log.d(r2, r9)
            r0.R = r5
            r0.X = r6
            r0.Y = r8
            r0.e0 = r3
            mp5 r9 = r4.a
            gd0 r2 = r4.b
            java.lang.Object r9 = r9.b(r5, r2, r7, r0)
            if (r9 != r1) goto L66
            return r1
        L66:
            lm4 r9 = (defpackage.lm4) r9
            vd r7 = r9.a
            if (r7 != 0) goto L74
            q55 r4 = new q55
            df0 r5 = r9.b
            r4.<init>(r5)
            return r4
        L74:
            r55 r9 = new r55
            n8 r0 = new n8
            xf0 r1 = new xf0
            r1.<init>(r5)
            java.util.ArrayList r5 = defpackage.gt0.U0(r1, r6)
            java.util.Set r5 = defpackage.gt0.p1(r5)
            bg2 r6 = new bg2
            r1 = 22
            r6.<init>(r4, r1)
            r0.<init>(r7, r5, r8, r6)
            r9.<init>(r0)
            return r9
    }

    public final java.lang.Object e(defpackage.pk5 r13, defpackage.s41 r14) {
            r12 = this;
            boolean r0 = r14 instanceof defpackage.z55
            if (r0 == 0) goto L13
            r0 = r14
            z55 r0 = (defpackage.z55) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            z55 r0 = new z55
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L39
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            defpackage.oi2.Y(r14)
            return r4
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r3
        L33:
            pk5 r13 = r0.R
            defpackage.oi2.Y(r14)
            goto L93
        L39:
            defpackage.oi2.Y(r14)
            n8 r14 = r13.a
            vd r2 = r14.a
            java.lang.String r2 = r2.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "PruningCamera2DeviceManager#processRequestClose("
            r7.<init>(r8)
            java.lang.String r2 = defpackage.xf0.b(r2)
            r7.append(r2)
            r2 = 41
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "CXCP"
            android.util.Log.i(r7, r2)
            java.util.LinkedHashSet r2 = r12.f
            boolean r7 = r2.contains(r14)
            if (r7 == 0) goto L69
            r2.remove(r14)
        L69:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r7 = r12.g
            int r8 = r7.size()
            r9 = 0
        L75:
            if (r9 >= r8) goto L89
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            r11 = r10
            t55 r11 = (defpackage.t55) r11
            n8 r11 = r11.b
            if (r11 == r14) goto L85
            goto L75
        L85:
            r2.add(r10)
            goto L75
        L89:
            r0.R = r13
            r0.Z = r6
            r12.c(r2)
            if (r4 != r1) goto L93
            goto La4
        L93:
            n8 r12 = r13.a
            r12.c()
            n8 r12 = r13.a
            r0.R = r3
            r0.Z = r5
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto La5
        La4:
            return r1
        La5:
            return r4
    }

    public final java.lang.Object f(defpackage.qk5 r8, defpackage.s41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.a65
            if (r0 == 0) goto L13
            r0 = r9
            a65 r0 = (defpackage.a65) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            a65 r0 = new a65
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            jg7 r3 = defpackage.jg7.a
            r4 = 2
            r5 = 1
            java.util.LinkedHashSet r6 = r7.f
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r4) goto L32
            java.util.Iterator r7 = r0.X
            qk5 r8 = r0.R
            defpackage.oi2.Y(r9)
            goto L6d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L39:
            qk5 r8 = r0.R
            defpackage.oi2.Y(r9)
            goto L55
        L3f:
            defpackage.oi2.Y(r9)
            java.lang.String r9 = "CXCP"
            java.lang.String r2 = "PruningCamera2DeviceManager#processRequestCloseAll()"
            android.util.Log.i(r9, r2)
            r0.R = r8
            r0.d0 = r5
            java.util.ArrayList r9 = r7.g
            r7.c(r9)
            if (r3 != r1) goto L55
            goto L85
        L55:
            java.util.Iterator r7 = r6.iterator()
        L59:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L69
            java.lang.Object r9 = r7.next()
            n8 r9 = (defpackage.n8) r9
            r9.c()
            goto L59
        L69:
            java.util.Iterator r7 = r6.iterator()
        L6d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r7.next()
            n8 r9 = (defpackage.n8) r9
            r0.R = r8
            r0.X = r7
            r0.d0 = r4
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L6d
        L85:
            return r1
        L86:
            r6.clear()
            tu0 r7 = r8.a
            r7.b0(r3)
            return r3
    }

    public final java.lang.Object g(defpackage.rk5 r13, defpackage.s41 r14) {
            r12 = this;
            boolean r0 = r14 instanceof defpackage.b65
            if (r0 == 0) goto L13
            r0 = r14
            b65 r0 = (defpackage.b65) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            b65 r0 = new b65
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            jg7 r4 = defpackage.jg7.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            rk5 r12 = r0.R
            defpackage.oi2.Y(r14)
            goto Lcd
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r3
        L36:
            java.lang.String r13 = r0.X
            rk5 r2 = r0.R
            defpackage.oi2.Y(r14)
            goto L96
        L3e:
            defpackage.oi2.Y(r14)
            java.lang.String r14 = r13.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "PruningCamera2DeviceManager#processRequestCloseById("
            r2.<init>(r7)
            java.lang.String r7 = r13.a
            java.lang.String r7 = defpackage.xf0.b(r7)
            r2.append(r7)
            r7 = 41
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = "CXCP"
            android.util.Log.i(r7, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r7 = r12.g
            int r8 = r7.size()
            r9 = 0
        L6d:
            if (r9 >= r8) goto L88
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            r11 = r10
            t55 r11 = (defpackage.t55) r11
            al5 r11 = r11.a
            pq7 r11 = r11.a
            java.lang.String r11 = r11.a
            boolean r11 = defpackage.nb3.k(r11, r14)
            if (r11 == 0) goto L6d
            r2.add(r10)
            goto L6d
        L88:
            r0.R = r13
            r0.X = r14
            r0.d0 = r6
            r12.c(r2)
            if (r4 != r1) goto L94
            goto Lcb
        L94:
            r2 = r13
            r13 = r14
        L96:
            java.util.LinkedHashSet r12 = r12.f
            java.util.Iterator r14 = r12.iterator()
        L9c:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r14.next()
            r7 = r6
            n8 r7 = (defpackage.n8) r7
            vd r7 = r7.a
            java.lang.String r7 = r7.a
            boolean r7 = defpackage.nb3.k(r7, r13)
            if (r7 == 0) goto L9c
            goto Lb5
        Lb4:
            r6 = r3
        Lb5:
            n8 r6 = (defpackage.n8) r6
            if (r6 == 0) goto Lce
            r12.remove(r6)
            r6.c()
            r0.R = r2
            r0.X = r3
            r0.d0 = r5
            java.lang.Object r12 = r6.b(r0)
            if (r12 != r1) goto Lcc
        Lcb:
            return r1
        Lcc:
            r12 = r2
        Lcd:
            r2 = r12
        Lce:
            tu0 r12 = r2.b
            r12.b0(r4)
            return r4
    }

    public final java.lang.Object h(defpackage.al5 r13, defpackage.s41 r14) {
            r12 = this;
            boolean r0 = r14 instanceof defpackage.c65
            if (r0 == 0) goto L13
            r0 = r14
            c65 r0 = (defpackage.c65) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            c65 r0 = new c65
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            r4 = 0
            switch(r2) {
                case 0: goto L62;
                case 1: goto L55;
                case 2: goto L48;
                case 3: goto L3a;
                case 4: goto L33;
                case 5: goto L2e;
                case 6: goto L29;
                default: goto L23;
            }
        L23:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r4
        L29:
            defpackage.oi2.Y(r14)
            goto L280
        L2e:
            defpackage.oi2.Y(r14)
            goto L26c
        L33:
            al5 r13 = r0.R
            defpackage.oi2.Y(r14)
            goto L25a
        L3a:
            java.lang.String r13 = r0.X
            al5 r2 = r0.R
            defpackage.oi2.Y(r14)
            r11 = r14
            r14 = r13
            r13 = r2
            r2 = r0
            r0 = r11
            goto L194
        L48:
            java.lang.Object r13 = r0.Y
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.String r2 = r0.X
            al5 r5 = r0.R
            defpackage.oi2.Y(r14)
            goto L146
        L55:
            java.lang.Object r13 = r0.Y
            java.util.List r13 = (java.util.List) r13
            java.lang.String r2 = r0.X
            al5 r5 = r0.R
            defpackage.oi2.Y(r14)
            goto L12e
        L62:
            defpackage.oi2.Y(r14)
            pq7 r14 = r13.a
            java.lang.String r2 = r14.a
            java.lang.String r14 = "CXCP"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "PruningCamera2DeviceManager#processRequestOpen("
            r5.<init>(r6)
            java.lang.String r6 = defpackage.xf0.b(r2)
            r5.append(r6)
            r6 = 41
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r14, r5)
            java.util.List r14 = r13.b
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto Lb3
            java.util.LinkedHashSet r14 = r12.f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r14 = r14.iterator()
        L98:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto Leb
            java.lang.Object r6 = r14.next()
            r7 = r6
            n8 r7 = (defpackage.n8) r7
            vd r7 = r7.a
            java.lang.String r7 = r7.a
            boolean r7 = defpackage.nb3.k(r7, r2)
            if (r7 != 0) goto L98
            r5.add(r6)
            goto L98
        Lb3:
            java.util.List r14 = r13.b
            pq7 r5 = r13.a
            java.lang.String r5 = r5.a
            xf0 r6 = new xf0
            r6.<init>(r5)
            java.util.ArrayList r14 = defpackage.gt0.U0(r6, r14)
            java.util.Set r14 = defpackage.gt0.p1(r14)
            java.util.LinkedHashSet r5 = r12.f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld1:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lea
            java.lang.Object r7 = r5.next()
            r8 = r7
            n8 r8 = (defpackage.n8) r8
            java.util.Set r8 = r8.b
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto Ld1
            r6.add(r7)
            goto Ld1
        Lea:
            r5 = r6
        Leb:
            boolean r14 = r5.isEmpty()
            if (r14 != 0) goto L165
            java.util.LinkedHashSet r14 = r12.f
            r14.removeAll(r5)
            java.util.ArrayList r14 = r12.g
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r14.size()
            r8 = r3
        L102:
            if (r8 >= r7) goto L119
            java.lang.Object r9 = r14.get(r8)
            int r8 = r8 + 1
            r10 = r9
            t55 r10 = (defpackage.t55) r10
            n8 r10 = r10.b
            boolean r10 = r5.contains(r10)
            if (r10 == 0) goto L102
            r6.add(r9)
            goto L102
        L119:
            r0.R = r13
            r0.X = r2
            r0.Y = r5
            r14 = 1
            r0.e0 = r14
            r12.c(r6)
            jg7 r14 = defpackage.jg7.a
            if (r14 != r1) goto L12b
            goto L27f
        L12b:
            r11 = r5
            r5 = r13
            r13 = r11
        L12e:
            java.util.Iterator r14 = r13.iterator()
        L132:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L142
            java.lang.Object r6 = r14.next()
            n8 r6 = (defpackage.n8) r6
            r6.c()
            goto L132
        L142:
            java.util.Iterator r13 = r13.iterator()
        L146:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L163
            java.lang.Object r14 = r13.next()
            n8 r14 = (defpackage.n8) r14
            r0.R = r5
            r0.X = r2
            r0.Y = r13
            r6 = 2
            r0.e0 = r6
            java.lang.Object r14 = r14.b(r0)
            if (r14 != r1) goto L146
            goto L27f
        L163:
            r13 = r2
            goto L167
        L165:
            r5 = r13
            goto L163
        L167:
            id0 r14 = r12.c
            pq7 r2 = r5.a
            r14.getClass()
            r13.getClass()
            java.lang.Object r6 = r14.a
            monitor-enter(r6)
            java.util.LinkedHashMap r14 = r14.b     // Catch: java.lang.Throwable -> L289
            xf0 r7 = new xf0     // Catch: java.lang.Throwable -> L289
            r7.<init>(r13)     // Catch: java.lang.Throwable -> L289
            r14.put(r7, r2)     // Catch: java.lang.Throwable -> L289
            monitor-exit(r6)
            r0.R = r5
            r0.X = r13
            r0.Y = r4
            r14 = 3
            r0.e0 = r14
            java.lang.Object r14 = r12.i(r13, r5, r0)
            if (r14 != r1) goto L190
            goto L27f
        L190:
            r2 = r0
            r0 = r14
            r14 = r13
            r13 = r5
        L194:
            w55 r0 = (defpackage.w55) r0
            boolean r5 = r0 instanceof defpackage.u55
            if (r5 == 0) goto L1e7
            u55 r0 = (defpackage.u55) r0
            df0 r12 = r0.a
            if (r12 == 0) goto L1c8
            java.lang.String r12 = "CXCP"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to retrieve active camera for "
            r13.<init>(r1)
            java.lang.String r14 = defpackage.xf0.b(r14)
            r13.append(r14)
            java.lang.String r14 = ". Last camera error was "
            r13.append(r14)
            df0 r14 = r0.a
            int r14 = r14.a
            java.lang.String r14 = defpackage.df0.a(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r12, r13)
            goto L1e4
        L1c8:
            java.lang.String r12 = "CXCP"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to retrieve active camera for "
            r13.<init>(r0)
            java.lang.String r14 = defpackage.xf0.b(r14)
            r13.append(r14)
            java.lang.String r14 = ". Camera might have been closed during opening."
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r12, r13)
        L1e4:
            jg7 r12 = defpackage.jg7.a
            return r12
        L1e7:
            boolean r14 = r0 instanceof defpackage.v55
            if (r14 == 0) goto L283
            v55 r0 = (defpackage.v55) r0
            n8 r14 = r0.a
            jb4 r0 = r0.b
            java.util.List r5 = r13.b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L26f
            java.util.List r5 = r13.b
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L202
            goto L248
        L202:
            java.util.Iterator r5 = r5.iterator()
        L206:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L248
            java.lang.Object r6 = r5.next()
            xf0 r6 = (defpackage.xf0) r6
            java.lang.String r6 = r6.a
            java.util.ArrayList r7 = r12.g
            if (r7 == 0) goto L21f
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L21f
            goto L23b
        L21f:
            int r8 = r7.size()
            r9 = r3
        L224:
            if (r9 >= r8) goto L23b
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            t55 r10 = (defpackage.t55) r10
            n8 r10 = r10.b
            vd r10 = r10.a
            java.lang.String r10 = r10.a
            boolean r10 = defpackage.nb3.k(r10, r6)
            if (r10 == 0) goto L224
            goto L206
        L23b:
            java.util.ArrayList r12 = r12.g
            t55 r1 = new t55
            r1.<init>(r13, r14, r0)
            r12.add(r1)
            jg7 r12 = defpackage.jg7.a
            return r12
        L248:
            pq7 r3 = r13.a
            r2.R = r13
            r2.X = r4
            r5 = 4
            r2.e0 = r5
            r14.d(r3, r0)
            jg7 r14 = defpackage.jg7.a
            if (r14 != r1) goto L259
            goto L27f
        L259:
            r0 = r2
        L25a:
            java.util.List r13 = r13.b
            java.util.Set r13 = defpackage.gt0.p1(r13)
            r0.R = r4
            r14 = 5
            r0.e0 = r14
            java.lang.Object r12 = r12.b(r13, r0)
            if (r12 != r1) goto L26c
            goto L27f
        L26c:
            jg7 r12 = defpackage.jg7.a
            return r12
        L26f:
            pq7 r12 = r13.a
            r2.R = r4
            r2.X = r4
            r13 = 6
            r2.e0 = r13
            r14.d(r12, r0)
            jg7 r12 = defpackage.jg7.a
            if (r12 != r1) goto L280
        L27f:
            return r1
        L280:
            jg7 r12 = defpackage.jg7.a
            return r12
        L283:
            java.lang.String r12 = "Check failed."
            defpackage.i.m(r12)
            return r4
        L289:
            r12 = move-exception
            monitor-exit(r6)
            throw r12
    }

    public final java.lang.Object i(java.lang.String r14, defpackage.al5 r15, defpackage.s41 r16) {
            r13 = this;
            r1 = r16
            boolean r2 = r1 instanceof defpackage.d65
            if (r2 == 0) goto L15
            r2 = r1
            d65 r2 = (defpackage.d65) r2
            int r3 = r2.f0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.f0 = r3
            goto L1a
        L15:
            d65 r2 = new d65
            r2.<init>(r13, r1)
        L1a:
            java.lang.Object r1 = r2.d0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r2.f0
            r4 = 2
            r5 = 1
            java.util.LinkedHashSet r7 = r13.f
            r8 = 0
            if (r3 == 0) goto L47
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L34
            al5 r0 = r2.X
            java.lang.String r2 = r2.R
            defpackage.oi2.Y(r1)
            goto Laf
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L3a:
            n8 r3 = r2.Z
            java.util.Iterator r9 = r2.Y
            al5 r10 = r2.X
            java.lang.String r11 = r2.R
            defpackage.oi2.Y(r1)
            r1 = r11
            goto L86
        L47:
            defpackage.oi2.Y(r1)
            java.util.Iterator r1 = r7.iterator()
            r9 = r15
            r3 = r1
            r1 = r14
        L51:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L8c
            java.lang.Object r10 = r3.next()
            n8 r10 = (defpackage.n8) r10
            vd r11 = r10.a
            java.lang.String r11 = r11.a
            boolean r11 = defpackage.nb3.k(r11, r1)
            if (r11 == 0) goto L51
            jb4 r11 = r10.a()
            if (r11 == 0) goto L6e
            goto L8e
        L6e:
            r10.c()
            r2.R = r1
            r2.X = r9
            r2.Y = r3
            r2.Z = r10
            r2.f0 = r5
            java.lang.Object r11 = r10.b(r2)
            if (r11 != r6) goto L82
            goto Lab
        L82:
            r12 = r9
            r9 = r3
            r3 = r10
            r10 = r12
        L86:
            r7.remove(r3)
            r3 = r9
            r9 = r10
            goto L51
        L8c:
            r10 = r8
            r11 = r10
        L8e:
            if (r10 != 0) goto L12e
            java.util.List r3 = r9.b
            r5 = r3
            fc0 r3 = r9.d
            r2.R = r1
            r2.X = r9
            r2.Y = r8
            r2.Z = r8
            r2.f0 = r4
            w61 r4 = r13.d
            r0 = r5
            r5 = r2
            r2 = r0
            r0 = r13
            java.lang.Object r0 = r0.d(r1, r2, r3, r4, r5)
            if (r0 != r6) goto Lac
        Lab:
            return r6
        Lac:
            r2 = r1
            r1 = r0
            r0 = r9
        Laf:
            s55 r1 = (defpackage.s55) r1
            boolean r3 = r1 instanceof defpackage.r55
            java.lang.String r4 = "PruningCameraDeviceManager: Failed to open "
            java.lang.String r5 = "CXCP"
            if (r3 == 0) goto L104
            r55 r1 = (defpackage.r55) r1
            n8 r10 = r1.a
            jb4 r11 = r10.a()
            if (r11 == 0) goto Le1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PruningCameraDeviceManager: "
            r0.<init>(r1)
            java.lang.String r1 = defpackage.xf0.b(r2)
            r0.append(r1)
            java.lang.String r1 = " opened successfully"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r5, r0)
            r7.add(r10)
            goto L12e
        Le1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r2 = defpackage.xf0.b(r2)
            r1.append(r2)
            java.lang.String r2 = ": Camera may have been closed (possibly due to an error) immediately after opening"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r5, r1)
            pq7 r0 = r0.a
            r0.a(r8)
            u55 r0 = new u55
            r0.<init>(r8)
            return r0
        L104:
            boolean r3 = r1 instanceof defpackage.q55
            if (r3 == 0) goto L12a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.String r2 = defpackage.xf0.b(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r5, r2)
            pq7 r0 = r0.a
            q55 r1 = (defpackage.q55) r1
            df0 r1 = r1.a
            r0.a(r1)
            u55 r0 = new u55
            r0.<init>(r1)
            return r0
        L12a:
            defpackage.i.d()
            return r8
        L12e:
            v55 r0 = new v55
            if (r11 == 0) goto L136
            r0.<init>(r10, r11)
            return r0
        L136:
            java.lang.String r0 = "Required value was null."
            defpackage.i.m(r0)
            return r8
    }
}
