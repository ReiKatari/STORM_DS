package defpackage;

import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: in5  reason: default package */
/* loaded from: classes.dex */
public final class in5 extends nn5 {
    public final MelonEmulator.c a;

    public in5(MelonEmulator.c cVar) {
        cVar.getClass();
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof in5) && this.a == ((in5) obj).a) {
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
