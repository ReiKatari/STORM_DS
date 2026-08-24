package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm4  reason: default package */
/* loaded from: classes.dex */
public class qm4 implements defpackage.kl7 {
    public int A;
    public int[] B;
    public final java.lang.Object L;
    public final java.lang.Object R;
    public java.lang.Object X;
    public java.lang.Object Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public java.lang.Object e0;
    public java.lang.Object f0;
    public java.lang.Object g0;
    public java.lang.Object h0;
    public java.lang.Object i0;

    public qm4() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.L = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.R = r0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r2.Y = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r2.Z = r0
            int[] r0 = defpackage.bp2.a
            r2.B = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r2.e0 = r0
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r2.g0 = r0
            r0 = 0
            r2.h0 = r0
            yo2 r0 = defpackage.yo2.UNKNOWN
            r2.i0 = r0
            r0 = -1
            r2.A = r0
            return
    }

    public qm4(defpackage.o94 r1, defpackage.p94 r2, int r3, defpackage.hr1 r4) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.R = r2
            r0.A = r3
            r0.X = r4
            int[] r1 = defpackage.jl7.a
            r0.B = r1
            float[] r1 = defpackage.jl7.b
            r0.Y = r1
            r0.g0 = r1
            r0.h0 = r1
            os0 r1 = defpackage.jl7.c
            r0.i0 = r1
            return
    }

    public void c(defpackage.yq1 r35, defpackage.eb r36) {
            r34 = this;
            r0 = r34
            r1 = r36
            r2 = 0
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.eglGetDisplay(r2)
            r0.Y = r3
            android.opengl.EGLDisplay r4 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 != 0) goto Lfc
            r3 = 2
            int[] r4 = new int[r3]
            java.lang.Object r5 = r0.Y
            android.opengl.EGLDisplay r5 = (android.opengl.EGLDisplay) r5
            r6 = 1
            boolean r5 = android.opengl.EGL14.eglInitialize(r5, r4, r2, r4, r6)
            if (r5 == 0) goto Lf2
            if (r1 == 0) goto L3d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = r4[r2]
            r5.append(r7)
            java.lang.String r7 = "."
            r5.append(r7)
            r4 = r4[r6]
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.L = r4
        L3d:
            boolean r1 = r35.a()
            r4 = 8
            if (r1 == 0) goto L49
            r1 = 10
            r8 = r1
            goto L4a
        L49:
            r8 = r4
        L4a:
            boolean r1 = r35.a()
            if (r1 == 0) goto L52
            r14 = r3
            goto L53
        L52:
            r14 = r4
        L53:
            boolean r1 = r35.a()
            if (r1 == 0) goto L5e
            r1 = 64
        L5b:
            r20 = r1
            goto L60
        L5e:
            r1 = 4
            goto L5b
        L60:
            boolean r1 = r35.a()
            if (r1 == 0) goto L6a
            r1 = -1
            r22 = r1
            goto L6c
        L6a:
            r22 = r6
        L6c:
            r24 = 5
            r25 = 12344(0x3038, float:1.7298E-41)
            r7 = 12324(0x3024, float:1.727E-41)
            r9 = 12323(0x3023, float:1.7268E-41)
            r11 = 12322(0x3022, float:1.7267E-41)
            r13 = 12321(0x3021, float:1.7265E-41)
            r15 = 12325(0x3025, float:1.7271E-41)
            r16 = 0
            r17 = 12326(0x3026, float:1.7272E-41)
            r18 = 0
            r19 = 12352(0x3040, float:1.7309E-41)
            r21 = 12610(0x3142, float:1.767E-41)
            r23 = 12339(0x3033, float:1.729E-41)
            r10 = r8
            r12 = r8
            int[] r27 = new int[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            r1 = 1
            android.opengl.EGLConfig[] r4 = new android.opengl.EGLConfig[r1]
            int[] r5 = new int[r6]
            java.lang.Object r7 = r0.Y
            r26 = r7
            android.opengl.EGLDisplay r26 = (android.opengl.EGLDisplay) r26
            r30 = 0
            r33 = 0
            r28 = 0
            r31 = r1
            r29 = r4
            r32 = r5
            boolean r1 = android.opengl.EGL14.eglChooseConfig(r26, r27, r28, r29, r30, r31, r32, r33)
            if (r1 == 0) goto Lec
            r1 = r29[r2]
            boolean r4 = r35.a()
            if (r4 == 0) goto Lb2
            r3 = 3
        Lb2:
            r4 = 12344(0x3038, float:1.7298E-41)
            r5 = 12440(0x3098, float:1.7432E-41)
            int[] r3 = new int[]{r5, r3, r4}
            java.lang.Object r4 = r0.Y
            android.opengl.EGLDisplay r4 = (android.opengl.EGLDisplay) r4
            android.opengl.EGLContext r7 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r3 = android.opengl.EGL14.eglCreateContext(r4, r1, r7, r3, r2)
            java.lang.String r4 = "eglCreateContext"
            defpackage.bp2.a(r4)
            r0.d0 = r1
            r0.Z = r3
            int[] r1 = new int[r6]
            java.lang.Object r0 = r0.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            android.opengl.EGL14.eglQueryContext(r0, r3, r5, r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "EGLContext created, client version "
            r0.<init>(r3)
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "OpenGlRenderer"
            android.util.Log.d(r1, r0)
            return
        Lec:
            java.lang.String r0 = "Unable to find a suitable EGLConfig"
            defpackage.i.m(r0)
            return
        Lf2:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            r0.Y = r1
            java.lang.String r0 = "Unable to initialize EGL14"
            defpackage.i.m(r0)
            return
        Lfc:
            java.lang.String r0 = "Unable to get EGL14 display"
            defpackage.i.m(r0)
            return
    }

    public defpackage.sy d(android.view.Surface r5) {
            r4 = this;
            java.lang.Object r0 = r4.Y     // Catch: java.lang.Throwable -> L3c java.lang.IllegalArgumentException -> L3e
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0     // Catch: java.lang.Throwable -> L3c java.lang.IllegalArgumentException -> L3e
            java.lang.Object r1 = r4.d0     // Catch: java.lang.Throwable -> L3c java.lang.IllegalArgumentException -> L3e
            android.opengl.EGLConfig r1 = (android.opengl.EGLConfig) r1     // Catch: java.lang.Throwable -> L3c java.lang.IllegalArgumentException -> L3e
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Throwable -> L3c
            int[] r2 = r4.B     // Catch: java.lang.Throwable -> L3c
            android.opengl.EGLSurface r5 = defpackage.bp2.i(r0, r1, r5, r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.Y
            android.opengl.EGLDisplay r4 = (android.opengl.EGLDisplay) r4
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 12375(0x3057, float:1.7341E-41)
            r3 = 0
            android.opengl.EGL14.eglQuerySurface(r4, r5, r2, r1, r3)
            r1 = r1[r3]
            int[] r0 = new int[r0]
            r2 = 12374(0x3056, float:1.734E-41)
            android.opengl.EGL14.eglQuerySurface(r4, r5, r2, r0, r3)
            r4 = r0[r3]
            android.util.Size r0 = new android.util.Size
            r0.<init>(r1, r4)
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            sy r1 = new sy
            r1.<init>(r5, r4, r0)
            return r1
        L3c:
            r4 = move-exception
            goto L3f
        L3e:
            r4 = move-exception
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to create EGL surface: "
            r5.<init>(r0)
            java.lang.String r0 = r4.getMessage()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "OpenGlRenderer"
            defpackage.kj2.g0(r0, r5, r4)
            r4 = 0
            return r4
    }

    public void e() {
            r6 = this;
            java.lang.Object r0 = r6.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            java.lang.Object r1 = r6.d0
            android.opengl.EGLConfig r1 = (android.opengl.EGLConfig) r1
            java.util.Objects.requireNonNull(r1)
            int[] r2 = defpackage.bp2.a
            r2 = 12374(0x3056, float:1.734E-41)
            r3 = 12344(0x3038, float:1.7298E-41)
            r4 = 12375(0x3057, float:1.7341E-41)
            r5 = 1
            int[] r2 = new int[]{r4, r5, r2, r5, r3}
            r3 = 0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.eglCreatePbufferSurface(r0, r1, r2, r3)
            java.lang.String r1 = "eglCreatePbufferSurface"
            defpackage.bp2.a(r1)
            if (r0 == 0) goto L27
            r6.e0 = r0
            return
        L27:
            java.lang.String r6 = "surface was null"
            defpackage.i.m(r6)
            return
    }

    public int f(int r5) {
            r4 = this;
            java.lang.Object r4 = r4.L
            o94 r4 = (defpackage.o94) r4
            int r0 = r4.b
            r1 = 0
            if (r0 <= 0) goto L2a
            int r0 = r0 + (-1)
        Lb:
            if (r1 > r0) goto L1f
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            int[] r3 = r4.a
            r3 = r3[r2]
            if (r3 >= r5) goto L1a
            int r1 = r2 + 1
            goto Lb
        L1a:
            if (r3 <= r5) goto L22
            int r0 = r2 + (-1)
            goto Lb
        L1f:
            int r1 = r1 + 1
            int r2 = -r1
        L22:
            r4 = -1
            if (r2 >= r4) goto L29
            int r2 = r2 + 2
            int r4 = -r2
            return r4
        L29:
            return r2
        L2a:
            java.lang.String r4 = ""
            defpackage.e41.q(r4)
            return r1
    }

    public float g(int r4, boolean r5, int r6) {
            r3 = this;
            java.lang.Object r0 = r3.L
            o94 r0 = (defpackage.o94) r0
            int r1 = r0.b
            int r1 = r1 + (-1)
            r2 = 1148846080(0x447a0000, float:1000.0)
            if (r4 < r1) goto Lf
            float r3 = (float) r6
        Ld:
            float r3 = r3 / r2
            return r3
        Lf:
            int r1 = r0.c(r4)
            int r4 = r4 + 1
            int r4 = r0.c(r4)
            if (r6 != r1) goto L1d
            float r3 = (float) r1
            goto Ld
        L1d:
            int r4 = r4 - r1
            java.lang.Object r0 = r3.R
            p94 r0 = (defpackage.p94) r0
            java.lang.Object r0 = r0.b(r1)
            nl7 r0 = (defpackage.nl7) r0
            if (r0 == 0) goto L2e
            hr1 r0 = r0.b
            if (r0 != 0) goto L33
        L2e:
            java.lang.Object r3 = r3.X
            r0 = r3
            hr1 r0 = (defpackage.hr1) r0
        L33:
            int r6 = r6 - r1
            float r3 = (float) r6
            float r4 = (float) r4
            float r3 = r3 / r4
            float r3 = r0.b(r3)
            if (r5 == 0) goto L3e
            return r3
        L3e:
            float r4 = r4 * r3
            float r3 = (float) r1
            float r4 = r4 + r3
            float r4 = r4 / r2
            return r4
    }

    @Override // defpackage.il7
    public defpackage.ap h(long r14, defpackage.ap r16, defpackage.ap r17, defpackage.ap r18) {
            r13 = this;
            r5 = r18
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14 / r6
            int[] r2 = defpackage.jl7.a
            int r2 = r13.A
            long r2 = (long) r2
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 >= 0) goto L13
            r0 = r8
        L13:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            r10 = r2
            goto L1a
        L19:
            r10 = r0
        L1a:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L1f
            return r5
        L1f:
            r3 = r16
            r4 = r17
            r13.k(r3, r4, r5)
            java.lang.Object r0 = r13.d0
            r8 = r0
            ap r8 = (defpackage.ap) r8
            r8.getClass()
            java.lang.Object r0 = r13.i0
            os0 r0 = (defpackage.os0) r0
            os0 r1 = defpackage.jl7.c
            r9 = 0
            if (r0 == r1) goto Lb3
            int r0 = (int) r10
            int r1 = r13.f(r0)
            float r0 = r13.g(r1, r9, r0)
            java.lang.Object r1 = r13.h0
            float[] r1 = (float[]) r1
            java.lang.Object r13 = r13.i0
            os0 r13 = (defpackage.os0) r13
            java.lang.Object r13 = r13.B
            xt[][] r13 = (defpackage.xt[][]) r13
            r2 = r13[r9]
            r2 = r2[r9]
            float r2 = r2.a
            int r3 = r13.length
            r4 = 1
            int r3 = r3 - r4
            r3 = r13[r3]
            r3 = r3[r9]
            float r3 = r3.b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L60
            r0 = r2
        L60:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L65
            goto L66
        L65:
            r3 = r0
        L66:
            int r0 = r1.length
            int r2 = r13.length
            r5 = r9
            r6 = r5
        L6a:
            if (r5 >= r2) goto La8
            r7 = r9
            r10 = r7
        L6e:
            int r11 = r0 + (-1)
            if (r7 >= r11) goto La2
            r11 = r13[r5]
            r11 = r11[r10]
            float r12 = r11.b
            int r12 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r12 > 0) goto L9d
            boolean r6 = r11.p
            if (r6 == 0) goto L8b
            float r6 = r11.q
            r1[r7] = r6
            int r6 = r7 + 1
            float r11 = r11.r
            r1[r6] = r11
            goto L9c
        L8b:
            r11.c(r3)
            float r6 = r11.a()
            r1[r7] = r6
            int r6 = r7 + 1
            float r11 = r11.b()
            r1[r6] = r11
        L9c:
            r6 = r4
        L9d:
            int r7 = r7 + 2
            int r10 = r10 + 1
            goto L6e
        La2:
            if (r6 == 0) goto La5
            goto La8
        La5:
            int r5 = r5 + 1
            goto L6a
        La8:
            int r13 = r1.length
        La9:
            if (r9 >= r13) goto Le2
            r0 = r1[r9]
            r8.e(r9, r0)
            int r9 = r9 + 1
            goto La9
        Lb3:
            r0 = 1
            long r0 = r10 - r0
            long r1 = r0 * r6
            r0 = r13
            ap r12 = r0.q(r1, r3, r4, r5)
            long r1 = r10 * r6
            r3 = r16
            r4 = r17
            r5 = r18
            ap r13 = r0.q(r1, r3, r4, r5)
            int r0 = r12.b()
        Lce:
            if (r9 >= r0) goto Le2
            float r1 = r12.a(r9)
            float r2 = r13.a(r9)
            float r1 = r1 - r2
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r2
            r8.e(r9, r1)
            int r9 = r9 + 1
            goto Lce
        Le2:
            return r8
    }

    public defpackage.wr4 i(defpackage.yq1 r5) {
            r4 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "Failed to get GL or EGL extensions: "
            java.lang.Object r2 = r4.L
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            r3 = 0
            defpackage.bp2.d(r2, r3)
            r2 = 0
            r4.c(r5, r2)     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            r4.e()     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            java.lang.Object r5 = r4.e0     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            android.opengl.EGLSurface r5 = (android.opengl.EGLSurface) r5     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            r4.l(r5)     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            r5 = 7939(0x1f03, float:1.1125E-41)
            java.lang.String r5 = android.opengl.GLES20.glGetString(r5)     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            java.lang.Object r2 = r4.Y     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            android.opengl.EGLDisplay r2 = (android.opengl.EGLDisplay) r2     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            r3 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r2 = android.opengl.EGL14.eglQueryString(r2, r3)     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            wr4 r3 = new wr4     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            if (r5 == 0) goto L2f
            goto L30
        L2f:
            r5 = r0
        L30:
            if (r2 == 0) goto L33
            goto L34
        L33:
            r2 = r0
        L34:
            r3.<init>(r5, r2)     // Catch: java.lang.Throwable -> L3b java.lang.IllegalStateException -> L3d
            r4.n()
            return r3
        L3b:
            r5 = move-exception
            goto L5c
        L3d:
            r5 = move-exception
            java.lang.String r2 = "OpenGlRenderer"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L3b
            r3.append(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            defpackage.kj2.g0(r2, r1, r5)     // Catch: java.lang.Throwable -> L3b
            wr4 r5 = new wr4     // Catch: java.lang.Throwable -> L3b
            r5.<init>(r0, r0)     // Catch: java.lang.Throwable -> L3b
            r4.n()
            return r5
        L5c:
            r4.n()
            throw r5
    }

    public defpackage.jy j(defpackage.yq1 r7) {
            r6 = this;
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            java.lang.Object r0 = r6.L
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r1 = 0
            defpackage.bp2.d(r0, r1)
            eb r1 = new eb
            r2 = 2
            r1.<init>(r2)
            java.lang.String r2 = "0.0"
            r1.B = r2
            r1.L = r2
            java.lang.String r2 = ""
            r1.R = r2
            r1.X = r2
            boolean r3 = r7.a()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            if (r3 == 0) goto L54
            wr4 r3 = r6.i(r7)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.Object r4 = r3.a     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.Object r3 = r3.b     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r3.getClass()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.String r5 = "GL_EXT_YUV_target"
            boolean r5 = r4.contains(r5)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            if (r5 != 0) goto L4a
            java.lang.String r7 = "OpenGlRenderer"
            java.lang.String r5 = "Device does not support GL_EXT_YUV_target. Fallback to SDR."
            defpackage.kj2.f0(r7, r5)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            yq1 r7 = defpackage.yq1.d     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            goto L4a
        L46:
            r7 = move-exception
            goto Lbf
        L48:
            r7 = move-exception
            goto Lbf
        L4a:
            int[] r5 = defpackage.bp2.f(r3, r7)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r6.B = r5     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r1.R = r4     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r1.X = r3     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
        L54:
            r6.c(r7, r1)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r6.e()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.Object r3 = r6.e0     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            android.opengl.EGLSurface r3 = (android.opengl.EGLSurface) r3     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r6.l(r3)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.String r3 = defpackage.bp2.j()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r1.B = r3     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.util.HashMap r7 = defpackage.bp2.g(r7)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r6.g0 = r7     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            int r7 = defpackage.bp2.h()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r6.A = r7     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            r6.u(r7)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r6.X = r7
            r6 = 1
            r0.set(r6)
            java.lang.Object r6 = r1.R
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L8c
            java.lang.String r6 = " glExtensions"
            java.lang.String r2 = r2.concat(r6)
        L8c:
            java.lang.Object r6 = r1.X
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L98
            java.lang.String r6 = " eglExtensions"
            java.lang.String r2 = r2.concat(r6)
        L98:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto Lb4
            jy r6 = new jy
            java.lang.Object r7 = r1.B
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r1.L
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.R
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.X
            java.lang.String r1 = (java.lang.String) r1
            r6.<init>(r7, r0, r2, r1)
            return r6
        Lb4:
            java.lang.String r6 = "Missing required properties:"
            java.lang.String r6 = r6.concat(r2)
            defpackage.i.m(r6)
            r6 = 0
            return r6
        Lbf:
            r6.n()
            throw r7
    }

    public void k(defpackage.ap r11, defpackage.ap r12, defpackage.ap r13) {
            r10 = this;
            java.lang.Object r0 = r10.R
            p94 r0 = (defpackage.p94) r0
            java.lang.Object r1 = r10.L
            o94 r1 = (defpackage.o94) r1
            java.lang.Object r2 = r10.i0
            os0 r2 = (defpackage.os0) r2
            os0 r3 = defpackage.jl7.c
            r4 = 0
            if (r2 == r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = r4
        L14:
            java.lang.Object r3 = r10.Z
            ap r3 = (defpackage.ap) r3
            if (r3 != 0) goto L54
            ap r3 = r11.c()
            r10.Z = r3
            ap r13 = r13.c()
            r10.d0 = r13
            int r13 = r1.b
            float[] r3 = new float[r13]
            r5 = r4
        L2b:
            if (r5 >= r13) goto L3a
            int r6 = r1.c(r5)
            float r6 = (float) r6
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r7
            r3[r5] = r6
            int r5 = r5 + 1
            goto L2b
        L3a:
            r10.Y = r3
            int r13 = r1.b
            int[] r3 = new int[r13]
            r5 = r4
        L41:
            if (r5 >= r13) goto L52
            int r6 = r1.c(r5)
            java.lang.Object r6 = r0.b(r6)
            nl7 r6 = (defpackage.nl7) r6
            r3[r5] = r4
            int r5 = r5 + 1
            goto L41
        L52:
            r10.B = r3
        L54:
            if (r2 != 0) goto L57
            goto L74
        L57:
            java.lang.Object r13 = r10.i0
            os0 r13 = (defpackage.os0) r13
            os0 r2 = defpackage.jl7.c
            if (r13 == r2) goto L75
            java.lang.Object r13 = r10.e0
            ap r13 = (defpackage.ap) r13
            boolean r13 = defpackage.nb3.k(r13, r11)
            if (r13 == 0) goto L75
            java.lang.Object r13 = r10.f0
            ap r13 = (defpackage.ap) r13
            boolean r13 = defpackage.nb3.k(r13, r12)
            if (r13 != 0) goto L74
            goto L75
        L74:
            return
        L75:
            r10.e0 = r11
            r10.f0 = r12
            int r13 = r11.b()
            int r13 = r13 % 2
            int r2 = r11.b()
            int r2 = r2 + r13
            float[] r13 = new float[r2]
            r10.g0 = r13
            float[] r13 = new float[r2]
            r10.h0 = r13
            int r13 = r1.b
            float[][] r3 = new float[r13]
            r5 = r4
        L91:
            if (r5 >= r13) goto Ldc
            int r6 = r1.c(r5)
            java.lang.Object r7 = r0.b(r6)
            nl7 r7 = (defpackage.nl7) r7
            if (r6 != 0) goto Laf
            if (r7 != 0) goto Laf
            float[] r6 = new float[r2]
            r7 = r4
        La4:
            if (r7 >= r2) goto Ld7
            float r8 = r11.a(r7)
            r6[r7] = r8
            int r7 = r7 + 1
            goto La4
        Laf:
            int r8 = r10.A
            if (r6 != r8) goto Lc3
            if (r7 != 0) goto Lc3
            float[] r6 = new float[r2]
            r7 = r4
        Lb8:
            if (r7 >= r2) goto Ld7
            float r8 = r12.a(r7)
            r6[r7] = r8
            int r7 = r7 + 1
            goto Lb8
        Lc3:
            r7.getClass()
            ap r6 = r7.a
            float[] r7 = new float[r2]
            r8 = r4
        Lcb:
            if (r8 >= r2) goto Ld6
            float r9 = r6.a(r8)
            r7[r8] = r9
            int r8 = r8 + 1
            goto Lcb
        Ld6:
            r6 = r7
        Ld7:
            r3[r5] = r6
            int r5 = r5 + 1
            goto L91
        Ldc:
            os0 r11 = new os0
            int[] r12 = r10.B
            java.lang.Object r13 = r10.Y
            float[] r13 = (float[]) r13
            r11.<init>(r12, r13, r3)
            r10.i0 = r11
            return
    }

    public void l(android.opengl.EGLSurface r2) {
            r1 = this;
            java.lang.Object r0 = r1.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            r0.getClass()
            java.lang.Object r0 = r1.Z
            android.opengl.EGLContext r0 = (android.opengl.EGLContext) r0
            r0.getClass()
            java.lang.Object r0 = r1.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            java.lang.Object r1 = r1.Z
            android.opengl.EGLContext r1 = (android.opengl.EGLContext) r1
            boolean r1 = android.opengl.EGL14.eglMakeCurrent(r0, r2, r2, r1)
            if (r1 == 0) goto L1d
            return
        L1d:
            java.lang.String r1 = "eglMakeCurrent failed"
            defpackage.i.m(r1)
            return
    }

    public void m(android.view.Surface r3) {
            r2 = this;
            java.lang.Object r0 = r2.L
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r1 = 1
            defpackage.bp2.d(r0, r1)
            java.lang.Object r0 = r2.X
            java.lang.Thread r0 = (java.lang.Thread) r0
            defpackage.bp2.c(r0)
            java.lang.Object r2 = r2.R
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r0 = r2.containsKey(r3)
            if (r0 != 0) goto L1e
            sy r0 = defpackage.bp2.j
            r2.put(r3, r0)
        L1e:
            return
    }

    public void n() {
            r6 = this;
            java.lang.Object r0 = r6.R
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r1 = r6.g0
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            zo2 r2 = (defpackage.zo2) r2
            int r2 = r2.a
            android.opengl.GLES20.glDeleteProgram(r2)
            goto L10
        L22:
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r6.g0 = r1
            r1 = 0
            r6.h0 = r1
            java.lang.Object r2 = r6.Y
            android.opengl.EGLDisplay r2 = (android.opengl.EGLDisplay) r2
            android.opengl.EGLDisplay r3 = android.opengl.EGL14.EGL_NO_DISPLAY
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto Lc2
            java.lang.Object r2 = r6.Y
            android.opengl.EGLDisplay r2 = (android.opengl.EGLDisplay) r2
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            android.opengl.EGLContext r4 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGL14.eglMakeCurrent(r2, r3, r3, r4)
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()
            sy r3 = (defpackage.sy) r3
            android.opengl.EGLSurface r4 = r3.a
            android.opengl.EGLSurface r5 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L48
            java.lang.Object r4 = r6.Y
            android.opengl.EGLDisplay r4 = (android.opengl.EGLDisplay) r4
            android.opengl.EGLSurface r3 = r3.a
            boolean r3 = android.opengl.EGL14.eglDestroySurface(r4, r3)
            if (r3 != 0) goto L48
            java.lang.String r3 = "eglDestroySurface"
            defpackage.bp2.a(r3)     // Catch: java.lang.IllegalStateException -> L70
            goto L48
        L70:
            r3 = move-exception
            java.lang.String r4 = "GLUtils"
            java.lang.String r5 = r3.toString()
            defpackage.kj2.w(r4, r5, r3)
            goto L48
        L7b:
            r0.clear()
            java.lang.Object r0 = r6.e0
            android.opengl.EGLSurface r0 = (android.opengl.EGLSurface) r0
            android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L99
            java.lang.Object r0 = r6.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            java.lang.Object r2 = r6.e0
            android.opengl.EGLSurface r2 = (android.opengl.EGLSurface) r2
            android.opengl.EGL14.eglDestroySurface(r0, r2)
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r6.e0 = r0
        L99:
            java.lang.Object r0 = r6.Z
            android.opengl.EGLContext r0 = (android.opengl.EGLContext) r0
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto Lb4
            java.lang.Object r0 = r6.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            java.lang.Object r2 = r6.Z
            android.opengl.EGLContext r2 = (android.opengl.EGLContext) r2
            android.opengl.EGL14.eglDestroyContext(r0, r2)
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r6.Z = r0
        Lb4:
            android.opengl.EGL14.eglReleaseThread()
            java.lang.Object r0 = r6.Y
            android.opengl.EGLDisplay r0 = (android.opengl.EGLDisplay) r0
            android.opengl.EGL14.eglTerminate(r0)
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r6.Y = r0
        Lc2:
            r6.d0 = r1
            r0 = -1
            r6.A = r0
            yo2 r0 = defpackage.yo2.UNKNOWN
            r6.i0 = r0
            r6.f0 = r1
            r6.X = r1
            return
    }

    @Override // defpackage.kl7
    public int o() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.kl7
    public int p() {
            r0 = this;
            int r0 = r0.A
            return r0
    }

    @Override // defpackage.il7
    public defpackage.ap q(long r17, defpackage.ap r19, defpackage.ap r20, defpackage.ap r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            java.lang.Object r3 = r0.L
            o94 r3 = (defpackage.o94) r3
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r17 / r4
            int[] r6 = defpackage.jl7.a
            int r6 = r0.A
            long r7 = (long) r6
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L1b
            r4 = r9
        L1b:
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L20
            goto L21
        L20:
            r7 = r4
        L21:
            int r4 = (int) r7
            java.lang.Object r5 = r0.R
            p94 r5 = (defpackage.p94) r5
            java.lang.Object r7 = r5.b(r4)
            nl7 r7 = (defpackage.nl7) r7
            if (r7 == 0) goto L31
            ap r0 = r7.a
            return r0
        L31:
            if (r4 < r6) goto L34
            return r2
        L34:
            if (r4 > 0) goto L37
            return r1
        L37:
            r6 = r21
            r0.k(r1, r2, r6)
            java.lang.Object r6 = r0.Z
            ap r6 = (defpackage.ap) r6
            r6.getClass()
            java.lang.Object r7 = r0.i0
            os0 r7 = (defpackage.os0) r7
            os0 r8 = defpackage.jl7.c
            r9 = 0
            r10 = 1
            if (r7 == r8) goto L153
            int r1 = r0.f(r4)
            float r1 = r0.g(r1, r9, r4)
            java.lang.Object r2 = r0.g0
            float[] r2 = (float[]) r2
            java.lang.Object r0 = r0.i0
            os0 r0 = (defpackage.os0) r0
            java.lang.Object r0 = r0.B
            xt[][] r0 = (defpackage.xt[][]) r0
            int r3 = r0.length
            int r3 = r3 - r10
            r4 = r0[r9]
            r4 = r4[r9]
            float r4 = r4.a
            r5 = r0[r3]
            r5 = r5[r9]
            float r5 = r5.b
            int r7 = r2.length
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 < 0) goto Ldb
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto L79
            goto Ldb
        L79:
            int r3 = r0.length
            r4 = r9
            r5 = r4
        L7c:
            if (r4 >= r3) goto L147
            r8 = r9
            r11 = r8
        L80:
            int r12 = r7 + (-1)
            if (r8 >= r12) goto Ld3
            r12 = r0[r4]
            r12 = r12[r11]
            float r13 = r12.b
            int r13 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r13 > 0) goto Lcd
            boolean r5 = r12.p
            if (r5 == 0) goto Lb3
            float r5 = r12.a
            float r13 = r1 - r5
            float r14 = r12.k
            float r13 = r13 * r14
            float r15 = r12.c
            float r9 = r12.e
            float r9 = defpackage.i61.a(r9, r15, r13, r15)
            r2[r8] = r9
            int r9 = r8 + 1
            float r5 = r1 - r5
            float r5 = r5 * r14
            float r13 = r12.d
            float r12 = r12.f
            float r5 = defpackage.i61.a(r12, r13, r5, r13)
            r2[r9] = r5
            goto Lcc
        Lb3:
            r12.c(r1)
            float r5 = r12.q
            float r9 = r12.n
            float r13 = r12.h
            float r9 = r9 * r13
            float r9 = r9 + r5
            r2[r8] = r9
            int r5 = r8 + 1
            float r9 = r12.r
            float r13 = r12.o
            float r12 = r12.i
            float r13 = r13 * r12
            float r13 = r13 + r9
            r2[r5] = r13
        Lcc:
            r5 = r10
        Lcd:
            int r8 = r8 + 2
            int r11 = r11 + 1
            r9 = 0
            goto L80
        Ld3:
            if (r5 == 0) goto Ld7
            goto L147
        Ld7:
            int r4 = r4 + 1
            r9 = 0
            goto L7c
        Ldb:
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto Le1
            r4 = r5
            goto Le2
        Le1:
            r3 = 0
        Le2:
            float r1 = r1 - r4
            r5 = 0
            r8 = 0
        Le5:
            int r9 = r7 + (-1)
            if (r5 >= r9) goto L147
            r9 = r0[r3]
            r9 = r9[r8]
            boolean r11 = r9.p
            float r12 = r9.r
            float r13 = r9.q
            if (r11 == 0) goto L11c
            float r11 = r9.a
            float r14 = r4 - r11
            float r15 = r9.k
            float r14 = r14 * r15
            float r10 = r9.c
            r16 = r0
            float r0 = r9.e
            float r0 = defpackage.i61.a(r0, r10, r14, r10)
            float r13 = r13 * r1
            float r13 = r13 + r0
            r2[r5] = r13
            int r0 = r5 + 1
            float r10 = r4 - r11
            float r10 = r10 * r15
            float r11 = r9.d
            float r9 = r9.f
            float r9 = defpackage.i61.a(r9, r11, r10, r11)
            float r12 = r12 * r1
            float r12 = r12 + r9
            r2[r0] = r12
            goto L13f
        L11c:
            r16 = r0
            r9.c(r4)
            float r0 = r9.n
            float r10 = r9.h
            float r0 = r0 * r10
            float r0 = r0 + r13
            float r10 = r9.a()
            float r10 = r10 * r1
            float r10 = r10 + r0
            r2[r5] = r10
            int r0 = r5 + 1
            float r10 = r9.o
            float r11 = r9.i
            float r10 = r10 * r11
            float r10 = r10 + r12
            float r9 = r9.b()
            float r9 = r9 * r1
            float r9 = r9 + r10
            r2[r0] = r9
        L13f:
            int r5 = r5 + 2
            int r8 = r8 + 1
            r10 = 1
            r0 = r16
            goto Le5
        L147:
            int r0 = r2.length
            r9 = 0
        L149:
            if (r9 >= r0) goto L19c
            r1 = r2[r9]
            r6.e(r9, r1)
            int r9 = r9 + 1
            goto L149
        L153:
            int r7 = r0.f(r4)
            r8 = 1
            float r0 = r0.g(r7, r8, r4)
            int r4 = r3.c(r7)
            java.lang.Object r4 = r5.b(r4)
            nl7 r4 = (defpackage.nl7) r4
            if (r4 == 0) goto L16e
            ap r4 = r4.a
            if (r4 != 0) goto L16d
            goto L16e
        L16d:
            r1 = r4
        L16e:
            int r7 = r7 + r8
            int r3 = r3.c(r7)
            java.lang.Object r3 = r5.b(r3)
            nl7 r3 = (defpackage.nl7) r3
            if (r3 == 0) goto L181
            ap r3 = r3.a
            if (r3 != 0) goto L180
            goto L181
        L180:
            r2 = r3
        L181:
            int r3 = r6.b()
            r9 = 0
        L186:
            if (r9 >= r3) goto L19c
            float r4 = r1.a(r9)
            float r5 = r2.a(r9)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 - r0
            float r7 = r7 * r4
            float r5 = r5 * r0
            float r5 = r5 + r7
            r6.e(r9, r5)
            int r9 = r9 + 1
            goto L186
        L19c:
            return r6
    }

    public void s(android.view.Surface r2, boolean r3) {
            r1 = this;
            java.lang.Object r0 = r1.f0
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 != r2) goto L10
            r0 = 0
            r1.f0 = r0
            java.lang.Object r0 = r1.e0
            android.opengl.EGLSurface r0 = (android.opengl.EGLSurface) r0
            r1.l(r0)
        L10:
            java.lang.Object r0 = r1.R
            java.util.HashMap r0 = (java.util.HashMap) r0
            if (r3 == 0) goto L1d
            java.lang.Object r2 = r0.remove(r2)
            sy r2 = (defpackage.sy) r2
            goto L25
        L1d:
            sy r3 = defpackage.bp2.j
            java.lang.Object r2 = r0.put(r2, r3)
            sy r2 = (defpackage.sy) r2
        L25:
            if (r2 == 0) goto L4d
            sy r3 = defpackage.bp2.j
            if (r2 == r3) goto L4d
            java.lang.Object r1 = r1.Y     // Catch: java.lang.RuntimeException -> L35
            android.opengl.EGLDisplay r1 = (android.opengl.EGLDisplay) r1     // Catch: java.lang.RuntimeException -> L35
            android.opengl.EGLSurface r2 = r2.a     // Catch: java.lang.RuntimeException -> L35
            android.opengl.EGL14.eglDestroySurface(r1, r2)     // Catch: java.lang.RuntimeException -> L35
            return
        L35:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to destroy EGL surface: "
            r2.<init>(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "OpenGlRenderer"
            defpackage.kj2.g0(r3, r2, r1)
        L4d:
            return
    }

    public void t(long r7, float[] r9, android.view.Surface r10) {
            r6 = this;
            java.lang.Object r0 = r6.L
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            r1 = 1
            defpackage.bp2.d(r0, r1)
            java.lang.Object r0 = r6.X
            java.lang.Thread r0 = (java.lang.Thread) r0
            defpackage.bp2.c(r0)
            java.lang.Object r0 = r6.R
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r2 = r0.containsKey(r10)
            java.lang.String r3 = "The surface is not registered."
            defpackage.np2.A(r3, r2)
            java.lang.Object r2 = r0.get(r10)
            sy r2 = (defpackage.sy) r2
            java.util.Objects.requireNonNull(r2)
            sy r3 = defpackage.bp2.j
            if (r2 != r3) goto L33
            sy r2 = r6.d(r10)
            if (r2 != 0) goto L30
            goto L9b
        L30:
            r0.put(r10, r2)
        L33:
            int r0 = r2.c
            int r3 = r2.b
            android.opengl.EGLSurface r2 = r2.a
            java.lang.Object r4 = r6.f0
            android.view.Surface r4 = (android.view.Surface) r4
            r5 = 0
            if (r10 == r4) goto L4b
            r6.l(r2)
            r6.f0 = r10
            android.opengl.GLES20.glViewport(r5, r5, r3, r0)
            android.opengl.GLES20.glScissor(r5, r5, r3, r0)
        L4b:
            java.lang.Object r0 = r6.h0
            zo2 r0 = (defpackage.zo2) r0
            r0.getClass()
            boolean r3 = r0 instanceof defpackage.ap2
            if (r3 == 0) goto L62
            ap2 r0 = (defpackage.ap2) r0
            int r0 = r0.f
            android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r5, r9, r5)
            java.lang.String r9 = "glUniformMatrix4fv"
            defpackage.bp2.b(r9)
        L62:
            r9 = 5
            r0 = 4
            android.opengl.GLES20.glDrawArrays(r9, r5, r0)
            java.lang.String r9 = "glDrawArrays"
            defpackage.bp2.b(r9)
            java.lang.Object r9 = r6.Y
            android.opengl.EGLDisplay r9 = (android.opengl.EGLDisplay) r9
            android.opengl.EGLExt.eglPresentationTimeANDROID(r9, r2, r7)
            java.lang.Object r7 = r6.Y
            android.opengl.EGLDisplay r7 = (android.opengl.EGLDisplay) r7
            boolean r7 = android.opengl.EGL14.eglSwapBuffers(r7, r2)
            if (r7 != 0) goto L9b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to swap buffers with EGL error: 0x"
            r7.<init>(r8)
            int r8 = android.opengl.EGL14.eglGetError()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "OpenGlRenderer"
            defpackage.kj2.f0(r8, r7)
            r6.s(r10, r5)
        L9b:
            return
    }

    public void u(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.g0
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r2.i0
            yo2 r1 = (defpackage.yo2) r1
            java.lang.Object r0 = r0.get(r1)
            zo2 r0 = (defpackage.zo2) r0
            if (r0 == 0) goto L55
            java.lang.Object r1 = r2.h0
            zo2 r1 = (defpackage.zo2) r1
            if (r1 == r0) goto L3e
            r2.h0 = r0
            r0.b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Using program for input format "
            r0.<init>(r1)
            java.lang.Object r1 = r2.i0
            yo2 r1 = (defpackage.yo2) r1
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.Object r2 = r2.h0
            zo2 r2 = (defpackage.zo2) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "OpenGlRenderer"
            android.util.Log.d(r0, r2)
        L3e:
            r2 = 33984(0x84c0, float:4.7622E-41)
            android.opengl.GLES20.glActiveTexture(r2)
            java.lang.String r2 = "glActiveTexture"
            defpackage.bp2.b(r2)
            r2 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r2, r3)
            java.lang.String r2 = "glBindTexture"
            defpackage.bp2.b(r2)
            return
        L55:
            java.lang.Object r2 = r2.i0
            yo2 r2 = (defpackage.yo2) r2
            java.lang.String r3 = "Unable to configure program for input format: "
            defpackage.e41.z(r2, r3)
            return
    }
}
