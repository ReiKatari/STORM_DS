package androidx.work.impl.workers;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends androidx.work.CoroutineWorker {
    public final androidx.work.WorkerParameters g;

    public ConstraintTrackingWorker(android.content.Context r1, androidx.work.WorkerParameters r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1, r2)
            r0.g = r2
            return
    }

    public static final java.lang.Object g(androidx.work.impl.workers.ConstraintTrackingWorker r4, defpackage.nx3 r5, defpackage.ww2 r6, defpackage.yw7 r7, defpackage.s41 r8) {
            boolean r0 = r8 instanceof defpackage.d21
            if (r0 == 0) goto L13
            r0 = r8
            d21 r0 = (defpackage.d21) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            d21 r0 = new d21
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
            goto L3f
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            return r2
        L2e:
            defpackage.oi2.Y(r4)
            hn r4 = new hn
            r4.<init>(r5, r6, r7, r2)
            r0.Y = r3
            java.lang.Object r4 = defpackage.g04.C(r4, r0)
            if (r4 != r8) goto L3f
            return r8
        L3f:
            r4.getClass()
            return r4
    }

    public static final java.lang.Object h(androidx.work.impl.workers.ConstraintTrackingWorker r22, defpackage.s41 r23) {
            r1 = r22
            r0 = r23
            java.util.concurrent.atomic.AtomicInteger r7 = r1.c
            androidx.work.WorkerParameters r2 = r1.g
            android.content.Context r3 = r1.a
            androidx.work.WorkerParameters r4 = r1.b
            boolean r5 = r0 instanceof defpackage.e21
            if (r5 == 0) goto L20
            r5 = r0
            e21 r5 = (defpackage.e21) r5
            int r6 = r5.Z
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r6 & r8
            if (r9 == 0) goto L20
            int r6 = r6 - r8
            r5.Z = r6
        L1e:
            r8 = r5
            goto L26
        L20:
            e21 r5 = new e21
            r5.<init>(r1, r0)
            goto L1e
        L26:
            java.lang.Object r0 = r8.X
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.Z
            r10 = 0
            r11 = 1
            if (r5 == 0) goto L4a
            if (r5 != r11) goto L44
            nx3 r1 = r8.R
            defpackage.oi2.Y(r0)     // Catch: java.util.concurrent.CancellationException -> L3d
            r21 = r7
            r23 = r10
            goto L15b
        L3d:
            r0 = move-exception
            r21 = r7
            r23 = r10
            goto L165
        L44:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L4a:
            defpackage.oi2.Y(r0)
            xb1 r0 = r4.b
            java.lang.String r5 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r0 = r0.b(r5)
            java.lang.String r5 = "No worker to delegate to."
            if (r0 == 0) goto L1ba
            int r6 = r0.length()
            if (r6 != 0) goto L61
            goto L1ba
        L61:
            lw7 r6 = defpackage.lw7.b(r3)
            r6.getClass()
            androidx.work.impl.WorkDatabase r12 = r6.c
            dx7 r12 = r12.w()
            java.util.UUID r13 = r4.a
            java.lang.String r13 = r13.toString()
            r13.getClass()
            yw7 r12 = r12.d(r13)
            if (r12 != 0) goto L83
            jx3 r0 = new jx3
            r0.<init>()
            return r0
        L83:
            ww2 r13 = new ww2
            w87 r14 = r6.j
            r14.getClass()
            r13.<init>(r14)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r14 = r13.b
            r23 = r10
            int r10 = r14.size()
            r16 = 0
            r11 = r16
        L9e:
            if (r11 >= r10) goto Lb9
            java.lang.Object r1 = r14.get(r11)
            int r11 = r11 + 1
            r21 = r7
            r7 = r1
            k11 r7 = (defpackage.k11) r7
            boolean r7 = r7.a(r12)
            if (r7 == 0) goto Lb4
            r15.add(r1)
        Lb4:
            r1 = r22
            r7 = r21
            goto L9e
        Lb9:
            r21 = r7
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto Lf7
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r7 = defpackage.zv7.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Work "
            r10.<init>(r11)
            java.lang.String r11 = r12.a
            r10.append(r11)
            java.lang.String r11 = " constrained by "
            r10.append(r11)
            rk7 r11 = new rk7
            r14 = 13
            r11.<init>(r14)
            r20 = 31
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r11
            java.lang.String r11 = defpackage.gt0.P0(r15, r16, r17, r18, r19, r20)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r1.b(r7, r10)
        Lf7:
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L11f
            java.lang.String r1 = defpackage.i21.a
            ga0 r2 = defpackage.ga0.f()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Constraints not met for delegate "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Requesting retry."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.b(r1, r0)
            kx3 r0 = new kx3
            r0.<init>()
            return r0
        L11f:
            java.lang.String r1 = defpackage.i21.a
            ga0 r7 = defpackage.ga0.f()
            java.lang.String r10 = "Constraints met for delegate "
            java.lang.String r10 = r10.concat(r0)
            r7.b(r1, r10)
            is7 r1 = r4.f     // Catch: java.lang.Throwable -> L1a6
            r3.getClass()     // Catch: java.lang.Throwable -> L1a6
            nx3 r1 = r1.h(r3, r0, r2)     // Catch: java.lang.Throwable -> L1a6
            ow7 r0 = r2.e
            ec3 r0 = r0.d
            r0.getClass()
            n61 r7 = defpackage.f04.F(r0)     // Catch: java.util.concurrent.CancellationException -> L163
            l5 r0 = new l5     // Catch: java.util.concurrent.CancellationException -> L163
            r5 = 0
            r6 = 7
            r2 = r1
            r4 = r12
            r3 = r13
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.util.concurrent.CancellationException -> L160
            r8.R = r2     // Catch: java.util.concurrent.CancellationException -> L160
            r1 = 1
            r8.Z = r1     // Catch: java.util.concurrent.CancellationException -> L160
            java.lang.Object r0 = defpackage.hv.d0(r7, r0, r8)     // Catch: java.util.concurrent.CancellationException -> L160
            if (r0 != r9) goto L15a
            return r9
        L15a:
            r1 = r2
        L15b:
            mx3 r0 = (defpackage.mx3) r0     // Catch: java.util.concurrent.CancellationException -> L15e
            return r0
        L15e:
            r0 = move-exception
            goto L165
        L160:
            r0 = move-exception
            r1 = r2
            goto L165
        L163:
            r0 = move-exception
            r2 = r1
        L165:
            int r2 = r21.get()
            r3 = -256(0xffffffffffffff00, float:NaN)
            if (r2 == r3) goto L16e
            goto L172
        L16e:
            boolean r2 = r0 instanceof defpackage.c21
            if (r2 == 0) goto L19b
        L172:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r2 >= r4) goto L17b
            r2 = -512(0xfffffffffffffe00, float:NaN)
            goto L18f
        L17b:
            int r2 = r21.get()
            if (r2 == r3) goto L186
            int r2 = r21.get()
            goto L18f
        L186:
            boolean r2 = r0 instanceof defpackage.c21
            if (r2 == 0) goto L195
            r2 = r0
            c21 r2 = (defpackage.c21) r2
            int r2 = r2.A
        L18f:
            java.util.concurrent.atomic.AtomicInteger r1 = r1.c
            r1.compareAndSet(r3, r2)
            goto L19b
        L195:
            java.lang.String r0 = "Unreachable"
            defpackage.i.m(r0)
            return r23
        L19b:
            boolean r1 = r0 instanceof defpackage.c21
            if (r1 == 0) goto L1a5
            kx3 r0 = new kx3
            r0.<init>()
            goto L1b9
        L1a5:
            throw r0
        L1a6:
            java.lang.String r0 = defpackage.i21.a
            ga0 r1 = defpackage.ga0.f()
            r1.b(r0, r5)
            az0 r0 = r6.b
            r0.getClass()
            jx3 r0 = new jx3
            r0.<init>()
        L1b9:
            return r0
        L1ba:
            java.lang.String r0 = defpackage.i21.a
            ga0 r1 = defpackage.ga0.f()
            r1.d(r0, r5)
            jx3 r0 = new jx3
            r0.<init>()
            return r0
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object e(defpackage.r41 r5) {
            r4 = this;
            androidx.work.WorkerParameters r0 = r4.b
            java.util.concurrent.ExecutorService r0 = r0.c
            r0.getClass()
            n61 r0 = defpackage.f04.F(r0)
            a6 r1 = new a6
            r2 = 0
            r3 = 12
            r1.<init>(r4, r2, r3)
            java.lang.Object r4 = defpackage.hv.d0(r0, r1, r5)
            return r4
    }
}
