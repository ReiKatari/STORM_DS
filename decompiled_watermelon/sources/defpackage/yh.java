package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yh  reason: default package */
/* loaded from: classes.dex */
public final class yh implements cp4 {
    public cm3 a;
    public kd6 b;
    public im3 c;
    public c46 d;

    @Override // defpackage.cp4
    public final void a(oq6 oq6Var, pb4 pb4Var, lr6 lr6Var, z50 z50Var, y55 y55Var, y55 y55Var2) {
        im3 im3Var = this.c;
        if (im3Var != null) {
            dm3 dm3Var = im3Var.m;
            synchronized (dm3Var.c) {
                try {
                    dm3Var.j = oq6Var;
                    dm3Var.l = pb4Var;
                    dm3Var.k = lr6Var;
                    dm3Var.m = y55Var;
                    dm3Var.n = y55Var2;
                    if (!dm3Var.e) {
                        if (dm3Var.d) {
                        }
                    }
                    dm3Var.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.cp4
    public final void b(oq6 oq6Var, hx2 hx2Var, cz czVar, o21 o21Var) {
        j(new e5(oq6Var, this, hx2Var, czVar, o21Var, 2));
    }

    @Override // defpackage.cp4
    public final void c() {
        j(null);
    }

    @Override // defpackage.cp4
    public final void d(oq6 oq6Var, oq6 oq6Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        im3 im3Var = this.c;
        if (im3Var != null) {
            if (vr6.b(im3Var.h.b, oq6Var2.b) && b53.x(im3Var.h.c, oq6Var2.c)) {
                z = false;
            } else {
                z = true;
            }
            im3Var.h = oq6Var2;
            int size = im3Var.j.size();
            for (int i4 = 0; i4 < size; i4++) {
                v55 v55Var = (v55) ((WeakReference) im3Var.j.get(i4)).get();
                if (v55Var != null) {
                    v55Var.g = oq6Var2;
                }
            }
            dm3 dm3Var = im3Var.m;
            synchronized (dm3Var.c) {
                dm3Var.j = null;
                dm3Var.l = null;
                dm3Var.k = null;
                dm3Var.m = null;
                dm3Var.n = null;
            }
            int i5 = -1;
            if (b53.x(oq6Var, oq6Var2)) {
                if (z) {
                    q03 q03Var = im3Var.b;
                    int f = vr6.f(oq6Var2.b);
                    int e = vr6.e(oq6Var2.b);
                    vr6 vr6Var = im3Var.h.c;
                    if (vr6Var != null) {
                        i3 = vr6.f(vr6Var.a);
                    } else {
                        i3 = -1;
                    }
                    vr6 vr6Var2 = im3Var.h.c;
                    if (vr6Var2 != null) {
                        i5 = vr6.e(vr6Var2.a);
                    }
                    q03Var.l().updateSelection((View) q03Var.B, f, e, i3, i5);
                }
            } else if (oq6Var != null && (!b53.x(oq6Var.a.B, oq6Var2.a.B) || (vr6.b(oq6Var.b, oq6Var2.b) && !b53.x(oq6Var.c, oq6Var2.c)))) {
                q03 q03Var2 = im3Var.b;
                q03Var2.l().restartInput((View) q03Var2.B);
            } else {
                int size2 = im3Var.j.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    v55 v55Var2 = (v55) ((WeakReference) im3Var.j.get(i6)).get();
                    if (v55Var2 != null) {
                        oq6 oq6Var3 = im3Var.h;
                        q03 q03Var3 = im3Var.b;
                        if (v55Var2.k) {
                            v55Var2.g = oq6Var3;
                            if (v55Var2.i) {
                                q03Var3.l().updateExtractedText((View) q03Var3.B, v55Var2.h, me2.e(oq6Var3));
                            }
                            vr6 vr6Var3 = oq6Var3.c;
                            long j = oq6Var3.b;
                            if (vr6Var3 != null) {
                                i = vr6.f(vr6Var3.a);
                            } else {
                                i = -1;
                            }
                            vr6 vr6Var4 = oq6Var3.c;
                            if (vr6Var4 != null) {
                                i2 = vr6.e(vr6Var4.a);
                            } else {
                                i2 = -1;
                            }
                            q03Var3.l().updateSelection((View) q03Var3.B, vr6.f(j), vr6.e(j), i, i2);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.cp4
    public final void e() {
        ib6 ib6Var;
        cm3 cm3Var = this.a;
        if (cm3Var != null && (ib6Var = (ib6) mh7.t(cm3Var, ov0.q)) != null) {
            ((zc1) ib6Var).b();
        }
    }

    @Override // defpackage.cp4
    public final void f() {
        ib6 ib6Var;
        cm3 cm3Var = this.a;
        if (cm3Var != null && (ib6Var = (ib6) mh7.t(cm3Var, ov0.q)) != null) {
            ((zc1) ib6Var).a();
        }
    }

    @Override // defpackage.cp4
    public final void g() {
        kd6 kd6Var = this.b;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.b = null;
        h24 i = i();
        if (i != null) {
            ((c46) i).d();
        }
    }

    @Override // defpackage.cp4
    public final void h(y55 y55Var) {
        Rect rect;
        im3 im3Var = this.c;
        if (im3Var != null) {
            im3Var.l = new Rect(jv3.X(y55Var.a), jv3.X(y55Var.b), jv3.X(y55Var.c), jv3.X(y55Var.d));
            if (im3Var.j.isEmpty() && (rect = im3Var.l) != null) {
                im3Var.a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    public final h24 i() {
        c46 c46Var = this.d;
        if (c46Var != null) {
            return c46Var;
        }
        if (!nh6.a) {
            return null;
        }
        c46 b = d46.b(1, 0, h60.DROP_LATEST, 2);
        this.d = b;
        return b;
    }

    public final void j(e5 e5Var) {
        cm3 cm3Var = this.a;
        if (cm3Var == null) {
            return;
        }
        kd6 kd6Var = null;
        m5 m5Var = new m5(e5Var, this, cm3Var, (j11) null, 2);
        if (cm3Var.i0) {
            kd6Var = tq5.w(cm3Var.F0(), null, s31.UNDISPATCHED, new ba1(cm3Var, m5Var, null, 25), 1);
        }
        this.b = kd6Var;
    }

    public final void k(cm3 cm3Var) {
        boolean z;
        if (this.a == cm3Var) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pz2.c("Expected textInputModifierNode to be " + cm3Var + " but was " + this.a);
        }
        this.a = null;
    }
}
