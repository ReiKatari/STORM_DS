package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sw  reason: default package */
/* loaded from: classes.dex */
public final class sw {
    public final Executor a;
    public final Handler b;

    public sw(Executor executor, Handler handler) {
        if (executor != null) {
            this.a = executor;
            if (handler != null) {
                this.b = handler;
                return;
            } else {
                c44.i("Null schedulerHandler");
                throw null;
            }
        }
        c44.i("Null cameraExecutor");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sw) {
            sw swVar = (sw) obj;
            if (this.a.equals(swVar.a) && this.b.equals(swVar.b)) {
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
