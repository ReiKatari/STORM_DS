package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y42  reason: default package */
/* loaded from: classes.dex */
public abstract class y42 {
    public static final java.lang.String a = null;

    static {
            java.lang.String r0 = "EnqueueRunnable"
            java.lang.String r0 = defpackage.ga0.h(r0)
            defpackage.y42.a = r0
            return
    }

    public static boolean a(defpackage.aw7 r23) {
            r0 = r23
            java.util.HashSet r1 = defpackage.aw7.b(r0)
            lw7 r2 = r0.a
            java.util.List r3 = r0.d
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r5)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r5 = r0.b
            y72 r6 = r0.c
            az0 r7 = r2.b
            q61 r7 = r7.d
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r9 = r2.c
            if (r1 == 0) goto L2b
            int r11 = r1.length
            if (r11 <= 0) goto L2b
            r11 = 1
            goto L2c
        L2b:
            r11 = r4
        L2c:
            if (r11 == 0) goto L7c
            int r12 = r1.length
            r13 = r4
            r15 = r13
            r16 = r15
            r14 = 1
        L34:
            if (r13 >= r12) goto L80
            r10 = r1[r13]
            dx7 r4 = r9.w()
            yw7 r4 = r4.d(r10)
            if (r4 != 0) goto L62
            ga0 r1 = defpackage.ga0.f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Prerequisite "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = defpackage.y42.a
            r1.d(r3, r2)
        L5e:
            r4 = 0
            r9 = 1
            goto L350
        L62:
            iw7 r4 = r4.b
            iw7 r10 = defpackage.iw7.SUCCEEDED
            if (r4 != r10) goto L6a
            r10 = 1
            goto L6b
        L6a:
            r10 = 0
        L6b:
            r14 = r14 & r10
            iw7 r10 = defpackage.iw7.FAILED
            if (r4 != r10) goto L73
            r16 = 1
            goto L78
        L73:
            iw7 r10 = defpackage.iw7.CANCELLED
            if (r4 != r10) goto L78
            r15 = 1
        L78:
            int r13 = r13 + 1
            r4 = 0
            goto L34
        L7c:
            r14 = 1
            r15 = 0
            r16 = 0
        L80:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L1d8
            if (r11 != 0) goto L1d8
            dx7 r10 = r9.w()
            r10.getClass()
            r5.getClass()
            m16 r10 = r10.a
            cx7 r12 = new cx7
            r13 = 0
            r12.<init>(r5, r13)
            r17 = r3
            r3 = 1
            java.lang.Object r10 = defpackage.hv.Q(r10, r3, r13, r12)
            java.util.List r10 = (java.util.List) r10
            boolean r3 = r10.isEmpty()
            if (r3 != 0) goto L1d3
            y72 r3 = defpackage.y72.APPEND
            r12 = 29
            if (r6 == r3) goto L11c
            y72 r3 = defpackage.y72.APPEND_OR_REPLACE
            if (r6 != r3) goto Lb4
            goto L11c
        Lb4:
            y72 r3 = defpackage.y72.KEEP
            if (r6 != r3) goto Ld3
            java.util.Iterator r3 = r10.iterator()
        Lbc:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r3.next()
            ww7 r6 = (defpackage.ww7) r6
            iw7 r6 = r6.b
            iw7 r13 = defpackage.iw7.ENQUEUED
            if (r6 == r13) goto L5e
            iw7 r13 = defpackage.iw7.RUNNING
            if (r6 != r13) goto Lbc
            goto L5e
        Ld3:
            r9.getClass()
            v r3 = new v
            r6 = 7
            r3.<init>(r9, r5, r2, r6)
            er2 r6 = new er2
            r13 = 26
            r6.<init>(r3, r13)
            r9.o(r6)
            dx7 r3 = r9.w()
            java.util.Iterator r6 = r10.iterator()
        Lee:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L115
            java.lang.Object r10 = r6.next()
            ww7 r10 = (defpackage.ww7) r10
            java.lang.String r10 = r10.a
            r3.getClass()
            r10.getClass()
            m16 r13 = r3.a
            r18 = r3
            c70 r3 = new c70
            r3.<init>(r10, r12)
            r10 = 0
            r12 = 1
            defpackage.hv.Q(r13, r10, r12, r3)
            r3 = r18
            r12 = 29
            goto Lee
        L115:
            r18 = r4
            r21 = r9
            r3 = 1
            goto L1db
        L11c:
            zh1 r3 = r9.r()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L129:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L17c
            java.lang.Object r12 = r10.next()
            ww7 r12 = (defpackage.ww7) r12
            java.lang.String r13 = r12.a
            r3.getClass()
            r13.getClass()
            r18 = r4
            m16 r4 = r3.a
            r20 = r3
            c70 r3 = new c70
            r21 = r9
            r9 = 2
            r3.<init>(r13, r9)
            r9 = 1
            r13 = 0
            java.lang.Object r3 = defpackage.hv.Q(r4, r9, r13, r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L175
            iw7 r3 = r12.b
            iw7 r4 = defpackage.iw7.SUCCEEDED
            if (r3 != r4) goto L161
            r4 = 1
            goto L162
        L161:
            r4 = 0
        L162:
            r4 = r4 & r14
            iw7 r9 = defpackage.iw7.FAILED
            if (r3 != r9) goto L16a
            r16 = 1
            goto L16f
        L16a:
            iw7 r9 = defpackage.iw7.CANCELLED
            if (r3 != r9) goto L16f
            r15 = 1
        L16f:
            java.lang.String r3 = r12.a
            r11.add(r3)
            r14 = r4
        L175:
            r4 = r18
            r3 = r20
            r9 = r21
            goto L129
        L17c:
            r18 = r4
            r21 = r9
            y72 r3 = defpackage.y72.APPEND_OR_REPLACE
            if (r6 != r3) goto L1c5
            if (r15 != 0) goto L188
            if (r16 == 0) goto L1c5
        L188:
            dx7 r3 = r21.w()
            r3.getClass()
            m16 r3 = r3.a
            cx7 r4 = new cx7
            r13 = 0
            r4.<init>(r5, r13)
            r9 = 1
            java.lang.Object r4 = defpackage.hv.Q(r3, r9, r13, r4)
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L1a2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1c0
            java.lang.Object r6 = r4.next()
            ww7 r6 = (defpackage.ww7) r6
            java.lang.String r6 = r6.a
            r6.getClass()
            c70 r9 = new c70
            r10 = 29
            r9.<init>(r6, r10)
            r12 = 1
            r13 = 0
            defpackage.hv.Q(r3, r13, r12, r9)
            goto L1a2
        L1c0:
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            r15 = 0
            r16 = 0
        L1c5:
            java.lang.Object[] r1 = r11.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L1d0
            r11 = 1
            goto L1d1
        L1d0:
            r11 = 0
        L1d1:
            r3 = 0
            goto L1db
        L1d3:
            r18 = r4
            r21 = r9
            goto L1d1
        L1d8:
            r17 = r3
            goto L1d3
        L1db:
            java.util.Iterator r4 = r17.iterator()
        L1df:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L34e
            java.lang.Object r6 = r4.next()
            gm4 r6 = (defpackage.gm4) r6
            yw7 r9 = r6.b
            java.util.UUID r10 = r6.a
            if (r11 == 0) goto L206
            if (r14 != 0) goto L206
            if (r16 == 0) goto L1fa
            iw7 r12 = defpackage.iw7.FAILED
            r9.b = r12
            goto L208
        L1fa:
            if (r15 == 0) goto L201
            iw7 r12 = defpackage.iw7.CANCELLED
            r9.b = r12
            goto L208
        L201:
            iw7 r12 = defpackage.iw7.BLOCKED
            r9.b = r12
            goto L208
        L206:
            r9.n = r7
        L208:
            iw7 r12 = r9.b
            iw7 r13 = defpackage.iw7.ENQUEUED
            if (r12 != r13) goto L20f
            r3 = 1
        L20f:
            dx7 r12 = r21.w()
            java.util.List r13 = r2.e
            r13.getClass()
            xb1 r13 = r9.e
            r17 = r2
            java.lang.String r2 = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"
            boolean r13 = r13.c(r2)
            r19 = r3
            xb1 r3 = r9.e
            r20 = r4
            java.lang.String r4 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"
            boolean r3 = r3.c(r4)
            xb1 r4 = r9.e
            r22 = r3
            java.lang.String r3 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"
            boolean r3 = r4.c(r3)
            if (r13 != 0) goto L25f
            if (r22 == 0) goto L25f
            if (r3 == 0) goto L25f
            java.lang.String r3 = r9.c
            wb1 r4 = new wb1
            r13 = 0
            r4.<init>(r13, r13)
            xb1 r13 = r9.e
            r13.getClass()
            java.util.HashMap r13 = r13.a
            r4.j(r13)
            java.util.LinkedHashMap r13 = r4.b
            r13.put(r2, r3)
            xb1 r2 = r4.e()
            java.lang.String r3 = "androidx.work.multiprocess.RemoteListenableDelegatingWorker"
            yw7 r9 = defpackage.yw7.b(r9, r3, r2)
        L25f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 > r3) goto L2a2
            p21 r2 = r9.j
            java.lang.String r3 = r9.c
            java.lang.Class<androidx.work.impl.workers.ConstraintTrackingWorker> r4 = androidx.work.impl.workers.ConstraintTrackingWorker.class
            java.lang.String r13 = r4.getName()
            boolean r13 = defpackage.nb3.k(r3, r13)
            if (r13 != 0) goto L2a2
            boolean r13 = r2.e
            if (r13 != 0) goto L27d
            boolean r2 = r2.f
            if (r2 == 0) goto L2a2
        L27d:
            wb1 r2 = new wb1
            r13 = 0
            r2.<init>(r13, r13)
            xb1 r13 = r9.e
            r13.getClass()
            java.util.HashMap r13 = r13.a
            r2.j(r13)
            java.lang.String r13 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            r22 = r4
            java.util.LinkedHashMap r4 = r2.b
            r4.put(r13, r3)
            xb1 r2 = r2.e()
            java.lang.String r3 = r22.getName()
            yw7 r9 = defpackage.yw7.b(r9, r3, r2)
        L2a2:
            r12.getClass()
            m16 r2 = r12.a
            ja7 r3 = new ja7
            r4 = 13
            r3.<init>(r4, r12, r9)
            r9 = 1
            r13 = 0
            defpackage.hv.Q(r2, r13, r9, r3)
            if (r11 == 0) goto L2e3
            int r2 = r1.length
            r3 = 0
        L2b7:
            if (r3 >= r2) goto L2e3
            r4 = r1[r3]
            vh1 r9 = new vh1
            java.lang.String r12 = r10.toString()
            r12.getClass()
            r9.<init>(r12, r4)
            zh1 r4 = r21.r()
            r4.getClass()
            m16 r12 = r4.a
            y r13 = new y
            r22 = r1
            r1 = 22
            r13.<init>(r1, r4, r9)
            r1 = 0
            r9 = 1
            defpackage.hv.Q(r12, r1, r9, r13)
            int r3 = r3 + 1
            r1 = r22
            goto L2b7
        L2e3:
            r22 = r1
            fx7 r1 = r21.x()
            java.lang.String r2 = r10.toString()
            r2.getClass()
            java.util.Set r3 = r6.c
            r1.getClass()
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L2fe:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31e
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            ex7 r6 = new ex7
            r6.<init>(r4, r2)
            m16 r4 = r1.a
            ja7 r9 = new ja7
            r12 = 15
            r9.<init>(r12, r1, r6)
            r12 = 1
            r13 = 0
            defpackage.hv.Q(r4, r13, r12, r9)
            goto L2fe
        L31e:
            if (r18 != 0) goto L342
            qw7 r1 = r21.u()
            pw7 r2 = new pw7
            java.lang.String r3 = r10.toString()
            r3.getClass()
            r2.<init>(r5, r3)
            r1.getClass()
            m16 r3 = r1.a
            ja7 r4 = new ja7
            r6 = 9
            r4.<init>(r6, r1, r2)
            r9 = 1
            r13 = 0
            defpackage.hv.Q(r3, r13, r9, r4)
            goto L344
        L342:
            r9 = 1
            r13 = 0
        L344:
            r2 = r17
            r3 = r19
            r4 = r20
            r1 = r22
            goto L1df
        L34e:
            r9 = 1
            r4 = r3
        L350:
            r0.g = r9
            return r4
    }
}
