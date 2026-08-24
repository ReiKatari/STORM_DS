package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp4  reason: default package */
/* loaded from: classes.dex */
public final class cp4 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final xi c;
    public final LinkedHashMap d;

    public cp4(ArrayList arrayList, LinkedHashMap linkedHashMap, xi xiVar, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = xiVar;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cp4) {
                cp4 cp4Var = (cp4) obj;
                if (!this.a.equals(cp4Var.a) || !this.b.equals(cp4Var.b) || !nb3.k(this.c, cp4Var.c) || !this.d.equals(cp4Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        xi xiVar = this.c;
        if (xiVar == null) {
            hashCode = 0;
        } else {
            hashCode = xiVar.hashCode();
        }
        return this.d.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
