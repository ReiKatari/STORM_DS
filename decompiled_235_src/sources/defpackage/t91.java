package defpackage;

import android.content.Context;
import android.content.Intent;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t91  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t91 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ j04 L;

    public /* synthetic */ t91(Context context, j04 j04Var, int i) {
        this.A = i;
        this.B = context;
        this.L = j04Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        j04 j04Var = this.L;
        Context context = this.B;
        switch (i) {
            case 0:
                Intent intent = new Intent(context, SettingsActivity.class);
                intent.putExtra("entry_point", "custom_firmware_entry_point");
                j04Var.a(intent);
                return jg7Var;
            case 1:
                Intent intent2 = new Intent(context, SettingsActivity.class);
                intent2.putExtra("entry_point", "custom_firmware_entry_point");
                j04Var.a(intent2);
                return jg7Var;
            default:
                j04Var.a(new Intent(context, LayoutEditorActivity.class));
                return jg7Var;
        }
    }
}
