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
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wu3  reason: default package */
/* loaded from: classes.dex */
public final class wu3<S> extends sn4 {
    public int B;
    public x80 L;
    public hz3 R;
    public a X;
    public q03 Y;
    public RecyclerView Z;
    public RecyclerView c0;
    public View d0;
    public View e0;
    public View f0;
    public View g0;
    public MaterialButton h0;
    public AccessibilityManager i0;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: wu3$a */
    /* loaded from: classes.dex */
    public enum a {
        DAY,
        YEAR
    }

    public final void h(hz3 hz3Var) {
        boolean z;
        c cVar = (c) this.c0.getAdapter();
        int d = cVar.d.A.d(hz3Var);
        AccessibilityManager accessibilityManager = this.i0;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            this.R = hz3Var;
            this.c0.h0(d);
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
            this.R = hz3Var;
            if (z && z2) {
                this.c0.h0(d - 3);
                this.c0.post(new m90(d, 2, this));
            } else {
                RecyclerView recyclerView = this.c0;
                if (z) {
                    recyclerView.h0(d + 3);
                    this.c0.post(new m90(d, 2, this));
                } else {
                    recyclerView.post(new m90(d, 2, this));
                }
            }
        }
        j(d);
    }

    public final void i(a aVar) {
        this.X = aVar;
        if (aVar == a.YEAR) {
            this.Z.getLayoutManager().q0(this.R.L - ((mj7) this.Z.getAdapter()).d.L.A.L);
            this.f0.setVisibility(0);
            this.g0.setVisibility(8);
            this.d0.setVisibility(8);
            this.e0.setVisibility(8);
        } else if (aVar == a.DAY) {
            this.f0.setVisibility(8);
            this.g0.setVisibility(0);
            this.d0.setVisibility(0);
            this.e0.setVisibility(0);
            h(this.R);
        }
    }

    public final void j(int i) {
        boolean z;
        View view = this.e0;
        boolean z2 = false;
        if (i + 1 < this.c0.getAdapter().a()) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        View view2 = this.d0;
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
            this.L = (x80) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.R = (hz3) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            } else {
                c44.b();
                return;
            }
        }
        c44.b();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        n81 n81Var;
        ei4 ei4Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.B);
        this.Y = new q03(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.i0 = (AccessibilityManager) requireContext().getSystemService("accessibility");
        hz3 hz3Var = this.L.A;
        if (bv3.m(contextThemeWrapper, 16843277)) {
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
        int i3 = iz3.R;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        aa7.n(gridView, new tu3(0));
        int i4 = this.L.X;
        if (i4 > 0) {
            n81Var = new n81(i4);
        } else {
            n81Var = new n81();
        }
        gridView.setAdapter((ListAdapter) n81Var);
        gridView.setNumColumns(hz3Var.R);
        gridView.setEnabled(false);
        this.c0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        getContext();
        this.c0.setLayoutManager(new uu3(this, i2, i2));
        this.c0.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.L, new ka3(13, this));
        this.c0.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.Z = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.Z.setLayoutManager(new GridLayoutManager(integer));
            this.Z.setAdapter(new mj7(this));
            this.Z.i(new hn1(this));
        }
        View findViewById = inflate.findViewById(R.id.month_navigation_fragment_toggle);
        x80 x80Var = cVar.d;
        if (findViewById != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.h0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            aa7.n(this.h0, new rn0(2, this));
            View findViewById2 = inflate.findViewById(R.id.month_navigation_previous);
            this.d0 = findViewById2;
            findViewById2.setTag("NAVIGATION_PREV_TAG");
            View findViewById3 = inflate.findViewById(R.id.month_navigation_next);
            this.e0 = findViewById3;
            findViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.g0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            i(a.DAY);
            this.h0.setText(this.R.c());
            this.c0.j(new vu3(this, cVar));
            this.h0.setOnClickListener(new q7(2, this));
            this.e0.setOnClickListener(new su3(this, cVar, 1));
            this.d0.setOnClickListener(new su3(this, cVar, 0));
            j(x80Var.A.d(this.R));
        }
        if (!bv3.m(contextThemeWrapper, 16843277) && (recyclerView2 = (ei4Var = new ei4()).a) != (recyclerView = this.c0)) {
            fa6 fa6Var = ei4Var.b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.e1;
                if (arrayList != null) {
                    arrayList.remove(fa6Var);
                }
                ei4Var.a.setOnFlingListener(null);
            }
            ei4Var.a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    ei4Var.a.j(fa6Var);
                    ei4Var.a.setOnFlingListener(ei4Var);
                    new Scroller(ei4Var.a.getContext(), new DecelerateInterpolator());
                    ei4Var.f();
                } else {
                    i.n("An instance of OnFlingListener already set.");
                    return null;
                }
            }
        }
        this.c0.h0(x80Var.A.d(this.R));
        aa7.n(this.c0, new tu3(1));
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
