package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hf5  reason: default package */
/* loaded from: classes.dex */
public final class hf5 {
    public final String a;
    public final LinkedHashMap b;

    public hf5(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hf5) {
                hf5 hf5Var = (hf5) obj;
                if (!b53.x(this.a, hf5Var.a) || !this.b.equals(hf5Var.b)) {
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
