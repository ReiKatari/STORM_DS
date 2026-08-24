package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx1  reason: default package */
/* loaded from: classes.dex */
public final class xx1 extends hy1 {
    public final MelonEmulator.a a;

    public xx1(MelonEmulator.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xx1) && this.a == ((xx1) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FirmwareLoadError(reason=" + this.a + ")";
    }
}
