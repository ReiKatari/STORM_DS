package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c23  reason: default package */
/* loaded from: classes.dex */
public final class c23 extends yv4 implements Runnable, bc4, View.OnAttachStateChangeListener {
    public boolean L;
    public int R;
    public vf7 X;
    public final d24 Y;
    public final qj4 Z;
    public final w14 c0;
    public final xa6 d0;

    public c23() {
        super(1);
        d24 d24Var = new d24(9);
        fg7.a.getClass();
        d24Var.m(eg7.b, new xg7("caption bar"));
        d24Var.m(eg7.c, new xg7("display cutout"));
        d24Var.m(eg7.d, new xg7("ime"));
        d24Var.m(eg7.e, new xg7("mandatory system gestures"));
        d24Var.m(eg7.f, new xg7("navigation bars"));
        d24Var.m(eg7.g, new xg7("status bars"));
        d24Var.m(eg7.h, new xg7("system gestures"));
        d24Var.m(eg7.i, new xg7("tappable element"));
        d24Var.m(eg7.j, new xg7("waterfall"));
        this.Y = d24Var;
        this.Z = new qj4(0);
        this.c0 = new w14(4);
        this.d0 = new xa6();
    }

    @Override // defpackage.bc4
    public final vf7 G(View view, vf7 vf7Var) {
        if (this.L) {
            this.X = vf7Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return vf7Var;
            }
        } else if (this.R == 0) {
            o0(vf7Var);
        }
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final void i0(ze7 ze7Var) {
        boolean z = false;
        this.L = false;
        int d = ze7Var.a.d();
        this.R &= ~d;
        this.X = null;
        fg7 fg7Var = (fg7) hg7.a.b(d);
        if (fg7Var != null) {
            Object g = this.Y.g(fg7Var);
            g.getClass();
            xg7 xg7Var = (xg7) g;
            xg7Var.c.i(RecyclerView.A1);
            xg7Var.e.i(1.0f);
            xg7Var.d.i(0L);
            xg7Var.c.i(RecyclerView.A1);
            xg7Var.b.setValue(Boolean.FALSE);
            xg7Var.j = -1L;
            xg7Var.k = -1L;
            qj4 qj4Var = this.Z;
            qj4Var.i(qj4Var.h() + 1);
            synchronized (ma6.c) {
                e24 e24Var = ma6.j.h;
                if (e24Var != null) {
                    if (e24Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ma6.a();
            }
        }
    }

    @Override // defpackage.yv4
    public final void j0(ze7 ze7Var) {
        this.L = true;
    }

    @Override // defpackage.yv4
    public final vf7 k0(vf7 vf7Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ze7 ze7Var = (ze7) list.get(i);
            fg7 fg7Var = (fg7) hg7.a.b(ze7Var.a.d());
            if (fg7Var != null) {
                Object g = this.Y.g(fg7Var);
                g.getClass();
                xg7 xg7Var = (xg7) g;
                if (((Boolean) xg7Var.b.getValue()).booleanValue()) {
                    ye7 ye7Var = ze7Var.a;
                    xg7Var.c.i(ye7Var.c());
                    xg7Var.e.i(ye7Var.a());
                    xg7Var.d.i(ye7Var.b());
                }
            }
        }
        o0(vf7Var);
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final wv6 l0(ze7 ze7Var, wv6 wv6Var) {
        vf7 vf7Var = this.X;
        boolean z = false;
        this.L = false;
        this.X = null;
        if (ze7Var.a.b() > 0 && vf7Var != null) {
            int d = ze7Var.a.d();
            this.R |= d;
            fg7 fg7Var = (fg7) hg7.a.b(d);
            if (fg7Var != null) {
                Object g = this.Y.g(fg7Var);
                g.getClass();
                xg7 xg7Var = (xg7) g;
                x13 h = vf7Var.a.h(d);
                long j = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                long j2 = xg7Var.h;
                if (!hk2.s(j, j2)) {
                    xg7Var.j = j2;
                    xg7Var.k = j;
                    xg7Var.b.setValue(Boolean.TRUE);
                    ye7 ye7Var = ze7Var.a;
                    xg7Var.c.i(ye7Var.c());
                    xg7Var.e.i(ye7Var.a());
                    xg7Var.d.i(ye7Var.b());
                    qj4 qj4Var = this.Z;
                    qj4Var.i(qj4Var.h() + 1);
                    synchronized (ma6.c) {
                        e24 e24Var = ma6.j.h;
                        if (e24Var != null) {
                            if (e24Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ma6.a();
                        return wv6Var;
                    }
                }
            }
        }
        return wv6Var;
    }

    public final void o0(vf7 vf7Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        List list;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        j14 j14Var = hg7.a;
        int[] iArr3 = j14Var.b;
        Object[] objArr3 = j14Var.c;
        long[] jArr3 = j14Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            fg7 fg7Var = (fg7) objArr3[i6];
                            x13 h = vf7Var.a.h(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                            Object g = this.Y.g(fg7Var);
                            g.getClass();
                            xg7 xg7Var = (xg7) g;
                            j2 = j3;
                            if (!hk2.s(j4, xg7Var.h)) {
                                xg7Var.h = j4;
                                z2 = true;
                                if (!hk2.s(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                x13 i8 = vf7Var.a.i(i7);
                                objArr2 = objArr3;
                                long j5 = (i8.b << 32) | (i8.a << 48) | (i8.c << 16) | i8.d;
                                if (!hk2.s(xg7Var.i, j5)) {
                                    xg7Var.i = j5;
                                    z2 = true;
                                    if (!hk2.s(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            xg7Var.a.setValue(Boolean.valueOf(vf7Var.a.t(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        ug1 g2 = vf7Var.a.g();
        if (g2 == null) {
            j = 0;
        } else {
            x13 a = g2.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        d24 d24Var = this.Y;
        fg7.a.getClass();
        Object g3 = d24Var.g(eg7.j);
        g3.getClass();
        xg7 xg7Var2 = (xg7) g3;
        xg7Var2.a.setValue(Boolean.valueOf(!hk2.s(j, 0L)));
        if (!hk2.s(xg7Var2.h, j)) {
            xg7Var2.h = j;
            xg7Var2.i = j;
            z2 = z;
            if (!hk2.s(j, 0L)) {
                z3 = z2;
            }
        }
        if (g2 == null) {
            w14 w14Var = this.c0;
            if (w14Var.b > 0) {
                w14Var.d();
                this.d0.clear();
                z2 = z;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                list = dp.d(g2.a);
            } else {
                list = Collections.EMPTY_LIST;
            }
            int size = list.size();
            w14 w14Var2 = this.c0;
            if (size < w14Var2.b) {
                w14Var2.l(list.size(), this.c0.b);
                this.d0.i(list.size(), this.d0.size());
                z2 = z;
            } else {
                int size2 = list.size() - this.c0.b;
                int i9 = 0;
                while (i9 < size2) {
                    w14 w14Var3 = this.c0;
                    w14Var3.a(me2.G(list.get(w14Var3.b)));
                    this.d0.add(new wz2("display cutout rect " + this.c0.b));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = list.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = (Rect) list.get(i10);
                k24 k24Var = (k24) this.c0.f(i10);
                if (!b53.x(k24Var.getValue(), rect)) {
                    k24Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.Z.h() != 0) && z2) {
            qj4 qj4Var = this.Z;
            qj4Var.i(qj4Var.h() + 1);
            synchronized (ma6.c) {
                e24 e24Var = ma6.j.h;
                if (e24Var != null) {
                    boolean z5 = z;
                    if (e24Var.h() == z5) {
                        z4 = z5;
                    }
                }
                z4 = false;
            }
            if (z4) {
                ma6.a();
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
        WeakHashMap weakHashMap = aa7.a;
        s97.c(view, this);
        aa7.p(view, this);
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
        WeakHashMap weakHashMap = aa7.a;
        s97.c(view, null);
        aa7.p(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.L) {
            this.R = 0;
            this.L = false;
            vf7 vf7Var = this.X;
            if (vf7Var != null) {
                o0(vf7Var);
                this.X = null;
            }
        }
    }
}
