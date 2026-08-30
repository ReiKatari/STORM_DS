package b4;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends b3.o implements f4.a, a4.l2, t3.e, a4.a0, a4.q2 {

    /* renamed from: i0  reason: collision with root package name */
    public final a4.a f1877i0 = new a4.a(3, this);

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ x f1878j0;

    public m(x xVar) {
        this.f1878j0 = xVar;
    }

    @Override // t3.e
    public final boolean Q(KeyEvent keyEvent) {
        g3.f fVar;
        int i2;
        boolean z10;
        boolean z11;
        int[] iArr = g3.h.f5512a;
        long b10 = t3.c.b(keyEvent);
        Integer num = null;
        int i10 = 2;
        if (t3.a.a(b10, t3.a.f13083b)) {
            fVar = new g3.f(2);
        } else if (t3.a.a(b10, t3.a.f13084c)) {
            fVar = new g3.f(1);
        } else if (t3.a.a(b10, t3.a.f13098r)) {
            if (keyEvent.isShiftPressed()) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            fVar = new g3.f(i2);
        } else if (t3.a.a(b10, t3.a.f13088g)) {
            fVar = new g3.f(4);
        } else if (t3.a.a(b10, t3.a.f13087f)) {
            fVar = new g3.f(3);
        } else if (!t3.a.a(b10, t3.a.f13085d) && !t3.a.a(b10, t3.a.F)) {
            if (!t3.a.a(b10, t3.a.f13086e) && !t3.a.a(b10, t3.a.G)) {
                if (!t3.a.a(b10, t3.a.f13089h) && !t3.a.a(b10, t3.a.f13100t) && !t3.a.a(b10, t3.a.M)) {
                    if (!t3.a.a(b10, t3.a.f13082a) && !t3.a.a(b10, t3.a.f13103w)) {
                        fVar = null;
                    } else {
                        fVar = new g3.f(8);
                    }
                } else {
                    fVar = new g3.f(7);
                }
            } else {
                fVar = new g3.f(6);
            }
        } else {
            fVar = new g3.f(5);
        }
        if (fVar != null) {
            int i11 = fVar.f5505a;
            if (t3.c.c(keyEvent) == 2) {
                x xVar = this.f1878j0;
                ((g3.p) xVar.getFocusOwner()).getClass();
                Boolean e6 = ((g3.p) xVar.getFocusOwner()).e(i11, xVar.getEmbeddedViewFocusRect(), new a4.a(2, fVar));
                if (e6 != null) {
                    z10 = e6.booleanValue();
                } else {
                    z10 = true;
                }
                if (z10) {
                    return true;
                }
                if (i11 == 1 || i11 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (i11 == 5) {
                        num = 33;
                    } else if (i11 == 6) {
                        num = 130;
                    } else if (i11 == 3) {
                        num = 17;
                    } else if (i11 == 4) {
                        num = 66;
                    } else if (i11 == 1) {
                        num = 2;
                    } else if (i11 == 2) {
                        num = 1;
                    }
                    if (num != null) {
                        i10 = num.intValue();
                    }
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = xVar.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, xVar.getView(), i10);
                    if (findNextFocus == null || findNextFocus.equals(xVar)) {
                        return ((g3.p) xVar.getFocusOwner()).h(i11);
                    }
                }
            }
        }
        return false;
    }

    @Override // a4.a0
    public final y3.w0 d(y3.x0 x0Var, y3.u0 u0Var, long j2) {
        y3.i1 e6 = u0Var.e(j2);
        return x0Var.k0(e6.A, e6.B, zb.r.A, this.f1877i0, new a5.t(e6, 1));
    }

    @Override // t3.e
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    @Override // a4.q2
    public final Object k() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // f4.a
    public final Object l(a4.r1 r1Var, a4.n0 n0Var, ec.c cVar) {
        h3.c cVar2;
        long a02 = r1Var.a0(0L);
        h3.c cVar3 = (h3.c) n0Var.b();
        if (cVar3 != null) {
            cVar2 = cVar3.i(a02);
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            this.f1878j0.requestRectangleOnScreen(new Rect((int) cVar2.f6052a, (int) cVar2.f6053b, (int) cVar2.f6054c, (int) cVar2.f6055d), false);
        }
        return yb.y.f14813a;
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
    }
}
