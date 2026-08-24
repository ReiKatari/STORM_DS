package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r13  reason: default package */
/* loaded from: classes.dex */
public final class r13 extends di7 {
    public static final p13 z = new Object();
    public final Object q;
    public t13 r;
    public Executor s;
    public h61 t;
    public Rect u;
    public Matrix v;
    public lc6 w;
    public o33 x;
    public mc6 y;

    public r13(v13 v13Var) {
        super(v13Var);
        this.q = new Object();
    }

    @Override // defpackage.di7
    public final void A() {
        nj2.h();
        mc6 mc6Var = this.y;
        if (mc6Var != null) {
            mc6Var.b();
            this.y = null;
        }
        o33 o33Var = this.x;
        if (o33Var != null) {
            o33Var.a();
            this.x = null;
        }
        synchronized (this.q) {
            t13 t13Var = this.r;
            t13Var.q0 = false;
            t13Var.d();
            this.r = null;
        }
    }

    @Override // defpackage.di7
    public final void B(Matrix matrix) {
        super.B(matrix);
        synchronized (this.q) {
            try {
                t13 t13Var = this.r;
                if (t13Var != null) {
                    t13Var.i(matrix);
                }
                this.v = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.di7
    public final void C(Rect rect) {
        this.k = rect;
        synchronized (this.q) {
            try {
                t13 t13Var = this.r;
                if (t13Var != null) {
                    t13Var.j(rect);
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
    */
    public final lc6 G(v13 v13Var, yy yyVar) {
        int i;
        t13 t13Var;
        boolean z2;
        int width;
        int height;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        nj2.h();
        Size size = yyVar.a;
        Executor executor = (Executor) v13Var.b(i57.E, u24.t());
        executor.getClass();
        if (((Integer) ((v13) this.h).b(v13.B, 0)).intValue() == 1) {
            i = ((Integer) ((v13) this.h).b(v13.L, 6)).intValue();
        } else {
            i = 4;
        }
        re5 re5Var = null;
        if (v13Var.b(v13.R, null) == null) {
            re5 re5Var2 = new re5(ln2.l(size.getWidth(), size.getHeight(), this.h.q(), i));
            synchronized (this.q) {
                I();
                t13Var = this.r;
            }
            if (d() != null) {
                eg0 d = d();
                if (((Boolean) ((v13) this.h).b(v13.Z, Boolean.FALSE)).booleanValue() && i(d, false) % 180 != 0) {
                    z2 = true;
                    if (!z2) {
                        width = size.getHeight();
                    } else {
                        width = size.getWidth();
                    }
                    if (!z2) {
                        height = size.getWidth();
                    } else {
                        height = size.getHeight();
                    }
                    if (H() != 2) {
                        i2 = 1;
                    } else {
                        i2 = 35;
                    }
                    if (this.h.q() != 35 && H() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.h.q() != 35 && H() == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.h.q() != 35 && ((d() != null && i(d(), false) != 0) || Boolean.TRUE.equals((Boolean) ((v13) this.h).b(v13.Y, null)))) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z3 || (z5 && !z4)) {
                        re5Var = new re5(ln2.l(width, height, i2, re5Var2.f()));
                    }
                    if (re5Var != null) {
                        synchronized (t13Var.p0) {
                            t13Var.d0 = re5Var;
                        }
                    }
                    synchronized (this.q) {
                        try {
                            eg0 d2 = d();
                            if (d2 != null) {
                                this.r.B = i(d2, false);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    re5Var2.e(t13Var, executor);
                    lc6 d3 = lc6.d(v13Var, yyVar.a);
                    yy0 yy0Var = yyVar.f;
                    if (yy0Var != null) {
                        d3.b.e(yy0Var);
                    }
                    o33 o33Var = this.x;
                    if (o33Var != null) {
                        o33Var.a();
                    }
                    o33 o33Var2 = new o33(re5Var2.getSurface(), size, this.h.q());
                    this.x = o33Var2;
                    l.F(o33Var2.e).a(u24.x(), new mf(24, re5Var2, re5Var));
                    d3.h = yyVar.d;
                    a(d3, yyVar);
                    d3.b(this.x, yyVar.c, -1);
                    mc6 mc6Var = this.y;
                    if (mc6Var != null) {
                        mc6Var.b();
                    }
                    mc6 mc6Var2 = new mc6(new n13(this, t13Var, 0));
                    this.y = mc6Var2;
                    d3.f = mc6Var2;
                    return d3;
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (!z2) {
            }
            if (H() != 2) {
            }
            if (this.h.q() != 35) {
            }
            z3 = false;
            if (this.h.q() != 35) {
            }
            z4 = false;
            if (this.h.q() != 35) {
            }
            z5 = false;
            if (!z3) {
            }
            re5Var = new re5(ln2.l(width, height, i2, re5Var2.f()));
            if (re5Var != null) {
            }
            synchronized (this.q) {
            }
        } else {
            u34.a();
            return null;
        }
    }

    public final int H() {
        return ((Integer) ((v13) this.h).b(v13.X, 1)).intValue();
    }

    public final void I() {
        boolean z2;
        h61 h61Var;
        synchronized (this.q) {
            try {
                v13 v13Var = (v13) this.h;
                if (((Integer) v13Var.b(v13.B, 0)).intValue() == 1) {
                    this.r = new t13();
                } else {
                    this.r = new y13((Executor) v13Var.b(i57.E, u24.t()));
                }
                this.r.R = H();
                this.r.X = ((Boolean) ((v13) this.h).b(v13.Z, Boolean.FALSE)).booleanValue();
                eg0 d = d();
                Boolean bool = (Boolean) ((v13) this.h).b(v13.Y, null);
                if (d != null) {
                    z2 = d.q().s().a(OnePixelShiftQuirk.class);
                } else {
                    z2 = false;
                }
                t13 t13Var = this.r;
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                t13Var.Y = z2;
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
                if (executor != null && (h61Var = this.t) != null) {
                    t13 t13Var2 = this.r;
                    synchronized (t13Var2.p0) {
                        t13Var2.A = h61Var;
                        t13Var2.Z = executor;
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.di7
    public final zi7 g(boolean z2, cj7 cj7Var) {
        z.getClass();
        v13 v13Var = p13.a;
        yy0 a = cj7Var.a(v13Var.x(), 1);
        if (z2) {
            a = yy0.t(a, v13Var);
        }
        if (a == null) {
            return null;
        }
        return new v13(go4.a(((jd0) m(a)).B));
    }

    @Override // defpackage.di7
    public final yi7 m(yy0 yy0Var) {
        return new jd0(da4.k(yy0Var), 3);
    }

    public final String toString() {
        return "ImageAnalysis:".concat(h());
    }

    @Override // defpackage.di7
    public final zi7 v(cg0 cg0Var, yi7 yi7Var) {
        synchronized (this.q) {
        }
        return yi7Var.h();
    }

    @Override // defpackage.di7
    public final yy y(yy0 yy0Var) {
        this.w.a(yy0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.w.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p87 b = this.i.b();
        b.f = yy0Var;
        return b.a();
    }

    @Override // defpackage.di7
    public final yy z(yy yyVar, yy yyVar2) {
        kj2.t("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yyVar + ", secondaryStreamSpec " + yyVar2);
        f();
        lc6 G = G((v13) this.h, yyVar);
        this.w = G;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{G.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return yyVar;
    }
}
