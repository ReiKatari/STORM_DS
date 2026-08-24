package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju5  reason: default package */
/* loaded from: classes.dex */
public final class ju5 extends tu5 {
    public final UUID a;

    public ju5(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ju5) && nb3.k(this.a, ((ju5) obj).a)) {
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
