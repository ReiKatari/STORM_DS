package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jj7  reason: default package */
/* loaded from: classes.dex */
public final class jj7 {
    public final defpackage.kj7 a;
    public final defpackage.tg0 b;
    public final defpackage.c43 c;
    public final defpackage.tc6 d;
    public final java.lang.Object e;
    public defpackage.kg1 f;
    public final java.util.LinkedHashMap g;
    public java.util.LinkedHashMap h;
    public defpackage.tu0 i;

    public jj7(defpackage.kj7 r1, defpackage.tg0 r2, defpackage.c43 r3, defpackage.tc6 r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.e = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.g = r1
            return
    }

    public static final java.lang.Object a(defpackage.jj7 r4, java.util.List r5, long r6, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.ij7
            if (r0 == 0) goto L13
            r0 = r8
            ij7 r0 = (defpackage.ij7) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ij7 r0 = new ij7
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r4 = r0.R
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.oi2.Y(r4)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            return r2
        L2e:
            defpackage.oi2.Y(r4)
            ns3 r4 = new ns3
            r1 = 19
            r4.<init>(r5, r2, r1)
            r0.Y = r3
            java.lang.Object r4 = defpackage.xk2.N(r6, r4, r0)
            if (r4 != r8) goto L41
            return r8
        L41:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L47
            yt1 r4 = defpackage.yt1.A
        L47:
            return r4
    }

    public static final void b(defpackage.jj7 r5) {
            tg0 r0 = r5.b
            oi0 r0 = r0.a()
            r0.getClass()
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.util.LinkedHashSet r2 = r0.c     // Catch: java.lang.Throwable -> L44
            r2.add(r5)     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashMap r0 = r0.b     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L44
            r2.<init>()     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
        L20:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L44
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L44
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L44
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L44
            if (r4 <= 0) goto L20
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L44
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L44
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L44
            goto L20
        L44:
            r5 = move-exception
            goto L62
        L46:
            java.util.Set r0 = r2.keySet()     // Catch: java.lang.Throwable -> L44
            monitor-exit(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            android.view.Surface r1 = (android.view.Surface) r1
            r5.d(r1)
            goto L51
        L61:
            return
        L62:
            monitor-exit(r1)
            throw r5
    }

    public static java.lang.Object c(defpackage.jj7 r4, defpackage.s41 r5) {
            boolean r0 = r5 instanceof defpackage.hj7
            if (r0 == 0) goto L13
            r0 = r5
            hj7 r0 = (defpackage.hj7) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            hj7 r0 = new hj7
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r5)     // Catch: java.util.concurrent.CancellationException -> L48
            return r5
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r5)
            java.lang.Object r5 = r4.e
            monitor-enter(r5)
            kg1 r2 = r4.f     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5a
            tu0 r4 = r4.i     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3d
            goto L5a
        L3d:
            monitor-exit(r5)
            r0.Y = r3     // Catch: java.util.concurrent.CancellationException -> L48
            java.lang.Object r4 = r2.q(r0)     // Catch: java.util.concurrent.CancellationException -> L48
            if (r4 != r1) goto L47
            return r1
        L47:
            return r4
        L48:
            boolean r4 = defpackage.kj2.L()
            if (r4 == 0) goto L55
            java.lang.String r4 = "CXCP"
            java.lang.String r5 = "Surface setup was cancelled"
            android.util.Log.w(r4, r5)
        L55:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L58:
            r4 = move-exception
            goto L5e
        L5a:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L58
            monitor-exit(r5)
            return r4
        L5e:
            monitor-exit(r5)
            throw r4
    }

    public final void d(android.view.Surface r7) {
            r6 = this;
            java.lang.String r0 = "Error when "
            java.lang.String r1 = "SurfaceActive "
            r7.getClass()
            java.lang.Object r2 = r6.e
            monitor-enter(r2)
            java.util.LinkedHashMap r3 = r6.h     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L72
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L40
            ig1 r3 = (defpackage.ig1) r3     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L72
            java.util.LinkedHashMap r4 = r6.g     // Catch: java.lang.Throwable -> L40
            boolean r4 = r4.containsKey(r7)     // Catch: java.lang.Throwable -> L40
            if (r4 != 0) goto L72
            java.lang.String r4 = "CXCP"
            boolean r4 = defpackage.kj2.F(r4)     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            java.lang.String r4 = "CXCP"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L40
            r5.append(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = " in "
            r5.append(r1)     // Catch: java.lang.Throwable -> L40
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L40
            android.util.Log.d(r4, r1)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L74
        L42:
            java.util.LinkedHashMap r1 = r6.g     // Catch: java.lang.Throwable -> L40
            r1.put(r7, r3)     // Catch: java.lang.Throwable -> L40
            r3.d()     // Catch: java.lang.Throwable -> L40 defpackage.hg1 -> L4b
            goto L72
        L4b:
            r1 = move-exception
            boolean r3 = defpackage.kj2.L()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L68
            java.lang.String r3 = "CXCP"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L40
            r4.append(r7)     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = " going to increase the use count."
            r4.append(r7)     // Catch: java.lang.Throwable -> L40
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L40
            android.util.Log.w(r3, r7, r1)     // Catch: java.lang.Throwable -> L40
        L68:
            tc6 r6 = r6.d     // Catch: java.lang.Throwable -> L40
            ig1 r7 = r1.A     // Catch: java.lang.Throwable -> L40
            r7.getClass()     // Catch: java.lang.Throwable -> L40
            r6.a(r7)     // Catch: java.lang.Throwable -> L40
        L72:
            monitor-exit(r2)
            return
        L74:
            monitor-exit(r2)
            throw r6
    }

    public final void e() {
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r4.g     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L4f
            java.util.LinkedHashMap r1 = r4.h     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L4f
            java.lang.String r1 = "CXCP"
            boolean r1 = defpackage.kj2.F(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = " remove surface listener"
            r2.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r4 = move-exception
            goto L51
        L30:
            tg0 r1 = r4.b     // Catch: java.lang.Throwable -> L2e
            oi0 r1 = r1.a()     // Catch: java.lang.Throwable -> L2e
            r1.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L2e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L2e
            java.util.LinkedHashSet r1 = r1.c     // Catch: java.lang.Throwable -> L4c
            r1.remove(r4)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            tu0 r4 = r4.i     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L4f
            jg7 r1 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L2e
            r4.b0(r1)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L4c:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L4f:
            monitor-exit(r0)
            return
        L51:
            monitor-exit(r0)
            throw r4
    }
}
