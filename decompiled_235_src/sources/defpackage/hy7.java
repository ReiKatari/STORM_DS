package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.stormds.emulator.R;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy7  reason: default package */
/* loaded from: classes.dex */
public final class hy7 extends wf5 {
    public final f24 d;

    public hy7(f24 f24Var) {
        this.d = f24Var;
    }

    @Override // defpackage.wf5
    public final int a() {
        return this.d.L.Y;
    }

    @Override // defpackage.wf5
    public final void e(wg5 wg5Var, int i) {
        String format;
        f24 f24Var = this.d;
        int i2 = f24Var.L.A.L + i;
        TextView textView = ((gy7) wg5Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        if (uj7.b().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        u63 u63Var = f24Var.Y;
        if (uj7.b().get(1) == i2) {
            Object obj = u63Var.L;
        } else {
            Object obj2 = u63Var.B;
        }
        throw null;
    }

    @Override // defpackage.wf5
    public final wg5 f(ViewGroup viewGroup, int i) {
        return new gy7((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
