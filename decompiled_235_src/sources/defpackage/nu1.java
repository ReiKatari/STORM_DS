package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nu1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ nu1(int i, Object obj, Object obj2) {
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
                qn2 qn2Var = (qn2) obj4;
                int i3 = EmulatorActivity.Z1;
                String obj5 = ((EditText) obj3).getText().toString();
                if (!qs6.v0(obj5)) {
                    uri = obj5;
                }
                qn2Var.g(uri);
                return;
            case 1:
                yc1 yc1Var = (yc1) obj4;
                FirmwareBirthdayPreference firmwareBirthdayPreference = (FirmwareBirthdayPreference) obj3;
                Map map = FirmwareBirthdayPreference.A;
                int parseInt = Integer.parseInt(((TextView) yc1Var.A).getText().toString());
                int parseInt2 = Integer.parseInt(((TextView) yc1Var.B).getText().toString());
                NumberFormat numberFormat = FirmwareBirthdayPreference.B;
                String m = lb1.m(numberFormat.format(Integer.valueOf(parseInt)), "/", numberFormat.format(Integer.valueOf(parseInt2)));
                if (firmwareBirthdayPreference.callChangeListener(m)) {
                    firmwareBirthdayPreference.persistString(m);
                }
                dialogInterface.dismiss();
                return;
            case 2:
                b.h((b) obj4, (List) obj3, i);
                return;
            case 3:
                d9 d9Var = (d9) obj3;
                String str3 = (String) gt0.J0((List) obj4);
                if (str3 != null) {
                    uri = Uri.parse(str3);
                }
                d9Var.a(uri);
                return;
            default:
                yc1 yc1Var2 = (yc1) obj3;
                sn5 k = ((RetroAchievementsPreferencesFragment) obj4).k();
                Editable text = ((TextInputEditText) yc1Var2.B).getText();
                if (text == null || (obj2 = text.toString()) == null) {
                    str = "";
                } else {
                    str = obj2;
                }
                Editable text2 = ((TextInputEditText) yc1Var2.A).getText();
                if (text2 == null || (obj = text2.toString()) == null) {
                    str2 = "";
                } else {
                    str2 = obj;
                }
                hv.L(to7.a(k), null, null, new u12(k, str, str2, (r41) null, 25), 3);
                dialogInterface.dismiss();
                return;
        }
    }
}
