package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aq1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ aq1(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String obj;
        String obj2;
        int i2 = this.A;
        Uri uri = null;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i2) {
            case 0:
                mi2 mi2Var = (mi2) obj4;
                int i3 = EmulatorActivity.P1;
                String obj5 = ((EditText) obj3).getText().toString();
                if (!zg6.B0(obj5)) {
                    uri = obj5;
                }
                mi2Var.n(uri);
                return;
            case 1:
                k91 k91Var = (k91) obj4;
                FirmwareBirthdayPreference firmwareBirthdayPreference = (FirmwareBirthdayPreference) obj3;
                Map map = FirmwareBirthdayPreference.A;
                int parseInt = Integer.parseInt(((TextView) k91Var.A).getText().toString());
                int parseInt2 = Integer.parseInt(((TextView) k91Var.B).getText().toString());
                NumberFormat numberFormat = FirmwareBirthdayPreference.B;
                String l = wh1.l(numberFormat.format(Integer.valueOf(parseInt)), "/", numberFormat.format(Integer.valueOf(parseInt2)));
                if (firmwareBirthdayPreference.callChangeListener(l)) {
                    firmwareBirthdayPreference.persistString(l);
                }
                dialogInterface.dismiss();
                return;
            case 2:
                b.i((b) obj4, (List) obj3, i);
                return;
            case 3:
                ((b) obj3).L.v.g((vc3) ((ArrayList) obj4).get(i));
                return;
            case 4:
                c9 c9Var = (c9) obj3;
                String str3 = (String) tq0.M0((List) obj4);
                if (str3 != null) {
                    uri = Uri.parse(str3);
                }
                c9Var.a(uri);
                return;
            default:
                k91 k91Var2 = (k91) obj3;
                xd5 k = ((RetroAchievementsPreferencesFragment) obj4).k();
                Editable text = ((TextInputEditText) k91Var2.B).getText();
                if (text == null || (obj2 = text.toString()) == null) {
                    str = "";
                } else {
                    str = obj2;
                }
                Editable text2 = ((TextInputEditText) k91Var2.A).getText();
                if (text2 == null || (obj = text2.toString()) == null) {
                    str2 = "";
                } else {
                    str2 = obj;
                }
                tq5.w(ua7.a(k), null, null, new wx1(k, str, str2, (j11) null, 21), 3);
                dialogInterface.dismiss();
                return;
        }
    }
}
