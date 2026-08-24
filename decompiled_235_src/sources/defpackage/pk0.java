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
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pk0 implements u23, y05, kh6, zk4, rb0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ pk0(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        int i;
        int i2 = this.A;
        Object obj = this.L;
        bh5 bh5Var = (bh5) this.B;
        switch (i2) {
            case 6:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                int i3 = SettingsActivity.F0;
                view.getClass();
                ru7 ru7Var = vu7Var.a;
                e83 h = ru7Var.h(647);
                h.getClass();
                int i4 = h.d;
                int i5 = h.b;
                int i6 = h.c;
                int i7 = h.a;
                if (bh5Var.A == -1) {
                    s9 s9Var = settingsActivity.E0;
                    if (s9Var != null) {
                        bh5Var.A = ((Toolbar) s9Var.d).getContentInsetStartWithNavigation();
                    } else {
                        nb3.a0("binding");
                        throw null;
                    }
                }
                s9 s9Var2 = settingsActivity.E0;
                if (s9Var2 != null) {
                    if (((Toolbar) s9Var2.d).getLayoutDirection() == 0) {
                        i = i7;
                    } else {
                        i = i6;
                    }
                    s9 s9Var3 = settingsActivity.E0;
                    if (s9Var3 != null) {
                        ((Toolbar) s9Var3.d).setContentInsetStartWithNavigation(bh5Var.A + i);
                        s9 s9Var4 = settingsActivity.E0;
                        if (s9Var4 != null) {
                            Toolbar toolbar = (Toolbar) s9Var4.d;
                            toolbar.setPadding(i7, toolbar.getPaddingTop(), i6, toolbar.getPaddingBottom());
                            s9 s9Var5 = settingsActivity.E0;
                            if (s9Var5 != null) {
                                View view2 = (View) s9Var5.e;
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams.height = i5;
                                    view2.setLayoutParams(layoutParams);
                                    s9 s9Var6 = settingsActivity.E0;
                                    if (s9Var6 != null) {
                                        FragmentContainerView fragmentContainerView = (FragmentContainerView) s9Var6.b;
                                        ViewGroup.LayoutParams layoutParams2 = fragmentContainerView.getLayoutParams();
                                        if (layoutParams2 != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                                            marginLayoutParams.leftMargin = i7;
                                            marginLayoutParams.rightMargin = i6;
                                            fragmentContainerView.setLayoutParams(marginLayoutParams);
                                            s9 s9Var7 = settingsActivity.E0;
                                            if (s9Var7 != null) {
                                                LinearLayout linearLayout = (LinearLayout) ((j97) s9Var7.c).B;
                                                linearLayout.setPadding(i7, linearLayout.getPaddingTop(), i6, i4);
                                                return ru7Var.q(i7, i5, i6, i4);
                                            }
                                            nb3.a0("binding");
                                            throw null;
                                        }
                                        u34.x("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        return null;
                                    }
                                    nb3.a0("binding");
                                    throw null;
                                }
                                u34.x("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                return null;
                            }
                            nb3.a0("binding");
                            throw null;
                        }
                        nb3.a0("binding");
                        throw null;
                    }
                    nb3.a0("binding");
                    throw null;
                }
                nb3.a0("binding");
                throw null;
            default:
                bt btVar = (bt) obj;
                Toolbar toolbar2 = (Toolbar) btVar.L;
                int i8 = ShortcutSetupActivity.C0;
                view.getClass();
                ru7 ru7Var2 = vu7Var.a;
                e83 h2 = ru7Var2.h(647);
                h2.getClass();
                int i9 = h2.b;
                int i10 = h2.c;
                int i11 = h2.a;
                if (bh5Var.A == -1) {
                    bh5Var.A = toolbar2.getContentInsetLeft();
                }
                int i12 = bh5Var.A + i11;
                int contentInsetRight = toolbar2.getContentInsetRight();
                toolbar2.d();
                o26 o26Var = toolbar2.s0;
                o26Var.h = false;
                if (i12 != Integer.MIN_VALUE) {
                    o26Var.e = i12;
                    o26Var.a = i12;
                }
                if (contentInsetRight != Integer.MIN_VALUE) {
                    o26Var.f = contentInsetRight;
                    o26Var.b = contentInsetRight;
                }
                toolbar2.setPadding(i11, toolbar2.getPaddingTop(), i10, toolbar2.getPaddingBottom());
                View view3 = (View) btVar.R;
                ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = i9;
                    view3.setLayoutParams(layoutParams3);
                    FrameLayout frameLayout = (FrameLayout) btVar.B;
                    ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams2.leftMargin = i11;
                        marginLayoutParams2.rightMargin = i10;
                        frameLayout.setLayoutParams(marginLayoutParams2);
                        return ru7Var2.q(i11, i9, i10, 0);
                    }
                    u34.x("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                u34.x("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return null;
        }
    }

    @Override // defpackage.kh6
    public boolean a() {
        a25 a25Var = (a25) this.B;
        nz nzVar = (nz) this.L;
        if (!a25Var.q) {
            a25Var.h();
            long a = nz.a(a25Var.o, nzVar.a);
            nzVar.a = a;
            a25Var.q = !a25Var.g(a25Var.n, a + nzVar.b);
        }
        return a25Var.q;
    }

    @Override // defpackage.u23
    public void b(v23 v23Var) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 2:
                ((u23) obj).b((s63) obj2);
                return;
            default:
                ((u23) obj).b((re5) obj2);
                return;
        }
    }

    public void c(cz czVar) {
        qf1 qf1Var = (qf1) this.B;
        yo2 yo2Var = yo2.DEFAULT;
        if (((bw6) this.L).c.a() && czVar.d) {
            yo2Var = yo2.YUV;
        }
        qm4 qm4Var = qf1Var.a;
        bp2.d((AtomicBoolean) qm4Var.L, true);
        bp2.c((Thread) qm4Var.X);
        if (((yo2) qm4Var.i0) != yo2Var) {
            qm4Var.i0 = yo2Var;
            qm4Var.u(qm4Var.A);
        }
    }

    @Override // defpackage.y05
    public void i(Preference preference) {
        Uri uri;
        List list;
        String str;
        d9 d9Var = (d9) this.B;
        StoragePickerPreference storagePickerPreference = (StoragePickerPreference) this.L;
        String[] strArr = null;
        Set<String> persistedStringSet = preference.getPersistedStringSet(null);
        if (persistedStringSet != null && (str = (String) gt0.I0(persistedStringSet)) != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        String str2 = storagePickerPreference.X;
        if (str2 != null) {
            list = qs6.K0(str2, new String[]{"|"}, 6);
        } else {
            list = null;
        }
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        }
        d9Var.a(new vr4(uri, strArr));
    }

    @Override // defpackage.rb0
    public Object s(qb0 qb0Var) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 8:
                ((AtomicReference) obj).set(qb0Var);
                return "SurfaceRequest-surface-recreation(" + ((bw6) obj2).hashCode() + ")";
            default:
                Executor executor = (Executor) obj2;
                on2 on2Var = (on2) obj;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                hx3 hx3Var = new hx3(atomicBoolean, 1);
                tj1 tj1Var = tj1.INSTANCE;
                hl5 hl5Var = qb0Var.c;
                if (hl5Var != null) {
                    hl5Var.a(tj1Var, hx3Var);
                }
                executor.execute(new ix3(atomicBoolean, qb0Var, on2Var, 1));
                return jg7.a;
        }
    }
}
