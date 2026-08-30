package defpackage;

import android.os.Process;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ cm(int i, Runnable runnable) {
        this.A = 0;
        this.B = i;
        this.L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        int i2 = this.B;
        Object obj = this.L;
        switch (i) {
            case 0:
                Process.setThreadPriority(i2);
                ((Runnable) obj).run();
                return;
            case 1:
                ((IntConsumer) obj).accept(i2);
                return;
            case 2:
                ((sb0) obj).a(i2);
                return;
            case 3:
                int i3 = EmulatorActivity.P1;
                ((EmulatorActivity) obj).h0(i2 + 1);
                return;
            case 4:
                ((in4) obj).a(i2);
                return;
            case 5:
                ((io2) obj).c0(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, i2, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ cm(int i, int i2, Object obj) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }
}
