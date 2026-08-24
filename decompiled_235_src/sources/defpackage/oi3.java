package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi3  reason: default package */
/* loaded from: classes.dex */
public final class oi3 {
    public final Integer a;
    public final Set b;
    public final pi3 c;

    public oi3(Set set, pi3 pi3Var) {
        set.getClass();
        this.a = 5;
        this.b = set;
        this.c = pi3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oi3) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(398591036L);
    }

    public final String toString() {
        Integer num = this.a;
        if (num == null) {
            return "398591036 without alias";
        }
        return "398591036 with alias " + num.intValue();
    }
}
