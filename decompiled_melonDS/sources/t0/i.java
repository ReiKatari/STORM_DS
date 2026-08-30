package t0;

import a0.j;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import d0.a0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f13063a = {12344};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f13064b = {12445, 13632, 12344};

    /* renamed from: c  reason: collision with root package name */
    public static final String f13065c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f13066d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f13067e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f13068f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f13069g;

    /* renamed from: h  reason: collision with root package name */
    public static final FloatBuffer f13070h;

    /* renamed from: i  reason: collision with root package name */
    public static final FloatBuffer f13071i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f13072j;

    static {
        Locale locale = Locale.US;
        f13065c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f13066d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f13067e = new d(0);
        f13068f = new d(1);
        f13069g = new d(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        f13070h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.position(0);
        f13071i = asFloatBuffer2;
        f13072j = new c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        String hexString = Integer.toHexString(eglGetError);
        throw new IllegalStateException(str + ": EGL error: 0x" + hexString);
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        throw new IllegalStateException(str + ": GL error 0x" + hexString);
    }

    public static void c(Thread thread) {
        boolean z10;
        if (thread == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.o("Method call must be called on the GL thread.", z10);
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z10) {
        boolean z11;
        String str;
        if (z10 == atomicBoolean.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        m.o(str, z11);
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        j.p(kc.a.g("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, a0 a0Var) {
        int i2 = a0Var.f3326a;
        int[] iArr = f13063a;
        if (i2 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f13064b;
            }
            aj.g.y0("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(a0 a0Var) {
        f[] values;
        Object hVar;
        f fVar;
        boolean z10;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        for (f fVar2 : f.values()) {
            d dVar = (d) map.get(fVar2);
            if (dVar != null) {
                hVar = new h(a0Var, dVar);
            } else if (fVar2 != f.YUV && fVar2 != (fVar = f.DEFAULT)) {
                if (fVar2 == f.UNKNOWN) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                m.o("Unhandled input format: " + fVar2, z10);
                if (a0Var.a()) {
                    hVar = new g("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    d dVar2 = (d) map.get(fVar);
                    if (dVar2 != null) {
                        hVar = new h(a0Var, dVar2);
                    } else {
                        hVar = new h(a0Var, fVar);
                    }
                }
            } else {
                hVar = new h(a0Var, fVar2);
            }
            Log.d("GLUtils", "Shader program for input format " + fVar2 + " created: " + hVar);
            hashMap.put(fVar2, hVar);
        }
        return hashMap;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        j.p("surface was null");
        return null;
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            return group + "." + group2;
        }
        return "0.0";
    }

    public static int k(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        aj.g.y0("GLUtils", "Could not compile shader: " + str);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + glGetShaderInfoLog);
    }
}
