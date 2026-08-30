package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {
    public static final int R;
    public final Calendar A;
    public final int B;
    public final int L;

    static {
        int i2;
        if (Build.VERSION.SDK_INT >= 26) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        R = i2;
    }

    public e() {
        Calendar c4 = x.c(null);
        this.A = c4;
        this.B = c4.getMaximum(7);
        this.L = c4.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.B;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        int i10 = this.B;
        if (i2 >= i10) {
            return null;
        }
        int i11 = i2 + this.L;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i2 + this.L;
        int i11 = this.B;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.A;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, R, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i2) {
        Calendar c4 = x.c(null);
        this.A = c4;
        this.B = c4.getMaximum(7);
        this.L = i2;
    }
}
