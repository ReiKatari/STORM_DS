package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iz3  reason: default package */
/* loaded from: classes.dex */
public final class iz3 extends BaseAdapter {
    public static final int R = z57.c(null).getMaximum(4);
    public static final int X = (z57.c(null).getMaximum(7) + z57.c(null).getMaximum(5)) - 1;
    public final hz3 A;
    public q03 B;
    public final x80 L;

    public iz3(hz3 hz3Var, x80 x80Var) {
        this.A = hz3Var;
        this.L = x80Var;
        throw null;
    }

    public final int a() {
        int i = this.L.X;
        hz3 hz3Var = this.A;
        Calendar calendar = hz3Var.A;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + hz3Var.R;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final Long getItem(int i) {
        if (i >= a() && i <= c()) {
            Calendar a = z57.a(this.A.A);
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
            this.B = new q03(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a = i - a();
        if (a >= 0) {
            hz3 hz3Var = this.A;
            if (a < hz3Var.X) {
                textView.setTag(hz3Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                z57.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            z57.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
