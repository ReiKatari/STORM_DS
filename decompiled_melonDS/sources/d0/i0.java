package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import j0.l2;
import j0.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends v1 {

    /* renamed from: y  reason: collision with root package name */
    public static final g0 f3395y = new Object();

    /* renamed from: p  reason: collision with root package name */
    public final Object f3396p;

    /* renamed from: q  reason: collision with root package name */
    public k0 f3397q;

    /* renamed from: r  reason: collision with root package name */
    public Executor f3398r;

    /* renamed from: s  reason: collision with root package name */
    public ah.e f3399s;

    /* renamed from: t  reason: collision with root package name */
    public Rect f3400t;

    /* renamed from: u  reason: collision with root package name */
    public Matrix f3401u;

    /* renamed from: v  reason: collision with root package name */
    public j0.r1 f3402v;

    /* renamed from: w  reason: collision with root package name */
    public p1 f3403w;

    /* renamed from: x  reason: collision with root package name */
    public j0.s1 f3404x;

    public i0(j0.y0 y0Var) {
        super(y0Var);
        this.f3396p = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.r1 C(j0.y0 r18, j0.k r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.i0.C(j0.y0, j0.k):j0.r1");
    }

    public final int D() {
        return ((Integer) ((j0.y0) this.f3474g).h(j0.y0.X, 1)).intValue();
    }

    public final void E() {
        boolean z10;
        ah.e eVar;
        synchronized (this.f3396p) {
            try {
                j0.y0 y0Var = (j0.y0) this.f3474g;
                if (((Integer) y0Var.h(j0.y0.B, 0)).intValue() == 1) {
                    this.f3397q = new k0();
                } else {
                    this.f3397q = new o0((Executor) y0Var.h(n0.l.W, ij.a.k0()));
                }
                this.f3397q.R = D();
                this.f3397q.X = ((Boolean) ((j0.y0) this.f3474g).h(j0.y0.Z, Boolean.FALSE)).booleanValue();
                j0.d0 c4 = c();
                Boolean bool = (Boolean) ((j0.y0) this.f3474g).h(j0.y0.Y, null);
                if (c4 != null) {
                    z10 = c4.k().i().h(OnePixelShiftQuirk.class);
                } else {
                    z10 = false;
                }
                k0 k0Var = this.f3397q;
                if (bool != null) {
                    z10 = bool.booleanValue();
                }
                k0Var.Y = z10;
                if (c4 != null) {
                    this.f3397q.B = h(c4, false);
                }
                Rect rect = this.f3400t;
                if (rect != null) {
                    this.f3397q.j(rect);
                }
                Matrix matrix = this.f3401u;
                if (matrix != null) {
                    this.f3397q.i(matrix);
                }
                Executor executor = this.f3398r;
                if (executor != null && (eVar = this.f3399s) != null) {
                    k0 k0Var2 = this.f3397q;
                    synchronized (k0Var2.f3426n0) {
                        k0Var2.A = eVar;
                        k0Var2.Z = executor;
                    }
                }
            } finally {
            }
        }
    }

    @Override // d0.v1
    public final l2 f(boolean z10, o2 o2Var) {
        f3395y.getClass();
        j0.y0 y0Var = g0.f3381a;
        j0.r0 a10 = o2Var.a(y0Var.r(), 1);
        if (z10) {
            a10 = j0.r0.m(a10, y0Var);
        }
        if (a10 == null) {
            return null;
        }
        return new j0.y0(j0.i1.a(l(a10).f2374b));
    }

    @Override // d0.v1
    public final c0.f l(j0.r0 r0Var) {
        return new c0.f(j0.g1.c(r0Var), 2);
    }

    @Override // d0.v1
    public final l2 s(j0.b0 b0Var, c0.f fVar) {
        synchronized (this.f3396p) {
        }
        return fVar.d();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    @Override // d0.v1
    public final j0.k v(j0.r0 r0Var) {
        this.f3402v.a(r0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.f3402v.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        q3 b10 = this.f3475h.b();
        b10.f11999f = r0Var;
        return b10.c();
    }

    @Override // d0.v1
    public final j0.k w(j0.k kVar, j0.k kVar2) {
        aj.g.o("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + kVar + ", secondaryStreamSpec " + kVar2);
        e();
        j0.r1 C = C((j0.y0) this.f3474g, kVar);
        this.f3402v = C;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{C.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        return kVar;
    }

    @Override // d0.v1
    public final void x() {
        l0.f.e();
        j0.s1 s1Var = this.f3404x;
        if (s1Var != null) {
            s1Var.b();
            this.f3404x = null;
        }
        p1 p1Var = this.f3403w;
        if (p1Var != null) {
            p1Var.a();
            this.f3403w = null;
        }
        synchronized (this.f3396p) {
            k0 k0Var = this.f3397q;
            k0Var.f3427o0 = false;
            k0Var.d();
            this.f3397q = null;
        }
    }

    @Override // d0.v1
    public final void y(Matrix matrix) {
        super.y(matrix);
        synchronized (this.f3396p) {
            try {
                k0 k0Var = this.f3397q;
                if (k0Var != null) {
                    k0Var.i(matrix);
                }
                this.f3401u = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d0.v1
    public final void z(Rect rect) {
        this.f3477j = rect;
        synchronized (this.f3396p) {
            try {
                k0 k0Var = this.f3397q;
                if (k0Var != null) {
                    k0Var.j(rect);
                }
                this.f3400t = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
