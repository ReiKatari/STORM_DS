package hh;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: a  reason: collision with root package name */
    public final MelonEmulator.a f6515a;

    public e(MelonEmulator.a aVar) {
        aVar.getClass();
        this.f6515a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f6515a == ((e) obj).f6515a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6515a.hashCode();
    }

    public final String toString() {
        return "FirmwareLoadError(reason=" + this.f6515a + ")";
    }
}
