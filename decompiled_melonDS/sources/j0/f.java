package j0;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7178a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f7179b;

    public f(Executor executor, Handler handler) {
        if (executor != null) {
            this.f7178a = executor;
            if (handler != null) {
                this.f7179b = handler;
                return;
            } else {
                m9.o.i("Null schedulerHandler");
                throw null;
            }
        }
        m9.o.i("Null cameraExecutor");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f7178a.equals(fVar.f7178a) && this.f7179b.equals(fVar.f7179b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7178a.hashCode() ^ 1000003) * 1000003) ^ this.f7179b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f7178a + ", schedulerHandler=" + this.f7179b + "}";
    }
}
