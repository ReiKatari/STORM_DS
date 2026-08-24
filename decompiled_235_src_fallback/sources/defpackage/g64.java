package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g64  reason: default package */
/* loaded from: classes.dex */
public final class g64 implements defpackage.y54 {
    public final /* synthetic */ int a;
    public final android.content.Context b;

    public /* synthetic */ g64(android.content.Context r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public g64(defpackage.yc1 r1, android.content.Context r2) {
            r0 = this;
            r1 = 1
            r0.a = r1
            r0.<init>()
            r0.b = r2
            return
    }

    private final void d() {
            r36 = this;
            java.lang.String r0 = "secondaryScreenLayoutDto"
            java.lang.String r1 = "mainScreenLayoutDto"
            java.lang.String r2 = "displays"
            java.lang.String r3 = "layoutVariants"
            java.lang.String r4 = "id"
            java.lang.String r5 = "layout"
            java.lang.String r6 = "variant"
            java.io.File r7 = new java.io.File
            r8 = r36
            android.content.Context r8 = r8.b
            java.io.File r9 = r8.getFilesDir()
            java.lang.String r10 = "layouts.json"
            r7.<init>(r9, r10)
            boolean r9 = r7.isFile()
            if (r9 != 0) goto L25
            goto L69e
        L25:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 29
            if (r9 >= r10) goto L2c
            goto L6e
        L2c:
            java.lang.Class<android.view.WindowManager> r11 = android.view.WindowManager.class
            java.lang.Object r11 = r8.getSystemService(r11)
            android.view.WindowManager r11 = (android.view.WindowManager) r11
            if (r11 != 0) goto L37
            goto L6e
        L37:
            r12 = 30
            if (r9 < r12) goto L64
            android.view.WindowMetrics r9 = defpackage.m2.n(r11)
            android.view.WindowInsets r9 = defpackage.m2.l(r9)
            int r11 = defpackage.zm6.D()
            android.graphics.Insets r9 = defpackage.zm6.v(r9, r11)
            r9.getClass()
            d83 r11 = new d83
            int r12 = defpackage.yz0.a(r9)
            int r13 = defpackage.yz0.z(r9)
            int r14 = defpackage.yz0.B(r9)
            int r9 = defpackage.yz0.D(r9)
            r11.<init>(r12, r13, r14, r9)
            goto L86
        L64:
            android.view.Display r9 = r11.getDefaultDisplay()
            android.view.DisplayCutout r9 = defpackage.yz0.f(r9)
            if (r9 != 0) goto L71
        L6e:
            d83 r11 = defpackage.d83.e
            goto L86
        L71:
            d83 r11 = new d83
            int r12 = defpackage.j2.x(r9)
            int r13 = defpackage.j2.b(r9)
            int r14 = defpackage.j2.C(r9)
            int r9 = defpackage.j2.B(r9)
            r11.<init>(r12, r13, r14, r9)
        L86:
            int r9 = r11.d
            int r12 = r11.c
            int r13 = r11.b
            int r11 = r11.a
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            int r8 = r8.orientation
            r14 = 1
            if (r8 != r14) goto L9c
            goto L9d
        L9c:
            r14 = 0
        L9d:
            v83 r8 = new v83
            r8.<init>(r10)
            pe3 r8 = defpackage.ii2.g(r8)
            java.lang.String r10 = defpackage.jc2.B0(r7)     // Catch: java.lang.Exception -> L687
            he3 r15 = defpackage.he3.a     // Catch: java.lang.Exception -> L687
            java.lang.Object r8 = r8.a(r15, r10)     // Catch: java.lang.Exception -> L687
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L687
            nd3 r8 = defpackage.fe3.f(r8)     // Catch: java.lang.Exception -> L687
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> L687
            r10.<init>()     // Catch: java.lang.Exception -> L687
            java.util.List r8 = r8.A     // Catch: java.lang.Exception -> L687
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L687
        Lc1:
            boolean r15 = r8.hasNext()     // Catch: java.lang.Exception -> L687
            if (r15 == 0) goto L689
            java.lang.Object r15 = r8.next()     // Catch: java.lang.Exception -> L687
            de3 r15 = (defpackage.de3) r15     // Catch: java.lang.Exception -> L687
            r16 = 0
            r36 = r8
            ye3 r8 = defpackage.fe3.g(r15)     // Catch: java.lang.Exception -> L650
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Exception -> L650
            r8.getClass()     // Catch: java.lang.Exception -> L650
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L650
            nd3 r8 = defpackage.fe3.f(r8)     // Catch: java.lang.Exception -> L650
            r17 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Exception -> L63e
            r18 = r15
            r15 = 10
            r19 = r7
            int r7 = defpackage.ht0.v0(r8, r15)     // Catch: java.lang.Exception -> L62e
            r14.<init>(r7)     // Catch: java.lang.Exception -> L62e
            java.util.List r7 = r8.A     // Catch: java.lang.Exception -> L62e
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L62e
        Lf9:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> L62e
            if (r8 == 0) goto L604
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> L5f3
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L5f3
            ye3 r15 = defpackage.fe3.g(r8)     // Catch: java.lang.Exception -> L5f3
            java.lang.Object r15 = r15.get(r6)     // Catch: java.lang.Exception -> L5f3
            r15.getClass()     // Catch: java.lang.Exception -> L5f3
            de3 r15 = (defpackage.de3) r15     // Catch: java.lang.Exception -> L5f3
            ye3 r15 = defpackage.fe3.g(r15)     // Catch: java.lang.Exception -> L5f3
            r21 = r7
            java.lang.String r7 = "PORTRAIT"
            r22 = r8
            java.lang.String r8 = "orientation"
            r23 = r10
            java.lang.String r10 = "bottom"
            r24 = r3
            java.lang.String r3 = "right"
            r25 = r14
            java.lang.String r14 = "top"
            r26 = r6
            java.lang.String r6 = "left"
            if (r17 == 0) goto L1ea
            java.lang.Object r8 = r15.get(r8)     // Catch: java.lang.Exception -> L141
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L141
            if (r8 == 0) goto L152
            df3 r8 = defpackage.fe3.h(r8)     // Catch: java.lang.Exception -> L141
            java.lang.String r8 = r8.a()     // Catch: java.lang.Exception -> L141
            goto L154
        L141:
            r7 = r1
            r20 = r2
            r27 = r9
            r29 = r11
            r30 = r12
            r28 = r13
        L14c:
            r2 = r24
            r1 = r26
            goto L662
        L152:
            r8 = r16
        L154:
            boolean r7 = defpackage.nb3.k(r8, r7)     // Catch: java.lang.Exception -> L141
            if (r7 == 0) goto L1a2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L141
            df3 r7 = defpackage.fe3.a(r7)     // Catch: java.lang.Exception -> L141
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L141
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L141
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L141
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L141
            r7.<init>(r14, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L141
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L141
            vr4 r14 = new vr4     // Catch: java.lang.Exception -> L141
            r14.<init>(r3, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L141
            df3 r3 = defpackage.fe3.a(r3)     // Catch: java.lang.Exception -> L141
            vr4 r6 = new vr4     // Catch: java.lang.Exception -> L141
            r6.<init>(r10, r3)     // Catch: java.lang.Exception -> L141
            vr4[] r3 = new defpackage.vr4[]{r8, r7, r14, r6}     // Catch: java.lang.Exception -> L141
            java.util.Map r3 = defpackage.c14.m0(r3)     // Catch: java.lang.Exception -> L141
            my4 r6 = new my4     // Catch: java.lang.Exception -> L141
            r6.<init>(r11, r13)     // Catch: java.lang.Exception -> L141
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L141
            r7.<init>(r6, r3)     // Catch: java.lang.Exception -> L141
            goto L290
        L1a2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L141
            df3 r7 = defpackage.fe3.a(r7)     // Catch: java.lang.Exception -> L141
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L141
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L141
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L141
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L141
            r7.<init>(r14, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L141
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L141
            vr4 r14 = new vr4     // Catch: java.lang.Exception -> L141
            r14.<init>(r3, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L141
            df3 r3 = defpackage.fe3.a(r3)     // Catch: java.lang.Exception -> L141
            vr4 r6 = new vr4     // Catch: java.lang.Exception -> L141
            r6.<init>(r10, r3)     // Catch: java.lang.Exception -> L141
            vr4[] r3 = new defpackage.vr4[]{r8, r7, r14, r6}     // Catch: java.lang.Exception -> L141
            java.util.Map r3 = defpackage.c14.m0(r3)     // Catch: java.lang.Exception -> L141
            my4 r6 = new my4     // Catch: java.lang.Exception -> L141
            r6.<init>(r13, r12)     // Catch: java.lang.Exception -> L141
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L141
            r7.<init>(r6, r3)     // Catch: java.lang.Exception -> L141
            goto L290
        L1ea:
            java.lang.Object r8 = r15.get(r8)     // Catch: java.lang.Exception -> L5e5
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L5e5
            if (r8 == 0) goto L1fb
            df3 r8 = defpackage.fe3.h(r8)     // Catch: java.lang.Exception -> L141
            java.lang.String r8 = r8.a()     // Catch: java.lang.Exception -> L141
            goto L1fd
        L1fb:
            r8 = r16
        L1fd:
            boolean r7 = defpackage.nb3.k(r8, r7)     // Catch: java.lang.Exception -> L5e5
            if (r7 == 0) goto L24a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L141
            df3 r7 = defpackage.fe3.a(r7)     // Catch: java.lang.Exception -> L141
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L141
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L141
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L141
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L141
            r7.<init>(r14, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L141
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L141
            vr4 r14 = new vr4     // Catch: java.lang.Exception -> L141
            r14.<init>(r3, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L141
            df3 r3 = defpackage.fe3.a(r3)     // Catch: java.lang.Exception -> L141
            vr4 r6 = new vr4     // Catch: java.lang.Exception -> L141
            r6.<init>(r10, r3)     // Catch: java.lang.Exception -> L141
            vr4[] r3 = new defpackage.vr4[]{r8, r7, r14, r6}     // Catch: java.lang.Exception -> L141
            java.util.Map r3 = defpackage.c14.m0(r3)     // Catch: java.lang.Exception -> L141
            my4 r6 = new my4     // Catch: java.lang.Exception -> L141
            r6.<init>(r9, r11)     // Catch: java.lang.Exception -> L141
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L141
            r7.<init>(r6, r3)     // Catch: java.lang.Exception -> L141
            goto L290
        L24a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Exception -> L5e5
            df3 r7 = defpackage.fe3.a(r7)     // Catch: java.lang.Exception -> L5e5
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L5e5
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L5e5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Exception -> L5e5
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L5e5
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L5e5
            r7.<init>(r14, r6)     // Catch: java.lang.Exception -> L5e5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L5e5
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L5e5
            vr4 r14 = new vr4     // Catch: java.lang.Exception -> L5e5
            r14.<init>(r3, r6)     // Catch: java.lang.Exception -> L5e5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L5e5
            df3 r3 = defpackage.fe3.a(r3)     // Catch: java.lang.Exception -> L5e5
            vr4 r6 = new vr4     // Catch: java.lang.Exception -> L5e5
            r6.<init>(r10, r3)     // Catch: java.lang.Exception -> L5e5
            vr4[] r3 = new defpackage.vr4[]{r8, r7, r14, r6}     // Catch: java.lang.Exception -> L5e5
            java.util.Map r3 = defpackage.c14.m0(r3)     // Catch: java.lang.Exception -> L5e5
            my4 r6 = new my4     // Catch: java.lang.Exception -> L5e5
            r6.<init>(r11, r13)     // Catch: java.lang.Exception -> L5e5
            vr4 r7 = new vr4     // Catch: java.lang.Exception -> L5e5
            r7.<init>(r6, r3)     // Catch: java.lang.Exception -> L5e5
        L290:
            java.lang.Object r3 = r7.A     // Catch: java.lang.Exception -> L5e5
            my4 r3 = (defpackage.my4) r3     // Catch: java.lang.Exception -> L5e5
            java.lang.Object r6 = r7.B     // Catch: java.lang.Exception -> L5e5
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L5e5
            java.lang.Object r7 = r15.get(r2)     // Catch: java.lang.Exception -> L5e5
            r7.getClass()     // Catch: java.lang.Exception -> L5e5
            de3 r7 = (defpackage.de3) r7     // Catch: java.lang.Exception -> L5e5
            ye3 r7 = defpackage.fe3.g(r7)     // Catch: java.lang.Exception -> L5e5
            java.lang.String r8 = "mainScreenDisplay"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L5e5
            r7.getClass()     // Catch: java.lang.Exception -> L5e5
            de3 r7 = (defpackage.de3) r7     // Catch: java.lang.Exception -> L5e5
            ye3 r7 = defpackage.fe3.g(r7)     // Catch: java.lang.Exception -> L5e5
            ye3 r8 = defpackage.fe3.g(r22)     // Catch: java.lang.Exception -> L5e5
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Exception -> L5e5
            r8.getClass()     // Catch: java.lang.Exception -> L5e5
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L5e5
            ye3 r8 = defpackage.fe3.g(r8)     // Catch: java.lang.Exception -> L5e5
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Exception -> L5e5
            r8.getClass()     // Catch: java.lang.Exception -> L5e5
            de3 r8 = (defpackage.de3) r8     // Catch: java.lang.Exception -> L5e5
            ye3 r8 = defpackage.fe3.g(r8)     // Catch: java.lang.Exception -> L5e5
            java.lang.Object r10 = r7.get(r4)     // Catch: java.lang.Exception -> L5e5
            r10.getClass()     // Catch: java.lang.Exception -> L5e5
            de3 r10 = (defpackage.de3) r10     // Catch: java.lang.Exception -> L5e5
            df3 r10 = defpackage.fe3.h(r10)     // Catch: java.lang.Exception -> L5e5
            int r10 = defpackage.fe3.e(r10)     // Catch: java.lang.Exception -> L5e5
            java.lang.String r14 = "rect"
            r27 = r9
            java.lang.String r9 = "components"
            r28 = r10
            java.lang.String r10 = "y"
            r29 = r11
            java.lang.String r11 = "x"
            if (r28 != 0) goto L3cf
            java.lang.Object r28 = r8.get(r9)     // Catch: java.lang.Exception -> L3cc
            de3 r28 = (defpackage.de3) r28     // Catch: java.lang.Exception -> L3cc
            if (r28 == 0) goto L3aa
            r30 = r12
            nd3 r12 = defpackage.fe3.f(r28)     // Catch: java.lang.Exception -> L3a7
            r28 = r13
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3a2
            r31 = r1
            r32 = r6
            r1 = 10
            int r6 = defpackage.ht0.v0(r12, r1)     // Catch: java.lang.Exception -> L398
            r13.<init>(r6)     // Catch: java.lang.Exception -> L398
            java.util.List r1 = r12.A     // Catch: java.lang.Exception -> L398
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L398
        L318:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Exception -> L398
            if (r6 == 0) goto L3b4
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Exception -> L398
            de3 r6 = (defpackage.de3) r6     // Catch: java.lang.Exception -> L398
            ye3 r6 = defpackage.fe3.g(r6)     // Catch: java.lang.Exception -> L398
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L398
            r12.<init>(r6)     // Catch: java.lang.Exception -> L398
            java.lang.Object r6 = r12.get(r14)     // Catch: java.lang.Exception -> L398
            r6.getClass()     // Catch: java.lang.Exception -> L398
            de3 r6 = (defpackage.de3) r6     // Catch: java.lang.Exception -> L398
            ye3 r6 = defpackage.fe3.g(r6)     // Catch: java.lang.Exception -> L398
            r33 = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L398
            r1.<init>(r6)     // Catch: java.lang.Exception -> L398
            java.lang.Object r6 = r1.get(r11)     // Catch: java.lang.Exception -> L398
            r6.getClass()     // Catch: java.lang.Exception -> L398
            de3 r6 = (defpackage.de3) r6     // Catch: java.lang.Exception -> L398
            df3 r6 = defpackage.fe3.h(r6)     // Catch: java.lang.Exception -> L398
            int r6 = defpackage.fe3.e(r6)     // Catch: java.lang.Exception -> L398
            r34 = r6
            int r6 = r3.a     // Catch: java.lang.Exception -> L398
            int r6 = r34 + r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L398
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L398
            r1.put(r11, r6)     // Catch: java.lang.Exception -> L398
            java.lang.Object r6 = r1.get(r10)     // Catch: java.lang.Exception -> L398
            r6.getClass()     // Catch: java.lang.Exception -> L398
            de3 r6 = (defpackage.de3) r6     // Catch: java.lang.Exception -> L398
            df3 r6 = defpackage.fe3.h(r6)     // Catch: java.lang.Exception -> L398
            int r6 = defpackage.fe3.e(r6)     // Catch: java.lang.Exception -> L398
            r34 = r6
            int r6 = r3.b     // Catch: java.lang.Exception -> L398
            int r6 = r34 + r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L398
            df3 r6 = defpackage.fe3.a(r6)     // Catch: java.lang.Exception -> L398
            r1.put(r10, r6)     // Catch: java.lang.Exception -> L398
            ye3 r6 = new ye3     // Catch: java.lang.Exception -> L398
            r6.<init>(r1)     // Catch: java.lang.Exception -> L398
            r12.put(r14, r6)     // Catch: java.lang.Exception -> L398
            ye3 r1 = new ye3     // Catch: java.lang.Exception -> L398
            r1.<init>(r12)     // Catch: java.lang.Exception -> L398
            r13.add(r1)     // Catch: java.lang.Exception -> L398
            r1 = r33
            goto L318
        L398:
            r20 = r2
        L39a:
            r2 = r24
            r1 = r26
            r7 = r31
            goto L662
        L3a2:
            r7 = r1
            r20 = r2
            goto L14c
        L3a7:
            r28 = r13
            goto L3a2
        L3aa:
            r31 = r1
            r32 = r6
            r30 = r12
            r28 = r13
            r13 = r16
        L3b4:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L398
            r1.<init>(r8)     // Catch: java.lang.Exception -> L398
            if (r13 == 0) goto L3c1
            nd3 r6 = new nd3     // Catch: java.lang.Exception -> L398
            r6.<init>(r13)     // Catch: java.lang.Exception -> L398
            goto L3c3
        L3c1:
            ue3 r6 = defpackage.ue3.INSTANCE     // Catch: java.lang.Exception -> L398
        L3c3:
            r1.put(r9, r6)     // Catch: java.lang.Exception -> L398
            ye3 r8 = new ye3     // Catch: java.lang.Exception -> L398
            r8.<init>(r1)     // Catch: java.lang.Exception -> L398
            goto L3d7
        L3cc:
            r30 = r12
            goto L3a7
        L3cf:
            r31 = r1
            r32 = r6
            r30 = r12
            r28 = r13
        L3d7:
            java.lang.Object r1 = r15.get(r2)     // Catch: java.lang.Exception -> L5e2
            de3 r1 = (defpackage.de3) r1     // Catch: java.lang.Exception -> L5e2
            if (r1 == 0) goto L3f2
            ye3 r1 = defpackage.fe3.g(r1)     // Catch: java.lang.Exception -> L398
            java.lang.String r6 = "secondaryScreenDisplay"
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Exception -> L398
            de3 r1 = (defpackage.de3) r1     // Catch: java.lang.Exception -> L398
            if (r1 == 0) goto L3f2
            ye3 r1 = defpackage.fe3.g(r1)     // Catch: java.lang.Exception -> L398
            goto L3f4
        L3f2:
            r1 = r16
        L3f4:
            ye3 r6 = defpackage.fe3.g(r22)     // Catch: java.lang.Exception -> L5e2
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Exception -> L5e2
            r6.getClass()     // Catch: java.lang.Exception -> L5e2
            de3 r6 = (defpackage.de3) r6     // Catch: java.lang.Exception -> L5e2
            ye3 r6 = defpackage.fe3.g(r6)     // Catch: java.lang.Exception -> L5e2
            java.lang.Object r6 = r6.get(r0)     // Catch: java.lang.Exception -> L5e2
            r6.getClass()     // Catch: java.lang.Exception -> L5e2
            de3 r6 = (defpackage.de3) r6     // Catch: java.lang.Exception -> L5e2
            ye3 r6 = defpackage.fe3.g(r6)     // Catch: java.lang.Exception -> L5e2
            if (r1 == 0) goto L4e4
            java.lang.Object r12 = r1.get(r4)     // Catch: java.lang.Exception -> L398
            de3 r12 = (defpackage.de3) r12     // Catch: java.lang.Exception -> L398
            if (r12 == 0) goto L4e4
            df3 r12 = defpackage.fe3.h(r12)     // Catch: java.lang.Exception -> L398
            int r12 = defpackage.fe3.e(r12)     // Catch: java.lang.Exception -> L398
            if (r12 != 0) goto L4e4
            java.lang.Object r12 = r6.get(r9)     // Catch: java.lang.Exception -> L398
            de3 r12 = (defpackage.de3) r12     // Catch: java.lang.Exception -> L398
            if (r12 == 0) goto L4c8
            nd3 r12 = defpackage.fe3.f(r12)     // Catch: java.lang.Exception -> L398
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L398
            r20 = r2
            r15 = 10
            int r2 = defpackage.ht0.v0(r12, r15)     // Catch: java.lang.Exception -> L39a
            r13.<init>(r2)     // Catch: java.lang.Exception -> L39a
            java.util.List r2 = r12.A     // Catch: java.lang.Exception -> L39a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L39a
        L445:
            boolean r12 = r2.hasNext()     // Catch: java.lang.Exception -> L39a
            if (r12 == 0) goto L4cc
            java.lang.Object r12 = r2.next()     // Catch: java.lang.Exception -> L39a
            de3 r12 = (defpackage.de3) r12     // Catch: java.lang.Exception -> L39a
            ye3 r12 = defpackage.fe3.g(r12)     // Catch: java.lang.Exception -> L39a
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L39a
            r15.<init>(r12)     // Catch: java.lang.Exception -> L39a
            java.lang.Object r12 = r15.get(r14)     // Catch: java.lang.Exception -> L39a
            r12.getClass()     // Catch: java.lang.Exception -> L39a
            de3 r12 = (defpackage.de3) r12     // Catch: java.lang.Exception -> L39a
            ye3 r12 = defpackage.fe3.g(r12)     // Catch: java.lang.Exception -> L39a
            r34 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L39a
            r2.<init>(r12)     // Catch: java.lang.Exception -> L39a
            java.lang.Object r12 = r2.get(r11)     // Catch: java.lang.Exception -> L39a
            r12.getClass()     // Catch: java.lang.Exception -> L39a
            de3 r12 = (defpackage.de3) r12     // Catch: java.lang.Exception -> L39a
            df3 r12 = defpackage.fe3.h(r12)     // Catch: java.lang.Exception -> L39a
            int r12 = defpackage.fe3.e(r12)     // Catch: java.lang.Exception -> L39a
            r35 = r12
            int r12 = r3.a     // Catch: java.lang.Exception -> L39a
            int r12 = r35 + r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L39a
            df3 r12 = defpackage.fe3.a(r12)     // Catch: java.lang.Exception -> L39a
            r2.put(r11, r12)     // Catch: java.lang.Exception -> L39a
            java.lang.Object r12 = r2.get(r10)     // Catch: java.lang.Exception -> L39a
            r12.getClass()     // Catch: java.lang.Exception -> L39a
            de3 r12 = (defpackage.de3) r12     // Catch: java.lang.Exception -> L39a
            df3 r12 = defpackage.fe3.h(r12)     // Catch: java.lang.Exception -> L39a
            int r12 = defpackage.fe3.e(r12)     // Catch: java.lang.Exception -> L39a
            r35 = r12
            int r12 = r3.b     // Catch: java.lang.Exception -> L39a
            int r12 = r35 + r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> L39a
            df3 r12 = defpackage.fe3.a(r12)     // Catch: java.lang.Exception -> L39a
            r2.put(r10, r12)     // Catch: java.lang.Exception -> L39a
            ye3 r12 = new ye3     // Catch: java.lang.Exception -> L39a
            r12.<init>(r2)     // Catch: java.lang.Exception -> L39a
            r15.put(r14, r12)     // Catch: java.lang.Exception -> L39a
            ye3 r2 = new ye3     // Catch: java.lang.Exception -> L39a
            r2.<init>(r15)     // Catch: java.lang.Exception -> L39a
            r13.add(r2)     // Catch: java.lang.Exception -> L39a
            r2 = r34
            r15 = 10
            goto L445
        L4c8:
            r20 = r2
            r13 = r16
        L4cc:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L39a
            r2.<init>(r6)     // Catch: java.lang.Exception -> L39a
            if (r13 == 0) goto L4d9
            nd3 r3 = new nd3     // Catch: java.lang.Exception -> L39a
            r3.<init>(r13)     // Catch: java.lang.Exception -> L39a
            goto L4db
        L4d9:
            ue3 r3 = defpackage.ue3.INSTANCE     // Catch: java.lang.Exception -> L39a
        L4db:
            r2.put(r9, r3)     // Catch: java.lang.Exception -> L39a
            ye3 r6 = new ye3     // Catch: java.lang.Exception -> L39a
            r6.<init>(r2)     // Catch: java.lang.Exception -> L39a
            goto L4e6
        L4e4:
            r20 = r2
        L4e6:
            java.lang.String r2 = "height"
            java.lang.String r3 = "width"
            if (r1 == 0) goto L530
            java.lang.Object r9 = r1.get(r4)     // Catch: java.lang.Exception -> L39a
            de3 r9 = (defpackage.de3) r9     // Catch: java.lang.Exception -> L39a
            if (r9 == 0) goto L530
            df3 r9 = defpackage.fe3.h(r9)     // Catch: java.lang.Exception -> L39a
            int r9 = defpackage.fe3.e(r9)     // Catch: java.lang.Exception -> L39a
            if (r9 != 0) goto L530
            ye3 r7 = new ye3     // Catch: java.lang.Exception -> L39a
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L39a
            r3.getClass()     // Catch: java.lang.Exception -> L39a
            de3 r3 = (defpackage.de3) r3     // Catch: java.lang.Exception -> L39a
            df3 r3 = defpackage.fe3.h(r3)     // Catch: java.lang.Exception -> L39a
            vr4 r9 = new vr4     // Catch: java.lang.Exception -> L39a
            r9.<init>(r11, r3)     // Catch: java.lang.Exception -> L39a
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L39a
            r1.getClass()     // Catch: java.lang.Exception -> L39a
            de3 r1 = (defpackage.de3) r1     // Catch: java.lang.Exception -> L39a
            df3 r1 = defpackage.fe3.h(r1)     // Catch: java.lang.Exception -> L39a
            vr4 r2 = new vr4     // Catch: java.lang.Exception -> L39a
            r2.<init>(r10, r1)     // Catch: java.lang.Exception -> L39a
            vr4[] r1 = new defpackage.vr4[]{r9, r2}     // Catch: java.lang.Exception -> L39a
            java.util.Map r1 = defpackage.c14.m0(r1)     // Catch: java.lang.Exception -> L39a
            r7.<init>(r1)     // Catch: java.lang.Exception -> L39a
            goto L562
        L530:
            ye3 r1 = new ye3     // Catch: java.lang.Exception -> L5df
            java.lang.Object r3 = r7.get(r3)     // Catch: java.lang.Exception -> L5df
            r3.getClass()     // Catch: java.lang.Exception -> L5df
            de3 r3 = (defpackage.de3) r3     // Catch: java.lang.Exception -> L5df
            df3 r3 = defpackage.fe3.h(r3)     // Catch: java.lang.Exception -> L5df
            vr4 r9 = new vr4     // Catch: java.lang.Exception -> L5dc
            r9.<init>(r11, r3)     // Catch: java.lang.Exception -> L5dc
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Exception -> L5df
            r2.getClass()     // Catch: java.lang.Exception -> L5df
            de3 r2 = (defpackage.de3) r2     // Catch: java.lang.Exception -> L5df
            df3 r2 = defpackage.fe3.h(r2)     // Catch: java.lang.Exception -> L5df
            vr4 r3 = new vr4     // Catch: java.lang.Exception -> L5dc
            r3.<init>(r10, r2)     // Catch: java.lang.Exception -> L5dc
            vr4[] r2 = new defpackage.vr4[]{r9, r3}     // Catch: java.lang.Exception -> L5df
            java.util.Map r2 = defpackage.c14.m0(r2)     // Catch: java.lang.Exception -> L5df
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5df
            r7 = r1
        L562:
            ye3 r1 = defpackage.fe3.g(r22)     // Catch: java.lang.Exception -> L5df
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L5dc
            r2.<init>(r1)     // Catch: java.lang.Exception -> L5dc
            r1 = r26
            java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Exception -> L5d9
            r3.getClass()     // Catch: java.lang.Exception -> L5d9
            de3 r3 = (defpackage.de3) r3     // Catch: java.lang.Exception -> L5d9
            ye3 r3 = defpackage.fe3.g(r3)     // Catch: java.lang.Exception -> L5d9
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L5d9
            r9.<init>(r3)     // Catch: java.lang.Exception -> L5d9
            java.lang.String r3 = "uiSize"
            r9.put(r3, r7)     // Catch: java.lang.Exception -> L5d9
            java.lang.String r3 = "insets"
            ye3 r7 = new ye3     // Catch: java.lang.Exception -> L5d9
            r10 = r32
            r7.<init>(r10)     // Catch: java.lang.Exception -> L5d9
            r9.put(r3, r7)     // Catch: java.lang.Exception -> L5d9
            vr4 r3 = new vr4     // Catch: java.lang.Exception -> L5d9
            r7 = r31
            r3.<init>(r7, r8)     // Catch: java.lang.Exception -> L5d5
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L5d5
            r8.<init>(r0, r6)     // Catch: java.lang.Exception -> L5d5
            vr4[] r3 = new defpackage.vr4[]{r3, r8}     // Catch: java.lang.Exception -> L5d5
            java.util.Map r3 = defpackage.c14.m0(r3)     // Catch: java.lang.Exception -> L5d5
            ye3 r6 = new ye3     // Catch: java.lang.Exception -> L5d5
            r6.<init>(r9)     // Catch: java.lang.Exception -> L5d5
            r2.put(r1, r6)     // Catch: java.lang.Exception -> L5d5
            ye3 r6 = new ye3     // Catch: java.lang.Exception -> L5d5
            r6.<init>(r3)     // Catch: java.lang.Exception -> L5d5
            r2.put(r5, r6)     // Catch: java.lang.Exception -> L5d5
            ye3 r3 = new ye3     // Catch: java.lang.Exception -> L5d5
            r3.<init>(r2)     // Catch: java.lang.Exception -> L5d5
            r2 = r25
            r2.add(r3)     // Catch: java.lang.Exception -> L5d5
            r6 = r1
            r14 = r2
            r1 = r7
            r2 = r20
            r7 = r21
            r10 = r23
            r3 = r24
            r9 = r27
            r13 = r28
            r11 = r29
            r12 = r30
            r15 = 10
            goto Lf9
        L5d5:
            r2 = r24
            goto L662
        L5d9:
            r7 = r31
            goto L5d5
        L5dc:
            r1 = r26
            goto L5d9
        L5df:
            r1 = r26
            goto L5d9
        L5e2:
            r20 = r2
            goto L5df
        L5e5:
            r7 = r1
            r20 = r2
            r27 = r9
            r29 = r11
            r30 = r12
            r28 = r13
            r1 = r26
            goto L5d5
        L5f3:
            r7 = r1
            r20 = r2
            r1 = r6
            r27 = r9
            r23 = r10
            r29 = r11
            r30 = r12
            r28 = r13
            r2 = r3
            goto L662
        L604:
            r7 = r1
            r20 = r2
            r24 = r3
            r1 = r6
            r27 = r9
            r23 = r10
            r29 = r11
            r30 = r12
            r28 = r13
            r2 = r14
            ye3 r3 = defpackage.fe3.g(r18)     // Catch: java.lang.Exception -> L5d5
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L5d5
            r6.<init>(r3)     // Catch: java.lang.Exception -> L5d5
            nd3 r3 = new nd3     // Catch: java.lang.Exception -> L5d5
            r3.<init>(r2)     // Catch: java.lang.Exception -> L5d5
            r2 = r24
            r6.put(r2, r3)     // Catch: java.lang.Exception -> L662
            ye3 r3 = new ye3     // Catch: java.lang.Exception -> L662
            r3.<init>(r6)     // Catch: java.lang.Exception -> L662
            goto L664
        L62e:
            r7 = r1
            r20 = r2
            r2 = r3
            r1 = r6
            r27 = r9
            r23 = r10
            r29 = r11
            r30 = r12
            r28 = r13
            goto L662
        L63e:
            r20 = r2
            r2 = r3
            r19 = r7
            r27 = r9
            r23 = r10
            r29 = r11
            r30 = r12
            r28 = r13
        L64d:
            r7 = r1
            r1 = r6
            goto L662
        L650:
            r20 = r2
            r2 = r3
            r19 = r7
            r27 = r9
            r23 = r10
            r29 = r11
            r30 = r12
            r28 = r13
            r17 = r14
            goto L64d
        L662:
            r3 = r16
        L664:
            if (r3 == 0) goto L66f
            r6 = r23
            r6.add(r3)     // Catch: java.lang.Exception -> L66c
            goto L671
        L66c:
            r1 = r19
            goto L69b
        L66f:
            r6 = r23
        L671:
            r8 = r36
            r3 = r2
            r10 = r6
            r14 = r17
            r2 = r20
            r9 = r27
            r13 = r28
            r11 = r29
            r12 = r30
            r6 = r1
            r1 = r7
            r7 = r19
            goto Lc1
        L687:
            r1 = r7
            goto L69b
        L689:
            r19 = r7
            r6 = r10
            nd3 r0 = new nd3     // Catch: java.lang.Exception -> L66c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L66c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L66c
            r1 = r19
            defpackage.jc2.F0(r1, r0)     // Catch: java.lang.Exception -> L69b
            goto L69e
        L69b:
            r1.delete()
        L69e:
            return
    }

    @Override // defpackage.y54
    public final int a() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto Ld;
                case 1: goto La;
                case 2: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 7
            return r0
        L7:
            r0 = 39
            return r0
        La:
            r0 = 35
            return r0
        Ld:
            r0 = 34
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r35 = this;
            r0 = r35
            int r1 = r0.a
            r2 = 0
            android.content.Context r3 = r0.b
            switch(r1) {
                case 0: goto L566;
                case 1: goto L26;
                case 2: goto L22;
                default: goto La;
            }
        La:
            java.io.File r0 = r3.getExternalCacheDir()
            if (r0 == 0) goto L21
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L21
            int r1 = r0.length
        L17:
            if (r2 >= r1) goto L21
            r3 = r0[r2]
            r3.delete()
            int r2 = r2 + 1
            goto L17
        L21:
            return
        L22:
            r0.d()
            return
        L26:
            java.lang.String r1 = "component"
            java.lang.String r4 = "y"
            java.lang.String r5 = "x"
            java.lang.String r6 = "rect"
            java.lang.String r7 = "folds"
            java.lang.String r8 = "orientation"
            java.lang.String r9 = "uiSize"
            java.lang.String r10 = "layout"
            java.lang.String r11 = "variant"
            java.lang.String r12 = "layoutVariants"
            java.io.File r13 = new java.io.File
            java.io.File r0 = r3.getFilesDir()
            java.lang.String r14 = "layouts.json"
            r13.<init>(r0, r14)
            boolean r0 = r13.isFile()
            if (r0 != 0) goto L4d
            goto L565
        L4d:
            java.lang.Class<android.hardware.display.DisplayManager> r0 = android.hardware.display.DisplayManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L565
            android.view.Display r0 = r0.getDisplay(r2)
            if (r0 != 0) goto L5f
            goto L565
        L5f:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            ye3 r3 = new ye3
            int r0 = r0.getDisplayId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            df3 r0 = defpackage.fe3.a(r0)
            vr4 r14 = new vr4
            java.lang.String r15 = "id"
            r14.<init>(r15, r0)
            java.lang.String r0 = "BUILT_IN"
            df3 r0 = defpackage.fe3.b(r0)
            vr4 r15 = new vr4
            r35 = r13
            java.lang.String r13 = "type"
            r15.<init>(r13, r0)
            int r0 = r2.x
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            df3 r0 = defpackage.fe3.a(r0)
            r16 = r1
            vr4 r1 = new vr4
            r17 = r4
            java.lang.String r4 = "width"
            r1.<init>(r4, r0)
            int r0 = r2.y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            df3 r0 = defpackage.fe3.a(r0)
            vr4 r2 = new vr4
            r18 = r4
            java.lang.String r4 = "height"
            r2.<init>(r4, r0)
            vr4[] r0 = new defpackage.vr4[]{r14, r15, r1, r2}
            java.util.Map r0 = defpackage.c14.m0(r0)
            r3.<init>(r0)
            ye3 r1 = new ye3
            vr4 r0 = new vr4
            java.lang.String r2 = "mainScreenDisplay"
            r0.<init>(r2, r3)
            ue3 r2 = defpackage.ue3.INSTANCE
            vr4 r3 = new vr4
            java.lang.String r14 = "secondaryScreenDisplay"
            r3.<init>(r14, r2)
            vr4[] r0 = new defpackage.vr4[]{r0, r3}
            java.util.Map r0 = defpackage.c14.m0(r0)
            r1.<init>(r0)
            ye3 r3 = new ye3
            vr4 r0 = new vr4
            java.lang.String r14 = "backgroundId"
            r0.<init>(r14, r2)
            java.lang.String r15 = "FIT_CENTER"
            df3 r15 = defpackage.fe3.b(r15)
            r19 = r4
            vr4 r4 = new vr4
            r20 = r5
            java.lang.String r5 = "backgroundMode"
            r4.<init>(r5, r15)
            vr4 r15 = new vr4
            r21 = r6
            java.lang.String r6 = "components"
            r15.<init>(r6, r2)
            vr4[] r0 = new defpackage.vr4[]{r0, r4, r15}
            java.util.Map r0 = defpackage.c14.m0(r0)
            r3.<init>(r0)
            v83 r0 = new v83
            r2 = 27
            r0.<init>(r2)
            pe3 r0 = defpackage.ii2.g(r0)
            java.lang.String r2 = defpackage.jc2.B0(r35)     // Catch: java.lang.Exception -> L561
            he3 r4 = defpackage.he3.a     // Catch: java.lang.Exception -> L561
            java.lang.Object r0 = r0.a(r4, r2)     // Catch: java.lang.Exception -> L561
            de3 r0 = (defpackage.de3) r0     // Catch: java.lang.Exception -> L561
            nd3 r0 = defpackage.fe3.f(r0)     // Catch: java.lang.Exception -> L561
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L561
            r2.<init>()     // Catch: java.lang.Exception -> L561
            java.util.List r0 = r0.A     // Catch: java.lang.Exception -> L561
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Exception -> L561
        L12f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L561
            if (r0 == 0) goto L552
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Exception -> L561
            r15 = r0
            de3 r15 = (defpackage.de3) r15     // Catch: java.lang.Exception -> L561
            ye3 r0 = defpackage.fe3.g(r15)     // Catch: java.lang.Exception -> L561
            java.lang.Object r22 = r0.get(r13)     // Catch: java.lang.Exception -> L561
            de3 r22 = (defpackage.de3) r22     // Catch: java.lang.Exception -> L561
            r23 = 0
            if (r22 == 0) goto L15b
            df3 r22 = defpackage.fe3.h(r22)     // Catch: java.lang.Exception -> L561
            java.lang.String r22 = r22.a()     // Catch: java.lang.Exception -> L561
            r24 = r22
            r22 = r4
            r4 = r24
        L158:
            r24 = r13
            goto L160
        L15b:
            r22 = r4
            r4 = r23
            goto L158
        L160:
            java.lang.String r13 = "EXTERNAL"
            boolean r4 = defpackage.nb3.k(r4, r13)     // Catch: java.lang.Exception -> L561
            if (r4 == 0) goto L189
            r15 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r15
            r29 = r1
            r25 = r2
            r27 = r5
            r31 = r8
            r5 = r12
            r32 = r14
            r1 = r21
            r15 = r23
            r21 = r7
            r7 = r16
            goto L527
        L189:
            java.lang.Object r4 = r0.get(r12)     // Catch: java.lang.Exception -> L507
            r4.getClass()     // Catch: java.lang.Exception -> L507
            de3 r4 = (defpackage.de3) r4     // Catch: java.lang.Exception -> L507
            nd3 r4 = defpackage.fe3.f(r4)     // Catch: java.lang.Exception -> L507
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Exception -> L507
            r23 = r15
            r15 = 10
            r25 = r2
            int r2 = defpackage.ht0.v0(r4, r15)     // Catch: java.lang.Exception -> L4ed
            r13.<init>(r2)     // Catch: java.lang.Exception -> L4ed
            java.util.List r2 = r4.A     // Catch: java.lang.Exception -> L4ed
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L4ed
        L1ab:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L4ed
            if (r4 == 0) goto L4b4
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L49d
            de3 r4 = (defpackage.de3) r4     // Catch: java.lang.Exception -> L49d
            ye3 r4 = defpackage.fe3.g(r4)     // Catch: java.lang.Exception -> L49d
            java.lang.Object r26 = r4.get(r11)     // Catch: java.lang.Exception -> L49d
            r26.getClass()     // Catch: java.lang.Exception -> L49d
            de3 r26 = (defpackage.de3) r26     // Catch: java.lang.Exception -> L49d
            ye3 r15 = defpackage.fe3.g(r26)     // Catch: java.lang.Exception -> L49d
            java.lang.Object r4 = r4.get(r10)     // Catch: java.lang.Exception -> L49d
            r4.getClass()     // Catch: java.lang.Exception -> L49d
            de3 r4 = (defpackage.de3) r4     // Catch: java.lang.Exception -> L49d
            ye3 r4 = defpackage.fe3.g(r4)     // Catch: java.lang.Exception -> L49d
            r26 = r2
            p04 r2 = new p04     // Catch: java.lang.Exception -> L486
            r2.<init>()     // Catch: java.lang.Exception -> L486
            r28 = r12
            java.lang.Object r12 = r15.get(r9)     // Catch: java.lang.Exception -> L3d6
            r12.getClass()     // Catch: java.lang.Exception -> L3d6
            r2.put(r9, r12)     // Catch: java.lang.Exception -> L3d6
            java.lang.Object r12 = r15.get(r8)     // Catch: java.lang.Exception -> L3d6
            r12.getClass()     // Catch: java.lang.Exception -> L3d6
            r2.put(r8, r12)     // Catch: java.lang.Exception -> L3d6
            java.lang.Object r12 = r15.get(r7)     // Catch: java.lang.Exception -> L3d6
            r12.getClass()     // Catch: java.lang.Exception -> L3d6
            r2.put(r7, r12)     // Catch: java.lang.Exception -> L3d6
            java.lang.String r12 = "displays"
            r2.put(r12, r1)     // Catch: java.lang.Exception -> L3d6
            p04 r2 = r2.b()     // Catch: java.lang.Exception -> L3d6
            ye3 r12 = new ye3     // Catch: java.lang.Exception -> L3d6
            r12.<init>(r2)     // Catch: java.lang.Exception -> L3d6
            p04 r2 = new p04     // Catch: java.lang.Exception -> L473
            r2.<init>()     // Catch: java.lang.Exception -> L473
            java.lang.Object r15 = r4.get(r14)     // Catch: java.lang.Exception -> L3d6
            de3 r15 = (defpackage.de3) r15     // Catch: java.lang.Exception -> L3d6
            if (r15 != 0) goto L239
            ue3 r15 = defpackage.ue3.INSTANCE     // Catch: java.lang.Exception -> L21a
            goto L239
        L21a:
            r0 = move-exception
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r29 = r1
            r27 = r5
            r31 = r8
            r32 = r14
            r1 = r21
            r5 = r28
        L233:
            r21 = r7
            r7 = r16
            goto L522
        L239:
            r2.put(r14, r15)     // Catch: java.lang.Exception -> L3d6
            java.lang.Object r15 = r4.get(r5)     // Catch: java.lang.Exception -> L3d6
            r15.getClass()     // Catch: java.lang.Exception -> L3d6
            r2.put(r5, r15)     // Catch: java.lang.Exception -> L3d6
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Exception -> L3d6
            de3 r4 = (defpackage.de3) r4     // Catch: java.lang.Exception -> L3d6
            if (r4 == 0) goto L3e8
            boolean r15 = r4 instanceof defpackage.ue3     // Catch: java.lang.Exception -> L3d6
            if (r15 != 0) goto L3e8
            nd3 r4 = defpackage.fe3.f(r4)     // Catch: java.lang.Exception -> L3d6
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3d6
            r29 = r1
            r27 = r5
            r1 = 10
            int r5 = defpackage.ht0.v0(r4, r1)     // Catch: java.lang.Exception -> L383
            r15.<init>(r5)     // Catch: java.lang.Exception -> L383
            java.util.List r4 = r4.A     // Catch: java.lang.Exception -> L3bf
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L3bf
        L26b:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L383
            if (r5 == 0) goto L399
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L383
            de3 r5 = (defpackage.de3) r5     // Catch: java.lang.Exception -> L383
            ye3 r5 = defpackage.fe3.g(r5)     // Catch: java.lang.Exception -> L383
            r1 = r21
            java.lang.Object r21 = r5.get(r1)     // Catch: java.lang.Exception -> L373
            r21.getClass()     // Catch: java.lang.Exception -> L373
            de3 r21 = (defpackage.de3) r21     // Catch: java.lang.Exception -> L373
            r30 = r4
            ye3 r4 = defpackage.fe3.g(r21)     // Catch: java.lang.Exception -> L373
            r21 = r7
            ye3 r7 = new ye3     // Catch: java.lang.Exception -> L361
            r31 = r8
            r8 = r20
            r20 = r9
            java.lang.Object r9 = r4.get(r8)     // Catch: java.lang.Exception -> L353
            r9.getClass()     // Catch: java.lang.Exception -> L353
            r32 = r14
            vr4 r14 = new vr4     // Catch: java.lang.Exception -> L351
            r14.<init>(r8, r9)     // Catch: java.lang.Exception -> L351
            r9 = r17
            r17 = r8
            java.lang.Object r8 = r4.get(r9)     // Catch: java.lang.Exception -> L347
            r8.getClass()     // Catch: java.lang.Exception -> L347
            r33 = r0
            vr4 r0 = new vr4     // Catch: java.lang.Exception -> L33d
            r0.<init>(r9, r8)     // Catch: java.lang.Exception -> L33d
            r8 = r18
            r18 = r9
            java.lang.Object r9 = r4.get(r8)     // Catch: java.lang.Exception -> L335
            r9.getClass()     // Catch: java.lang.Exception -> L335
            r34 = r13
            vr4 r13 = new vr4     // Catch: java.lang.Exception -> L335
            r13.<init>(r8, r9)     // Catch: java.lang.Exception -> L335
            r9 = r19
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Exception -> L331
            r4.getClass()     // Catch: java.lang.Exception -> L331
            r19 = r8
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L32b
            r8.<init>(r9, r4)     // Catch: java.lang.Exception -> L32b
            vr4[] r0 = new defpackage.vr4[]{r14, r0, r13, r8}     // Catch: java.lang.Exception -> L32d
            java.util.Map r0 = defpackage.c14.m0(r0)     // Catch: java.lang.Exception -> L32d
            r7.<init>(r0)     // Catch: java.lang.Exception -> L32d
            ye3 r0 = new ye3     // Catch: java.lang.Exception -> L32d
            vr4 r4 = new vr4     // Catch: java.lang.Exception -> L32b
            r4.<init>(r1, r7)     // Catch: java.lang.Exception -> L32b
            r7 = r16
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.Exception -> L326
            r5.getClass()     // Catch: java.lang.Exception -> L326
            vr4 r8 = new vr4     // Catch: java.lang.Exception -> L326
            r8.<init>(r7, r5)     // Catch: java.lang.Exception -> L326
            vr4[] r4 = new defpackage.vr4[]{r4, r8}     // Catch: java.lang.Exception -> L326
            java.util.Map r4 = defpackage.c14.m0(r4)     // Catch: java.lang.Exception -> L326
            r0.<init>(r4)     // Catch: java.lang.Exception -> L326
            r15.add(r0)     // Catch: java.lang.Exception -> L326
            r0 = r19
            r19 = r9
            r9 = r20
            r20 = r17
            r17 = r18
            r18 = r0
            r16 = r7
            r7 = r21
            r4 = r30
            r8 = r31
            r14 = r32
            r0 = r33
            r13 = r34
            r21 = r1
            r1 = 10
            goto L26b
        L326:
            r0 = move-exception
        L327:
            r5 = r28
            goto L522
        L32b:
            r0 = move-exception
            goto L32e
        L32d:
            r0 = move-exception
        L32e:
            r7 = r16
            goto L327
        L331:
            r0 = move-exception
            r19 = r8
            goto L32e
        L335:
            r0 = move-exception
            r7 = r16
            r9 = r19
            r19 = r8
            goto L327
        L33d:
            r0 = move-exception
            r7 = r18
            r18 = r9
            r9 = r19
            r19 = r7
            goto L32e
        L347:
            r0 = move-exception
            r7 = r18
            r18 = r9
            r9 = r19
            r19 = r7
            goto L32e
        L351:
            r0 = move-exception
            goto L356
        L353:
            r0 = move-exception
            r32 = r14
        L356:
            r7 = r16
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r8
            goto L327
        L361:
            r0 = move-exception
            r7 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r7
        L36e:
            r31 = r8
            r32 = r14
            goto L32e
        L373:
            r0 = move-exception
            r21 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r21
            r21 = r7
            goto L36e
        L383:
            r0 = move-exception
            r1 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r1
        L390:
            r31 = r8
        L392:
            r32 = r14
            r1 = r21
            r21 = r7
            goto L32e
        L399:
            r1 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r1
            r33 = r0
            r31 = r8
            r34 = r13
            r32 = r14
            r1 = r21
            r21 = r7
            r7 = r16
            nd3 r0 = new nd3     // Catch: java.lang.Exception -> L326
            r0.<init>(r15)     // Catch: java.lang.Exception -> L326
            java.lang.Object r0 = r2.put(r6, r0)     // Catch: java.lang.Exception -> L326
            de3 r0 = (defpackage.de3) r0     // Catch: java.lang.Exception -> L326
            goto L40e
        L3bf:
            r0 = move-exception
            r1 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r1
        L3cc:
            r31 = r8
        L3ce:
            r32 = r14
            r1 = r21
            r21 = r7
            goto L32e
        L3d6:
            r0 = move-exception
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r29 = r1
            r27 = r5
            goto L390
        L3e8:
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r33 = r0
            r29 = r1
            r27 = r5
            r31 = r8
            r34 = r13
            r32 = r14
            r1 = r21
            r21 = r7
            r7 = r16
            ue3 r0 = defpackage.ue3.INSTANCE     // Catch: java.lang.Exception -> L326
            java.lang.Object r0 = r2.put(r6, r0)     // Catch: java.lang.Exception -> L326
            de3 r0 = (defpackage.de3) r0     // Catch: java.lang.Exception -> L326
        L40e:
            p04 r0 = r2.b()     // Catch: java.lang.Exception -> L326
            ye3 r2 = new ye3     // Catch: java.lang.Exception -> L326
            r2.<init>(r0)     // Catch: java.lang.Exception -> L326
            ye3 r0 = new ye3     // Catch: java.lang.Exception -> L326
            java.lang.String r4 = "mainScreenLayoutDto"
            vr4 r5 = new vr4     // Catch: java.lang.Exception -> L326
            r5.<init>(r4, r2)     // Catch: java.lang.Exception -> L326
            java.lang.String r2 = "secondaryScreenLayoutDto"
            vr4 r4 = new vr4     // Catch: java.lang.Exception -> L326
            r4.<init>(r2, r3)     // Catch: java.lang.Exception -> L326
            vr4[] r2 = new defpackage.vr4[]{r5, r4}     // Catch: java.lang.Exception -> L326
            java.util.Map r2 = defpackage.c14.m0(r2)     // Catch: java.lang.Exception -> L326
            r0.<init>(r2)     // Catch: java.lang.Exception -> L326
            ye3 r2 = new ye3     // Catch: java.lang.Exception -> L326
            vr4 r4 = new vr4     // Catch: java.lang.Exception -> L326
            r4.<init>(r11, r12)     // Catch: java.lang.Exception -> L326
            vr4 r5 = new vr4     // Catch: java.lang.Exception -> L326
            r5.<init>(r10, r0)     // Catch: java.lang.Exception -> L326
            vr4[] r0 = new defpackage.vr4[]{r4, r5}     // Catch: java.lang.Exception -> L326
            java.util.Map r0 = defpackage.c14.m0(r0)     // Catch: java.lang.Exception -> L326
            r2.<init>(r0)     // Catch: java.lang.Exception -> L326
            r0 = r34
            r0.add(r2)     // Catch: java.lang.Exception -> L326
            r2 = r19
            r19 = r9
            r9 = r20
            r20 = r17
            r17 = r18
            r18 = r2
            r13 = r0
            r16 = r7
            r7 = r21
            r2 = r26
            r5 = r27
            r12 = r28
            r8 = r31
            r14 = r32
            r0 = r33
            r15 = 10
            r21 = r1
            r1 = r29
            goto L1ab
        L473:
            r0 = move-exception
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r29 = r1
            r27 = r5
            goto L3cc
        L486:
            r0 = move-exception
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r29 = r1
            r27 = r5
            r31 = r8
            r28 = r12
            goto L3ce
        L49d:
            r0 = move-exception
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r29 = r1
            r27 = r5
            r31 = r8
            r28 = r12
            goto L392
        L4b4:
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r33 = r0
            r29 = r1
            r27 = r5
            r31 = r8
            r28 = r12
            r0 = r13
            r32 = r14
            r1 = r21
            r21 = r7
            r7 = r16
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L326
            r4 = r33
            r2.<init>(r4)     // Catch: java.lang.Exception -> L326
            nd3 r4 = new nd3     // Catch: java.lang.Exception -> L326
            r4.<init>(r0)     // Catch: java.lang.Exception -> L326
            r5 = r28
            r2.put(r5, r4)     // Catch: java.lang.Exception -> L4eb
            ye3 r0 = new ye3     // Catch: java.lang.Exception -> L4eb
            r0.<init>(r2)     // Catch: java.lang.Exception -> L4eb
            r15 = r0
            goto L527
        L4eb:
            r0 = move-exception
            goto L522
        L4ed:
            r0 = move-exception
            r27 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r27
            r29 = r1
            r27 = r5
            r31 = r8
            r5 = r12
            r32 = r14
        L503:
            r1 = r21
            goto L233
        L507:
            r0 = move-exception
            r23 = r20
            r20 = r9
            r9 = r19
            r19 = r18
            r18 = r17
            r17 = r23
            r29 = r1
            r25 = r2
            r27 = r5
            r31 = r8
            r5 = r12
            r32 = r14
            r23 = r15
            goto L503
        L522:
            r0.printStackTrace()     // Catch: java.lang.Exception -> L561
            r15 = r23
        L527:
            if (r15 == 0) goto L52f
            r2 = r25
            r2.add(r15)     // Catch: java.lang.Exception -> L561
            goto L531
        L52f:
            r2 = r25
        L531:
            r4 = r19
            r19 = r9
            r9 = r20
            r20 = r17
            r17 = r18
            r18 = r4
            r12 = r5
            r16 = r7
            r7 = r21
            r4 = r22
            r13 = r24
            r5 = r27
            r8 = r31
            r14 = r32
            r21 = r1
            r1 = r29
            goto L12f
        L552:
            nd3 r0 = new nd3     // Catch: java.lang.Exception -> L561
            r0.<init>(r2)     // Catch: java.lang.Exception -> L561
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L561
            r1 = r35
            defpackage.jc2.F0(r1, r0)     // Catch: java.lang.Exception -> L561
            goto L565
        L561:
            r0 = move-exception
            r0.printStackTrace()
        L565:
            return
        L566:
            java.lang.String r0 = defpackage.v15.b(r3)
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r2)
            r0.getClass()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r2 = "input_show_soft"
            r3 = 1
            boolean r0 = r0.getBoolean(r2, r3)
            r1.remove(r2)
            if (r0 == 0) goto L584
            java.lang.String r0 = "hide_system_buttons_when_controller_connected"
            goto L586
        L584:
            java.lang.String r0 = "always_invisible"
        L586:
            java.lang.String r2 = "soft_input_behaviour"
            r1.putString(r2, r0)
            r1.apply()
            return
    }

    @Override // defpackage.y54
    public final int c() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 8
            return r0
        L8:
            r0 = 40
            return r0
        Lb:
            r0 = 36
            return r0
        Le:
            r0 = 35
            return r0
    }
}
