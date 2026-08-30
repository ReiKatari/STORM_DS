package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ik6  reason: default package */
/* loaded from: classes.dex */
public final class ik6 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final int c;

    public ik6(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ik6) {
                ik6 ik6Var = (ik6) obj;
                if (!this.a.equals(ik6Var.a) || !this.b.equals(ik6Var.b) || this.c != ik6Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.c) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return ej6.g(sb, this.c, ')');
    }
}
