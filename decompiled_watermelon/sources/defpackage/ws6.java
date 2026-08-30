package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ws6  reason: default package */
/* loaded from: classes.dex */
public final class ws6 implements d31 {
    public final ThreadLocal A;

    public ws6(ThreadLocal threadLocal) {
        this.A = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ws6) && b53.x(this.A, ((ws6) obj).A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.A + ')';
    }
}
