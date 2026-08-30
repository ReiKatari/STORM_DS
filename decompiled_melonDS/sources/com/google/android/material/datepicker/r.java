package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends BaseAdapter {
    public static final int R = x.c(null).getMaximum(4);
    public static final int X = (x.c(null).getMaximum(7) + x.c(null).getMaximum(5)) - 1;
    public final q A;
    public c B;
    public final b L;

    public r(q qVar, b bVar) {
        this.A = qVar;
        this.L = bVar;
        throw null;
    }

    public final int a() {
        int i2 = this.L.X;
        q qVar = this.A;
        Calendar calendar = qVar.A;
        int i10 = calendar.get(7);
        if (i2 <= 0) {
            i2 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i2;
        if (i11 < 0) {
            return i11 + qVar.R;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final Long getItem(int i2) {
        if (i2 >= a() && i2 <= c()) {
            Calendar a10 = x.a(this.A.A);
            a10.set(5, (i2 - a()) + 1);
            return Long.valueOf(a10.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.A.X) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return X;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2 / this.A.R;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.B == null) {
            this.B = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a10 = i2 - a();
        if (a10 >= 0) {
            q qVar = this.A;
            if (a10 < qVar.X) {
                textView.setTag(qVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a10 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i2) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                x.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i2) == null) {
            textView.getContext();
            x.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
