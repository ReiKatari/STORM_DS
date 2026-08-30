package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bg6  reason: default package */
/* loaded from: classes.dex */
public final class bg6 {
    public final Map a;
    public final int b;

    public bg6(int i, Map map) {
        map.getClass();
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg6)) {
            return false;
        }
        bg6 bg6Var = (bg6) obj;
        if (b53.x(this.a, bg6Var.a) && this.b == bg6Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.a);
        sb.append(", maxSupportedFrameRate=");
        return ej6.g(sb, this.b, ')');
    }
}
