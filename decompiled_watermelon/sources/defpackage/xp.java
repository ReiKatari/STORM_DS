package defpackage;

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
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xp  reason: default package */
/* loaded from: classes.dex */
public abstract class xp extends p implements aq {
    public tq v0;

    public xp() {
        this.R.b.c("androidx:appcompat", new vp(this));
        q(new wp(this, 0));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        tq tqVar = (tq) v();
        tqVar.v();
        ((ViewGroup) tqVar.u0.findViewById(16908290)).addView(view, layoutParams);
        tqVar.h0.a(tqVar.g0.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        tq tqVar = (tq) v();
        tqVar.I0 = true;
        int i9 = tqVar.M0;
        if (i9 == -100) {
            i9 = hq.B;
        }
        int B = tqVar.B(context, i9);
        if (hq.c(context) && hq.c(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!hq.Y) {
                    hq.A.execute(new eq(context, 0));
                }
            } else {
                synchronized (hq.d0) {
                    try {
                        gr3 gr3Var = hq.L;
                        if (gr3Var == null) {
                            if (hq.R == null) {
                                hq.R = gr3.a(jv3.U(context));
                            }
                            if (!hq.R.a.a.isEmpty()) {
                                hq.L = hq.R;
                            }
                        } else if (!gr3Var.equals(hq.R)) {
                            gr3 gr3Var2 = hq.L;
                            hq.R = gr3Var2;
                            jv3.P(context, gr3Var2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        gr3 n = tq.n(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(tq.r(context, B, n, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof h11) {
            try {
                ((h11) context).a(tq.r(context, B, n, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (tq.d1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = RecyclerView.A1;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = RecyclerView.A1;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    mq.a(configuration3, configuration4, configuration);
                    int i14 = configuration3.touchscreen;
                    int i15 = configuration4.touchscreen;
                    if (i14 != i15) {
                        configuration.touchscreen = i15;
                    }
                    int i16 = configuration3.keyboard;
                    int i17 = configuration4.keyboard;
                    if (i16 != i17) {
                        configuration.keyboard = i17;
                    }
                    int i18 = configuration3.keyboardHidden;
                    int i19 = configuration4.keyboardHidden;
                    if (i18 != i19) {
                        configuration.keyboardHidden = i19;
                    }
                    int i20 = configuration3.navigation;
                    int i21 = configuration4.navigation;
                    if (i20 != i21) {
                        configuration.navigation = i21;
                    }
                    int i22 = configuration3.navigationHidden;
                    int i23 = configuration4.navigationHidden;
                    if (i22 != i23) {
                        configuration.navigationHidden = i23;
                    }
                    int i24 = configuration3.orientation;
                    int i25 = configuration4.orientation;
                    if (i24 != i25) {
                        configuration.orientation = i25;
                    }
                    int i26 = configuration3.screenLayout & 15;
                    int i27 = configuration4.screenLayout & 15;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 192;
                    int i29 = configuration4.screenLayout & 192;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 48;
                    int i31 = configuration4.screenLayout & 48;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    int i32 = configuration3.screenLayout & 768;
                    int i33 = configuration4.screenLayout & 768;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = configuration3.colorMode;
                        int i34 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i34 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i35 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i35 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i36 = configuration3.uiMode & 15;
                    int i37 = configuration4.uiMode & 15;
                    if (i36 != i37) {
                        configuration.uiMode |= i37;
                    }
                    int i38 = configuration3.uiMode & 48;
                    int i39 = configuration4.uiMode & 48;
                    if (i38 != i39) {
                        configuration.uiMode |= i39;
                    }
                    int i40 = configuration3.screenWidthDp;
                    int i41 = configuration4.screenWidthDp;
                    if (i40 != i41) {
                        configuration.screenWidthDp = i41;
                    }
                    int i42 = configuration3.screenHeightDp;
                    int i43 = configuration4.screenHeightDp;
                    if (i42 != i43) {
                        configuration.screenHeightDp = i43;
                    }
                    int i44 = configuration3.smallestScreenWidthDp;
                    int i45 = configuration4.smallestScreenWidthDp;
                    if (i44 != i45) {
                        configuration.smallestScreenWidthDp = i45;
                    }
                    int i46 = configuration3.densityDpi;
                    int i47 = configuration4.densityDpi;
                    if (i46 != i47) {
                        configuration.densityDpi = i47;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration r = tq.r(context, B, n, configuration, true);
            h11 h11Var = new h11(context, 2132017811);
            h11Var.a(r);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = h11Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        fp.o(theme);
                    } else {
                        synchronized (a53.l) {
                            if (!a53.n) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    a53.m = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                a53.n = true;
                            }
                            Method method = a53.m;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    a53.m = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = h11Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ct3 w = w();
        if (getWindow().hasFeature(0)) {
            if (w == null || !w.N()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.xs0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ct3 w = w();
        if (keyCode == 82 && w != null && w.C0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        tq tqVar = (tq) v();
        tqVar.v();
        return tqVar.g0.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        tq tqVar = (tq) v();
        if (tqVar.j0 == null) {
            tqVar.z();
            ct3 ct3Var = tqVar.i0;
            if (ct3Var != null) {
                context = ct3Var.p0();
            } else {
                context = tqVar.f0;
            }
            tqVar.j0 = new qi6(context);
        }
        return tqVar.j0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = d77.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        v().b();
    }

    @Override // defpackage.ys0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tq tqVar = (tq) v();
        if (tqVar.z0 && tqVar.t0) {
            tqVar.z();
            ct3 ct3Var = tqVar.i0;
            if (ct3Var != null) {
                ct3Var.z0();
            }
        }
        vq a = vq.a();
        Context context = tqVar.f0;
        synchronized (a) {
            wb5 wb5Var = a.a;
            synchronized (wb5Var) {
                cs3 cs3Var = (cs3) wb5Var.b.get(context);
                if (cs3Var != null) {
                    cs3Var.a();
                }
            }
        }
        tqVar.L0 = new Configuration(tqVar.f0.getResources().getConfiguration());
        tqVar.l(false, false);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.p, defpackage.ys0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ct3 w = w();
        if (menuItem.getItemId() == 16908332 && w != null && (w.j0() & 4) != 0) {
            return x();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((tq) v()).v();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        tq tqVar = (tq) v();
        tqVar.z();
        ct3 ct3Var = tqVar.i0;
        if (ct3Var != null) {
            ct3Var.L0(true);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStart() {
        super.onStart();
        ((tq) v()).l(true, false);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStop() {
        super.onStop();
        tq tqVar = (tq) v();
        tqVar.z();
        ct3 ct3Var = tqVar.i0;
        if (ct3Var != null) {
            ct3Var.L0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        v().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ct3 w = w();
        if (getWindow().hasFeature(0)) {
            if (w == null || !w.D0()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        r();
        v().h(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((tq) v()).N0 = i;
    }

    public final hq v() {
        if (this.v0 == null) {
            k06 k06Var = hq.A;
            this.v0 = new tq(this, null, this, this);
        }
        return this.v0;
    }

    public final ct3 w() {
        tq tqVar = (tq) v();
        tqVar.z();
        return tqVar.i0;
    }

    public final boolean x() {
        Intent z = me2.z(this);
        if (z != null) {
            if (shouldUpRecreateTask(z)) {
                gn6 gn6Var = new gn6(this);
                Intent z2 = me2.z(this);
                if (z2 == null) {
                    z2 = me2.z(this);
                }
                if (z2 != null) {
                    ComponentName component = z2.getComponent();
                    if (component == null) {
                        component = z2.resolveActivity(gn6Var.B.getPackageManager());
                    }
                    gn6Var.b(component);
                    gn6Var.A.add(z2);
                }
                gn6Var.c();
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            navigateUpTo(z);
            return true;
        }
        return false;
    }

    public final void y(Toolbar toolbar) {
        CharSequence charSequence;
        tq tqVar = (tq) v();
        if (!(tqVar.e0 instanceof Activity)) {
            return;
        }
        tqVar.z();
        ct3 ct3Var = tqVar.i0;
        if (!(ct3Var instanceof le7)) {
            tqVar.j0 = null;
            if (ct3Var != null) {
                ct3Var.A0();
            }
            tqVar.i0 = null;
            Object obj = tqVar.e0;
            if (obj instanceof Activity) {
                charSequence = ((Activity) obj).getTitle();
            } else {
                charSequence = tqVar.k0;
            }
            uv6 uv6Var = new uv6(toolbar, charSequence, tqVar.h0);
            tqVar.i0 = uv6Var;
            tqVar.h0.B = uv6Var.q0;
            toolbar.setBackInvokedCallbackEnabled(true);
            tqVar.b();
            return;
        }
        i.n("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // defpackage.ys0, android.app.Activity
    public void setContentView(View view) {
        r();
        v().i(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        v().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
