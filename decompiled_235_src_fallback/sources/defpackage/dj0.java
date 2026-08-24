package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dj0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.gj0 B;
    public final /* synthetic */ java.util.concurrent.Executor L;
    public final /* synthetic */ long R;
    public final /* synthetic */ int X;
    public final /* synthetic */ android.content.Context Y;
    public final /* synthetic */ defpackage.qb0 Z;

    public /* synthetic */ dj0(defpackage.gj0 r2, android.content.Context r3, java.util.concurrent.Executor r4, int r5, defpackage.qb0 r6, long r7) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.Y = r3
            r1.L = r4
            r1.X = r5
            r1.Z = r6
            r1.R = r7
            return
    }

    public /* synthetic */ dj0(defpackage.gj0 r2, java.util.concurrent.Executor r3, long r4, int r6, android.content.Context r7, defpackage.qb0 r8) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r6
            r1.Y = r7
            r1.Z = r8
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.A
            r2 = 1
            switch(r1) {
                case 0: goto L1f;
                default: goto L8;
            }
        L8:
            gj0 r4 = r0.B
            java.util.concurrent.Executor r6 = r0.L
            long r9 = r0.R
            int r1 = r0.X
            android.content.Context r5 = r0.Y
            qb0 r8 = r0.Z
            int r7 = r1 + 1
            dj0 r3 = new dj0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r6.execute(r3)
            return
        L1f:
            gj0 r8 = r0.B
            android.content.Context r10 = r0.Y
            java.util.concurrent.Executor r1 = r0.L
            int r3 = r0.X
            qb0 r4 = r0.Z
            long r5 = r0.R
            java.lang.String r0 = "CX:initAndRetryRecursively"
            java.lang.String r0 = defpackage.ln2.f0(r0)
            android.os.Trace.beginSection(r0)
            ij0 r0 = r8.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            jf0 r9 = r0.d()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if (r9 == 0) goto L15f
            java.util.concurrent.Executor r0 = r8.d     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            android.os.Handler r11 = r8.e     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ux r12 = new ux     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r12.<init>(r0, r11)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ij0 r0 = r8.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            mh0 r0 = r0.a()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r10.getClass()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            g60 r11 = new g60     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r11.<init>(r10, r0)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ij0 r13 = r8.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            long r13 = r13.k()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ij0 r15 = r8.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ad0 r15 = r15.m()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if (r15 == 0) goto L152
            aj0 r15 = new aj0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r15.<init>(r10)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r8.i = r15     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r17 = 0
            rr6 r7 = new rr6     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.<init>(r15)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r8.j = r7     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ij0 r15 = r8.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r16 = r12
            r12 = r0
            r0 = r11
            r11 = r16
            r16 = r7
            if0 r7 = r9.a(r10, r11, r12, r13, r15, r16)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r8.g = r7     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ij0 r7 = r8.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            zc0 r7 = r7.l()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if (r7 == 0) goto L145
            if0 r7 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.Object r7 = r7.c     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ex6 r7 = (defpackage.ex6) r7     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            eb1 r7 = (defpackage.eb1) r7     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if0 r9 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.util.Set r9 = r9.e()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            mi0 r11 = new mi0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r11.<init>(r10, r7, r9)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r8.h = r11     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            rr6 r7 = r8.j     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.L = r11     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            boolean r7 = r1 instanceof defpackage.gf0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if (r7 == 0) goto Lbc
            r7 = r1
            gf0 r7 = (defpackage.gf0) r7     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if0 r9 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.e(r9)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            goto Lbc
        Lb3:
            r0 = move-exception
            goto L16c
        Lb6:
            r0 = move-exception
            goto L16c
        Lb9:
            r0 = move-exception
            goto L16c
        Lbc:
            kh0 r7 = r8.a     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if0 r9 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.d(r9)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if0 r7 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.Object r7 = r7.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ze0 r7 = (defpackage.ze0) r7     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            kh0 r9 = r8.a     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.b(r9)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            eb r9 = new eb     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            kh0 r11 = r8.a     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            aj0 r12 = r8.i     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            rr6 r13 = r8.j     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r9.<init>(r11, r7, r12, r13)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r8.k = r9     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            kh0 r7 = r8.a     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.util.LinkedHashSet r7 = r7.c()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        Le5:
            boolean r9 = r7.hasNext()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if (r9 == 0) goto Lfb
            java.lang.Object r9 = r7.next()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            eg0 r9 = (defpackage.eg0) r9     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            cg0 r9 = r9.q()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            eb r11 = r8.k     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r9.g(r11)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            goto Le5
        Lfb:
            gh0 r7 = r8.n     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if0 r9 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            kh0 r11 = r8.a     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.g(r0, r9, r11)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            gh0 r7 = r8.n     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            mi0 r9 = r8.h     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.getClass()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r9.getClass()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.m     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.add(r9)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            gh0 r7 = r8.n     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if0 r9 = r8.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.Object r9 = r9.g     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            ze0 r9 = (defpackage.ze0) r9     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.getClass()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r9.getClass()     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.m     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r7.add(r9)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            kh0 r7 = r8.a     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r0.o(r7)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            if (r3 <= r2) goto L130
            defpackage.gj0.b(r17)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        L130:
            java.lang.Object r2 = r8.b     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            monitor-enter(r2)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            fj0 r0 = defpackage.fj0.INITIALIZED     // Catch: java.lang.Throwable -> L142
            r8.p = r0     // Catch: java.lang.Throwable -> L142
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L142
            r2 = r17
            r4.a(r2)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        L13d:
            android.os.Trace.endSection()
            goto L22b
        L142:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L142
            throw r0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        L145:
            i53 r0 = new i53     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.String r7 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r2.<init>(r7)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            throw r0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        L152:
            i53 r0 = new i53     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.String r7 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r2.<init>(r7)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            throw r0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        L15f:
            i53 r0 = new i53     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            java.lang.String r7 = "Invalid app configuration provided. Missing CameraFactory."
            r2.<init>(r7)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            r0.<init>(r2)     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
            throw r0     // Catch: java.lang.RuntimeException -> Lb3 defpackage.i53 -> Lb6 defpackage.bj0 -> Lb9 java.lang.Throwable -> L22f
        L16c:
            ou r2 = new ou     // Catch: java.lang.Throwable -> L22f
            r2.<init>(r5, r0)     // Catch: java.lang.Throwable -> L22f
            jp5 r7 = r8.l     // Catch: java.lang.Throwable -> L22f
            ip5 r15 = r7.b(r2)     // Catch: java.lang.Throwable -> L22f
            defpackage.gj0.b(r2)     // Catch: java.lang.Throwable -> L22f
            boolean r2 = r15.b     // Catch: java.lang.Throwable -> L22f
            if (r2 == 0) goto L1c9
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r2) goto L1c9
            java.lang.String r2 = "CameraX"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22f
            r7.<init>()     // Catch: java.lang.Throwable -> L22f
            java.lang.String r9 = "Retry init. Start time "
            r7.append(r9)     // Catch: java.lang.Throwable -> L22f
            r7.append(r5)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r9 = " current time "
            r7.append(r9)     // Catch: java.lang.Throwable -> L22f
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L22f
            r7.append(r11)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L22f
            defpackage.kj2.g0(r2, r7, r0)     // Catch: java.lang.Throwable -> L22f
            android.os.Handler r0 = r8.e     // Catch: java.lang.Throwable -> L22f
            dj0 r7 = new dj0     // Catch: java.lang.Throwable -> L22f
            r9 = r1
            r12 = r3
            r14 = r4
            r13 = r10
            r10 = r5
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r1 = "retry_token"
            long r2 = r15.a     // Catch: java.lang.Throwable -> L22f
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22f
            r5 = 28
            if (r4 < r5) goto L1bf
            defpackage.pp.t(r0, r7, r2)     // Catch: java.lang.Throwable -> L22f
            goto L224
        L1bf:
            android.os.Message r4 = android.os.Message.obtain(r0, r7)     // Catch: java.lang.Throwable -> L22f
            r4.obj = r1     // Catch: java.lang.Throwable -> L22f
            r0.sendMessageDelayed(r4, r2)     // Catch: java.lang.Throwable -> L22f
            goto L224
        L1c9:
            r14 = r4
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L22f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L22f
            fj0 r2 = defpackage.fj0.INITIALIZING_ERROR     // Catch: java.lang.Throwable -> L22c
            r8.p = r2     // Catch: java.lang.Throwable -> L22c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22c
            boolean r1 = r15.c     // Catch: java.lang.Throwable -> L22f
            if (r1 == 0) goto L1e7
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> L22f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L22f
            fj0 r0 = defpackage.fj0.INITIALIZED     // Catch: java.lang.Throwable -> L1e4
            r8.p = r0     // Catch: java.lang.Throwable -> L1e4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e4
            r2 = 0
            r14.a(r2)     // Catch: java.lang.Throwable -> L22f
            goto L13d
        L1e4:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e4
            throw r0     // Catch: java.lang.Throwable -> L22f
        L1e7:
            boolean r1 = r0 instanceof defpackage.bj0     // Catch: java.lang.Throwable -> L22f
            if (r1 == 0) goto L214
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22f
            r1.<init>()     // Catch: java.lang.Throwable -> L22f
            java.lang.String r2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L22f
            r2 = r0
            bj0 r2 = (defpackage.bj0) r2     // Catch: java.lang.Throwable -> L22f
            int r2 = r2.A     // Catch: java.lang.Throwable -> L22f
            r1.append(r2)     // Catch: java.lang.Throwable -> L22f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22f
            java.lang.String r2 = "CameraX"
            defpackage.kj2.w(r2, r1, r0)     // Catch: java.lang.Throwable -> L22f
            i53 r0 = new i53     // Catch: java.lang.Throwable -> L22f
            pi0 r2 = new pi0     // Catch: java.lang.Throwable -> L22f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L22f
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L22f
            r14.c(r0)     // Catch: java.lang.Throwable -> L22f
            goto L224
        L214:
            boolean r1 = r0 instanceof defpackage.i53     // Catch: java.lang.Throwable -> L22f
            if (r1 == 0) goto L21c
            r14.c(r0)     // Catch: java.lang.Throwable -> L22f
            goto L224
        L21c:
            i53 r1 = new i53     // Catch: java.lang.Throwable -> L22f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L22f
            r14.c(r1)     // Catch: java.lang.Throwable -> L22f
        L224:
            gh0 r0 = r8.n     // Catch: java.lang.Throwable -> L22f
            r0.f()     // Catch: java.lang.Throwable -> L22f
            goto L13d
        L22b:
            return
        L22c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22c
            throw r0     // Catch: java.lang.Throwable -> L22f
        L22f:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }
}
