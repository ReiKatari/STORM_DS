package te;

import me.magnum.melonds.domain.model.ConsoleType;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends t {

    /* renamed from: d  reason: collision with root package name */
    public final ConsoleType f13177d;

    public b(ConsoleType consoleType) {
        consoleType.getClass();
        this.f13177d = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f13177d == ((b) obj).f13177d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13177d.hashCode();
    }

    public final String toString() {
        return "Success(consoleType=" + this.f13177d + ")";
    }
}
