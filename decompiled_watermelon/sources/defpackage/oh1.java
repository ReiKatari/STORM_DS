package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh1  reason: default package */
/* loaded from: classes.dex */
public final class oh1 {
    public final String a;
    public final Map b;

    public oh1(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oh1) {
                oh1 oh1Var = (oh1) obj;
                if (!b53.x(this.a, oh1Var.a) || !this.b.equals(oh1Var.b)) {
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
