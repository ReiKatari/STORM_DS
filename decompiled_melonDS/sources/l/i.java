package l;

import ah.i1;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q.k2;
import q.r3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i extends o0 implements j {

    /* renamed from: t0  reason: collision with root package name */
    public x f8424t0;

    public i() {
        this.R.f12313b.c("androidx:appcompat", new h(this));
        q(new i1(this, 6));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        x xVar = (x) v();
        xVar.w();
        ((ViewGroup) xVar.f8482u0.findViewById(16908290)).addView(view, layoutParams);
        xVar.f8469g0.a(xVar.f8468f0.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        x xVar = (x) v();
        xVar.I0 = true;
        int i17 = xVar.M0;
        if (i17 == -100) {
            i17 = m.B;
        }
        int C = xVar.C(context, i17);
        if (m.d(context) && m.d(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!m.Y) {
                    m.A.execute(new h7.f(context, 2));
                }
            } else {
                synchronized (m.f8440c0) {
                    try {
                        u5.c cVar = m.L;
                        if (cVar == null) {
                            if (m.R == null) {
                                m.R = u5.c.a(m5.c.e(context));
                            }
                            if (!m.R.f13491a.f13492a.isEmpty()) {
                                m.L = m.R;
                            }
                        } else if (!cVar.equals(m.R)) {
                            u5.c cVar2 = m.L;
                            m.R = cVar2;
                            m5.c.d(context, cVar2.f13491a.f13492a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        u5.c p10 = x.p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(x.t(context, C, p10, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof o.c) {
            try {
                ((o.c) context).a(x.t(context, C, p10, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (x.f8464d1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f8 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f8 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i18 = configuration3.mcc;
                    int i19 = configuration4.mcc;
                    if (i18 != i19) {
                        configuration.mcc = i19;
                    }
                    int i20 = configuration3.mnc;
                    int i21 = configuration4.mnc;
                    if (i20 != i21) {
                        configuration.mnc = i21;
                    }
                    r.a(configuration3, configuration4, configuration);
                    int i22 = configuration3.touchscreen;
                    int i23 = configuration4.touchscreen;
                    if (i22 != i23) {
                        configuration.touchscreen = i23;
                    }
                    int i24 = configuration3.keyboard;
                    int i25 = configuration4.keyboard;
                    if (i24 != i25) {
                        configuration.keyboard = i25;
                    }
                    int i26 = configuration3.keyboardHidden;
                    int i27 = configuration4.keyboardHidden;
                    if (i26 != i27) {
                        configuration.keyboardHidden = i27;
                    }
                    int i28 = configuration3.navigation;
                    int i29 = configuration4.navigation;
                    if (i28 != i29) {
                        configuration.navigation = i29;
                    }
                    int i30 = configuration3.navigationHidden;
                    int i31 = configuration4.navigationHidden;
                    if (i30 != i31) {
                        configuration.navigationHidden = i31;
                    }
                    int i32 = configuration3.orientation;
                    int i33 = configuration4.orientation;
                    if (i32 != i33) {
                        configuration.orientation = i33;
                    }
                    int i34 = configuration3.screenLayout & 15;
                    int i35 = configuration4.screenLayout & 15;
                    if (i34 != i35) {
                        configuration.screenLayout |= i35;
                    }
                    int i36 = configuration3.screenLayout & 192;
                    int i37 = configuration4.screenLayout & 192;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 48;
                    int i39 = configuration4.screenLayout & 48;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 768;
                    int i41 = configuration4.screenLayout & 768;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        i2 = configuration3.colorMode;
                        int i42 = i2 & 3;
                        i10 = configuration4.colorMode;
                        if (i42 != (i10 & 3)) {
                            i15 = configuration.colorMode;
                            i16 = configuration4.colorMode;
                            configuration.colorMode = i15 | (i16 & 3);
                        }
                        i11 = configuration3.colorMode;
                        int i43 = i11 & 12;
                        i12 = configuration4.colorMode;
                        if (i43 != (i12 & 12)) {
                            i13 = configuration.colorMode;
                            i14 = configuration4.colorMode;
                            configuration.colorMode = i13 | (i14 & 12);
                        }
                    }
                    int i44 = configuration3.uiMode & 15;
                    int i45 = configuration4.uiMode & 15;
                    if (i44 != i45) {
                        configuration.uiMode |= i45;
                    }
                    int i46 = configuration3.uiMode & 48;
                    int i47 = configuration4.uiMode & 48;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.screenWidthDp;
                    int i49 = configuration4.screenWidthDp;
                    if (i48 != i49) {
                        configuration.screenWidthDp = i49;
                    }
                    int i50 = configuration3.screenHeightDp;
                    int i51 = configuration4.screenHeightDp;
                    if (i50 != i51) {
                        configuration.screenHeightDp = i51;
                    }
                    int i52 = configuration3.smallestScreenWidthDp;
                    int i53 = configuration4.smallestScreenWidthDp;
                    if (i52 != i53) {
                        configuration.smallestScreenWidthDp = i53;
                    }
                    int i54 = configuration3.densityDpi;
                    int i55 = configuration4.densityDpi;
                    if (i54 != i55) {
                        configuration.densityDpi = i55;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration t5 = x.t(context, C, p10, configuration, true);
            o.c cVar3 = new o.c(context, 2131952272);
            cVar3.a(t5);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cVar3.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        p5.j.a(theme);
                    } else {
                        synchronized (p5.b.f11332e) {
                            if (!p5.b.f11334g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    p5.b.f11333f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e6) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e6);
                                }
                                p5.b.f11334g = true;
                            }
                            Method method = p5.b.f11333f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e10) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e10);
                                    p5.b.f11333f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar3;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        aj.g w10 = w();
        if (getWindow().hasFeature(0)) {
            if (w10 == null || !w10.m()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // m5.e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        aj.g w10 = w();
        if (keyCode == 82 && w10 != null && w10.T(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i2) {
        x xVar = (x) v();
        xVar.w();
        return xVar.f8468f0.findViewById(i2);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        x xVar = (x) v();
        if (xVar.f8472j0 == null) {
            xVar.A();
            aj.g gVar = xVar.f8471i0;
            if (gVar != null) {
                context = gVar.E();
            } else {
                context = xVar.f8467e0;
            }
            xVar.f8472j0 = new o.h(context);
        }
        return xVar.f8472j0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i2 = r3.f12018a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        v().b();
    }

    @Override // d.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x xVar = (x) v();
        if (xVar.f8487z0 && xVar.f8481t0) {
            xVar.A();
            aj.g gVar = xVar.f8471i0;
            if (gVar != null) {
                gVar.Q();
            }
        }
        q.r a10 = q.r.a();
        Context context = xVar.f8467e0;
        synchronized (a10) {
            k2 k2Var = a10.f12003a;
            synchronized (k2Var) {
                a1.q qVar = (a1.q) k2Var.f11938b.get(context);
                if (qVar != null) {
                    qVar.a();
                }
            }
        }
        xVar.L0 = new Configuration(xVar.f8467e0.getResources().getConfiguration());
        xVar.n(false, false);
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.o0, d.k, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        aj.g w10 = w();
        if (menuItem.getItemId() == 16908332 && w10 != null && (w10.A() & 4) != 0) {
            return x();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((x) v()).w();
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        x xVar = (x) v();
        xVar.A();
        aj.g gVar = xVar.f8471i0;
        if (gVar != null) {
            gVar.m0(true);
        }
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((x) v()).n(true, false);
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public void onStop() {
        super.onStop();
        x xVar = (x) v();
        xVar.A();
        aj.g gVar = xVar.f8471i0;
        if (gVar != null) {
            gVar.m0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        v().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        aj.g w10 = w();
        if (getWindow().hasFeature(0)) {
            if (w10 == null || !w10.U()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i2) {
        r();
        v().j(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i2) {
        super.setTheme(i2);
        ((x) v()).N0 = i2;
    }

    public final m v() {
        if (this.f8424t0 == null) {
            k7.a0 a0Var = m.A;
            this.f8424t0 = new x(this, null, this, this);
        }
        return this.f8424t0;
    }

    public final aj.g w() {
        x xVar = (x) v();
        xVar.A();
        return xVar.f8471i0;
    }

    public final boolean x() {
        Intent b10 = m5.c.b(this);
        if (b10 != null) {
            if (shouldUpRecreateTask(b10)) {
                m5.o oVar = new m5.o(this);
                Intent b11 = m5.c.b(this);
                if (b11 == null) {
                    b11 = m5.c.b(this);
                }
                if (b11 != null) {
                    ComponentName component = b11.getComponent();
                    if (component == null) {
                        component = b11.resolveActivity(oVar.B.getPackageManager());
                    }
                    oVar.a(component);
                    oVar.A.add(b11);
                }
                oVar.b();
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            navigateUpTo(b10);
            return true;
        }
        return false;
    }

    public final void y(Toolbar toolbar) {
        CharSequence charSequence;
        x xVar = (x) v();
        if (!(xVar.f8466d0 instanceof Activity)) {
            return;
        }
        xVar.A();
        aj.g gVar = xVar.f8471i0;
        if (!(gVar instanceof k0)) {
            xVar.f8472j0 = null;
            if (gVar != null) {
                gVar.R();
            }
            xVar.f8471i0 = null;
            Object obj = xVar.f8466d0;
            if (obj instanceof Activity) {
                charSequence = ((Activity) obj).getTitle();
            } else {
                charSequence = xVar.f8473k0;
            }
            e0 e0Var = new e0(toolbar, charSequence, xVar.f8469g0);
            xVar.f8471i0 = e0Var;
            xVar.f8469g0.B = e0Var.f8382n;
            toolbar.setBackInvokedCallbackEnabled(true);
            xVar.b();
            return;
        }
        a0.j.p("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // d.k, android.app.Activity
    public void setContentView(View view) {
        r();
        v().k(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        v().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
