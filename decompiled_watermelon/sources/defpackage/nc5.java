package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nc5  reason: default package */
/* loaded from: classes.dex */
public final class nc5 implements Serializable {
    public final Object A;

    public /* synthetic */ nc5(Object obj) {
        this.A = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof kc5) {
            return ((kc5) obj).A;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nc5) {
            if (!b53.x(this.A, ((nc5) obj).A)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.A;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.A;
        if (obj instanceof kc5) {
            return ((kc5) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
