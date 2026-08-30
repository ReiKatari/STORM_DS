package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import bi.b;
import bi.j;
import bk.a;
import java.util.ArrayList;
import java.util.List;
import jb.c;
import k7.w;
import l.d;
import me.magnum.melonds.R;
import oe.z;
import p7.n;
import qc.e;
import vc.h;
import vc.o;
import yb.p;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MacAddressPreference extends Preference {
    public final e A;
    public z B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MacAddressPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A = n.a(System.nanoTime());
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        z zVar;
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_mac_address_editor, (ViewGroup) null, false);
        TextView textView = (TextView) w.k(inflate, R.id.text_mac_address);
        if (textView != null) {
            c cVar = new c(12, (LinearLayout) inflate, textView);
            String persistedString = getPersistedString(null);
            if (persistedString != null) {
                List list = z.f10965b;
                List<String> v02 = h.v0(persistedString, new String[]{":"});
                ArrayList arrayList = new ArrayList(m.G(v02, 10));
                for (String str : v02) {
                    str.getClass();
                    p y10 = n.y(16, str);
                    if (y10 != null) {
                        arrayList.add(new p(y10.A));
                    } else {
                        o.Q(str);
                        throw null;
                    }
                }
                zVar = new z(arrayList);
            } else {
                zVar = null;
            }
            this.B = zVar;
            if (zVar != null && zVar.f10966a.size() != 6) {
                this.B = null;
            }
            z zVar2 = this.B;
            TextView textView2 = (TextView) cVar.L;
            if (zVar2 == null) {
                textView2.setText(getContext().getString(R.string.not_set));
            } else {
                textView2.setText(zVar2.toString());
            }
            a aVar = new a(getContext());
            d dVar = (d) aVar.L;
            dVar.f8359d = getTitle();
            aVar.x((LinearLayout) cVar.B);
            aVar.v(R.string.ok, new j(1, this));
            aVar.u(R.string.cancel, new ah.m(5));
            dVar.f8366k = dVar.f8356a.getText(R.string.generate_new_mac_address);
            dVar.f8367l = null;
            aVar.y().Z.f8402p.setOnClickListener(new b(4, this, cVar));
            return;
        }
        m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.text_mac_address)));
    }
}
