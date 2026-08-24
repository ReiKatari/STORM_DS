package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bp2  reason: default package */
/* loaded from: classes.dex */
public abstract class bp2 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final java.lang.String c = null;
    public static final java.lang.String d = null;
    public static final defpackage.wo2 e = null;
    public static final defpackage.wo2 f = null;
    public static final defpackage.wo2 g = null;
    public static final java.nio.FloatBuffer h = null;
    public static final java.nio.FloatBuffer i = null;
    public static final defpackage.sy j = null;

    static {
            r0 = 12344(0x3038, float:1.7298E-41)
            int[] r1 = new int[]{r0}
            defpackage.bp2.a = r1
            r1 = 12445(0x309d, float:1.7439E-41)
            r2 = 13632(0x3540, float:1.9103E-41)
            int[] r0 = new int[]{r1, r2, r0}
            defpackage.bp2.b = r0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"
            defpackage.bp2.c = r0
            java.lang.String r0 = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"
            defpackage.bp2.d = r0
            wo2 r0 = new wo2
            r1 = 0
            r0.<init>(r1)
            defpackage.bp2.e = r0
            wo2 r0 = new wo2
            r2 = 1
            r0.<init>(r2)
            defpackage.bp2.f = r0
            wo2 r0 = new wo2
            r2 = 2
            r0.<init>(r2)
            defpackage.bp2.g = r0
            r0 = 8
            float[] r2 = new float[r0]
            r2 = {x007a: FILL_ARRAY_DATA  , data: [-1082130432, -1082130432, 1065353216, -1082130432, -1082130432, 1065353216, 1065353216, 1065353216} // fill-array
            r3 = 32
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r3)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            r4.order(r5)
            java.nio.FloatBuffer r4 = r4.asFloatBuffer()
            r4.put(r2)
            r4.position(r1)
            defpackage.bp2.h = r4
            float[] r0 = new float[r0]
            r0 = {x008e: FILL_ARRAY_DATA  , data: [0, 0, 1065353216, 0, 0, 1065353216, 1065353216, 1065353216} // fill-array
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r3)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            r2.order(r3)
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()
            r2.put(r0)
            r2.position(r1)
            defpackage.bp2.i = r2
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            sy r2 = new sy
            r2.<init>(r0, r1, r1)
            defpackage.bp2.j = r2
            return
    }

    public static void a(java.lang.String r2) {
            int r0 = android.opengl.EGL14.eglGetError()
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L9
            return
        L9:
            java.lang.String r1 = ": EGL error: 0x"
            java.lang.StringBuilder r2 = defpackage.i61.r(r2, r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            defpackage.u34.r(r2, r0)
            return
    }

    public static void b(java.lang.String r2) {
            int r0 = android.opengl.GLES20.glGetError()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = ": GL error 0x"
            java.lang.StringBuilder r2 = defpackage.i61.r(r2, r1)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            defpackage.u34.r(r2, r0)
            return
    }

    public static void c(java.lang.Thread r1) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r0 = "Method call must be called on the GL thread."
            defpackage.np2.A(r0, r1)
            return
    }

    public static void d(java.util.concurrent.atomic.AtomicBoolean r0, boolean r1) {
            boolean r0 = r0.get()
            if (r1 != r0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r1 == 0) goto Le
            java.lang.String r1 = "OpenGlRenderer is not initialized"
            goto L10
        Le:
            java.lang.String r1 = "OpenGlRenderer is already initialized"
        L10:
            defpackage.np2.A(r1, r0)
            return
    }

    public static void e(int r1, java.lang.String r2) {
            if (r1 < 0) goto L3
            return
        L3:
            java.lang.String r1 = "Unable to locate '"
            java.lang.String r0 = "' in program"
            java.lang.String r1 = defpackage.lb1.A(r1, r2, r0)
            defpackage.i.m(r1)
            return
    }

    public static int[] f(java.lang.String r2, defpackage.yq1 r3) {
            int r3 = r3.a
            r0 = 3
            int[] r1 = defpackage.bp2.a
            if (r3 != r0) goto L19
            java.lang.String r3 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L12
            int[] r2 = defpackage.bp2.b
            return r2
        L12:
            java.lang.String r2 = "GLUtils"
            java.lang.String r3 = "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace."
            defpackage.kj2.f0(r2, r3)
        L19:
            return r1
    }

    public static java.util.HashMap g(defpackage.yq1 r11) {
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            yo2[] r2 = defpackage.yo2.values()
            int r3 = r2.length
            r4 = 0
            r5 = r4
        Le:
            if (r5 >= r3) goto L8c
            r6 = r2[r5]
            java.lang.Object r7 = r0.get(r6)
            wo2 r7 = (defpackage.wo2) r7
            if (r7 == 0) goto L20
            ap2 r8 = new ap2
            r8.<init>(r11, r7)
            goto L6b
        L20:
            yo2 r7 = defpackage.yo2.YUV
            if (r6 == r7) goto L66
            yo2 r7 = defpackage.yo2.DEFAULT
            if (r6 != r7) goto L29
            goto L66
        L29:
            yo2 r8 = defpackage.yo2.UNKNOWN
            if (r6 != r8) goto L2f
            r8 = 1
            goto L30
        L2f:
            r8 = r4
        L30:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unhandled input format: "
            r9.<init>(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            defpackage.np2.A(r9, r8)
            boolean r8 = r11.a()
            if (r8 == 0) goto L51
            xo2 r8 = new xo2
            java.lang.String r7 = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n"
            java.lang.String r9 = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n"
            r8.<init>(r7, r9)
            goto L6b
        L51:
            java.lang.Object r8 = r0.get(r7)
            wo2 r8 = (defpackage.wo2) r8
            if (r8 == 0) goto L60
            ap2 r7 = new ap2
            r7.<init>(r11, r8)
            r8 = r7
            goto L6b
        L60:
            ap2 r8 = new ap2
            r8.<init>(r11, r7)
            goto L6b
        L66:
            ap2 r8 = new ap2
            r8.<init>(r11, r6)
        L6b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Shader program for input format "
            r7.<init>(r9)
            r7.append(r6)
            java.lang.String r9 = " created: "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "GLUtils"
            android.util.Log.d(r9, r7)
            r1.put(r6, r8)
            int r5 = r5 + 1
            goto Le
        L8c:
            return r1
    }

    public static int h() {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            android.opengl.GLES20.glGenTextures(r0, r1, r2)
            java.lang.String r0 = "glGenTextures"
            b(r0)
            r0 = r1[r2]
            r1 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r1, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "glBindTexture "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            b(r2)
            r2 = 10241(0x2801, float:1.435E-41)
            r3 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            r2 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            r2 = 10242(0x2802, float:1.4352E-41)
            r3 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            r2 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r1, r2, r3)
            java.lang.String r1 = "glTexParameter"
            b(r1)
            return r0
    }

    public static android.opengl.EGLSurface i(android.opengl.EGLDisplay r1, android.opengl.EGLConfig r2, android.view.Surface r3, int[] r4) {
            r0 = 0
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreateWindowSurface(r1, r2, r3, r4, r0)
            java.lang.String r2 = "eglCreateWindowSurface"
            a(r2)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.lang.String r1 = "surface was null"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String j() {
            r0 = 7938(0x1f02, float:1.1124E-41)
            java.lang.String r0 = android.opengl.GLES20.glGetString(r0)
            java.lang.String r1 = "OpenGL ES ([0-9]+)\\.([0-9]+).*"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L2d
            r1 = 1
            java.lang.String r1 = r0.group(r1)
            r1.getClass()
            r2 = 2
            java.lang.String r0 = r0.group(r2)
            r0.getClass()
            java.lang.String r2 = "."
            java.lang.String r0 = defpackage.lb1.m(r1, r2, r0)
            return r0
        L2d:
            java.lang.String r0 = "0.0"
            return r0
    }

    public static int k(int r4, java.lang.String r5) {
            int r0 = android.opengl.GLES20.glCreateShader(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "glCreateShader type="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            b(r1)
            android.opengl.GLES20.glShaderSource(r0, r5)
            android.opengl.GLES20.glCompileShader(r0)
            r1 = 1
            int[] r1 = new int[r1]
            r2 = 35713(0x8b81, float:5.0045E-41)
            r3 = 0
            android.opengl.GLES20.glGetShaderiv(r0, r2, r1, r3)
            r1 = r1[r3]
            if (r1 == 0) goto L2a
            return r0
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not compile shader: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "GLUtils"
            defpackage.kj2.f0(r1, r5)
            java.lang.String r5 = android.opengl.GLES20.glGetShaderInfoLog(r0)
            android.opengl.GLES20.glDeleteShader(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not compile shader type "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = ":"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
