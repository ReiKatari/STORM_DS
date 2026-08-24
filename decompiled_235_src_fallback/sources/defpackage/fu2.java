package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu2  reason: default package */
/* loaded from: classes.dex */
public final class fu2 implements defpackage.e66, defpackage.ll4, defpackage.b72 {
    public static final java.lang.String k0 = null;
    public final android.content.Context A;
    public final java.util.HashMap B;
    public final defpackage.wg1 L;
    public boolean R;
    public final java.lang.Object X;
    public final defpackage.rr6 Y;
    public final defpackage.o35 Z;
    public final defpackage.rr6 d0;
    public final defpackage.az0 e0;
    public final java.util.HashMap f0;
    public java.lang.Boolean g0;
    public final defpackage.ww2 h0;
    public final defpackage.ow7 i0;
    public final defpackage.eb j0;

    static {
            java.lang.String r0 = "GreedyScheduler"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.fu2.k0 = r0
            return
    }

    public fu2(android.content.Context r4, defpackage.az0 r5, defpackage.w87 r6, defpackage.o35 r7, defpackage.rr6 r8, defpackage.ow7 r9) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.B = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.X = r0
            wb1 r0 = new wb1
            r1 = 9
            r2 = 0
            r0.<init>(r1, r2)
            rr6 r1 = new rr6
            r1.<init>(r0)
            r3.Y = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f0 = r0
            r3.A = r4
            d51 r4 = r5.g
            wg1 r0 = new wg1
            q61 r1 = r5.d
            r0.<init>(r3, r4, r1)
            r3.L = r0
            eb r0 = new eb
            r0.<init>(r4, r8)
            r3.j0 = r0
            r3.i0 = r9
            ww2 r4 = new ww2
            r4.<init>(r6)
            r3.h0 = r4
            r3.e0 = r5
            r3.Z = r7
            r3.d0 = r8
            return
    }

    @Override // defpackage.ll4
    public final void a(defpackage.yw7 r7, defpackage.x21 r8) {
            r6 = this;
            gw7 r7 = defpackage.rr7.a(r7)
            boolean r0 = r8 instanceof defpackage.v21
            rr6 r1 = r6.d0
            eb r2 = r6.j0
            java.lang.String r3 = defpackage.fu2.k0
            rr6 r6 = r6.Y
            if (r0 == 0) goto L3a
            boolean r8 = r6.g(r7)
            if (r8 != 0) goto L62
            ga0 r8 = defpackage.ga0.f()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Constraints met: Scheduling work ID "
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r8.b(r3, r0)
            jp6 r6 = r6.r(r7)
            r2.O(r6)
            r1.getClass()
            r7 = 0
            r1.p(r6, r7)
            return
        L3a:
            ga0 r0 = defpackage.ga0.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Constraints not met: Cancelling work ID "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r0.b(r3, r4)
            jp6 r6 = r6.l(r7)
            if (r6 == 0) goto L62
            r2.m(r6)
            w21 r8 = (defpackage.w21) r8
            int r7 = r8.a
            r1.getClass()
            r1.q(r6, r7)
        L62:
            return
    }

    @Override // defpackage.b72
    public final void b(defpackage.gw7 r6, boolean r7) {
            r5 = this;
            rr6 r0 = r5.Y
            jp6 r0 = r0.l(r6)
            if (r0 == 0) goto Ld
            eb r1 = r5.j0
            r1.m(r0)
        Ld:
            java.lang.Object r0 = r5.X
            monitor-enter(r0)
            java.util.HashMap r1 = r5.B     // Catch: java.lang.Throwable -> L46
            java.lang.Object r1 = r1.remove(r6)     // Catch: java.lang.Throwable -> L46
            rc3 r1 = (defpackage.rc3) r1     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L36
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.fu2.k0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Stopping tracking for "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r0.b(r2, r3)
            r0 = 0
            r1.h(r0)
        L36:
            if (r7 != 0) goto L45
            java.lang.Object r7 = r5.X
            monitor-enter(r7)
            java.util.HashMap r5 = r5.f0     // Catch: java.lang.Throwable -> L42
            r5.remove(r6)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L42
            return
        L42:
            r5 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L42
            throw r5
        L45:
            return
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
    }

    @Override // defpackage.e66
    public final boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.e66
    public final void d(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = defpackage.fu2.k0
            java.lang.Boolean r1 = r4.g0
            if (r1 != 0) goto L14
            android.content.Context r1 = r4.A
            az0 r2 = r4.e0
            boolean r1 = defpackage.l35.a(r1, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.g0 = r1
        L14:
            java.lang.Boolean r1 = r4.g0
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L26
            ga0 r4 = defpackage.ga0.f()
            java.lang.String r5 = "Ignoring schedule request in non-main process"
            r4.g(r0, r5)
            return
        L26:
            boolean r1 = r4.R
            if (r1 != 0) goto L32
            o35 r1 = r4.Z
            r1.a(r4)
            r1 = 1
            r4.R = r1
        L32:
            ga0 r1 = defpackage.ga0.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cancelling work ID "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.b(r0, r2)
            wg1 r0 = r4.L
            if (r0 == 0) goto L5e
            java.util.HashMap r1 = r0.d
            java.lang.Object r1 = r1.remove(r5)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L5e
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r1)
        L5e:
            rr6 r0 = r4.Y
            r0.getClass()
            r5.getClass()
            java.lang.Object r1 = r0.L
            monitor-enter(r1)
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L93
            wb1 r0 = (defpackage.wb1) r0     // Catch: java.lang.Throwable -> L93
            java.util.List r5 = r0.l(r5)     // Catch: java.lang.Throwable -> L93
            monitor-exit(r1)
            java.util.Iterator r5 = r5.iterator()
        L76:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r5.next()
            jp6 r0 = (defpackage.jp6) r0
            eb r1 = r4.j0
            r1.m(r0)
            rr6 r1 = r4.d0
            r1.getClass()
            r2 = -512(0xfffffffffffffe00, float:NaN)
            r1.q(r0, r2)
            goto L76
        L92:
            return
        L93:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
    }

    @Override // defpackage.e66
    public final void e(defpackage.yw7... r15) {
            r14 = this;
            java.lang.Boolean r0 = r14.g0
            if (r0 != 0) goto L12
            android.content.Context r0 = r14.A
            az0 r1 = r14.e0
            boolean r0 = defpackage.l35.a(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14.g0 = r0
        L12:
            java.lang.Boolean r0 = r14.g0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L26
            ga0 r14 = defpackage.ga0.f()
            java.lang.String r15 = defpackage.fu2.k0
            java.lang.String r0 = "Ignoring schedule request in a secondary process"
            r14.g(r15, r0)
            return
        L26:
            boolean r0 = r14.R
            if (r0 != 0) goto L32
            o35 r0 = r14.Z
            r0.a(r14)
            r0 = 1
            r14.R = r0
        L32:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r2 = r15.length
            r3 = 0
            r4 = r3
        L3f:
            if (r4 >= r2) goto L188
            r5 = r15[r4]
            gw7 r6 = defpackage.rr7.a(r5)
            rr6 r7 = r14.Y
            boolean r6 = r7.g(r6)
            if (r6 == 0) goto L51
            goto L182
        L51:
            java.lang.Object r6 = r14.X
            monitor-enter(r6)
            gw7 r7 = defpackage.rr7.a(r5)     // Catch: java.lang.Throwable -> L7a
            java.util.HashMap r8 = r14.f0     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L7a
            eu2 r8 = (defpackage.eu2) r8     // Catch: java.lang.Throwable -> L7a
            if (r8 != 0) goto L7d
            eu2 r8 = new eu2     // Catch: java.lang.Throwable -> L7a
            int r9 = r5.k     // Catch: java.lang.Throwable -> L7a
            az0 r10 = r14.e0     // Catch: java.lang.Throwable -> L7a
            q61 r10 = r10.d     // Catch: java.lang.Throwable -> L7a
            r10.getClass()     // Catch: java.lang.Throwable -> L7a
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7a
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L7a
            java.util.HashMap r9 = r14.f0     // Catch: java.lang.Throwable -> L7a
            r9.put(r7, r8)     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r14 = move-exception
            goto L186
        L7d:
            long r9 = r8.b     // Catch: java.lang.Throwable -> L7a
            int r7 = r5.k     // Catch: java.lang.Throwable -> L7a
            int r8 = r8.a     // Catch: java.lang.Throwable -> L7a
            int r7 = r7 - r8
            int r7 = r7 + (-5)
            int r7 = java.lang.Math.max(r7, r3)     // Catch: java.lang.Throwable -> L7a
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L7a
            r11 = 30000(0x7530, double:1.4822E-319)
            long r7 = r7 * r11
            long r7 = r7 + r9
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            long r9 = r5.a()
            long r6 = java.lang.Math.max(r9, r7)
            az0 r8 = r14.e0
            q61 r8 = r8.d
            r8.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            iw7 r10 = r5.b
            iw7 r11 = defpackage.iw7.ENQUEUED
            if (r10 != r11) goto L182
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 >= 0) goto Le5
            wg1 r8 = r14.L
            if (r8 == 0) goto L182
            d51 r9 = r8.b
            java.util.HashMap r10 = r8.d
            java.lang.String r11 = r5.a
            java.lang.Object r11 = r10.remove(r11)
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            if (r11 == 0) goto Lc6
            java.lang.Object r12 = r9.B
            android.os.Handler r12 = (android.os.Handler) r12
            r12.removeCallbacks(r11)
        Lc6:
            uo2 r11 = new uo2
            r12 = 9
            r11.<init>(r12, r8, r5, r3)
            java.lang.String r5 = r5.a
            r10.put(r5, r11)
            q61 r5 = r8.c
            r5.getClass()
            long r12 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r12
            java.lang.Object r5 = r9.B
            android.os.Handler r5 = (android.os.Handler) r5
            r5.postDelayed(r11, r6)
            goto L182
        Le5:
            p21 r6 = defpackage.p21.j
            p21 r7 = r5.j
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 != 0) goto L142
            p21 r6 = r5.j
            boolean r7 = r6.d
            if (r7 == 0) goto L112
            ga0 r6 = defpackage.ga0.f()
            java.lang.String r7 = defpackage.fu2.k0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Ignoring "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = ". Requires device idle."
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.b(r7, r5)
            goto L182
        L112:
            java.util.Set r6 = r6.i
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L139
            ga0 r6 = defpackage.ga0.f()
            java.lang.String r7 = defpackage.fu2.k0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Ignoring "
            r8.<init>(r9)
            r8.append(r5)
            java.lang.String r5 = ". Requires ContentUri triggers."
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.b(r7, r5)
            goto L182
        L139:
            r0.add(r5)
            java.lang.String r5 = r5.a
            r1.add(r5)
            goto L182
        L142:
            rr6 r6 = r14.Y
            gw7 r7 = defpackage.rr7.a(r5)
            boolean r6 = r6.g(r7)
            if (r6 != 0) goto L182
            ga0 r6 = defpackage.ga0.f()
            java.lang.String r7 = defpackage.fu2.k0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Starting work for "
            r8.<init>(r9)
            java.lang.String r9 = r5.a
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r6.b(r7, r8)
            rr6 r6 = r14.Y
            r6.getClass()
            gw7 r5 = defpackage.rr7.a(r5)
            jp6 r5 = r6.r(r5)
            eb r6 = r14.j0
            r6.O(r5)
            rr6 r6 = r14.d0
            r6.getClass()
            r7 = 0
            r6.p(r5, r7)
        L182:
            int r4 = r4 + 1
            goto L3f
        L186:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7a
            throw r14
        L188:
            java.lang.Object r15 = r14.X
            monitor-enter(r15)
            boolean r2 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1dd
            if (r2 != 0) goto L1df
            java.lang.String r2 = ","
            java.lang.String r1 = android.text.TextUtils.join(r2, r1)     // Catch: java.lang.Throwable -> L1dd
            ga0 r2 = defpackage.ga0.f()     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r3 = defpackage.fu2.k0     // Catch: java.lang.Throwable -> L1dd
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1dd
            r4.<init>()     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r5 = "Starting tracking for "
            r4.append(r5)     // Catch: java.lang.Throwable -> L1dd
            r4.append(r1)     // Catch: java.lang.Throwable -> L1dd
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L1dd
            r2.b(r3, r1)     // Catch: java.lang.Throwable -> L1dd
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1dd
        L1b5:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1dd
            if (r1 == 0) goto L1df
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1dd
            yw7 r1 = (defpackage.yw7) r1     // Catch: java.lang.Throwable -> L1dd
            gw7 r2 = defpackage.rr7.a(r1)     // Catch: java.lang.Throwable -> L1dd
            java.util.HashMap r3 = r14.B     // Catch: java.lang.Throwable -> L1dd
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L1dd
            if (r3 != 0) goto L1b5
            ww2 r3 = r14.h0     // Catch: java.lang.Throwable -> L1dd
            ow7 r4 = r14.i0     // Catch: java.lang.Throwable -> L1dd
            n61 r4 = r4.b     // Catch: java.lang.Throwable -> L1dd
            ap6 r1 = defpackage.zv7.a(r3, r1, r4, r14)     // Catch: java.lang.Throwable -> L1dd
            java.util.HashMap r3 = r14.B     // Catch: java.lang.Throwable -> L1dd
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L1dd
            goto L1b5
        L1dd:
            r14 = move-exception
            goto L1e1
        L1df:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L1dd
            return
        L1e1:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L1dd
            throw r14
    }
}
