package w;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends j0.m {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f13921a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayMap f13922b;

    @Override // j0.m
    public final void a(int i2) {
        Iterator it = this.f13921a.iterator();
        while (it.hasNext()) {
            j0.m mVar = (j0.m) it.next();
            try {
                ((Executor) this.f13922b.get(mVar)).execute(new d2.d(i2, 4, mVar));
            } catch (RejectedExecutionException e6) {
                aj.g.t("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e6);
            }
        }
    }

    @Override // j0.m
    public final void b(int i2, j0.u uVar) {
        Iterator it = this.f13921a.iterator();
        while (it.hasNext()) {
            j0.m mVar = (j0.m) it.next();
            try {
                ((Executor) this.f13922b.get(mVar)).execute(new d.i(mVar, i2, uVar, 5));
            } catch (RejectedExecutionException e6) {
                aj.g.t("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e6);
            }
        }
    }

    @Override // j0.m
    public final void c(int i2, na.f fVar) {
        Iterator it = this.f13921a.iterator();
        while (it.hasNext()) {
            j0.m mVar = (j0.m) it.next();
            try {
                ((Executor) this.f13922b.get(mVar)).execute(new d.i(mVar, i2, fVar, 4));
            } catch (RejectedExecutionException e6) {
                aj.g.t("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e6);
            }
        }
    }
}
