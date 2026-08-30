package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kc5  reason: default package */
/* loaded from: classes.dex */
public final class kc5 implements Serializable {
    public final Throwable A;

    public kc5(Throwable th) {
        th.getClass();
        this.A = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kc5) {
            if (b53.x(this.A, ((kc5) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.A + ')';
    }
}
