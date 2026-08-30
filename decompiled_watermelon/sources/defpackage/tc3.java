package defpackage;

import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tc3  reason: default package */
/* loaded from: classes.dex */
public final class tc3 {
    public final UUID a;
    public final BackgroundMode b;

    public tc3(UUID uuid, BackgroundMode backgroundMode) {
        backgroundMode.getClass();
        this.a = uuid;
        this.b = backgroundMode;
    }

    public static tc3 a(tc3 tc3Var, UUID uuid, BackgroundMode backgroundMode, int i) {
        if ((i & 1) != 0) {
            uuid = tc3Var.a;
        }
        if ((i & 2) != 0) {
            backgroundMode = tc3Var.b;
        }
        backgroundMode.getClass();
        return new tc3(uuid, backgroundMode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc3)) {
            return false;
        }
        tc3 tc3Var = (tc3) obj;
        if (b53.x(this.a, tc3Var.a) && this.b == tc3Var.b) {
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
