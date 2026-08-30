package wh;

import android.content.Context;
import android.content.Intent;
import e.k;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ k L;

    public /* synthetic */ b(Context context, k kVar, int i2) {
        this.A = i2;
        this.B = context;
        this.L = kVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.L.a(new Intent(this.B, LayoutEditorActivity.class));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                Intent intent = new Intent(this.B, SettingsActivity.class);
                intent.putExtra("entry_point", "custom_firmware_entry_point");
                this.L.a(intent);
                break;
            default:
                Intent intent2 = new Intent(this.B, SettingsActivity.class);
                intent2.putExtra("entry_point", "custom_firmware_entry_point");
                this.L.a(intent2);
                break;
        }
        return y.f14813a;
    }
}
