package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cr6  reason: default package */
/* loaded from: classes.dex */
public final class cr6 implements cp4 {
    public final View a;
    public final os b;
    public final dr6 c;
    public boolean d;
    public mi2 e;
    public mi2 f;
    public oq6 g;
    public hx2 h;
    public final ArrayList i;
    public final gh3 j;
    public Rect k;
    public final r41 l;
    public final o24 m;
    public tm3 n;

    public cr6(View view, ee eeVar) {
        os osVar = new os(view);
        dr6 dr6Var = new dr6(0, Choreographer.getInstance());
        this.a = view;
        this.b = osVar;
        this.c = dr6Var;
        this.e = qc2.r0;
        this.f = qc2.s0;
        this.g = new oq6("", 4, vr6.b);
        this.h = hx2.g;
        this.i = new ArrayList();
        this.j = yf2.H(wk3.NONE, new dj(19, this));
        this.l = new r41(eeVar, osVar);
        this.m = new o24(new ar6[16]);
    }

    @Override // defpackage.cp4
    public final void a(oq6 oq6Var, pb4 pb4Var, lr6 lr6Var, z50 z50Var, y55 y55Var, y55 y55Var2) {
        r41 r41Var = this.l;
        synchronized (r41Var.c) {
            try {
                r41Var.j = oq6Var;
                r41Var.l = pb4Var;
                r41Var.k = lr6Var;
                r41Var.m = z50Var;
                r41Var.n = y55Var;
                r41Var.o = y55Var2;
                if (!r41Var.e) {
                    if (r41Var.d) {
                    }
                }
                r41Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.cp4
    public final void b(oq6 oq6Var, hx2 hx2Var, cz czVar, o21 o21Var) {
        this.d = true;
        this.g = oq6Var;
        this.h = hx2Var;
        this.e = czVar;
        this.f = o21Var;
        i(ar6.StartInput);
    }

    @Override // defpackage.cp4
    public final void c() {
        i(ar6.StartInput);
    }

    @Override // defpackage.cp4
    public final void d(oq6 oq6Var, oq6 oq6Var2) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (vr6.b(this.g.b, oq6Var2.b) && b53.x(this.g.c, oq6Var2.c)) {
            z = false;
        } else {
            z = true;
        }
        this.g = oq6Var2;
        int size = this.i.size();
        for (int i4 = 0; i4 < size; i4++) {
            u55 u55Var = (u55) ((WeakReference) this.i.get(i4)).get();
            if (u55Var != null) {
                u55Var.d = oq6Var2;
            }
        }
        r41 r41Var = this.l;
        synchronized (r41Var.c) {
            r41Var.j = null;
            r41Var.l = null;
            r41Var.k = null;
            r41Var.m = yd.q0;
            r41Var.n = null;
            r41Var.o = null;
        }
        int i5 = -1;
        if (b53.x(oq6Var, oq6Var2)) {
            if (z) {
                os osVar = this.b;
                int f = vr6.f(oq6Var2.b);
                int e = vr6.e(oq6Var2.b);
                vr6 vr6Var = this.g.c;
                if (vr6Var != null) {
                    i3 = vr6.f(vr6Var.a);
                } else {
                    i3 = -1;
                }
                vr6 vr6Var2 = this.g.c;
                if (vr6Var2 != null) {
                    i5 = vr6.e(vr6Var2.a);
                }
                ((InputMethodManager) ((gh3) osVar.L).getValue()).updateSelection((View) osVar.B, f, e, i3, i5);
            }
        } else if (oq6Var != null && (!b53.x(oq6Var.a.B, oq6Var2.a.B) || (vr6.b(oq6Var.b, oq6Var2.b) && !b53.x(oq6Var.c, oq6Var2.c)))) {
            os osVar2 = this.b;
            ((InputMethodManager) ((gh3) osVar2.L).getValue()).restartInput((View) osVar2.B);
        } else {
            int size2 = this.i.size();
            for (int i6 = 0; i6 < size2; i6++) {
                u55 u55Var2 = (u55) ((WeakReference) this.i.get(i6)).get();
                if (u55Var2 != null) {
                    oq6 oq6Var3 = this.g;
                    os osVar3 = this.b;
                    if (u55Var2.h) {
                        u55Var2.d = oq6Var3;
                        if (u55Var2.f) {
                            ((InputMethodManager) ((gh3) osVar3.L).getValue()).updateExtractedText((View) osVar3.B, u55Var2.e, yf2.V(oq6Var3));
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
                        ((InputMethodManager) ((gh3) osVar3.L).getValue()).updateSelection((View) osVar3.B, vr6.f(j), vr6.e(j), i, i2);
                    }
                }
            }
        }
    }

    @Override // defpackage.cp4
    public final void e() {
        i(ar6.ShowKeyboard);
    }

    @Override // defpackage.cp4
    public final void f() {
        i(ar6.HideKeyboard);
    }

    @Override // defpackage.cp4
    public final void g() {
        this.d = false;
        this.e = qc2.t0;
        this.f = qc2.u0;
        this.k = null;
        i(ar6.StopInput);
    }

    @Override // defpackage.cp4
    public final void h(y55 y55Var) {
        Rect rect;
        this.k = new Rect(jv3.X(y55Var.a), jv3.X(y55Var.b), jv3.X(y55Var.c), jv3.X(y55Var.d));
        if (this.i.isEmpty() && (rect = this.k) != null) {
            this.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final void i(ar6 ar6Var) {
        this.m.b(ar6Var);
        if (this.n == null) {
            tm3 tm3Var = new tm3(15, this);
            this.c.execute(tm3Var);
            this.n = tm3Var;
        }
    }
}
