package y3;

import a6.i2;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends pd.g implements Runnable, a6.v, View.OnAttachStateChangeListener {
    public boolean L;
    public int R;
    public i2 X;
    public final a1.m0 Y;
    public final n2.c1 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final a1.h0 f14742b0;

    /* renamed from: c0  reason: collision with root package name */
    public final z2.p f14743c0;

    public u() {
        super(1);
        a1.m0 m0Var = new a1.m0(9);
        v1.f14754a.getClass();
        m0Var.m(u1.f14745b, new y1("caption bar"));
        m0Var.m(u1.f14746c, new y1("display cutout"));
        m0Var.m(u1.f14747d, new y1("ime"));
        m0Var.m(u1.f14748e, new y1("mandatory system gestures"));
        m0Var.m(u1.f14749f, new y1("navigation bars"));
        m0Var.m(u1.f14750g, new y1("status bars"));
        m0Var.m(u1.f14751h, new y1("system gestures"));
        m0Var.m(u1.f14752i, new y1("tappable element"));
        m0Var.m(u1.f14753j, new y1("waterfall"));
        this.Y = m0Var;
        this.Z = new n2.c1(0);
        this.f14742b0 = new a1.h0(4);
        this.f14743c0 = new z2.p();
    }

    @Override // pd.g
    public final void a(a6.p1 p1Var) {
        boolean z10 = false;
        this.L = false;
        int d4 = p1Var.f502a.d();
        this.R &= ~d4;
        this.X = null;
        v1 v1Var = (v1) x1.f14758a.b(d4);
        if (v1Var != null) {
            Object g10 = this.Y.g(v1Var);
            g10.getClass();
            y1 y1Var = (y1) g10;
            y1Var.f14762c.h(0.0f);
            y1Var.f14764e.h(1.0f);
            y1Var.f14763d.h(0L);
            y1Var.f14762c.h(0.0f);
            y1Var.f14761b.setValue(Boolean.FALSE);
            y1Var.f14769j = -1L;
            y1Var.f14770k = -1L;
            n2.c1 c1Var = this.Z;
            c1Var.h(c1Var.g() + 1);
            synchronized (z2.l.f14919c) {
                a1.n0 n0Var = z2.l.f14926j.f14888h;
                if (n0Var != null) {
                    if (n0Var.h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                z2.l.a();
            }
        }
    }

    @Override // pd.g
    public final void b(a6.p1 p1Var) {
        this.L = true;
    }

    @Override // pd.g
    public final i2 c(i2 i2Var, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a6.p1 p1Var = (a6.p1) list.get(i2);
            v1 v1Var = (v1) x1.f14758a.b(p1Var.f502a.d());
            if (v1Var != null) {
                Object g10 = this.Y.g(v1Var);
                g10.getClass();
                y1 y1Var = (y1) g10;
                if (((Boolean) y1Var.f14761b.getValue()).booleanValue()) {
                    a6.o1 o1Var = p1Var.f502a;
                    y1Var.f14762c.h(o1Var.c());
                    y1Var.f14764e.h(o1Var.a());
                    y1Var.f14763d.h(o1Var.b());
                }
            }
        }
        i(i2Var);
        return i2Var;
    }

    @Override // pd.g
    public final a0.g d(a6.p1 p1Var, a0.g gVar) {
        i2 i2Var = this.X;
        boolean z10 = false;
        this.L = false;
        this.X = null;
        if (p1Var.f502a.b() > 0 && i2Var != null) {
            int d4 = p1Var.f502a.d();
            this.R |= d4;
            v1 v1Var = (v1) x1.f14758a.b(d4);
            if (v1Var != null) {
                Object g10 = this.Y.g(v1Var);
                g10.getClass();
                y1 y1Var = (y1) g10;
                q5.b f8 = i2Var.f479a.f(d4);
                long j2 = (f8.f12283a << 48) | (f8.f12284b << 32) | (f8.f12285c << 16) | f8.f12286d;
                long j10 = y1Var.f14767h;
                if (!c0.h(j2, j10)) {
                    y1Var.f14769j = j10;
                    y1Var.f14770k = j2;
                    y1Var.f14761b.setValue(Boolean.TRUE);
                    a6.o1 o1Var = p1Var.f502a;
                    y1Var.f14762c.h(o1Var.c());
                    y1Var.f14764e.h(o1Var.a());
                    y1Var.f14763d.h(o1Var.b());
                    n2.c1 c1Var = this.Z;
                    c1Var.h(c1Var.g() + 1);
                    synchronized (z2.l.f14919c) {
                        a1.n0 n0Var = z2.l.f14926j.f14888h;
                        if (n0Var != null) {
                            if (n0Var.h()) {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        z2.l.a();
                        return gVar;
                    }
                }
            }
        }
        return gVar;
    }

    public final void i(i2 i2Var) {
        char c4;
        char c10;
        boolean z10;
        char c11;
        boolean z11;
        boolean z12;
        long j2;
        List list;
        boolean z13;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j10;
        int i2;
        a1.x xVar = x1.f14758a;
        int[] iArr3 = xVar.f62b;
        Object[] objArr3 = xVar.f63c;
        long[] jArr3 = xVar.f61a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            z11 = false;
            z12 = false;
            c4 = 16;
            c10 = ' ';
            while (true) {
                long j11 = jArr3[i10];
                z10 = true;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    c11 = '0';
                    while (i13 < i12) {
                        if ((j11 & 255) < 128) {
                            int i14 = (i10 << 3) + i13;
                            int i15 = iArr3[i14];
                            v1 v1Var = (v1) objArr3[i14];
                            q5.b f8 = i2Var.f479a.f(i15);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j12 = (f8.f12283a << 48) | (f8.f12284b << 32) | (f8.f12285c << 16) | f8.f12286d;
                            Object g10 = this.Y.g(v1Var);
                            g10.getClass();
                            y1 y1Var = (y1) g10;
                            j10 = j11;
                            if (!c0.h(j12, y1Var.f14767h)) {
                                y1Var.f14767h = j12;
                                z11 = true;
                                if (!c0.h(j12, 0L)) {
                                    z12 = true;
                                }
                            }
                            if (i15 != 8) {
                                q5.b g11 = i2Var.f479a.g(i15);
                                objArr2 = objArr3;
                                long j13 = (g11.f12284b << 32) | (g11.f12283a << 48) | (g11.f12285c << 16) | g11.f12286d;
                                if (!c0.h(y1Var.f14768i, j13)) {
                                    y1Var.f14768i = j13;
                                    z11 = true;
                                    if (!c0.h(j13, 0L)) {
                                        z12 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            y1Var.f14760a.setValue(Boolean.valueOf(i2Var.f479a.p(i15)));
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j10 = j11;
                            i2 = i11;
                        }
                        j11 = j10 >> i2;
                        i13++;
                        i11 = i2;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c11 = '0';
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c4 = 16;
            c10 = ' ';
            z10 = true;
            c11 = '0';
            z11 = false;
            z12 = false;
        }
        a6.n e6 = i2Var.f479a.e();
        if (e6 == null) {
            j2 = 0;
        } else {
            q5.b a10 = e6.a();
            j2 = (a10.f12283a << c11) | (a10.f12284b << c10) | (a10.f12285c << c4) | a10.f12286d;
        }
        a1.m0 m0Var = this.Y;
        v1.f14754a.getClass();
        Object g12 = m0Var.g(u1.f14753j);
        g12.getClass();
        y1 y1Var2 = (y1) g12;
        y1Var2.f14760a.setValue(Boolean.valueOf(!c0.h(j2, 0L)));
        if (!c0.h(y1Var2.f14767h, j2)) {
            y1Var2.f14767h = j2;
            y1Var2.f14768i = j2;
            z11 = z10;
            if (!c0.h(j2, 0L)) {
                z12 = z11;
            }
        }
        if (e6 == null) {
            a1.h0 h0Var = this.f14742b0;
            if (h0Var.f45b > 0) {
                h0Var.d();
                this.f14743c0.clear();
                z11 = z10;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                list = a6.k.d(e6.f493a);
            } else {
                list = Collections.EMPTY_LIST;
            }
            int size = list.size();
            a1.h0 h0Var2 = this.f14742b0;
            if (size < h0Var2.f45b) {
                h0Var2.l(list.size(), this.f14742b0.f45b);
                this.f14743c0.d(list.size(), this.f14743c0.size());
                z11 = z10;
            } else {
                int size2 = list.size() - this.f14742b0.f45b;
                int i16 = 0;
                while (i16 < size2) {
                    a1.h0 h0Var3 = this.f14742b0;
                    h0Var3.a(n2.s.w(list.get(h0Var3.f45b)));
                    this.f14743c0.add(new t("display cutout rect " + this.f14742b0.f45b));
                    i16++;
                    z11 = z10;
                }
            }
            int size3 = list.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Rect rect = (Rect) list.get(i17);
                n2.w0 w0Var = (n2.w0) this.f14742b0.f(i17);
                if (!nc.k.a(w0Var.getValue(), rect)) {
                    w0Var.setValue(rect);
                    z11 = z10;
                }
            }
            if (!list.isEmpty()) {
                z12 = z10;
            }
        }
        if ((z12 || this.Z.g() != 0) && z11) {
            n2.c1 c1Var = this.Z;
            c1Var.h(c1Var.g() + 1);
            synchronized (z2.l.f14919c) {
                a1.n0 n0Var = z2.l.f14926j.f14888h;
                if (n0Var != null) {
                    boolean z14 = z10;
                    if (n0Var.h() == z14) {
                        z13 = z14;
                    }
                }
                z13 = false;
            }
            if (z13) {
                z2.l.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = a6.x0.f533a;
        a6.p0.k(view, this);
        a6.x0.q(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = a6.x0.f533a;
        a6.p0.k(view, null);
        a6.x0.q(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.L) {
            this.R = 0;
            this.L = false;
            i2 i2Var = this.X;
            if (i2Var != null) {
                i(i2Var);
                this.X = null;
            }
        }
    }

    @Override // a6.v
    public final i2 s(View view, i2 i2Var) {
        if (this.L) {
            this.X = i2Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return i2Var;
            }
        } else if (this.R == 0) {
            i(i2Var);
        }
        return i2Var;
    }
}
