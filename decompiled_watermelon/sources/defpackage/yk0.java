package defpackage;

import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yk0  reason: default package */
/* loaded from: classes.dex */
public final class yk0 extends bl0 {
    public final Cheat b;

    public yk0(Cheat cheat) {
        cheat.getClass();
        this.b = cheat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yk0) && b53.x(this.b, ((yk0) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "EditCheat(cheat=" + this.b + ")";
    }
}
