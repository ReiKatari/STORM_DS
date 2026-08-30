package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class c extends g65 {
    public final x80 d;
    public final ka3 e;
    public final int f;

    public c(ContextThemeWrapper contextThemeWrapper, x80 x80Var, ka3 ka3Var) {
        int i;
        hz3 hz3Var = x80Var.A;
        hz3 hz3Var2 = x80Var.B;
        hz3 hz3Var3 = x80Var.R;
        if (hz3Var.A.compareTo(hz3Var3.A) <= 0) {
            if (hz3Var3.A.compareTo(hz3Var2.A) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * iz3.R;
                if (bv3.m(contextThemeWrapper, 16843277)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.f = dimensionPixelSize + i;
                this.d = x80Var;
                this.e = ka3Var;
                g(true);
                return;
            }
            i.i("currentPage cannot be after lastPage");
            throw null;
        }
        i.i("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // defpackage.g65
    public final int a() {
        return this.d.Z;
    }

    @Override // defpackage.g65
    public final long b(int i) {
        Calendar a = z57.a(this.d.A.A);
        a.add(2, i);
        a.set(5, 1);
        Calendar a2 = z57.a(a);
        a2.get(2);
        a2.get(1);
        a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        return a2.getTimeInMillis();
    }

    @Override // defpackage.g65
    public final void e(g75 g75Var, int i) {
        b bVar = (b) g75Var;
        x80 x80Var = this.d;
        Calendar a = z57.a(x80Var.A.A);
        a.add(2, i);
        hz3 hz3Var = new hz3(a);
        bVar.u.setText(hz3Var.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && hz3Var.equals(materialCalendarGridView.a().A)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new iz3(hz3Var, x80Var);
        throw null;
    }

    @Override // defpackage.g65
    public final g75 f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (bv3.m(viewGroup.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new r65(-1, this.f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}
