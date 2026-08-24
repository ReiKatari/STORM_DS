package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.stormds.emulator.R;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ec1  reason: default package */
/* loaded from: classes.dex */
public final class ec1 extends BaseAdapter {
    public static final int R;
    public final Calendar A;
    public final int B;
    public final int L;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        R = i;
    }

    public ec1() {
        Calendar c = uj7.c(null);
        this.A = c;
        this.B = c.getMaximum(7);
        this.L = c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.B;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.B;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.L;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.L;
        int i3 = this.B;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.A;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, R, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public ec1(int i) {
        Calendar c = uj7.c(null);
        this.A = c;
        this.B = c.getMaximum(7);
        this.L = i;
    }
}
