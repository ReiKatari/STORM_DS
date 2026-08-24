package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg0  reason: default package */
/* loaded from: classes.dex */
public final class rg0 {
    public final Executor a;

    public rg0(vb6 vb6Var, int i) {
        this.a = (i & 8) != 0 ? null : vb6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof rg0) || !nb3.k(this.a, ((rg0) obj).a)) {
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
