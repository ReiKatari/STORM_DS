package defpackage;

import android.os.Process;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.function.IntConsumer;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: om  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ om(Runnable runnable, int i) {
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
                ((be0) obj).a(i2);
                return;
            case 3:
                int i3 = EmulatorActivity.Z1;
                ((EmulatorActivity) obj).j0(i2 + 1);
                return;
            case 4:
                ((nw4) obj).a(i2);
                return;
            case 5:
                ((gi2) obj).K(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.y(view, i2, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ om(Object obj, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }
}
