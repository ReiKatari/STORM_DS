package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo2  reason: default package */
/* loaded from: classes.dex */
public final class uo2 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public final java.lang.Object L;

    public /* synthetic */ uo2(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    public /* synthetic */ uo2(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.A = r1
            r0.L = r2
            r0.B = r3
            r0.<init>()
            return
    }

    public uo2(com.google.android.material.behavior.SwipeDismissBehavior r1, android.view.View r2, boolean r3) {
            r0 = this;
            r3 = 16
            r0.A = r3
            r0.<init>()
            r0.L = r1
            r0.B = r2
            return
    }

    private final void a() {
            r3 = this;
            r0 = 0
        L1:
            java.lang.Object r1 = r3.B     // Catch: java.lang.Throwable -> L9
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L9
            r1.run()     // Catch: java.lang.Throwable -> L9
            goto Lf
        L9:
            r1 = move-exception
            vt1 r2 = defpackage.vt1.A     // Catch: java.lang.Throwable -> L38
            defpackage.f04.H(r2, r1)     // Catch: java.lang.Throwable -> L38
        Lf:
            java.lang.Object r1 = r3.L     // Catch: java.lang.Throwable -> L38
            ru3 r1 = (defpackage.ru3) r1     // Catch: java.lang.Throwable -> L38
            java.lang.Runnable r1 = r1.n0()     // Catch: java.lang.Throwable -> L38
            if (r1 != 0) goto L1a
            goto L37
        L1a:
            r3.B = r1     // Catch: java.lang.Throwable -> L38
            int r0 = r0 + 1
            r1 = 16
            if (r0 < r1) goto L1
            java.lang.Object r1 = r3.L     // Catch: java.lang.Throwable -> L38
            ru3 r1 = (defpackage.ru3) r1     // Catch: java.lang.Throwable -> L38
            n61 r2 = r1.R     // Catch: java.lang.Throwable -> L38
            boolean r1 = defpackage.ok1.c(r2, r1)     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1
            java.lang.Object r0 = r3.L     // Catch: java.lang.Throwable -> L38
            ru3 r0 = (defpackage.ru3) r0     // Catch: java.lang.Throwable -> L38
            n61 r1 = r0.R     // Catch: java.lang.Throwable -> L38
            defpackage.ok1.b(r1, r0, r3)     // Catch: java.lang.Throwable -> L38
        L37:
            return
        L38:
            r0 = move-exception
            java.lang.Object r3 = r3.L
            ru3 r3 = (defpackage.ru3) r3
            java.lang.Object r1 = r3.Z
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.ru3.d0     // Catch: java.lang.Throwable -> L47
            r2.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            throw r0
        L47:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }

    private final void b() {
            r2 = this;
            java.lang.Object r0 = r2.L     // Catch: java.lang.Throwable -> L1a
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L1a
            r0.run()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r2.B
            zb6 r0 = (defpackage.zb6) r0
            java.lang.Object r0 = r0.X
            monitor-enter(r0)
            java.lang.Object r2 = r2.B     // Catch: java.lang.Throwable -> L17
            zb6 r2 = (defpackage.zb6) r2     // Catch: java.lang.Throwable -> L17
            r2.a()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
        L1a:
            r0 = move-exception
            java.lang.Object r1 = r2.B
            zb6 r1 = (defpackage.zb6) r1
            java.lang.Object r1 = r1.X
            monitor-enter(r1)
            java.lang.Object r2 = r2.B     // Catch: java.lang.Throwable -> L2b
            zb6 r2 = (defpackage.zb6) r2     // Catch: java.lang.Throwable -> L2b
            r2.a()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0
        L2b:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2b
            throw r2
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L20c;
                case 1: goto L1d9;
                case 2: goto L1d0;
                case 3: goto L1c4;
                case 4: goto L17d;
                case 5: goto L16b;
                case 6: goto L12e;
                case 7: goto L10b;
                case 8: goto Le9;
                case 9: goto Lbe;
                case 10: goto Lb0;
                case 11: goto L9c;
                case 12: goto L98;
                case 13: goto L8e;
                case 14: goto L80;
                case 15: goto L7c;
                case 16: goto L66;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r5.L
            mx6 r0 = (defpackage.mx6) r0
            lw7 r0 = r0.A
            o35 r0 = r0.f
            java.lang.Object r1 = r5.B
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.k
            monitor-enter(r3)
            rx7 r0 = r0.c(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            yw7 r2 = r0.a     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r5 = move-exception
            goto L64
        L22:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
        L23:
            if (r2 == 0) goto L63
            p21 r0 = defpackage.p21.j
            p21 r1 = r2.j
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L63
            java.lang.Object r0 = r5.L
            mx6 r0 = (defpackage.mx6) r0
            java.lang.Object r0 = r0.L
            monitor-enter(r0)
            java.lang.Object r1 = r5.L     // Catch: java.lang.Throwable -> L60
            mx6 r1 = (defpackage.mx6) r1     // Catch: java.lang.Throwable -> L60
            java.util.HashMap r1 = r1.Y     // Catch: java.lang.Throwable -> L60
            gw7 r3 = defpackage.rr7.a(r2)     // Catch: java.lang.Throwable -> L60
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r5.L     // Catch: java.lang.Throwable -> L60
            mx6 r1 = (defpackage.mx6) r1     // Catch: java.lang.Throwable -> L60
            ww2 r3 = r1.d0     // Catch: java.lang.Throwable -> L60
            ow7 r4 = r1.B     // Catch: java.lang.Throwable -> L60
            n61 r4 = r4.b     // Catch: java.lang.Throwable -> L60
            ap6 r1 = defpackage.zv7.a(r3, r2, r4, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r5.L     // Catch: java.lang.Throwable -> L60
            mx6 r5 = (defpackage.mx6) r5     // Catch: java.lang.Throwable -> L60
            java.util.HashMap r5 = r5.Z     // Catch: java.lang.Throwable -> L60
            gw7 r2 = defpackage.rr7.a(r2)     // Catch: java.lang.Throwable -> L60
            r5.put(r2, r1)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r5
        L63:
            return
        L64:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r5
        L66:
            java.lang.Object r0 = r5.L
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            ho7 r0 = r0.a
            if (r0 == 0) goto L7b
            boolean r0 = r0.f()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r5.B
            android.view.View r0 = (android.view.View) r0
            r0.postOnAnimation(r5)
        L7b:
            return
        L7c:
            r5.b()
            return
        L80:
            java.lang.Object r0 = r5.L
            rj0 r0 = (defpackage.rj0) r0
            java.lang.Object r5 = r5.B
            f72 r5 = (defpackage.f72) r5
            jg7 r1 = defpackage.jg7.a
            r0.I(r5, r1)
            return
        L8e:
            java.lang.Object r0 = r5.B
            jr1 r0 = (defpackage.jr1) r0
            java.lang.Object r5 = r5.L
            r0.accept(r5)
            return
        L98:
            r5.a()
            return
        L9c:
            java.lang.Object r0 = r5.B
            si3 r0 = (defpackage.si3) r0
            r41 r0 = defpackage.np2.V(r0)
            java.lang.Object r5 = r5.L
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            em5 r5 = defpackage.oi2.p(r5)
            r0.i(r5)
            return
        Lb0:
            java.lang.Object r0 = r5.B
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r0
            java.lang.Object r5 = r5.L
            android.app.job.JobParameters r5 = (android.app.job.JobParameters) r5
            int r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.A
            r0.jobFinished(r5, r1)
            return
        Lbe:
            ga0 r0 = defpackage.ga0.f()
            java.lang.String r1 = defpackage.wg1.e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Scheduling work "
            r2.<init>(r3)
            java.lang.Object r3 = r5.B
            yw7 r3 = (defpackage.yw7) r3
            java.lang.String r4 = r3.a
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
            java.lang.Object r5 = r5.L
            wg1 r5 = (defpackage.wg1) r5
            fu2 r5 = r5.a
            yw7[] r0 = new defpackage.yw7[]{r3}
            r5.e(r0)
            return
        Le9:
            java.lang.Object r0 = r5.B
            tr3 r0 = (defpackage.tr3) r0
            java.lang.Object r5 = r5.L
            o55 r5 = (defpackage.o55) r5
            monitor-enter(r0)
            java.util.Set r1 = r0.b     // Catch: java.lang.Throwable -> Lfc
            if (r1 != 0) goto Lfe
            java.util.Set r1 = r0.a     // Catch: java.lang.Throwable -> Lfc
            r1.add(r5)     // Catch: java.lang.Throwable -> Lfc
            goto L107
        Lfc:
            r5 = move-exception
            goto L109
        Lfe:
            java.util.Set r1 = r0.b     // Catch: java.lang.Throwable -> Lfc
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> Lfc
            r1.add(r5)     // Catch: java.lang.Throwable -> Lfc
        L107:
            monitor-exit(r0)
            return
        L109:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lfc
            throw r5
        L10b:
            java.lang.Object r0 = r5.B
            do4 r0 = (defpackage.do4) r0
            java.lang.Object r5 = r5.L
            o55 r5 = (defpackage.o55) r5
            o55 r1 = r0.b
            wv0 r3 = defpackage.wv0.c
            if (r1 != r3) goto L128
            monitor-enter(r0)
            d90 r1 = r0.a     // Catch: java.lang.Throwable -> L125
            r0.a = r2     // Catch: java.lang.Throwable -> L125
            r0.b = r5     // Catch: java.lang.Throwable -> L125
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L125
            r1.getClass()
            goto L12d
        L125:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L125
            throw r5
        L128:
            java.lang.String r5 = "provide() can be called only once."
            defpackage.i.m(r5)
        L12d:
            return
        L12e:
            java.lang.Object r0 = r5.L     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
            ll0 r0 = (defpackage.ll0) r0     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
            java.lang.Object r3 = r5.B     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
            gx3 r3 = (defpackage.gx3) r3     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
            java.lang.Object r3 = defpackage.l.w(r3)     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
            qb0 r0 = r0.B     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
            if (r0 == 0) goto L141
            r0.a(r3)     // Catch: java.lang.Throwable -> L148 java.util.concurrent.ExecutionException -> L14a java.util.concurrent.CancellationException -> L15b
        L141:
            java.lang.Object r5 = r5.L
            ll0 r5 = (defpackage.ll0) r5
            r5.Z = r2
            goto L163
        L148:
            r0 = move-exception
            goto L164
        L14a:
            r0 = move-exception
            java.lang.Object r1 = r5.L     // Catch: java.lang.Throwable -> L148
            ll0 r1 = (defpackage.ll0) r1     // Catch: java.lang.Throwable -> L148
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L148
            qb0 r1 = r1.B     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto L141
            r1.c(r0)     // Catch: java.lang.Throwable -> L148
            goto L141
        L15b:
            java.lang.Object r0 = r5.L     // Catch: java.lang.Throwable -> L148
            ll0 r0 = (defpackage.ll0) r0     // Catch: java.lang.Throwable -> L148
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L148
            goto L141
        L163:
            return
        L164:
            java.lang.Object r5 = r5.L
            ll0 r5 = (defpackage.ll0) r5
            r5.Z = r2
            throw r0
        L16b:
            java.lang.Object r0 = r5.B
            j97 r0 = (defpackage.j97) r0
            java.lang.Object r5 = r5.L
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            java.lang.Object r0 = r0.B
            gi2 r0 = (defpackage.gi2) r0
            if (r0 == 0) goto L17c
            r0.L(r5)
        L17c:
            return
        L17d:
            java.lang.Object r0 = r5.L
            java.lang.Object r5 = r5.B
            java.lang.reflect.Method r1 = defpackage.x8.d     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            if (r1 == 0) goto L191
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            java.lang.String r3 = "AppCompat recreation"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            r1.invoke(r5, r0)     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            goto L1c3
        L191:
            java.lang.reflect.Method r1 = defpackage.x8.e     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            r1.invoke(r5, r0)     // Catch: java.lang.Throwable -> L19d java.lang.RuntimeException -> L1a6
            goto L1c3
        L19d:
            r5 = move-exception
            java.lang.String r0 = "ActivityRecreator"
            java.lang.String r1 = "Exception while invoking performStopActivity"
            android.util.Log.e(r0, r1, r5)
            goto L1c3
        L1a6:
            r5 = move-exception
            java.lang.Class r0 = r5.getClass()
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            if (r0 != r1) goto L1c3
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L1c3
            java.lang.String r0 = r5.getMessage()
            java.lang.String r1 = "Unable to stop"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L1c2
            goto L1c3
        L1c2:
            throw r5
        L1c3:
            return
        L1c4:
            java.lang.Object r0 = r5.B
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Object r5 = r5.L
            w8 r5 = (defpackage.w8) r5
            r0.unregisterActivityLifecycleCallbacks(r5)
            return
        L1d0:
            java.lang.Object r0 = r5.B
            w8 r0 = (defpackage.w8) r0
            java.lang.Object r5 = r5.L
            r0.A = r5
            return
        L1d9:
            java.lang.Object r0 = r5.B
            d8 r0 = (defpackage.d8) r0
            java.lang.Object r5 = r5.L
            g8 r5 = (defpackage.g8) r5
            i44 r3 = r5.L
            if (r3 == 0) goto L1ec
            g44 r4 = r3.e
            if (r4 == 0) goto L1ec
            r4.H(r3)
        L1ec:
            d54 r3 = r5.d0
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L209
            android.os.IBinder r3 = r3.getWindowToken()
            if (r3 == 0) goto L209
            boolean r3 = r0.b()
            if (r3 == 0) goto L1ff
            goto L207
        L1ff:
            android.view.View r3 = r0.e
            if (r3 != 0) goto L204
            goto L209
        L204:
            r0.d(r1, r1, r1, r1)
        L207:
            r5.o0 = r0
        L209:
            r5.q0 = r2
            return
        L20c:
            java.lang.Object r0 = r5.L
            so2 r0 = (defpackage.so2) r0
            java.lang.Object r5 = r5.B     // Catch: java.lang.Error -> L21c java.lang.RuntimeException -> L21e java.util.concurrent.ExecutionException -> L220
            java.util.concurrent.Future r5 = (java.util.concurrent.Future) r5     // Catch: java.lang.Error -> L21c java.lang.RuntimeException -> L21e java.util.concurrent.ExecutionException -> L220
            java.lang.Object r5 = defpackage.l.v(r5)     // Catch: java.lang.Error -> L21c java.lang.RuntimeException -> L21e java.util.concurrent.ExecutionException -> L220
            r0.onSuccess(r5)
            goto L233
        L21c:
            r5 = move-exception
            goto L222
        L21e:
            r5 = move-exception
            goto L222
        L220:
            r5 = move-exception
            goto L226
        L222:
            r0.i(r5)
            goto L233
        L226:
            java.lang.Throwable r1 = r5.getCause()
            if (r1 != 0) goto L230
            r0.i(r5)
            goto L233
        L230:
            r0.i(r1)
        L233:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<uo2> r1 = defpackage.uo2.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            java.lang.Object r2 = r2.L
            so2 r2 = (defpackage.so2) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
