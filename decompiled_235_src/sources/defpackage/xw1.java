package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xw1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ s9 B;

    public /* synthetic */ xw1(s9 s9Var, int i) {
        this.A = i;
        this.B = s9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        s9 s9Var = this.B;
        switch (i2) {
            case 0:
                ((ax1) s9Var.b).d();
                return;
            case 1:
                Intent intent = new Intent((jq) s9Var.a, SettingsActivity.class);
                intent.putExtra("entry_point", "custom_firmware_entry_point");
                ((i9) s9Var.d).a(intent);
                return;
            case 2:
                ((ax1) s9Var.b).d();
                return;
            case 3:
                ((i9) s9Var.d).a(new Intent((jq) s9Var.a, SettingsActivity.class));
                return;
            case 4:
                ((ax1) s9Var.b).d();
                return;
            case 5:
                Intent intent2 = new Intent((jq) s9Var.a, SettingsActivity.class);
                intent2.putExtra("entry_point", "custom_firmware_entry_point");
                ((i9) s9Var.d).a(intent2);
                return;
            case 6:
                vw1 A = s9Var.A();
                SharedPreferences.Editor edit = ((ng6) A.c).b.edit();
                edit.remove("bios_dir");
                edit.remove("dsi_bios_dir");
                edit.apply();
                A.e();
                return;
            case 7:
                ((ax1) s9Var.b).d();
                return;
            case 8:
                ((i9) s9Var.e).a(new Intent((jq) s9Var.a, DSiWareManagerActivity.class));
                return;
            case 9:
                ((ax1) s9Var.b).d();
                return;
            default:
                ((i9) s9Var.d).a(new Intent((jq) s9Var.a, SettingsActivity.class));
                return;
        }
    }
}
