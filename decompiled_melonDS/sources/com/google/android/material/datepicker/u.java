package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j7.j1;
import j7.k0;
import j7.v0;
import java.util.Calendar;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final b f3061d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.b f3062e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3063f;

    public u(ContextThemeWrapper contextThemeWrapper, b bVar, a0.b bVar2) {
        int i2;
        q qVar = bVar.A;
        q qVar2 = bVar.B;
        q qVar3 = bVar.R;
        if (qVar.A.compareTo(qVar3.A) <= 0) {
            if (qVar3.A.compareTo(qVar2.A) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r.R;
                if (o.m(contextThemeWrapper, 16843277)) {
                    i2 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i2 = 0;
                }
                this.f3063f = dimensionPixelSize + i2;
                this.f3061d = bVar;
                this.f3062e = bVar2;
                h(true);
                return;
            }
            a0.j.h("currentPage cannot be after lastPage");
            throw null;
        }
        a0.j.h("firstPage cannot be after currentPage");
        throw null;
    }

    @Override // j7.k0
    public final int a() {
        return this.f3061d.Z;
    }

    @Override // j7.k0
    public final long b(int i2) {
        Calendar a10 = x.a(this.f3061d.A.A);
        a10.add(2, i2);
        a10.set(5, 1);
        Calendar a11 = x.a(a10);
        a11.get(2);
        a11.get(1);
        a11.getMaximum(7);
        a11.getActualMaximum(5);
        a11.getTimeInMillis();
        return a11.getTimeInMillis();
    }

    @Override // j7.k0
    public final void e(j1 j1Var, int i2) {
        t tVar = (t) j1Var;
        b bVar = this.f3061d;
        Calendar a10 = x.a(bVar.A.A);
        a10.add(2, i2);
        q qVar = new q(a10);
        tVar.f3059u.setText(qVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) tVar.f3060v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && qVar.equals(materialCalendarGridView.a().A)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new r(qVar, bVar);
        throw null;
    }

    @Override // j7.k0
    public final j1 f(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (o.m(viewGroup.getContext(), 16843277)) {
            linearLayout.setLayoutParams(new v0(-1, this.f3063f));
            return new t(linearLayout, true);
        }
        return new t(linearLayout, false);
    }
}
