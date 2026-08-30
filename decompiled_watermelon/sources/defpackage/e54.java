package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e54  reason: default package */
/* loaded from: classes.dex */
public final class e54 {
    public final List a;
    public final int b;

    public e54(int i, List list) {
        this.a = list;
        this.b = i;
        if (!list.isEmpty() || i != -1) {
            if (!list.isEmpty()) {
                int size = list.size();
                if (i >= 0 && i < size) {
                    return;
                }
            }
            f81.n(wh1.s("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '"), new b33(0, list.size() - 1, 1), "'.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e54.class != obj.getClass()) {
            return false;
        }
        e54 e54Var = (e54) obj;
        if (this.b == e54Var.b && b53.x(this.a, e54Var.a)) {
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

    public e54() {
        this(-1, pp1.A);
    }
}
