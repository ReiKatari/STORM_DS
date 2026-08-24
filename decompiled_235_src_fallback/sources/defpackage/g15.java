package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g15  reason: default package */
/* loaded from: classes.dex */
public final class g15 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ g15(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    private final void a() {
            r15 = this;
            java.lang.Object r0 = r15.B
            qz6 r0 = (defpackage.qz6) r0
            monitor-enter(r0)
            int r1 = r0.g     // Catch: java.lang.Throwable -> Lc1
            r2 = 1
            int r1 = r1 + r2
            r0.g = r1     // Catch: java.lang.Throwable -> Lc1
            lz6 r1 = r0.b()     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r0)
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r3 = r0.getName()
        L1b:
            r4 = -1
            java.lang.String r6 = r1.a     // Catch: java.lang.Throwable -> L3f
            r0.setName(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r6 = r15.B     // Catch: java.lang.Throwable -> L3f
            qz6 r6 = (defpackage.qz6) r6     // Catch: java.lang.Throwable -> L3f
            java.util.logging.Logger r6 = r6.b     // Catch: java.lang.Throwable -> L3f
            pz6 r7 = r1.c     // Catch: java.lang.Throwable -> L3f
            r7.getClass()     // Catch: java.lang.Throwable -> L3f
            java.util.logging.Level r8 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L3f
            boolean r8 = r6.isLoggable(r8)     // Catch: java.lang.Throwable -> L3f
            if (r8 == 0) goto L41
            long r9 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "starting"
            defpackage.jx2.j(r6, r1, r7, r11)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r2 = move-exception
            goto L9e
        L41:
            r9 = r4
        L42:
            long r11 = r1.a()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L65
            long r13 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L3f
            long r13 = r13 - r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r8.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = "finished run in "
            r8.append(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = defpackage.jx2.s(r13)     // Catch: java.lang.Throwable -> L3f
            r8.append(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L3f
            defpackage.jx2.j(r6, r1, r7, r8)     // Catch: java.lang.Throwable -> L3f
        L65:
            java.lang.Object r6 = r15.B     // Catch: java.lang.Throwable -> L3f
            qz6 r6 = (defpackage.qz6) r6     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L3f
            defpackage.qz6.a(r6, r1, r11, r2)     // Catch: java.lang.Throwable -> L7a
            lz6 r7 = r6.b()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            if (r7 != 0) goto L78
            r0.setName(r3)
            return
        L78:
            r1 = r7
            goto L1b
        L7a:
            r2 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            throw r2     // Catch: java.lang.Throwable -> L3f
        L7d:
            r2 = move-exception
            if (r8 == 0) goto L9d
            long r11 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L3f
            long r11 = r11 - r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r8.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = "failed a run in "
            r8.append(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = defpackage.jx2.s(r11)     // Catch: java.lang.Throwable -> L3f
            r8.append(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L3f
            defpackage.jx2.j(r6, r1, r7, r8)     // Catch: java.lang.Throwable -> L3f
        L9d:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L9e:
            java.lang.Object r15 = r15.B     // Catch: java.lang.Throwable -> Lb7
            qz6 r15 = (defpackage.qz6) r15     // Catch: java.lang.Throwable -> Lb7
            monitor-enter(r15)     // Catch: java.lang.Throwable -> Lb7
            r6 = 0
            defpackage.qz6.a(r15, r1, r4, r6)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lb7
            boolean r15 = r2 instanceof java.lang.InterruptedException     // Catch: java.lang.Throwable -> Lb7
            if (r15 == 0) goto Lb9
            java.lang.Thread r15 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lb7
            r15.interrupt()     // Catch: java.lang.Throwable -> Lb7
            r0.setName(r3)
            return
        Lb7:
            r15 = move-exception
            goto Lbd
        Lb9:
            throw r2     // Catch: java.lang.Throwable -> Lb7
        Lba:
            r1 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lb7
            throw r1     // Catch: java.lang.Throwable -> Lb7
        Lbd:
            r0.setName(r3)
            throw r15
        Lc1:
            r15 = move-exception
            monitor-exit(r0)
            throw r15
    }

    public void b() {
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.B     // Catch: java.lang.Throwable -> L51
            vb6 r2 = (defpackage.vb6) r2     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r2 = r2.A     // Catch: java.lang.Throwable -> L51
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.B     // Catch: java.lang.Throwable -> L20
            vb6 r0 = (defpackage.vb6) r0     // Catch: java.lang.Throwable -> L20
            ub6 r3 = r0.R     // Catch: java.lang.Throwable -> L20
            ub6 r4 = defpackage.ub6.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            goto L46
        L20:
            r9 = move-exception
            goto L6b
        L22:
            long r5 = r0.X     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.X = r5     // Catch: java.lang.Throwable -> L20
            r0.R = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.B     // Catch: java.lang.Throwable -> L20
            vb6 r3 = (defpackage.vb6) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.A     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L47
            java.lang.Object r9 = r9.B     // Catch: java.lang.Throwable -> L20
            vb6 r9 = (defpackage.vb6) r9     // Catch: java.lang.Throwable -> L20
            ub6 r0 = defpackage.ub6.IDLE     // Catch: java.lang.Throwable -> L20
            r9.R = r0     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L51
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L51 java.lang.RuntimeException -> L53
            goto L2
        L51:
            r9 = move-exception
            goto L6d
        L53:
            r2 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r5.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L51
            r5.append(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L51
            defpackage.kj2.w(r4, r3, r2)     // Catch: java.lang.Throwable -> L51
            goto L2
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r9     // Catch: java.lang.Throwable -> L51
        L6d:
            if (r1 == 0) goto L76
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L76:
            throw r9
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            int r0 = r1.A
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L270;
                case 1: goto L249;
                case 2: goto L1b8;
                case 3: goto L194;
                case 4: goto L184;
                case 5: goto L17a;
                case 6: goto L172;
                case 7: goto L159;
                case 8: goto L129;
                case 9: goto L119;
                case 10: goto L111;
                case 11: goto L109;
                case 12: goto L101;
                case 13: goto Le9;
                case 14: goto Le0;
                case 15: goto Lbf;
                case 16: goto Lb7;
                case 17: goto Lad;
                case 18: goto La3;
                case 19: goto L9b;
                case 20: goto L82;
                case 21: goto L7a;
                case 22: goto L76;
                case 23: goto L67;
                case 24: goto L5f;
                case 25: goto L26;
                case 26: goto L1e;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.B
            eb r0 = (defpackage.eb) r0
            java.lang.Object r1 = r0.X
            i36 r1 = (defpackage.i36) r1
            j97 r2 = new j97
            r3 = 15
            r2.<init>(r0, r3)
            r1.n(r2)
            return
        L1e:
            java.lang.Object r0 = r1.B
            ho7 r0 = (defpackage.ho7) r0
            r0.n(r4)
            return
        L26:
            java.lang.Object r0 = r1.B
            i87 r0 = (defpackage.i87) r0
            android.view.Window$Callback r1 = r0.m
            android.view.Menu r0 = r0.L0()
            boolean r2 = r0 instanceof defpackage.i44
            if (r2 == 0) goto L38
            r2 = r0
            i44 r2 = (defpackage.i44) r2
            goto L39
        L38:
            r2 = r3
        L39:
            if (r2 == 0) goto L3e
            r2.w()
        L3e:
            r0.clear()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r1.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            boolean r1 = r1.onPreparePanel(r4, r3, r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L53
            goto L50
        L4e:
            r0 = move-exception
            goto L59
        L50:
            r0.clear()     // Catch: java.lang.Throwable -> L4e
        L53:
            if (r2 == 0) goto L58
            r2.v()
        L58:
            return
        L59:
            if (r2 == 0) goto L5e
            r2.v()
        L5e:
            throw r0
        L5f:
            java.lang.Object r0 = r1.B
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.w()
            return
        L67:
            java.lang.Object r0 = r1.B
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            n42 r0 = r0.L
            com.google.android.material.internal.CheckableImageButton r0 = r0.f0
            r0.performClick()
            r0.jumpDrawablesToCurrentState()
            return
        L76:
            r1.a()
            return
        L7a:
            java.lang.Object r0 = r1.B
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.D0()
            return
        L82:
            r1.b()     // Catch: java.lang.Error -> L86
            return
        L86:
            r0 = move-exception
            java.lang.Object r2 = r1.B
            vb6 r2 = (defpackage.vb6) r2
            java.util.ArrayDeque r2 = r2.A
            monitor-enter(r2)
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L98
            vb6 r1 = (defpackage.vb6) r1     // Catch: java.lang.Throwable -> L98
            ub6 r3 = defpackage.ub6.IDLE     // Catch: java.lang.Throwable -> L98
            r1.R = r3     // Catch: java.lang.Throwable -> L98
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L98
            throw r0
        L98:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L98
            throw r0
        L9b:
            java.lang.Object r0 = r1.B
            t15 r0 = (defpackage.t15) r0
            r0.m()
            return
        La3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Object r1 = r1.B
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.<init>(r1)
            throw r0
        Lad:
            java.lang.Object r0 = r1.B
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            androidx.constraintlayout.motion.widget.a r0 = r0.j1
            r0.a()
            return
        Lb7:
            java.lang.Object r0 = r1.B
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.setNestedScrollingEnabled(r5)
            return
        Lbf:
            java.lang.Object r0 = r1.B
            qx3 r0 = (defpackage.qx3) r0
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            java.lang.Object r0 = r1.B     // Catch: java.lang.Throwable -> Ldd
            qx3 r0 = (defpackage.qx3) r0     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r0 = r0.f     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r3 = r1.B     // Catch: java.lang.Throwable -> Ldd
            qx3 r3 = (defpackage.qx3) r3     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r4 = defpackage.qx3.k     // Catch: java.lang.Throwable -> Ldd
            r3.f = r4     // Catch: java.lang.Throwable -> Ldd
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r1 = r1.B
            qx3 r1 = (defpackage.qx3) r1
            r1.f(r0)
            return
        Ldd:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ldd
            throw r0
        Le0:
            java.lang.Object r0 = r1.B
            pw3 r0 = (defpackage.pw3) r0
            r0.B = r3
            r0.A = r3
            return
        Le9:
            java.lang.Object r0 = r1.B
            bt r0 = (defpackage.bt) r0
            java.lang.Object r1 = r0.R
            nv2 r1 = (defpackage.nv2) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.A
            java.lang.Object r2 = r2.getAndSet(r3)
            if (r2 == 0) goto L100
            java.lang.Object r0 = r0.B
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r1)
        L100:
            return
        L101:
            java.lang.Object r0 = r1.B
            rj0 r0 = (defpackage.rj0) r0
            defpackage.lv2.a(r0)
            return
        L109:
            java.lang.Object r0 = r1.B
            gx3 r0 = (defpackage.gx3) r0
            r0.cancel(r5)
            return
        L111:
            java.lang.Object r0 = r1.B
            androidx.fragment.app.u r0 = (androidx.fragment.app.u) r0
            r0.z(r5)
            return
        L119:
            java.lang.Object r0 = r1.B
            androidx.fragment.app.h r0 = (androidx.fragment.app.h) r0
            java.util.ArrayList r1 = r0.b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L128
            r0.e()
        L128:
            return
        L129:
            java.lang.Object r0 = r1.B
            u92 r0 = (defpackage.u92) r0
            android.animation.ValueAnimator r1 = r0.z
            int r3 = r0.A
            if (r3 == r5) goto L136
            if (r3 == r2) goto L139
            goto L158
        L136:
            r1.cancel()
        L139:
            r3 = 3
            r0.A = r3
            java.lang.Object r0 = r1.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            float[] r2 = new float[r2]
            r2[r4] = r0
            r0 = 0
            r2[r5] = r0
            r1.setFloatValues(r2)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r1.start()
        L158:
            return
        L159:
            java.lang.Object r0 = r1.B
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            int r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            r0.S()
            android.os.Handler r0 = r0.N0
            if (r0 == 0) goto L16c
            r2 = 1500(0x5dc, double:7.41E-321)
            r0.postDelayed(r1, r2)
            return
        L16c:
            java.lang.String r0 = "handler"
            defpackage.nb3.a0(r0)
            throw r3
        L172:
            java.lang.Object r0 = r1.B
            fs1 r0 = (defpackage.fs1) r0
            r0.m()
            return
        L17a:
            java.lang.Object r0 = r1.B
            mp1 r0 = (defpackage.mp1) r0
            r0.k0 = r3
            r0.drawableStateChanged()
            return
        L184:
            java.lang.Object r0 = r1.B
            androidx.fragment.app.i r0 = (androidx.fragment.app.i) r0
            android.content.DialogInterface$OnDismissListener r1 = androidx.fragment.app.i.access$100(r0)
            android.app.Dialog r0 = androidx.fragment.app.i.access$000(r0)
            r1.onDismiss(r0)
            return
        L194:
            java.lang.Object r0 = r1.B
            k60 r0 = (defpackage.k60) r0
            r0.c = r4
            java.lang.Object r1 = r0.e
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            ho7 r3 = r1.O
            if (r3 == 0) goto L1ae
            boolean r3 = r3.f()
            if (r3 == 0) goto L1ae
            int r1 = r0.b
            r0.a(r1)
            goto L1b7
        L1ae:
            int r3 = r1.N
            if (r3 != r2) goto L1b7
            int r0 = r0.b
            r1.J(r0)
        L1b7:
            return
        L1b8:
            java.lang.Object r0 = r1.B
            fx3 r0 = (defpackage.fx3) r0
            mp1 r2 = r0.L
            mx r3 = r0.A
            boolean r5 = r0.k0
            if (r5 != 0) goto L1c6
            goto L248
        L1c6:
            boolean r5 = r0.i0
            if (r5 == 0) goto L1dc
            r0.i0 = r4
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r3.e = r5
            r7 = -1
            r3.g = r7
            r3.f = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r3.h = r5
        L1dc:
            long r5 = r3.g
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L1f3
            long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r9 = r3.g
            int r11 = r3.i
            long r11 = (long) r11
            long r9 = r9 + r11
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 <= 0) goto L1f3
            goto L1f9
        L1f3:
            boolean r5 = r0.e()
            if (r5 != 0) goto L1fc
        L1f9:
            r0.k0 = r4
            goto L248
        L1fc:
            boolean r5 = r0.j0
            if (r5 == 0) goto L216
            r0.j0 = r4
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            r2.onTouchEvent(r4)
            r4.recycle()
        L216:
            long r4 = r3.f
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L243
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r6 = r3.a(r4)
            r7 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r7 = r7 * r6
            float r7 = r7 * r6
            r8 = 1082130432(0x40800000, float:4.0)
            float r6 = r6 * r8
            float r6 = r6 + r7
            long r7 = r3.f
            long r7 = r4 - r7
            r3.f = r4
            float r4 = (float) r7
            float r4 = r4 * r6
            float r3 = r3.d
            float r4 = r4 * r3
            int r3 = (int) r4
            mp1 r0 = r0.m0
            r0.scrollListBy(r3)
            java.util.WeakHashMap r0 = defpackage.ao7.a
            r2.postOnAnimation(r1)
            goto L248
        L243:
            java.lang.String r0 = "Cannot compute scroll delta before calling start()"
            defpackage.u34.j(r0)
        L248:
            return
        L249:
            java.lang.Object r0 = r1.B
            r6 = r0
            te r6 = (defpackage.te) r6
            r6.removeCallbacks(r1)
            android.view.MotionEvent r7 = r6.r1
            if (r7 == 0) goto L26f
            int r0 = r7.getActionMasked()
            r1 = 10
            if (r0 == r1) goto L26f
            if (r0 == r5) goto L26f
            r1 = 7
            if (r0 == r1) goto L268
            r3 = 9
            if (r0 == r3) goto L268
            r8 = r2
            goto L269
        L268:
            r8 = r1
        L269:
            long r9 = r6.s1
            r11 = 0
            r6.F(r7, r8, r9, r11)
        L26f:
            return
        L270:
            java.lang.Object r0 = r1.B
            k15 r0 = (defpackage.k15) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.mList
            r0.focusableViewAvailable(r0)
            return
    }
}
