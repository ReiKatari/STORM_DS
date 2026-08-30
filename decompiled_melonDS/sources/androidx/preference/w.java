package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ w(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                RecyclerView recyclerView = ((a0) this.B).mList;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((d) this.B).o();
                return;
            default:
                ((d0) this.B).n();
                return;
        }
    }
}
