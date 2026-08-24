package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx5  reason: default package */
/* loaded from: classes.dex */
public final class xx5 extends cy5 {
    public final MelonEmulator.c a;

    public xx5(MelonEmulator.c cVar) {
        cVar.getClass();
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xx5) && this.a == ((xx5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LaunchFailed(reason=" + this.a + ")";
    }
}
