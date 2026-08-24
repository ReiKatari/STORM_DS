package defpackage;

import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import defpackage.f24;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r7  reason: default package */
/* loaded from: classes.dex */
public final class r7 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ r7(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.A;
        Message message4 = null;
        o44 o44Var = null;
        message4 = null;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((k8) obj).a();
                return;
            case 1:
                yb ybVar = (yb) obj;
                if (view == ybVar.j && (message3 = ybVar.l) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == ybVar.m && (message2 = ybVar.o) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == ybVar.p && (message = ybVar.r) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                ybVar.G.obtainMessage(1, ybVar.b).sendToTarget();
                return;
            case 2:
                o60 o60Var = (o60) obj;
                if (o60Var.g0 && o60Var.isShowing()) {
                    if (!o60Var.i0) {
                        TypedArray obtainStyledAttributes = o60Var.getContext().obtainStyledAttributes(new int[]{16843611});
                        o60Var.h0 = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        o60Var.i0 = true;
                    }
                    if (o60Var.h0) {
                        o60Var.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                f24 f24Var = (f24) obj;
                f24.a aVar = f24Var.X;
                f24.a aVar2 = f24.a.YEAR;
                if (aVar == aVar2) {
                    f24Var.i(f24.a.DAY);
                    f24Var.d0.announceForAccessibility(f24Var.getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else if (aVar == f24.a.DAY) {
                    f24Var.i(aVar2);
                    f24Var.Z.announceForAccessibility(f24Var.getString(R.string.mtrl_picker_toggled_to_year_selection));
                    return;
                } else {
                    return;
                }
            case 4:
                ((Preference) obj).performClick(view);
                return;
            default:
                d87 d87Var = ((Toolbar) obj).L0;
                if (d87Var != null) {
                    o44Var = d87Var.B;
                }
                if (o44Var != null) {
                    o44Var.collapseActionView();
                    return;
                }
                return;
        }
    }
}
