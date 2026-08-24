package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp5  reason: default package */
/* loaded from: classes.dex */
public final class dp5 {
    public final String a;
    public final LinkedHashMap b;

    public dp5(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dp5) {
                dp5 dp5Var = (dp5) obj;
                if (!nb3.k(this.a, dp5Var.a) || !this.b.equals(dp5Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChainEntry(path=" + this.a + ", assignments=" + this.b + ")";
    }
}
