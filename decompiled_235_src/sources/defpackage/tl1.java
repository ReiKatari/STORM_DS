package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tl1  reason: default package */
/* loaded from: classes.dex */
public final class tl1 {
    public final String a;
    public final Map b;

    public tl1(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tl1) {
                tl1 tl1Var = (tl1) obj;
                if (!nb3.k(this.a, tl1Var.a) || !this.b.equals(tl1Var.b)) {
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
        return "SnapshotState(documentTreeUri=" + this.a + ", entries=" + this.b + ")";
    }
}
