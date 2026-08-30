package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pd4  reason: default package */
/* loaded from: classes.dex */
public class pd4 implements l77 {
    public int A;
    public int[] B;
    public final Object L;
    public final Object R;
    public Object X;
    public Object Y;
    public Object Z;
    public Object c0;
    public Object d0;
    public Object e0;
    public Object f0;
    public Object g0;
    public Object h0;

    public pd4() {
        this.L = new AtomicBoolean(false);
        this.R = new HashMap();
        this.Y = EGL14.EGL_NO_DISPLAY;
        this.Z = EGL14.EGL_NO_CONTEXT;
        this.B = xj2.a;
        this.d0 = EGL14.EGL_NO_SURFACE;
        this.f0 = Collections.EMPTY_MAP;
        this.g0 = null;
        this.h0 = uj2.UNKNOWN;
        this.A = -1;
    }

    public void c(sm1 sm1Var, q9 q9Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.Y = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i5 = 2;
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize((EGLDisplay) this.Y, iArr2, 0, iArr2, 1)) {
                if (q9Var != null) {
                    q9Var.L = iArr2[0] + "." + iArr2[1];
                }
                if (sm1Var.a()) {
                    i = 10;
                } else {
                    i = 8;
                }
                if (sm1Var.a()) {
                    i2 = 2;
                } else {
                    i2 = 8;
                }
                if (sm1Var.a()) {
                    i3 = 64;
                } else {
                    i3 = 4;
                }
                int i6 = i3;
                if (sm1Var.a()) {
                    i4 = -1;
                } else {
                    i4 = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.Y, new int[]{12324, i, 12323, i, 12322, i, 12321, i2, 12325, 0, 12326, 0, 12352, i6, 12610, i4, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (sm1Var.a()) {
                        i5 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.Y, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i5, 12344}, 0);
                    xj2.a("eglCreateContext");
                    this.c0 = eGLConfig;
                    this.Z = eglCreateContext;
                    EGL14.eglQueryContext((EGLDisplay) this.Y, eglCreateContext, 12440, new int[1], 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr[0]);
                    return;
                }
                i.n("Unable to find a suitable EGLConfig");
                return;
            }
            this.Y = EGL14.EGL_NO_DISPLAY;
            i.n("Unable to initialize EGL14");
            return;
        }
        i.n("Unable to get EGL14 display");
    }

    public gx d(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.Y;
                EGLConfig eGLConfig = (EGLConfig) this.c0;
                Objects.requireNonNull(eGLConfig);
                EGLSurface i = xj2.i(eGLDisplay, eGLConfig, surface, this.B);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.Y;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, i, 12375, iArr, 0);
                int i2 = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, i, 12374, iArr2, 0);
                Size size = new Size(i2, iArr2[0]);
                return new gx(i, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e) {
                e = e;
                ve2.d0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            ve2.d0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void e() {
        EGLConfig eGLConfig = (EGLConfig) this.c0;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = xj2.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.Y, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        xj2.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.d0 = eglCreatePbufferSurface;
        } else {
            i.n("surface was null");
        }
    }

    public int f(int i) {
        int i2;
        i14 i14Var = (i14) this.L;
        int i3 = i14Var.b;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int i6 = i14Var.a[i2];
                    if (i6 < i) {
                        i4 = i2 + 1;
                    } else if (i6 <= i) {
                        break;
                    } else {
                        i5 = i2 - 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        }
        f81.q("");
        return 0;
    }

    public float g(int i, boolean z, int i2) {
        bn1 bn1Var;
        float f;
        i14 i14Var = (i14) this.L;
        if (i >= i14Var.b - 1) {
            f = i2;
        } else {
            int c = i14Var.c(i);
            int c2 = i14Var.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                o77 o77Var = (o77) ((j14) this.R).b(c);
                if (o77Var == null || (bn1Var = o77Var.b) == null) {
                    bn1Var = (bn1) this.X;
                }
                float f2 = i3;
                float b = bn1Var.b((i2 - c) / f2);
                if (z) {
                    return b;
                }
                return ((f2 * b) + c) / 1000.0f;
            }
        }
        return f / 1000.0f;
    }

    public ui4 h(sm1 sm1Var) {
        xj2.d((AtomicBoolean) this.L, false);
        try {
            c(sm1Var, null);
            e();
            m((EGLSurface) this.d0);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.Y, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new ui4(glGetString, eglQueryString);
        } catch (IllegalStateException e) {
            ve2.d0("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new ui4("", "");
        } finally {
            r();
        }
    }

    public bx i(sm1 sm1Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.L;
        xj2.d(atomicBoolean, false);
        q9 q9Var = new q9(3);
        q9Var.B = "0.0";
        q9Var.L = "0.0";
        q9Var.R = "";
        q9Var.X = "";
        try {
            if (sm1Var.a()) {
                ui4 h = h(sm1Var);
                String str = (String) h.a;
                String str2 = (String) h.b;
                if (!str.contains("GL_EXT_YUV_target")) {
                    ve2.c0("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    sm1Var = sm1.d;
                }
                this.B = xj2.f(str2, sm1Var);
                q9Var.R = str;
                q9Var.X = str2;
            }
            c(sm1Var, q9Var);
            e();
            m((EGLSurface) this.d0);
            q9Var.B = xj2.j();
            this.f0 = xj2.g(sm1Var);
            int h2 = xj2.h();
            this.A = h2;
            u(h2);
            this.X = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new bx((String) q9Var.B, (String) q9Var.L, (String) q9Var.R, (String) q9Var.X);
            }
            i.n("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            r();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            r();
            throw e;
        }
    }

    public void j(oo ooVar, oo ooVar2, oo ooVar3) {
        boolean z;
        float[] fArr;
        j14 j14Var = (j14) this.R;
        i14 i14Var = (i14) this.L;
        if (((bq0) this.h0) != k77.c) {
            z = true;
        } else {
            z = false;
        }
        if (((oo) this.Z) == null) {
            this.Z = ooVar.c();
            this.c0 = ooVar3.c();
            int i = i14Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = i14Var.c(i2) / 1000.0f;
            }
            this.Y = fArr2;
            int i3 = i14Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                o77 o77Var = (o77) j14Var.b(i14Var.c(i4));
                iArr[i4] = 0;
            }
            this.B = iArr;
        }
        if (z) {
            if (((bq0) this.h0) != k77.c && b53.x((oo) this.d0, ooVar) && b53.x((oo) this.e0, ooVar2)) {
                return;
            }
            this.d0 = ooVar;
            this.e0 = ooVar2;
            int b = ooVar.b() + (ooVar.b() % 2);
            this.f0 = new float[b];
            this.g0 = new float[b];
            int i5 = i14Var.b;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = i14Var.c(i6);
                o77 o77Var2 = (o77) j14Var.b(c);
                if (c == 0 && o77Var2 == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = ooVar.a(i7);
                    }
                } else if (c == this.A && o77Var2 == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = ooVar2.a(i8);
                    }
                } else {
                    o77Var2.getClass();
                    oo ooVar4 = o77Var2.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = ooVar4.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.h0 = new bq0(this.B, (float[]) this.Y, fArr3);
        }
    }

    @Override // defpackage.l77
    public int k() {
        return 0;
    }

    @Override // defpackage.j77
    public oo l(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        long j2;
        long j3 = j / 1000000;
        int[] iArr = k77.a;
        long j4 = this.A;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 < 0) {
            return ooVar3;
        }
        j(ooVar, ooVar2, ooVar3);
        oo ooVar4 = (oo) this.c0;
        ooVar4.getClass();
        int i = 0;
        if (((bq0) this.h0) != k77.c) {
            int i2 = (int) j2;
            float g = g(f(i2), false, i2);
            float[] fArr = (float[]) this.g0;
            ht[][] htVarArr = (ht[][]) ((bq0) this.h0).B;
            float f = htVarArr[0][0].a;
            float f2 = htVarArr[htVarArr.length - 1][0].b;
            if (g < f) {
                g = f;
            }
            if (g <= f2) {
                f2 = g;
            }
            int length = fArr.length;
            boolean z = false;
            for (ht[] htVarArr2 : htVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    ht htVar = htVarArr2[i4];
                    if (f2 <= htVar.b) {
                        if (htVar.p) {
                            fArr[i3] = htVar.q;
                            fArr[i3 + 1] = htVar.r;
                        } else {
                            htVar.c(f2);
                            fArr[i3] = htVar.a();
                            fArr[i3 + 1] = htVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                ooVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            oo p = p((j2 - 1) * 1000000, ooVar, ooVar2, ooVar3);
            oo p2 = p(j2 * 1000000, ooVar, ooVar2, ooVar3);
            int b = p.b();
            while (i < b) {
                ooVar4.e(i, (p.a(i) - p2.a(i)) * 1000.0f);
                i++;
            }
        }
        return ooVar4;
    }

    public void m(EGLSurface eGLSurface) {
        ((EGLDisplay) this.Y).getClass();
        ((EGLContext) this.Z).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.Y, eGLSurface, eGLSurface, (EGLContext) this.Z)) {
            return;
        }
        i.n("eglMakeCurrent failed");
    }

    public void n(Surface surface) {
        xj2.d((AtomicBoolean) this.L, true);
        xj2.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, xj2.j);
        }
    }

    @Override // defpackage.l77
    public int o() {
        return this.A;
    }

    @Override // defpackage.j77
    public oo p(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        oo ooVar4;
        oo ooVar5;
        ht[][] htVarArr;
        oo ooVar6 = ooVar;
        oo ooVar7 = ooVar2;
        i14 i14Var = (i14) this.L;
        long j2 = j / 1000000;
        int[] iArr = k77.a;
        int i = this.A;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        j14 j14Var = (j14) this.R;
        o77 o77Var = (o77) j14Var.b(i2);
        if (o77Var != null) {
            return o77Var.a;
        }
        if (i2 >= i) {
            return ooVar7;
        }
        if (i2 <= 0) {
            return ooVar6;
        }
        j(ooVar6, ooVar7, ooVar3);
        oo ooVar8 = (oo) this.Z;
        ooVar8.getClass();
        int i3 = 0;
        if (((bq0) this.h0) != k77.c) {
            float g = g(f(i2), false, i2);
            float[] fArr = (float[]) this.f0;
            ht[][] htVarArr2 = (ht[][]) ((bq0) this.h0).B;
            int length = htVarArr2.length - 1;
            float f = htVarArr2[0][0].a;
            float f2 = htVarArr2[length][0].b;
            int length2 = fArr.length;
            if (g >= f && g <= f2) {
                int length3 = htVarArr2.length;
                int i4 = 0;
                boolean z = false;
                while (i4 < length3) {
                    int i5 = i3;
                    int i6 = i5;
                    while (i5 < length2 - 1) {
                        ht htVar = htVarArr2[i4][i6];
                        if (g <= htVar.b) {
                            if (htVar.p) {
                                float f3 = htVar.a;
                                float f4 = htVar.k;
                                float f5 = htVar.c;
                                fArr[i5] = b31.a(htVar.e, f5, (g - f3) * f4, f5);
                                float f6 = htVar.d;
                                fArr[i5 + 1] = b31.a(htVar.f, f6, (g - f3) * f4, f6);
                            } else {
                                htVar.c(g);
                                fArr[i5] = (htVar.n * htVar.h) + htVar.q;
                                fArr[i5 + 1] = (htVar.o * htVar.i) + htVar.r;
                            }
                            z = true;
                        }
                        i5 += 2;
                        i6++;
                    }
                    if (z) {
                        break;
                    }
                    i4++;
                    i3 = 0;
                }
            } else {
                if (g > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f7 = g - f;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2 - 1) {
                    ht htVar2 = htVarArr2[length][i8];
                    boolean z2 = htVar2.p;
                    float f8 = htVar2.r;
                    float f9 = htVar2.q;
                    if (z2) {
                        float f10 = htVar2.a;
                        float f11 = htVar2.k;
                        float f12 = htVar2.c;
                        htVarArr = htVarArr2;
                        fArr[i7] = (f9 * f7) + b31.a(htVar2.e, f12, (f - f10) * f11, f12);
                        float f13 = htVar2.d;
                        fArr[i7 + 1] = (f8 * f7) + b31.a(htVar2.f, f13, (f - f10) * f11, f13);
                    } else {
                        htVarArr = htVarArr2;
                        htVar2.c(f);
                        fArr[i7] = (htVar2.a() * f7) + (htVar2.n * htVar2.h) + f9;
                        fArr[i7 + 1] = (htVar2.b() * f7) + (htVar2.o * htVar2.i) + f8;
                    }
                    i7 += 2;
                    i8++;
                    htVarArr2 = htVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                ooVar8.e(i9, fArr[i9]);
            }
        } else {
            int f14 = f(i2);
            float g2 = g(f14, true, i2);
            o77 o77Var2 = (o77) j14Var.b(i14Var.c(f14));
            if (o77Var2 != null && (ooVar5 = o77Var2.a) != null) {
                ooVar6 = ooVar5;
            }
            o77 o77Var3 = (o77) j14Var.b(i14Var.c(f14 + 1));
            if (o77Var3 != null && (ooVar4 = o77Var3.a) != null) {
                ooVar7 = ooVar4;
            }
            int b = ooVar8.b();
            for (int i10 = 0; i10 < b; i10++) {
                ooVar8.e(i10, (ooVar7.a(i10) * g2) + ((1.0f - g2) * ooVar6.a(i10)));
            }
        }
        return ooVar8;
    }

    public void r() {
        HashMap hashMap = (HashMap) this.R;
        for (vj2 vj2Var : ((Map) this.f0).values()) {
            GLES20.glDeleteProgram(vj2Var.a);
        }
        this.f0 = Collections.EMPTY_MAP;
        this.g0 = null;
        if (!Objects.equals((EGLDisplay) this.Y, EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay) this.Y, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (gx gxVar : hashMap.values()) {
                if (!Objects.equals(gxVar.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.Y, gxVar.a)) {
                    try {
                        xj2.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        ve2.x("GLUtils", e.toString(), e);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.d0, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.Y, (EGLSurface) this.d0);
                this.d0 = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.Z, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.Y, (EGLContext) this.Z);
                this.Z = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.Y);
            this.Y = EGL14.EGL_NO_DISPLAY;
        }
        this.c0 = null;
        this.A = -1;
        this.h0 = uj2.UNKNOWN;
        this.e0 = null;
        this.X = null;
    }

    public void s(Surface surface, boolean z) {
        gx gxVar;
        if (((Surface) this.e0) == surface) {
            this.e0 = null;
            m((EGLSurface) this.d0);
        }
        HashMap hashMap = (HashMap) this.R;
        if (z) {
            gxVar = (gx) hashMap.remove(surface);
        } else {
            gxVar = (gx) hashMap.put(surface, xj2.j);
        }
        if (gxVar != null && gxVar != xj2.j) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.Y, gxVar.a);
            } catch (RuntimeException e) {
                ve2.d0("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
            }
        }
    }

    public void t(long j, float[] fArr, Surface surface) {
        xj2.d((AtomicBoolean) this.L, true);
        xj2.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        nl2.D("The surface is not registered.", hashMap.containsKey(surface));
        gx gxVar = (gx) hashMap.get(surface);
        Objects.requireNonNull(gxVar);
        if (gxVar == xj2.j) {
            gxVar = d(surface);
            if (gxVar != null) {
                hashMap.put(surface, gxVar);
            } else {
                return;
            }
        }
        int i = gxVar.c;
        int i2 = gxVar.b;
        EGLSurface eGLSurface = gxVar.a;
        if (surface != ((Surface) this.e0)) {
            m(eGLSurface);
            this.e0 = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        vj2 vj2Var = (vj2) this.g0;
        vj2Var.getClass();
        if (vj2Var instanceof wj2) {
            GLES20.glUniformMatrix4fv(((wj2) vj2Var).f, 1, false, fArr, 0);
            xj2.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        xj2.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.Y, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.Y, eGLSurface)) {
            ve2.c0("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            s(surface, false);
        }
    }

    public void u(int i) {
        vj2 vj2Var = (vj2) ((Map) this.f0).get((uj2) this.h0);
        if (vj2Var != null) {
            if (((vj2) this.g0) != vj2Var) {
                this.g0 = vj2Var;
                vj2Var.b();
                Log.d("OpenGlRenderer", "Using program for input format " + ((uj2) this.h0) + ": " + ((vj2) this.g0));
            }
            GLES20.glActiveTexture(33984);
            xj2.b("glActiveTexture");
            GLES20.glBindTexture(36197, i);
            xj2.b("glBindTexture");
            return;
        }
        f81.A((uj2) this.h0, "Unable to configure program for input format: ");
    }

    public pd4(i14 i14Var, j14 j14Var, int i, bn1 bn1Var) {
        this.L = i14Var;
        this.R = j14Var;
        this.A = i;
        this.X = bn1Var;
        this.B = k77.a;
        float[] fArr = k77.b;
        this.Y = fArr;
        this.f0 = fArr;
        this.g0 = fArr;
        this.h0 = k77.c;
    }
}
