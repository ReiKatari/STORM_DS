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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bp2  reason: default package */
/* loaded from: classes.dex */
public abstract class bp2 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final wo2 e;
    public static final wo2 f;
    public static final wo2 g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final sy j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new wo2(0);
        f = new wo2(1);
        g = new wo2(2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer.position(0);
        h = asFloatBuffer;
        float[] fArr = {RecyclerView.B1, RecyclerView.B1, 1.0f, RecyclerView.B1, RecyclerView.B1, 1.0f, 1.0f, 1.0f};
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr);
        asFloatBuffer2.position(0);
        i = asFloatBuffer2;
        j = new sy(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        u34.r(i61.r(str, ": EGL error: 0x"), Integer.toHexString(eglGetError));
    }

    public static void b(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        u34.r(i61.r(str, ": GL error 0x"), Integer.toHexString(glGetError));
    }

    public static void c(Thread thread) {
        boolean z;
        if (thread == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        np2.A("Method call must be called on the GL thread.", z);
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
        np2.A(str, z2);
    }

    public static void e(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        i.m(lb1.A("Unable to locate '", str, "' in program"));
    }

    public static int[] f(String str, yq1 yq1Var) {
        int i2 = yq1Var.a;
        int[] iArr = a;
        if (i2 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return b;
            }
            kj2.f0("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(yq1 yq1Var) {
        yo2[] values;
        Object ap2Var;
        yo2 yo2Var;
        boolean z;
        Map map = Collections.EMPTY_MAP;
        HashMap hashMap = new HashMap();
        for (yo2 yo2Var2 : yo2.values()) {
            wo2 wo2Var = (wo2) map.get(yo2Var2);
            if (wo2Var != null) {
                ap2Var = new ap2(yq1Var, wo2Var);
            } else if (yo2Var2 != yo2.YUV && yo2Var2 != (yo2Var = yo2.DEFAULT)) {
                if (yo2Var2 == yo2.UNKNOWN) {
                    z = true;
                } else {
                    z = false;
                }
                np2.A("Unhandled input format: " + yo2Var2, z);
                if (yq1Var.a()) {
                    ap2Var = new zo2("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    wo2 wo2Var2 = (wo2) map.get(yo2Var);
                    if (wo2Var2 != null) {
                        ap2Var = new ap2(yq1Var, wo2Var2);
                    } else {
                        ap2Var = new ap2(yq1Var, yo2Var);
                    }
                }
            } else {
                ap2Var = new ap2(yq1Var, yo2Var2);
            }
            Log.d("GLUtils", "Shader program for input format " + yo2Var2 + " created: " + ap2Var);
            hashMap.put(yo2Var2, ap2Var);
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
        i.m("surface was null");
        return null;
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            return lb1.m(group, ".", group2);
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
        kj2.f0("GLUtils", "Could not compile shader: " + str);
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + glGetShaderInfoLog);
    }
}
