package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yi0  reason: default package */
/* loaded from: classes.dex */
public final class yi0 extends ex3 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context B;
    public final int L;
    public final int R;
    public final boolean X;
    public final Handler Y;
    public View i0;
    public View j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public boolean q0;
    public lx3 r0;
    public ViewTreeObserver s0;
    public PopupWindow.OnDismissListener t0;
    public boolean u0;
    public final ArrayList Z = new ArrayList();
    public final ArrayList c0 = new ArrayList();
    public final jr d0 = new jr(2, this);
    public final kh e0 = new kh(1, this);
    public final bq0 f0 = new bq0(20, this);
    public int g0 = 0;
    public int h0 = 0;
    public boolean p0 = false;

    public yi0(Context context, View view, int i, boolean z) {
        this.B = context;
        this.i0 = view;
        this.R = i;
        this.X = z;
        this.k0 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.L = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.Y = new Handler();
    }

    @Override // defpackage.y56
    public final boolean a() {
        ArrayList arrayList = this.c0;
        if (arrayList.size() <= 0 || !((xi0) arrayList.get(0)).a.u0.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.y56
    public final void c() {
        if (!a()) {
            ArrayList arrayList = this.Z;
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                u((uw3) obj);
            }
            arrayList.clear();
            View view = this.i0;
            this.j0 = view;
            if (view != null) {
                if (this.s0 == null) {
                    z = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.s0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.d0);
                }
                this.j0.addOnAttachStateChangeListener(this.e0);
            }
        }
    }

    @Override // defpackage.mx3
    public final void d(lx3 lx3Var) {
        this.r0 = lx3Var;
    }

    @Override // defpackage.y56
    public final void dismiss() {
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        if (size > 0) {
            xi0[] xi0VarArr = (xi0[]) arrayList.toArray(new xi0[size]);
            for (int i = size - 1; i >= 0; i--) {
                xi0 xi0Var = xi0VarArr[i];
                if (xi0Var.a.u0.isShowing()) {
                    xi0Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.mx3
    public final void f(uw3 uw3Var, boolean z) {
        int i;
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (uw3Var == ((xi0) arrayList.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < arrayList.size()) {
                ((xi0) arrayList.get(i3)).b.c(false);
            }
            xi0 xi0Var = (xi0) arrayList.remove(i2);
            uw3 uw3Var2 = xi0Var.b;
            kx3 kx3Var = xi0Var.a;
            cr crVar = kx3Var.u0;
            uw3Var2.r(this);
            if (this.u0) {
                hx3.b(crVar, null);
                crVar.setAnimationStyle(0);
            }
            kx3Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.k0 = ((xi0) arrayList.get(size2 - 1)).c;
            } else {
                if (this.i0.getLayoutDirection() == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.k0 = i;
            }
            if (size2 == 0) {
                dismiss();
                lx3 lx3Var = this.r0;
                if (lx3Var != null) {
                    lx3Var.f(uw3Var, true);
                }
                ViewTreeObserver viewTreeObserver = this.s0;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.s0.removeGlobalOnLayoutListener(this.d0);
                    }
                    this.s0 = null;
                }
                this.j0.removeOnAttachStateChangeListener(this.e0);
                this.t0.onDismiss();
            } else if (z) {
                ((xi0) arrayList.get(0)).b.c(false);
            }
        }
    }

    @Override // defpackage.mx3
    public final void g() {
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((xi0) obj).a.L.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((rw3) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.y56
    public final fl1 h() {
        ArrayList arrayList = this.c0;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((xi0) arrayList.get(arrayList.size() - 1)).a.L;
    }

    @Override // defpackage.mx3
    public final boolean j(rh6 rh6Var) {
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xi0 xi0Var = (xi0) obj;
            if (rh6Var == xi0Var.b) {
                xi0Var.a.L.requestFocus();
                return true;
            }
        }
        if (!rh6Var.hasVisibleItems()) {
            return false;
        }
        l(rh6Var);
        lx3 lx3Var = this.r0;
        if (lx3Var != null) {
            lx3Var.M(rh6Var);
        }
        return true;
    }

    @Override // defpackage.mx3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ex3
    public final void l(uw3 uw3Var) {
        uw3Var.b(this, this.B);
        if (a()) {
            u(uw3Var);
        } else {
            this.Z.add(uw3Var);
        }
    }

    @Override // defpackage.ex3
    public final void n(View view) {
        if (this.i0 != view) {
            this.i0 = view;
            this.h0 = Gravity.getAbsoluteGravity(this.g0, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ex3
    public final void o(boolean z) {
        this.p0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        xi0 xi0Var;
        ArrayList arrayList = this.c0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                xi0Var = (xi0) arrayList.get(i);
                if (!xi0Var.a.u0.isShowing()) {
                    break;
                }
                i++;
            } else {
                xi0Var = null;
                break;
            }
        }
        if (xi0Var != null) {
            xi0Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.ex3
    public final void p(int i) {
        if (this.g0 != i) {
            this.g0 = i;
            this.h0 = Gravity.getAbsoluteGravity(i, this.i0.getLayoutDirection());
        }
    }

    @Override // defpackage.ex3
    public final void q(int i) {
        this.l0 = true;
        this.n0 = i;
    }

    @Override // defpackage.ex3
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.t0 = onDismissListener;
    }

    @Override // defpackage.ex3
    public final void s(boolean z) {
        this.q0 = z;
    }

    @Override // defpackage.ex3
    public final void t(int i) {
        this.m0 = true;
        this.o0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cd  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kx3, yp3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.uw3 r20) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi0.u(uw3):void");
    }
}
