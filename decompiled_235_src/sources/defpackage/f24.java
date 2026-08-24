package defpackage;

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
import com.google.android.material.datepicker.c;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f24  reason: default package */
/* loaded from: classes.dex */
public final class f24<S> extends xw4 {
    public int B;
    public fb0 L;
    public i74 R;
    public a X;
    public u63 Y;
    public RecyclerView Z;
    public RecyclerView d0;
    public View e0;
    public View f0;
    public View g0;
    public View h0;
    public MaterialButton i0;
    public AccessibilityManager j0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: f24$a */
    /* loaded from: classes.dex */
    public enum a {
        DAY,
        YEAR
    }

    public final void h(i74 i74Var) {
        boolean z;
        c cVar = (c) this.d0.getAdapter();
        int d = cVar.d.A.d(i74Var);
        AccessibilityManager accessibilityManager = this.j0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.R = i74Var;
            this.d0.h0(d);
        } else {
            int d2 = d - cVar.d.A.d(this.R);
            boolean z2 = false;
            if (Math.abs(d2) > 3) {
                z = true;
            } else {
                z = false;
            }
            if (d2 > 0) {
                z2 = true;
            }
            this.R = i74Var;
            if (z && z2) {
                this.d0.h0(d - 3);
                this.d0.post(new ub0(this, d, 2));
            } else {
                RecyclerView recyclerView = this.d0;
                if (z) {
                    recyclerView.h0(d + 3);
                    this.d0.post(new ub0(this, d, 2));
                } else {
                    recyclerView.post(new ub0(this, d, 2));
                }
            }
        }
        j(d);
    }

    public final void i(a aVar) {
        this.X = aVar;
        if (aVar == a.YEAR) {
            this.Z.getLayoutManager().q0(this.R.L - ((hy7) this.Z.getAdapter()).d.L.A.L);
            this.g0.setVisibility(0);
            this.h0.setVisibility(8);
            this.e0.setVisibility(8);
            this.f0.setVisibility(8);
        } else if (aVar == a.DAY) {
            this.g0.setVisibility(8);
            this.h0.setVisibility(0);
            this.e0.setVisibility(0);
            this.f0.setVisibility(0);
            h(this.R);
        }
    }

    public final void j(int i) {
        boolean z;
        View view = this.f0;
        boolean z2 = false;
        if (i + 1 < this.d0.getAdapter().a()) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        View view2 = this.e0;
        if (i - 1 >= 0) {
            z2 = true;
        }
        view2.setEnabled(z2);
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.B = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.L = (fb0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.R = (i74) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                u34.a();
                return;
            }
        }
        u34.a();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ec1 ec1Var;
        hr4 hr4Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.B);
        this.Y = new u63(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.j0 = (AccessibilityManager) requireContext().getSystemService("accessibility");
        i74 i74Var = this.L.A;
        if (k24.k(contextThemeWrapper, 16843277)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = j74.R;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ao7.n(gridView, new c24(0));
        int i4 = this.L.X;
        if (i4 > 0) {
            ec1Var = new ec1(i4);
        } else {
            ec1Var = new ec1();
        }
        gridView.setAdapter((ListAdapter) ec1Var);
        gridView.setNumColumns(i74Var.R);
        gridView.setEnabled(false);
        this.d0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.d0.setLayoutManager(new d24(this, i2, i2));
        this.d0.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.L, new s63(this, 17));
        this.d0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.Z.setLayoutManager(new GridLayoutManager(integer));
            this.Z.setAdapter(new hy7(this));
            this.Z.i(new rr1(this));
        }
        View findViewById = inflate.findViewById(R.id.month_navigation_fragment_toggle);
        fb0 fb0Var = cVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.i0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ao7.n(this.i0, new l60(this, 3));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_previous);
            this.e0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(R.id.month_navigation_next);
            this.f0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.g0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.h0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            i(a.DAY);
            this.i0.setText(this.R.c());
            this.d0.j(new e24(this, cVar));
            this.i0.setOnClickListener(new r7(this, 3));
            this.f0.setOnClickListener(new b24(this, cVar, 1));
            this.e0.setOnClickListener(new b24(this, cVar, 0));
            j(fb0Var.A.d(this.R));
        }
        if (!k24.k(contextThemeWrapper, 16843277) && (recyclerView2 = (hr4Var = new hr4()).a) != (recyclerView = this.d0)) {
            ul6 ul6Var = hr4Var.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f1;
                if (arrayList != null) {
                    arrayList.remove(ul6Var);
                }
                hr4Var.a.setOnFlingListener(null);
            }
            hr4Var.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    hr4Var.a.j(ul6Var);
                    hr4Var.a.setOnFlingListener(hr4Var);
                    new Scroller(hr4Var.a.getContext(), new DecelerateInterpolator());
                    hr4Var.f();
                } else {
                    i.m("An instance of OnFlingListener already set.");
                    return null;
                }
            }
        }
        this.d0.h0(fb0Var.A.d(this.R));
        ao7.n(this.d0, new c24(1));
        return inflate;
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.B);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.L);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.R);
    }
}
