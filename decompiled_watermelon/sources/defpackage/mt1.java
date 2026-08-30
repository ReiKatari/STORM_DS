package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mt1  reason: default package */
/* loaded from: classes.dex */
public final class mt1 extends wt1 {
    public final MelonEmulator.a a;

    public mt1(MelonEmulator.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mt1) && this.a == ((mt1) obj).a) {
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
