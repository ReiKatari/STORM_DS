package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nj4  reason: default package */
/* loaded from: classes.dex */
public final class nj4 implements Iterable, f93 {
    public static final nj4 B = new nj4(qp1.A);
    public final Map A;

    public nj4(Map map) {
        this.A = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nj4) {
            if (b53.x(this.A, ((nj4) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.A;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() == null) {
                arrayList.add(new ti4(str, null));
            } else {
                c44.b();
                return null;
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.A + ')';
    }
}
