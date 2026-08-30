package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: le7  reason: default package */
/* loaded from: classes.dex */
public final class le7 extends ct3 implements t7 {
    public static final AccelerateInterpolator N0 = new AccelerateInterpolator();
    public static final DecelerateInterpolator O0 = new DecelerateInterpolator();
    public final ArrayList A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public ib7 H0;
    public boolean I0;
    public boolean J0;
    public final je7 K0;
    public final je7 L0;
    public final u57 M0;
    public Context o0;
    public Context p0;
    public ActionBarOverlayLayout q0;
    public ActionBarContainer r0;
    public c91 s0;
    public ActionBarContextView t0;
    public final View u0;
    public boolean v0;
    public ke7 w0;
    public ke7 x0;
    public q03 y0;
    public boolean z0;

    public le7(Activity activity, boolean z) {
        new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = 0;
        this.C0 = true;
        this.G0 = true;
        this.K0 = new je7(this, 0);
        this.L0 = new je7(this, 1);
        this.M0 = new u57(10, this);
        View decorView = activity.getWindow().getDecorView();
        Z0(decorView);
        if (!z) {
            this.u0 = decorView.findViewById(16908290);
        }
    }

    @Override // defpackage.ct3
    public final boolean B0(int i, KeyEvent keyEvent) {
        uw3 uw3Var;
        ke7 ke7Var = this.w0;
        if (ke7Var == null || (uw3Var = ke7Var.R) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        uw3Var.setQwertyMode(z);
        return uw3Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ct3
    public final void J0(boolean z) {
        if (!this.v0) {
            K0(z);
        }
    }

    @Override // defpackage.ct3
    public final void K0(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        yv6 yv6Var = (yv6) this.s0;
        int i2 = yv6Var.b;
        this.v0 = true;
        yv6Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.ct3
    public final void L0(boolean z) {
        ib7 ib7Var;
        this.I0 = z;
        if (!z && (ib7Var = this.H0) != null) {
            ib7Var.a();
        }
    }

    @Override // defpackage.ct3
    public final void M0(String str) {
        yv6 yv6Var = (yv6) this.s0;
        yv6Var.g = true;
        Toolbar toolbar = yv6Var.a;
        yv6Var.h = str;
        if ((yv6Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (yv6Var.g) {
                aa7.o(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.ct3
    public final void N0(CharSequence charSequence) {
        yv6 yv6Var = (yv6) this.s0;
        if (!yv6Var.g) {
            Toolbar toolbar = yv6Var.a;
            yv6Var.h = charSequence;
            if ((yv6Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (yv6Var.g) {
                    aa7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // defpackage.ct3
    public final void O0() {
        if (this.D0) {
            this.D0 = false;
            b1(false);
        }
    }

    @Override // defpackage.ct3
    public final boolean P() {
        pv6 pv6Var;
        zw3 zw3Var;
        c91 c91Var = this.s0;
        if (c91Var != null && (pv6Var = ((yv6) c91Var).a.K0) != null && pv6Var.B != null) {
            pv6 pv6Var2 = ((yv6) c91Var).a.K0;
            if (pv6Var2 == null) {
                zw3Var = null;
            } else {
                zw3Var = pv6Var2.B;
            }
            if (zw3Var != null) {
                zw3Var.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ct3
    public final j8 Q0(q03 q03Var) {
        ke7 ke7Var = this.w0;
        if (ke7Var != null) {
            ke7Var.a();
        }
        this.q0.setHideOnContentScrollEnabled(false);
        this.t0.e();
        ke7 ke7Var2 = new ke7(this, this.t0.getContext(), q03Var);
        uw3 uw3Var = ke7Var2.R;
        uw3Var.w();
        try {
            if (((q9) ke7Var2.X.B).J(ke7Var2, uw3Var)) {
                this.w0 = ke7Var2;
                ke7Var2.g();
                this.t0.c(ke7Var2);
                Y0(true);
                return ke7Var2;
            }
            return null;
        } finally {
            uw3Var.v();
        }
    }

    @Override // defpackage.ct3
    public final void Y(boolean z) {
        if (z != this.z0) {
            this.z0 = z;
            ArrayList arrayList = this.A0;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            c44.b();
        }
    }

    public final void Y0(boolean z) {
        hb7 i;
        hb7 hb7Var;
        long j;
        boolean z2 = this.F0;
        if (z) {
            if (!z2) {
                this.F0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.q0;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                b1(false);
            }
        } else if (z2) {
            this.F0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.q0;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            b1(false);
        }
        boolean isLaidOut = this.r0.isLaidOut();
        c91 c91Var = this.s0;
        if (isLaidOut) {
            if (z) {
                yv6 yv6Var = (yv6) c91Var;
                i = aa7.b(yv6Var.a);
                i.a(RecyclerView.A1);
                i.c(100L);
                i.d(new xv6(yv6Var, 4));
                hb7Var = this.t0.i(0, 200L);
            } else {
                yv6 yv6Var2 = (yv6) c91Var;
                hb7 b = aa7.b(yv6Var2.a);
                b.a(1.0f);
                b.c(200L);
                b.d(new xv6(yv6Var2, 0));
                i = this.t0.i(8, 100L);
                hb7Var = b;
            }
            ib7 ib7Var = new ib7();
            ArrayList arrayList = ib7Var.a;
            arrayList.add(i);
            View view = (View) i.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) hb7Var.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(hb7Var);
            ib7Var.b();
        } else if (z) {
            ((yv6) c91Var).a.setVisibility(4);
            this.t0.setVisibility(0);
        } else {
            ((yv6) c91Var).a.setVisibility(0);
            this.t0.setVisibility(8);
        }
    }

    public final void Z0(View view) {
        String str;
        c91 wrapper;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.q0 = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof c91) {
            wrapper = (c91) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.s0 = wrapper;
        this.t0 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.r0 = actionBarContainer;
        c91 c91Var = this.s0;
        if (c91Var != null && this.t0 != null && actionBarContainer != null) {
            Context context = ((yv6) c91Var).a.getContext();
            this.o0 = context;
            if ((((yv6) this.s0).b & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.v0 = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.s0.getClass();
            a1(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.o0.obtainStyledAttributes(null, by4.a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.q0;
                if (actionBarOverlayLayout2.e0) {
                    this.J0 = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    i.n("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.r0;
                WeakHashMap weakHashMap = aa7.a;
                actionBarContainer2.setElevation(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        i.n(le7.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void a1(boolean z) {
        if (!z) {
            ((yv6) this.s0).getClass();
            this.r0.setTabContainer(null);
        } else {
            this.r0.setTabContainer(null);
            ((yv6) this.s0).getClass();
        }
        this.s0.getClass();
        ((yv6) this.s0).a.setCollapsible(false);
        this.q0.setHasNonEmbeddedTabs(false);
    }

    public final void b1(boolean z) {
        boolean z2;
        int[] iArr;
        int[] iArr2;
        boolean z3 = this.D0;
        boolean z4 = this.E0;
        if (this.F0 || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = this.G0;
        kl1 kl1Var = null;
        u57 u57Var = this.M0;
        View view = this.u0;
        if (z2) {
            if (!z5) {
                this.G0 = true;
                ib7 ib7Var = this.H0;
                if (ib7Var != null) {
                    ib7Var.a();
                }
                this.r0.setVisibility(0);
                int i = this.B0;
                je7 je7Var = this.L0;
                if (i == 0 && (this.I0 || z)) {
                    this.r0.setTranslationY(RecyclerView.A1);
                    float f = -this.r0.getHeight();
                    if (z) {
                        this.r0.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.r0.setTranslationY(f);
                    ib7 ib7Var2 = new ib7();
                    hb7 b = aa7.b(this.r0);
                    b.e(RecyclerView.A1);
                    View view2 = (View) b.a.get();
                    if (view2 != null) {
                        if (u57Var != null) {
                            kl1Var = new kl1(u57Var, view2);
                        }
                        view2.animate().setUpdateListener(kl1Var);
                    }
                    boolean z6 = ib7Var2.e;
                    ArrayList arrayList = ib7Var2.a;
                    if (!z6) {
                        arrayList.add(b);
                    }
                    if (this.C0 && view != null) {
                        view.setTranslationY(f);
                        hb7 b2 = aa7.b(view);
                        b2.e(RecyclerView.A1);
                        if (!ib7Var2.e) {
                            arrayList.add(b2);
                        }
                    }
                    boolean z7 = ib7Var2.e;
                    if (!z7) {
                        ib7Var2.c = O0;
                    }
                    if (!z7) {
                        ib7Var2.b = 250L;
                    }
                    if (!z7) {
                        ib7Var2.d = je7Var;
                    }
                    this.H0 = ib7Var2;
                    ib7Var2.b();
                } else {
                    this.r0.setAlpha(1.0f);
                    this.r0.setTranslationY(RecyclerView.A1);
                    if (this.C0 && view != null) {
                        view.setTranslationY(RecyclerView.A1);
                    }
                    je7Var.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.q0;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = aa7.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (z5) {
            this.G0 = false;
            ib7 ib7Var3 = this.H0;
            if (ib7Var3 != null) {
                ib7Var3.a();
            }
            int i2 = this.B0;
            je7 je7Var2 = this.K0;
            if (i2 == 0 && (this.I0 || z)) {
                this.r0.setAlpha(1.0f);
                this.r0.setTransitioning(true);
                ib7 ib7Var4 = new ib7();
                float f2 = -this.r0.getHeight();
                if (z) {
                    this.r0.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                hb7 b3 = aa7.b(this.r0);
                b3.e(f2);
                View view3 = (View) b3.a.get();
                if (view3 != null) {
                    if (u57Var != null) {
                        kl1Var = new kl1(u57Var, view3);
                    }
                    view3.animate().setUpdateListener(kl1Var);
                }
                boolean z8 = ib7Var4.e;
                ArrayList arrayList2 = ib7Var4.a;
                if (!z8) {
                    arrayList2.add(b3);
                }
                if (this.C0 && view != null) {
                    hb7 b4 = aa7.b(view);
                    b4.e(f2);
                    if (!ib7Var4.e) {
                        arrayList2.add(b4);
                    }
                }
                boolean z9 = ib7Var4.e;
                if (!z9) {
                    ib7Var4.c = N0;
                }
                if (!z9) {
                    ib7Var4.b = 250L;
                }
                if (!z9) {
                    ib7Var4.d = je7Var2;
                }
                this.H0 = ib7Var4;
                ib7Var4.b();
                return;
            }
            je7Var2.a();
        }
    }

    @Override // defpackage.ct3
    public final int j0() {
        return ((yv6) this.s0).b;
    }

    @Override // defpackage.ct3
    public final Context p0() {
        if (this.p0 == null) {
            TypedValue typedValue = new TypedValue();
            this.o0.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.p0 = new ContextThemeWrapper(this.o0, i);
            } else {
                this.p0 = this.o0;
            }
        }
        return this.p0;
    }

    @Override // defpackage.ct3
    public final CharSequence q0() {
        return ((yv6) this.s0).a.getTitle();
    }

    @Override // defpackage.ct3
    public final void s0() {
        if (!this.D0) {
            this.D0 = true;
            b1(false);
        }
    }

    @Override // defpackage.ct3
    public final void z0() {
        a1(this.o0.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    public le7(Dialog dialog) {
        new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = 0;
        this.C0 = true;
        this.G0 = true;
        this.K0 = new je7(this, 0);
        this.L0 = new je7(this, 1);
        this.M0 = new u57(10, this);
        Z0(dialog.getWindow().getDecorView());
    }
}
