package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb3  reason: default package */
/* loaded from: classes.dex */
public final class wb3 {
    public final Integer a;
    public final Set b;
    public final do1 c;

    public wb3(Set set, do1 do1Var) {
        set.getClass();
        this.a = 5;
        this.b = set;
        this.c = do1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wb3) {
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
