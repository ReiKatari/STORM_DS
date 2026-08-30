package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xj0  reason: default package */
/* loaded from: classes.dex */
public final class xj0 {
    public static final wj0 b = new Object();
    public final Object a;

    public static final Object a(Object obj) {
        if (!(obj instanceof wj0)) {
            return obj;
        }
        return null;
    }

    public static final void b(Object obj) {
        if (!(obj instanceof wj0)) {
            return;
        }
        if (obj instanceof vj0) {
            Throwable th = ((vj0) obj).a;
            if (th == null) {
                i.n("Trying to call 'getOrThrow' on a channel closed without a cause");
                return;
            }
            throw th;
        }
        i.n("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xj0) {
            if (!b53.x(this.a, ((xj0) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof vj0) {
            return ((vj0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
