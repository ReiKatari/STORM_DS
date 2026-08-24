package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr6  reason: default package */
/* loaded from: classes.dex */
public final class sr6 {
    public final Map a;
    public final int b;

    public sr6(int i, Map map) {
        map.getClass();
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr6)) {
            return false;
        }
        sr6 sr6Var = (sr6) obj;
        if (nb3.k(this.a, sr6Var.a) && this.b == sr6Var.b) {
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
        return xg6.q(sb, this.b, ')');
    }
}
