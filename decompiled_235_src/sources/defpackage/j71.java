package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j71  reason: default package */
/* loaded from: classes.dex */
public abstract class j71 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(i71 i71Var);

    public final boolean equals(Object obj) {
        if (obj instanceof j71) {
            if (nb3.k(this.a, ((j71) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
