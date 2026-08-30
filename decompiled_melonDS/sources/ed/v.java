package ed;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements cc.f {
    public final ThreadLocal A;

    public v(ThreadLocal threadLocal) {
        this.A = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v) && nc.k.a(this.A, ((v) obj).A)) {
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
