package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o54  reason: default package */
/* loaded from: classes.dex */
public final class o54 implements defpackage.v23, defpackage.fk2 {
    public final java.lang.Object A;
    public final defpackage.ce0 B;
    public int L;
    public final defpackage.h61 R;
    public boolean X;
    public final defpackage.ci Y;
    public defpackage.u23 Z;
    public java.util.concurrent.Executor d0;
    public final android.util.LongSparseArray e0;
    public final android.util.LongSparseArray f0;
    public int g0;
    public final java.util.ArrayList h0;
    public final java.util.ArrayList i0;

    public o54(int r2, int r3, int r4, int r5) {
            r1 = this;
            ci r0 = new ci
            android.media.ImageReader r2 = android.media.ImageReader.newInstance(r2, r3, r4, r5)
            r0.<init>(r2)
            r1.<init>()
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.A = r2
            ce0 r2 = new ce0
            r2.<init>(r1)
            r1.B = r2
            r2 = 0
            r1.L = r2
            h61 r3 = new h61
            r4 = 15
            r3.<init>(r1, r4)
            r1.R = r3
            r1.X = r2
            android.util.LongSparseArray r3 = new android.util.LongSparseArray
            r3.<init>()
            r1.e0 = r3
            android.util.LongSparseArray r3 = new android.util.LongSparseArray
            r3.<init>()
            r1.f0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.i0 = r3
            r1.Y = r0
            r1.g0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.f()
            r2.<init>(r3)
            r1.h0 = r2
            return
    }

    @Override // defpackage.v23
    public final defpackage.s23 a() {
            r6 = this;
            java.lang.Object r0 = r6.A
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.h0     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r6 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r6
        Le:
            r6 = move-exception
            goto L7a
        L10:
            int r1 = r6.g0     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r2 = r6.h0     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            if (r1 >= r2) goto L72
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            r2 = 0
            r3 = r2
        L21:
            java.util.ArrayList r4 = r6.h0     // Catch: java.lang.Throwable -> Le
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Le
            int r4 = r4 + (-1)
            if (r3 >= r4) goto L47
            java.util.ArrayList r4 = r6.i0     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r5 = r6.h0     // Catch: java.lang.Throwable -> Le
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> Le
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> Le
            if (r4 != 0) goto L44
            java.util.ArrayList r4 = r6.h0     // Catch: java.lang.Throwable -> Le
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Le
            s23 r4 = (defpackage.s23) r4     // Catch: java.lang.Throwable -> Le
            r1.add(r4)     // Catch: java.lang.Throwable -> Le
        L44:
            int r3 = r3 + 1
            goto L21
        L47:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Le
        L4b:
            if (r2 >= r3) goto L59
            java.lang.Object r4 = r1.get(r2)     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + 1
            s23 r4 = (defpackage.s23) r4     // Catch: java.lang.Throwable -> Le
            r4.close()     // Catch: java.lang.Throwable -> Le
            goto L4b
        L59:
            java.util.ArrayList r1 = r6.h0     // Catch: java.lang.Throwable -> Le
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Le
            int r2 = r1 + (-1)
            java.util.ArrayList r3 = r6.h0     // Catch: java.lang.Throwable -> Le
            r6.g0 = r1     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r3.get(r2)     // Catch: java.lang.Throwable -> Le
            s23 r1 = (defpackage.s23) r1     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r6 = r6.i0     // Catch: java.lang.Throwable -> Le
            r6.add(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "Maximum image number reached."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Le
            throw r6     // Catch: java.lang.Throwable -> Le
        L7a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r6
    }

    @Override // defpackage.v23
    public final int b() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            ci r1 = r1.Y     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.b()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // defpackage.fk2
    public final void c(defpackage.gk2 r2) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            r1.g(r2)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @Override // defpackage.v23
    public final void close() {
            r5 = this;
            java.lang.Object r0 = r5.A
            monitor-enter(r0)
            boolean r1 = r5.X     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r5 = move-exception
            goto L34
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList r2 = r5.h0     // Catch: java.lang.Throwable -> L9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L9
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L9
            r3 = 0
        L17:
            if (r3 >= r2) goto L25
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L9
            int r3 = r3 + 1
            s23 r4 = (defpackage.s23) r4     // Catch: java.lang.Throwable -> L9
            r4.close()     // Catch: java.lang.Throwable -> L9
            goto L17
        L25:
            java.util.ArrayList r1 = r5.h0     // Catch: java.lang.Throwable -> L9
            r1.clear()     // Catch: java.lang.Throwable -> L9
            ci r1 = r5.Y     // Catch: java.lang.Throwable -> L9
            r1.close()     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r5.X = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r5
    }

    @Override // defpackage.v23
    public final void d() {
            r2 = this;
            java.lang.Object r0 = r2.A
            monitor-enter(r0)
            ci r1 = r2.Y     // Catch: java.lang.Throwable -> L12
            r1.d()     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2.Z = r1     // Catch: java.lang.Throwable -> L12
            r2.d0 = r1     // Catch: java.lang.Throwable -> L12
            r1 = 0
            r2.L = r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    @Override // defpackage.v23
    public final void e(defpackage.u23 r2, java.util.concurrent.Executor r3) {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            r2.getClass()     // Catch: java.lang.Throwable -> L16
            r1.Z = r2     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            r1.d0 = r3     // Catch: java.lang.Throwable -> L16
            ci r2 = r1.Y     // Catch: java.lang.Throwable -> L16
            h61 r1 = r1.R     // Catch: java.lang.Throwable -> L16
            r2.e(r1, r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    @Override // defpackage.v23
    public final int f() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            ci r1 = r1.Y     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.f()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void g(defpackage.gk2 r4) {
            r3 = this;
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.h0     // Catch: java.lang.Throwable -> L19
            int r1 = r1.indexOf(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 < 0) goto L1b
            java.util.ArrayList r2 = r3.h0     // Catch: java.lang.Throwable -> L19
            r2.remove(r1)     // Catch: java.lang.Throwable -> L19
            int r2 = r3.g0     // Catch: java.lang.Throwable -> L19
            if (r1 > r2) goto L1b
            int r2 = r2 + (-1)
            r3.g0 = r2     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r3 = move-exception
            goto L2b
        L1b:
            java.util.ArrayList r1 = r3.i0     // Catch: java.lang.Throwable -> L19
            r1.remove(r4)     // Catch: java.lang.Throwable -> L19
            int r4 = r3.L     // Catch: java.lang.Throwable -> L19
            if (r4 <= 0) goto L29
            ci r4 = r3.Y     // Catch: java.lang.Throwable -> L19
            r3.i(r4)     // Catch: java.lang.Throwable -> L19
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    @Override // defpackage.v23
    public final int getHeight() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            ci r1 = r1.Y     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // defpackage.v23
    public final android.view.Surface getSurface() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            ci r1 = r1.Y     // Catch: java.lang.Throwable -> Lb
            android.view.Surface r1 = r1.getSurface()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // defpackage.v23
    public final int getWidth() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            ci r1 = r1.Y     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final void h(defpackage.ed6 r4) {
            r3 = this;
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.h0     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L1c
            int r2 = r3.f()     // Catch: java.lang.Throwable -> L1c
            if (r1 >= r2) goto L1e
            r4.e(r3)     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList r1 = r3.h0     // Catch: java.lang.Throwable -> L1c
            r1.add(r4)     // Catch: java.lang.Throwable -> L1c
            u23 r4 = r3.Z     // Catch: java.lang.Throwable -> L1c
            java.util.concurrent.Executor r1 = r3.d0     // Catch: java.lang.Throwable -> L1c
            goto L2a
        L1c:
            r3 = move-exception
            goto L3e
        L1e:
            java.lang.String r1 = "TAG"
            java.lang.String r2 = "Maximum image number reached."
            defpackage.kj2.t(r1, r2)     // Catch: java.lang.Throwable -> L1c
            r4.close()     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            r1 = r4
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L3d
            if (r1 == 0) goto L3a
            mf r0 = new mf
            r2 = 28
            r0.<init>(r2, r3, r4)
            r1.execute(r0)
            return
        L3a:
            r4.b(r3)
        L3d:
            return
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    public final void i(defpackage.v23 r7) {
            r6 = this;
            java.lang.Object r0 = r6.A
            monitor-enter(r0)
            boolean r1 = r6.X     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r6 = move-exception
            goto L6b
        Lb:
            android.util.LongSparseArray r1 = r6.f0     // Catch: java.lang.Throwable -> L9
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9
            java.util.ArrayList r2 = r6.h0     // Catch: java.lang.Throwable -> L9
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L9
            int r1 = r1 + r2
            int r2 = r7.f()     // Catch: java.lang.Throwable -> L9
            if (r1 < r2) goto L27
            java.lang.String r6 = "MetadataImageReader"
            java.lang.String r7 = "Skip to acquire the next image because the acquired image count has reached the max images count."
            defpackage.kj2.t(r6, r7)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L27:
            s23 r2 = r7.j()     // Catch: java.lang.Throwable -> L46 java.lang.IllegalStateException -> L48
            if (r2 == 0) goto L5c
            int r3 = r6.L     // Catch: java.lang.Throwable -> L9
            int r3 = r3 + (-1)
            r6.L = r3     // Catch: java.lang.Throwable -> L9
            int r1 = r1 + 1
            android.util.LongSparseArray r3 = r6.f0     // Catch: java.lang.Throwable -> L9
            i23 r4 = r2.S()     // Catch: java.lang.Throwable -> L9
            long r4 = r4.c()     // Catch: java.lang.Throwable -> L9
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L9
            r6.k()     // Catch: java.lang.Throwable -> L9
            goto L5c
        L46:
            r6 = move-exception
            goto L6a
        L48:
            r2 = move-exception
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r4 = "Failed to acquire next image."
            java.lang.String r3 = defpackage.kj2.c0(r3)     // Catch: java.lang.Throwable -> L46
            r5 = 3
            boolean r5 = defpackage.kj2.J(r5, r3)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L5b
            android.util.Log.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L46
        L5b:
            r2 = 0
        L5c:
            if (r2 == 0) goto L68
            int r2 = r6.L     // Catch: java.lang.Throwable -> L9
            if (r2 <= 0) goto L68
            int r2 = r7.f()     // Catch: java.lang.Throwable -> L9
            if (r1 < r2) goto L27
        L68:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L6a:
            throw r6     // Catch: java.lang.Throwable -> L9
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r6
    }

    @Override // defpackage.v23
    public final defpackage.s23 j() {
            r4 = this;
            java.lang.Object r0 = r4.A
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.h0     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r4 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r4
        Le:
            r4 = move-exception
            goto L37
        L10:
            int r1 = r4.g0     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r2 = r4.h0     // Catch: java.lang.Throwable -> Le
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le
            if (r1 >= r2) goto L2f
            java.util.ArrayList r1 = r4.h0     // Catch: java.lang.Throwable -> Le
            int r2 = r4.g0     // Catch: java.lang.Throwable -> Le
            int r3 = r2 + 1
            r4.g0 = r3     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Le
            s23 r1 = (defpackage.s23) r1     // Catch: java.lang.Throwable -> Le
            java.util.ArrayList r4 = r4.i0     // Catch: java.lang.Throwable -> Le
            r4.add(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "Maximum image number reached."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r4
    }

    public final void k() {
            r7 = this;
            java.lang.Object r0 = r7.A
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.e0     // Catch: java.lang.Throwable -> L37
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L37
            int r1 = r1 + (-1)
        Lb:
            if (r1 < 0) goto L3c
            android.util.LongSparseArray r2 = r7.e0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.valueAt(r1)     // Catch: java.lang.Throwable -> L37
            i23 r2 = (defpackage.i23) r2     // Catch: java.lang.Throwable -> L37
            long r3 = r2.c()     // Catch: java.lang.Throwable -> L37
            android.util.LongSparseArray r5 = r7.f0     // Catch: java.lang.Throwable -> L37
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Throwable -> L37
            s23 r5 = (defpackage.s23) r5     // Catch: java.lang.Throwable -> L37
            if (r5 == 0) goto L39
            android.util.LongSparseArray r6 = r7.f0     // Catch: java.lang.Throwable -> L37
            r6.remove(r3)     // Catch: java.lang.Throwable -> L37
            android.util.LongSparseArray r3 = r7.e0     // Catch: java.lang.Throwable -> L37
            r3.removeAt(r1)     // Catch: java.lang.Throwable -> L37
            ed6 r3 = new ed6     // Catch: java.lang.Throwable -> L37
            r4 = 0
            r3.<init>(r5, r4, r2)     // Catch: java.lang.Throwable -> L37
            r7.h(r3)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r7 = move-exception
            goto L41
        L39:
            int r1 = r1 + (-1)
            goto Lb
        L3c:
            r7.l()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r7
    }

    public final void l() {
            r7 = this;
            java.lang.Object r0 = r7.A
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.f0     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L7e
            android.util.LongSparseArray r1 = r7.e0     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L14
            goto L7e
        L14:
            android.util.LongSparseArray r1 = r7.f0     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L5b
            android.util.LongSparseArray r5 = r7.e0     // Catch: java.lang.Throwable -> L5b
            long r5 = r5.keyAt(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L5b
            r1 = r1 ^ 1
            defpackage.np2.t(r1)     // Catch: java.lang.Throwable -> L5b
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L60
            android.util.LongSparseArray r1 = r7.f0     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + (-1)
        L3e:
            if (r1 < 0) goto L7c
            android.util.LongSparseArray r2 = r7.f0     // Catch: java.lang.Throwable -> L5b
            long r2 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L5b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L5d
            android.util.LongSparseArray r2 = r7.f0     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r2.valueAt(r1)     // Catch: java.lang.Throwable -> L5b
            s23 r2 = (defpackage.s23) r2     // Catch: java.lang.Throwable -> L5b
            r2.close()     // Catch: java.lang.Throwable -> L5b
            android.util.LongSparseArray r2 = r7.f0     // Catch: java.lang.Throwable -> L5b
            r2.removeAt(r1)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r7 = move-exception
            goto L80
        L5d:
            int r1 = r1 + (-1)
            goto L3e
        L60:
            android.util.LongSparseArray r1 = r7.e0     // Catch: java.lang.Throwable -> L5b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + (-1)
        L68:
            if (r1 < 0) goto L7c
            android.util.LongSparseArray r2 = r7.e0     // Catch: java.lang.Throwable -> L5b
            long r5 = r2.keyAt(r1)     // Catch: java.lang.Throwable -> L5b
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L79
            android.util.LongSparseArray r2 = r7.e0     // Catch: java.lang.Throwable -> L5b
            r2.removeAt(r1)     // Catch: java.lang.Throwable -> L5b
        L79:
            int r1 = r1 + (-1)
            goto L68
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            return
        L80:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r7
    }
}
