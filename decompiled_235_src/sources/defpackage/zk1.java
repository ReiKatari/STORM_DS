package defpackage;

import android.hardware.display.DisplayManager;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zk1  reason: default package */
/* loaded from: classes.dex */
public final class zk1 implements DisplayManager.DisplayListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zk1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.a) {
            case 0:
                al1 al1Var = (al1) this.b;
                synchronized (al1Var.c) {
                    al1Var.d = null;
                    al1Var.f = null;
                }
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.b;
                emulatorActivity.runOnUiThread(new yu1(emulatorActivity, 13));
                return;
            case 2:
                ((v82) this.b).b();
                return;
            default:
                int i2 = LayoutEditorActivity.N0;
                ((LayoutEditorActivity) this.b).E();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                al1 al1Var = (al1) this.b;
                synchronized (al1Var.c) {
                    al1Var.d = null;
                    al1Var.f = null;
                }
                return;
            case 1:
                int i2 = EmulatorActivity.Z1;
                ((EmulatorActivity) this.b).R0();
                return;
            case 2:
                return;
            default:
                int i3 = LayoutEditorActivity.N0;
                ((LayoutEditorActivity) this.b).E();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.a) {
            case 0:
                al1 al1Var = (al1) this.b;
                synchronized (al1Var.c) {
                    al1Var.d = null;
                    al1Var.f = null;
                }
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.b;
                emulatorActivity.runOnUiThread(new yu1(emulatorActivity, 14));
                return;
            case 2:
                ((v82) this.b).b();
                return;
            default:
                int i2 = LayoutEditorActivity.N0;
                ((LayoutEditorActivity) this.b).E();
                return;
        }
    }

    private final void a(int i) {
    }
}
