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
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep6  reason: default package */
/* loaded from: classes.dex */
public final class ep6 extends t44 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context B;
    public final i44 L;
    public final f44 R;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final z44 d0;
    public PopupWindow.OnDismissListener g0;
    public View h0;
    public View i0;
    public a54 j0;
    public ViewTreeObserver k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public boolean p0;
    public final wr e0 = new wr(this, 3);
    public final wh f0 = new wh(this, 6);
    public int o0 = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [z44, ax3] */
    public ep6(Context context, i44 i44Var, View view, int i, boolean z) {
        this.B = context;
        this.L = i44Var;
        this.X = z;
        this.R = new f44(i44Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.Z = i;
        Resources resources = context.getResources();
        this.Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.h0 = view;
        this.d0 = new ax3(context, null, i, 0);
        i44Var.b(this, context);
    }

    @Override // defpackage.lh6
    public final boolean a() {
        if (!this.l0 && this.d0.v0.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b54
    public final boolean b(it6 it6Var) {
        boolean z;
        if (it6Var.hasVisibleItems()) {
            v44 v44Var = new v44(this.B, it6Var, this.i0, this.X, this.Z, 0);
            a54 a54Var = this.j0;
            v44Var.h = a54Var;
            t44 t44Var = v44Var.i;
            if (t44Var != null) {
                t44Var.g(a54Var);
            }
            int size = it6Var.f.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = it6Var.getItem(i);
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
            v44Var.g = z;
            t44 t44Var2 = v44Var.i;
            if (t44Var2 != null) {
                t44Var2.o(z);
            }
            v44Var.j = this.g0;
            this.g0 = null;
            this.L.c(false);
            z44 z44Var = this.d0;
            int i2 = z44Var.Y;
            int m = z44Var.m();
            if ((Gravity.getAbsoluteGravity(this.o0, this.h0.getLayoutDirection()) & 7) == 5) {
                i2 += this.h0.getWidth();
            }
            if (!v44Var.b()) {
                if (v44Var.e != null) {
                    v44Var.d(i2, m, true, true);
                }
            }
            a54 a54Var2 = this.j0;
            if (a54Var2 != null) {
                a54Var2.M(it6Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.b54
    public final boolean c() {
        return false;
    }

    @Override // defpackage.b54
    public final void d(i44 i44Var, boolean z) {
        if (i44Var == this.L) {
            dismiss();
            a54 a54Var = this.j0;
            if (a54Var != null) {
                a54Var.d(i44Var, z);
            }
        }
    }

    @Override // defpackage.lh6
    public final void dismiss() {
        if (a()) {
            this.d0.dismiss();
        }
    }

    @Override // defpackage.lh6
    public final void e() {
        View view;
        boolean z;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.l0 && (view = this.h0) != null) {
            this.i0 = view;
            z44 z44Var = this.d0;
            pr prVar = z44Var.v0;
            pr prVar2 = z44Var.v0;
            prVar.setOnDismissListener(this);
            z44Var.l0 = this;
            z44Var.u0 = true;
            prVar2.setFocusable(true);
            View view2 = this.i0;
            if (this.k0 == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.k0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.e0);
            }
            view2.addOnAttachStateChangeListener(this.f0);
            z44Var.k0 = view2;
            z44Var.h0 = this.o0;
            boolean z2 = this.m0;
            Context context = this.B;
            f44 f44Var = this.R;
            if (!z2) {
                this.n0 = t44.m(f44Var, context, this.Y);
                this.m0 = true;
            }
            z44Var.q(this.n0);
            prVar2.setInputMethodMode(2);
            Rect rect2 = this.A;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            z44Var.t0 = rect;
            z44Var.e();
            mp1 mp1Var = z44Var.L;
            mp1Var.setOnKeyListener(this);
            if (this.p0) {
                i44 i44Var = this.L;
                if (i44Var.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) mp1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(i44Var.m);
                    }
                    frameLayout.setEnabled(false);
                    mp1Var.addHeaderView(frameLayout, null, false);
                }
            }
            z44Var.n(f44Var);
            z44Var.e();
            return;
        }
        i.m("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.b54
    public final void g(a54 a54Var) {
        this.j0 = a54Var;
    }

    @Override // defpackage.b54
    public final void i() {
        this.m0 = false;
        f44 f44Var = this.R;
        if (f44Var != null) {
            f44Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.lh6
    public final mp1 j() {
        return this.d0.L;
    }

    @Override // defpackage.t44
    public final void n(View view) {
        this.h0 = view;
    }

    @Override // defpackage.t44
    public final void o(boolean z) {
        this.R.L = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.l0 = true;
        this.L.c(true);
        ViewTreeObserver viewTreeObserver = this.k0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.k0 = this.i0.getViewTreeObserver();
            }
            this.k0.removeGlobalOnLayoutListener(this.e0);
            this.k0 = null;
        }
        this.i0.removeOnAttachStateChangeListener(this.f0);
        PopupWindow.OnDismissListener onDismissListener = this.g0;
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

    @Override // defpackage.t44
    public final void p(int i) {
        this.o0 = i;
    }

    @Override // defpackage.t44
    public final void q(int i) {
        this.d0.Y = i;
    }

    @Override // defpackage.t44
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.g0 = onDismissListener;
    }

    @Override // defpackage.t44
    public final void s(boolean z) {
        this.p0 = z;
    }

    @Override // defpackage.t44
    public final void t(int i) {
        this.d0.i(i);
    }

    @Override // defpackage.t44
    public final void l(i44 i44Var) {
    }
}
