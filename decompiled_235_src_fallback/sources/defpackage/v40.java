package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v40  reason: default package */
/* loaded from: classes.dex */
public final class v40 implements java.lang.Runnable {
    public static final java.lang.Object o0 = null;
    public static final defpackage.qm p0 = null;
    public static final java.util.concurrent.atomic.AtomicInteger q0 = null;
    public static final defpackage.u40 r0 = null;
    public final int A;
    public final defpackage.sw4 B;
    public final defpackage.uk1 L;
    public final defpackage.s63 R;
    public final defpackage.pq6 X;
    public final java.lang.String Y;
    public final defpackage.m44 Z;
    public int d0;
    public final defpackage.xk5 e0;
    public defpackage.i33 f0;
    public java.util.ArrayList g0;
    public android.graphics.Bitmap h0;
    public java.util.concurrent.Future i0;
    public defpackage.qw4 j0;
    public java.lang.Exception k0;
    public int l0;
    public int m0;
    public defpackage.rw4 n0;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.v40.o0 = r0
            qm r0 = new qm
            r1 = 1
            r0.<init>(r1)
            defpackage.v40.p0 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            defpackage.v40.q0 = r0
            u40 r0 = new u40
            r0.<init>()
            defpackage.v40.r0 = r0
            return
    }

    public v40(defpackage.sw4 r2, defpackage.uk1 r3, defpackage.s63 r4, defpackage.pq6 r5, defpackage.i33 r6, defpackage.xk5 r7) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.v40.q0
            int r0 = r0.incrementAndGet()
            r1.A = r0
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            r1.f0 = r6
            java.lang.String r2 = r6.d
            r1.Y = r2
            m44 r2 = r6.b
            r1.Z = r2
            java.lang.Object r2 = r2.R
            rw4 r2 = (defpackage.rw4) r2
            r1.n0 = r2
            r2 = 0
            r1.d0 = r2
            r1.e0 = r7
            int r2 = r7.b()
            r1.m0 = r2
            return
    }

    public static void d(defpackage.m44 r3) {
            java.lang.Object r3 = r3.B
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto Lf
            java.lang.String r3 = r3.getPath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L14
        Lf:
            r3 = 0
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
        L14:
            qm r0 = defpackage.v40.p0
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r1 = r3.length()
            r2 = 8
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            int r1 = r0.length()
            r0.replace(r2, r1, r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            return
    }

    public final boolean a() {
            r2 = this;
            i33 r0 = r2.f0
            r1 = 0
            if (r0 != 0) goto L1b
            java.util.ArrayList r0 = r2.g0
            if (r0 == 0) goto Lf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
        Lf:
            java.util.concurrent.Future r2 = r2.i0
            if (r2 == 0) goto L1b
            boolean r2 = r2.cancel(r1)
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            return r1
    }

    public final void b(defpackage.i33 r6) {
            r5 = this;
            i33 r0 = r5.f0
            r1 = 1
            r2 = 0
            if (r0 != r6) goto Lb
            r0 = 0
            r5.f0 = r0
            r0 = r1
            goto L15
        Lb:
            java.util.ArrayList r0 = r5.g0
            if (r0 == 0) goto L14
            boolean r0 = r0.remove(r6)
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L65
            m44 r6 = r6.b
            java.lang.Object r6 = r6.R
            rw4 r6 = (defpackage.rw4) r6
            rw4 r0 = r5.n0
            if (r6 != r0) goto L65
            rw4 r6 = defpackage.rw4.LOW
            java.util.ArrayList r0 = r5.g0
            if (r0 == 0) goto L2e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            goto L2f
        L2e:
            r1 = r2
        L2f:
            i33 r0 = r5.f0
            if (r0 != 0) goto L35
            if (r1 == 0) goto L63
        L35:
            if (r0 == 0) goto L3d
            m44 r6 = r0.b
            java.lang.Object r6 = r6.R
            rw4 r6 = (defpackage.rw4) r6
        L3d:
            if (r1 == 0) goto L63
            java.util.ArrayList r0 = r5.g0
            int r0 = r0.size()
        L45:
            if (r2 >= r0) goto L63
            java.util.ArrayList r1 = r5.g0
            java.lang.Object r1 = r1.get(r2)
            i33 r1 = (defpackage.i33) r1
            m44 r1 = r1.b
            java.lang.Object r1 = r1.R
            rw4 r1 = (defpackage.rw4) r1
            int r3 = r1.ordinal()
            int r4 = r6.ordinal()
            if (r3 <= r4) goto L60
            r6 = r1
        L60:
            int r2 = r2 + 1
            goto L45
        L63:
            r5.n0 = r6
        L65:
            sw4 r5 = r5.B
            r5.getClass()
            return
    }

    public final android.graphics.Bitmap c() {
            r12 = this;
            r0 = 0
            boolean r1 = defpackage.e44.shouldReadFromMemoryCache(r0)
            r2 = 0
            if (r1 == 0) goto L2f
            s63 r1 = r12.R
            java.lang.String r3 = r12.Y
            java.lang.Object r1 = r1.B
            nr1 r1 = (defpackage.nr1) r1
            java.lang.Object r1 = r1.get(r3)
            xz3 r1 = (defpackage.xz3) r1
            if (r1 == 0) goto L1b
            android.graphics.Bitmap r1 = r1.a
            goto L1c
        L1b:
            r1 = r2
        L1c:
            if (r1 == 0) goto L30
            pq6 r2 = r12.X
            sk1 r2 = r2.b
            r2.sendEmptyMessage(r0)
            qw4 r0 = defpackage.qw4.MEMORY
            r12.j0 = r0
            sw4 r12 = r12.B
            r12.getClass()
            return r1
        L2f:
            r1 = r2
        L30:
            int r3 = r12.m0
            if (r3 != 0) goto L39
            ze4 r3 = defpackage.ze4.OFFLINE
            int r3 = r3.index
            goto L3b
        L39:
            int r3 = r12.d0
        L3b:
            r12.d0 = r3
            xk5 r4 = r12.e0
            m44 r5 = r12.Z
            aj r3 = r4.c(r5, r3)
            r4 = 1
            if (r3 == 0) goto La5
            java.lang.Object r1 = r3.L
            qw4 r1 = (defpackage.qw4) r1
            r12.j0 = r1
            int r1 = r3.B
            r12.l0 = r1
            java.lang.Object r1 = r3.R
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 != 0) goto La5
            java.lang.Object r1 = r3.X
            in6 r1 = (defpackage.in6) r1
            m44 r3 = r12.Z     // Catch: java.lang.Throwable -> L9f
            fe5 r5 = defpackage.hi2.u(r1)     // Catch: java.lang.Throwable -> L9f
            da0 r6 = defpackage.ck7.b     // Catch: java.lang.Throwable -> L9f
            r7 = 0
            boolean r6 = r5.k(r7, r6)     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L78
            da0 r6 = defpackage.ck7.c     // Catch: java.lang.Throwable -> L9f
            r7 = 8
            boolean r6 = r5.k(r7, r6)     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L78
            r6 = r4
            goto L79
        L78:
            r6 = r0
        L79:
            r3.getClass()     // Catch: java.lang.Throwable -> L9f
            if (r6 != 0) goto L91
            j80 r3 = new j80     // Catch: java.lang.Throwable -> L9f
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L9f
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r3, r2, r2)     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L8a
            goto L9a
        L8a:
            java.lang.String r3 = "Failed to decode stream."
            defpackage.e41.i(r3)     // Catch: java.lang.Throwable -> L9f
            r3 = r2
            goto L9a
        L91:
            byte[] r3 = r5.q()     // Catch: java.lang.Throwable -> L9f
            int r5 = r3.length     // Catch: java.lang.Throwable -> L9f
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r0, r5, r2)     // Catch: java.lang.Throwable -> L9f
        L9a:
            r1.close()     // Catch: java.io.IOException -> L9d
        L9d:
            r5 = r3
            goto La6
        L9f:
            r0 = move-exception
            r12 = r0
            r1.close()     // Catch: java.io.IOException -> La4
        La4:
            throw r12
        La5:
            r5 = r1
        La6:
            if (r5 == 0) goto L18e
            sw4 r1 = r12.B
            r1.getClass()
            pq6 r1 = r12.X
            r1.getClass()
            java.lang.StringBuilder r3 = defpackage.ck7.a
            int r3 = r5.getAllocationByteCount()
            if (r3 < 0) goto L188
            sk1 r1 = r1.b
            r6 = 2
            android.os.Message r3 = r1.obtainMessage(r6, r3, r0)
            r1.sendMessage(r3)
            m44 r1 = r12.Z
            r1.getClass()
            java.lang.Object r1 = r1.L
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Ld0
            goto Ld4
        Ld0:
            int r1 = r12.l0
            if (r1 == 0) goto L18e
        Ld4:
            java.lang.Object r1 = defpackage.v40.o0
            monitor-enter(r1)
            m44 r3 = r12.Z     // Catch: java.lang.Throwable -> L132
            r3.getClass()     // Catch: java.lang.Throwable -> L132
            int r3 = r12.l0     // Catch: java.lang.Throwable -> L132
            if (r3 == 0) goto L135
            m44 r7 = r12.Z     // Catch: java.lang.Throwable -> L132
            int r8 = r5.getWidth()     // Catch: java.lang.Throwable -> L132
            int r9 = r5.getHeight()     // Catch: java.lang.Throwable -> L132
            r7.getClass()     // Catch: java.lang.Throwable -> L132
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L132
            r10.<init>()     // Catch: java.lang.Throwable -> L132
            if (r3 == 0) goto L11f
            if (r3 == 0) goto L11f
            switch(r3) {
                case 3: goto L101;
                case 4: goto L101;
                case 5: goto Lfe;
                case 6: goto Lfe;
                case 7: goto Lfb;
                case 8: goto Lfb;
                default: goto Lf9;
            }     // Catch: java.lang.Throwable -> L132
        Lf9:
            r7 = r0
            goto L103
        Lfb:
            r7 = 270(0x10e, float:3.78E-43)
            goto L103
        Lfe:
            r7 = 90
            goto L103
        L101:
            r7 = 180(0xb4, float:2.52E-43)
        L103:
            if (r3 == r6) goto L110
            r6 = 7
            if (r3 == r6) goto L110
            r6 = 4
            if (r3 == r6) goto L110
            r6 = 5
            if (r3 == r6) goto L110
            r3 = r4
            goto L111
        L110:
            r3 = -1
        L111:
            if (r7 == 0) goto L117
            float r6 = (float) r7     // Catch: java.lang.Throwable -> L132
            r10.preRotate(r6)     // Catch: java.lang.Throwable -> L132
        L117:
            if (r3 == r4) goto L11f
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L132
            r6 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r3, r6)     // Catch: java.lang.Throwable -> L132
        L11f:
            r6 = 0
            r11 = 1
            r7 = 0
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L132
            if (r3 == r5) goto L12c
            r5.recycle()     // Catch: java.lang.Throwable -> L132
            r5 = r3
        L12c:
            sw4 r3 = r12.B     // Catch: java.lang.Throwable -> L132
            r3.getClass()     // Catch: java.lang.Throwable -> L132
            goto L135
        L132:
            r0 = move-exception
            r12 = r0
            goto L186
        L135:
            m44 r3 = r12.Z     // Catch: java.lang.Throwable -> L132
            java.lang.Object r3 = r3.L     // Catch: java.lang.Throwable -> L132
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L132
            if (r3 == 0) goto L13f
            r6 = r4
            goto L140
        L13f:
            r6 = r0
        L140:
            if (r6 == 0) goto L167
            int r6 = r3.size()     // Catch: java.lang.Throwable -> L132
            if (r6 > 0) goto L149
            goto L15b
        L149:
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L132
            if (r3 != 0) goto L161
            throw r2     // Catch: java.lang.Throwable -> L132 java.lang.RuntimeException -> L150
        L150:
            ow4 r3 = defpackage.sw4.i     // Catch: java.lang.Throwable -> L132
            sb r5 = new sb     // Catch: java.lang.Throwable -> L132
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L132
            r3.post(r5)     // Catch: java.lang.Throwable -> L132
            r5 = r2
        L15b:
            sw4 r3 = r12.B     // Catch: java.lang.Throwable -> L132
            r3.getClass()     // Catch: java.lang.Throwable -> L132
            goto L167
        L161:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L132
            r12.<init>()     // Catch: java.lang.Throwable -> L132
            throw r12     // Catch: java.lang.Throwable -> L132
        L167:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L132
            if (r5 == 0) goto L18e
            pq6 r12 = r12.X
            r12.getClass()
            int r1 = r5.getAllocationByteCount()
            if (r1 < 0) goto L180
            sk1 r12 = r12.b
            r2 = 3
            android.os.Message r0 = r12.obtainMessage(r2, r1, r0)
            r12.sendMessage(r0)
            goto L18e
        L180:
            java.lang.String r12 = "Negative size: "
            defpackage.e41.y(r5, r12)
            return r2
        L186:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L132
            throw r12
        L188:
            java.lang.String r12 = "Negative size: "
            defpackage.e41.y(r5, r12)
            return r2
        L18e:
            return r5
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            uk1 r0 = r7.L
            java.lang.String r1 = "Picasso-Idle"
            r2 = 6
            m44 r3 = r7.Z     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            d(r3)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            sw4 r3 = r7.B     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            r3.getClass()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            android.graphics.Bitmap r3 = r7.c()     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            r7.h0 = r3     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            if (r3 != 0) goto L23
            java.lang.Object r3 = r0.j     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            sk1 r3 = (defpackage.sk1) r3     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            android.os.Message r4 = r3.obtainMessage(r2, r7)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            r3.sendMessage(r4)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
            goto L26
        L23:
            r0.b(r7)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31 java.lang.OutOfMemoryError -> L33 java.io.IOException -> L35 defpackage.ef4 -> L37
        L26:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.setName(r1)
            return
        L2e:
            r7 = move-exception
            goto La5
        L31:
            r3 = move-exception
            goto L39
        L33:
            r3 = move-exception
            goto L4e
        L35:
            r2 = move-exception
            goto L78
        L37:
            r3 = move-exception
            goto L89
        L39:
            r7.k0 = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.j     // Catch: java.lang.Throwable -> L2e
            sk1 r0 = (defpackage.sk1) r0     // Catch: java.lang.Throwable -> L2e
            android.os.Message r7 = r0.obtainMessage(r2, r7)     // Catch: java.lang.Throwable -> L2e
            r0.sendMessage(r7)     // Catch: java.lang.Throwable -> L2e
        L46:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.setName(r1)
            goto La4
        L4e:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            pq6 r5 = r7.X     // Catch: java.lang.Throwable -> L2e
            qq6 r5 = r5.a()     // Catch: java.lang.Throwable -> L2e
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            r5.a(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L2e
            r7.k0 = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.j     // Catch: java.lang.Throwable -> L2e
            sk1 r0 = (defpackage.sk1) r0     // Catch: java.lang.Throwable -> L2e
            android.os.Message r7 = r0.obtainMessage(r2, r7)     // Catch: java.lang.Throwable -> L2e
            r0.sendMessage(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L78:
            r7.k0 = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.j     // Catch: java.lang.Throwable -> L2e
            sk1 r0 = (defpackage.sk1) r0     // Catch: java.lang.Throwable -> L2e
            r2 = 5
            android.os.Message r7 = r0.obtainMessage(r2, r7)     // Catch: java.lang.Throwable -> L2e
            r2 = 500(0x1f4, double:2.47E-321)
            r0.sendMessageDelayed(r7, r2)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L89:
            r4 = 0
            boolean r4 = defpackage.ze4.isOfflineOnly(r4)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L96
            int r4 = r3.A     // Catch: java.lang.Throwable -> L2e
            r5 = 504(0x1f8, float:7.06E-43)
            if (r4 == r5) goto L98
        L96:
            r7.k0 = r3     // Catch: java.lang.Throwable -> L2e
        L98:
            java.lang.Object r0 = r0.j     // Catch: java.lang.Throwable -> L2e
            sk1 r0 = (defpackage.sk1) r0     // Catch: java.lang.Throwable -> L2e
            android.os.Message r7 = r0.obtainMessage(r2, r7)     // Catch: java.lang.Throwable -> L2e
            r0.sendMessage(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        La4:
            return
        La5:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.setName(r1)
            throw r7
    }
}
