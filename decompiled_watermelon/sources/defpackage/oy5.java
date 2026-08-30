package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oy5  reason: default package */
/* loaded from: classes.dex */
public final class oy5 {
    public final UUID a;
    public final ny5 b;

    public oy5(UUID uuid, ny5 ny5Var) {
        ny5Var.getClass();
        this.a = uuid;
        this.b = ny5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy5)) {
            return false;
        }
        oy5 oy5Var = (oy5) obj;
        if (b53.x(this.a, oy5Var.a) && this.b == oy5Var.b) {
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
