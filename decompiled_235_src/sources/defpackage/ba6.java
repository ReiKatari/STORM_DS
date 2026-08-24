package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba6  reason: default package */
/* loaded from: classes.dex */
public final class ba6 {
    public final UUID a;
    public final aa6 b;

    public ba6(UUID uuid, aa6 aa6Var) {
        aa6Var.getClass();
        this.a = uuid;
        this.b = aa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba6)) {
            return false;
        }
        ba6 ba6Var = (ba6) obj;
        if (nb3.k(this.a, ba6Var.a) && this.b == ba6Var.b) {
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
        return "SelectedLayout(layoutId=" + this.a + ", reason=" + this.b + ")";
    }
}
