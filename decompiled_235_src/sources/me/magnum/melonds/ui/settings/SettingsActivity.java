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
import com.stormds.emulator.R;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SettingsActivity extends jq implements kr2 {
    public static final /* synthetic */ int F0 = 0;
    public final ex6 A0;
    public final tp6 B0;
    public final tp6 C0;
    public final gd6 D0;
    public s9 E0;
    public volatile r8 x0;
    public final Object y0 = new Object();
    public boolean z0 = false;

    public SettingsActivity() {
        q(new iq(this, 11));
        this.A0 = new ex6(new t46(this, 8));
        this.B0 = up6.a("");
        this.C0 = up6.a(null);
        this.D0 = new gd6(this, 1);
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    public final boolean B(k15 k15Var, Preference preference) {
        String fragment = preference.getFragment();
        if (fragment == null) {
            return false;
        }
        if (k15Var.getClass().getClassLoader() == null) {
            getClassLoader();
        }
        o a = t().H().a(fragment);
        a.setArguments(preference.getExtras());
        ll2 t = t();
        t.getClass();
        a aVar = new a(t);
        aVar.d = R.anim.fragment_translate_enter_push;
        aVar.e = R.anim.fragment_translate_exit_push;
        aVar.f = R.anim.fragment_translate_enter_pop;
        aVar.g = R.anim.fragment_translate_exit_pop;
        s9 s9Var = this.E0;
        if (s9Var != null) {
            aVar.e(((FragmentContainerView) s9Var.b).getId(), a, null);
            aVar.c();
            aVar.h();
            return true;
        }
        nb3.a0("binding");
        throw null;
    }

    public final void C(k15 k15Var, PreferenceScreen preferenceScreen) {
        preferenceScreen.getClass();
        if (k15Var.getClass().getClassLoader() == null) {
            getClassLoader();
        }
        o a = t().H().a(k15Var.getClass().getName());
        a.setArguments(jw2.l(new vr4(k15.ARG_PREFERENCE_ROOT, preferenceScreen.getKey())));
        ll2 t = t();
        t.getClass();
        a aVar = new a(t);
        aVar.d = R.anim.fragment_translate_enter_push;
        aVar.e = R.anim.fragment_translate_exit_push;
        aVar.f = R.anim.fragment_translate_enter_pop;
        aVar.g = R.anim.fragment_translate_exit_pop;
        s9 s9Var = this.E0;
        if (s9Var != null) {
            aVar.e(((FragmentContainerView) s9Var.b).getId(), a, null);
            aVar.c();
            aVar.h();
            return;
        }
        nb3.a0("binding");
        throw null;
    }

    public final void D() {
        ak7 w;
        List f = t().c.f();
        f.getClass();
        o oVar = (o) gt0.R0(f);
        if ((oVar instanceof q15) && (w = w()) != null) {
            w.D0(((q15) oVar).getTitle());
        }
    }

    @Override // defpackage.jr2
    public final Object c() {
        return z().c();
    }

    @Override // defpackage.mv0, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return hf.R(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, bh5] */
    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String str;
        Class cls;
        s9 s9Var;
        setTheme(ht.a().getThemeResId());
        if (ht.a() == g57.LIGHT) {
            tr1.a(this, new ix6(0, 0, 1, new r76(17)));
        } else {
            tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        }
        A(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false);
        int i = R.id.settings_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) gi2.B(inflate, R.id.settings_container);
        if (fragmentContainerView != null) {
            i = R.id.settings_footer;
            View B = gi2.B(inflate, R.id.settings_footer);
            if (B != null) {
                j97 j97Var = new j97((LinearLayout) B, 11);
                i = R.id.toolbar;
                Toolbar toolbar = (Toolbar) gi2.B(inflate, R.id.toolbar);
                if (toolbar != null) {
                    i = R.id.view_status_bar_background;
                    View B2 = gi2.B(inflate, R.id.view_status_bar_background);
                    if (B2 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        this.E0 = new s9(constraintLayout, fragmentContainerView, j97Var, toolbar, B2);
                        setContentView(constraintLayout);
                        s9 s9Var2 = this.E0;
                        if (s9Var2 != null) {
                            y((Toolbar) s9Var2.d);
                            ak7 w = w();
                            if (w != null) {
                                w.B0(true);
                            }
                            ?? obj = new Object();
                            obj.A = -1;
                            s9 s9Var3 = this.E0;
                            if (s9Var3 != null) {
                                pk0 pk0Var = new pk0(6, obj, this);
                                WeakHashMap weakHashMap = ao7.a;
                                sn7.c((ConstraintLayout) s9Var3.a, pk0Var);
                                t().n.add(new gd6(this, 0));
                                if (bundle == null) {
                                    Bundle extras = getIntent().getExtras();
                                    if (extras != null) {
                                        str = extras.getString("entry_point");
                                    } else {
                                        str = null;
                                    }
                                    if (str != null) {
                                        int hashCode = str.hashCode();
                                        if (hashCode != -1721943526) {
                                            if (hashCode == 2074200845 && str.equals("custom_firmware_entry_point")) {
                                                cls = CustomFirmwarePreferencesFragment.class;
                                                ll2 t = t();
                                                t.getClass();
                                                a aVar = new a(t);
                                                s9Var = this.E0;
                                                if (s9Var != null) {
                                                    int id = ((FragmentContainerView) s9Var.b).getId();
                                                    gl2 gl2Var = aVar.a;
                                                    if (gl2Var != null) {
                                                        if (aVar.b != null) {
                                                            aVar.e(id, gl2Var.a(cls.getName()), null);
                                                            if (!aVar.i) {
                                                                aVar.j = false;
                                                                aVar.t.A(aVar, false);
                                                            } else {
                                                                i.m("This transaction is already being added to the back stack");
                                                                return;
                                                            }
                                                        } else {
                                                            i.m("The FragmentManager must be attached to itshost to create a Fragment");
                                                            return;
                                                        }
                                                    } else {
                                                        i.m("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
                                                        return;
                                                    }
                                                } else {
                                                    nb3.a0("binding");
                                                    throw null;
                                                }
                                            }
                                        } else if (str.equals("translator")) {
                                            cls = TranslatorPreferencesFragment.class;
                                            ll2 t2 = t();
                                            t2.getClass();
                                            a aVar2 = new a(t2);
                                            s9Var = this.E0;
                                            if (s9Var != null) {
                                            }
                                        }
                                    }
                                    cls = MainPreferencesFragment.class;
                                    ll2 t22 = t();
                                    t22.getClass();
                                    a aVar22 = new a(t22);
                                    s9Var = this.E0;
                                    if (s9Var != null) {
                                    }
                                }
                                D();
                                return;
                            }
                            nb3.a0("binding");
                            throw null;
                        }
                        nb3.a0("binding");
                        throw null;
                    }
                }
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
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

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        String string;
        CharSequence h0;
        super.onStart();
        ex6 ex6Var = this.A0;
        v82 v82Var = (v82) ex6Var.getValue();
        Object systemService = v82Var.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).registerDisplayListener(v82Var.d, null);
        v82Var.b();
        ak7 w = w();
        if (w == null || (h0 = w.h0()) == null || (string = h0.toString()) == null) {
            string = getString(R.string.settings);
            string.getClass();
        }
        tp6 tp6Var = this.B0;
        tp6Var.getClass();
        tp6Var.m(null, string);
        t().n.add(this.D0);
        v82 v82Var2 = (v82) ex6Var.getValue();
        zv0 zv0Var = new zv0(181857455, true, new y36(this, 4));
        v82Var2.c = zv0Var;
        x82 x82Var = v82Var2.b;
        if (x82Var != null) {
            x82Var.B.setValue(zv0Var);
        }
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        ll2 t = t();
        t.n.remove(this.D0);
        ((v82) this.A0.getValue()).a();
        super.onStop();
    }

    public final r8 z() {
        if (this.x0 == null) {
            synchronized (this.y0) {
                try {
                    if (this.x0 == null) {
                        this.x0 = new r8(this);
                    }
                } finally {
                }
            }
        }
        return this.x0;
    }
}
