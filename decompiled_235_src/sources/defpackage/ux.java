package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux  reason: default package */
/* loaded from: classes.dex */
public final class ux {
    public final Executor a;
    public final Handler b;

    public ux(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            } else {
                u34.x("Null schedulerHandler");
                throw null;
            }
        }
        u34.x("Null cameraExecutor");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ux) {
            ux uxVar = (ux) obj;
            if (this.a.equals(uxVar.a) && this.b.equals(uxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
