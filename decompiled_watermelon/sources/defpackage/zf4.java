package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zf4  reason: default package */
/* loaded from: classes.dex */
public final class zf4 {
    public final ArrayList a;
    public final LinkedHashMap b;
    public final li c;
    public final LinkedHashMap d;

    public zf4(ArrayList arrayList, LinkedHashMap linkedHashMap, li liVar, LinkedHashMap linkedHashMap2) {
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = liVar;
        this.d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zf4) {
                zf4 zf4Var = (zf4) obj;
                if (!this.a.equals(zf4Var.a) || !this.b.equals(zf4Var.b) || !b53.x(this.c, zf4Var.c) || !this.d.equals(zf4Var.d)) {
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
        li liVar = this.c;
        if (liVar == null) {
            hashCode = 0;
        } else {
            hashCode = liVar.hashCode();
        }
        return this.d.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.a + ", deferred=" + this.b + ", postviewOutput=" + this.c + ", outputSurfaceMap=" + this.d + ')';
    }
}
