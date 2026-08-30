package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import defpackage.wu3;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q7  reason: default package */
/* loaded from: classes.dex */
public final class q7 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ q7(int i, Object obj) {
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
        zw3 zw3Var = null;
        message4 = null;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((j8) obj).a();
                return;
            case 1:
                rb rbVar = (rb) obj;
                if (view == rbVar.j && (message3 = rbVar.l) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == rbVar.m && (message2 = rbVar.o) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == rbVar.p && (message = rbVar.r) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                rbVar.G.obtainMessage(1, rbVar.b).sendToTarget();
                return;
            case 2:
                wu3 wu3Var = (wu3) obj;
                wu3.a aVar = wu3Var.X;
                wu3.a aVar2 = wu3.a.YEAR;
                if (aVar == aVar2) {
                    wu3Var.i(wu3.a.DAY);
                    wu3Var.c0.announceForAccessibility(wu3Var.getString(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else if (aVar == wu3.a.DAY) {
                    wu3Var.i(aVar2);
                    wu3Var.Z.announceForAccessibility(wu3Var.getString(R.string.mtrl_picker_toggled_to_year_selection));
                    return;
                } else {
                    return;
                }
            case 3:
                ((Preference) obj).performClick(view);
                return;
            default:
                pv6 pv6Var = ((Toolbar) obj).K0;
                if (pv6Var != null) {
                    zw3Var = pv6Var.B;
                }
                if (zw3Var != null) {
                    zw3Var.collapseActionView();
                    return;
                }
                return;
        }
    }
}
