package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tj5  reason: default package */
/* loaded from: classes.dex */
public final class tj5 extends dk5 {
    public final UUID a;

    public tj5(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tj5) && b53.x(this.a, ((tj5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        UUID uuid = this.a;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public final String toString() {
        return "LayoutUpdate(newLayoutId=" + this.a + ")";
    }
}
