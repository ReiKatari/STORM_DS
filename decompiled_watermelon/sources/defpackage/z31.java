package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z31  reason: default package */
/* loaded from: classes.dex */
public abstract class z31 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(y31 y31Var);

    public final boolean equals(Object obj) {
        if (obj instanceof z31) {
            if (b53.x(this.a, ((z31) obj).a)) {
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
