package defpackage;

import android.hardware.display.DisplayManager;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vg1  reason: default package */
/* loaded from: classes.dex */
public final class vg1 implements DisplayManager.DisplayListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vg1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        switch (this.a) {
            case 0:
                wg1 wg1Var = (wg1) this.b;
                synchronized (wg1Var.c) {
                    wg1Var.d = null;
                    wg1Var.f = null;
                }
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.b;
                emulatorActivity.runOnUiThread(new kq1(emulatorActivity, 13));
                return;
            case 2:
                ((d42) this.b).b();
                return;
            default:
                int i2 = LayoutEditorActivity.M0;
                ((LayoutEditorActivity) this.b).D();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                wg1 wg1Var = (wg1) this.b;
                synchronized (wg1Var.c) {
                    wg1Var.d = null;
                    wg1Var.f = null;
                }
                return;
            case 1:
                int i2 = EmulatorActivity.P1;
                ((EmulatorActivity) this.b).N0();
                return;
            case 2:
                return;
            default:
                int i3 = LayoutEditorActivity.M0;
                ((LayoutEditorActivity) this.b).D();
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        switch (this.a) {
            case 0:
                wg1 wg1Var = (wg1) this.b;
                synchronized (wg1Var.c) {
                    wg1Var.d = null;
                    wg1Var.f = null;
                }
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.b;
                emulatorActivity.runOnUiThread(new kq1(emulatorActivity, 14));
                return;
            case 2:
                ((d42) this.b).b();
                return;
            default:
                int i2 = LayoutEditorActivity.M0;
                ((LayoutEditorActivity) this.b).D();
                return;
        }
    }

    private final void a(int i) {
    }
}
