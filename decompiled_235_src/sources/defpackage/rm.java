package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rm  reason: default package */
/* loaded from: classes.dex */
public final class rm implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ sm A;

    public rm(sm smVar) {
        this.A = smVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A.R.removeCallbacks(this);
        sm.n0(this.A);
        sm smVar = this.A;
        synchronized (smVar.X) {
            if (!smVar.f0) {
                return;
            }
            smVar.f0 = false;
            ArrayList arrayList = smVar.Z;
            smVar.Z = smVar.d0;
            smVar.d0 = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        sm.n0(this.A);
        sm smVar = this.A;
        synchronized (smVar.X) {
            if (smVar.Z.isEmpty()) {
                smVar.L.removeFrameCallback(this);
                smVar.f0 = false;
            }
        }
    }
}
