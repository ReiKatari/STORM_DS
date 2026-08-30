package l;

import a6.d1;
import a6.f1;
import a6.n0;
import a6.p0;
import a6.x0;
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
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import q.h1;
import q.h3;
import q.m3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends aj.g implements q.c {
    public static final AccelerateInterpolator J = new AccelerateInterpolator();
    public static final DecelerateInterpolator K = new DecelerateInterpolator();
    public boolean A;
    public boolean B;
    public boolean C;
    public o.j D;
    public boolean E;
    public boolean F;
    public final h0 G;
    public final h0 H;
    public final i0 I;

    /* renamed from: l  reason: collision with root package name */
    public Context f8425l;
    public Context m;

    /* renamed from: n  reason: collision with root package name */
    public ActionBarOverlayLayout f8426n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContainer f8427o;

    /* renamed from: p  reason: collision with root package name */
    public h1 f8428p;

    /* renamed from: q  reason: collision with root package name */
    public ActionBarContextView f8429q;

    /* renamed from: r  reason: collision with root package name */
    public final View f8430r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8431s;

    /* renamed from: t  reason: collision with root package name */
    public j0 f8432t;

    /* renamed from: u  reason: collision with root package name */
    public j0 f8433u;

    /* renamed from: v  reason: collision with root package name */
    public jb.c f8434v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8435w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f8436x;

    /* renamed from: y  reason: collision with root package name */
    public int f8437y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8438z;

    public k0(Activity activity, boolean z10) {
        new ArrayList();
        this.f8436x = new ArrayList();
        this.f8437y = 0;
        this.f8438z = true;
        this.C = true;
        this.G = new h0(this, 0);
        this.H = new h0(this, 1);
        this.I = new i0(0, this);
        View decorView = activity.getWindow().getDecorView();
        D0(decorView);
        if (!z10) {
            this.f8430r = decorView.findViewById(16908290);
        }
    }

    @Override // aj.g
    public final int A() {
        return ((m3) this.f8428p).f11965b;
    }

    public final void C0(boolean z10) {
        f1 b10;
        f1 i2;
        long j2;
        boolean z11 = this.B;
        if (z10) {
            if (!z11) {
                this.B = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8426n;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                F0(false);
            }
        } else if (z11) {
            this.B = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8426n;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            F0(false);
        }
        boolean isLaidOut = this.f8427o.isLaidOut();
        h1 h1Var = this.f8428p;
        if (isLaidOut) {
            if (z10) {
                m3 m3Var = (m3) h1Var;
                i2 = x0.b(m3Var.f11964a);
                i2.a(0.0f);
                i2.c(100L);
                i2.d(new o.i(m3Var, 4));
                b10 = this.f8429q.i(0, 200L);
            } else {
                m3 m3Var2 = (m3) h1Var;
                b10 = x0.b(m3Var2.f11964a);
                b10.a(1.0f);
                b10.c(200L);
                b10.d(new o.i(m3Var2, 0));
                i2 = this.f8429q.i(8, 100L);
            }
            o.j jVar = new o.j();
            ArrayList arrayList = jVar.f10489a;
            arrayList.add(i2);
            View view = (View) i2.f454a.get();
            if (view != null) {
                j2 = view.animate().getDuration();
            } else {
                j2 = 0;
            }
            View view2 = (View) b10.f454a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j2);
            }
            arrayList.add(b10);
            jVar.b();
        } else if (z10) {
            ((m3) h1Var).f11964a.setVisibility(4);
            this.f8429q.setVisibility(0);
        } else {
            ((m3) h1Var).f11964a.setVisibility(0);
            this.f8429q.setVisibility(8);
        }
    }

    public final void D0(View view) {
        String str;
        h1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f8426n = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof h1) {
            wrapper = (h1) findViewById;
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
        this.f8428p = wrapper;
        this.f8429q = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f8427o = actionBarContainer;
        h1 h1Var = this.f8428p;
        if (h1Var != null && this.f8429q != null && actionBarContainer != null) {
            Context context = ((m3) h1Var).f11964a.getContext();
            this.f8425l = context;
            if ((((m3) this.f8428p).f11965b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f8431s = true;
            }
            int i2 = context.getApplicationInfo().targetSdkVersion;
            this.f8428p.getClass();
            E0(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f8425l.obtainStyledAttributes(null, k.a.f7911a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f8426n;
                if (actionBarOverlayLayout2.f927d0) {
                    this.F = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    a0.j.p("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    return;
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f8427o;
                WeakHashMap weakHashMap = x0.f533a;
                p0.j(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        a0.j.p(k0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    @Override // aj.g
    public final Context E() {
        if (this.m == null) {
            TypedValue typedValue = new TypedValue();
            this.f8425l.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.m = new ContextThemeWrapper(this.f8425l, i2);
            } else {
                this.m = this.f8425l;
            }
        }
        return this.m;
    }

    public final void E0(boolean z10) {
        if (!z10) {
            ((m3) this.f8428p).getClass();
            this.f8427o.setTabContainer(null);
        } else {
            this.f8427o.setTabContainer(null);
            ((m3) this.f8428p).getClass();
        }
        this.f8428p.getClass();
        ((m3) this.f8428p).f11964a.setCollapsible(false);
        this.f8426n.setHasNonEmbeddedTabs(false);
    }

    public final void F0(boolean z10) {
        boolean z11;
        int[] iArr;
        int[] iArr2;
        boolean z12 = this.A;
        if (!this.B && z12) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z13 = this.C;
        d1 d1Var = null;
        i0 i0Var = this.I;
        View view = this.f8430r;
        if (z11) {
            if (!z13) {
                this.C = true;
                o.j jVar = this.D;
                if (jVar != null) {
                    jVar.a();
                }
                this.f8427o.setVisibility(0);
                int i2 = this.f8437y;
                h0 h0Var = this.H;
                if (i2 == 0 && (this.E || z10)) {
                    this.f8427o.setTranslationY(0.0f);
                    float f8 = -this.f8427o.getHeight();
                    if (z10) {
                        this.f8427o.getLocationInWindow(new int[]{0, 0});
                        f8 -= iArr2[1];
                    }
                    this.f8427o.setTranslationY(f8);
                    o.j jVar2 = new o.j();
                    f1 b10 = x0.b(this.f8427o);
                    b10.e(0.0f);
                    View view2 = (View) b10.f454a.get();
                    if (view2 != null) {
                        if (i0Var != null) {
                            d1Var = new d1(i0Var, view2);
                        }
                        view2.animate().setUpdateListener(d1Var);
                    }
                    boolean z14 = jVar2.f10493e;
                    ArrayList arrayList = jVar2.f10489a;
                    if (!z14) {
                        arrayList.add(b10);
                    }
                    if (this.f8438z && view != null) {
                        view.setTranslationY(f8);
                        f1 b11 = x0.b(view);
                        b11.e(0.0f);
                        if (!jVar2.f10493e) {
                            arrayList.add(b11);
                        }
                    }
                    boolean z15 = jVar2.f10493e;
                    if (!z15) {
                        jVar2.f10491c = K;
                    }
                    if (!z15) {
                        jVar2.f10490b = 250L;
                    }
                    if (!z15) {
                        jVar2.f10492d = h0Var;
                    }
                    this.D = jVar2;
                    jVar2.b();
                } else {
                    this.f8427o.setAlpha(1.0f);
                    this.f8427o.setTranslationY(0.0f);
                    if (this.f8438z && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    h0Var.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f8426n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = x0.f533a;
                    n0.c(actionBarOverlayLayout);
                }
            }
        } else if (z13) {
            this.C = false;
            o.j jVar3 = this.D;
            if (jVar3 != null) {
                jVar3.a();
            }
            int i10 = this.f8437y;
            h0 h0Var2 = this.G;
            if (i10 == 0 && (this.E || z10)) {
                this.f8427o.setAlpha(1.0f);
                this.f8427o.setTransitioning(true);
                o.j jVar4 = new o.j();
                float f10 = -this.f8427o.getHeight();
                if (z10) {
                    this.f8427o.getLocationInWindow(new int[]{0, 0});
                    f10 -= iArr[1];
                }
                f1 b12 = x0.b(this.f8427o);
                b12.e(f10);
                View view3 = (View) b12.f454a.get();
                if (view3 != null) {
                    if (i0Var != null) {
                        d1Var = new d1(i0Var, view3);
                    }
                    view3.animate().setUpdateListener(d1Var);
                }
                boolean z16 = jVar4.f10493e;
                ArrayList arrayList2 = jVar4.f10489a;
                if (!z16) {
                    arrayList2.add(b12);
                }
                if (this.f8438z && view != null) {
                    f1 b13 = x0.b(view);
                    b13.e(f10);
                    if (!jVar4.f10493e) {
                        arrayList2.add(b13);
                    }
                }
                boolean z17 = jVar4.f10493e;
                if (!z17) {
                    jVar4.f10491c = J;
                }
                if (!z17) {
                    jVar4.f10490b = 250L;
                }
                if (!z17) {
                    jVar4.f10492d = h0Var2;
                }
                this.D = jVar4;
                jVar4.b();
                return;
            }
            h0Var2.a();
        }
    }

    @Override // aj.g
    public final void Q() {
        E0(this.f8425l.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // aj.g
    public final boolean S(int i2, KeyEvent keyEvent) {
        p.l lVar;
        j0 j0Var = this.f8432t;
        if (j0Var == null || (lVar = j0Var.R) == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z10 = false;
        }
        lVar.setQwertyMode(z10);
        return lVar.performShortcut(i2, keyEvent, 0);
    }

    @Override // aj.g
    public final void g0(boolean z10) {
        if (!this.f8431s) {
            h0(z10);
        }
    }

    @Override // aj.g
    public final void h0(boolean z10) {
        int i2;
        if (z10) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        m3 m3Var = (m3) this.f8428p;
        int i10 = m3Var.f11965b;
        this.f8431s = true;
        m3Var.a((i2 & 4) | (i10 & (-5)));
    }

    @Override // aj.g
    public final void m0(boolean z10) {
        o.j jVar;
        this.E = z10;
        if (!z10 && (jVar = this.D) != null) {
            jVar.a();
        }
    }

    @Override // aj.g
    public final boolean n() {
        h3 h3Var;
        p.n nVar;
        h1 h1Var = this.f8428p;
        if (h1Var != null && (h3Var = ((m3) h1Var).f11964a.J0) != null && h3Var.B != null) {
            h3 h3Var2 = ((m3) h1Var).f11964a.J0;
            if (h3Var2 == null) {
                nVar = null;
            } else {
                nVar = h3Var2.B;
            }
            if (nVar != null) {
                nVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // aj.g
    public final void o0(String str) {
        m3 m3Var = (m3) this.f8428p;
        m3Var.f11970g = true;
        Toolbar toolbar = m3Var.f11964a;
        m3Var.f11971h = str;
        if ((m3Var.f11965b & 8) != 0) {
            toolbar.setTitle(str);
            if (m3Var.f11970g) {
                x0.p(toolbar.getRootView(), str);
            }
        }
    }

    @Override // aj.g
    public final void p0(CharSequence charSequence) {
        m3 m3Var = (m3) this.f8428p;
        if (!m3Var.f11970g) {
            Toolbar toolbar = m3Var.f11964a;
            m3Var.f11971h = charSequence;
            if ((m3Var.f11965b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (m3Var.f11970g) {
                    x0.p(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // aj.g
    public final void r(boolean z10) {
        if (z10 != this.f8435w) {
            this.f8435w = z10;
            ArrayList arrayList = this.f8436x;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            m9.o.b();
        }
    }

    @Override // aj.g
    public final o.a r0(jb.c cVar) {
        j0 j0Var = this.f8432t;
        if (j0Var != null) {
            j0Var.a();
        }
        this.f8426n.setHideOnContentScrollEnabled(false);
        this.f8429q.e();
        j0 j0Var2 = new j0(this, this.f8429q.getContext(), cVar);
        p.l lVar = j0Var2.R;
        lVar.w();
        try {
            if (((b9.e) j0Var2.X.B).G(j0Var2, lVar)) {
                this.f8432t = j0Var2;
                j0Var2.i();
                this.f8429q.c(j0Var2);
                C0(true);
                return j0Var2;
            }
            return null;
        } finally {
            lVar.v();
        }
    }

    public k0(Dialog dialog) {
        new ArrayList();
        this.f8436x = new ArrayList();
        this.f8437y = 0;
        this.f8438z = true;
        this.C = true;
        this.G = new h0(this, 0);
        this.H = new h0(this, 1);
        this.I = new i0(0, this);
        D0(dialog.getWindow().getDecorView());
    }
}
