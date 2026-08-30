package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ls1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ls1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A;
    public final /* synthetic */ r9 B;

    public /* synthetic */ ls1(r9 r9Var, int i) {
        this.A = i;
        this.B = r9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A;
        r9 r9Var = this.B;
        switch (i2) {
            case 0:
                ((os1) r9Var.b).j();
                return;
            case 1:
                Intent intent = new Intent((xp) r9Var.a, SettingsActivity.class);
                intent.putExtra("entry_point", "custom_firmware_entry_point");
                ((h9) r9Var.d).a(intent);
                return;
            case 2:
                ((os1) r9Var.b).j();
                return;
            case 3:
                ((h9) r9Var.d).a(new Intent((xp) r9Var.a, SettingsActivity.class));
                return;
            case 4:
                ((os1) r9Var.b).j();
                return;
            case 5:
                Intent intent2 = new Intent((xp) r9Var.a, SettingsActivity.class);
                intent2.putExtra("entry_point", "custom_firmware_entry_point");
                ((h9) r9Var.d).a(intent2);
                return;
            case ig7.b /* 6 */:
                js1 A = r9Var.A();
                SharedPreferences.Editor edit = ((b56) A.c).b.edit();
                edit.remove("bios_dir");
                edit.remove("dsi_bios_dir");
                edit.apply();
                A.e();
                return;
            case 7:
                ((os1) r9Var.b).j();
                return;
            case 8:
                ((h9) r9Var.e).a(new Intent((xp) r9Var.a, DSiWareManagerActivity.class));
                return;
            case 9:
                ((os1) r9Var.b).j();
                return;
            default:
                ((h9) r9Var.d).a(new Intent((xp) r9Var.a, SettingsActivity.class));
                return;
        }
    }
}
