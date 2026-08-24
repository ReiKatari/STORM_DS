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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm4  reason: default package */
/* loaded from: classes.dex */
public class qm4 implements kl7 {
    public int A;
    public int[] B;
    public final Object L;
    public final Object R;
    public Object X;
    public Object Y;
    public Object Z;
    public Object d0;
    public Object e0;
    public Object f0;
    public Object g0;
    public Object h0;
    public Object i0;

    public qm4() {
        this.L = new AtomicBoolean(false);
        this.R = new HashMap();
        this.Y = EGL14.EGL_NO_DISPLAY;
        this.Z = EGL14.EGL_NO_CONTEXT;
        this.B = bp2.a;
        this.e0 = EGL14.EGL_NO_SURFACE;
        this.g0 = Collections.EMPTY_MAP;
        this.h0 = null;
        this.i0 = yo2.UNKNOWN;
        this.A = -1;
    }

    public void c(yq1 yq1Var, eb ebVar) {
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
                if (ebVar != null) {
                    ebVar.L = iArr2[0] + "." + iArr2[1];
                }
                if (yq1Var.a()) {
                    i = 10;
                } else {
                    i = 8;
                }
                if (yq1Var.a()) {
                    i2 = 2;
                } else {
                    i2 = 8;
                }
                if (yq1Var.a()) {
                    i3 = 64;
                } else {
                    i3 = 4;
                }
                int i6 = i3;
                if (yq1Var.a()) {
                    i4 = -1;
                } else {
                    i4 = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.Y, new int[]{12324, i, 12323, i, 12322, i, 12321, i2, 12325, 0, 12326, 0, 12352, i6, 12610, i4, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (yq1Var.a()) {
                        i5 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.Y, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i5, 12344}, 0);
                    bp2.a("eglCreateContext");
                    this.d0 = eGLConfig;
                    this.Z = eglCreateContext;
                    EGL14.eglQueryContext((EGLDisplay) this.Y, eglCreateContext, 12440, new int[1], 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr[0]);
                    return;
                }
                i.m("Unable to find a suitable EGLConfig");
                return;
            }
            this.Y = EGL14.EGL_NO_DISPLAY;
            i.m("Unable to initialize EGL14");
            return;
        }
        i.m("Unable to get EGL14 display");
    }

    public sy d(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.Y;
                EGLConfig eGLConfig = (EGLConfig) this.d0;
                Objects.requireNonNull(eGLConfig);
                EGLSurface i = bp2.i(eGLDisplay, eGLConfig, surface, this.B);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.Y;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, i, 12375, iArr, 0);
                int i2 = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, i, 12374, iArr2, 0);
                Size size = new Size(i2, iArr2[0]);
                return new sy(i, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException | IllegalStateException e) {
                e = e;
                kj2.g0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            e = e2;
            kj2.g0("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void e() {
        EGLConfig eGLConfig = (EGLConfig) this.d0;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = bp2.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.Y, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        bp2.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.e0 = eglCreatePbufferSurface;
        } else {
            i.m("surface was null");
        }
    }

    public int f(int i) {
        int i2;
        o94 o94Var = (o94) this.L;
        int i3 = o94Var.b;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int i6 = o94Var.a[i2];
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
        e41.q("");
        return 0;
    }

    public float g(int i, boolean z, int i2) {
        hr1 hr1Var;
        float f;
        o94 o94Var = (o94) this.L;
        if (i >= o94Var.b - 1) {
            f = i2;
        } else {
            int c = o94Var.c(i);
            int c2 = o94Var.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                nl7 nl7Var = (nl7) ((p94) this.R).b(c);
                if (nl7Var == null || (hr1Var = nl7Var.b) == null) {
                    hr1Var = (hr1) this.X;
                }
                float f2 = i3;
                float b = hr1Var.b((i2 - c) / f2);
                if (z) {
                    return b;
                }
                return ((f2 * b) + c) / 1000.0f;
            }
        }
        return f / 1000.0f;
    }

    @Override // defpackage.il7
    public ap h(long j, ap apVar, ap apVar2, ap apVar3) {
        long j2;
        long j3 = j / 1000000;
        int[] iArr = jl7.a;
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
            return apVar3;
        }
        k(apVar, apVar2, apVar3);
        ap apVar4 = (ap) this.d0;
        apVar4.getClass();
        int i = 0;
        if (((os0) this.i0) != jl7.c) {
            int i2 = (int) j2;
            float g = g(f(i2), false, i2);
            float[] fArr = (float[]) this.h0;
            xt[][] xtVarArr = (xt[][]) ((os0) this.i0).B;
            float f = xtVarArr[0][0].a;
            float f2 = xtVarArr[xtVarArr.length - 1][0].b;
            if (g < f) {
                g = f;
            }
            if (g <= f2) {
                f2 = g;
            }
            int length = fArr.length;
            boolean z = false;
            for (xt[] xtVarArr2 : xtVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    xt xtVar = xtVarArr2[i4];
                    if (f2 <= xtVar.b) {
                        if (xtVar.p) {
                            fArr[i3] = xtVar.q;
                            fArr[i3 + 1] = xtVar.r;
                        } else {
                            xtVar.c(f2);
                            fArr[i3] = xtVar.a();
                            fArr[i3 + 1] = xtVar.b();
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
                apVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            ap q = q((j2 - 1) * 1000000, apVar, apVar2, apVar3);
            ap q2 = q(j2 * 1000000, apVar, apVar2, apVar3);
            int b = q.b();
            while (i < b) {
                apVar4.e(i, (q.a(i) - q2.a(i)) * 1000.0f);
                i++;
            }
        }
        return apVar4;
    }

    public wr4 i(yq1 yq1Var) {
        bp2.d((AtomicBoolean) this.L, false);
        try {
            c(yq1Var, null);
            e();
            l((EGLSurface) this.e0);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.Y, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new wr4(glGetString, eglQueryString);
        } catch (IllegalStateException e) {
            kj2.g0("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new wr4("", "");
        } finally {
            n();
        }
    }

    public jy j(yq1 yq1Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.L;
        bp2.d(atomicBoolean, false);
        eb ebVar = new eb(2);
        ebVar.B = "0.0";
        ebVar.L = "0.0";
        String str = "";
        ebVar.R = "";
        ebVar.X = "";
        try {
            if (yq1Var.a()) {
                wr4 i = i(yq1Var);
                String str2 = (String) i.a;
                str2.getClass();
                String str3 = (String) i.b;
                str3.getClass();
                if (!str2.contains("GL_EXT_YUV_target")) {
                    kj2.f0("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    yq1Var = yq1.d;
                }
                this.B = bp2.f(str3, yq1Var);
                ebVar.R = str2;
                ebVar.X = str3;
            }
            c(yq1Var, ebVar);
            e();
            l((EGLSurface) this.e0);
            ebVar.B = bp2.j();
            this.g0 = bp2.g(yq1Var);
            int h = bp2.h();
            this.A = h;
            u(h);
            this.X = Thread.currentThread();
            atomicBoolean.set(true);
            if (((String) ebVar.R) == null) {
                str = "".concat(" glExtensions");
            }
            if (((String) ebVar.X) == null) {
                str = str.concat(" eglExtensions");
            }
            if (str.isEmpty()) {
                return new jy((String) ebVar.B, (String) ebVar.L, (String) ebVar.R, (String) ebVar.X);
            }
            i.m("Missing required properties:".concat(str));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            n();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            n();
            throw e;
        }
    }

    public void k(ap apVar, ap apVar2, ap apVar3) {
        boolean z;
        float[] fArr;
        p94 p94Var = (p94) this.R;
        o94 o94Var = (o94) this.L;
        if (((os0) this.i0) != jl7.c) {
            z = true;
        } else {
            z = false;
        }
        if (((ap) this.Z) == null) {
            this.Z = apVar.c();
            this.d0 = apVar3.c();
            int i = o94Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = o94Var.c(i2) / 1000.0f;
            }
            this.Y = fArr2;
            int i3 = o94Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                nl7 nl7Var = (nl7) p94Var.b(o94Var.c(i4));
                iArr[i4] = 0;
            }
            this.B = iArr;
        }
        if (z) {
            if (((os0) this.i0) != jl7.c && nb3.k((ap) this.e0, apVar) && nb3.k((ap) this.f0, apVar2)) {
                return;
            }
            this.e0 = apVar;
            this.f0 = apVar2;
            int b = apVar.b() + (apVar.b() % 2);
            this.g0 = new float[b];
            this.h0 = new float[b];
            int i5 = o94Var.b;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = o94Var.c(i6);
                nl7 nl7Var2 = (nl7) p94Var.b(c);
                if (c == 0 && nl7Var2 == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = apVar.a(i7);
                    }
                } else if (c == this.A && nl7Var2 == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = apVar2.a(i8);
                    }
                } else {
                    nl7Var2.getClass();
                    ap apVar4 = nl7Var2.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = apVar4.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.i0 = new os0(this.B, (float[]) this.Y, fArr3);
        }
    }

    public void l(EGLSurface eGLSurface) {
        ((EGLDisplay) this.Y).getClass();
        ((EGLContext) this.Z).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.Y, eGLSurface, eGLSurface, (EGLContext) this.Z)) {
            return;
        }
        i.m("eglMakeCurrent failed");
    }

    public void m(Surface surface) {
        bp2.d((AtomicBoolean) this.L, true);
        bp2.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, bp2.j);
        }
    }

    public void n() {
        HashMap hashMap = (HashMap) this.R;
        for (zo2 zo2Var : ((Map) this.g0).values()) {
            GLES20.glDeleteProgram(zo2Var.a);
        }
        this.g0 = Collections.EMPTY_MAP;
        this.h0 = null;
        if (!Objects.equals((EGLDisplay) this.Y, EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay) this.Y, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (sy syVar : hashMap.values()) {
                if (!Objects.equals(syVar.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.Y, syVar.a)) {
                    try {
                        bp2.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        kj2.w("GLUtils", e.toString(), e);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.e0, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.Y, (EGLSurface) this.e0);
                this.e0 = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.Z, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.Y, (EGLContext) this.Z);
                this.Z = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.Y);
            this.Y = EGL14.EGL_NO_DISPLAY;
        }
        this.d0 = null;
        this.A = -1;
        this.i0 = yo2.UNKNOWN;
        this.f0 = null;
        this.X = null;
    }

    @Override // defpackage.kl7
    public int o() {
        return 0;
    }

    @Override // defpackage.kl7
    public int p() {
        return this.A;
    }

    @Override // defpackage.il7
    public ap q(long j, ap apVar, ap apVar2, ap apVar3) {
        ap apVar4;
        ap apVar5;
        xt[][] xtVarArr;
        ap apVar6 = apVar;
        ap apVar7 = apVar2;
        o94 o94Var = (o94) this.L;
        long j2 = j / 1000000;
        int[] iArr = jl7.a;
        int i = this.A;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        p94 p94Var = (p94) this.R;
        nl7 nl7Var = (nl7) p94Var.b(i2);
        if (nl7Var != null) {
            return nl7Var.a;
        }
        if (i2 >= i) {
            return apVar7;
        }
        if (i2 <= 0) {
            return apVar6;
        }
        k(apVar6, apVar7, apVar3);
        ap apVar8 = (ap) this.Z;
        apVar8.getClass();
        int i3 = 0;
        if (((os0) this.i0) != jl7.c) {
            float g = g(f(i2), false, i2);
            float[] fArr = (float[]) this.g0;
            xt[][] xtVarArr2 = (xt[][]) ((os0) this.i0).B;
            int length = xtVarArr2.length - 1;
            float f = xtVarArr2[0][0].a;
            float f2 = xtVarArr2[length][0].b;
            int length2 = fArr.length;
            if (g >= f && g <= f2) {
                int length3 = xtVarArr2.length;
                int i4 = 0;
                boolean z = false;
                while (i4 < length3) {
                    int i5 = i3;
                    int i6 = i5;
                    while (i5 < length2 - 1) {
                        xt xtVar = xtVarArr2[i4][i6];
                        if (g <= xtVar.b) {
                            if (xtVar.p) {
                                float f3 = xtVar.a;
                                float f4 = xtVar.k;
                                float f5 = xtVar.c;
                                fArr[i5] = i61.a(xtVar.e, f5, (g - f3) * f4, f5);
                                float f6 = xtVar.d;
                                fArr[i5 + 1] = i61.a(xtVar.f, f6, (g - f3) * f4, f6);
                            } else {
                                xtVar.c(g);
                                fArr[i5] = (xtVar.n * xtVar.h) + xtVar.q;
                                fArr[i5 + 1] = (xtVar.o * xtVar.i) + xtVar.r;
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
                    xt xtVar2 = xtVarArr2[length][i8];
                    boolean z2 = xtVar2.p;
                    float f8 = xtVar2.r;
                    float f9 = xtVar2.q;
                    if (z2) {
                        float f10 = xtVar2.a;
                        float f11 = xtVar2.k;
                        float f12 = xtVar2.c;
                        xtVarArr = xtVarArr2;
                        fArr[i7] = (f9 * f7) + i61.a(xtVar2.e, f12, (f - f10) * f11, f12);
                        float f13 = xtVar2.d;
                        fArr[i7 + 1] = (f8 * f7) + i61.a(xtVar2.f, f13, (f - f10) * f11, f13);
                    } else {
                        xtVarArr = xtVarArr2;
                        xtVar2.c(f);
                        fArr[i7] = (xtVar2.a() * f7) + (xtVar2.n * xtVar2.h) + f9;
                        fArr[i7 + 1] = (xtVar2.b() * f7) + (xtVar2.o * xtVar2.i) + f8;
                    }
                    i7 += 2;
                    i8++;
                    xtVarArr2 = xtVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                apVar8.e(i9, fArr[i9]);
            }
        } else {
            int f14 = f(i2);
            float g2 = g(f14, true, i2);
            nl7 nl7Var2 = (nl7) p94Var.b(o94Var.c(f14));
            if (nl7Var2 != null && (apVar5 = nl7Var2.a) != null) {
                apVar6 = apVar5;
            }
            nl7 nl7Var3 = (nl7) p94Var.b(o94Var.c(f14 + 1));
            if (nl7Var3 != null && (apVar4 = nl7Var3.a) != null) {
                apVar7 = apVar4;
            }
            int b = apVar8.b();
            for (int i10 = 0; i10 < b; i10++) {
                apVar8.e(i10, (apVar7.a(i10) * g2) + ((1.0f - g2) * apVar6.a(i10)));
            }
        }
        return apVar8;
    }

    public void s(Surface surface, boolean z) {
        sy syVar;
        if (((Surface) this.f0) == surface) {
            this.f0 = null;
            l((EGLSurface) this.e0);
        }
        HashMap hashMap = (HashMap) this.R;
        if (z) {
            syVar = (sy) hashMap.remove(surface);
        } else {
            syVar = (sy) hashMap.put(surface, bp2.j);
        }
        if (syVar != null && syVar != bp2.j) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.Y, syVar.a);
            } catch (RuntimeException e) {
                kj2.g0("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
            }
        }
    }

    public void t(long j, float[] fArr, Surface surface) {
        bp2.d((AtomicBoolean) this.L, true);
        bp2.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        np2.A("The surface is not registered.", hashMap.containsKey(surface));
        sy syVar = (sy) hashMap.get(surface);
        Objects.requireNonNull(syVar);
        if (syVar == bp2.j) {
            syVar = d(surface);
            if (syVar != null) {
                hashMap.put(surface, syVar);
            } else {
                return;
            }
        }
        int i = syVar.c;
        int i2 = syVar.b;
        EGLSurface eGLSurface = syVar.a;
        if (surface != ((Surface) this.f0)) {
            l(eGLSurface);
            this.f0 = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        zo2 zo2Var = (zo2) this.h0;
        zo2Var.getClass();
        if (zo2Var instanceof ap2) {
            GLES20.glUniformMatrix4fv(((ap2) zo2Var).f, 1, false, fArr, 0);
            bp2.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        bp2.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.Y, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.Y, eGLSurface)) {
            kj2.f0("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            s(surface, false);
        }
    }

    public void u(int i) {
        zo2 zo2Var = (zo2) ((Map) this.g0).get((yo2) this.i0);
        if (zo2Var != null) {
            if (((zo2) this.h0) != zo2Var) {
                this.h0 = zo2Var;
                zo2Var.b();
                Log.d("OpenGlRenderer", "Using program for input format " + ((yo2) this.i0) + ": " + ((zo2) this.h0));
            }
            GLES20.glActiveTexture(33984);
            bp2.b("glActiveTexture");
            GLES20.glBindTexture(36197, i);
            bp2.b("glBindTexture");
            return;
        }
        e41.z((yo2) this.i0, "Unable to configure program for input format: ");
    }

    public qm4(o94 o94Var, p94 p94Var, int i, hr1 hr1Var) {
        this.L = o94Var;
        this.R = p94Var;
        this.A = i;
        this.X = hr1Var;
        this.B = jl7.a;
        float[] fArr = jl7.b;
        this.Y = fArr;
        this.g0 = fArr;
        this.h0 = fArr;
        this.i0 = jl7.c;
    }
}
