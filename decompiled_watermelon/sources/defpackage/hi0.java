package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import androidx.preference.Preference;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hi0 implements qw2, vr4, x56, bc4, j90 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ hi0(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // defpackage.bc4
    public vf7 G(View view, vf7 vf7Var) {
        int i;
        int i2 = this.A;
        Object obj = this.L;
        l75 l75Var = (l75) this.B;
        switch (i2) {
            case 5:
                RomListActivity romListActivity = (RomListActivity) obj;
                int i3 = RomListActivity.J0;
                view.getClass();
                rf7 rf7Var = vf7Var.a;
                x13 h = rf7Var.h(647);
                h.getClass();
                int i4 = h.b;
                int i5 = h.c;
                int i6 = h.a;
                if (l75Var.A == -1) {
                    q9 q9Var = romListActivity.I0;
                    if (q9Var != null) {
                        l75Var.A = ((Toolbar) q9Var.R).getContentInsetLeft();
                    } else {
                        b53.g0("binding");
                        throw null;
                    }
                }
                q9 q9Var2 = romListActivity.I0;
                if (q9Var2 != null) {
                    Toolbar toolbar = (Toolbar) q9Var2.R;
                    int i7 = l75Var.A + i6;
                    int contentInsetRight = toolbar.getContentInsetRight();
                    toolbar.e();
                    vr5 vr5Var = toolbar.r0;
                    vr5Var.h = false;
                    if (i7 != Integer.MIN_VALUE) {
                        vr5Var.e = i7;
                        vr5Var.a = i7;
                    }
                    if (contentInsetRight != Integer.MIN_VALUE) {
                        vr5Var.f = contentInsetRight;
                        vr5Var.b = contentInsetRight;
                    }
                    q9 q9Var3 = romListActivity.I0;
                    if (q9Var3 != null) {
                        Toolbar toolbar2 = (Toolbar) q9Var3.R;
                        toolbar2.setPadding(i6, toolbar2.getPaddingTop(), i5, toolbar2.getPaddingBottom());
                        q9 q9Var4 = romListActivity.I0;
                        if (q9Var4 != null) {
                            View view2 = (View) q9Var4.X;
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = i4;
                                view2.setLayoutParams(layoutParams);
                                q9 q9Var5 = romListActivity.I0;
                                if (q9Var5 != null) {
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) q9Var5.L;
                                    ViewGroup.LayoutParams layoutParams2 = fragmentContainerView.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                        marginLayoutParams.leftMargin = i6;
                                        marginLayoutParams.rightMargin = i5;
                                        fragmentContainerView.setLayoutParams(marginLayoutParams);
                                        return rf7Var.q(i6, i4, i5, 0);
                                    }
                                    c44.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    return null;
                                }
                                b53.g0("binding");
                                throw null;
                            }
                            c44.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            return null;
                        }
                        b53.g0("binding");
                        throw null;
                    }
                    b53.g0("binding");
                    throw null;
                }
                b53.g0("binding");
                throw null;
            case ig7.b /* 6 */:
            default:
                os osVar = (os) obj;
                Toolbar toolbar3 = (Toolbar) osVar.L;
                int i8 = ShortcutSetupActivity.B0;
                view.getClass();
                rf7 rf7Var2 = vf7Var.a;
                x13 h2 = rf7Var2.h(647);
                h2.getClass();
                int i9 = h2.b;
                int i10 = h2.c;
                int i11 = h2.a;
                if (l75Var.A == -1) {
                    l75Var.A = toolbar3.getContentInsetLeft();
                }
                int i12 = l75Var.A + i11;
                int contentInsetRight2 = toolbar3.getContentInsetRight();
                toolbar3.e();
                vr5 vr5Var2 = toolbar3.r0;
                vr5Var2.h = false;
                if (i12 != Integer.MIN_VALUE) {
                    vr5Var2.e = i12;
                    vr5Var2.a = i12;
                }
                if (contentInsetRight2 != Integer.MIN_VALUE) {
                    vr5Var2.f = contentInsetRight2;
                    vr5Var2.b = contentInsetRight2;
                }
                toolbar3.setPadding(i11, toolbar3.getPaddingTop(), i10, toolbar3.getPaddingBottom());
                View view3 = (View) osVar.R;
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = i9;
                    view3.setLayoutParams(layoutParams3);
                    FrameLayout frameLayout = (FrameLayout) osVar.B;
                    ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams2.leftMargin = i11;
                        marginLayoutParams2.rightMargin = i10;
                        frameLayout.setLayoutParams(marginLayoutParams2);
                        return rf7Var2.q(i11, i9, i10, 0);
                    }
                    c44.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                c44.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return null;
            case 7:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i13 = SettingsActivity.E0;
                view.getClass();
                rf7 rf7Var3 = vf7Var.a;
                x13 h3 = rf7Var3.h(647);
                h3.getClass();
                int i14 = h3.d;
                int i15 = h3.b;
                int i16 = h3.c;
                int i17 = h3.a;
                if (l75Var.A == -1) {
                    r9 r9Var = settingsActivity.D0;
                    if (r9Var != null) {
                        l75Var.A = ((Toolbar) r9Var.d).getContentInsetStartWithNavigation();
                    } else {
                        b53.g0("binding");
                        throw null;
                    }
                }
                r9 r9Var2 = settingsActivity.D0;
                if (r9Var2 != null) {
                    if (((Toolbar) r9Var2.d).getLayoutDirection() == 0) {
                        i = i17;
                    } else {
                        i = i16;
                    }
                    r9 r9Var3 = settingsActivity.D0;
                    if (r9Var3 != null) {
                        ((Toolbar) r9Var3.d).setContentInsetStartWithNavigation(l75Var.A + i);
                        r9 r9Var4 = settingsActivity.D0;
                        if (r9Var4 != null) {
                            Toolbar toolbar4 = (Toolbar) r9Var4.d;
                            toolbar4.setPadding(i17, toolbar4.getPaddingTop(), i16, toolbar4.getPaddingBottom());
                            r9 r9Var5 = settingsActivity.D0;
                            if (r9Var5 != null) {
                                View view4 = (View) r9Var5.e;
                                ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                                if (layoutParams5 != null) {
                                    layoutParams5.height = i15;
                                    view4.setLayoutParams(layoutParams5);
                                    r9 r9Var6 = settingsActivity.D0;
                                    if (r9Var6 != null) {
                                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) r9Var6.b;
                                        ViewGroup.LayoutParams layoutParams6 = fragmentContainerView2.getLayoutParams();
                                        if (layoutParams6 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6;
                                            marginLayoutParams3.leftMargin = i17;
                                            marginLayoutParams3.rightMargin = i16;
                                            fragmentContainerView2.setLayoutParams(marginLayoutParams3);
                                            r9 r9Var7 = settingsActivity.D0;
                                            if (r9Var7 != null) {
                                                LinearLayout linearLayout = (LinearLayout) ((u57) r9Var7.c).B;
                                                linearLayout.setPadding(i17, linearLayout.getPaddingTop(), i16, i14);
                                                return rf7Var3.q(i17, i15, i16, i14);
                                            }
                                            b53.g0("binding");
                                            throw null;
                                        }
                                        c44.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        return null;
                                    }
                                    b53.g0("binding");
                                    throw null;
                                }
                                c44.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return null;
                            }
                            b53.g0("binding");
                            throw null;
                        }
                        b53.g0("binding");
                        throw null;
                    }
                    b53.g0("binding");
                    throw null;
                }
                b53.g0("binding");
                throw null;
        }
    }

    @Override // defpackage.x56
    public boolean a() {
        ys4 ys4Var = (ys4) this.B;
        yx yxVar = (yx) this.L;
        if (!ys4Var.q) {
            ys4Var.h();
            long a = yx.a(ys4Var.o, yxVar.a);
            yxVar.a = a;
            ys4Var.q = !ys4Var.g(ys4Var.n, a + yxVar.b);
        }
        return ys4Var.q;
    }

    @Override // defpackage.qw2
    public void b(rw2 rw2Var) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 2:
                ((qw2) obj).b((ka3) obj2);
                return;
            default:
                ((qw2) obj).b((e55) obj2);
                return;
        }
    }

    @Override // defpackage.vr4
    public void c(Preference preference) {
        Uri uri;
        List list;
        String str;
        c9 c9Var = (c9) this.B;
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.L;
        String[] strArr = null;
        Set<String> persistedStringSet = preference.getPersistedStringSet(null);
        if (persistedStringSet != null && (str = (String) tq0.L0(persistedStringSet)) != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        String str2 = storagePickerPreference.X;
        if (str2 != null) {
            list = zg6.Q0(str2, new String[]{"|"});
        } else {
            list = null;
        }
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        }
        c9Var.a(new ti4(uri, strArr));
    }

    public void d(nx nxVar) {
        sb1 sb1Var = (sb1) this.B;
        uj2 uj2Var = uj2.DEFAULT;
        if (((hk6) this.L).c.a() && nxVar.d) {
            uj2Var = uj2.YUV;
        }
        pd4 pd4Var = sb1Var.a;
        xj2.d((AtomicBoolean) pd4Var.L, true);
        xj2.c((Thread) pd4Var.X);
        if (((uj2) pd4Var.h0) != uj2Var) {
            pd4Var.h0 = uj2Var;
            pd4Var.u(pd4Var.A);
        }
    }

    @Override // defpackage.j90
    public Object i(i90 i90Var) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 9:
                ((AtomicReference) obj).set(i90Var);
                return "SurfaceRequest-surface-recreation(" + ((hk6) obj2).hashCode() + ")";
            default:
                Executor executor = (Executor) obj2;
                ki2 ki2Var = (ki2) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                gq3 gq3Var = new gq3(atomicBoolean, 1);
                pf1 pf1Var = pf1.INSTANCE;
                pb5 pb5Var = i90Var.c;
                if (pb5Var != null) {
                    pb5Var.a(gq3Var, pf1Var);
                }
                executor.execute(new hq3(atomicBoolean, i90Var, ki2Var, 1));
                return o27.a;
        }
    }
}
