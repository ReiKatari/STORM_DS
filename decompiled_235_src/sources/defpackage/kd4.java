package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd4  reason: default package */
/* loaded from: classes.dex */
public final class kd4 {
    public final List a;
    public final int b;

    public kd4(int i, List list) {
        this.a = list;
        this.b = i;
        if (!list.isEmpty() || i != -1) {
            if (!list.isEmpty()) {
                int size = list.size();
                if (i >= 0 && i < size) {
                    return;
                }
            }
            u34.s(xg6.t("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '"), new j93(0, list.size() - 1, 1), "'.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kd4.class != obj.getClass()) {
            return false;
        }
        kd4 kd4Var = (kd4) obj;
        if (this.b == kd4Var.b && nb3.k(this.a, kd4Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    public kd4() {
        this(-1, yt1.A);
    }
}
