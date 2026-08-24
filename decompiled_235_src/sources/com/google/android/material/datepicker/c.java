package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.stormds.emulator.R;
import java.util.Calendar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c extends wf5 {
    public final fb0 d;
    public final s63 e;
    public final int f;

    public c(ContextThemeWrapper contextThemeWrapper, fb0 fb0Var, s63 s63Var) {
        int i;
        i74 i74Var = fb0Var.A;
        i74 i74Var2 = fb0Var.B;
        i74 i74Var3 = fb0Var.R;
        if (i74Var.A.compareTo(i74Var3.A) <= 0) {
            if (i74Var3.A.compareTo(i74Var2.A) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * j74.R;
                if (k24.k(contextThemeWrapper, 16843277)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.f = dimensionPixelSize + i;
                this.d = fb0Var;
                this.e = s63Var;
                g(true);
                return;
            }
            i.h("currentPage cannot be after lastPage");
            throw null;
        }
        i.h("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // defpackage.wf5
    public final int a() {
        return this.d.Z;
    }

    @Override // defpackage.wf5
    public final long b(int i) {
        Calendar a = uj7.a(this.d.A.A);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = uj7.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.wf5
    public final void e(wg5 wg5Var, int i) {
        b bVar = (b) wg5Var;
        fb0 fb0Var = this.d;
        Calendar a = uj7.a(fb0Var.A.A);
        a.add(2, i);
        i74 i74Var = new i74(a);
        bVar.u.setText(i74Var.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && i74Var.equals(materialCalendarGridView.a().A)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new j74(i74Var, fb0Var);
        throw null;
    }

    @Override // defpackage.wf5
    public final wg5 f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (k24.k(viewGroup.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new hg5(-1, this.f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}
