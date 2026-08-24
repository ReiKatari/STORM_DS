package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MacAddressPreference extends Preference {
    public final fy7 A;
    public zz3 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MacAddressPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = yh2.d(System.nanoTime());
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        zz3 zz3Var;
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_mac_address_editor, (ViewGroup) null, false);
        TextView textView = (TextView) gi2.B(inflate, R.id.text_mac_address);
        if (textView != null) {
            yc1 yc1Var = new yc1((LinearLayout) inflate, textView);
            String persistedString = getPersistedString(null);
            if (persistedString != null) {
                List list = zz3.b;
                List<String> K0 = qs6.K0(persistedString, new String[]{":"}, 6);
                ArrayList arrayList = new ArrayList(ht0.v0(K0, 10));
                for (String str : K0) {
                    str.getClass();
                    ze7 T = qo2.T(16, str);
                    if (T != null) {
                        arrayList.add(new ze7(T.A));
                    } else {
                        xs6.a0(str);
                        throw null;
                    }
                }
                zz3Var = new zz3(arrayList);
            } else {
                zz3Var = null;
            }
            this.B = zz3Var;
            if (zz3Var != null && zz3Var.a.size() != 6) {
                this.B = null;
            }
            zz3 zz3Var2 = this.B;
            TextView textView2 = (TextView) yc1Var.B;
            if (zz3Var2 == null) {
                textView2.setText(getContext().getString(R.string.not_set));
            } else {
                textView2.setText(zz3Var2.toString());
            }
            zb zbVar = new zb(getContext());
            wb wbVar = (wb) zbVar.L;
            wbVar.d = getTitle();
            zbVar.A((LinearLayout) yc1Var.A);
            zbVar.y(R.string.ok, new ax(this, 2));
            zbVar.x(R.string.cancel, new qo0(4));
            wbVar.k = wbVar.a.getText(R.string.generate_new_mac_address);
            wbVar.l = null;
            zbVar.B().h(-3).setOnClickListener(new tc2(this, yc1Var, 1));
            return;
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.text_mac_address)));
    }
}
