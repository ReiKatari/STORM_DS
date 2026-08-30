package me.magnum.melonds.ui.settings;

import a0.j;
import a6.p0;
import a6.x0;
import ah.i1;
import aj.g;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.h1;
import androidx.fragment.app.j0;
import androidx.fragment.app.z0;
import androidx.lifecycle.a1;
import androidx.preference.Preference;
import androidx.preference.a0;
import b9.e;
import bi.h;
import ci.m;
import java.util.List;
import java.util.WeakHashMap;
import k0.d;
import k7.w;
import kb.b;
import l.i;
import m9.o;
import mb.c;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment;
import nc.k;
import q8.r;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class SettingsActivity extends i implements c {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9577y0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile b f9578u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Object f9579v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9580w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public e f9581x0;

    public SettingsActivity() {
        q(new i1(this, 2));
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().c();
    }

    public final boolean B(a0 a0Var, Preference preference) {
        String fragment = preference.getFragment();
        if (fragment == null) {
            return false;
        }
        z0 H = t().H();
        ClassLoader.getSystemClassLoader();
        j0 a10 = H.a(fragment);
        a10.setArguments(preference.getExtras());
        h1 t5 = t();
        t5.getClass();
        a aVar = new a(t5);
        aVar.f1230d = R.anim.fragment_translate_enter_push;
        aVar.f1231e = R.anim.fragment_translate_exit_push;
        aVar.f1232f = R.anim.fragment_translate_enter_pop;
        aVar.f1233g = R.anim.fragment_translate_exit_pop;
        e eVar = this.f9581x0;
        if (eVar != null) {
            aVar.i(((FragmentContainerView) eVar.L).getId(), a10, null);
            if (aVar.f1236j) {
                aVar.f1235i = true;
                aVar.f1237k = null;
                aVar.e();
                return true;
            }
            j.p("This FragmentTransaction is not allowed to be added to the back stack.");
            return false;
        }
        k.f("binding");
        throw null;
    }

    public final void C() {
        g w10;
        List f8 = t().f1312c.f();
        f8.getClass();
        j0 j0Var = (j0) l.a0(f8);
        if ((j0Var instanceof ci.l) && (w10 = w()) != null) {
            w10.o0(((ci.l) j0Var).getTitle());
        }
    }

    @Override // mb.b
    public final Object d() {
        return z().d();
    }

    @Override // d.k, androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return d.w(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, nc.r] */
    @Override // androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        Class cls;
        A(bundle);
        r.w(getWindow());
        View inflate = getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
        int i2 = R.id.settings_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) w.k(inflate, R.id.settings_container);
        if (fragmentContainerView != null) {
            i2 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) w.k(inflate, R.id.toolbar);
            if (toolbar != null) {
                i2 = R.id.view_status_bar_background;
                View k10 = w.k(inflate, R.id.view_status_bar_background);
                if (k10 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f9581x0 = new e(constraintLayout, fragmentContainerView, toolbar, k10, 16);
                    setContentView(constraintLayout);
                    e eVar = this.f9581x0;
                    if (eVar != null) {
                        y((Toolbar) eVar.R);
                        g w10 = w();
                        if (w10 != null) {
                            w10.h0(true);
                        }
                        ?? obj = new Object();
                        obj.A = -1;
                        e eVar2 = this.f9581x0;
                        if (eVar2 != null) {
                            h hVar = new h(3, obj, this);
                            WeakHashMap weakHashMap = x0.f533a;
                            p0.k((ConstraintLayout) eVar2.B, hVar);
                            t().f1322n.add(new m(this));
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
                                h1 t5 = t();
                                t5.getClass();
                                a aVar = new a(t5);
                                e eVar3 = this.f9581x0;
                                if (eVar3 != null) {
                                    int id2 = ((FragmentContainerView) eVar3.L).getId();
                                    z0 z0Var = aVar.f1227a;
                                    if (z0Var != null) {
                                        if (aVar.f1228b != null) {
                                            aVar.i(id2, z0Var.a(cls.getName()), null);
                                            if (!aVar.f1235i) {
                                                aVar.f1236j = false;
                                                aVar.f1245t.A(aVar, false);
                                            } else {
                                                j.p("This transaction is already being added to the back stack");
                                                return;
                                            }
                                        } else {
                                            j.p("The FragmentManager must be attached to itshost to create a Fragment");
                                            return;
                                        }
                                    } else {
                                        j.p("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                        return;
                                    }
                                } else {
                                    k.f("binding");
                                    throw null;
                                }
                            }
                            C();
                            return;
                        }
                        k.f("binding");
                        throw null;
                    }
                    k.f("binding");
                    throw null;
                }
            }
        }
        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
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

    public final b z() {
        if (this.f9578u0 == null) {
            synchronized (this.f9579v0) {
                try {
                    if (this.f9578u0 == null) {
                        this.f9578u0 = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9578u0;
    }
}
