package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class MacAddressPreference extends Preference {
    public final kj7 A;
    public vs3 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MacAddressPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = sn2.d(System.nanoTime());
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        vs3 vs3Var;
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_mac_address_editor, (ViewGroup) null, false);
        TextView textView = (TextView) ep2.r(inflate, R.id.text_mac_address);
        if (textView != null) {
            k91 k91Var = new k91((LinearLayout) inflate, textView);
            String persistedString = getPersistedString(null);
            if (persistedString != null) {
                List list = vs3.b;
                List<String> Q0 = zg6.Q0(persistedString, new String[]{":"});
                ArrayList arrayList = new ArrayList(uq0.y0(Q0, 10));
                for (String str : Q0) {
                    str.getClass();
                    e17 c0 = nl2.c0(16, str);
                    if (c0 != null) {
                        arrayList.add(new e17(c0.A));
                    } else {
                        gh6.h0(str);
                        throw null;
                    }
                }
                vs3Var = new vs3(arrayList);
            } else {
                vs3Var = null;
            }
            this.B = vs3Var;
            if (vs3Var != null && vs3Var.a.size() != 6) {
                this.B = null;
            }
            vs3 vs3Var2 = this.B;
            TextView textView2 = (TextView) k91Var.B;
            if (vs3Var2 == null) {
                textView2.setText(getContext().getString(R.string.not_set));
            } else {
                textView2.setText(vs3Var2.toString());
            }
            sb sbVar = new sb(getContext());
            ((pb) sbVar.L).d = getTitle();
            sbVar.B((LinearLayout) k91Var.A);
            sbVar.z(R.string.ok, new iw(2, this));
            sbVar.x(R.string.cancel, new hm0(5));
            sbVar.y(R.string.generate_new_mac_address, null);
            sbVar.C().f(-3).setOnClickListener(new b82(1, this, k91Var));
            return;
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.text_mac_address)));
    }
}
