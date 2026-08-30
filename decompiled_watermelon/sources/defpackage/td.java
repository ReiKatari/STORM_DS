package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: td  reason: default package */
/* loaded from: classes.dex */
public final class td extends yy3 implements k50, gz5, ia3, mf3, zx6 {
    public final yb j0 = new yb(2, this);
    public final /* synthetic */ ee k0;

    public td(ee eeVar) {
        this.k0 = eeVar;
    }

    @Override // defpackage.ia3
    public final boolean c0(KeyEvent keyEvent) {
        zb2 zb2Var;
        int i;
        boolean z;
        int[] iArr = fc2.a;
        long w = hi2.w(keyEvent);
        Integer num = null;
        int i2 = 2;
        if (r93.a(w, r93.b)) {
            zb2Var = new zb2(2);
        } else if (r93.a(w, r93.c)) {
            zb2Var = new zb2(1);
        } else if (r93.a(w, r93.r)) {
            if (keyEvent.isShiftPressed()) {
                i = 2;
            } else {
                i = 1;
            }
            zb2Var = new zb2(i);
        } else if (r93.a(w, r93.g)) {
            zb2Var = new zb2(4);
        } else if (r93.a(w, r93.f)) {
            zb2Var = new zb2(3);
        } else if (!r93.a(w, r93.d) && !r93.a(w, r93.F)) {
            if (!r93.a(w, r93.e) && !r93.a(w, r93.G)) {
                if (!r93.a(w, r93.h) && !r93.a(w, r93.t) && !r93.a(w, r93.N)) {
                    if (!r93.a(w, r93.a) && !r93.a(w, r93.w)) {
                        zb2Var = null;
                    } else {
                        zb2Var = new zb2(8);
                    }
                } else {
                    zb2Var = new zb2(7);
                }
            } else {
                zb2Var = new zb2(6);
            }
        } else {
            zb2Var = new zb2(5);
        }
        if (zb2Var != null) {
            int i3 = zb2Var.a;
            if (hi2.C(keyEvent) == 2) {
                ee eeVar = this.k0;
                ((nc2) eeVar.getFocusOwner()).getClass();
                Boolean e = ((nc2) eeVar.getFocusOwner()).e(i3, eeVar.getEmbeddedViewFocusRect(), new yb(1, zb2Var));
                if (e != null) {
                    z = e.booleanValue();
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
                if (i3 == 1 || i3 == 2) {
                    if (i3 == 5) {
                        num = 33;
                    } else if (i3 == 6) {
                        num = 130;
                    } else if (i3 == 3) {
                        num = 17;
                    } else if (i3 == 4) {
                        num = 66;
                    } else if (i3 == 1) {
                        num = 2;
                    } else if (i3 == 2) {
                        num = 1;
                    }
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = eeVar.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, eeVar.getView(), i2);
                    if (findNextFocus == null || findNextFocus.equals(eeVar)) {
                        return ((nc2) eeVar.getFocusOwner()).h(i3);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(j);
        return vv3Var.V(c.A, c.B, qp1.A, this.j0, new sd(c, 0));
    }

    @Override // defpackage.k50
    public final Object l0(m74 m74Var, wd wdVar, k11 k11Var) {
        y55 y55Var;
        long Q = m74Var.Q(0L);
        y55 y55Var2 = (y55) wdVar.c();
        if (y55Var2 != null) {
            y55Var = y55Var2.i(Q);
        } else {
            y55Var = null;
        }
        if (y55Var != null) {
            this.k0.requestRectangleOnScreen(new Rect((int) y55Var.a, (int) y55Var.b, (int) y55Var.c, (int) y55Var.d), false);
        }
        return o27.a;
    }

    @Override // defpackage.ia3
    public final boolean n(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.zx6
    public final Object t() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
    }
}
