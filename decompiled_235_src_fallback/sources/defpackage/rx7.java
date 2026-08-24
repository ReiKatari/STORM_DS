package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx7  reason: default package */
/* loaded from: classes.dex */
public final class rx7 {
    public final defpackage.yw7 a;
    public final android.content.Context b;
    public final java.lang.String c;
    public final defpackage.ow7 d;
    public final defpackage.az0 e;
    public final defpackage.q61 f;
    public final defpackage.o35 g;
    public final androidx.work.impl.WorkDatabase h;
    public final defpackage.dx7 i;
    public final defpackage.zh1 j;
    public final java.util.ArrayList k;
    public final java.lang.String l;
    public final defpackage.tc3 m;

    public rx7(defpackage.p87 r8) {
            r7 = this;
            r7.<init>()
            java.lang.Object r0 = r8.f
            yw7 r0 = (defpackage.yw7) r0
            r7.a = r0
            java.lang.Object r1 = r8.a
            android.content.Context r1 = (android.content.Context) r1
            r7.b = r1
            java.lang.String r0 = r0.a
            r7.c = r0
            java.lang.Object r1 = r8.c
            ow7 r1 = (defpackage.ow7) r1
            r7.d = r1
            java.lang.Object r1 = r8.b
            az0 r1 = (defpackage.az0) r1
            r7.e = r1
            q61 r1 = r1.d
            r7.f = r1
            java.lang.Object r1 = r8.d
            o35 r1 = (defpackage.o35) r1
            r7.g = r1
            java.lang.Object r1 = r8.e
            androidx.work.impl.WorkDatabase r1 = (androidx.work.impl.WorkDatabase) r1
            r7.h = r1
            dx7 r2 = r1.w()
            r7.i = r2
            zh1 r1 = r1.r()
            r7.j = r1
            java.lang.Object r8 = r8.g
            r1 = r8
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r7.k = r1
            java.lang.String r8 = "Work [ id="
            java.lang.String r2 = ", tags={ "
            java.lang.StringBuilder r8 = defpackage.i61.t(r8, r0, r2)
            r5 = 0
            r6 = 62
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            java.lang.String r0 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = " } ]"
            java.lang.String r8 = defpackage.i61.n(r8, r0, r1)
            r7.l = r8
            tc3 r8 = defpackage.yh2.c()
            r7.m = r8
            return
    }

    public static final java.lang.Object a(defpackage.rx7 r23, defpackage.s41 r24) {
            r1 = r23
            r0 = r24
            java.lang.String r6 = r1.l
            java.lang.String r2 = r1.c
            ow7 r7 = r1.d
            androidx.work.impl.WorkDatabase r8 = r1.h
            az0 r3 = r1.e
            xd5 r4 = r3.m
            yw7 r5 = r1.a
            boolean r9 = r0 instanceof defpackage.qx7
            if (r9 == 0) goto L25
            r9 = r0
            qx7 r9 = (defpackage.qx7) r9
            int r10 = r9.Y
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r10 & r11
            if (r12 == 0) goto L25
            int r10 = r10 - r11
            r9.Y = r10
            goto L2a
        L25:
            qx7 r9 = new qx7
            r9.<init>(r1, r0)
        L2a:
            java.lang.Object r0 = r9.R
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            int r11 = r9.Y
            r12 = 1
            if (r11 == 0) goto L4c
            if (r11 != r12) goto L45
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L41
            r19 = r6
            goto L24a
        L3c:
            r0 = move-exception
            r19 = r6
            goto L25b
        L41:
            r0 = move-exception
            r4 = r6
            goto L27d
        L45:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L4c:
            defpackage.oi2.Y(r0)
            is7 r11 = r3.e
            r4.getClass()
            boolean r4 = defpackage.ln2.H()
            java.lang.String r13 = r5.x
            java.lang.String r14 = r5.c
            java.lang.String r15 = r5.d
            if (r4 == 0) goto Ld9
            if (r13 == 0) goto Ld9
            int r0 = r5.hashCode()
            int r12 = android.os.Build.VERSION.SDK_INT
            r16 = r4
            r4 = 29
            if (r12 < r4) goto L77
            java.lang.String r4 = defpackage.ln2.f0(r13)
            defpackage.rp.a(r0, r4)
            goto Ldb
        L77:
            java.lang.String r4 = defpackage.ln2.f0(r13)
            java.lang.String r12 = "asyncTraceBegin"
            java.lang.reflect.Method r17 = defpackage.ln2.d     // Catch: java.lang.Exception -> La6
            if (r17 != 0) goto Lae
            r17 = r0
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            r18 = r13
            java.lang.Class r13 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> La2
            r19 = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r20 = r10
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9c
            java.lang.Class[] r6 = new java.lang.Class[]{r13, r6, r10}     // Catch: java.lang.Exception -> L9c
            java.lang.reflect.Method r0 = r0.getMethod(r12, r6)     // Catch: java.lang.Exception -> L9c
            defpackage.ln2.d = r0     // Catch: java.lang.Exception -> L9c
            goto Lb6
        L9c:
            r0 = move-exception
            goto Ld5
        L9e:
            r0 = move-exception
        L9f:
            r20 = r10
            goto Ld5
        La2:
            r0 = move-exception
            r19 = r6
            goto L9f
        La6:
            r0 = move-exception
            r19 = r6
            r20 = r10
            r18 = r13
            goto Ld5
        Lae:
            r17 = r0
            r19 = r6
            r20 = r10
            r18 = r13
        Lb6:
            java.lang.reflect.Method r0 = defpackage.ln2.d     // Catch: java.lang.Exception -> L9c
            if (r0 == 0) goto Lcd
            long r21 = defpackage.ln2.b     // Catch: java.lang.Exception -> L9c
            java.lang.Long r6 = java.lang.Long.valueOf(r21)     // Catch: java.lang.Exception -> L9c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Exception -> L9c
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r4, r10}     // Catch: java.lang.Exception -> L9c
            r6 = 0
            r0.invoke(r6, r4)     // Catch: java.lang.Exception -> L9c
            goto Le1
        Lcd:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L9c
            r4.<init>(r0)     // Catch: java.lang.Exception -> L9c
            throw r4     // Catch: java.lang.Exception -> L9c
        Ld5:
            defpackage.ln2.F(r12, r0)
            goto Le1
        Ld9:
            r16 = r4
        Ldb:
            r19 = r6
            r20 = r10
            r18 = r13
        Le1:
            jx7 r0 = new jx7
            r4 = 0
            r0.<init>(r1, r4)
            er2 r6 = new er2
            r10 = 25
            r6.<init>(r0, r10)
            java.lang.Object r0 = r8.o(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L101
            mx7 r10 = new mx7
            r10.<init>()
            goto L2b9
        L101:
            boolean r0 = r5.c()
            if (r0 == 0) goto L10b
            xb1 r0 = r5.e
            goto L1a3
        L10b:
            d90 r0 = r3.f
            r0.getClass()
            r15.getClass()
            java.lang.String r0 = defpackage.t63.a
            java.lang.Class r0 = java.lang.Class.forName(r15)     // Catch: java.lang.Exception -> L12b
            r6 = 0
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r6)     // Catch: java.lang.Exception -> L129
            java.lang.Object r0 = r0.newInstance(r6)     // Catch: java.lang.Exception -> L129
            r0.getClass()     // Catch: java.lang.Exception -> L129
            androidx.work.OverwritingInputMerger r0 = (androidx.work.OverwritingInputMerger) r0     // Catch: java.lang.Exception -> L129
            r6 = r0
            goto L13d
        L129:
            r0 = move-exception
            goto L12d
        L12b:
            r0 = move-exception
            r6 = 0
        L12d:
            ga0 r12 = defpackage.ga0.f()
            java.lang.String r13 = defpackage.t63.a
            java.lang.String r6 = "Trouble instantiating "
            java.lang.String r6 = r6.concat(r15)
            r12.e(r13, r6, r0)
            r6 = 0
        L13d:
            if (r6 != 0) goto L155
            java.lang.String r0 = defpackage.sx7.a
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = "Could not create Input Merger "
            java.lang.String r2 = r2.concat(r15)
            r1.d(r0, r2)
            kx7 r10 = new kx7
            r10.<init>()
            goto L2b9
        L155:
            xb1 r0 = r5.e
            java.util.List r0 = defpackage.hf.b0(r0)
            dx7 r5 = r1.i
            r5.getClass()
            r2.getClass()
            m16 r5 = r5.a
            c70 r6 = new c70
            r12 = 27
            r6.<init>(r2, r12)
            r12 = 1
            java.lang.Object r5 = defpackage.hv.Q(r5, r12, r4, r6)
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r0 = defpackage.gt0.V0(r0, r5)
            wb1 r5 = new wb1
            r5.<init>(r4, r4)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            int r12 = r0.size()
        L185:
            if (r4 >= r12) goto L19c
            java.lang.Object r13 = r0.get(r4)
            int r4 = r4 + 1
            xb1 r13 = (defpackage.xb1) r13
            java.util.HashMap r13 = r13.a
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r13)
            r13.getClass()
            r6.putAll(r13)
            goto L185
        L19c:
            r5.j(r6)
            xb1 r0 = r5.e()
        L1a3:
            androidx.work.WorkerParameters r4 = new androidx.work.WorkerParameters
            java.util.UUID r2 = java.util.UUID.fromString(r2)
            java.util.ArrayList r5 = r1.k
            java.util.concurrent.ExecutorService r6 = r3.a
            xe1 r3 = r3.b
            tw7 r12 = new tw7
            r12.<init>(r8, r7)
            fw7 r13 = new fw7
            o35 r15 = r1.g
            r13.<init>(r8, r15, r7)
            r4.<init>()
            r4.a = r2
            r4.b = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r5)
            r4.c = r6
            r4.d = r3
            r4.e = r7
            r4.f = r11
            r4.g = r12
            r4.h = r13
            android.content.Context r0 = r1.b     // Catch: java.lang.Throwable -> L29d
            nx3 r2 = r11.h(r0, r14, r4)     // Catch: java.lang.Throwable -> L29d
            r12 = 1
            r2.d = r12
            l61 r0 = r9.B
            r0.getClass()
            vs0 r3 = defpackage.vs0.h0
            j61 r0 = r0.Z(r3)
            r0.getClass()
            r6 = r0
            rc3 r6 = (defpackage.rc3) r6
            sl r0 = new sl
            r1 = 1
            r4 = r23
            r5 = r16
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r4
            r6.a0(r0)
            jx7 r0 = new jx7
            r12 = 1
            r0.<init>(r1, r12)
            er2 r3 = new er2
            r3.<init>(r0, r10)
            java.lang.Object r0 = r8.o(r3)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L21e
            mx7 r10 = new mx7
            r10.<init>()
            goto L2b9
        L21e:
            boolean r0 = r6.isCancelled()
            if (r0 == 0) goto L22b
            mx7 r10 = new mx7
            r10.<init>()
            goto L2b9
        L22b:
            ec3 r0 = r7.d
            r0.getClass()
            n61 r6 = defpackage.f04.F(r0)
            vy5 r0 = new vy5     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            r5 = 21
            r3 = r13
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            r12 = 1
            r9.Y = r12     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            java.lang.Object r0 = defpackage.hv.d0(r6, r0, r9)     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            r1 = r20
            if (r0 != r1) goto L24a
            r10 = r1
            goto L2b9
        L24a:
            mx3 r0 = (defpackage.mx3) r0     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            lx7 r10 = new lx7     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            r0.getClass()     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L255 java.util.concurrent.CancellationException -> L257
            goto L2b9
        L255:
            r0 = move-exception
            goto L25b
        L257:
            r0 = move-exception
            r4 = r19
            goto L27d
        L25b:
            java.lang.String r1 = defpackage.sx7.a
            ga0 r2 = defpackage.ga0.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r19
            r3.append(r4)
            java.lang.String r4 = " failed because it threw an exception/error"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.e(r1, r3, r0)
            kx7 r10 = new kx7
            r10.<init>()
            goto L2b9
        L27d:
            java.lang.String r1 = defpackage.sx7.a
            ga0 r2 = defpackage.ga0.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " was cancelled"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            int r2 = r2.b
            r4 = 4
            if (r2 > r4) goto L29c
            android.util.Log.i(r1, r3, r0)
        L29c:
            throw r0
        L29d:
            java.lang.String r0 = defpackage.sx7.a
            ga0 r1 = defpackage.ga0.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Worker "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r1.d(r0, r2)
            kx7 r10 = new kx7
            r10.<init>()
        L2b9:
            return r10
    }

    public final void b(int r6) {
            r5 = this;
            iw7 r0 = defpackage.iw7.ENQUEUED
            dx7 r1 = r5.i
            java.lang.String r2 = r5.c
            r1.h(r0, r2)
            q61 r0 = r5.f
            r0.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r1.g(r3, r2)
            yw7 r5 = r5.a
            int r5 = r5.v
            r1.f(r5, r2)
            r3 = -1
            r1.e(r3, r2)
            r1.i(r6, r2)
            return
    }

    public final void c() {
            r6 = this;
            q61 r0 = r6.f
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            dx7 r2 = r6.i
            java.lang.String r3 = r6.c
            r2.g(r0, r3)
            iw7 r0 = defpackage.iw7.ENQUEUED
            r2.h(r0, r3)
            m16 r0 = r2.a
            c70 r1 = new c70
            r4 = 25
            r1.<init>(r3, r4)
            r4 = 0
            r5 = 1
            java.lang.Object r1 = defpackage.hv.Q(r0, r4, r5, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            yw7 r6 = r6.a
            int r6 = r6.v
            r2.f(r6, r3)
            c70 r6 = new c70
            r1 = 26
            r6.<init>(r3, r1)
            defpackage.hv.Q(r0, r4, r5, r6)
            r0 = -1
            r2.e(r0, r3)
            return
    }

    public final void d(defpackage.mx3 r7) {
            r6 = this;
            r7.getClass()
            java.lang.String r0 = r6.c
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.util.ArrayList r1 = defpackage.hf.d0(r1)
        Ld:
            boolean r2 = r1.isEmpty()
            dx7 r3 = r6.i
            if (r2 != 0) goto L32
            java.lang.Object r2 = defpackage.gt0.Y0(r1)
            java.lang.String r2 = (java.lang.String) r2
            iw7 r4 = r3.c(r2)
            iw7 r5 = defpackage.iw7.CANCELLED
            if (r4 == r5) goto L28
            iw7 r4 = defpackage.iw7.FAILED
            r3.h(r4, r2)
        L28:
            zh1 r3 = r6.j
            java.util.List r2 = r3.a(r2)
            r1.addAll(r2)
            goto Ld
        L32:
            jx3 r7 = (defpackage.jx3) r7
            xb1 r7 = r7.a
            r7.getClass()
            yw7 r6 = r6.a
            int r6 = r6.v
            r3.f(r6, r0)
            m16 r6 = r3.a
            ja7 r1 = new ja7
            r2 = 14
            r1.<init>(r2, r7, r0)
            r7 = 0
            r0 = 1
            defpackage.hv.Q(r6, r7, r0, r1)
            return
    }
}
