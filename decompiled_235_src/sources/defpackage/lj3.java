package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj3  reason: default package */
/* loaded from: classes.dex */
public final class lj3 {
    public final UUID a;
    public final BackgroundMode b;

    public lj3(UUID uuid, BackgroundMode backgroundMode) {
        backgroundMode.getClass();
        this.a = uuid;
        this.b = backgroundMode;
    }

    public static lj3 a(lj3 lj3Var, UUID uuid, BackgroundMode backgroundMode, int i) {
        if ((i & 1) != 0) {
            uuid = lj3Var.a;
        }
        if ((i & 2) != 0) {
            backgroundMode = lj3Var.b;
        }
        backgroundMode.getClass();
        return new lj3(uuid, backgroundMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj3)) {
            return false;
        }
        lj3 lj3Var = (lj3) obj;
        if (nb3.k(this.a, lj3Var.a) && this.b == lj3Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        UUID uuid = this.a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "LayoutBackgroundProperties(backgroundId=" + this.a + ", backgroundMode=" + this.b + ")";
    }
}
