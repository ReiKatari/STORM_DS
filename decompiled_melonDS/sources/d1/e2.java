package d1;

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
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e2 implements a2 {
    public int[] A;
    public int B;
    public final Object L;
    public final Object R;
    public Object X;
    public Object Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f3560b0;

    /* renamed from: c0  reason: collision with root package name */
    public Object f3561c0;

    /* renamed from: d0  reason: collision with root package name */
    public Object f3562d0;

    /* renamed from: e0  reason: collision with root package name */
    public Object f3563e0;

    /* renamed from: f0  reason: collision with root package name */
    public Object f3564f0;

    /* renamed from: g0  reason: collision with root package name */
    public Object f3565g0;

    public e2() {
        this.L = new AtomicBoolean(false);
        this.R = new HashMap();
        this.Y = EGL14.EGL_NO_DISPLAY;
        this.Z = EGL14.EGL_NO_CONTEXT;
        this.A = t0.i.f13063a;
        this.f3561c0 = EGL14.EGL_NO_SURFACE;
        this.f3563e0 = Collections.EMPTY_MAP;
        this.f3564f0 = null;
        this.f3565g0 = t0.f.UNKNOWN;
        this.B = -1;
    }

    @Override // d1.a2
    public int A() {
        return 0;
    }

    @Override // d1.y1
    public p F(long j2, p pVar, p pVar2, p pVar3) {
        p pVar4;
        p pVar5;
        float f8;
        q[][] qVarArr;
        boolean z10;
        p pVar6 = pVar;
        p pVar7 = pVar2;
        a1.w wVar = (a1.w) this.L;
        int[] iArr = z1.f3715a;
        int i2 = 0;
        long j10 = (j2 / 1000000) - 0;
        int i10 = this.B;
        long j11 = i10;
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 <= j11) {
            j11 = j10;
        }
        int i11 = (int) j11;
        a1.x xVar = (a1.x) this.R;
        d2 d2Var = (d2) xVar.b(i11);
        if (d2Var != null) {
            return d2Var.f3553a;
        }
        if (i11 >= i10) {
            return pVar7;
        }
        if (i11 <= 0) {
            return pVar6;
        }
        j(pVar6, pVar7, pVar3);
        p pVar8 = (p) this.f3561c0;
        pVar8.getClass();
        boolean z11 = true;
        if (((a0.b) this.f3565g0) != z1.f3717c) {
            float g10 = g(f(i11), false, i11);
            float[] fArr = (float[]) this.Z;
            q[][] qVarArr2 = (q[][]) ((a0.b) this.f3565g0).B;
            int length = qVarArr2.length - 1;
            float f10 = qVarArr2[0][0].f3624a;
            float f11 = qVarArr2[length][0].f3625b;
            int length2 = fArr.length;
            if (g10 >= f10 && g10 <= f11) {
                int length3 = qVarArr2.length;
                int i12 = 0;
                boolean z12 = false;
                while (i12 < length3) {
                    int i13 = i2;
                    int i14 = i13;
                    while (i13 < length2 - 1) {
                        q qVar = qVarArr2[i12][i14];
                        if (g10 <= qVar.f3625b) {
                            if (qVar.f3638p) {
                                float f12 = qVar.f3624a;
                                float f13 = qVar.f3634k;
                                float f14 = qVar.f3626c;
                                z10 = z11;
                                fArr[i13] = w.d.a(qVar.f3628e, f14, (g10 - f12) * f13, f14);
                                float f15 = qVar.f3627d;
                                fArr[i13 + 1] = w.d.a(qVar.f3629f, f15, (g10 - f12) * f13, f15);
                            } else {
                                z10 = z11;
                                qVar.c(g10);
                                fArr[i13] = (qVar.f3636n * qVar.f3631h) + qVar.f3639q;
                                fArr[i13 + 1] = (qVar.f3637o * qVar.f3632i) + qVar.f3640r;
                            }
                            z12 = z10;
                        } else {
                            z10 = z11;
                        }
                        i13 += 2;
                        i14++;
                        z11 = z10;
                    }
                    boolean z13 = z11;
                    if (z12) {
                        break;
                    }
                    i12++;
                    z11 = z13;
                    i2 = 0;
                }
            } else {
                if (g10 > f11) {
                    f10 = f11;
                } else {
                    length = 0;
                }
                float f16 = g10 - f10;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length2 - 1) {
                    q qVar2 = qVarArr2[length][i16];
                    boolean z14 = qVar2.f3638p;
                    float f17 = qVar2.f3640r;
                    float f18 = qVar2.f3639q;
                    if (z14) {
                        float f19 = qVar2.f3624a;
                        float f20 = qVar2.f3634k;
                        f8 = f16;
                        float f21 = qVar2.f3626c;
                        qVarArr = qVarArr2;
                        fArr[i15] = (f8 * f18) + w.d.a(qVar2.f3628e, f21, (f10 - f19) * f20, f21);
                        float f22 = qVar2.f3627d;
                        fArr[i15 + 1] = (f8 * f17) + w.d.a(qVar2.f3629f, f22, (f10 - f19) * f20, f22);
                    } else {
                        f8 = f16;
                        qVarArr = qVarArr2;
                        qVar2.c(f10);
                        fArr[i15] = (qVar2.a() * f8) + (qVar2.f3636n * qVar2.f3631h) + f18;
                        fArr[i15 + 1] = (qVar2.b() * f8) + (qVar2.f3637o * qVar2.f3632i) + f17;
                    }
                    i15 += 2;
                    i16++;
                    f16 = f8;
                    qVarArr2 = qVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i17 = 0; i17 < length4; i17++) {
                pVar8.e(i17, fArr[i17]);
            }
        } else {
            int f23 = f(i11);
            float g11 = g(f23, true, i11);
            d2 d2Var2 = (d2) xVar.b(wVar.c(f23));
            if (d2Var2 != null && (pVar5 = d2Var2.f3553a) != null) {
                pVar6 = pVar5;
            }
            d2 d2Var3 = (d2) xVar.b(wVar.c(f23 + 1));
            if (d2Var3 != null && (pVar4 = d2Var3.f3553a) != null) {
                pVar7 = pVar4;
            }
            int b10 = pVar8.b();
            for (int i18 = 0; i18 < b10; i18++) {
                pVar8.e(i18, (pVar7.a(i18) * g11) + ((1 - g11) * pVar6.a(i18)));
            }
        }
        return pVar8;
    }

    @Override // d1.a2
    public int J() {
        return this.B;
    }

    @Override // d1.y1
    public p L(long j2, p pVar, p pVar2, p pVar3) {
        long j10;
        int[] iArr = z1.f3715a;
        int i2 = 0;
        long j11 = (j2 / 1000000) - 0;
        long j12 = this.B;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 > j12) {
            j10 = j12;
        } else {
            j10 = j11;
        }
        if (j10 < 0) {
            return pVar3;
        }
        j(pVar, pVar2, pVar3);
        p pVar4 = (p) this.f3562d0;
        pVar4.getClass();
        if (((a0.b) this.f3565g0) != z1.f3717c) {
            int i10 = (int) j10;
            float g10 = g(f(i10), false, i10);
            float[] fArr = (float[]) this.f3560b0;
            q[][] qVarArr = (q[][]) ((a0.b) this.f3565g0).B;
            float f8 = qVarArr[0][0].f3624a;
            float f10 = qVarArr[qVarArr.length - 1][0].f3625b;
            if (g10 < f8) {
                g10 = f8;
            }
            if (g10 <= f10) {
                f10 = g10;
            }
            int length = fArr.length;
            boolean z10 = false;
            for (q[] qVarArr2 : qVarArr) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < length - 1) {
                    q qVar = qVarArr2[i12];
                    if (f10 <= qVar.f3625b) {
                        if (qVar.f3638p) {
                            fArr[i11] = qVar.f3639q;
                            fArr[i11 + 1] = qVar.f3640r;
                        } else {
                            qVar.c(f10);
                            fArr[i11] = qVar.a();
                            fArr[i11 + 1] = qVar.b();
                        }
                        z10 = true;
                    }
                    i11 += 2;
                    i12++;
                }
                if (z10) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i2 < length2) {
                pVar4.e(i2, fArr[i2]);
                i2++;
            }
        } else {
            p F = F((j10 - 1) * 1000000, pVar, pVar2, pVar3);
            p F2 = F(j10 * 1000000, pVar, pVar2, pVar3);
            int b10 = F.b();
            while (i2 < b10) {
                pVar4.e(i2, (F.a(i2) - F2.a(i2)) * 1000.0f);
                i2++;
            }
        }
        return pVar4;
    }

    public void b(d0.a0 a0Var, b9.e eVar) {
        int i2;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.Y = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i13 = 2;
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize((EGLDisplay) this.Y, iArr2, 0, iArr2, 1)) {
                if (eVar != null) {
                    eVar.L = iArr2[0] + "." + iArr2[1];
                }
                if (a0Var.a()) {
                    i2 = 10;
                } else {
                    i2 = 8;
                }
                if (a0Var.a()) {
                    i10 = 2;
                } else {
                    i10 = 8;
                }
                if (a0Var.a()) {
                    i11 = 64;
                } else {
                    i11 = 4;
                }
                int i14 = i11;
                if (a0Var.a()) {
                    i12 = -1;
                } else {
                    i12 = 1;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.Y, new int[]{12324, i2, 12323, i2, 12322, i2, 12321, i10, 12325, 0, 12326, 0, 12352, i14, 12610, i12, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (a0Var.a()) {
                        i13 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.Y, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i13, 12344}, 0);
                    t0.i.a("eglCreateContext");
                    this.f3560b0 = eGLConfig;
                    this.Z = eglCreateContext;
                    EGL14.eglQueryContext((EGLDisplay) this.Y, eglCreateContext, 12440, new int[1], 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr[0]);
                    return;
                }
                a0.j.p("Unable to find a suitable EGLConfig");
                return;
            }
            this.Y = EGL14.EGL_NO_DISPLAY;
            a0.j.p("Unable to initialize EGL14");
            return;
        }
        a0.j.p("Unable to get EGL14 display");
    }

    public t0.c d(Surface surface) {
        try {
            EGLConfig eGLConfig = (EGLConfig) this.f3560b0;
            Objects.requireNonNull(eGLConfig);
            EGLSurface i2 = t0.i.i((EGLDisplay) this.Y, eGLConfig, surface, this.A);
            EGLDisplay eGLDisplay = (EGLDisplay) this.Y;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, i2, 12375, iArr, 0);
            int i10 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, i2, 12374, iArr2, 0);
            Size size = new Size(i10, iArr2[0]);
            return new t0.c(i2, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e6) {
            aj.g.z0("OpenGlRenderer", "Failed to create EGL surface: " + e6.getMessage(), e6);
            return null;
        }
    }

    public void e() {
        EGLConfig eGLConfig = (EGLConfig) this.f3560b0;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = t0.i.f13063a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.Y, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        t0.i.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.f3561c0 = eglCreatePbufferSurface;
        } else {
            a0.j.p("surface was null");
        }
    }

    public int f(int i2) {
        int i10;
        a1.w wVar = (a1.w) this.L;
        int i11 = wVar.f112b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            int i13 = 0;
            while (true) {
                if (i13 <= i12) {
                    i10 = (i13 + i12) >>> 1;
                    int i14 = wVar.f111a[i10];
                    if (i14 < i2) {
                        i13 = i10 + 1;
                    } else if (i14 <= i2) {
                        break;
                    } else {
                        i12 = i10 - 1;
                    }
                } else {
                    i10 = -(i13 + 1);
                    break;
                }
            }
            if (i10 < -1) {
                return -(i10 + 2);
            }
            return i10;
        }
        wa.b.f("");
        return 0;
    }

    public float g(int i2, boolean z10, int i10) {
        v vVar;
        float f8;
        a1.w wVar = (a1.w) this.L;
        if (i2 >= wVar.f112b - 1) {
            f8 = i10;
        } else {
            int c4 = wVar.c(i2);
            int c10 = wVar.c(i2 + 1);
            if (i10 == c4) {
                f8 = c4;
            } else {
                int i11 = c10 - c4;
                d2 d2Var = (d2) ((a1.x) this.R).b(c4);
                if (d2Var == null || (vVar = d2Var.f3554b) == null) {
                    vVar = (v) this.X;
                }
                float f10 = i11;
                float a10 = vVar.a((i10 - c4) / f10);
                if (z10) {
                    return a10;
                }
                f8 = (f10 * a10) + c4;
            }
        }
        return f8 / ((float) 1000);
    }

    public z5.b h(d0.a0 a0Var) {
        t0.i.d((AtomicBoolean) this.L, false);
        try {
            b(a0Var, null);
            e();
            k((EGLSurface) this.f3561c0);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.Y, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new z5.b(glGetString, eglQueryString);
        } catch (IllegalStateException e6) {
            aj.g.z0("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e6.getMessage(), e6);
            return new z5.b("", "");
        } finally {
            m();
        }
    }

    public t0.a i(d0.a0 a0Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.L;
        t0.i.d(atomicBoolean, false);
        b9.e eVar = new b9.e(22);
        eVar.B = "0.0";
        eVar.L = "0.0";
        eVar.R = "";
        eVar.X = "";
        try {
            if (a0Var.a()) {
                z5.b h2 = h(a0Var);
                String str = (String) h2.f14961a;
                String str2 = (String) h2.f14962b;
                if (!str.contains("GL_EXT_YUV_target")) {
                    aj.g.y0("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    a0Var = d0.a0.f3320d;
                }
                this.A = t0.i.f(str2, a0Var);
                eVar.R = str;
                eVar.X = str2;
            }
            b(a0Var, eVar);
            e();
            k((EGLSurface) this.f3561c0);
            eVar.B = t0.i.j();
            this.f3563e0 = t0.i.g(a0Var);
            int h10 = t0.i.h();
            this.B = h10;
            p(h10);
            this.X = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new t0.a((String) eVar.B, (String) eVar.L, (String) eVar.R, (String) eVar.X);
            }
            a0.j.p("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException e6) {
            e = e6;
            m();
            throw e;
        } catch (IllegalStateException e10) {
            e = e10;
            m();
            throw e;
        }
    }

    public void j(p pVar, p pVar2, p pVar3) {
        boolean z10;
        float[] fArr;
        a1.x xVar = (a1.x) this.R;
        a1.w wVar = (a1.w) this.L;
        if (((a0.b) this.f3565g0) != z1.f3717c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((p) this.f3561c0) == null) {
            this.f3561c0 = pVar.c();
            this.f3562d0 = pVar3.c();
            int i2 = wVar.f112b;
            float[] fArr2 = new float[i2];
            for (int i10 = 0; i10 < i2; i10++) {
                fArr2[i10] = wVar.c(i10) / ((float) 1000);
            }
            this.Y = fArr2;
            int i11 = wVar.f112b;
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                d2 d2Var = (d2) xVar.b(wVar.c(i12));
                iArr[i12] = 0;
            }
            this.A = iArr;
        }
        if (z10) {
            if (((a0.b) this.f3565g0) != z1.f3717c && nc.k.a((p) this.f3563e0, pVar) && nc.k.a((p) this.f3564f0, pVar2)) {
                return;
            }
            this.f3563e0 = pVar;
            this.f3564f0 = pVar2;
            int b10 = pVar.b() + (pVar.b() % 2);
            this.Z = new float[b10];
            this.f3560b0 = new float[b10];
            int i13 = wVar.f112b;
            float[][] fArr3 = new float[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                int c4 = wVar.c(i14);
                d2 d2Var2 = (d2) xVar.b(c4);
                if (c4 == 0 && d2Var2 == null) {
                    fArr = new float[b10];
                    for (int i15 = 0; i15 < b10; i15++) {
                        fArr[i15] = pVar.a(i15);
                    }
                } else if (c4 == this.B && d2Var2 == null) {
                    fArr = new float[b10];
                    for (int i16 = 0; i16 < b10; i16++) {
                        fArr[i16] = pVar2.a(i16);
                    }
                } else {
                    d2Var2.getClass();
                    p pVar4 = d2Var2.f3553a;
                    float[] fArr4 = new float[b10];
                    for (int i17 = 0; i17 < b10; i17++) {
                        fArr4[i17] = pVar4.a(i17);
                    }
                    fArr = fArr4;
                }
                fArr3[i14] = fArr;
            }
            this.f3565g0 = new a0.b(this.A, (float[]) this.Y, fArr3);
        }
    }

    public void k(EGLSurface eGLSurface) {
        ((EGLDisplay) this.Y).getClass();
        ((EGLContext) this.Z).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.Y, eGLSurface, eGLSurface, (EGLContext) this.Z)) {
            return;
        }
        a0.j.p("eglMakeCurrent failed");
    }

    public void l(Surface surface) {
        t0.i.d((AtomicBoolean) this.L, true);
        t0.i.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, t0.i.f13072j);
        }
    }

    public void m() {
        HashMap hashMap = (HashMap) this.R;
        for (t0.g gVar : ((Map) this.f3563e0).values()) {
            GLES20.glDeleteProgram(gVar.f13056a);
        }
        this.f3563e0 = Collections.EMPTY_MAP;
        this.f3564f0 = null;
        if (!Objects.equals((EGLDisplay) this.Y, EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay) this.Y, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (t0.c cVar : hashMap.values()) {
                if (!Objects.equals(cVar.f13052a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.Y, cVar.f13052a)) {
                    try {
                        t0.i.a("eglDestroySurface");
                    } catch (IllegalStateException e6) {
                        aj.g.t("GLUtils", e6.toString(), e6);
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.f3561c0, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.Y, (EGLSurface) this.f3561c0);
                this.f3561c0 = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.Z, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.Y, (EGLContext) this.Z);
                this.Z = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.Y);
            this.Y = EGL14.EGL_NO_DISPLAY;
        }
        this.f3560b0 = null;
        this.B = -1;
        this.f3565g0 = t0.f.UNKNOWN;
        this.f3562d0 = null;
        this.X = null;
    }

    public void n(Surface surface, boolean z10) {
        t0.c cVar;
        if (((Surface) this.f3562d0) == surface) {
            this.f3562d0 = null;
            k((EGLSurface) this.f3561c0);
        }
        HashMap hashMap = (HashMap) this.R;
        if (z10) {
            cVar = (t0.c) hashMap.remove(surface);
        } else {
            cVar = (t0.c) hashMap.put(surface, t0.i.f13072j);
        }
        if (cVar != null && cVar != t0.i.f13072j) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.Y, cVar.f13052a);
            } catch (RuntimeException e6) {
                aj.g.z0("OpenGlRenderer", "Failed to destroy EGL surface: " + e6.getMessage(), e6);
            }
        }
    }

    public void o(long j2, float[] fArr, Surface surface) {
        t0.i.d((AtomicBoolean) this.L, true);
        t0.i.c((Thread) this.X);
        HashMap hashMap = (HashMap) this.R;
        p7.m.o("The surface is not registered.", hashMap.containsKey(surface));
        t0.c cVar = (t0.c) hashMap.get(surface);
        Objects.requireNonNull(cVar);
        if (cVar == t0.i.f13072j) {
            cVar = d(surface);
            if (cVar != null) {
                hashMap.put(surface, cVar);
            } else {
                return;
            }
        }
        int i2 = cVar.f13054c;
        int i10 = cVar.f13053b;
        EGLSurface eGLSurface = cVar.f13052a;
        if (surface != ((Surface) this.f3562d0)) {
            k(eGLSurface);
            this.f3562d0 = surface;
            GLES20.glViewport(0, 0, i10, i2);
            GLES20.glScissor(0, 0, i10, i2);
        }
        t0.g gVar = (t0.g) this.f3564f0;
        gVar.getClass();
        if (gVar instanceof t0.h) {
            GLES20.glUniformMatrix4fv(((t0.h) gVar).f13061f, 1, false, fArr, 0);
            t0.i.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        t0.i.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.Y, eGLSurface, j2);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.Y, eGLSurface)) {
            aj.g.y0("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            n(surface, false);
        }
    }

    public void p(int i2) {
        t0.g gVar = (t0.g) ((Map) this.f3563e0).get((t0.f) this.f3565g0);
        if (gVar != null) {
            if (((t0.g) this.f3564f0) != gVar) {
                this.f3564f0 = gVar;
                gVar.b();
                Log.d("OpenGlRenderer", "Using program for input format " + ((t0.f) this.f3565g0) + ": " + ((t0.g) this.f3564f0));
            }
            GLES20.glActiveTexture(33984);
            t0.i.b("glActiveTexture");
            GLES20.glBindTexture(36197, i2);
            t0.i.b("glBindTexture");
            return;
        }
        a0.j.g((t0.f) this.f3565g0, "Unable to configure program for input format: ");
    }

    public e2(a1.w wVar, a1.x xVar, int i2, v vVar) {
        this.L = wVar;
        this.R = xVar;
        this.B = i2;
        this.X = vVar;
        this.A = z1.f3715a;
        float[] fArr = z1.f3716b;
        this.Y = fArr;
        this.Z = fArr;
        this.f3560b0 = fArr;
        this.f3565g0 = z1.f3717c;
    }
}
