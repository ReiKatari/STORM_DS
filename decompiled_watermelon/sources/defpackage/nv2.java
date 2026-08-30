package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nv2  reason: default package */
/* loaded from: classes.dex */
public final class nv2 extends f47 {
    public static final lv2 z = new Object();
    public final Object q;
    public pv2 r;
    public Executor s;
    public a31 t;
    public Rect u;
    public Matrix v;
    public x06 w;
    public kx2 x;
    public y06 y;

    public nv2(rv2 rv2Var) {
        super(rv2Var);
        this.q = new Object();
    }

    @Override // defpackage.f47
    public final void A() {
        nk2.s();
        y06 y06Var = this.y;
        if (y06Var != null) {
            y06Var.b();
            this.y = null;
        }
        kx2 kx2Var = this.x;
        if (kx2Var != null) {
            kx2Var.a();
            this.x = null;
        }
        synchronized (this.q) {
            pv2 pv2Var = this.r;
            pv2Var.p0 = false;
            pv2Var.d();
            this.r = null;
        }
    }

    @Override // defpackage.f47
    public final void B(Matrix matrix) {
        super.B(matrix);
        synchronized (this.q) {
            try {
                pv2 pv2Var = this.r;
                if (pv2Var != null) {
                    pv2Var.i(matrix);
                }
                this.v = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f47
    public final void C(Rect rect) {
        this.k = rect;
        synchronized (this.q) {
            try {
                pv2 pv2Var = this.r;
                if (pv2Var != null) {
                    pv2Var.j(rect);
                }
                this.u = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
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
    public final defpackage.x06 G(defpackage.rv2 r18, defpackage.jx r19) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nv2.G(rv2, jx):x06");
    }

    public final int H() {
        return ((Integer) ((rv2) this.h).d(rv2.X, 1)).intValue();
    }

    public final void I() {
        boolean z2;
        a31 a31Var;
        synchronized (this.q) {
            try {
                rv2 rv2Var = (rv2) this.h;
                if (((Integer) rv2Var.d(rv2.B, 0)).intValue() == 1) {
                    this.r = new pv2();
                } else {
                    this.r = new uv2((Executor) rv2Var.d(rs6.D, iq2.r()));
                }
                this.r.R = H();
                this.r.X = ((Boolean) ((rv2) this.h).d(rv2.Z, Boolean.FALSE)).booleanValue();
                vd0 d = d();
                Boolean bool = (Boolean) ((rv2) this.h).d(rv2.Y, null);
                if (d != null) {
                    z2 = d.l().l().a(OnePixelShiftQuirk.class);
                } else {
                    z2 = false;
                }
                pv2 pv2Var = this.r;
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                pv2Var.Y = z2;
                if (d != null) {
                    this.r.B = i(d, false);
                }
                Rect rect = this.u;
                if (rect != null) {
                    this.r.j(rect);
                }
                Matrix matrix = this.v;
                if (matrix != null) {
                    this.r.i(matrix);
                }
                Executor executor = this.s;
                if (executor != null && (a31Var = this.t) != null) {
                    pv2 pv2Var2 = this.r;
                    synchronized (pv2Var2.o0) {
                        pv2Var2.A = a31Var;
                        pv2Var2.Z = executor;
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.f47
    public final b57 g(boolean z2, e57 e57Var) {
        z.getClass();
        rv2 rv2Var = lv2.a;
        cw0 a = e57Var.a(rv2Var.n(), 1);
        if (z2) {
            a = cw0.J(a, rv2Var);
        }
        if (a == null) {
            return null;
        }
        return new rv2(ef4.b(((bb0) m(a)).B));
    }

    @Override // defpackage.f47
    public final a57 m(cw0 cw0Var) {
        return new bb0(x14.j(cw0Var), 3);
    }

    public final String toString() {
        return "ImageAnalysis:".concat(h());
    }

    @Override // defpackage.f47
    public final b57 v(td0 td0Var, a57 a57Var) {
        synchronized (this.q) {
        }
        return a57Var.d();
    }

    @Override // defpackage.f47
    public final jx y(cw0 cw0Var) {
        this.w.a(cw0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.w.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        cw6 b = this.i.b();
        b.f = cw0Var;
        return b.a();
    }

    @Override // defpackage.f47
    public final jx z(jx jxVar, jx jxVar2) {
        ve2.v("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + jxVar + ", secondaryStreamSpec " + jxVar2);
        f();
        x06 G = G((rv2) this.h, jxVar);
        this.w = G;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{G.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return jxVar;
    }
}
