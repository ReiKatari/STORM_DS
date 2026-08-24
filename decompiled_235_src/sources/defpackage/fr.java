package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.ModelPPM;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr  reason: default package */
/* loaded from: classes.dex */
public final class fr extends tq implements g44, LayoutInflater.Factory2 {
    public static final ci6 c1 = new ci6(0);
    public static final int[] d1 = {16842836};
    public static final boolean e1 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public er[] G0;
    public er H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public Configuration M0;
    public final int N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public br R0;
    public br S0;
    public boolean T0;
    public int U0;
    public boolean W0;
    public Rect X0;
    public Rect Y0;
    public ys Z0;
    public OnBackInvokedDispatcher a1;
    public OnBackInvokedCallback b1;
    public final Object f0;
    public final Context g0;
    public Window h0;
    public ar i0;
    public ak7 j0;
    public ku6 k0;
    public CharSequence l0;
    public ActionBarOverlayLayout m0;
    public vq n0;
    public vq o0;
    public k8 p0;
    public ActionBarContextView q0;
    public PopupWindow r0;
    public uq s0;
    public boolean u0;
    public ViewGroup v0;
    public TextView w0;
    public View x0;
    public boolean y0;
    public boolean z0;
    public ip7 t0 = null;
    public final uq V0 = new uq(this, 0);

    public fr(Context context, Window window, mq mqVar, Object obj) {
        jq jqVar = null;
        this.N0 = -100;
        this.g0 = context;
        this.f0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof jq) {
                        jqVar = (jq) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (jqVar != null) {
                this.N0 = ((fr) jqVar.v()).N0;
            }
        }
        if (this.N0 == -100) {
            String name = this.f0.getClass().getName();
            ci6 ci6Var = c1;
            Integer num = (Integer) ci6Var.get(name);
            if (num != null) {
                this.N0 = num.intValue();
                ci6Var.remove(this.f0.getClass().getName());
            }
        }
        if (window != null) {
            r(window);
        }
        ir.d();
    }

    public static hy3 s(Context context) {
        hy3 hy3Var;
        hy3 hy3Var2;
        Locale b;
        if (Build.VERSION.SDK_INT >= 33 || (hy3Var = tq.L) == null) {
            return null;
        }
        hy3 b2 = yq.b(context.getApplicationContext().getResources().getConfiguration());
        if (hy3Var.a.a.isEmpty()) {
            hy3Var2 = hy3.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < b2.c() + hy3Var.c(); i++) {
                if (i < hy3Var.c()) {
                    b = hy3Var.b(i);
                } else {
                    b = b2.b(i - hy3Var.c());
                }
                if (b != null) {
                    linkedHashSet.add(b);
                }
            }
            hy3Var2 = new hy3(new iy3(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (hy3Var2.a.a.isEmpty()) {
            return b2;
        }
        return hy3Var2;
    }

    public static Configuration w(Context context, int i, hy3 hy3Var, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.B1;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (hy3Var != null) {
            yq.d(configuration2, hy3Var);
        }
        return configuration2;
    }

    public final void A() {
        if (this.h0 == null) {
            Object obj = this.f0;
            if (obj instanceof Activity) {
                r(((Activity) obj).getWindow());
            }
        }
        if (this.h0 != null) {
            return;
        }
        i.m("We have not been given a Window");
    }

    public final d2 B(Context context) {
        if (this.R0 == null) {
            if (m44.X == null) {
                Context applicationContext = context.getApplicationContext();
                m44.X = new m44(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.R0 = new br(this, m44.X);
        }
        return this.R0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, er] */
    public final er C(int i) {
        Object[] objArr = this.G0;
        if (objArr == null || objArr.length <= i) {
            er[] erVarArr = new er[i + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, erVarArr, 0, objArr.length);
            }
            this.G0 = erVarArr;
            objArr = erVarArr;
        }
        er erVar = objArr[i];
        if (erVar == 0) {
            ?? obj = new Object();
            obj.a = i;
            obj.n = false;
            objArr[i] = obj;
            return obj;
        }
        return erVar;
    }

    public final void D() {
        z();
        if (this.A0 && this.j0 == null) {
            Object obj = this.f0;
            if (obj instanceof Activity) {
                this.j0 = new nt7((Activity) obj, this.B0);
            } else if (obj instanceof Dialog) {
                this.j0 = new nt7((Dialog) obj);
            }
            ak7 ak7Var = this.j0;
            if (ak7Var != null) {
                ak7Var.A0(this.W0);
            }
        }
    }

    public final void E(int i) {
        this.U0 = (1 << i) | this.U0;
        if (!this.T0) {
            View decorView = this.h0.getDecorView();
            WeakHashMap weakHashMap = ao7.a;
            decorView.postOnAnimation(this.V0);
            this.T0 = true;
        }
    }

    public final int F(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            if (this.S0 == null) {
                                this.S0 = new br(this, context);
                            }
                            return this.S0.g();
                        }
                        i.m("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        return 0;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return B(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean G() {
        boolean z = this.I0;
        this.I0 = false;
        er C = C(0);
        if (C.m) {
            if (!z) {
                v(C, true);
                return true;
            }
        } else {
            k8 k8Var = this.p0;
            if (k8Var != null) {
                k8Var.a();
                return true;
            }
            D();
            ak7 ak7Var = this.j0;
            if (ak7Var == null || !ak7Var.M()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r6.j() != false) goto L19;
     */
    @Override // defpackage.g44
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(i44 i44Var) {
        ActionMenuView actionMenuView;
        g8 g8Var;
        ActionBarOverlayLayout actionBarOverlayLayout = this.m0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((l87) actionBarOverlayLayout.d0).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.A) != null && actionMenuView.r0) {
                if (ViewConfiguration.get(this.g0).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.m0;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((l87) actionBarOverlayLayout2.d0).a.A;
                    if (actionMenuView2 != null) {
                        g8 g8Var2 = actionMenuView2.s0;
                        if (g8Var2 != null) {
                            if (g8Var2.q0 == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.h0.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.m0;
                actionBarOverlayLayout3.k();
                if (((l87) actionBarOverlayLayout3.d0).a.q()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.m0;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((l87) actionBarOverlayLayout4.d0).a.A;
                    if (actionMenuView3 != null && (g8Var = actionMenuView3.s0) != null) {
                        g8Var.e();
                    }
                    if (!this.L0) {
                        callback.onPanelClosed(108, C(0).h);
                        return;
                    }
                    return;
                } else if (callback != null && !this.L0) {
                    if (this.T0 && (1 & this.U0) != 0) {
                        View decorView = this.h0.getDecorView();
                        uq uqVar = this.V0;
                        decorView.removeCallbacks(uqVar);
                        uqVar.run();
                    }
                    er C = C(0);
                    i44 i44Var2 = C.h;
                    if (i44Var2 != null && !C.o && callback.onPreparePanel(0, C.g, i44Var2)) {
                        callback.onMenuOpened(108, C.h);
                        ActionBarOverlayLayout actionBarOverlayLayout5 = this.m0;
                        actionBarOverlayLayout5.k();
                        ((l87) actionBarOverlayLayout5.d0).a.w();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        er C2 = C(0);
        C2.n = true;
        v(C2, false);
        I(C2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0156, code lost:
        if (r2 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
        if (r2.Y.getCount() > 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(er erVar, KeyEvent keyEvent) {
        Context context;
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = erVar.m;
        int i2 = erVar.a;
        if (!z && !this.L0) {
            Context context2 = this.g0;
            if (i2 != 0 || (context2.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback callback = this.h0.getCallback();
                if (callback != null && !callback.onMenuOpened(i2, erVar.h)) {
                    v(erVar, true);
                    return;
                }
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                if (windowManager != null && K(erVar, keyEvent)) {
                    dr drVar = erVar.e;
                    if (drVar != null && !erVar.n) {
                        View view = erVar.g;
                        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                            i = -1;
                            erVar.l = false;
                            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                            layoutParams2.gravity = erVar.c;
                            layoutParams2.windowAnimations = erVar.d;
                            windowManager.addView(erVar.e, layoutParams2);
                            erVar.m = true;
                            if (i2 != 0) {
                                M();
                                return;
                            }
                            return;
                        }
                    } else {
                        if (drVar == null) {
                            D();
                            ak7 ak7Var = this.j0;
                            if (ak7Var != null) {
                                context = ak7Var.f0();
                            } else {
                                context = null;
                            }
                            if (context != null) {
                                context2 = context;
                            }
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme newTheme = context2.getResources().newTheme();
                            newTheme.setTo(context2.getTheme());
                            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                            int i3 = typedValue.resourceId;
                            if (i3 != 0) {
                                newTheme.applyStyle(i3, true);
                            }
                            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                            int i4 = typedValue.resourceId;
                            if (i4 != 0) {
                                newTheme.applyStyle(i4, true);
                            } else {
                                newTheme.applyStyle(2132017807, true);
                            }
                            p41 p41Var = new p41(context2, 0);
                            p41Var.getTheme().setTo(newTheme);
                            erVar.j = p41Var;
                            TypedArray obtainStyledAttributes = p41Var.obtainStyledAttributes(m75.j);
                            erVar.b = obtainStyledAttributes.getResourceId(86, 0);
                            erVar.d = obtainStyledAttributes.getResourceId(1, 0);
                            obtainStyledAttributes.recycle();
                            erVar.e = new dr(this, erVar.j);
                            erVar.c = 81;
                        } else if (erVar.n && drVar.getChildCount() > 0) {
                            erVar.e.removeAllViews();
                        }
                        View view2 = erVar.g;
                        if (view2 != null) {
                            erVar.f = view2;
                        } else {
                            if (erVar.h != null) {
                                if (this.o0 == null) {
                                    this.o0 = new vq(this, 3);
                                }
                                vq vqVar = this.o0;
                                if (erVar.i == null) {
                                    uw3 uw3Var = new uw3(erVar.j);
                                    erVar.i = uw3Var;
                                    uw3Var.X = vqVar;
                                    i44 i44Var = erVar.h;
                                    i44Var.b(uw3Var, i44Var.a);
                                }
                                uw3 uw3Var2 = erVar.i;
                                dr drVar2 = erVar.e;
                                if (uw3Var2.R == null) {
                                    uw3Var2.R = (ExpandedMenuView) uw3Var2.B.inflate(R.layout.abc_expanded_menu_layout, (ViewGroup) drVar2, false);
                                    if (uw3Var2.Y == null) {
                                        uw3Var2.Y = new tw3(uw3Var2);
                                    }
                                    uw3Var2.R.setAdapter((ListAdapter) uw3Var2.Y);
                                    uw3Var2.R.setOnItemClickListener(uw3Var2);
                                }
                                ExpandedMenuView expandedMenuView = uw3Var2.R;
                                erVar.f = expandedMenuView;
                            }
                            erVar.n = true;
                            return;
                        }
                        if (erVar.f != null) {
                            if (erVar.g == null) {
                                uw3 uw3Var3 = erVar.i;
                                if (uw3Var3.Y == null) {
                                    uw3Var3.Y = new tw3(uw3Var3);
                                }
                            }
                            ViewGroup.LayoutParams layoutParams3 = erVar.f.getLayoutParams();
                            if (layoutParams3 == null) {
                                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            erVar.e.setBackgroundResource(erVar.b);
                            ViewParent parent = erVar.f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(erVar.f);
                            }
                            erVar.e.addView(erVar.f, layoutParams3);
                            if (!erVar.f.hasFocus()) {
                                erVar.f.requestFocus();
                            }
                        }
                        erVar.n = true;
                        return;
                    }
                    i = -2;
                    erVar.l = false;
                    WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams22.gravity = erVar.c;
                    layoutParams22.windowAnimations = erVar.d;
                    windowManager.addView(erVar.e, layoutParams22);
                    erVar.m = true;
                    if (i2 != 0) {
                    }
                }
            }
        }
    }

    public final boolean J(er erVar, int i, KeyEvent keyEvent) {
        i44 i44Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!erVar.k && !K(erVar, keyEvent)) || (i44Var = erVar.h) == null) {
            return false;
        }
        return i44Var.performShortcut(i, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
        if (r13.h == null) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(er erVar, KeyEvent keyEvent) {
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        int i;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.L0) {
            boolean z3 = erVar.k;
            int i2 = erVar.a;
            if (z3) {
                return true;
            }
            er erVar2 = this.H0;
            if (erVar2 != null && erVar2 != erVar) {
                v(erVar2, false);
            }
            Window.Callback callback = this.h0.getCallback();
            if (callback != null) {
                erVar.g = callback.onCreatePanelView(i2);
            }
            if (i2 != 0 && i2 != 108) {
                z = false;
            } else {
                z = true;
            }
            if (z && (actionBarOverlayLayout4 = this.m0) != null) {
                actionBarOverlayLayout4.k();
                ((l87) actionBarOverlayLayout4.d0).l = true;
            }
            if (erVar.g == null && (!z || !(this.j0 instanceof i87))) {
                i44 i44Var = erVar.h;
                if (i44Var == null || erVar.o) {
                    if (i44Var == null) {
                        Context context = this.g0;
                        if ((i2 == 0 || i2 == 108) && this.m0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                p41 p41Var = new p41(context, 0);
                                p41Var.getTheme().setTo(theme);
                                context = p41Var;
                            }
                        }
                        i44 i44Var2 = new i44(context);
                        i44Var2.e = this;
                        i44 i44Var3 = erVar.h;
                        if (i44Var2 != i44Var3) {
                            if (i44Var3 != null) {
                                i44Var3.r(erVar.i);
                            }
                            erVar.h = i44Var2;
                            uw3 uw3Var = erVar.i;
                            if (uw3Var != null) {
                                i44Var2.b(uw3Var, i44Var2.a);
                            }
                        }
                    }
                    if (z && (actionBarOverlayLayout2 = this.m0) != null) {
                        if (this.n0 == null) {
                            this.n0 = new vq(this, 2);
                        }
                        actionBarOverlayLayout2.l(erVar.h, this.n0);
                    }
                    erVar.h.w();
                    if (!callback.onCreatePanelMenu(i2, erVar.h)) {
                        i44 i44Var4 = erVar.h;
                        if (i44Var4 != null) {
                            if (i44Var4 != null) {
                                i44Var4.r(erVar.i);
                            }
                            erVar.h = null;
                        }
                        if (z && (actionBarOverlayLayout = this.m0) != null) {
                            actionBarOverlayLayout.l(null, this.n0);
                        }
                    } else {
                        erVar.o = false;
                    }
                }
                erVar.h.w();
                Bundle bundle = erVar.p;
                if (bundle != null) {
                    erVar.h.s(bundle);
                    erVar.p = null;
                }
                if (!callback.onPreparePanel(0, erVar.g, erVar.h)) {
                    if (z && (actionBarOverlayLayout3 = this.m0) != null) {
                        actionBarOverlayLayout3.l(null, this.n0);
                    }
                    erVar.h.v();
                    return false;
                }
                if (keyEvent != null) {
                    i = keyEvent.getDeviceId();
                } else {
                    i = -1;
                }
                if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                erVar.h.setQwertyMode(z2);
                erVar.h.v();
            }
            erVar.k = true;
            erVar.l = false;
            this.H0 = erVar;
            return true;
        }
        return false;
    }

    public final void L() {
        if (!this.u0) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void M() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.a1 != null && (C(0).m || this.p0 != null)) {
                z = true;
            }
            if (z && this.b1 == null) {
                this.b1 = zq.b(this.a1, this);
            } else if (!z && (onBackInvokedCallback = this.b1) != null) {
                zq.c(this.a1, onBackInvokedCallback);
                this.b1 = null;
            }
        }
    }

    @Override // defpackage.tq
    public final void c() {
        LayoutInflater from = LayoutInflater.from(this.g0);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof fr)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.tq
    public final void d() {
        if (this.j0 != null) {
            D();
            if (!this.j0.k0()) {
                E(0);
            }
        }
    }

    @Override // defpackage.tq
    public final void f() {
        String str;
        this.J0 = true;
        q(false, true);
        A();
        Object obj = this.f0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = ej2.F(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ak7 ak7Var = this.j0;
                if (ak7Var == null) {
                    this.W0 = true;
                } else {
                    ak7Var.A0(true);
                }
            }
            synchronized (tq.d0) {
                tq.h(this);
                tq.Z.add(new WeakReference(this));
            }
        }
        this.M0 = new Configuration(this.g0.getResources().getConfiguration());
        this.K0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        ak7 ak7Var;
        br brVar;
        br brVar2;
        if (this.f0 instanceof Activity) {
            synchronized (tq.d0) {
                tq.h(this);
            }
        }
        if (this.T0) {
            this.h0.getDecorView().removeCallbacks(this.V0);
        }
        this.L0 = true;
        if (this.N0 != -100) {
            Object obj = this.f0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                c1.put(this.f0.getClass().getName(), Integer.valueOf(this.N0));
                ak7Var = this.j0;
                if (ak7Var != null) {
                    ak7Var.q0();
                }
                brVar = this.R0;
                if (brVar != null) {
                    brVar.d();
                }
                brVar2 = this.S0;
                if (brVar2 == null) {
                    brVar2.d();
                    return;
                }
                return;
            }
        }
        c1.remove(this.f0.getClass().getName());
        ak7Var = this.j0;
        if (ak7Var != null) {
        }
        brVar = this.R0;
        if (brVar != null) {
        }
        brVar2 = this.S0;
        if (brVar2 == null) {
        }
    }

    @Override // defpackage.tq
    public final boolean i(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.E0 && i == 108) {
            return false;
        }
        if (this.A0 && i == 1) {
            this.A0 = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.h0.requestFeature(i);
                            }
                            L();
                            this.B0 = true;
                            return true;
                        }
                        L();
                        this.A0 = true;
                        return true;
                    }
                    L();
                    this.C0 = true;
                    return true;
                }
                L();
                this.z0 = true;
                return true;
            }
            L();
            this.y0 = true;
            return true;
        }
        L();
        this.E0 = true;
        return true;
    }

    @Override // defpackage.tq
    public final void k(int i) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.v0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.g0).inflate(i, viewGroup);
        this.i0.a(this.h0.getCallback());
    }

    @Override // defpackage.tq
    public final void l(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.v0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.i0.a(this.h0.getCallback());
    }

    @Override // defpackage.tq
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.v0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.i0.a(this.h0.getCallback());
    }

    @Override // defpackage.g44
    public final boolean n(i44 i44Var, MenuItem menuItem) {
        int i;
        er erVar;
        Window.Callback callback = this.h0.getCallback();
        if (callback != null && !this.L0) {
            i44 k = i44Var.k();
            er[] erVarArr = this.G0;
            if (erVarArr != null) {
                i = erVarArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    erVar = erVarArr[i2];
                    if (erVar != null && erVar.h == k) {
                        break;
                    }
                    i2++;
                } else {
                    erVar = null;
                    break;
                }
            }
            if (erVar != null) {
                return callback.onMenuItemSelected(erVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.tq
    public final void o(CharSequence charSequence) {
        this.l0 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.m0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        ak7 ak7Var = this.j0;
        if (ak7Var != null) {
            ak7Var.E0(charSequence);
            return;
        }
        TextView textView = this.w0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        if (r10.equals("ImageButton") == false) goto L23;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context context2;
        View rrVar;
        View view2 = null;
        if (this.Z0 == null) {
            int[] iArr = m75.j;
            Context context3 = this.g0;
            TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.Z0 = new ys();
            } else {
                try {
                    this.Z0 = (ys) context3.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.Z0 = new ys();
                }
            }
        }
        ys ysVar = this.Z0;
        int i = cl7.a;
        ysVar.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, m75.z, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        if (resourceId != 0 && (!(context instanceof p41) || ((p41) context).A != resourceId)) {
            context2 = new p41(context, resourceId);
        } else {
            context2 = context;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                rrVar = new rr(context2, attributeSet);
                break;
            case 1:
                rrVar = new oq(context2, attributeSet);
                break;
            case 2:
                rrVar = new or(context2, attributeSet);
                break;
            case 3:
                rrVar = ysVar.e(context2, attributeSet);
                break;
            case 4:
                rrVar = new mr(context2, attributeSet, R.attr.imageButtonStyle);
                break;
            case 5:
                rrVar = new tr(context2, attributeSet);
                break;
            case 6:
                rrVar = new fs(context2, attributeSet);
                break;
            case 7:
                rrVar = ysVar.d(context2, attributeSet);
                break;
            case '\b':
                rrVar = new ws(context2, attributeSet);
                break;
            case '\t':
                rrVar = new nr(context2, attributeSet, 0);
                break;
            case '\n':
                rrVar = ysVar.a(context2, attributeSet);
                break;
            case 11:
                rrVar = ysVar.c(context2, attributeSet);
                break;
            case '\f':
                rrVar = new kr(context2, attributeSet);
                break;
            case '\r':
                rrVar = ysVar.b(context2, attributeSet);
                break;
            default:
                rrVar = null;
                break;
        }
        if (rrVar == null && context != context2) {
            Object[] objArr = ysVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = ys.g;
                        if (i2 < 3) {
                            View f = ysVar.f(context2, str, strArr[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f2 = ysVar.f(context2, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            rrVar = view2;
        }
        if (rrVar != null) {
            Context context4 = rrVar.getContext();
            if ((context4 instanceof ContextWrapper) && rrVar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context4.obtainStyledAttributes(attributeSet, ys.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    rrVar.setOnClickListener(new xs(rrVar, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, ys.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = ao7.a;
                    new on7(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(rrVar, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, ys.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    ao7.o(rrVar, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = context2.obtainStyledAttributes(attributeSet, ys.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = ao7.a;
                    new on7(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(rrVar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return rrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(boolean z, boolean z2) {
        hy3 hy3Var;
        int i;
        Configuration configuration;
        int i2;
        int i3;
        hy3 b;
        int i4;
        boolean z3;
        Object obj;
        Object obj2;
        Activity activity;
        int i5;
        boolean z4 = false;
        if (this.L0) {
            return false;
        }
        int i6 = this.N0;
        if (i6 == -100) {
            i6 = tq.B;
        }
        Context context = this.g0;
        int F = F(context, i6);
        int i7 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        if (i7 < 33) {
            hy3Var = s(context);
        } else {
            hy3Var = null;
        }
        if (!z2 && hy3Var != null) {
            hy3Var = yq.b(context.getResources().getConfiguration());
        }
        Configuration w = w(context, F, hy3Var, null, false);
        boolean z5 = this.Q0;
        boolean z6 = true;
        Object obj3 = this.f0;
        if (!z5 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.M0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i2 = configuration.uiMode & 48;
                i3 = w.uiMode & 48;
                hy3 b2 = yq.b(configuration);
                if (hy3Var != null) {
                    b = null;
                } else {
                    b = yq.b(w);
                }
                if (i2 == i3) {
                    i4 = 512;
                } else {
                    i4 = 0;
                }
                if (b != null && !b2.equals(b)) {
                    i4 |= 8196;
                }
                if (((~i) & i4) != 0 && z && this.J0 && ((e1 || this.K0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31 && (i4 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(w.getLayoutDirection());
                        }
                        if (i8 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new n0(activity, 1));
                        }
                        z3 = true;
                        if (z3 && i4 != 0) {
                            if ((i4 & i) == i4) {
                                z4 = true;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i3;
                            if (b != null) {
                                yq.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 < 26 && i9 < 28) {
                                if (!hi2.l) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        hi2.k = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                    }
                                    hi2.l = true;
                                }
                                Field field = hi2.k;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!hi2.f) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                hi2.e = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e3) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                            }
                                            hi2.f = true;
                                        }
                                        Field field2 = hi2.e;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                            }
                                            if (obj2 != null) {
                                                if (!hi2.h) {
                                                    try {
                                                        hi2.g = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e5) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                                    }
                                                    hi2.h = true;
                                                }
                                                Class cls = hi2.g;
                                                if (cls != null) {
                                                    if (!hi2.j) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            hi2.i = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e6) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                        }
                                                        hi2.j = true;
                                                    }
                                                    Field field3 = hi2.i;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e7) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i10 = this.O0;
                            if (i10 != 0) {
                                context.setTheme(i10);
                                context.getTheme().applyStyle(this.O0, true);
                            }
                            if (z4 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof hu3) {
                                    if (((hu3) activity2).getLifecycle().b().isAtLeast(tt3.CREATED)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.K0 && !this.L0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        } else {
                            z6 = z3;
                        }
                        if (b != null) {
                            yq.c(yq.b(context.getResources().getConfiguration()));
                        }
                        if (i6 == 0) {
                            B(context).r();
                        } else {
                            br brVar = this.R0;
                            if (brVar != null) {
                                brVar.d();
                            }
                        }
                        br brVar2 = this.S0;
                        if (i6 == 3) {
                            if (brVar2 == null) {
                                this.S0 = new br(this, context);
                            }
                            this.S0.r();
                        } else if (brVar2 != null) {
                            brVar2.d();
                        }
                        return z6;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z6 = z3;
                if (b != null) {
                }
                if (i6 == 0) {
                }
                br brVar22 = this.S0;
                if (i6 == 3) {
                }
                return z6;
            }
            if (i7 >= 29) {
                i5 = 269221888;
            } else {
                i5 = 786432;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i5);
                if (activityInfo != null) {
                    this.P0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.P0 = 0;
            }
        }
        this.Q0 = true;
        i = this.P0;
        configuration = this.M0;
        if (configuration == null) {
        }
        i2 = configuration.uiMode & 48;
        i3 = w.uiMode & 48;
        hy3 b22 = yq.b(configuration);
        if (hy3Var != null) {
        }
        if (i2 == i3) {
        }
        if (b != null) {
            i4 |= 8196;
        }
        if (((~i) & i4) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z6 = z3;
        if (b != null) {
        }
        if (i6 == 0) {
        }
        br brVar222 = this.S0;
        if (i6 == 3) {
        }
        return z6;
    }

    public final void r(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.h0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof ar)) {
                ar arVar = new ar(this, callback);
                this.i0 = arVar;
                window.setCallback(arVar);
                Context context = this.g0;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, d1);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    ir a = ir.a();
                    synchronized (a) {
                        drawable = a.a.d(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.h0 = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.a1) == null) {
                    Object obj = this.f0;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.b1) != null) {
                        zq.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.b1 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.a1 = zq.a(activity);
                            M();
                            return;
                        }
                    }
                    this.a1 = null;
                    M();
                    return;
                }
                return;
            }
            i.m("AppCompat has already installed itself into the Window");
            return;
        }
        i.m("AppCompat has already installed itself into the Window");
    }

    public final void t(int i, er erVar, i44 i44Var) {
        if (i44Var == null) {
            if (erVar == null && i >= 0) {
                er[] erVarArr = this.G0;
                if (i < erVarArr.length) {
                    erVar = erVarArr[i];
                }
            }
            if (erVar != null) {
                i44Var = erVar.h;
            }
        }
        if ((erVar == null || erVar.m) && !this.L0) {
            ar arVar = this.i0;
            Window.Callback callback = this.h0.getCallback();
            arVar.getClass();
            try {
                arVar.X = true;
                callback.onPanelClosed(i, i44Var);
            } finally {
                arVar.X = false;
            }
        }
    }

    public final void u(i44 i44Var) {
        g8 g8Var;
        if (this.F0) {
            return;
        }
        this.F0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.m0;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((l87) actionBarOverlayLayout.d0).a.A;
        if (actionMenuView != null && (g8Var = actionMenuView.s0) != null) {
            g8Var.e();
            d8 d8Var = g8Var.p0;
            if (d8Var != null && d8Var.b()) {
                d8Var.i.dismiss();
            }
        }
        Window.Callback callback = this.h0.getCallback();
        if (callback != null && !this.L0) {
            callback.onPanelClosed(108, i44Var);
        }
        this.F0 = false;
    }

    public final void v(er erVar, boolean z) {
        dr drVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && erVar.a == 0 && (actionBarOverlayLayout = this.m0) != null) {
            actionBarOverlayLayout.k();
            if (((l87) actionBarOverlayLayout.d0).a.q()) {
                u(erVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.g0.getSystemService("window");
        if (windowManager != null && erVar.m && (drVar = erVar.e) != null) {
            windowManager.removeView(drVar);
            if (z) {
                t(erVar.a, erVar, null);
            }
        }
        erVar.k = false;
        erVar.l = false;
        erVar.m = false;
        erVar.f = null;
        erVar.n = true;
        if (this.H0 == erVar) {
            this.H0 = null;
        }
        if (erVar.a == 0) {
            M();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r4.dispatchKeyEvent(r7) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
        if (r6.e() != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        Object obj = this.f0;
        boolean z3 = true;
        if ((!(obj instanceof xg3) && !(obj instanceof hr)) || (decorView = this.h0.getDecorView()) == null || !uj2.v(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                ar arVar = this.i0;
                Window.Callback callback = this.h0.getCallback();
                arVar.getClass();
                try {
                    arVar.R = true;
                } finally {
                    arVar.R = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            er C = C(0);
                            if (!C.m) {
                                K(C, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if ((keyEvent.getFlags() & 128) == 0) {
                    z3 = false;
                }
                this.I0 = z3;
                return false;
            } else if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.p0 == null) {
                        er C2 = C(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.m0;
                        Context context = this.g0;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((l87) actionBarOverlayLayout.d0).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.A) != null && actionMenuView.r0 && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.m0;
                                actionBarOverlayLayout2.k();
                                if (!((l87) actionBarOverlayLayout2.d0).a.q()) {
                                    if (!this.L0 && K(C2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.m0;
                                        actionBarOverlayLayout3.k();
                                        z = ((l87) actionBarOverlayLayout3.d0).a.w();
                                        if (z) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    }
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.m0;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView2 = ((l87) actionBarOverlayLayout4.d0).a.A;
                                    if (actionMenuView2 != null) {
                                        g8 g8Var = actionMenuView2.s0;
                                        if (g8Var != null) {
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        boolean z4 = C2.m;
                        if (!z4 && !C2.l) {
                            if (C2.k) {
                                if (C2.o) {
                                    C2.k = false;
                                    z2 = K(C2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    I(C2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        } else {
                            v(C2, true);
                            z = z4;
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            } else if (!G()) {
                return false;
            }
        }
        return true;
    }

    public final void y(int i) {
        er C = C(i);
        if (C.h != null) {
            Bundle bundle = new Bundle();
            C.h.t(bundle);
            if (bundle.size() > 0) {
                C.p = bundle;
            }
            C.h.w();
            C.h.clear();
        }
        C.o = true;
        C.n = true;
        if ((i == 108 || i == 0) && this.m0 != null) {
            er C2 = C(0);
            C2.k = false;
            K(C2, null);
        }
    }

    public final void z() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.u0) {
            Context context2 = this.g0;
            int[] iArr = m75.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    i(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    i(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    i(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    i(10);
                }
                this.D0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                A();
                this.h0.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.E0) {
                    if (this.D0) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.B0 = false;
                        this.A0 = false;
                    } else if (this.A0) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new p41(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(R.id.decor_content_parent);
                        this.m0 = actionBarOverlayLayout;
                        actionBarOverlayLayout.setWindowCallback(this.h0.getCallback());
                        if (this.B0) {
                            this.m0.j(109);
                        }
                        if (this.y0) {
                            this.m0.j(2);
                        }
                        if (this.z0) {
                            this.m0.j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.C0 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    vq vqVar = new vq(this, 0);
                    WeakHashMap weakHashMap = ao7.a;
                    sn7.c(viewGroup, vqVar);
                    if (this.m0 == null) {
                        this.w0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z = eq7.a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.h0.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.h0.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new vq(this, 1));
                    this.v0 = viewGroup;
                    Object obj = this.f0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.l0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = this.m0;
                        if (actionBarOverlayLayout2 != null) {
                            actionBarOverlayLayout2.setWindowTitle(charSequence);
                        } else {
                            ak7 ak7Var = this.j0;
                            if (ak7Var != null) {
                                ak7Var.E0(charSequence);
                            } else {
                                TextView textView = this.w0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v0.findViewById(16908290);
                    View decorView = this.h0.getDecorView();
                    contentFrameLayout2.f0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(ModelPPM.MAX_FREQ, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.u0 = true;
                    er C = C(0);
                    if (!this.L0 && C.h == null) {
                        E(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb.append(this.A0);
                sb.append(", windowActionBarOverlay: ");
                sb.append(this.B0);
                sb.append(", android:windowIsFloating: ");
                sb.append(this.D0);
                sb.append(", windowActionModeOverlay: ");
                sb.append(this.C0);
                sb.append(", windowNoTitle: ");
                i.h(i61.o(sb, this.E0, " }"));
                return;
            }
            obtainStyledAttributes.recycle();
            i.m("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
