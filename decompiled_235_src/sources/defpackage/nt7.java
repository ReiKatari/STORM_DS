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
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt7  reason: default package */
/* loaded from: classes.dex */
public final class nt7 extends ak7 implements u7 {
    public static final AccelerateInterpolator K = new AccelerateInterpolator();
    public static final DecelerateInterpolator L = new DecelerateInterpolator();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public jp7 E;
    public boolean F;
    public boolean G;
    public final lt7 H;
    public final lt7 I;
    public final j97 J;
    public Context l;
    public Context m;
    public ActionBarOverlayLayout n;
    public ActionBarContainer o;
    public tc1 p;
    public ActionBarContextView q;
    public final View r;
    public boolean s;
    public mt7 t;
    public mt7 u;
    public u63 v;
    public boolean w;
    public final ArrayList x;
    public int y;
    public boolean z;

    public nt7(Activity activity, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        this.z = true;
        this.D = true;
        this.H = new lt7(this, 0);
        this.I = new lt7(this, 1);
        this.J = new j97(this, 13);
        View decorView = activity.getWindow().getDecorView();
        M0(decorView);
        if (!z) {
            this.r = decorView.findViewById(16908290);
        }
    }

    @Override // defpackage.ak7
    public final void A0(boolean z) {
        if (!this.s) {
            B0(z);
        }
    }

    @Override // defpackage.ak7
    public final void B0(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        l87 l87Var = (l87) this.p;
        int i2 = l87Var.b;
        this.s = true;
        l87Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.ak7
    public final void C0(boolean z) {
        jp7 jp7Var;
        this.F = z;
        if (!z && (jp7Var = this.E) != null) {
            jp7Var.a();
        }
    }

    @Override // defpackage.ak7
    public final void D0(String str) {
        l87 l87Var = (l87) this.p;
        l87Var.g = true;
        Toolbar toolbar = l87Var.a;
        l87Var.h = str;
        if ((l87Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (l87Var.g) {
                ao7.o(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.ak7
    public final void E0(CharSequence charSequence) {
        l87 l87Var = (l87) this.p;
        if (!l87Var.g) {
            Toolbar toolbar = l87Var.a;
            l87Var.h = charSequence;
            if ((l87Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l87Var.g) {
                    ao7.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // defpackage.ak7
    public final k8 G0(u63 u63Var) {
        mt7 mt7Var = this.t;
        if (mt7Var != null) {
            mt7Var.a();
        }
        this.n.setHideOnContentScrollEnabled(false);
        this.q.e();
        mt7 mt7Var2 = new mt7(this, this.q.getContext(), u63Var);
        i44 i44Var = mt7Var2.R;
        i44Var.w();
        try {
            if (((eb) mt7Var2.X.B).K(mt7Var2, i44Var)) {
                this.t = mt7Var2;
                mt7Var2.g();
                this.q.c(mt7Var2);
                L0(true);
                return mt7Var2;
            }
            return null;
        } finally {
            i44Var.v();
        }
    }

    public final void L0(boolean z) {
        ip7 i;
        ip7 ip7Var;
        long j;
        boolean z2 = this.C;
        if (z) {
            if (!z2) {
                this.C = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.n;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                O0(false);
            }
        } else if (z2) {
            this.C = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.n;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            O0(false);
        }
        boolean isLaidOut = this.o.isLaidOut();
        tc1 tc1Var = this.p;
        if (isLaidOut) {
            if (z) {
                l87 l87Var = (l87) tc1Var;
                i = ao7.b(l87Var.a);
                i.a(RecyclerView.B1);
                i.c(100L);
                i.d(new k87(l87Var, 4));
                ip7Var = this.q.i(0, 200L);
            } else {
                l87 l87Var2 = (l87) tc1Var;
                ip7 b = ao7.b(l87Var2.a);
                b.a(1.0f);
                b.c(200L);
                b.d(new k87(l87Var2, 0));
                i = this.q.i(8, 100L);
                ip7Var = b;
            }
            jp7 jp7Var = new jp7();
            ArrayList arrayList = jp7Var.a;
            arrayList.add(i);
            View view = (View) i.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) ip7Var.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(ip7Var);
            jp7Var.b();
        } else if (z) {
            ((l87) tc1Var).a.setVisibility(4);
            this.q.setVisibility(0);
        } else {
            ((l87) tc1Var).a.setVisibility(0);
            this.q.setVisibility(8);
        }
    }

    @Override // defpackage.ak7
    public final boolean M() {
        d87 d87Var;
        o44 o44Var;
        tc1 tc1Var = this.p;
        if (tc1Var != null && (d87Var = ((l87) tc1Var).a.L0) != null && d87Var.B != null) {
            d87 d87Var2 = ((l87) tc1Var).a.L0;
            if (d87Var2 == null) {
                o44Var = null;
            } else {
                o44Var = d87Var2.B;
            }
            if (o44Var != null) {
                o44Var.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    public final void M0(View view) {
        String str;
        tc1 wrapper;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.n = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof tc1) {
            wrapper = (tc1) findViewById;
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
        this.p = wrapper;
        this.q = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.o = actionBarContainer;
        tc1 tc1Var = this.p;
        if (tc1Var != null && this.q != null && actionBarContainer != null) {
            Context context = ((l87) tc1Var).a.getContext();
            this.l = context;
            if ((((l87) this.p).b & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.s = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.p.getClass();
            N0(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.l.obtainStyledAttributes(null, m75.a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.n;
                if (actionBarOverlayLayout2.f0) {
                    this.G = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    i.m("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.o;
                WeakHashMap weakHashMap = ao7.a;
                actionBarContainer2.setElevation(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        i.m(nt7.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void N0(boolean z) {
        if (!z) {
            ((l87) this.p).getClass();
            this.o.setTabContainer(null);
        } else {
            this.o.setTabContainer(null);
            ((l87) this.p).getClass();
        }
        this.p.getClass();
        ((l87) this.p).a.setCollapsible(false);
        this.n.setHasNonEmbeddedTabs(false);
    }

    public final void O0(boolean z) {
        boolean z2;
        int[] iArr;
        int[] iArr2;
        boolean z3 = this.A;
        boolean z4 = this.B;
        if (this.C || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = this.D;
        rp1 rp1Var = null;
        j97 j97Var = this.J;
        View view = this.r;
        if (z2) {
            if (!z5) {
                this.D = true;
                jp7 jp7Var = this.E;
                if (jp7Var != null) {
                    jp7Var.a();
                }
                this.o.setVisibility(0);
                int i = this.y;
                lt7 lt7Var = this.I;
                if (i == 0 && (this.F || z)) {
                    this.o.setTranslationY(RecyclerView.B1);
                    float f = -this.o.getHeight();
                    if (z) {
                        this.o.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.o.setTranslationY(f);
                    jp7 jp7Var2 = new jp7();
                    ip7 b = ao7.b(this.o);
                    b.e(RecyclerView.B1);
                    View view2 = (View) b.a.get();
                    if (view2 != null) {
                        if (j97Var != null) {
                            rp1Var = new rp1(j97Var, view2);
                        }
                        view2.animate().setUpdateListener(rp1Var);
                    }
                    boolean z6 = jp7Var2.e;
                    ArrayList arrayList = jp7Var2.a;
                    if (!z6) {
                        arrayList.add(b);
                    }
                    if (this.z && view != null) {
                        view.setTranslationY(f);
                        ip7 b2 = ao7.b(view);
                        b2.e(RecyclerView.B1);
                        if (!jp7Var2.e) {
                            arrayList.add(b2);
                        }
                    }
                    boolean z7 = jp7Var2.e;
                    if (!z7) {
                        jp7Var2.c = L;
                    }
                    if (!z7) {
                        jp7Var2.b = 250L;
                    }
                    if (!z7) {
                        jp7Var2.d = lt7Var;
                    }
                    this.E = jp7Var2;
                    jp7Var2.b();
                } else {
                    this.o.setAlpha(1.0f);
                    this.o.setTranslationY(RecyclerView.B1);
                    if (this.z && view != null) {
                        view.setTranslationY(RecyclerView.B1);
                    }
                    lt7Var.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ao7.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        } else if (z5) {
            this.D = false;
            jp7 jp7Var3 = this.E;
            if (jp7Var3 != null) {
                jp7Var3.a();
            }
            int i2 = this.y;
            lt7 lt7Var2 = this.H;
            if (i2 == 0 && (this.F || z)) {
                this.o.setAlpha(1.0f);
                this.o.setTransitioning(true);
                jp7 jp7Var4 = new jp7();
                float f2 = -this.o.getHeight();
                if (z) {
                    this.o.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                ip7 b3 = ao7.b(this.o);
                b3.e(f2);
                View view3 = (View) b3.a.get();
                if (view3 != null) {
                    if (j97Var != null) {
                        rp1Var = new rp1(j97Var, view3);
                    }
                    view3.animate().setUpdateListener(rp1Var);
                }
                boolean z8 = jp7Var4.e;
                ArrayList arrayList2 = jp7Var4.a;
                if (!z8) {
                    arrayList2.add(b3);
                }
                if (this.z && view != null) {
                    ip7 b4 = ao7.b(view);
                    b4.e(f2);
                    if (!jp7Var4.e) {
                        arrayList2.add(b4);
                    }
                }
                boolean z9 = jp7Var4.e;
                if (!z9) {
                    jp7Var4.c = K;
                }
                if (!z9) {
                    jp7Var4.b = 250L;
                }
                if (!z9) {
                    jp7Var4.d = lt7Var2;
                }
                this.E = jp7Var4;
                jp7Var4.b();
                return;
            }
            lt7Var2.c();
        }
    }

    @Override // defpackage.ak7
    public final void P(boolean z) {
        if (z != this.w) {
            this.w = z;
            ArrayList arrayList = this.x;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            u34.a();
        }
    }

    @Override // defpackage.ak7
    public final int V() {
        return ((l87) this.p).b;
    }

    @Override // defpackage.ak7
    public final Context f0() {
        if (this.m == null) {
            TypedValue typedValue = new TypedValue();
            this.l.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.m = new ContextThemeWrapper(this.l, i);
            } else {
                this.m = this.l;
            }
        }
        return this.m;
    }

    @Override // defpackage.ak7
    public final CharSequence h0() {
        return ((l87) this.p).a.getTitle();
    }

    @Override // defpackage.ak7
    public final void j0() {
        if (!this.A) {
            this.A = true;
            O0(false);
        }
    }

    @Override // defpackage.ak7
    public final void p0() {
        N0(this.l.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.ak7
    public final boolean r0(int i, KeyEvent keyEvent) {
        i44 i44Var;
        mt7 mt7Var = this.t;
        if (mt7Var == null || (i44Var = mt7Var.R) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z = false;
        }
        i44Var.setQwertyMode(z);
        return i44Var.performShortcut(i, keyEvent, 0);
    }

    public nt7(Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.y = 0;
        this.z = true;
        this.D = true;
        this.H = new lt7(this, 0);
        this.I = new lt7(this, 1);
        this.J = new j97(this, 13);
        M0(dialog.getWindow().getDecorView());
    }
}
