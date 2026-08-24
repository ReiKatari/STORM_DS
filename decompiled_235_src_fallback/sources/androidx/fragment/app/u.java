package androidx.fragment.app;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class u {
    public final defpackage.gl2 A;
    public final defpackage.q61 B;
    public defpackage.i9 C;
    public defpackage.i9 D;
    public defpackage.i9 E;
    public java.util.ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public java.util.ArrayList L;
    public java.util.ArrayList M;
    public java.util.ArrayList N;
    public androidx.fragment.app.v O;
    public final defpackage.g15 P;
    public final java.util.ArrayList a;
    public boolean b;
    public final androidx.fragment.app.y c;
    public java.util.ArrayList d;
    public java.util.ArrayList e;
    public final androidx.fragment.app.r f;
    public defpackage.il4 g;
    public androidx.fragment.app.a h;
    public boolean i;
    public final androidx.fragment.app.s j;
    public final java.util.concurrent.atomic.AtomicInteger k;
    public final java.util.Map l;
    public final java.util.Map m;
    public final java.util.ArrayList n;
    public final defpackage.yc1 o;
    public final java.util.concurrent.CopyOnWriteArrayList p;
    public final defpackage.dl2 q;
    public final defpackage.dl2 r;
    public final defpackage.dl2 s;
    public final defpackage.dl2 t;
    public final defpackage.fl2 u;
    public int v;
    public defpackage.cl2 w;
    public defpackage.zk2 x;
    public androidx.fragment.app.o y;
    public androidx.fragment.app.o z;

    public u() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.a = r0
            androidx.fragment.app.y r0 = new androidx.fragment.app.y
            r0.<init>()
            r2.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
            androidx.fragment.app.r r0 = new androidx.fragment.app.r
            r0.<init>(r2)
            r2.f = r0
            r0 = 0
            r2.h = r0
            r0 = 0
            r2.i = r0
            androidx.fragment.app.s r0 = new androidx.fragment.app.s
            r0.<init>(r2)
            r2.j = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.l = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.m = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collections.synchronizedMap(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.n = r0
            yc1 r0 = new yc1
            r0.<init>()
            r0.A = r2
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.B = r1
            r2.o = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.p = r0
            dl2 r0 = new dl2
            r1 = 0
            r0.<init>(r2, r1)
            r2.q = r0
            dl2 r0 = new dl2
            r1 = 1
            r0.<init>(r2, r1)
            r2.r = r0
            dl2 r0 = new dl2
            r1 = 2
            r0.<init>(r2, r1)
            r2.s = r0
            dl2 r0 = new dl2
            r1 = 3
            r0.<init>(r2, r1)
            r2.t = r0
            fl2 r0 = new fl2
            r0.<init>(r2)
            r2.u = r0
            r0 = -1
            r2.v = r0
            gl2 r0 = new gl2
            r0.<init>(r2)
            r2.A = r0
            q61 r0 = new q61
            r0.<init>()
            r2.B = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.F = r0
            g15 r0 = new g15
            r1 = 10
            r0.<init>(r2, r1)
            r2.P = r0
            return
    }

    public static java.util.HashSet F(androidx.fragment.app.a r4) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L6:
            java.util.ArrayList r2 = r4.c
            int r2 = r2.size()
            if (r1 >= r2) goto L24
            java.util.ArrayList r2 = r4.c
            java.lang.Object r2 = r2.get(r1)
            ul2 r2 = (defpackage.ul2) r2
            androidx.fragment.app.o r2 = r2.b
            if (r2 == 0) goto L21
            boolean r3 = r4.i
            if (r3 == 0) goto L21
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    public static boolean K(int r1) {
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean L(androidx.fragment.app.o r5) {
            boolean r0 = r5.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r5.mMenuVisible
            if (r0 != 0) goto L29
        L8:
            androidx.fragment.app.u r5 = r5.mChildFragmentManager
            androidx.fragment.app.y r5 = r5.c
            java.util.ArrayList r5 = r5.e()
            int r0 = r5.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L17:
            if (r3 >= r0) goto L2b
            java.lang.Object r4 = r5.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.o r4 = (androidx.fragment.app.o) r4
            if (r4 == 0) goto L27
            boolean r2 = L(r4)
        L27:
            if (r2 == 0) goto L17
        L29:
            r5 = 1
            return r5
        L2b:
            return r1
    }

    public static boolean N(androidx.fragment.app.o r2) {
            if (r2 != 0) goto L3
            goto L15
        L3:
            androidx.fragment.app.u r0 = r2.mFragmentManager
            androidx.fragment.app.o r1 = r0.z
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L17
            androidx.fragment.app.o r2 = r0.y
            boolean r2 = N(r2)
            if (r2 == 0) goto L17
        L15:
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    public static void c0(androidx.fragment.app.o r2) {
            r0 = 2
            boolean r0 = K(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r2.mHidden
            if (r0 == 0) goto L27
            r0 = 0
            r2.mHidden = r0
            boolean r0 = r2.mHiddenChanged
            r0 = r0 ^ 1
            r2.mHiddenChanged = r0
        L27:
            return
    }

    public final void A(androidx.fragment.app.a r9, boolean r10) {
            r8 = this;
            if (r10 == 0) goto Lb
            cl2 r0 = r8.w
            if (r0 == 0) goto La
            boolean r0 = r8.J
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r8.y(r10)
            androidx.fragment.app.a r10 = r8.h
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L67
            r10.u = r1
            r10.g()
            r10 = 3
            boolean r10 = K(r10)
            if (r10 == 0) goto L3d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "Reversing mTransitioningOp "
            r10.<init>(r2)
            androidx.fragment.app.a r2 = r8.h
            r10.append(r2)
            java.lang.String r2 = " as part of execSingleAction for action "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r10)
        L3d:
            androidx.fragment.app.a r10 = r8.h
            r10.i(r1, r1)
            androidx.fragment.app.a r10 = r8.h
            java.util.ArrayList r2 = r8.L
            java.util.ArrayList r3 = r8.M
            r10.a(r2, r3)
            androidx.fragment.app.a r10 = r8.h
            java.util.ArrayList r10 = r10.c
            int r2 = r10.size()
            r3 = r1
        L54:
            if (r3 >= r2) goto L65
            java.lang.Object r4 = r10.get(r3)
            int r3 = r3 + 1
            ul2 r4 = (defpackage.ul2) r4
            androidx.fragment.app.o r4 = r4.b
            if (r4 == 0) goto L54
            r4.mTransitioning = r1
            goto L54
        L65:
            r8.h = r0
        L67:
            java.util.ArrayList r10 = r8.L
            java.util.ArrayList r2 = r8.M
            r9.a(r10, r2)
            r9 = 1
            r8.b = r9
            java.util.ArrayList r10 = r8.L     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList r2 = r8.M     // Catch: java.lang.Throwable -> Lba
            r8.U(r10, r2)     // Catch: java.lang.Throwable -> Lba
            r8.d()
            r8.e0()
            boolean r10 = r8.K
            androidx.fragment.app.y r2 = r8.c
            if (r10 == 0) goto Lac
            r8.K = r1
            java.util.ArrayList r10 = r2.d()
            int r3 = r10.size()
            r4 = r1
        L8f:
            if (r4 >= r3) goto Lac
            java.lang.Object r5 = r10.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.x r5 = (androidx.fragment.app.x) r5
            androidx.fragment.app.o r6 = r5.c
            boolean r7 = r6.mDeferStart
            if (r7 == 0) goto L8f
            boolean r7 = r8.b
            if (r7 == 0) goto La6
            r8.K = r9
            goto L8f
        La6:
            r6.mDeferStart = r1
            r5.k()
            goto L8f
        Lac:
            java.util.HashMap r8 = r2.b
            java.util.Collection r8 = r8.values()
            java.util.Set r9 = java.util.Collections.singleton(r0)
            r8.removeAll(r9)
            return
        Lba:
            r9 = move-exception
            r8.d()
            throw r9
    }

    public final void B(int r27, int r28, java.util.ArrayList r29, java.util.ArrayList r30) {
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            java.lang.Object r5 = r3.get(r1)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            boolean r5 = r5.r
            java.util.ArrayList r6 = r0.N
            if (r6 != 0) goto L1e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.N = r6
            goto L21
        L1e:
            r6.clear()
        L21:
            java.util.ArrayList r6 = r0.N
            androidx.fragment.app.y r7 = r0.c
            java.util.List r8 = r7.f()
            r6.addAll(r8)
            androidx.fragment.app.o r6 = r0.z
            r9 = r1
            r10 = 0
        L30:
            r12 = 1
            if (r9 >= r2) goto L18b
            java.lang.Object r13 = r3.get(r9)
            androidx.fragment.app.a r13 = (androidx.fragment.app.a) r13
            java.lang.Object r14 = r4.get(r9)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            java.util.ArrayList r15 = r0.N
            if (r14 != 0) goto L141
            java.util.ArrayList r14 = r13.c
            r8 = 0
        L4a:
            int r11 = r14.size()
            if (r8 >= r11) goto L13a
            java.lang.Object r11 = r14.get(r8)
            ul2 r11 = (defpackage.ul2) r11
            r18 = r5
            int r5 = r11.a
            if (r5 == r12) goto L126
            r12 = 2
            r20 = r9
            r9 = 9
            if (r5 == r12) goto La3
            r12 = 3
            if (r5 == r12) goto L8c
            r12 = 6
            if (r5 == r12) goto L8c
            r12 = 7
            if (r5 == r12) goto L87
            r12 = 8
            if (r5 == r12) goto L71
            goto L82
        L71:
            ul2 r5 = new ul2
            r12 = 0
            r5.<init>(r6, r9, r12)
            r14.add(r8, r5)
            r5 = 1
            r11.c = r5
            int r8 = r8 + 1
            androidx.fragment.app.o r5 = r11.b
            r6 = r5
        L82:
            r23 = r10
        L84:
            r9 = 1
            goto L130
        L87:
            r9 = 1
        L88:
            r23 = r10
            goto L12b
        L8c:
            androidx.fragment.app.o r5 = r11.b
            r15.remove(r5)
            androidx.fragment.app.o r5 = r11.b
            if (r5 != r6) goto L82
            ul2 r6 = new ul2
            r6.<init>(r5, r9)
            r14.add(r8, r6)
            int r8 = r8 + 1
            r23 = r10
            r6 = 0
            goto L84
        La3:
            androidx.fragment.app.o r5 = r11.b
            int r12 = r5.mContainerId
            int r21 = r15.size()
            r19 = 1
            int r21 = r21 + (-1)
            r9 = r21
            r21 = 0
        Lb3:
            if (r9 < 0) goto L113
            java.lang.Object r23 = r15.get(r9)
            r24 = r9
            r9 = r23
            androidx.fragment.app.o r9 = (androidx.fragment.app.o) r9
            r23 = r10
            int r10 = r9.mContainerId
            if (r10 != r12) goto L108
            if (r9 != r5) goto Lcd
            r22 = r12
            r9 = 1
            r21 = 1
            goto L10b
        Lcd:
            if (r9 != r6) goto Le0
            ul2 r6 = new ul2
            r22 = r12
            r10 = 0
            r12 = 9
            r6.<init>(r9, r12, r10)
            r14.add(r8, r6)
            int r8 = r8 + 1
            r6 = 0
            goto Le5
        Le0:
            r22 = r12
            r10 = 0
            r12 = 9
        Le5:
            ul2 r12 = new ul2
            r25 = r6
            r6 = 3
            r12.<init>(r9, r6, r10)
            int r6 = r11.d
            r12.d = r6
            int r6 = r11.f
            r12.f = r6
            int r6 = r11.e
            r12.e = r6
            int r6 = r11.g
            r12.g = r6
            r14.add(r8, r12)
            r15.remove(r9)
            r9 = 1
            int r8 = r8 + r9
            r6 = r25
            goto L10b
        L108:
            r22 = r12
            r9 = 1
        L10b:
            int r10 = r24 + (-1)
            r9 = r10
            r12 = r22
            r10 = r23
            goto Lb3
        L113:
            r23 = r10
            r9 = 1
            if (r21 == 0) goto L11e
            r14.remove(r8)
            int r8 = r8 + (-1)
            goto L130
        L11e:
            r11.a = r9
            r11.c = r9
            r15.add(r5)
            goto L130
        L126:
            r20 = r9
            r9 = r12
            goto L88
        L12b:
            androidx.fragment.app.o r5 = r11.b
            r15.add(r5)
        L130:
            int r8 = r8 + r9
            r12 = r9
            r5 = r18
            r9 = r20
            r10 = r23
            goto L4a
        L13a:
            r18 = r5
            r20 = r9
            r23 = r10
            goto L17b
        L141:
            r18 = r5
            r20 = r9
            r23 = r10
            r9 = r12
            java.util.ArrayList r5 = r13.c
            int r8 = r5.size()
            int r8 = r8 - r9
        L14f:
            if (r8 < 0) goto L17b
            java.lang.Object r10 = r5.get(r8)
            ul2 r10 = (defpackage.ul2) r10
            int r11 = r10.a
            r12 = 3
            if (r11 == r9) goto L172
            if (r11 == r12) goto L16c
            switch(r11) {
                case 6: goto L16c;
                case 7: goto L172;
                case 8: goto L16a;
                case 9: goto L167;
                case 10: goto L162;
                default: goto L161;
            }
        L161:
            goto L177
        L162:
            tt3 r9 = r10.h
            r10.i = r9
            goto L177
        L167:
            androidx.fragment.app.o r6 = r10.b
            goto L177
        L16a:
            r6 = 0
            goto L177
        L16c:
            androidx.fragment.app.o r9 = r10.b
            r15.add(r9)
            goto L177
        L172:
            androidx.fragment.app.o r9 = r10.b
            r15.remove(r9)
        L177:
            int r8 = r8 + (-1)
            r9 = 1
            goto L14f
        L17b:
            if (r23 != 0) goto L184
            boolean r5 = r13.i
            if (r5 == 0) goto L182
            goto L184
        L182:
            r10 = 0
            goto L185
        L184:
            r10 = 1
        L185:
            int r9 = r20 + 1
            r5 = r18
            goto L30
        L18b:
            r18 = r5
            r23 = r10
            java.util.ArrayList r5 = r0.N
            r5.clear()
            if (r18 != 0) goto L1c8
            int r5 = r0.v
            r9 = 1
            if (r5 < r9) goto L1c8
            r5 = r1
        L19c:
            if (r5 >= r2) goto L1c8
            java.lang.Object r6 = r3.get(r5)
            androidx.fragment.app.a r6 = (androidx.fragment.app.a) r6
            java.util.ArrayList r6 = r6.c
            int r8 = r6.size()
            r9 = 0
        L1ab:
            if (r9 >= r8) goto L1c5
            java.lang.Object r10 = r6.get(r9)
            int r9 = r9 + 1
            ul2 r10 = (defpackage.ul2) r10
            androidx.fragment.app.o r10 = r10.b
            if (r10 == 0) goto L1ab
            androidx.fragment.app.u r11 = r10.mFragmentManager
            if (r11 == 0) goto L1ab
            androidx.fragment.app.x r10 = r0.g(r10)
            r7.g(r10)
            goto L1ab
        L1c5:
            int r5 = r5 + 1
            goto L19c
        L1c8:
            r5 = r1
        L1c9:
            r6 = -1
            if (r5 >= r2) goto L37e
            java.lang.Object r7 = r3.get(r5)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            java.lang.Object r8 = r4.get(r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.String r9 = "Unknown cmd: "
            if (r8 == 0) goto L2b6
            r7.f(r6)
            androidx.fragment.app.u r6 = r7.t
            java.util.ArrayList r8 = r7.c
            int r10 = r8.size()
            r11 = 1
            int r10 = r10 - r11
        L1ed:
            if (r10 < 0) goto L2b1
            java.lang.Object r12 = r8.get(r10)
            ul2 r12 = (defpackage.ul2) r12
            androidx.fragment.app.o r13 = r12.b
            if (r13 == 0) goto L225
            r14 = 0
            r13.mBeingSaved = r14
            r13.setPopDirection(r11)
            int r11 = r7.h
            r14 = 8194(0x2002, float:1.1482E-41)
            r15 = 4097(0x1001, float:5.741E-42)
            if (r11 == r15) goto L21b
            if (r11 == r14) goto L21a
            r14 = 4100(0x1004, float:5.745E-42)
            r15 = 8197(0x2005, float:1.1486E-41)
            if (r11 == r15) goto L21b
            r15 = 4099(0x1003, float:5.744E-42)
            if (r11 == r15) goto L21a
            if (r11 == r14) goto L217
            r14 = 0
            goto L21b
        L217:
            r14 = 8197(0x2005, float:1.1486E-41)
            goto L21b
        L21a:
            r14 = r15
        L21b:
            r13.setNextTransition(r14)
            java.util.ArrayList r11 = r7.q
            java.util.ArrayList r14 = r7.p
            r13.setSharedElementNames(r11, r14)
        L225:
            int r11 = r12.a
            switch(r11) {
                case 1: goto L29b;
                case 2: goto L22a;
                case 3: goto L28c;
                case 4: goto L27a;
                case 5: goto L267;
                case 6: goto L258;
                case 7: goto L245;
                case 8: goto L240;
                case 9: goto L23c;
                case 10: goto L230;
                default: goto L22a;
            }
        L22a:
            int r0 = r12.a
            defpackage.e41.n(r0, r9)
            return
        L230:
            tt3 r11 = r13.mMaxState
            r12.i = r11
            tt3 r11 = r12.h
            r6.Z(r13, r11)
        L239:
            r11 = 1
            goto L2ad
        L23c:
            r6.a0(r13)
            goto L239
        L240:
            r11 = 0
            r6.a0(r11)
            goto L239
        L245:
            int r11 = r12.d
            int r14 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.setAnimations(r11, r14, r15, r12)
            r11 = 1
            r6.Y(r13, r11)
            r6.h(r13)
            goto L239
        L258:
            int r11 = r12.d
            int r14 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.setAnimations(r11, r14, r15, r12)
            r6.c(r13)
            goto L239
        L267:
            int r11 = r12.d
            int r14 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.setAnimations(r11, r14, r15, r12)
            r11 = 1
            r6.Y(r13, r11)
            r6.J(r13)
            goto L239
        L27a:
            int r11 = r12.d
            int r14 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.setAnimations(r11, r14, r15, r12)
            r6.getClass()
            c0(r13)
            goto L239
        L28c:
            int r11 = r12.d
            int r14 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.setAnimations(r11, r14, r15, r12)
            r6.a(r13)
            goto L239
        L29b:
            int r11 = r12.d
            int r14 = r12.e
            int r15 = r12.f
            int r12 = r12.g
            r13.setAnimations(r11, r14, r15, r12)
            r11 = 1
            r6.Y(r13, r11)
            r6.T(r13)
        L2ad:
            int r10 = r10 + (-1)
            goto L1ed
        L2b1:
            r17 = r5
            r14 = 0
            goto L37a
        L2b6:
            r11 = 1
            r7.f(r11)
            androidx.fragment.app.u r6 = r7.t
            java.util.ArrayList r8 = r7.c
            int r10 = r8.size()
            r12 = 0
        L2c3:
            if (r12 >= r10) goto L2b1
            java.lang.Object r11 = r8.get(r12)
            ul2 r11 = (defpackage.ul2) r11
            androidx.fragment.app.o r13 = r11.b
            if (r13 == 0) goto L2e1
            r14 = 0
            r13.mBeingSaved = r14
            r13.setPopDirection(r14)
            int r14 = r7.h
            r13.setNextTransition(r14)
            java.util.ArrayList r14 = r7.p
            java.util.ArrayList r15 = r7.q
            r13.setSharedElementNames(r14, r15)
        L2e1:
            int r14 = r11.a
            switch(r14) {
                case 1: goto L360;
                case 2: goto L2e6;
                case 3: goto L34f;
                case 4: goto L33e;
                case 5: goto L329;
                case 6: goto L318;
                case 7: goto L303;
                case 8: goto L2ff;
                case 9: goto L2fa;
                case 10: goto L2ec;
                default: goto L2e6;
            }
        L2e6:
            int r0 = r11.a
            defpackage.e41.n(r0, r9)
            return
        L2ec:
            tt3 r14 = r13.mMaxState
            r11.h = r14
            tt3 r11 = r11.i
            r6.Z(r13, r11)
        L2f5:
            r17 = r5
        L2f7:
            r14 = 0
            goto L374
        L2fa:
            r11 = 0
            r6.a0(r11)
            goto L2f5
        L2ff:
            r6.a0(r13)
            goto L2f5
        L303:
            int r14 = r11.d
            int r15 = r11.e
            r17 = r5
            int r5 = r11.f
            int r11 = r11.g
            r13.setAnimations(r14, r15, r5, r11)
            r14 = 0
            r6.Y(r13, r14)
            r6.c(r13)
            goto L2f7
        L318:
            r17 = r5
            int r5 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r13.setAnimations(r5, r14, r15, r11)
            r6.h(r13)
            goto L2f7
        L329:
            r17 = r5
            int r5 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r13.setAnimations(r5, r14, r15, r11)
            r14 = 0
            r6.Y(r13, r14)
            c0(r13)
            goto L2f7
        L33e:
            r17 = r5
            int r5 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r13.setAnimations(r5, r14, r15, r11)
            r6.J(r13)
            goto L2f7
        L34f:
            r17 = r5
            int r5 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r13.setAnimations(r5, r14, r15, r11)
            r6.T(r13)
            goto L2f7
        L360:
            r17 = r5
            int r5 = r11.d
            int r14 = r11.e
            int r15 = r11.f
            int r11 = r11.g
            r13.setAnimations(r5, r14, r15, r11)
            r14 = 0
            r6.Y(r13, r14)
            r6.a(r13)
        L374:
            int r12 = r12 + 1
            r5 = r17
            goto L2c3
        L37a:
            int r5 = r17 + 1
            goto L1c9
        L37e:
            r14 = 0
            int r5 = r2 + (-1)
            java.lang.Object r5 = r4.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.util.ArrayList r7 = r0.n
            if (r23 == 0) goto L3fb
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L3fb
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            int r9 = r3.size()
            r12 = r14
        L39f:
            if (r12 >= r9) goto L3b1
            java.lang.Object r10 = r3.get(r12)
            int r12 = r12 + 1
            androidx.fragment.app.a r10 = (androidx.fragment.app.a) r10
            java.util.HashSet r10 = F(r10)
            r8.addAll(r10)
            goto L39f
        L3b1:
            androidx.fragment.app.a r9 = r0.h
            if (r9 != 0) goto L3fb
            int r9 = r7.size()
            r12 = r14
        L3ba:
            if (r12 >= r9) goto L3d8
            java.lang.Object r10 = r7.get(r12)
            int r12 = r12 + 1
            gd6 r10 = (defpackage.gd6) r10
            java.util.Iterator r11 = r8.iterator()
        L3c8:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L3ba
            java.lang.Object r13 = r11.next()
            androidx.fragment.app.o r13 = (androidx.fragment.app.o) r13
            r10.getClass()
            goto L3c8
        L3d8:
            int r9 = r7.size()
            r12 = r14
        L3dd:
            if (r12 >= r9) goto L3fb
            java.lang.Object r10 = r7.get(r12)
            int r12 = r12 + 1
            gd6 r10 = (defpackage.gd6) r10
            java.util.Iterator r11 = r8.iterator()
        L3eb:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L3dd
            java.lang.Object r13 = r11.next()
            androidx.fragment.app.o r13 = (androidx.fragment.app.o) r13
            r10.getClass()
            goto L3eb
        L3fb:
            r8 = r1
        L3fc:
            if (r8 >= r2) goto L448
            java.lang.Object r9 = r3.get(r8)
            androidx.fragment.app.a r9 = (androidx.fragment.app.a) r9
            if (r5 == 0) goto L428
            java.util.ArrayList r10 = r9.c
            int r10 = r10.size()
            r19 = 1
            int r10 = r10 + (-1)
        L410:
            if (r10 < 0) goto L445
            java.util.ArrayList r11 = r9.c
            java.lang.Object r11 = r11.get(r10)
            ul2 r11 = (defpackage.ul2) r11
            androidx.fragment.app.o r11 = r11.b
            if (r11 == 0) goto L425
            androidx.fragment.app.x r11 = r0.g(r11)
            r11.k()
        L425:
            int r10 = r10 + (-1)
            goto L410
        L428:
            java.util.ArrayList r9 = r9.c
            int r10 = r9.size()
            r12 = r14
        L42f:
            if (r12 >= r10) goto L445
            java.lang.Object r11 = r9.get(r12)
            int r12 = r12 + 1
            ul2 r11 = (defpackage.ul2) r11
            androidx.fragment.app.o r11 = r11.b
            if (r11 == 0) goto L42f
            androidx.fragment.app.x r11 = r0.g(r11)
            r11.k()
            goto L42f
        L445:
            int r8 = r8 + 1
            goto L3fc
        L448:
            int r8 = r0.v
            r11 = 1
            r0.O(r8, r11)
            java.util.HashSet r0 = r0.f(r3, r1, r2)
            java.util.Iterator r0 = r0.iterator()
        L456:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L46b
            java.lang.Object r8 = r0.next()
            androidx.fragment.app.h r8 = (androidx.fragment.app.h) r8
            r8.e = r5
            r8.l()
            r8.e()
            goto L456
        L46b:
            if (r1 >= r2) goto L4a6
            java.lang.Object r0 = r3.get(r1)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            java.lang.Object r5 = r4.get(r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L485
            int r5 = r0.v
            if (r5 < 0) goto L485
            r0.v = r6
        L485:
            java.util.ArrayList r5 = r0.s
            if (r5 == 0) goto L4a3
            r12 = r14
        L48a:
            java.util.ArrayList r5 = r0.s
            int r5 = r5.size()
            if (r12 >= r5) goto L4a0
            java.util.ArrayList r5 = r0.s
            java.lang.Object r5 = r5.get(r12)
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            int r12 = r12 + 1
            goto L48a
        L4a0:
            r11 = 0
            r0.s = r11
        L4a3:
            int r1 = r1 + 1
            goto L46b
        L4a6:
            if (r23 == 0) goto L4e5
            r8 = r14
        L4a9:
            int r0 = r7.size()
            if (r8 >= r0) goto L4e5
            java.lang.Object r0 = r7.get(r8)
            gd6 r0 = (defpackage.gd6) r0
            int r1 = r0.a
            switch(r1) {
                case 0: goto L4d9;
                default: goto L4ba;
            }
        L4ba:
            me.magnum.melonds.ui.settings.SettingsActivity r0 = r0.b
            s9 r1 = r0.E0
            if (r1 == 0) goto L4d1
            java.lang.Object r1 = r1.a
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            rk3 r2 = new rk3
            r3 = 10
            r2.<init>(r0, r3)
            r1.post(r2)
            r16 = 0
            goto L4e2
        L4d1:
            java.lang.String r0 = "binding"
            defpackage.nb3.a0(r0)
            r16 = 0
            throw r16
        L4d9:
            r16 = 0
            me.magnum.melonds.ui.settings.SettingsActivity r0 = r0.b
            int r1 = me.magnum.melonds.ui.settings.SettingsActivity.F0
            r0.D()
        L4e2:
            int r8 = r8 + 1
            goto L4a9
        L4e5:
            return
    }

    public final androidx.fragment.app.o C(int r5) {
            r4 = this;
            androidx.fragment.app.y r4 = r4.c
            java.util.ArrayList r0 = r4.a
            int r1 = r0.size()
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L1c
            java.lang.Object r2 = r0.get(r1)
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            if (r2 == 0) goto L19
            int r3 = r2.mFragmentId
            if (r3 != r5) goto L19
            return r2
        L19:
            int r1 = r1 + (-1)
            goto La
        L1c:
            java.util.HashMap r4 = r4.b
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L26:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto L26
            androidx.fragment.app.o r0 = r0.c
            int r1 = r0.mFragmentId
            if (r1 != r5) goto L26
            return r0
        L3b:
            r4 = 0
            return r4
    }

    public final androidx.fragment.app.o D(java.lang.String r5) {
            r4 = this;
            androidx.fragment.app.y r4 = r4.c
            java.util.ArrayList r0 = r4.a
            int r1 = r0.size()
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L20
            java.lang.Object r2 = r0.get(r1)
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            if (r2 == 0) goto L1d
            java.lang.String r3 = r2.mTag
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + (-1)
            goto La
        L20:
            java.util.HashMap r4 = r4.b
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto L2a
            androidx.fragment.app.o r0 = r0.c
            java.lang.String r1 = r0.mTag
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L2a
            return r0
        L43:
            r4 = 0
            return r4
    }

    public final void E() {
            r3 = this;
            java.util.HashSet r3 = r3.e()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.h r0 = (androidx.fragment.app.h) r0
            boolean r1 = r0.f
            if (r1 == 0) goto L8
            r1 = 2
            boolean r1 = K(r1)
            if (r1 == 0) goto L26
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Forcing postponed operations"
            android.util.Log.v(r1, r2)
        L26:
            r1 = 0
            r0.f = r1
            r0.e()
            goto L8
        L2d:
            return
    }

    public final android.view.ViewGroup G(androidx.fragment.app.o r2) {
            r1 = this;
            android.view.ViewGroup r0 = r2.mContainer
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r2.mContainerId
            if (r0 > 0) goto La
            goto L21
        La:
            zk2 r0 = r1.x
            boolean r0 = r0.j()
            if (r0 == 0) goto L21
            zk2 r1 = r1.x
            int r2 = r2.mContainerId
            android.view.View r1 = r1.c(r2)
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L21
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            return r1
        L21:
            r1 = 0
            return r1
    }

    public final defpackage.gl2 H() {
            r1 = this;
            androidx.fragment.app.o r0 = r1.y
            if (r0 == 0) goto Lb
            androidx.fragment.app.u r1 = r0.mFragmentManager
            gl2 r1 = r1.H()
            return r1
        Lb:
            gl2 r1 = r1.A
            return r1
    }

    public final defpackage.q61 I() {
            r1 = this;
            androidx.fragment.app.o r0 = r1.y
            if (r0 == 0) goto Lb
            androidx.fragment.app.u r1 = r0.mFragmentManager
            q61 r1 = r1.I()
            return r1
        Lb:
            q61 r1 = r1.B
            return r1
    }

    public final void J(androidx.fragment.app.o r3) {
            r2 = this;
            r0 = 2
            boolean r0 = K(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hide: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L29
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.b0(r3)
        L29:
            return
    }

    public final boolean M() {
            r2 = this;
            androidx.fragment.app.o r0 = r2.y
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L19
            androidx.fragment.app.o r2 = r2.y
            androidx.fragment.app.u r2 = r2.getParentFragmentManager()
            boolean r2 = r2.M()
            if (r2 == 0) goto L19
            return r1
        L19:
            r2 = 0
            return r2
    }

    public final void O(int r6, boolean r7) {
            r5 = this;
            cl2 r0 = r5.w
            if (r0 != 0) goto Le
            r0 = -1
            if (r6 != r0) goto L8
            goto Le
        L8:
            java.lang.String r5 = "No activity"
            defpackage.i.m(r5)
            return
        Le:
            if (r7 != 0) goto L16
            int r7 = r5.v
            if (r6 != r7) goto L16
            goto Lb9
        L16:
            r5.v = r6
            androidx.fragment.app.y r6 = r5.c
            java.util.HashMap r7 = r6.b
            java.util.ArrayList r0 = r6.a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L24:
            if (r3 >= r1) goto L3c
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.o r4 = (androidx.fragment.app.o) r4
            java.lang.String r4 = r4.mWho
            java.lang.Object r4 = r7.get(r4)
            androidx.fragment.app.x r4 = (androidx.fragment.app.x) r4
            if (r4 == 0) goto L24
            r4.k()
            goto L24
        L3c:
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r7.next()
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto L44
            r0.k()
            androidx.fragment.app.o r1 = r0.c
            boolean r3 = r1.mRemoving
            if (r3 == 0) goto L44
            boolean r3 = r1.isInBackStack()
            if (r3 != 0) goto L44
            boolean r3 = r1.mBeingSaved
            if (r3 == 0) goto L78
            java.util.HashMap r3 = r6.c
            java.lang.String r4 = r1.mWho
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L78
            java.lang.String r1 = r1.mWho
            android.os.Bundle r3 = r0.n()
            r6.i(r3, r1)
        L78:
            r6.h(r0)
            goto L44
        L7c:
            java.util.ArrayList r6 = r6.d()
            int r7 = r6.size()
            r0 = r2
        L85:
            if (r0 >= r7) goto La3
            java.lang.Object r1 = r6.get(r0)
            int r0 = r0 + 1
            androidx.fragment.app.x r1 = (androidx.fragment.app.x) r1
            androidx.fragment.app.o r3 = r1.c
            boolean r4 = r3.mDeferStart
            if (r4 == 0) goto L85
            boolean r4 = r5.b
            if (r4 == 0) goto L9d
            r1 = 1
            r5.K = r1
            goto L85
        L9d:
            r3.mDeferStart = r2
            r1.k()
            goto L85
        La3:
            boolean r6 = r5.G
            if (r6 == 0) goto Lb9
            cl2 r6 = r5.w
            if (r6 == 0) goto Lb9
            int r7 = r5.v
            r0 = 7
            if (r7 != r0) goto Lb9
            vk2 r6 = (defpackage.vk2) r6
            jq r6 = r6.X
            r6.invalidateOptionsMenu()
            r5.G = r2
        Lb9:
            return
    }

    public final void P() {
            r2 = this;
            cl2 r0 = r2.w
            if (r0 != 0) goto L5
            goto L2a
        L5:
            r0 = 0
            r2.H = r0
            r2.I = r0
            androidx.fragment.app.v r1 = r2.O
            r1.g = r0
            androidx.fragment.app.y r2 = r2.c
            java.util.List r2 = r2.f()
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L18
            r0.noteStateNotSaved()
            goto L18
        L2a:
            return
    }

    public final boolean Q() {
            r2 = this;
            r0 = -1
            r1 = 0
            boolean r2 = r2.R(r0, r1)
            return r2
    }

    public final boolean R(int r9, int r10) {
            r8 = this;
            r0 = 0
            r8.z(r0)
            r1 = 1
            r8.y(r1)
            androidx.fragment.app.o r2 = r8.z
            if (r2 == 0) goto L19
            if (r9 >= 0) goto L19
            androidx.fragment.app.u r2 = r2.getChildFragmentManager()
            boolean r2 = r2.Q()
            if (r2 == 0) goto L19
            return r1
        L19:
            java.util.ArrayList r2 = r8.L
            java.util.ArrayList r3 = r8.M
            boolean r9 = r8.S(r9, r10, r2, r3)
            if (r9 == 0) goto L35
            r8.b = r1
            java.util.ArrayList r10 = r8.L     // Catch: java.lang.Throwable -> L30
            java.util.ArrayList r2 = r8.M     // Catch: java.lang.Throwable -> L30
            r8.U(r10, r2)     // Catch: java.lang.Throwable -> L30
            r8.d()
            goto L35
        L30:
            r9 = move-exception
            r8.d()
            throw r9
        L35:
            r8.e0()
            boolean r10 = r8.K
            androidx.fragment.app.y r2 = r8.c
            if (r10 == 0) goto L66
            r8.K = r0
            java.util.ArrayList r10 = r2.d()
            int r3 = r10.size()
            r4 = r0
        L49:
            if (r4 >= r3) goto L66
            java.lang.Object r5 = r10.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.x r5 = (androidx.fragment.app.x) r5
            androidx.fragment.app.o r6 = r5.c
            boolean r7 = r6.mDeferStart
            if (r7 == 0) goto L49
            boolean r7 = r8.b
            if (r7 == 0) goto L60
            r8.K = r1
            goto L49
        L60:
            r6.mDeferStart = r0
            r5.k()
            goto L49
        L66:
            java.util.HashMap r8 = r2.b
            java.util.Collection r8 = r8.values()
            r10 = 0
            java.util.Set r10 = java.util.Collections.singleton(r10)
            r8.removeAll(r10)
            return r9
    }

    public final boolean S(int r6, int r7, java.util.ArrayList r8, java.util.ArrayList r9) {
            r5 = this;
            r0 = 1
            r7 = r7 & r0
            r1 = 0
            if (r7 == 0) goto L7
            r7 = r0
            goto L8
        L7:
            r7 = r1
        L8:
            java.util.ArrayList r2 = r5.d
            boolean r2 = r2.isEmpty()
            r3 = -1
            if (r2 == 0) goto L12
            goto L64
        L12:
            if (r6 >= 0) goto L21
            if (r7 == 0) goto L18
            r3 = r1
            goto L64
        L18:
            java.util.ArrayList r6 = r5.d
            int r6 = r6.size()
            int r3 = r6 + (-1)
            goto L64
        L21:
            java.util.ArrayList r2 = r5.d
            int r2 = r2.size()
            int r2 = r2 - r0
        L28:
            if (r2 < 0) goto L3c
            java.util.ArrayList r4 = r5.d
            java.lang.Object r4 = r4.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            if (r6 < 0) goto L39
            int r4 = r4.v
            if (r6 != r4) goto L39
            goto L3c
        L39:
            int r2 = r2 + (-1)
            goto L28
        L3c:
            if (r2 >= 0) goto L40
            r3 = r2
            goto L64
        L40:
            if (r7 == 0) goto L58
            r3 = r2
        L43:
            if (r3 <= 0) goto L64
            java.util.ArrayList r7 = r5.d
            int r2 = r3 + (-1)
            java.lang.Object r7 = r7.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r6 < 0) goto L64
            int r7 = r7.v
            if (r6 != r7) goto L64
            int r3 = r3 + (-1)
            goto L43
        L58:
            java.util.ArrayList r6 = r5.d
            int r6 = r6.size()
            int r6 = r6 - r0
            if (r2 != r6) goto L62
            goto L64
        L62:
            int r3 = r2 + 1
        L64:
            if (r3 >= 0) goto L67
            return r1
        L67:
            java.util.ArrayList r6 = r5.d
            int r6 = r6.size()
            int r6 = r6 - r0
        L6e:
            if (r6 < r3) goto L83
            java.util.ArrayList r7 = r5.d
            java.lang.Object r7 = r7.remove(r6)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            r8.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r9.add(r7)
            int r6 = r6 + (-1)
            goto L6e
        L83:
            return r0
    }

    public final void T(androidx.fragment.app.o r4) {
            r3 = this;
            r0 = 2
            boolean r0 = K(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "remove: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " nesting="
            r1.append(r2)
            int r2 = r4.mBackStackNesting
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L24:
            boolean r0 = r4.isInBackStack()
            boolean r1 = r4.mDetached
            if (r1 == 0) goto L30
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            return
        L30:
            androidx.fragment.app.y r0 = r3.c
            java.util.ArrayList r1 = r0.a
            monitor-enter(r1)
            java.util.ArrayList r0 = r0.a     // Catch: java.lang.Throwable -> L4d
            r0.remove(r4)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            r0 = 0
            r4.mAdded = r0
            boolean r0 = L(r4)
            r1 = 1
            if (r0 == 0) goto L47
            r3.G = r1
        L47:
            r4.mRemoving = r1
            r3.b0(r4)
            return
        L4d:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4d
            throw r3
    }

    public final void U(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            goto L5e
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L5f
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L17:
            if (r1 >= r0) goto L59
            java.lang.Object r3 = r5.get(r1)
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            boolean r3 = r3.r
            if (r3 != 0) goto L56
            if (r2 == r1) goto L28
            r4.B(r2, r1, r5, r6)
        L28:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
        L36:
            if (r2 >= r0) goto L51
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r5.get(r2)
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            boolean r3 = r3.r
            if (r3 != 0) goto L51
            int r2 = r2 + 1
            goto L36
        L51:
            r4.B(r1, r2, r5, r6)
            int r1 = r2 + (-1)
        L56:
            int r1 = r1 + 1
            goto L17
        L59:
            if (r2 == r0) goto L5e
            r4.B(r2, r0, r5, r6)
        L5e:
            return
        L5f:
            java.lang.String r4 = "Internal error with the back stack records"
            defpackage.i.m(r4)
            return
    }

    public final void V(android.os.Bundle r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "result_"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto Lc
            android.os.Bundle r4 = r1.getBundle(r3)
            if (r4 == 0) goto Lc
            cl2 r5 = r0.w
            jq r5 = r5.B
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r4.setClassLoader(r5)
            r5 = 7
            java.lang.String r3 = r3.substring(r5)
            java.util.Map r5 = r0.m
            r5.put(r3, r4)
            goto Lc
        L3c:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L49:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "fragment_"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L49
            android.os.Bundle r5 = r1.getBundle(r4)
            if (r5 == 0) goto L49
            cl2 r6 = r0.w
            jq r6 = r6.B
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r5.setClassLoader(r6)
            r6 = 9
            java.lang.String r4 = r4.substring(r6)
            r2.put(r4, r5)
            goto L49
        L78:
            androidx.fragment.app.y r3 = r0.c
            java.util.HashMap r4 = r3.c
            java.util.HashMap r5 = r3.b
            r4.clear()
            r4.putAll(r2)
            java.lang.String r2 = "state"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            ml2 r1 = (defpackage.ml2) r1
            if (r1 != 0) goto L8f
            return
        L8f:
            r5.clear()
            java.util.ArrayList r4 = r1.A
            int r6 = r4.size()
            r8 = 0
        L99:
            yc1 r9 = r0.o
            java.lang.String r10 = "): "
            r11 = 2
            java.lang.String r12 = "FragmentManager"
            if (r8 >= r6) goto L141
            java.lang.Object r13 = r4.get(r8)
            int r8 = r8 + 1
            java.lang.String r13 = (java.lang.String) r13
            r14 = 0
            android.os.Bundle r13 = r3.i(r14, r13)
            if (r13 == 0) goto L99
            android.os.Parcelable r14 = r13.getParcelable(r2)
            androidx.fragment.app.w r14 = (androidx.fragment.app.w) r14
            androidx.fragment.app.v r15 = r0.O
            java.lang.String r14 = r14.B
            java.util.HashMap r15 = r15.b
            java.lang.Object r14 = r15.get(r14)
            androidx.fragment.app.o r14 = (androidx.fragment.app.o) r14
            if (r14 == 0) goto Le8
            boolean r15 = K(r11)
            if (r15 == 0) goto Ldf
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r22 = r11
            java.lang.String r11 = "restoreSaveState: re-attaching retained "
            r15.<init>(r11)
            r15.append(r14)
            java.lang.String r11 = r15.toString()
            android.util.Log.v(r12, r11)
            goto Le1
        Ldf:
            r22 = r11
        Le1:
            androidx.fragment.app.x r11 = new androidx.fragment.app.x
            r11.<init>(r9, r3, r14, r13)
            r9 = r13
            goto L108
        Le8:
            r22 = r11
            androidx.fragment.app.x r15 = new androidx.fragment.app.x
            cl2 r9 = r0.w
            jq r9 = r9.B
            java.lang.ClassLoader r18 = r9.getClassLoader()
            gl2 r19 = r0.H()
            yc1 r9 = r0.o
            androidx.fragment.app.y r11 = r0.c
            r16 = r9
            r17 = r11
            r20 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            r9 = r20
            r11 = r15
        L108:
            androidx.fragment.app.o r13 = r11.c
            r13.mSavedFragmentState = r9
            r13.mFragmentManager = r0
            boolean r9 = K(r22)
            if (r9 == 0) goto L12d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r14 = "restoreSaveState: active ("
            r9.<init>(r14)
            java.lang.String r14 = r13.mWho
            r9.append(r14)
            r9.append(r10)
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r12, r9)
        L12d:
            cl2 r9 = r0.w
            jq r9 = r9.B
            java.lang.ClassLoader r9 = r9.getClassLoader()
            r11.l(r9)
            r3.g(r11)
            int r9 = r0.v
            r11.e = r9
            goto L99
        L141:
            r22 = r11
            androidx.fragment.app.v r2 = r0.O
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.HashMap r2 = r2.b
            java.util.Collection r2 = r2.values()
            r4.<init>(r2)
            int r2 = r4.size()
            r6 = 0
        L158:
            r8 = 1
            if (r6 >= r2) goto L1a4
            java.lang.Object r11 = r4.get(r6)
            int r6 = r6 + 1
            androidx.fragment.app.o r11 = (androidx.fragment.app.o) r11
            java.lang.String r13 = r11.mWho
            java.lang.Object r13 = r5.get(r13)
            if (r13 == 0) goto L16c
            goto L158
        L16c:
            boolean r13 = K(r22)
            if (r13 == 0) goto L18d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Discarding retained Fragment "
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r14 = " that was not found in the set of active Fragments "
            r13.append(r14)
            java.util.ArrayList r14 = r1.A
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r12, r13)
        L18d:
            androidx.fragment.app.v r13 = r0.O
            r13.i(r11)
            r11.mFragmentManager = r0
            androidx.fragment.app.x r13 = new androidx.fragment.app.x
            r13.<init>(r9, r3, r11)
            r13.e = r8
            r13.k()
            r11.mRemoving = r8
            r13.k()
            goto L158
        L1a4:
            java.util.ArrayList r2 = r1.B
            java.util.ArrayList r4 = r3.a
            r4.clear()
            if (r2 == 0) goto L1ef
            int r4 = r2.size()
            r5 = 0
        L1b2:
            if (r5 >= r4) goto L1ef
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            java.lang.String r6 = (java.lang.String) r6
            androidx.fragment.app.o r9 = r3.b(r6)
            if (r9 == 0) goto L1e3
            boolean r11 = K(r22)
            if (r11 == 0) goto L1df
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "restoreSaveState: added ("
            r11.<init>(r13)
            r11.append(r6)
            r11.append(r10)
            r11.append(r9)
            java.lang.String r6 = r11.toString()
            android.util.Log.v(r12, r6)
        L1df:
            r3.a(r9)
            goto L1b2
        L1e3:
            java.lang.String r0 = "No instantiated fragment for ("
            java.lang.String r1 = ")"
            java.lang.String r0 = defpackage.lb1.A(r0, r6, r1)
            defpackage.i.m(r0)
            return
        L1ef:
            androidx.fragment.app.b[] r2 = r1.L
            if (r2 == 0) goto L326
            java.util.ArrayList r2 = new java.util.ArrayList
            androidx.fragment.app.b[] r4 = r1.L
            int r4 = r4.length
            r2.<init>(r4)
            r0.d = r2
            r2 = 0
        L1fe:
            androidx.fragment.app.b[] r4 = r1.L
            int r5 = r4.length
            if (r2 >= r5) goto L324
            r4 = r4[r2]
            java.util.ArrayList r5 = r4.B
            androidx.fragment.app.a r6 = new androidx.fragment.app.a
            r6.<init>(r0)
            int[] r9 = r4.A
            r11 = 0
            r13 = 0
        L210:
            int r14 = r9.length
            if (r11 >= r14) goto L296
            ul2 r14 = new ul2
            r14.<init>()
            int r15 = r11 + 1
            r7 = r9[r11]
            r14.a = r7
            boolean r7 = K(r22)
            if (r7 == 0) goto L247
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Instantiate "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = " op #"
            r7.append(r8)
            r7.append(r13)
            java.lang.String r8 = " base fragment #"
            r7.append(r8)
            r8 = r9[r15]
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r12, r7)
        L247:
            tt3[] r7 = defpackage.tt3.values()
            int[] r8 = r4.L
            r8 = r8[r13]
            r7 = r7[r8]
            r14.h = r7
            tt3[] r7 = defpackage.tt3.values()
            int[] r8 = r4.R
            r8 = r8[r13]
            r7 = r7[r8]
            r14.i = r7
            int r7 = r11 + 2
            r8 = r9[r15]
            if (r8 == 0) goto L267
            r8 = 1
            goto L268
        L267:
            r8 = 0
        L268:
            r14.c = r8
            int r8 = r11 + 3
            r7 = r9[r7]
            r14.d = r7
            int r15 = r11 + 4
            r8 = r9[r8]
            r14.e = r8
            int r18 = r11 + 5
            r15 = r9[r15]
            r14.f = r15
            int r11 = r11 + 6
            r19 = r9
            r9 = r19[r18]
            r14.g = r9
            r6.d = r7
            r6.e = r8
            r6.f = r15
            r6.g = r9
            r6.b(r14)
            int r13 = r13 + 1
            r9 = r19
            r8 = 1
            goto L210
        L296:
            int r7 = r4.X
            r6.h = r7
            java.lang.String r7 = r4.Y
            r6.k = r7
            r7 = 1
            r6.i = r7
            int r7 = r4.d0
            r6.l = r7
            java.lang.CharSequence r7 = r4.e0
            r6.m = r7
            int r7 = r4.f0
            r6.n = r7
            java.lang.CharSequence r7 = r4.g0
            r6.o = r7
            java.util.ArrayList r7 = r4.h0
            r6.p = r7
            java.util.ArrayList r7 = r4.i0
            r6.q = r7
            boolean r7 = r4.j0
            r6.r = r7
            int r4 = r4.Z
            r6.v = r4
            r4 = 0
        L2c2:
            int r7 = r5.size()
            if (r4 >= r7) goto L2e1
            java.lang.Object r7 = r5.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L2de
            java.util.ArrayList r8 = r6.c
            java.lang.Object r8 = r8.get(r4)
            ul2 r8 = (defpackage.ul2) r8
            androidx.fragment.app.o r7 = r3.b(r7)
            r8.b = r7
        L2de:
            int r4 = r4 + 1
            goto L2c2
        L2e1:
            r7 = 1
            r6.f(r7)
            boolean r4 = K(r22)
            if (r4 == 0) goto L319
            java.lang.String r4 = "restoreAllState: back stack #"
            java.lang.String r5 = " (index "
            java.lang.StringBuilder r4 = defpackage.xg6.t(r4, r2, r5)
            int r5 = r6.v
            r4.append(r5)
            r4.append(r10)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r12, r4)
            qy3 r4 = new qy3
            r4.<init>()
            java.io.PrintWriter r5 = new java.io.PrintWriter
            r5.<init>(r4)
            java.lang.String r4 = "  "
            r8 = 0
            r6.j(r4, r5, r8)
            r5.close()
            goto L31a
        L319:
            r8 = 0
        L31a:
            java.util.ArrayList r4 = r0.d
            r4.add(r6)
            int r2 = r2 + 1
            r8 = r7
            goto L1fe
        L324:
            r8 = 0
            goto L32e
        L326:
            r8 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.d = r2
        L32e:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.k
            int r4 = r1.R
            r2.set(r4)
            java.lang.String r2 = r1.X
            if (r2 == 0) goto L342
            androidx.fragment.app.o r2 = r3.b(r2)
            r0.z = r2
            r0.r(r2)
        L342:
            java.util.ArrayList r2 = r1.Y
            if (r2 == 0) goto L363
            r7 = r8
        L347:
            int r3 = r2.size()
            if (r7 >= r3) goto L363
            java.lang.Object r3 = r2.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList r4 = r1.Z
            java.lang.Object r4 = r4.get(r7)
            l00 r4 = (defpackage.l00) r4
            java.util.Map r5 = r0.l
            r5.put(r3, r4)
            int r7 = r7 + 1
            goto L347
        L363:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            java.util.ArrayList r1 = r1.d0
            r2.<init>(r1)
            r0.F = r2
            return
    }

    public final android.os.Bundle W() {
            r15 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r15.E()
            r15.w()
            r1 = 1
            r15.z(r1)
            r15.H = r1
            androidx.fragment.app.v r2 = r15.O
            r2.g = r1
            androidx.fragment.app.y r1 = r15.c
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap r3 = r1.b
            int r4 = r3.size()
            r2.<init>(r4)
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r4 = r3.hasNext()
            r5 = 2
            if (r4 == 0) goto L70
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.x r4 = (androidx.fragment.app.x) r4
            if (r4 == 0) goto L2d
            androidx.fragment.app.o r6 = r4.c
            java.lang.String r7 = r6.mWho
            android.os.Bundle r4 = r4.n()
            r1.i(r4, r7)
            java.lang.String r4 = r6.mWho
            r2.add(r4)
            boolean r4 = K(r5)
            if (r4 == 0) goto L2d
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Saved state of "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r7 = ": "
            r5.append(r7)
            android.os.Bundle r6 = r6.mSavedFragmentState
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r4, r5)
            goto L2d
        L70:
            androidx.fragment.app.y r1 = r15.c
            java.util.HashMap r1 = r1.c
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L88
            boolean r15 = K(r5)
            if (r15 == 0) goto L1bc
            java.lang.String r15 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r15, r1)
            return r0
        L88:
            androidx.fragment.app.y r3 = r15.c
            java.util.ArrayList r4 = r3.a
            monitor-enter(r4)
            java.util.ArrayList r6 = r3.a     // Catch: java.lang.Throwable -> L9a
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L9a
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L9d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9a
            r6 = r8
            goto Le6
        L9a:
            r15 = move-exception
            goto L1bd
        L9d:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r9 = r3.a     // Catch: java.lang.Throwable -> L9a
            int r9 = r9.size()     // Catch: java.lang.Throwable -> L9a
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L9a
            java.util.ArrayList r3 = r3.a     // Catch: java.lang.Throwable -> L9a
            int r9 = r3.size()     // Catch: java.lang.Throwable -> L9a
            r10 = r7
        Laf:
            if (r10 >= r9) goto Le5
            java.lang.Object r11 = r3.get(r10)     // Catch: java.lang.Throwable -> L9a
            int r10 = r10 + 1
            androidx.fragment.app.o r11 = (androidx.fragment.app.o) r11     // Catch: java.lang.Throwable -> L9a
            java.lang.String r12 = r11.mWho     // Catch: java.lang.Throwable -> L9a
            r6.add(r12)     // Catch: java.lang.Throwable -> L9a
            boolean r12 = K(r5)     // Catch: java.lang.Throwable -> L9a
            if (r12 == 0) goto Laf
            java.lang.String r12 = "FragmentManager"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r13.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r14 = "saveAllState: adding fragment ("
            r13.append(r14)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r14 = r11.mWho     // Catch: java.lang.Throwable -> L9a
            r13.append(r14)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r14 = "): "
            r13.append(r14)     // Catch: java.lang.Throwable -> L9a
            r13.append(r11)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r11 = r13.toString()     // Catch: java.lang.Throwable -> L9a
            android.util.Log.v(r12, r11)     // Catch: java.lang.Throwable -> L9a
            goto Laf
        Le5:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9a
        Le6:
            java.util.ArrayList r3 = r15.d
            int r3 = r3.size()
            if (r3 <= 0) goto L124
            androidx.fragment.app.b[] r4 = new androidx.fragment.app.b[r3]
        Lf0:
            if (r7 >= r3) goto L125
            androidx.fragment.app.b r9 = new androidx.fragment.app.b
            java.util.ArrayList r10 = r15.d
            java.lang.Object r10 = r10.get(r7)
            androidx.fragment.app.a r10 = (androidx.fragment.app.a) r10
            r9.<init>(r10)
            r4[r7] = r9
            boolean r9 = K(r5)
            if (r9 == 0) goto L121
            java.lang.String r9 = "FragmentManager"
            java.lang.String r10 = "saveAllState: adding back stack #"
            java.lang.String r11 = ": "
            java.lang.StringBuilder r10 = defpackage.xg6.t(r10, r7, r11)
            java.util.ArrayList r11 = r15.d
            java.lang.Object r11 = r11.get(r7)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r9, r10)
        L121:
            int r7 = r7 + 1
            goto Lf0
        L124:
            r4 = r8
        L125:
            ml2 r3 = new ml2
            r3.<init>()
            r3.X = r8
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.Y = r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.Z = r7
            r3.A = r2
            r3.B = r6
            r3.L = r4
            java.util.concurrent.atomic.AtomicInteger r2 = r15.k
            int r2 = r2.get()
            r3.R = r2
            androidx.fragment.app.o r2 = r15.z
            if (r2 == 0) goto L150
            java.lang.String r2 = r2.mWho
            r3.X = r2
        L150:
            java.util.Map r2 = r15.l
            java.util.Set r2 = r2.keySet()
            r5.addAll(r2)
            java.util.Map r2 = r15.l
            java.util.Collection r2 = r2.values()
            r7.addAll(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayDeque r4 = r15.F
            r2.<init>(r4)
            r3.d0 = r2
            java.lang.String r2 = "state"
            r0.putParcelable(r2, r3)
            java.util.Map r2 = r15.m
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L17a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L198
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "result_"
            java.lang.String r4 = defpackage.i61.m(r4, r3)
            java.util.Map r5 = r15.m
            java.lang.Object r3 = r5.get(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.putBundle(r4, r3)
            goto L17a
        L198:
            java.util.Set r15 = r1.keySet()
            java.util.Iterator r15 = r15.iterator()
        L1a0:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L1bc
            java.lang.Object r2 = r15.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "fragment_"
            java.lang.String r3 = defpackage.i61.m(r3, r2)
            java.lang.Object r2 = r1.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0.putBundle(r3, r2)
            goto L1a0
        L1bc:
            return r0
        L1bd:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9a
            throw r15
    }

    public final void X() {
            r3 = this;
            java.util.ArrayList r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.a     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != r2) goto L24
            cl2 r1 = r3.w     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.L     // Catch: java.lang.Throwable -> L22
            g15 r2 = r3.P     // Catch: java.lang.Throwable -> L22
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L22
            cl2 r1 = r3.w     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.L     // Catch: java.lang.Throwable -> L22
            g15 r2 = r3.P     // Catch: java.lang.Throwable -> L22
            r1.post(r2)     // Catch: java.lang.Throwable -> L22
            r3.e0()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r3 = move-exception
            goto L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3
    }

    public final void Y(androidx.fragment.app.o r1, boolean r2) {
            r0 = this;
            android.view.ViewGroup r0 = r0.G(r1)
            if (r0 == 0) goto L11
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentContainerView
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r0 = (androidx.fragment.app.FragmentContainerView) r0
            r1 = r2 ^ 1
            r0.setDrawDisappearingViewsLast(r1)
        L11:
            return
    }

    public final void Z(androidx.fragment.app.o r3, defpackage.tt3 r4) {
            r2 = this;
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.y r1 = r2.c
            androidx.fragment.app.o r0 = r1.b(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L19
            cl2 r0 = r3.mHost
            if (r0 == 0) goto L16
            androidx.fragment.app.u r0 = r3.mFragmentManager
            if (r0 != r2) goto L19
        L16:
            r3.mMaxState = r4
            return
        L19:
            java.lang.String r4 = "Fragment "
            java.lang.String r0 = " is not an active fragment of FragmentManager "
            defpackage.fa6.f(r4, r3, r0, r2)
            return
    }

    public final androidx.fragment.app.x a(androidx.fragment.app.o r4) {
            r3 = this;
            java.lang.String r0 = r4.mPreviousWho
            if (r0 == 0) goto L7
            defpackage.tl2.c(r4, r0)
        L7:
            r0 = 2
            boolean r0 = K(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L21:
            androidx.fragment.app.x r0 = r3.g(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.y r1 = r3.c
            r1.g(r0)
            boolean r2 = r4.mDetached
            if (r2 != 0) goto L45
            r1.a(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L3c
            r4.mHiddenChanged = r1
        L3c:
            boolean r4 = L(r4)
            if (r4 == 0) goto L45
            r4 = 1
            r3.G = r4
        L45:
            return r0
    }

    public final void a0(androidx.fragment.app.o r3) {
            r2 = this;
            if (r3 == 0) goto L21
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.y r1 = r2.c
            androidx.fragment.app.o r0 = r1.b(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L19
            cl2 r0 = r3.mHost
            if (r0 == 0) goto L21
            androidx.fragment.app.u r0 = r3.mFragmentManager
            if (r0 != r2) goto L19
            goto L21
        L19:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " is not an active fragment of FragmentManager "
            defpackage.fa6.f(r0, r3, r1, r2)
            return
        L21:
            androidx.fragment.app.o r0 = r2.z
            r2.z = r3
            r2.r(r0)
            androidx.fragment.app.o r3 = r2.z
            r2.r(r3)
            return
    }

    public final void b(defpackage.cl2 r7, defpackage.zk2 r8, androidx.fragment.app.o r9) {
            r6 = this;
            cl2 r0 = r6.w
            if (r0 != 0) goto L184
            r6.w = r7
            r6.x = r8
            r6.y = r9
            java.util.concurrent.CopyOnWriteArrayList r8 = r6.p
            if (r9 == 0) goto L17
            hl2 r0 = new hl2
            r0.<init>(r9)
            r8.add(r0)
            goto L21
        L17:
            boolean r0 = r7 instanceof defpackage.ol2
            if (r0 == 0) goto L21
            r0 = r7
            ol2 r0 = (defpackage.ol2) r0
            r8.add(r0)
        L21:
            androidx.fragment.app.o r8 = r6.y
            if (r8 == 0) goto L28
            r6.e0()
        L28:
            boolean r8 = r7 instanceof defpackage.jl4
            if (r8 == 0) goto L3d
            r8 = r7
            jl4 r8 = (defpackage.jl4) r8
            il4 r0 = r8.b()
            r6.g = r0
            if (r9 == 0) goto L38
            r8 = r9
        L38:
            androidx.fragment.app.s r1 = r6.j
            r0.a(r8, r1)
        L3d:
            r8 = 0
            if (r9 == 0) goto L5f
            androidx.fragment.app.u r7 = r9.mFragmentManager
            androidx.fragment.app.v r7 = r7.O
            java.util.HashMap r0 = r7.c
            java.lang.String r1 = r9.mWho
            java.lang.Object r1 = r0.get(r1)
            androidx.fragment.app.v r1 = (androidx.fragment.app.v) r1
            if (r1 != 0) goto L5c
            androidx.fragment.app.v r1 = new androidx.fragment.app.v
            boolean r7 = r7.e
            r1.<init>(r7)
            java.lang.String r7 = r9.mWho
            r0.put(r7, r1)
        L5c:
            r6.O = r1
            goto La0
        L5f:
            boolean r0 = r7 instanceof defpackage.bp7
            if (r0 == 0) goto L99
            bp7 r7 = (defpackage.bp7) r7
            ap7 r7 = r7.getViewModelStore()
            r7.getClass()
            h71 r0 = defpackage.h71.b
            r0.getClass()
            eb r1 = new eb
            nl2 r2 = androidx.fragment.app.v.h
            r1.<init>(r7, r2, r0)
            java.lang.Class<androidx.fragment.app.v> r7 = androidx.fragment.app.v.class
            ar0 r7 = defpackage.gh5.a(r7)
            java.lang.String r0 = r7.b()
            if (r0 == 0) goto L93
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r2.concat(r0)
            qo7 r7 = r1.G(r7, r0)
            androidx.fragment.app.v r7 = (androidx.fragment.app.v) r7
            r6.O = r7
            goto La0
        L93:
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r6)
            return
        L99:
            androidx.fragment.app.v r7 = new androidx.fragment.app.v
            r7.<init>(r8)
            r6.O = r7
        La0:
            androidx.fragment.app.v r7 = r6.O
            boolean r0 = r6.H
            r1 = 1
            if (r0 != 0) goto Lae
            boolean r0 = r6.I
            if (r0 == 0) goto Lac
            goto Lae
        Lac:
            r0 = r8
            goto Laf
        Lae:
            r0 = r1
        Laf:
            r7.g = r0
            androidx.fragment.app.y r0 = r6.c
            r0.d = r7
            cl2 r7 = r6.w
            boolean r0 = r7 instanceof defpackage.g56
            r2 = 3
            if (r0 == 0) goto Ld7
            if (r9 != 0) goto Ld7
            g56 r7 = (defpackage.g56) r7
            d56 r7 = r7.getSavedStateRegistry()
            gv0 r0 = new gv0
            r0.<init>(r6, r2)
            java.lang.String r3 = "android:support:fragments"
            r7.c(r3, r0)
            android.os.Bundle r7 = r7.a(r3)
            if (r7 == 0) goto Ld7
            r6.V(r7)
        Ld7:
            cl2 r7 = r6.w
            boolean r0 = r7 instanceof defpackage.l9
            if (r0 == 0) goto L140
            l9 r7 = (defpackage.l9) r7
            j9 r7 = r7.g()
            if (r9 == 0) goto Lf3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r9.mWho
            java.lang.String r4 = ":"
            java.lang.String r0 = defpackage.i61.n(r0, r3, r4)
            goto Lf5
        Lf3:
            java.lang.String r0 = ""
        Lf5:
            java.lang.String r3 = "FragmentManager:"
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "StartActivityForResult"
            java.lang.String r3 = r0.concat(r3)
            c9 r4 = new c9
            r5 = 5
            r4.<init>(r5)
            el2 r5 = new el2
            r5.<init>(r6, r1)
            i9 r1 = r7.c(r3, r4, r5)
            r6.C = r1
            java.lang.String r1 = "StartIntentSenderForResult"
            java.lang.String r1 = r0.concat(r1)
            c9 r3 = new c9
            r4 = 7
            r3.<init>(r4)
            el2 r4 = new el2
            r5 = 2
            r4.<init>(r6, r5)
            i9 r1 = r7.c(r1, r3, r4)
            r6.D = r1
            java.lang.String r1 = "RequestPermissions"
            java.lang.String r0 = r0.concat(r1)
            c9 r1 = new c9
            r1.<init>(r2)
            el2 r2 = new el2
            r2.<init>(r6, r8)
            i9 r7 = r7.c(r0, r1, r2)
            r6.E = r7
        L140:
            cl2 r7 = r6.w
            boolean r8 = r7 instanceof defpackage.kl4
            if (r8 == 0) goto L14d
            kl4 r7 = (defpackage.kl4) r7
            dl2 r8 = r6.q
            r7.k(r8)
        L14d:
            cl2 r7 = r6.w
            boolean r8 = r7 instanceof defpackage.yl4
            if (r8 == 0) goto L15a
            yl4 r7 = (defpackage.yl4) r7
            dl2 r8 = r6.r
            r7.f(r8)
        L15a:
            cl2 r7 = r6.w
            boolean r8 = r7 instanceof defpackage.rl4
            if (r8 == 0) goto L167
            rl4 r7 = (defpackage.rl4) r7
            dl2 r8 = r6.s
            r7.e(r8)
        L167:
            cl2 r7 = r6.w
            boolean r8 = r7 instanceof defpackage.sl4
            if (r8 == 0) goto L174
            sl4 r7 = (defpackage.sl4) r7
            dl2 r8 = r6.t
            r7.d(r8)
        L174:
            cl2 r7 = r6.w
            boolean r8 = r7 instanceof defpackage.l44
            if (r8 == 0) goto L183
            if (r9 != 0) goto L183
            l44 r7 = (defpackage.l44) r7
            fl2 r6 = r6.u
            r7.m(r6)
        L183:
            return
        L184:
            java.lang.String r6 = "Already attached"
            defpackage.i.m(r6)
            return
    }

    public final void b0(androidx.fragment.app.o r3) {
            r2 = this;
            android.view.ViewGroup r2 = r2.G(r3)
            if (r2 == 0) goto L34
            int r0 = r3.getEnterAnim()
            int r1 = r3.getExitAnim()
            int r1 = r1 + r0
            int r0 = r3.getPopEnterAnim()
            int r0 = r0 + r1
            int r1 = r3.getPopExitAnim()
            int r1 = r1 + r0
            if (r1 <= 0) goto L34
            r0 = 2131428082(0x7f0b02f2, float:1.8477798E38)
            java.lang.Object r1 = r2.getTag(r0)
            if (r1 != 0) goto L27
            r2.setTag(r0, r3)
        L27:
            java.lang.Object r2 = r2.getTag(r0)
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            boolean r3 = r3.getPopDirection()
            r2.setPopDirection(r3)
        L34:
            return
    }

    public final void c(androidx.fragment.app.o r5) {
            r4 = this;
            r0 = 2
            boolean r1 = K(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "attach: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1a:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L4a
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L4a
            androidx.fragment.app.y r1 = r4.c
            r1.a(r5)
            boolean r0 = K(r0)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add from attach: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L41:
            boolean r5 = L(r5)
            if (r5 == 0) goto L4a
            r5 = 1
            r4.G = r5
        L4a:
            return
    }

    public final void d() {
            r1 = this;
            r0 = 0
            r1.b = r0
            java.util.ArrayList r0 = r1.M
            r0.clear()
            java.util.ArrayList r1 = r1.L
            r1.clear()
            return
    }

    public final void d0(java.lang.IllegalStateException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            qy3 r0 = new qy3
            r0.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            cl2 r0 = r7.w
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L31
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L2c
            vk2 r0 = (defpackage.vk2) r0     // Catch: java.lang.Exception -> L2c
            jq r0 = r0.X     // Catch: java.lang.Exception -> L2c
            r0.dump(r6, r5, r2, r7)     // Catch: java.lang.Exception -> L2c
            goto L3b
        L2c:
            r7 = move-exception
            android.util.Log.e(r1, r3, r7)
            goto L3b
        L31:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L37
            r7.v(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L37
            goto L3b
        L37:
            r7 = move-exception
            android.util.Log.e(r1, r3, r7)
        L3b:
            throw r8
    }

    public final java.util.HashSet e() {
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.y r1 = r8.c
            java.util.ArrayList r1 = r1.d()
            int r2 = r1.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L41
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.x r4 = (androidx.fragment.app.x) r4
            androidx.fragment.app.o r4 = r4.c
            android.view.ViewGroup r4 = r4.mContainer
            if (r4 == 0) goto L10
            q61 r5 = r8.I()
            r5.getClass()
            r5 = 2131427901(0x7f0b023d, float:1.8477431E38)
            java.lang.Object r6 = r4.getTag(r5)
            boolean r7 = r6 instanceof androidx.fragment.app.h
            if (r7 == 0) goto L35
            androidx.fragment.app.h r6 = (androidx.fragment.app.h) r6
            goto L3d
        L35:
            androidx.fragment.app.h r6 = new androidx.fragment.app.h
            r6.<init>(r4)
            r4.setTag(r5, r6)
        L3d:
            r0.add(r6)
            goto L10
        L41:
            return r0
    }

    public final void e0() {
            r5 = this;
            java.lang.String r0 = "FragmentManager "
            java.util.ArrayList r1 = r5.a
            monitor-enter(r1)
            java.util.ArrayList r2 = r5.a     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            r3 = 3
            r4 = 1
            if (r2 != 0) goto L35
            androidx.fragment.app.s r2 = r5.j     // Catch: java.lang.Throwable -> L31
            r2.f(r4)     // Catch: java.lang.Throwable -> L31
            boolean r2 = K(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L33
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L31
            r3.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r3.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L31
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r5 = move-exception
            goto L78
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            return
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r0 = r5.d
            int r0 = r0.size()
            androidx.fragment.app.a r1 = r5.h
            r2 = 0
            if (r1 == 0) goto L43
            r1 = r4
            goto L44
        L43:
            r1 = r2
        L44:
            int r0 = r0 + r1
            if (r0 <= 0) goto L50
            androidx.fragment.app.o r0 = r5.y
            boolean r0 = N(r0)
            if (r0 == 0) goto L50
            goto L51
        L50:
            r4 = r2
        L51:
            boolean r0 = K(r3)
            if (r0 == 0) goto L72
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " enabled state is "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L72:
            androidx.fragment.app.s r5 = r5.j
            r5.f(r4)
            return
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    public final java.util.HashSet f(java.util.ArrayList r6, int r7, int r8) {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r7 >= r8) goto L31
            java.lang.Object r1 = r6.get(r7)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList r1 = r1.c
            int r2 = r1.size()
            r3 = 0
        L14:
            if (r3 >= r2) goto L2e
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            ul2 r4 = (defpackage.ul2) r4
            androidx.fragment.app.o r4 = r4.b
            if (r4 == 0) goto L14
            android.view.ViewGroup r4 = r4.mContainer
            if (r4 == 0) goto L14
            androidx.fragment.app.h r4 = androidx.fragment.app.h.j(r4, r5)
            r0.add(r4)
            goto L14
        L2e:
            int r7 = r7 + 1
            goto L5
        L31:
            return r0
    }

    public final androidx.fragment.app.x g(androidx.fragment.app.o r4) {
            r3 = this;
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.y r1 = r3.c
            java.util.HashMap r2 = r1.b
            java.lang.Object r0 = r2.get(r0)
            androidx.fragment.app.x r0 = (androidx.fragment.app.x) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            androidx.fragment.app.x r0 = new androidx.fragment.app.x
            yc1 r2 = r3.o
            r0.<init>(r2, r1, r4)
            cl2 r4 = r3.w
            jq r4 = r4.B
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.l(r4)
            int r3 = r3.v
            r0.e = r3
            return r0
    }

    public final void h(androidx.fragment.app.o r5) {
            r4 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 2
            boolean r2 = K(r1)
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "detach: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r0, r2)
        L1a:
            boolean r2 = r5.mDetached
            if (r2 != 0) goto L59
            r2 = 1
            r5.mDetached = r2
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L59
            boolean r1 = K(r1)
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "remove from detach: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L3c:
            androidx.fragment.app.y r0 = r4.c
            java.util.ArrayList r1 = r0.a
            monitor-enter(r1)
            java.util.ArrayList r0 = r0.a     // Catch: java.lang.Throwable -> L56
            r0.remove(r5)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            r0 = 0
            r5.mAdded = r0
            boolean r0 = L(r5)
            if (r0 == 0) goto L52
            r4.G = r2
        L52:
            r4.b0(r5)
            return
        L56:
            r4 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r4
        L59:
            return
    }

    public final void i(boolean r3, android.content.res.Configuration r4) {
            r2 = this;
            if (r3 == 0) goto L15
            cl2 r0 = r2.w
            boolean r0 = r0 instanceof defpackage.kl4
            if (r0 != 0) goto L9
            goto L15
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."
            r3.<init>(r4)
            r2.d0(r3)
            r2 = 0
            throw r2
        L15:
            androidx.fragment.app.y r2 = r2.c
            java.util.List r2 = r2.f()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L1f
            r0.performConfigurationChanged(r4)
            if (r3 == 0) goto L1f
            androidx.fragment.app.u r0 = r0.mChildFragmentManager
            r1 = 1
            r0.i(r1, r4)
            goto L1f
        L39:
            return
    }

    public final boolean j(android.view.MenuItem r4) {
            r3 = this;
            int r0 = r3.v
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.y r3 = r3.c
            java.util.List r3 = r3.f()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L11
            boolean r0 = r0.performContextItemSelected(r4)
            if (r0 == 0) goto L11
            return r2
        L26:
            return r1
    }

    public final boolean k(android.view.Menu r8, android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.v
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.y r0 = r7.c
            java.util.List r0 = r0.f()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.o r5 = (androidx.fragment.app.o) r5
            if (r5 == 0) goto L13
            boolean r6 = r5.isMenuVisible()
            if (r6 == 0) goto L13
            boolean r6 = r5.performCreateOptionsMenu(r8, r9)
            if (r6 == 0) goto L13
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L34:
            r3.add(r5)
            r4 = r2
            goto L13
        L39:
            java.util.ArrayList r8 = r7.e
            if (r8 == 0) goto L5b
        L3d:
            java.util.ArrayList r8 = r7.e
            int r8 = r8.size()
            if (r1 >= r8) goto L5b
            java.util.ArrayList r8 = r7.e
            java.lang.Object r8 = r8.get(r1)
            androidx.fragment.app.o r8 = (androidx.fragment.app.o) r8
            if (r3 == 0) goto L55
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L58
        L55:
            r8.onDestroyOptionsMenu()
        L58:
            int r1 = r1 + 1
            goto L3d
        L5b:
            r7.e = r3
            return r4
    }

    public final void l() {
            r8 = this;
            r0 = 1
            r8.J = r0
            r8.z(r0)
            r8.w()
            cl2 r1 = r8.w
            boolean r2 = r1 instanceof defpackage.bp7
            androidx.fragment.app.y r3 = r8.c
            if (r2 == 0) goto L16
            androidx.fragment.app.v r0 = r3.d
            boolean r0 = r0.f
            goto L1f
        L16:
            jq r1 = r1.B
            if (r1 == 0) goto L1f
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L1f:
            if (r0 == 0) goto L4f
            java.util.Map r0 = r8.l
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            l00 r1 = (defpackage.l00) r1
            java.util.ArrayList r1 = r1.A
            int r2 = r1.size()
            r4 = 0
            r5 = r4
        L3f:
            if (r5 >= r2) goto L2b
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            java.lang.String r6 = (java.lang.String) r6
            androidx.fragment.app.v r7 = r3.d
            r7.g(r6, r4)
            goto L3f
        L4f:
            r0 = -1
            r8.u(r0)
            cl2 r0 = r8.w
            boolean r1 = r0 instanceof defpackage.yl4
            if (r1 == 0) goto L60
            yl4 r0 = (defpackage.yl4) r0
            dl2 r1 = r8.r
            r0.h(r1)
        L60:
            cl2 r0 = r8.w
            boolean r1 = r0 instanceof defpackage.kl4
            if (r1 == 0) goto L6d
            kl4 r0 = (defpackage.kl4) r0
            dl2 r1 = r8.q
            r0.l(r1)
        L6d:
            cl2 r0 = r8.w
            boolean r1 = r0 instanceof defpackage.rl4
            if (r1 == 0) goto L7a
            rl4 r0 = (defpackage.rl4) r0
            dl2 r1 = r8.s
            r0.o(r1)
        L7a:
            cl2 r0 = r8.w
            boolean r1 = r0 instanceof defpackage.sl4
            if (r1 == 0) goto L87
            sl4 r0 = (defpackage.sl4) r0
            dl2 r1 = r8.t
            r0.n(r1)
        L87:
            cl2 r0 = r8.w
            boolean r1 = r0 instanceof defpackage.l44
            if (r1 == 0) goto L98
            androidx.fragment.app.o r1 = r8.y
            if (r1 != 0) goto L98
            l44 r0 = (defpackage.l44) r0
            fl2 r1 = r8.u
            r0.i(r1)
        L98:
            r0 = 0
            r8.w = r0
            r8.x = r0
            r8.y = r0
            il4 r1 = r8.g
            if (r1 == 0) goto Laa
            androidx.fragment.app.s r1 = r8.j
            r1.e()
            r8.g = r0
        Laa:
            i9 r0 = r8.C
            if (r0 == 0) goto Lbb
            r0.b()
            i9 r0 = r8.D
            r0.b()
            i9 r8 = r8.E
            r8.b()
        Lbb:
            return
    }

    public final void m(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L15
            cl2 r0 = r2.w
            boolean r0 = r0 instanceof defpackage.yl4
            if (r0 != 0) goto L9
            goto L15
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."
            r3.<init>(r0)
            r2.d0(r3)
            r2 = 0
            throw r2
        L15:
            androidx.fragment.app.y r2 = r2.c
            java.util.List r2 = r2.f()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L1f
            r0.performLowMemory()
            if (r3 == 0) goto L1f
            androidx.fragment.app.u r0 = r0.mChildFragmentManager
            r1 = 1
            r0.m(r1)
            goto L1f
        L39:
            return
    }

    public final void n(boolean r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L15
            cl2 r0 = r2.w
            boolean r0 = r0 instanceof defpackage.rl4
            if (r0 != 0) goto L9
            goto L15
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."
            r3.<init>(r4)
            r2.d0(r3)
            r2 = 0
            throw r2
        L15:
            androidx.fragment.app.y r2 = r2.c
            java.util.List r2 = r2.f()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L1f
            r0.performMultiWindowModeChanged(r3)
            if (r4 == 0) goto L1f
            androidx.fragment.app.u r0 = r0.mChildFragmentManager
            r1 = 1
            r0.n(r3, r1)
            goto L1f
        L39:
            return
    }

    public final void o() {
            r4 = this;
            androidx.fragment.app.y r4 = r4.c
            java.util.ArrayList r4 = r4.e()
            int r0 = r4.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L24
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            if (r2 == 0) goto Lb
            boolean r3 = r2.isHidden()
            r2.onHiddenChanged(r3)
            androidx.fragment.app.u r2 = r2.mChildFragmentManager
            r2.o()
            goto Lb
        L24:
            return
    }

    public final boolean p(android.view.MenuItem r4) {
            r3 = this;
            int r0 = r3.v
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.y r3 = r3.c
            java.util.List r3 = r3.f()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r3.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L11
            boolean r0 = r0.performOptionsItemSelected(r4)
            if (r0 == 0) goto L11
            return r2
        L26:
            return r1
    }

    public final void q(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.v
            r1 = 1
            if (r0 >= r1) goto L6
            goto L22
        L6:
            androidx.fragment.app.y r2 = r2.c
            java.util.List r2 = r2.f()
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L10
            r0.performOptionsMenuClosed(r3)
            goto L10
        L22:
            return
    }

    public final void r(androidx.fragment.app.o r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.y r1 = r1.c
            androidx.fragment.app.o r1 = r1.b(r0)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L13
            r2.performPrimaryNavigationFragmentChanged()
        L13:
            return
    }

    public final void s(boolean r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L15
            cl2 r0 = r2.w
            boolean r0 = r0 instanceof defpackage.sl4
            if (r0 != 0) goto L9
            goto L15
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."
            r3.<init>(r4)
            r2.d0(r3)
            r2 = 0
            throw r2
        L15:
            androidx.fragment.app.y r2 = r2.c
            java.util.List r2 = r2.f()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L1f
            r0.performPictureInPictureModeChanged(r3)
            if (r4 == 0) goto L1f
            androidx.fragment.app.u r0 = r0.mChildFragmentManager
            r1 = 1
            r0.s(r3, r1)
            goto L1f
        L39:
            return
    }

    public final boolean t(android.view.Menu r5) {
            r4 = this;
            int r0 = r4.v
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.y r4 = r4.c
            java.util.List r4 = r4.f()
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            if (r0 == 0) goto L11
            boolean r3 = r0.isMenuVisible()
            if (r3 == 0) goto L11
            boolean r0 = r0.performPrepareOptionsMenu(r5)
            if (r0 == 0) goto L11
            r1 = r2
            goto L11
        L2d:
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.o r1 = r4.y
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.o r4 = r4.y
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            r0.append(r2)
            goto L6b
        L43:
            cl2 r1 = r4.w
            if (r1 == 0) goto L66
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            cl2 r4 = r4.w
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            r0.append(r2)
            goto L6b
        L66:
            java.lang.String r4 = "null"
            r0.append(r4)
        L6b:
            java.lang.String r4 = "}}"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public final void u(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r4.b = r0     // Catch: java.lang.Throwable -> L3c
            androidx.fragment.app.y r2 = r4.c     // Catch: java.lang.Throwable -> L3c
            java.util.HashMap r2 = r2.b     // Catch: java.lang.Throwable -> L3c
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3c
        L10:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3c
            androidx.fragment.app.x r3 = (androidx.fragment.app.x) r3     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L10
            r3.e = r5     // Catch: java.lang.Throwable -> L3c
            goto L10
        L21:
            r4.O(r5, r1)     // Catch: java.lang.Throwable -> L3c
            java.util.HashSet r5 = r4.e()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3c
        L2c:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L3c
            androidx.fragment.app.h r2 = (androidx.fragment.app.h) r2     // Catch: java.lang.Throwable -> L3c
            r2.i()     // Catch: java.lang.Throwable -> L3c
            goto L2c
        L3c:
            r5 = move-exception
            goto L44
        L3e:
            r4.b = r1
            r4.z(r0)
            return
        L44:
            r4.b = r1
            throw r5
    }

    public final void v(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.y r1 = r5.c
            java.util.ArrayList r2 = r1.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "    "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.HashMap r1 = r1.b
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L5e
            r8.print(r6)
            java.lang.String r4 = "Active Fragments:"
            r8.println(r4)
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.x r4 = (androidx.fragment.app.x) r4
            r8.print(r6)
            if (r4 == 0) goto L58
            androidx.fragment.app.o r4 = r4.c
            r8.println(r4)
            r4.dump(r3, r7, r8, r9)
            goto L3e
        L58:
            java.lang.String r4 = "null"
            r8.println(r4)
            goto L3e
        L5e:
            int r7 = r2.size()
            r9 = 0
            if (r7 <= 0) goto L90
            r8.print(r6)
            java.lang.String r1 = "Added Fragments:"
            r8.println(r1)
            r1 = r9
        L6e:
            if (r1 >= r7) goto L90
            java.lang.Object r3 = r2.get(r1)
            androidx.fragment.app.o r3 = (androidx.fragment.app.o) r3
            r8.print(r6)
            java.lang.String r4 = "  #"
            r8.print(r4)
            r8.print(r1)
            java.lang.String r4 = ": "
            r8.print(r4)
            java.lang.String r3 = r3.toString()
            r8.println(r3)
            int r1 = r1 + 1
            goto L6e
        L90:
            java.util.ArrayList r7 = r5.e
            if (r7 == 0) goto Lc7
            int r7 = r7.size()
            if (r7 <= 0) goto Lc7
            r8.print(r6)
            java.lang.String r1 = "Fragments Created Menus:"
            r8.println(r1)
            r1 = r9
        La3:
            if (r1 >= r7) goto Lc7
            java.util.ArrayList r2 = r5.e
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.o r2 = (androidx.fragment.app.o) r2
            r8.print(r6)
            java.lang.String r3 = "  #"
            r8.print(r3)
            r8.print(r1)
            java.lang.String r3 = ": "
            r8.print(r3)
            java.lang.String r2 = r2.toString()
            r8.println(r2)
            int r1 = r1 + 1
            goto La3
        Lc7:
            java.util.ArrayList r7 = r5.d
            int r7 = r7.size()
            if (r7 <= 0) goto L100
            r8.print(r6)
            java.lang.String r1 = "Back Stack:"
            r8.println(r1)
            r1 = r9
        Ld8:
            if (r1 >= r7) goto L100
            java.util.ArrayList r2 = r5.d
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            r8.print(r6)
            java.lang.String r3 = "  #"
            r8.print(r3)
            r8.print(r1)
            java.lang.String r3 = ": "
            r8.print(r3)
            java.lang.String r3 = r2.toString()
            r8.println(r3)
            r3 = 1
            r2.j(r0, r8, r3)
            int r1 = r1 + 1
            goto Ld8
        L100:
            r8.print(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Back Stack Index: "
            r7.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r5.k
            int r0 = r0.get()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r8.println(r7)
            java.util.ArrayList r7 = r5.a
            monitor-enter(r7)
            java.util.ArrayList r0 = r5.a     // Catch: java.lang.Throwable -> L14d
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L14d
            if (r0 <= 0) goto L14f
            r8.print(r6)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r1 = "Pending Actions:"
            r8.println(r1)     // Catch: java.lang.Throwable -> L14d
        L12d:
            if (r9 >= r0) goto L14f
            java.util.ArrayList r1 = r5.a     // Catch: java.lang.Throwable -> L14d
            java.lang.Object r1 = r1.get(r9)     // Catch: java.lang.Throwable -> L14d
            jl2 r1 = (defpackage.jl2) r1     // Catch: java.lang.Throwable -> L14d
            r8.print(r6)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r2 = "  #"
            r8.print(r2)     // Catch: java.lang.Throwable -> L14d
            r8.print(r9)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r2 = ": "
            r8.print(r2)     // Catch: java.lang.Throwable -> L14d
            r8.println(r1)     // Catch: java.lang.Throwable -> L14d
            int r9 = r9 + 1
            goto L12d
        L14d:
            r5 = move-exception
            goto L1c0
        L14f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L14d
            r8.print(r6)
            java.lang.String r7 = "FragmentManager misc state:"
            r8.println(r7)
            r8.print(r6)
            java.lang.String r7 = "  mHost="
            r8.print(r7)
            cl2 r7 = r5.w
            r8.println(r7)
            r8.print(r6)
            java.lang.String r7 = "  mContainer="
            r8.print(r7)
            zk2 r7 = r5.x
            r8.println(r7)
            androidx.fragment.app.o r7 = r5.y
            if (r7 == 0) goto L183
            r8.print(r6)
            java.lang.String r7 = "  mParent="
            r8.print(r7)
            androidx.fragment.app.o r7 = r5.y
            r8.println(r7)
        L183:
            r8.print(r6)
            java.lang.String r7 = "  mCurState="
            r8.print(r7)
            int r7 = r5.v
            r8.print(r7)
            java.lang.String r7 = " mStateSaved="
            r8.print(r7)
            boolean r7 = r5.H
            r8.print(r7)
            java.lang.String r7 = " mStopped="
            r8.print(r7)
            boolean r7 = r5.I
            r8.print(r7)
            java.lang.String r7 = " mDestroyed="
            r8.print(r7)
            boolean r7 = r5.J
            r8.println(r7)
            boolean r7 = r5.G
            if (r7 == 0) goto L1bf
            r8.print(r6)
            java.lang.String r6 = "  mNeedMenuInvalidate="
            r8.print(r6)
            boolean r5 = r5.G
            r8.println(r5)
        L1bf:
            return
        L1c0:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L14d
            throw r5
    }

    public final void w() {
            r1 = this;
            java.util.HashSet r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            androidx.fragment.app.h r0 = (androidx.fragment.app.h) r0
            r0.i()
            goto L8
        L18:
            return
    }

    public final void x(defpackage.jl2 r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L25
            cl2 r0 = r2.w
            if (r0 != 0) goto L16
            boolean r2 = r2.J
            if (r2 == 0) goto L10
            java.lang.String r2 = "FragmentManager has been destroyed"
            defpackage.i.m(r2)
            return
        L10:
            java.lang.String r2 = "FragmentManager has not been attached to a host."
            defpackage.i.m(r2)
            return
        L16:
            boolean r0 = r2.H
            if (r0 != 0) goto L1f
            boolean r0 = r2.I
            if (r0 != 0) goto L1f
            goto L25
        L1f:
            java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
            defpackage.i.m(r2)
            return
        L25:
            java.util.ArrayList r0 = r2.a
            monitor-enter(r0)
            cl2 r1 = r2.w     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L3a
            if (r4 == 0) goto L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r2 = move-exception
            goto L44
        L32:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L3a:
            java.util.ArrayList r4 = r2.a     // Catch: java.lang.Throwable -> L30
            r4.add(r3)     // Catch: java.lang.Throwable -> L30
            r2.X()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r2
    }

    public final void y(boolean r3) {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L50
            cl2 r0 = r2.w
            if (r0 != 0) goto L18
            boolean r2 = r2.J
            if (r2 == 0) goto L12
            java.lang.String r2 = "FragmentManager has been destroyed"
            defpackage.i.m(r2)
            return
        L12:
            java.lang.String r2 = "FragmentManager has not been attached to a host."
            defpackage.i.m(r2)
            return
        L18:
            android.os.Looper r0 = android.os.Looper.myLooper()
            cl2 r1 = r2.w
            android.os.Handler r1 = r1.L
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L4a
            if (r3 != 0) goto L37
            boolean r3 = r2.H
            if (r3 != 0) goto L31
            boolean r3 = r2.I
            if (r3 != 0) goto L31
            goto L37
        L31:
            java.lang.String r2 = "Can not perform this action after onSaveInstanceState"
            defpackage.i.m(r2)
            return
        L37:
            java.util.ArrayList r3 = r2.L
            if (r3 != 0) goto L49
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.L = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.M = r3
        L49:
            return
        L4a:
            java.lang.String r2 = "Must be called from main thread of fragment host"
            defpackage.i.m(r2)
            return
        L50:
            java.lang.String r2 = "FragmentManager is already executing transactions"
            defpackage.i.m(r2)
            return
    }

    public final boolean z(boolean r10) {
            r9 = this;
            r9.y(r10)
            boolean r10 = r9.i
            r0 = 0
            r1 = 0
            if (r10 != 0) goto L60
            androidx.fragment.app.a r10 = r9.h
            if (r10 == 0) goto L60
            r10.u = r1
            r10.g()
            r10 = 3
            boolean r10 = K(r10)
            if (r10 == 0) goto L38
            java.lang.String r10 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Reversing mTransitioningOp "
            r2.<init>(r3)
            androidx.fragment.app.a r3 = r9.h
            r2.append(r3)
            java.lang.String r3 = " as part of execPendingActions for actions "
            r2.append(r3)
            java.util.ArrayList r3 = r9.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r10, r2)
        L38:
            androidx.fragment.app.a r10 = r9.h
            r10.i(r1, r1)
            java.util.ArrayList r10 = r9.a
            androidx.fragment.app.a r2 = r9.h
            r10.add(r1, r2)
            androidx.fragment.app.a r10 = r9.h
            java.util.ArrayList r10 = r10.c
            int r2 = r10.size()
            r3 = r1
        L4d:
            if (r3 >= r2) goto L5e
            java.lang.Object r4 = r10.get(r3)
            int r3 = r3 + 1
            ul2 r4 = (defpackage.ul2) r4
            androidx.fragment.app.o r4 = r4.b
            if (r4 == 0) goto L4d
            r4.mTransitioning = r1
            goto L4d
        L5e:
            r9.h = r0
        L60:
            r10 = r1
        L61:
            java.util.ArrayList r2 = r9.L
            java.util.ArrayList r3 = r9.M
            java.util.ArrayList r4 = r9.a
            monitor-enter(r4)
            java.util.ArrayList r5 = r9.a     // Catch: java.lang.Throwable -> L73
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L76
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            r7 = r1
            goto L9f
        L73:
            r9 = move-exception
            goto L105
        L76:
            java.util.ArrayList r5 = r9.a     // Catch: java.lang.Throwable -> L90
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L90
            r6 = r1
            r7 = r6
        L7e:
            java.util.ArrayList r8 = r9.a
            if (r6 >= r5) goto L92
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L90
            jl2 r8 = (defpackage.jl2) r8     // Catch: java.lang.Throwable -> L90
            boolean r8 = r8.a(r2, r3)     // Catch: java.lang.Throwable -> L90
            r7 = r7 | r8
            int r6 = r6 + 1
            goto L7e
        L90:
            r10 = move-exception
            goto Lf6
        L92:
            r8.clear()     // Catch: java.lang.Throwable -> L73
            cl2 r2 = r9.w     // Catch: java.lang.Throwable -> L73
            android.os.Handler r2 = r2.L     // Catch: java.lang.Throwable -> L73
            g15 r3 = r9.P     // Catch: java.lang.Throwable -> L73
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L73
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
        L9f:
            r2 = 1
            if (r7 == 0) goto Lb5
            r9.b = r2
            java.util.ArrayList r10 = r9.L     // Catch: java.lang.Throwable -> Lb0
            java.util.ArrayList r3 = r9.M     // Catch: java.lang.Throwable -> Lb0
            r9.U(r10, r3)     // Catch: java.lang.Throwable -> Lb0
            r9.d()
            r10 = r2
            goto L61
        Lb0:
            r10 = move-exception
            r9.d()
            throw r10
        Lb5:
            r9.e0()
            boolean r3 = r9.K
            if (r3 == 0) goto Le6
            r9.K = r1
            androidx.fragment.app.y r3 = r9.c
            java.util.ArrayList r3 = r3.d()
            int r4 = r3.size()
            r5 = r1
        Lc9:
            if (r5 >= r4) goto Le6
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            androidx.fragment.app.x r6 = (androidx.fragment.app.x) r6
            androidx.fragment.app.o r7 = r6.c
            boolean r8 = r7.mDeferStart
            if (r8 == 0) goto Lc9
            boolean r8 = r9.b
            if (r8 == 0) goto Le0
            r9.K = r2
            goto Lc9
        Le0:
            r7.mDeferStart = r1
            r6.k()
            goto Lc9
        Le6:
            androidx.fragment.app.y r9 = r9.c
            java.util.HashMap r9 = r9.b
            java.util.Collection r9 = r9.values()
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r9.removeAll(r0)
            return r10
        Lf6:
            java.util.ArrayList r0 = r9.a     // Catch: java.lang.Throwable -> L73
            r0.clear()     // Catch: java.lang.Throwable -> L73
            cl2 r0 = r9.w     // Catch: java.lang.Throwable -> L73
            android.os.Handler r0 = r0.L     // Catch: java.lang.Throwable -> L73
            g15 r9 = r9.P     // Catch: java.lang.Throwable -> L73
            r0.removeCallbacks(r9)     // Catch: java.lang.Throwable -> L73
            throw r10     // Catch: java.lang.Throwable -> L73
        L105:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L73
            throw r9
    }
}
