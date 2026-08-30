package se;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a  reason: collision with root package name */
    public final MelonEmulator.a f12881a;

    public j(MelonEmulator.a aVar) {
        aVar.getClass();
        this.f12881a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f12881a == ((j) obj).f12881a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12881a.hashCode();
    }

    public final String toString() {
        return "LaunchFailed(reason=" + this.f12881a + ")";
    }
}
