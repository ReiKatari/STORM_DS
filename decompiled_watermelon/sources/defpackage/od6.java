package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od6  reason: default package */
/* loaded from: classes.dex */
public final class od6 extends ex3 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context B;
    public final uw3 L;
    public final rw3 R;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final kx3 c0;
    public PopupWindow.OnDismissListener f0;
    public View g0;
    public View h0;
    public lx3 i0;
    public ViewTreeObserver j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public boolean o0;
    public final jr d0 = new jr(3, this);
    public final kh e0 = new kh(6, this);
    public int n0 = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [kx3, yp3] */
    public od6(Context context, uw3 uw3Var, View view, int i, boolean z) {
        this.B = context;
        this.L = uw3Var;
        this.X = z;
        this.R = new rw3(uw3Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.Z = i;
        Resources resources = context.getResources();
        this.Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g0 = view;
        this.c0 = new yp3(context, null, i, 0);
        uw3Var.b(this, context);
    }

    @Override // defpackage.y56
    public final boolean a() {
        if (!this.k0 && this.c0.u0.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.y56
    public final void c() {
        View view;
        boolean z;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.k0 && (view = this.g0) != null) {
            this.h0 = view;
            kx3 kx3Var = this.c0;
            cr crVar = kx3Var.u0;
            cr crVar2 = kx3Var.u0;
            crVar.setOnDismissListener(this);
            kx3Var.k0 = this;
            kx3Var.t0 = true;
            crVar2.setFocusable(true);
            View view2 = this.h0;
            if (this.j0 == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.j0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.d0);
            }
            view2.addOnAttachStateChangeListener(this.e0);
            kx3Var.j0 = view2;
            kx3Var.g0 = this.n0;
            boolean z2 = this.l0;
            Context context = this.B;
            rw3 rw3Var = this.R;
            if (!z2) {
                this.m0 = ex3.m(rw3Var, context, this.Y);
                this.l0 = true;
            }
            kx3Var.p(this.m0);
            crVar2.setInputMethodMode(2);
            Rect rect2 = this.A;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            kx3Var.s0 = rect;
            kx3Var.c();
            fl1 fl1Var = kx3Var.L;
            fl1Var.setOnKeyListener(this);
            if (this.o0) {
                uw3 uw3Var = this.L;
                if (uw3Var.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) fl1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(uw3Var.m);
                    }
                    frameLayout.setEnabled(false);
                    fl1Var.addHeaderView(frameLayout, null, false);
                }
            }
            kx3Var.n(rw3Var);
            kx3Var.c();
            return;
        }
        i.n("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.mx3
    public final void d(lx3 lx3Var) {
        this.i0 = lx3Var;
    }

    @Override // defpackage.y56
    public final void dismiss() {
        if (a()) {
            this.c0.dismiss();
        }
    }

    @Override // defpackage.mx3
    public final void f(uw3 uw3Var, boolean z) {
        if (uw3Var == this.L) {
            dismiss();
            lx3 lx3Var = this.i0;
            if (lx3Var != null) {
                lx3Var.f(uw3Var, z);
            }
        }
    }

    @Override // defpackage.mx3
    public final void g() {
        this.l0 = false;
        rw3 rw3Var = this.R;
        if (rw3Var != null) {
            rw3Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.y56
    public final fl1 h() {
        return this.c0.L;
    }

    @Override // defpackage.mx3
    public final boolean j(rh6 rh6Var) {
        boolean z;
        if (rh6Var.hasVisibleItems()) {
            gx3 gx3Var = new gx3(this.B, rh6Var, this.h0, this.X, this.Z, 0);
            lx3 lx3Var = this.i0;
            gx3Var.h = lx3Var;
            ex3 ex3Var = gx3Var.i;
            if (ex3Var != null) {
                ex3Var.d(lx3Var);
            }
            int size = rh6Var.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = rh6Var.getItem(i);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            gx3Var.g = z;
            ex3 ex3Var2 = gx3Var.i;
            if (ex3Var2 != null) {
                ex3Var2.o(z);
            }
            gx3Var.j = this.f0;
            this.f0 = null;
            this.L.c(false);
            kx3 kx3Var = this.c0;
            int i2 = kx3Var.Y;
            int l = kx3Var.l();
            if ((Gravity.getAbsoluteGravity(this.n0, this.g0.getLayoutDirection()) & 7) == 5) {
                i2 += this.g0.getWidth();
            }
            if (!gx3Var.b()) {
                if (gx3Var.e != null) {
                    gx3Var.d(i2, l, true, true);
                }
            }
            lx3 lx3Var2 = this.i0;
            if (lx3Var2 != null) {
                lx3Var2.M(rh6Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.mx3
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ex3
    public final void n(View view) {
        this.g0 = view;
    }

    @Override // defpackage.ex3
    public final void o(boolean z) {
        this.R.L = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.k0 = true;
        this.L.c(true);
        ViewTreeObserver viewTreeObserver = this.j0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.j0 = this.h0.getViewTreeObserver();
            }
            this.j0.removeGlobalOnLayoutListener(this.d0);
            this.j0 = null;
        }
        this.h0.removeOnAttachStateChangeListener(this.e0);
        PopupWindow.OnDismissListener onDismissListener = this.f0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.n0 = i;
    }

    @Override // defpackage.ex3
    public final void q(int i) {
        this.c0.Y = i;
    }

    @Override // defpackage.ex3
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f0 = onDismissListener;
    }

    @Override // defpackage.ex3
    public final void s(boolean z) {
        this.o0 = z;
    }

    @Override // defpackage.ex3
    public final void t(int i) {
        this.c0.g(i);
    }

    @Override // defpackage.ex3
    public final void l(uw3 uw3Var) {
    }
}
