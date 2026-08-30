package com.google.android.material.datepicker;

import a6.x0;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j7.g0;
import j7.m1;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m<S> extends v {
    public int B;
    public b L;
    public q R;
    public a X;
    public c Y;
    public RecyclerView Z;

    /* renamed from: b0  reason: collision with root package name */
    public RecyclerView f3037b0;

    /* renamed from: c0  reason: collision with root package name */
    public View f3038c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f3039d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f3040e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f3041f0;

    /* renamed from: g0  reason: collision with root package name */
    public MaterialButton f3042g0;

    /* renamed from: h0  reason: collision with root package name */
    public AccessibilityManager f3043h0;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public enum a {
        DAY,
        YEAR
    }

    public final void h(q qVar) {
        boolean z10;
        u uVar = (u) this.f3037b0.getAdapter();
        int d4 = uVar.f3061d.A.d(qVar);
        AccessibilityManager accessibilityManager = this.f3043h0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.R = qVar;
            this.f3037b0.h0(d4);
        } else {
            int d10 = d4 - uVar.f3061d.A.d(this.R);
            boolean z11 = false;
            if (Math.abs(d10) > 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (d10 > 0) {
                z11 = true;
            }
            this.R = qVar;
            if (z10 && z11) {
                this.f3037b0.h0(d4 - 3);
                this.f3037b0.post(new g(d4, 0, this));
            } else {
                RecyclerView recyclerView = this.f3037b0;
                if (z10) {
                    recyclerView.h0(d4 + 3);
                    this.f3037b0.post(new g(d4, 0, this));
                } else {
                    recyclerView.post(new g(d4, 0, this));
                }
            }
        }
        j(d4);
    }

    public final void i(a aVar) {
        this.X = aVar;
        if (aVar == a.YEAR) {
            this.Z.getLayoutManager().q0(this.R.L - ((z) this.Z.getAdapter()).f3066d.L.A.L);
            this.f3040e0.setVisibility(0);
            this.f3041f0.setVisibility(8);
            this.f3038c0.setVisibility(8);
            this.f3039d0.setVisibility(8);
        } else if (aVar == a.DAY) {
            this.f3040e0.setVisibility(8);
            this.f3041f0.setVisibility(0);
            this.f3038c0.setVisibility(0);
            this.f3039d0.setVisibility(0);
            h(this.R);
        }
    }

    public final void j(int i2) {
        boolean z10;
        View view = this.f3039d0;
        boolean z11 = false;
        if (i2 + 1 < this.f3037b0.getAdapter().a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setEnabled(z10);
        View view2 = this.f3038c0;
        if (i2 - 1 >= 0) {
            z11 = true;
        }
        view2.setEnabled(z11);
    }

    @Override // androidx.fragment.app.j0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.B = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.L = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.R = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                m9.o.b();
                return;
            }
        }
        m9.o.b();
    }

    @Override // androidx.fragment.app.j0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i10;
        e eVar;
        g0 g0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.B);
        this.Y = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f3043h0 = (AccessibilityManager) requireContext().getSystemService("accessibility");
        q qVar = this.L.A;
        if (o.m(contextThemeWrapper, 16843277)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = r.R;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        x0.o(gridView, new h(0));
        int i12 = this.L.X;
        if (i12 > 0) {
            eVar = new e(i12);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(qVar.R);
        gridView.setEnabled(false);
        this.f3037b0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.f3037b0.setLayoutManager(new i(this, i10, i10));
        this.f3037b0.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.L, new a0.b(18, this));
        this.f3037b0.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.Z.setLayoutManager(new GridLayoutManager(integer));
            this.Z.setAdapter(new z(this));
            this.Z.i(new j(this));
        }
        View findViewById = inflate.findViewById(R.id.month_navigation_fragment_toggle);
        b bVar = uVar.f3061d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.f3042g0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            x0.o(this.f3042g0, new androidx.preference.g0(1, this));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_previous);
            this.f3038c0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(R.id.month_navigation_next);
            this.f3039d0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f3040e0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3041f0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            i(a.DAY);
            this.f3042g0.setText(this.R.c());
            this.f3037b0.j(new k(this, uVar));
            this.f3042g0.setOnClickListener(new l(0, this));
            this.f3039d0.setOnClickListener(new f(this, uVar, 1));
            this.f3038c0.setOnClickListener(new f(this, uVar, 0));
            j(bVar.A.d(this.R));
        }
        if (!o.m(contextThemeWrapper, 16843277) && (recyclerView2 = (g0Var = new g0()).f7569a) != (recyclerView = this.f3037b0)) {
            m1 m1Var = g0Var.f7570b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1625c1;
                if (arrayList != null) {
                    arrayList.remove(m1Var);
                }
                g0Var.f7569a.setOnFlingListener(null);
            }
            g0Var.f7569a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    g0Var.f7569a.j(m1Var);
                    g0Var.f7569a.setOnFlingListener(g0Var);
                    new Scroller(g0Var.f7569a.getContext(), new DecelerateInterpolator());
                    g0Var.f();
                } else {
                    a0.j.p("An instance of OnFlingListener already set.");
                    return null;
                }
            }
        }
        this.f3037b0.h0(bVar.A.d(this.R));
        x0.o(this.f3037b0, new h(1));
        return inflate;
    }

    @Override // androidx.fragment.app.j0
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.B);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.L);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.R);
    }
}
