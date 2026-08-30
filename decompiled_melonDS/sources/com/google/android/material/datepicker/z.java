package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import j7.j1;
import j7.k0;
import java.util.Locale;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final m f3066d;

    public z(m mVar) {
        this.f3066d = mVar;
    }

    @Override // j7.k0
    public final int a() {
        return this.f3066d.L.Y;
    }

    @Override // j7.k0
    public final void e(j1 j1Var, int i2) {
        String format;
        m mVar = this.f3066d;
        int i10 = mVar.L.A.L + i2;
        TextView textView = ((y) j1Var).f3065u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i10)));
        Context context = textView.getContext();
        if (x.b().get(1) == i10) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
        }
        textView.setContentDescription(format);
        c cVar = mVar.Y;
        if (x.b().get(1) == i10) {
            x8.e eVar = cVar.f3033b;
        } else {
            x8.e eVar2 = cVar.f3032a;
        }
        throw null;
    }

    @Override // j7.k0
    public final j1 f(ViewGroup viewGroup, int i2) {
        return new y((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
