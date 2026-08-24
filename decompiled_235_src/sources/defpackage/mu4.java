package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu4  reason: default package */
/* loaded from: classes.dex */
public final class mu4 {
    public final List a;
    public final Map b;

    public mu4(Map map, List list) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mu4) {
                mu4 mu4Var = (mu4) obj;
                if (!this.a.equals(mu4Var.a) || !this.b.equals(mu4Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PauseMenu(options=" + this.a + ", labelOverrides=" + this.b + ")";
    }
}
