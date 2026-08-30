package bi;

import a6.d2;
import a6.i2;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import androidx.preference.Preference;
import d0.i1;
import d0.p1;
import d0.r1;
import d1.e2;
import j0.c1;
import j0.d1;
import j0.t0;
import j0.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
import n2.c2;
import p1.b1;
import q.m2;
import w.g1;
import w.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements a6.v, androidx.preference.p, c1, b5.j, c2, m0.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // androidx.preference.p
    public void a(Preference preference) {
        Uri uri;
        List list;
        String str;
        h.c cVar = (h.c) this.B;
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.L;
        String[] strArr = null;
        Set<String> persistedStringSet = preference.getPersistedStringSet(null);
        if (persistedStringSet != null && (str = (String) zb.l.S(persistedStringSet)) != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        String str2 = storagePickerPreference.R;
        if (str2 != null) {
            list = vc.h.v0(str2, new String[]{"|"});
        } else {
            list = null;
        }
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        }
        cVar.a(new yb.j(uri, strArr));
    }

    @Override // m0.a
    public ta.a apply(Object obj) {
        switch (this.A) {
            case 12:
                p0 p0Var = (p0) this.B;
                Void r5 = (Void) obj;
                p0Var.b();
                ((p1) this.L).a();
                return p0Var.m();
            default:
                ArrayList arrayList = (ArrayList) this.L;
                List list = (List) obj;
                aj.g.o("SyncCaptureSessionBase", "[" + ((g1) this.B) + "] getSurface done with results: " + list);
                if (list.isEmpty()) {
                    return new m0.k(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (list.contains(null)) {
                    return new m0.k(1, new t0("Surface closed", (u0) arrayList.get(list.indexOf(null))));
                }
                return m0.i.c(list);
        }
    }

    @Override // n2.c2
    public boolean b() {
        b1 b1Var = (b1) this.B;
        p1.b bVar = (p1.b) this.L;
        if (!b1Var.f11202q) {
            b1Var.h();
            long a10 = p1.b.a(b1Var.f11200o, bVar.f11182a);
            bVar.f11182a = a10;
            b1Var.f11202q = !b1Var.g(b1Var.f11199n, a10 + bVar.f11183b);
        }
        return b1Var.f11202q;
    }

    @Override // j0.c1
    public void c(d1 d1Var) {
        switch (this.A) {
            case 4:
                ((c1) this.L).c((i1) this.B);
                return;
            default:
                ((c1) this.L).c((d2.t) this.B);
                return;
        }
    }

    public void d(d0.k kVar) {
        r0.d dVar = (r0.d) this.B;
        t0.f fVar = t0.f.DEFAULT;
        if (((r1) this.L).f3447c.a() && kVar.f3411d) {
            fVar = t0.f.YUV;
        }
        e2 e2Var = dVar.f12565a;
        t0.i.d((AtomicBoolean) e2Var.L, true);
        t0.i.c((Thread) e2Var.X);
        if (((t0.f) e2Var.f3565g0) != fVar) {
            e2Var.f3565g0 = fVar;
            e2Var.p(e2Var.B);
        }
    }

    @Override // b5.j
    public Object h(b5.i iVar) {
        switch (this.A) {
            case l1.c.f8511g /* 5 */:
                ((AtomicReference) this.L).set(iVar);
                return "SurfaceRequest-surface-recreation(" + ((r1) this.B).hashCode() + ")";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                iVar.a(new p8.o(atomicBoolean, 1), p8.k.INSTANCE);
                ((Executor) this.B).execute(new p8.p(atomicBoolean, iVar, (mc.a) this.L, 1));
                return yb.y.f14813a;
        }
    }

    @Override // a6.v
    public i2 s(View view, i2 i2Var) {
        int i2;
        int i10 = this.A;
        Object obj = this.L;
        nc.r rVar = (nc.r) this.B;
        switch (i10) {
            case 0:
                a4.n nVar = (a4.n) obj;
                Toolbar toolbar = (Toolbar) nVar.L;
                int i11 = RomListActivity.D0;
                view.getClass();
                d2 d2Var = i2Var.f479a;
                q5.b f8 = d2Var.f(647);
                f8.getClass();
                int i12 = f8.f12284b;
                int i13 = f8.f12285c;
                int i14 = f8.f12283a;
                if (rVar.A == -1) {
                    rVar.A = toolbar.getContentInsetLeft();
                }
                int i15 = rVar.A + i14;
                int contentInsetRight = toolbar.getContentInsetRight();
                toolbar.e();
                m2 m2Var = toolbar.f1021q0;
                m2Var.f11963h = false;
                if (i15 != Integer.MIN_VALUE) {
                    m2Var.f11960e = i15;
                    m2Var.f11956a = i15;
                }
                if (contentInsetRight != Integer.MIN_VALUE) {
                    m2Var.f11961f = contentInsetRight;
                    m2Var.f11957b = contentInsetRight;
                }
                toolbar.setPadding(i14, toolbar.getPaddingTop(), i13, toolbar.getPaddingBottom());
                View view2 = (View) nVar.R;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i12;
                    view2.setLayoutParams(layoutParams);
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) nVar.B;
                    ViewGroup.LayoutParams layoutParams2 = fragmentContainerView.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams.leftMargin = i14;
                        marginLayoutParams.rightMargin = i13;
                        fragmentContainerView.setLayoutParams(marginLayoutParams);
                        return d2Var.m(i14, i12, i13, 0);
                    }
                    m9.o.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                m9.o.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return null;
            case 3:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i16 = SettingsActivity.f9577y0;
                view.getClass();
                d2 d2Var2 = i2Var.f479a;
                q5.b f10 = d2Var2.f(647);
                f10.getClass();
                int i17 = f10.f12284b;
                int i18 = f10.f12285c;
                int i19 = f10.f12283a;
                if (rVar.A == -1) {
                    b9.e eVar = settingsActivity.f9581x0;
                    if (eVar != null) {
                        rVar.A = ((Toolbar) eVar.R).getContentInsetStartWithNavigation();
                    } else {
                        nc.k.f("binding");
                        throw null;
                    }
                }
                b9.e eVar2 = settingsActivity.f9581x0;
                if (eVar2 != null) {
                    if (((Toolbar) eVar2.R).getLayoutDirection() == 0) {
                        i2 = i19;
                    } else {
                        i2 = i18;
                    }
                    b9.e eVar3 = settingsActivity.f9581x0;
                    if (eVar3 != null) {
                        ((Toolbar) eVar3.R).setContentInsetStartWithNavigation(rVar.A + i2);
                        b9.e eVar4 = settingsActivity.f9581x0;
                        if (eVar4 != null) {
                            Toolbar toolbar2 = (Toolbar) eVar4.R;
                            toolbar2.setPadding(i19, toolbar2.getPaddingTop(), i18, toolbar2.getPaddingBottom());
                            b9.e eVar5 = settingsActivity.f9581x0;
                            if (eVar5 != null) {
                                View view3 = (View) eVar5.X;
                                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                                if (layoutParams3 != null) {
                                    layoutParams3.height = i17;
                                    view3.setLayoutParams(layoutParams3);
                                    b9.e eVar6 = settingsActivity.f9581x0;
                                    if (eVar6 != null) {
                                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) eVar6.L;
                                        ViewGroup.LayoutParams layoutParams4 = fragmentContainerView2.getLayoutParams();
                                        if (layoutParams4 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                            marginLayoutParams2.leftMargin = i19;
                                            marginLayoutParams2.rightMargin = i18;
                                            fragmentContainerView2.setLayoutParams(marginLayoutParams2);
                                            return d2Var2.m(i19, i17, i18, 0);
                                        }
                                        m9.o.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        return null;
                                    }
                                    nc.k.f("binding");
                                    throw null;
                                }
                                m9.o.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return null;
                            }
                            nc.k.f("binding");
                            throw null;
                        }
                        nc.k.f("binding");
                        throw null;
                    }
                    nc.k.f("binding");
                    throw null;
                }
                nc.k.f("binding");
                throw null;
            default:
                a4.n nVar2 = (a4.n) obj;
                Toolbar toolbar3 = (Toolbar) nVar2.L;
                int i20 = ShortcutSetupActivity.f9629z0;
                view.getClass();
                d2 d2Var3 = i2Var.f479a;
                q5.b f11 = d2Var3.f(647);
                f11.getClass();
                int i21 = f11.f12284b;
                int i22 = f11.f12285c;
                int i23 = f11.f12283a;
                if (rVar.A == -1) {
                    rVar.A = toolbar3.getContentInsetLeft();
                }
                int i24 = rVar.A + i23;
                int contentInsetRight2 = toolbar3.getContentInsetRight();
                toolbar3.e();
                m2 m2Var2 = toolbar3.f1021q0;
                m2Var2.f11963h = false;
                if (i24 != Integer.MIN_VALUE) {
                    m2Var2.f11960e = i24;
                    m2Var2.f11956a = i24;
                }
                if (contentInsetRight2 != Integer.MIN_VALUE) {
                    m2Var2.f11961f = contentInsetRight2;
                    m2Var2.f11957b = contentInsetRight2;
                }
                toolbar3.setPadding(i23, toolbar3.getPaddingTop(), i22, toolbar3.getPaddingBottom());
                View view4 = (View) nVar2.R;
                ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = i21;
                    view4.setLayoutParams(layoutParams5);
                    FrameLayout frameLayout = (FrameLayout) nVar2.B;
                    ViewGroup.LayoutParams layoutParams6 = frameLayout.getLayoutParams();
                    if (layoutParams6 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
                        marginLayoutParams3.leftMargin = i23;
                        marginLayoutParams3.rightMargin = i22;
                        frameLayout.setLayoutParams(marginLayoutParams3);
                        return d2Var3.m(i23, i21, i22, 0);
                    }
                    m9.o.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                m9.o.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return null;
        }
    }
}
