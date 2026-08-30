package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ArrayList B;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ ArrayList R;
    public final /* synthetic */ ArrayList X;

    public y1(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.A = i2;
        this.B = arrayList;
        this.L = arrayList2;
        this.R = arrayList3;
        this.X = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i2 = 0; i2 < this.A; i2++) {
            WeakHashMap weakHashMap = a6.x0.f533a;
            a6.p0.l((View) this.B.get(i2), (String) this.L.get(i2));
            a6.p0.l((View) this.R.get(i2), (String) this.X.get(i2));
        }
    }
}
