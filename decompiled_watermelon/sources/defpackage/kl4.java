package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kl4  reason: default package */
/* loaded from: classes.dex */
public final class kl4 {
    public final List a;
    public final Map b;

    public kl4(List list, Map map) {
        this.a = list;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kl4) {
                kl4 kl4Var = (kl4) obj;
                if (!this.a.equals(kl4Var.a) || !this.b.equals(kl4Var.b)) {
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
