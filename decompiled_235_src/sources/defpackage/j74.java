package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.stormds.emulator.R;
import java.util.Calendar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j74  reason: default package */
/* loaded from: classes.dex */
public final class j74 extends BaseAdapter {
    public static final int R = uj7.c(null).getMaximum(4);
    public static final int X = (uj7.c(null).getMaximum(7) + uj7.c(null).getMaximum(5)) - 1;
    public final i74 A;
    public u63 B;
    public final fb0 L;

    public j74(i74 i74Var, fb0 fb0Var) {
        this.A = i74Var;
        this.L = fb0Var;
        throw null;
    }

    public final int a() {
        int i = this.L.X;
        i74 i74Var = this.A;
        Calendar calendar = i74Var.A;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + i74Var.R;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final Long getItem(int i) {
        if (i >= a() && i <= c()) {
            Calendar a = uj7.a(this.A.A);
            a.set(5, (i - a()) + 1);
            return Long.valueOf(a.getTimeInMillis());
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
    public final long getItemId(int i) {
        return i / this.A.R;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.B == null) {
            this.B = new u63(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a = i - a();
        if (a >= 0) {
            i74 i74Var = this.A;
            if (a < i74Var.X) {
                textView.setTag(i74Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                uj7.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            uj7.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
