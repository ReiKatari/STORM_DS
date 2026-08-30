package ah;

import android.hardware.display.DisplayManager;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.i f805b;

    public /* synthetic */ p(l.i iVar, int i2) {
        this.f804a = i2;
        this.f805b = iVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i2) {
        int i10 = this.f804a;
        l.i iVar = this.f805b;
        switch (i10) {
            case 0:
                EmulatorActivity emulatorActivity = (EmulatorActivity) iVar;
                emulatorActivity.runOnUiThread(new h(emulatorActivity, 2));
                return;
            default:
                int i11 = LayoutEditorActivity.K0;
                ((LayoutEditorActivity) iVar).C();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i2) {
        int i10 = this.f804a;
        l.i iVar = this.f805b;
        switch (i10) {
            case 0:
                int i11 = EmulatorActivity.f9503a1;
                ((EmulatorActivity) iVar).E();
                return;
            default:
                int i12 = LayoutEditorActivity.K0;
                ((LayoutEditorActivity) iVar).C();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i2) {
        int i10 = this.f804a;
        l.i iVar = this.f805b;
        switch (i10) {
            case 0:
                EmulatorActivity emulatorActivity = (EmulatorActivity) iVar;
                emulatorActivity.runOnUiThread(new h(emulatorActivity, 3));
                return;
            default:
                int i11 = LayoutEditorActivity.K0;
                ((LayoutEditorActivity) iVar).C();
                return;
        }
    }
}
