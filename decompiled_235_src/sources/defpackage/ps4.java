package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ps4  reason: default package */
/* loaded from: classes.dex */
public final class ps4 implements Iterable, zf3 {
    public static final ps4 B = new ps4(zt1.A);
    public final Map A;

    public ps4(Map map) {
        this.A = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ps4) {
            if (nb3.k(this.A, ((ps4) obj).A)) {
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
                arrayList.add(new vr4(str, null));
            } else {
                u34.a();
                return null;
            }
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.A + ')';
    }
}
