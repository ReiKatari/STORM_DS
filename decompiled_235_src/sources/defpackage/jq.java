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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq  reason: default package */
/* loaded from: classes.dex */
public abstract class jq extends p implements mq {
    public fr w0;

    public jq() {
        this.R.b.c("androidx:appcompat", new hq(this));
        q(new iq(this, 0));
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        fr frVar = (fr) v();
        frVar.z();
        ((ViewGroup) frVar.v0.findViewById(16908290)).addView(view, layoutParams);
        frVar.i0.a(frVar.h0.getCallback());
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
        fr frVar = (fr) v();
        frVar.J0 = true;
        int i9 = frVar.N0;
        if (i9 == -100) {
            i9 = tq.B;
        }
        int F = frVar.F(context, i9);
        if (tq.e(context)) {
            tq.p(context);
        }
        hy3 s = fr.s(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(fr.w(context, F, s, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof p41) {
            try {
                ((p41) context).a(fr.w(context, F, s, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (fr.e1) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = RecyclerView.B1;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = RecyclerView.B1;
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
                    yq.a(configuration3, configuration4, configuration);
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
            Configuration w = fr.w(context, F, s, configuration, true);
            p41 p41Var = new p41(context, 2132017819);
            p41Var.a(w);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = p41Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        rp.o(theme);
                    } else {
                        synchronized (lb4.j) {
                            if (!lb4.l) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    lb4.k = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                lb4.l = true;
                            }
                            Method method = lb4.k;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    lb4.k = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = p41Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ak7 w = w();
        if (getWindow().hasFeature(0)) {
            if (w == null || !w.L()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ak7 w = w();
        if (keyCode == 82 && w != null && w.s0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        fr frVar = (fr) v();
        frVar.z();
        return frVar.h0.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        fr frVar = (fr) v();
        if (frVar.k0 == null) {
            frVar.D();
            ak7 ak7Var = frVar.j0;
            if (ak7Var != null) {
                context = ak7Var.f0();
            } else {
                context = frVar.g0;
            }
            frVar.k0 = new ku6(context);
        }
        return frVar.k0;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = cl7.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        v().d();
    }

    @Override // defpackage.mv0, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        fr frVar = (fr) v();
        if (frVar.A0 && frVar.u0) {
            frVar.D();
            ak7 ak7Var = frVar.j0;
            if (ak7Var != null) {
                ak7Var.p0();
            }
        }
        ir a = ir.a();
        Context context = frVar.g0;
        synchronized (a) {
            ol5 ol5Var = a.a;
            synchronized (ol5Var) {
                hz3 hz3Var = (hz3) ol5Var.b.get(context);
                if (hz3Var != null) {
                    hz3Var.a();
                }
            }
        }
        frVar.M0 = new Configuration(frVar.g0.getResources().getConfiguration());
        frVar.q(false, false);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ak7 w = w();
        if (menuItem.getItemId() == 16908332 && w != null && (w.V() & 4) != 0) {
            return x();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((fr) v()).z();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        fr frVar = (fr) v();
        frVar.D();
        ak7 ak7Var = frVar.j0;
        if (ak7Var != null) {
            ak7Var.C0(true);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStart() {
        super.onStart();
        ((fr) v()).q(true, false);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStop() {
        super.onStop();
        fr frVar = (fr) v();
        frVar.D();
        ak7 ak7Var = frVar.j0;
        if (ak7Var != null) {
            ak7Var.C0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        v().o(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ak7 w = w();
        if (getWindow().hasFeature(0)) {
            if (w == null || !w.t0()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void setContentView(int i) {
        r();
        v().k(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((fr) v()).O0 = i;
    }

    public final tq v() {
        if (this.w0 == null) {
            zb6 zb6Var = tq.A;
            this.w0 = new fr(this, null, this, this);
        }
        return this.w0;
    }

    public final ak7 w() {
        fr frVar = (fr) v();
        frVar.D();
        return frVar.j0;
    }

    public final boolean x() {
        Intent D = ej2.D(this);
        if (D != null) {
            if (shouldUpRecreateTask(D)) {
                rz6 rz6Var = new rz6(this);
                Intent D2 = ej2.D(this);
                if (D2 == null) {
                    D2 = ej2.D(this);
                }
                if (D2 != null) {
                    ComponentName component = D2.getComponent();
                    if (component == null) {
                        component = D2.resolveActivity(rz6Var.B.getPackageManager());
                    }
                    rz6Var.a(component);
                    rz6Var.A.add(D2);
                }
                rz6Var.b();
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            navigateUpTo(D);
            return true;
        }
        return false;
    }

    public final void y(Toolbar toolbar) {
        CharSequence charSequence;
        fr frVar = (fr) v();
        if (!(frVar.f0 instanceof Activity)) {
            return;
        }
        frVar.D();
        ak7 ak7Var = frVar.j0;
        if (!(ak7Var instanceof nt7)) {
            frVar.k0 = null;
            if (ak7Var != null) {
                ak7Var.q0();
            }
            frVar.j0 = null;
            Object obj = frVar.f0;
            if (obj instanceof Activity) {
                charSequence = ((Activity) obj).getTitle();
            } else {
                charSequence = frVar.l0;
            }
            i87 i87Var = new i87(toolbar, charSequence, frVar.i0);
            frVar.j0 = i87Var;
            frVar.i0.B = i87Var.n;
            toolbar.setBackInvokedCallbackEnabled(true);
            frVar.d();
            return;
        }
        i.m("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // defpackage.mv0, android.app.Activity
    public void setContentView(View view) {
        r();
        v().l(view);
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        v().m(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
