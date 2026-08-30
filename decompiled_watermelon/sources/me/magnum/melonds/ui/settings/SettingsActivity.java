package me.magnum.melonds.ui.settings;

import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class SettingsActivity extends xp implements el2 {
    public static final /* synthetic */ int E0 = 0;
    public final ee6 A0;
    public final ee6 B0;
    public final s16 C0;
    public r9 D0;
    public volatile q8 w0;
    public final Object x0 = new Object();
    public boolean y0 = false;
    public final il6 z0;

    public SettingsActivity() {
        q(new wp(this, 11));
        this.z0 = new il6(new t06(1, this));
        this.A0 = fe6.a("");
        this.B0 = fe6.a(null);
        this.C0 = new s16(this, 1);
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().c();
    }

    public final boolean B(is4 is4Var, Preference preference) {
        String fragment = preference.getFragment();
        if (fragment == null) {
            return false;
        }
        hg2 H = t().H();
        ClassLoader.getSystemClassLoader();
        o a = H.a(fragment);
        a.setArguments(preference.getExtras());
        mg2 t = t();
        t.getClass();
        a aVar = new a(t);
        aVar.d = R.anim.fragment_translate_enter_push;
        aVar.e = R.anim.fragment_translate_exit_push;
        aVar.f = R.anim.fragment_translate_enter_pop;
        aVar.g = R.anim.fragment_translate_exit_pop;
        r9 r9Var = this.D0;
        if (r9Var != null) {
            aVar.j(((FragmentContainerView) r9Var.b).getId(), a, null);
            aVar.c();
            aVar.f();
            return true;
        }
        b53.g0("binding");
        throw null;
    }

    public final void C(is4 is4Var, PreferenceScreen preferenceScreen) {
        preferenceScreen.getClass();
        hg2 H = t().H();
        ClassLoader.getSystemClassLoader();
        o a = H.a(is4Var.getClass().getName());
        a.setArguments(dk7.k(new ti4(is4.ARG_PREFERENCE_ROOT, preferenceScreen.getKey())));
        mg2 t = t();
        t.getClass();
        a aVar = new a(t);
        aVar.d = R.anim.fragment_translate_enter_push;
        aVar.e = R.anim.fragment_translate_exit_push;
        aVar.f = R.anim.fragment_translate_enter_pop;
        aVar.g = R.anim.fragment_translate_exit_pop;
        r9 r9Var = this.D0;
        if (r9Var != null) {
            aVar.j(((FragmentContainerView) r9Var.b).getId(), a, null);
            aVar.c();
            aVar.f();
            return;
        }
        b53.g0("binding");
        throw null;
    }

    public final void D() {
        ct3 w;
        List f = t().c.f();
        f.getClass();
        o oVar = (o) tq0.U0(f);
        if ((oVar instanceof os4) && (w = w()) != null) {
            w.M0(((os4) oVar).getTitle());
        }
    }

    @Override // defpackage.dl2
    public final Object d() {
        return z().d();
    }

    @Override // defpackage.ys0, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return l07.K(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l75] */
    @Override // androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Class cls;
        jn1.a(this, new ml6(0, 0, 2, new d96(6)), 2);
        A(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
        int i = R.id.settings_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ep2.r(inflate, R.id.settings_container);
        if (fragmentContainerView != null) {
            i = R.id.settings_footer;
            View r = ep2.r(inflate, R.id.settings_footer);
            if (r != null) {
                u57 u57Var = new u57(8, (LinearLayout) r);
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) ep2.r(inflate, R.id.toolbar);
                if (toolbar != null) {
                    i = R.id.view_status_bar_background;
                    View r2 = ep2.r(inflate, R.id.view_status_bar_background);
                    if (r2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.D0 = new r9(constraintLayout, fragmentContainerView, u57Var, toolbar, r2);
                        setContentView(constraintLayout);
                        r9 r9Var = this.D0;
                        if (r9Var != null) {
                            y((Toolbar) r9Var.d);
                            ct3 w = w();
                            if (w != null) {
                                w.K0(true);
                            }
                            ?? obj = new Object();
                            obj.A = -1;
                            r9 r9Var2 = this.D0;
                            if (r9Var2 != null) {
                                hi0 hi0Var = new hi0(7, obj, this);
                                WeakHashMap weakHashMap = aa7.a;
                                s97.c((ConstraintLayout) r9Var2.a, hi0Var);
                                t().n.add(new s16(this, 0));
                                if (bundle == null) {
                                    Bundle extras = getIntent().getExtras();
                                    if (extras != null) {
                                        str = extras.getString("entry_point");
                                    } else {
                                        str = null;
                                    }
                                    if (str != null && str.hashCode() == 2074200845 && str.equals("custom_firmware_entry_point")) {
                                        cls = CustomFirmwarePreferencesFragment.class;
                                    } else {
                                        cls = MainPreferencesFragment.class;
                                    }
                                    mg2 t = t();
                                    t.getClass();
                                    a aVar = new a(t);
                                    r9 r9Var3 = this.D0;
                                    if (r9Var3 != null) {
                                        int id = ((FragmentContainerView) r9Var3.b).getId();
                                        hg2 hg2Var = aVar.a;
                                        if (hg2Var != null) {
                                            if (aVar.b != null) {
                                                aVar.j(id, hg2Var.a(cls.getName()), null);
                                                if (!aVar.i) {
                                                    aVar.j = false;
                                                    aVar.t.A(aVar, false);
                                                } else {
                                                    i.n("This transaction is already being added to the back stack");
                                                    return;
                                                }
                                            } else {
                                                i.n("The FragmentManager must be attached to itshost to create a Fragment");
                                                return;
                                            }
                                        } else {
                                            i.n("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                            return;
                                        }
                                    } else {
                                        b53.g0("binding");
                                        throw null;
                                    }
                                }
                                D();
                                return;
                            }
                            b53.g0("binding");
                            throw null;
                        }
                        b53.g0("binding");
                        throw null;
                    }
                }
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            if (!t().R(-1, 0)) {
                finish();
                return true;
            }
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        String string;
        CharSequence q0;
        super.onStart();
        il6 il6Var = this.z0;
        d42 d42Var = (d42) il6Var.getValue();
        Object systemService = d42Var.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).registerDisplayListener(d42Var.d, null);
        d42Var.b();
        ct3 w = w();
        if (w == null || (q0 = w.q0()) == null || (string = q0.toString()) == null) {
            string = getString(R.string.settings);
            string.getClass();
        }
        ee6 ee6Var = this.A0;
        ee6Var.getClass();
        ee6Var.l(null, string);
        t().n.add(this.C0);
        d42 d42Var2 = (d42) il6Var.getValue();
        et0 et0Var = new et0(181857455, true, new bt5(4, this));
        d42Var2.c = et0Var;
        f42 f42Var = d42Var2.b;
        if (f42Var != null) {
            f42Var.B.setValue(et0Var);
        }
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        mg2 t = t();
        t.n.remove(this.C0);
        ((d42) this.z0.getValue()).a();
        super.onStop();
    }

    public final q8 z() {
        if (this.w0 == null) {
            synchronized (this.x0) {
                try {
                    if (this.w0 == null) {
                        this.w0 = new q8(this);
                    }
                } finally {
                }
            }
        }
        return this.w0;
    }
}
