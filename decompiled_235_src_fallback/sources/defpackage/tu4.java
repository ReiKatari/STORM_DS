package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu4  reason: default package */
/* loaded from: classes.dex */
public final class tu4 {
    public final defpackage.ey0 a;
    public final defpackage.zx0 b;
    public final defpackage.xq2 c;
    public final defpackage.eo2 d;
    public final boolean e;
    public final defpackage.cg7 f;
    public final java.lang.Object g;
    public final java.util.concurrent.atomic.AtomicReference h;
    public long i;
    public defpackage.ka4 j;
    public final defpackage.jb1 k;
    public final defpackage.jf5 l;

    public tu4(defpackage.ey0 r1, defpackage.zx0 r2, defpackage.xq2 r3, defpackage.ma4 r4, defpackage.eo2 r5, boolean r6, defpackage.cg7 r7, java.lang.Object r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            vu4 r2 = defpackage.vu4.InitialPending
            r1.<init>(r2)
            r0.h = r1
            long r1 = defpackage.kj2.s()
            r0.i = r1
            ka4 r1 = defpackage.c66.a
            r1.getClass()
            r0.j = r1
            jb1 r1 = new jb1
            r1.<init>()
            cy0 r2 = r3.C()
            r1.g(r4, r2)
            r0.k = r1
            jf5 r1 = new jf5
            java.lang.Object r2 = r7.L
            r1.<init>(r2)
            r0.l = r1
            return
    }

    public final void a() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.h
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Exception -> L19
            vu4 r1 = (defpackage.vu4) r1     // Catch: java.lang.Exception -> L19
            int[] r2 = defpackage.su4.a     // Catch: java.lang.Exception -> L19
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L19
            r1 = r2[r1]     // Catch: java.lang.Exception -> L19
            switch(r1) {
                case 1: goto L69;
                case 2: goto L69;
                case 3: goto L69;
                case 4: goto L33;
                case 5: goto L2b;
                case 6: goto L23;
                case 7: goto L1b;
                default: goto L13;
            }     // Catch: java.lang.Exception -> L19
        L13:
            ug r4 = new ug     // Catch: java.lang.Exception -> L19
            r4.<init>()     // Catch: java.lang.Exception -> L19
            throw r4     // Catch: java.lang.Exception -> L19
        L19:
            r4 = move-exception
            goto L71
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "The paused composition is invalid because of a previous exception"
            r4.<init>(r1)     // Catch: java.lang.Exception -> L19
            throw r4     // Catch: java.lang.Exception -> L19
        L23:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "The paused composition has been cancelled"
            r4.<init>(r1)     // Catch: java.lang.Exception -> L19
            throw r4     // Catch: java.lang.Exception -> L19
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "The paused composition has already been applied"
            r4.<init>(r1)     // Catch: java.lang.Exception -> L19
            throw r4     // Catch: java.lang.Exception -> L19
        L33:
            r4.b()     // Catch: java.lang.Exception -> L19
            vu4 r4 = defpackage.vu4.ApplyPending     // Catch: java.lang.Exception -> L19
            vu4 r1 = defpackage.vu4.Applied     // Catch: java.lang.Exception -> L19
        L3a:
            boolean r2 = r0.compareAndSet(r4, r1)     // Catch: java.lang.Exception -> L19
            if (r2 == 0) goto L41
            return
        L41:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> L19
            if (r2 == r4) goto L3a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L19
            r2.<init>()     // Catch: java.lang.Exception -> L19
            java.lang.String r3 = "Unexpected state change from: "
            r2.append(r3)     // Catch: java.lang.Exception -> L19
            r2.append(r4)     // Catch: java.lang.Exception -> L19
            java.lang.String r4 = " to: "
            r2.append(r4)     // Catch: java.lang.Exception -> L19
            r2.append(r1)     // Catch: java.lang.Exception -> L19
            r4 = 46
            r2.append(r4)     // Catch: java.lang.Exception -> L19
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L19
            defpackage.r05.b(r4)     // Catch: java.lang.Exception -> L19
            return
        L69:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "The paused composition has not completed yet"
            r4.<init>(r1)     // Catch: java.lang.Exception -> L19
            throw r4     // Catch: java.lang.Exception -> L19
        L71:
            vu4 r1 = defpackage.vu4.Invalid
            r0.set(r1)
            throw r4
    }

    public final void b() {
            r5 = this;
            java.lang.String r0 = "PausedComposition:applyChanges"
            android.os.Trace.beginSection(r0)
            java.lang.Object r0 = r5.g     // Catch: java.lang.Throwable -> L39
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L39
            r1 = 0
            jf5 r2 = r5.l     // Catch: java.lang.Throwable -> L2c
            cg7 r3 = r5.f     // Catch: java.lang.Throwable -> L2c
            jb1 r4 = r5.k     // Catch: java.lang.Throwable -> L2c
            r2.a(r3, r4)     // Catch: java.lang.Throwable -> L2c
            jb1 r2 = r5.k     // Catch: java.lang.Throwable -> L2c
            r2.c()     // Catch: java.lang.Throwable -> L2c
            jb1 r2 = r5.k     // Catch: java.lang.Throwable -> L2c
            r2.d()     // Catch: java.lang.Throwable -> L2c
            jb1 r2 = r5.k     // Catch: java.lang.Throwable -> L2a
            r2.b()     // Catch: java.lang.Throwable -> L2a
            ey0 r5 = r5.a     // Catch: java.lang.Throwable -> L2a
            r5.m0 = r1     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            android.os.Trace.endSection()
            return
        L2a:
            r5 = move-exception
            goto L37
        L2c:
            r2 = move-exception
            jb1 r3 = r5.k     // Catch: java.lang.Throwable -> L2a
            r3.b()     // Catch: java.lang.Throwable -> L2a
            ey0 r5 = r5.a     // Catch: java.lang.Throwable -> L2a
            r5.m0 = r1     // Catch: java.lang.Throwable -> L2a
            throw r2     // Catch: java.lang.Throwable -> L2a
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r5     // Catch: java.lang.Throwable -> L39
        L39:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    public final boolean c() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.h
            java.lang.Object r1 = r1.get()
            vu4 r1 = (defpackage.vu4) r1
            vu4 r0 = defpackage.vu4.ApplyPending
            int r1 = r1.compareTo(r0)
            if (r1 < 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final void d() {
            r4 = this;
            vu4 r0 = defpackage.vu4.RecomposePending
            vu4 r1 = defpackage.vu4.ApplyPending
        L4:
            java.util.concurrent.atomic.AtomicReference r2 = r4.h
            boolean r3 = r2.compareAndSet(r0, r1)
            if (r3 == 0) goto Le
            r4 = 1
            goto L15
        Le:
            java.lang.Object r2 = r2.get()
            if (r2 == r0) goto L4
            r4 = 0
        L15:
            if (r4 != 0) goto L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected state change from: "
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = " to: "
            r4.append(r0)
            r4.append(r1)
            r0 = 46
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            defpackage.r05.b(r4)
        L35:
            return
    }

    public final boolean e(defpackage.kh6 r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r11.h
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Exception -> L23
            vu4 r1 = (defpackage.vu4) r1     // Catch: java.lang.Exception -> L23
            int[] r2 = defpackage.su4.a     // Catch: java.lang.Exception -> L23
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L23
            r1 = r2[r1]     // Catch: java.lang.Exception -> L23
            ey0 r2 = r11.a
            zx0 r3 = r11.b
            r4 = 46
            java.lang.String r5 = " to: "
            java.lang.String r6 = "Unexpected state change from: "
            switch(r1) {
                case 1: goto Lf8;
                case 2: goto L51;
                case 3: goto L46;
                case 4: goto L3e;
                case 5: goto L36;
                case 6: goto L2e;
                case 7: goto L26;
                default: goto L1d;
            }
        L1d:
            ug r11 = new ug     // Catch: java.lang.Exception -> L23
            r11.<init>()     // Catch: java.lang.Exception -> L23
            throw r11     // Catch: java.lang.Exception -> L23
        L23:
            r11 = move-exception
            goto L154
        L26:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r12 = "The paused composition is invalid because of a previous exception"
            r11.<init>(r12)     // Catch: java.lang.Exception -> L23
            throw r11     // Catch: java.lang.Exception -> L23
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r12 = "The paused composition has been cancelled"
            r11.<init>(r12)     // Catch: java.lang.Exception -> L23
            throw r11     // Catch: java.lang.Exception -> L23
        L36:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r12 = "The paused composition has been applied"
            r11.<init>(r12)     // Catch: java.lang.Exception -> L23
            throw r11     // Catch: java.lang.Exception -> L23
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L23
            java.lang.String r12 = "Pausable composition is complete and apply() should be applied"
            r11.<init>(r12)     // Catch: java.lang.Exception -> L23
            throw r11     // Catch: java.lang.Exception -> L23
        L46:
            java.lang.String r11 = "Recursive call to resume()"
            defpackage.tx0.b(r11)     // Catch: java.lang.Exception -> L23
            ug r11 = new ug     // Catch: java.lang.Exception -> L23
            r11.<init>()     // Catch: java.lang.Exception -> L23
            throw r11     // Catch: java.lang.Exception -> L23
        L51:
            vu4 r1 = defpackage.vu4.RecomposePending     // Catch: java.lang.Exception -> L23
            vu4 r7 = defpackage.vu4.Recomposing     // Catch: java.lang.Exception -> L23
        L55:
            boolean r8 = r0.compareAndSet(r1, r7)     // Catch: java.lang.Exception -> L23
            if (r8 == 0) goto L5c
            goto L7d
        L5c:
            java.lang.Object r8 = r0.get()     // Catch: java.lang.Exception -> L23
            if (r8 == r1) goto L55
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r8.<init>()     // Catch: java.lang.Exception -> L23
            r8.append(r6)     // Catch: java.lang.Exception -> L23
            r8.append(r1)     // Catch: java.lang.Exception -> L23
            r8.append(r5)     // Catch: java.lang.Exception -> L23
            r8.append(r7)     // Catch: java.lang.Exception -> L23
            r8.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Exception -> L23
            defpackage.r05.b(r1)     // Catch: java.lang.Exception -> L23
        L7d:
            long r7 = r11.i     // Catch: java.lang.Exception -> L23
            long r9 = defpackage.kj2.s()     // Catch: java.lang.Throwable -> Lc8
            r11.i = r9     // Catch: java.lang.Throwable -> Lc8
            ka4 r1 = r11.j     // Catch: java.lang.Throwable -> Lc8
            ka4 r12 = r3.n(r2, r12, r1)     // Catch: java.lang.Throwable -> Lc8
            r11.j = r12     // Catch: java.lang.Throwable -> Lc8
            r11.i = r7     // Catch: java.lang.Exception -> L23
            vu4 r12 = defpackage.vu4.Recomposing     // Catch: java.lang.Exception -> L23
            vu4 r1 = defpackage.vu4.RecomposePending     // Catch: java.lang.Exception -> L23
        L93:
            boolean r2 = r0.compareAndSet(r12, r1)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L9a
            goto Lbb
        L9a:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> L23
            if (r2 == r12) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            r2.append(r6)     // Catch: java.lang.Exception -> L23
            r2.append(r12)     // Catch: java.lang.Exception -> L23
            r2.append(r5)     // Catch: java.lang.Exception -> L23
            r2.append(r1)     // Catch: java.lang.Exception -> L23
            r2.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Exception -> L23
            defpackage.r05.b(r12)     // Catch: java.lang.Exception -> L23
        Lbb:
            ka4 r12 = r11.j     // Catch: java.lang.Exception -> L23
            boolean r12 = r12.g()     // Catch: java.lang.Exception -> L23
            if (r12 == 0) goto L148
            r11.d()     // Catch: java.lang.Exception -> L23
            goto L148
        Lc8:
            r12 = move-exception
            r11.i = r7     // Catch: java.lang.Exception -> L23
            vu4 r11 = defpackage.vu4.Recomposing     // Catch: java.lang.Exception -> L23
            vu4 r1 = defpackage.vu4.RecomposePending     // Catch: java.lang.Exception -> L23
        Lcf:
            boolean r2 = r0.compareAndSet(r11, r1)     // Catch: java.lang.Exception -> L23
            if (r2 != 0) goto Lf7
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> L23
            if (r2 != r11) goto Ldc
            goto Lcf
        Ldc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            r2.append(r6)     // Catch: java.lang.Exception -> L23
            r2.append(r11)     // Catch: java.lang.Exception -> L23
            r2.append(r5)     // Catch: java.lang.Exception -> L23
            r2.append(r1)     // Catch: java.lang.Exception -> L23
            r2.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r11 = r2.toString()     // Catch: java.lang.Exception -> L23
            defpackage.r05.b(r11)     // Catch: java.lang.Exception -> L23
        Lf7:
            throw r12     // Catch: java.lang.Exception -> L23
        Lf8:
            xq2 r1 = r11.c
            boolean r7 = r11.e
            if (r7 == 0) goto L104
            r8 = 0
            r1.z = r8     // Catch: java.lang.Exception -> L23
            r8 = 1
            r1.y = r8     // Catch: java.lang.Exception -> L23
        L104:
            eo2 r8 = r11.d     // Catch: java.lang.Throwable -> L14d
            ka4 r12 = r3.b(r2, r12, r8)     // Catch: java.lang.Throwable -> L14d
            r11.j = r12     // Catch: java.lang.Throwable -> L14d
            if (r7 == 0) goto L111
            r1.u()     // Catch: java.lang.Exception -> L23
        L111:
            vu4 r12 = defpackage.vu4.InitialPending     // Catch: java.lang.Exception -> L23
            vu4 r1 = defpackage.vu4.RecomposePending     // Catch: java.lang.Exception -> L23
        L115:
            boolean r2 = r0.compareAndSet(r12, r1)     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L11c
            goto L13d
        L11c:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> L23
            if (r2 == r12) goto L115
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
            r2.<init>()     // Catch: java.lang.Exception -> L23
            r2.append(r6)     // Catch: java.lang.Exception -> L23
            r2.append(r12)     // Catch: java.lang.Exception -> L23
            r2.append(r5)     // Catch: java.lang.Exception -> L23
            r2.append(r1)     // Catch: java.lang.Exception -> L23
            r2.append(r4)     // Catch: java.lang.Exception -> L23
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Exception -> L23
            defpackage.r05.b(r12)     // Catch: java.lang.Exception -> L23
        L13d:
            ka4 r12 = r11.j     // Catch: java.lang.Exception -> L23
            boolean r12 = r12.g()     // Catch: java.lang.Exception -> L23
            if (r12 == 0) goto L148
            r11.d()     // Catch: java.lang.Exception -> L23
        L148:
            boolean r11 = r11.c()
            return r11
        L14d:
            r11 = move-exception
            if (r7 == 0) goto L153
            r1.u()     // Catch: java.lang.Exception -> L23
        L153:
            throw r11     // Catch: java.lang.Exception -> L23
        L154:
            vu4 r12 = defpackage.vu4.Invalid
            r0.set(r12)
            throw r11
    }
}
