package defpackage;

import android.content.Context;
import android.content.Intent;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e61 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ gt3 L;

    public /* synthetic */ e61(Context context, gt3 gt3Var, int i) {
        this.A = i;
        this.B = context;
        this.L = gt3Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        gt3 gt3Var = this.L;
        Context context = this.B;
        switch (i) {
            case 0:
                Intent intent = new Intent(context, SettingsActivity.class);
                intent.putExtra("entry_point", "custom_firmware_entry_point");
                gt3Var.a(intent);
                return o27Var;
            case 1:
                Intent intent2 = new Intent(context, SettingsActivity.class);
                intent2.putExtra("entry_point", "custom_firmware_entry_point");
                gt3Var.a(intent2);
                return o27Var;
            default:
                gt3Var.a(new Intent(context, LayoutEditorActivity.class));
                return o27Var;
        }
    }
}
