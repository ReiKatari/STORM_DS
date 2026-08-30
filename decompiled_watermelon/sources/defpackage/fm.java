package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fm  reason: default package */
/* loaded from: classes.dex */
public final class fm implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ gm A;

    public fm(gm gmVar) {
        this.A = gmVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.A.R.removeCallbacks(this);
        gm.n0(this.A);
        gm gmVar = this.A;
        synchronized (gmVar.X) {
            if (!gmVar.e0) {
                return;
            }
            gmVar.e0 = false;
            ArrayList arrayList = gmVar.Z;
            gmVar.Z = gmVar.c0;
            gmVar.c0 = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gm.n0(this.A);
        gm gmVar = this.A;
        synchronized (gmVar.X) {
            if (gmVar.Z.isEmpty()) {
                gmVar.L.removeFrameCallback(this);
                gmVar.e0 = false;
            }
        }
    }
}
