package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j83  reason: default package */
/* loaded from: classes.dex */
public final class j83 extends f55 implements Runnable, zk4, View.OnAttachStateChangeListener {
    public boolean L;
    public int R;
    public vu7 X;
    public final ja4 Y;
    public final ss4 Z;
    public final ca4 d0;
    public final mm6 e0;

    public j83() {
        super(1);
        ja4 ja4Var = new ja4(9);
        fv7.a.getClass();
        ja4Var.m(ev7.b, new xv7("caption bar"));
        ja4Var.m(ev7.c, new xv7("display cutout"));
        ja4Var.m(ev7.d, new xv7("ime"));
        ja4Var.m(ev7.e, new xv7("mandatory system gestures"));
        ja4Var.m(ev7.f, new xv7("navigation bars"));
        ja4Var.m(ev7.g, new xv7("status bars"));
        ja4Var.m(ev7.h, new xv7("system gestures"));
        ja4Var.m(ev7.i, new xv7("tappable element"));
        ja4Var.m(ev7.j, new xv7("waterfall"));
        this.Y = ja4Var;
        this.Z = new ss4(0);
        this.d0 = new ca4(4);
        this.e0 = new mm6();
    }

    @Override // defpackage.zk4
    public final vu7 U(View view, vu7 vu7Var) {
        if (this.L) {
            this.X = vu7Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return vu7Var;
            }
        } else if (this.R == 0) {
            o0(vu7Var);
        }
        return vu7Var;
    }

    @Override // defpackage.f55
    public final void i0(au7 au7Var) {
        boolean z = false;
        this.L = false;
        int d = au7Var.a.d();
        this.R &= ~d;
        this.X = null;
        fv7 fv7Var = (fv7) hv7.a.b(d);
        if (fv7Var != null) {
            Object g = this.Y.g(fv7Var);
            g.getClass();
            xv7 xv7Var = (xv7) g;
            xv7Var.c.i(RecyclerView.B1);
            xv7Var.e.i(1.0f);
            xv7Var.d.i(0L);
            xv7Var.c.i(RecyclerView.B1);
            xv7Var.b.setValue(Boolean.FALSE);
            xv7Var.j = -1L;
            xv7Var.k = -1L;
            ss4 ss4Var = this.Z;
            ss4Var.i(ss4Var.h() + 1);
            synchronized (bm6.c) {
                ka4 ka4Var = bm6.j.h;
                if (ka4Var != null) {
                    if (ka4Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                bm6.a();
            }
        }
    }

    @Override // defpackage.f55
    public final void j0(au7 au7Var) {
        this.L = true;
    }

    @Override // defpackage.f55
    public final vu7 k0(vu7 vu7Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            au7 au7Var = (au7) list.get(i);
            fv7 fv7Var = (fv7) hv7.a.b(au7Var.a.d());
            if (fv7Var != null) {
                Object g = this.Y.g(fv7Var);
                g.getClass();
                xv7 xv7Var = (xv7) g;
                if (((Boolean) xv7Var.b.getValue()).booleanValue()) {
                    zt7 zt7Var = au7Var.a;
                    xv7Var.c.i(zt7Var.c());
                    xv7Var.e.i(zt7Var.a());
                    xv7Var.d.i(zt7Var.b());
                }
            }
        }
        o0(vu7Var);
        return vu7Var;
    }

    @Override // defpackage.f55
    public final rr6 l0(au7 au7Var, rr6 rr6Var) {
        vu7 vu7Var = this.X;
        boolean z = false;
        this.L = false;
        this.X = null;
        if (au7Var.a.b() > 0 && vu7Var != null) {
            int d = au7Var.a.d();
            this.R |= d;
            fv7 fv7Var = (fv7) hv7.a.b(d);
            if (fv7Var != null) {
                Object g = this.Y.g(fv7Var);
                g.getClass();
                xv7 xv7Var = (xv7) g;
                e83 h = vu7Var.a.h(d);
                long j = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                long j2 = xv7Var.h;
                if (!bl2.u(j, j2)) {
                    xv7Var.j = j2;
                    xv7Var.k = j;
                    xv7Var.b.setValue(Boolean.TRUE);
                    zt7 zt7Var = au7Var.a;
                    xv7Var.c.i(zt7Var.c());
                    xv7Var.e.i(zt7Var.a());
                    xv7Var.d.i(zt7Var.b());
                    ss4 ss4Var = this.Z;
                    ss4Var.i(ss4Var.h() + 1);
                    synchronized (bm6.c) {
                        ka4 ka4Var = bm6.j.h;
                        if (ka4Var != null) {
                            if (ka4Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        bm6.a();
                        return rr6Var;
                    }
                }
            }
        }
        return rr6Var;
    }

    public final void o0(vu7 vu7Var) {
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
        p94 p94Var = hv7.a;
        int[] iArr3 = p94Var.b;
        Object[] objArr3 = p94Var.c;
        long[] jArr3 = p94Var.a;
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
                            fv7 fv7Var = (fv7) objArr3[i6];
                            e83 h = vu7Var.a.h(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (h.a << 48) | (h.b << 32) | (h.c << 16) | h.d;
                            Object g = this.Y.g(fv7Var);
                            g.getClass();
                            xv7 xv7Var = (xv7) g;
                            j2 = j3;
                            if (!bl2.u(j4, xv7Var.h)) {
                                xv7Var.h = j4;
                                z2 = true;
                                if (!bl2.u(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                e83 i8 = vu7Var.a.i(i7);
                                objArr2 = objArr3;
                                long j5 = (i8.b << 32) | (i8.a << 48) | (i8.c << 16) | i8.d;
                                if (!bl2.u(xv7Var.i, j5)) {
                                    xv7Var.i = j5;
                                    z2 = true;
                                    if (!bl2.u(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            xv7Var.a.setValue(Boolean.valueOf(vu7Var.a.t(i7)));
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
        yk1 g2 = vu7Var.a.g();
        if (g2 == null) {
            j = 0;
        } else {
            e83 a = g2.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        ja4 ja4Var = this.Y;
        fv7.a.getClass();
        Object g3 = ja4Var.g(ev7.j);
        g3.getClass();
        xv7 xv7Var2 = (xv7) g3;
        xv7Var2.a.setValue(Boolean.valueOf(!bl2.u(j, 0L)));
        if (!bl2.u(xv7Var2.h, j)) {
            xv7Var2.h = j;
            xv7Var2.i = j;
            z2 = z;
            if (!bl2.u(j, 0L)) {
                z3 = z2;
            }
        }
        if (g2 == null) {
            ca4 ca4Var = this.d0;
            if (ca4Var.b > 0) {
                ca4Var.d();
                this.e0.clear();
                z2 = z;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                list = pp.d(g2.a);
            } else {
                list = Collections.EMPTY_LIST;
            }
            int size = list.size();
            ca4 ca4Var2 = this.d0;
            if (size < ca4Var2.b) {
                ca4Var2.l(list.size(), this.d0.b);
                this.e0.c(list.size(), this.e0.size());
                z2 = z;
            } else {
                int size2 = list.size() - this.d0.b;
                int i9 = 0;
                while (i9 < size2) {
                    ca4 ca4Var3 = this.d0;
                    ca4Var3.a(np2.Y(list.get(ca4Var3.b)));
                    this.e0.add(new z53("display cutout rect " + this.d0.b));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = list.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = (Rect) list.get(i10);
                qa4 qa4Var = (qa4) this.d0.f(i10);
                if (!nb3.k(qa4Var.getValue(), rect)) {
                    qa4Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!list.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.Z.h() != 0) && z2) {
            ss4 ss4Var = this.Z;
            ss4Var.i(ss4Var.h() + 1);
            synchronized (bm6.c) {
                ka4 ka4Var = bm6.j.h;
                if (ka4Var != null) {
                    boolean z5 = z;
                    if (ka4Var.h() == z5) {
                        z4 = z5;
                    }
                }
                z4 = false;
            }
            if (z4) {
                bm6.a();
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
        WeakHashMap weakHashMap = ao7.a;
        sn7.c(view, this);
        ao7.p(view, this);
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
        WeakHashMap weakHashMap = ao7.a;
        sn7.c(view, null);
        ao7.p(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.L) {
            this.R = 0;
            this.L = false;
            vu7 vu7Var = this.X;
            if (vu7Var != null) {
                o0(vu7Var);
                this.X = null;
            }
        }
    }
}
