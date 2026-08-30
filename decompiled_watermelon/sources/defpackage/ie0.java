package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie0  reason: default package */
/* loaded from: classes.dex */
public final class ie0 {
    public final Executor a;

    public ie0(g06 g06Var, int i) {
        this.a = (i & 8) != 0 ? null : g06Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ie0) || !b53.x(this.a, ((ie0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Executor executor = this.a;
        if (executor == null) {
            hashCode = 0;
        } else {
            hashCode = executor.hashCode();
        }
        return hashCode * 29791;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=null, defaultBackgroundExecutor=null, defaultBlockingExecutor=null, defaultCameraExecutor=" + this.a + ", defaultCameraHandler=null, defaultCameraHandlerFn=null, testOnlyScope=null)";
    }
}
