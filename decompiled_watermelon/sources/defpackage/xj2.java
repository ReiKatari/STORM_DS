package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj2  reason: default package */
/* loaded from: classes.dex */
public abstract class xj2 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final sj2 e;
    public static final sj2 f;
    public static final sj2 g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final gx j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new sj2(0);
        f = new sj2(1);
        g = new sj2(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        h = asFloatBuffer;
        float[] fArr = {RecyclerView.A1, RecyclerView.A1, 1.0f, RecyclerView.A1, RecyclerView.A1, 1.0f, 1.0f, 1.0f};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr);
        asFloatBuffer2.position(0);
        i = asFloatBuffer2;
        j = new gx(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        c44.q(b31.t(str, ": EGL error: 0x"), Integer.toHexString(eglGetError));
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        c44.q(b31.t(str, ": GL error 0x"), Integer.toHexString(glGetError));
    }

    public static void c(Thread thread) {
        boolean z;
        if (thread == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        nl2.D("Method call must be called on the GL thread.", z);
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        boolean z2;
        String str;
        if (z == atomicBoolean.get()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        nl2.D(str, z2);
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        i.n(wh1.A("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, sm1 sm1Var) {
        int i2 = sm1Var.a;
        int[] iArr = a;
        if (i2 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return b;
            }
            ve2.c0("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(sm1 sm1Var) {
        uj2[] values;
        Object wj2Var;
        uj2 uj2Var;
        boolean z;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        for (uj2 uj2Var2 : uj2.values()) {
            sj2 sj2Var = (sj2) map.get(uj2Var2);
            if (sj2Var != null) {
                wj2Var = new wj2(sm1Var, sj2Var);
            } else if (uj2Var2 != uj2.YUV && uj2Var2 != (uj2Var = uj2.DEFAULT)) {
                if (uj2Var2 == uj2.UNKNOWN) {
                    z = true;
                } else {
                    z = false;
                }
                nl2.D("Unhandled input format: " + uj2Var2, z);
                if (sm1Var.a()) {
                    wj2Var = new vj2("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    sj2 sj2Var2 = (sj2) map.get(uj2Var);
                    if (sj2Var2 != null) {
                        wj2Var = new wj2(sm1Var, sj2Var2);
                    } else {
                        wj2Var = new wj2(sm1Var, uj2Var);
                    }
                }
            } else {
                wj2Var = new wj2(sm1Var, uj2Var2);
            }
            Log.d("GLUtils", "Shader program for input format " + uj2Var2 + " created: " + wj2Var);
            hashMap.put(uj2Var2, wj2Var);
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
        i.n("surface was null");
        return null;
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            return wh1.l(group, ".", group2);
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
        ve2.c0("GLUtils", "Could not compile shader: " + str);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + glGetShaderInfoLog);
    }
}
