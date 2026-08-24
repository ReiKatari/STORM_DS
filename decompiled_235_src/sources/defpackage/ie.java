package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ie  reason: default package */
/* loaded from: classes.dex */
public final class ie extends z64 implements o70, va6, bh3, jm3, ub7 {
    public final mc k0 = new mc(this, 2);
    public final /* synthetic */ te l0;

    public ie(te teVar) {
        this.l0 = teVar;
    }

    @Override // defpackage.bh3
    public final boolean B(KeyEvent keyEvent) {
        qg2 qg2Var;
        int i;
        boolean z;
        int[] iArr = wg2.a;
        long m = xk2.m(keyEvent);
        Integer num = null;
        int i2 = 2;
        if (kg3.a(m, kg3.b)) {
            qg2Var = new qg2(2);
        } else if (kg3.a(m, kg3.c)) {
            qg2Var = new qg2(1);
        } else if (kg3.a(m, kg3.r)) {
            if (keyEvent.isShiftPressed()) {
                i = 2;
            } else {
                i = 1;
            }
            qg2Var = new qg2(i);
        } else if (kg3.a(m, kg3.g)) {
            qg2Var = new qg2(4);
        } else if (kg3.a(m, kg3.f)) {
            qg2Var = new qg2(3);
        } else if (!kg3.a(m, kg3.d) && !kg3.a(m, kg3.F)) {
            if (!kg3.a(m, kg3.e) && !kg3.a(m, kg3.G)) {
                if (!kg3.a(m, kg3.h) && !kg3.a(m, kg3.t) && !kg3.a(m, kg3.N)) {
                    if (!kg3.a(m, kg3.a) && !kg3.a(m, kg3.w)) {
                        qg2Var = null;
                    } else {
                        qg2Var = new qg2(8);
                    }
                } else {
                    qg2Var = new qg2(7);
                }
            } else {
                qg2Var = new qg2(6);
            }
        } else {
            qg2Var = new qg2(5);
        }
        if (qg2Var != null) {
            int i3 = qg2Var.a;
            if (xk2.u(keyEvent) == 2) {
                te teVar = this.l0;
                ((eh2) teVar.getFocusOwner()).getClass();
                Boolean e = ((eh2) teVar.getFocusOwner()).e(i3, teVar.getEmbeddedViewFocusRect(), new mc(qg2Var, 1));
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
                    View rootView = teVar.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, teVar.getView(), i2);
                    if (findNextFocus == null || findNextFocus.equals(teVar)) {
                        return ((eh2) teVar.getFocusOwner()).h(i3);
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.o70
    public final Object G(eg4 eg4Var, le leVar, s41 s41Var) {
        of5 of5Var;
        long P = eg4Var.P(0L);
        of5 of5Var2 = (of5) leVar.c();
        if (of5Var2 != null) {
            of5Var = of5Var2.i(P);
        } else {
            of5Var = null;
        }
        if (of5Var != null) {
            this.l0.requestRectangleOnScreen(new Rect((int) of5Var.a, (int) of5Var.b, (int) of5Var.c, (int) of5Var.d), false);
        }
        return jg7.a;
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(j);
        return g34Var.o0(y.A, y.B, zt1.A, this.k0, new he(y, 0));
    }

    @Override // defpackage.bh3
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ub7
    public final Object n() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.va6
    public final void A0(gb6 gb6Var) {
    }
}
