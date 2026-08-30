package se;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends r {

    /* renamed from: a  reason: collision with root package name */
    public final MelonEmulator.c f12883a;

    public m(MelonEmulator.c cVar) {
        this.f12883a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof m) || this.f12883a != ((m) obj).f12883a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12883a.hashCode();
    }

    public final String toString() {
        return "LaunchFailed(reason=" + this.f12883a + ")";
    }
}
