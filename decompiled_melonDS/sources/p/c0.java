package p;

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
import b4.v2;
import me.magnum.melonds.R;
import q.d2;
import q.i2;
import q.r1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context B;
    public final l L;
    public final i R;
    public final boolean X;
    public final int Y;
    public final int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final i2 f11074b0;

    /* renamed from: e0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f11077e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f11078f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f11079g0;

    /* renamed from: h0  reason: collision with root package name */
    public w f11080h0;

    /* renamed from: i0  reason: collision with root package name */
    public ViewTreeObserver f11081i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f11082j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11083k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f11084l0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f11086n0;

    /* renamed from: c0  reason: collision with root package name */
    public final d f11075c0 = new d(1, this);

    /* renamed from: d0  reason: collision with root package name */
    public final v2 f11076d0 = new v2(4, this);

    /* renamed from: m0  reason: collision with root package name */
    public int f11085m0 = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [q.i2, q.d2] */
    public c0(Context context, l lVar, View view, int i2, boolean z10) {
        this.B = context;
        this.L = lVar;
        this.X = z10;
        this.R = new i(lVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.Z = i2;
        Resources resources = context.getResources();
        this.Y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f11078f0 = view;
        this.f11074b0 = new d2(context, null, i2, 0);
        lVar.b(this, context);
    }

    @Override // p.x
    public final void a(l lVar, boolean z10) {
        if (lVar == this.L) {
            dismiss();
            w wVar = this.f11080h0;
            if (wVar != null) {
                wVar.a(lVar, z10);
            }
        }
    }

    @Override // p.b0
    public final boolean b() {
        if (!this.f11082j0 && this.f11074b0.f11882t0.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // p.b0
    public final void c() {
        View view;
        boolean z10;
        Rect rect;
        if (b()) {
            return;
        }
        if (!this.f11082j0 && (view = this.f11078f0) != null) {
            this.f11079g0 = view;
            i2 i2Var = this.f11074b0;
            q.y yVar = i2Var.f11882t0;
            q.y yVar2 = i2Var.f11882t0;
            yVar.setOnDismissListener(this);
            i2Var.f11873j0 = this;
            i2Var.f11881s0 = true;
            yVar2.setFocusable(true);
            View view2 = this.f11079g0;
            if (this.f11081i0 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f11081i0 = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f11075c0);
            }
            view2.addOnAttachStateChangeListener(this.f11076d0);
            i2Var.f11872i0 = view2;
            i2Var.f11869f0 = this.f11085m0;
            boolean z11 = this.f11083k0;
            Context context = this.B;
            i iVar = this.R;
            if (!z11) {
                this.f11084l0 = t.m(iVar, context, this.Y);
                this.f11083k0 = true;
            }
            i2Var.r(this.f11084l0);
            yVar2.setInputMethodMode(2);
            Rect rect2 = this.A;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            i2Var.f11880r0 = rect;
            i2Var.c();
            r1 r1Var = i2Var.L;
            r1Var.setOnKeyListener(this);
            if (this.f11086n0) {
                l lVar = this.L;
                if (lVar.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(lVar.m);
                    }
                    frameLayout.setEnabled(false);
                    r1Var.addHeaderView(frameLayout, null, false);
                }
            }
            i2Var.p(iVar);
            i2Var.c();
            return;
        }
        a0.j.p("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // p.x
    public final void d() {
        this.f11083k0 = false;
        i iVar = this.R;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // p.b0
    public final void dismiss() {
        if (b()) {
            this.f11074b0.dismiss();
        }
    }

    @Override // p.b0
    public final r1 e() {
        return this.f11074b0.L;
    }

    @Override // p.x
    public final boolean f(d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            v vVar = new v(this.B, d0Var, this.f11079g0, this.X, this.Z, 0);
            w wVar = this.f11080h0;
            vVar.f11171h = wVar;
            t tVar = vVar.f11172i;
            if (tVar != null) {
                tVar.j(wVar);
            }
            int size = d0Var.f11115f.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    MenuItem item = d0Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i2++;
                } else {
                    z10 = false;
                    break;
                }
            }
            vVar.f11170g = z10;
            t tVar2 = vVar.f11172i;
            if (tVar2 != null) {
                tVar2.o(z10);
            }
            vVar.f11173j = this.f11077e0;
            this.f11077e0 = null;
            this.L.c(false);
            i2 i2Var = this.f11074b0;
            int i10 = i2Var.Y;
            int l10 = i2Var.l();
            if ((Gravity.getAbsoluteGravity(this.f11085m0, this.f11078f0.getLayoutDirection()) & 7) == 5) {
                i10 += this.f11078f0.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f11168e != null) {
                    vVar.d(i10, l10, true, true);
                }
            }
            w wVar2 = this.f11080h0;
            if (wVar2 != null) {
                wVar2.l(d0Var);
            }
            return true;
        }
        return false;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final void j(w wVar) {
        this.f11080h0 = wVar;
    }

    @Override // p.t
    public final void n(View view) {
        this.f11078f0 = view;
    }

    @Override // p.t
    public final void o(boolean z10) {
        this.R.L = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f11082j0 = true;
        this.L.c(true);
        ViewTreeObserver viewTreeObserver = this.f11081i0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f11081i0 = this.f11079g0.getViewTreeObserver();
            }
            this.f11081i0.removeGlobalOnLayoutListener(this.f11075c0);
            this.f11081i0 = null;
        }
        this.f11079g0.removeOnAttachStateChangeListener(this.f11076d0);
        PopupWindow.OnDismissListener onDismissListener = this.f11077e0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // p.t
    public final void p(int i2) {
        this.f11085m0 = i2;
    }

    @Override // p.t
    public final void q(int i2) {
        this.f11074b0.Y = i2;
    }

    @Override // p.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f11077e0 = onDismissListener;
    }

    @Override // p.t
    public final void s(boolean z10) {
        this.f11086n0 = z10;
    }

    @Override // p.t
    public final void t(int i2) {
        this.f11074b0.h(i2);
    }

    @Override // p.t
    public final void l(l lVar) {
    }
}
