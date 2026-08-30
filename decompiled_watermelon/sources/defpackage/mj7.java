package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mj7  reason: default package */
/* loaded from: classes.dex */
public final class mj7 extends g65 {
    public final wu3 d;

    public mj7(wu3 wu3Var) {
        this.d = wu3Var;
    }

    @Override // defpackage.g65
    public final int a() {
        return this.d.L.Y;
    }

    @Override // defpackage.g65
    public final void e(g75 g75Var, int i) {
        String format;
        wu3 wu3Var = this.d;
        int i2 = wu3Var.L.A.L + i;
        TextView textView = ((lj7) g75Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        if (z57.b().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        q03 q03Var = wu3Var.Y;
        if (z57.b().get(1) == i2) {
            Object obj = q03Var.L;
        } else {
            Object obj2 = q03Var.B;
        }
        throw null;
    }

    @Override // defpackage.g65
    public final g75 f(ViewGroup viewGroup, int i) {
        return new lj7((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
