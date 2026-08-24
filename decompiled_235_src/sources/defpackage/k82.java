package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k82  reason: default package */
/* loaded from: classes.dex */
public final class k82 {
    public final ArrayList a;
    public final pi b;
    public final le0 c;
    public final int d;
    public final Map e;
    public final Integer f;
    public final l82 g;
    public final xi h;

    public k82(ArrayList arrayList, pi piVar, yk0 yk0Var, int i, Map map, Integer num, l82 l82Var, xi xiVar) {
        yk0Var.getClass();
        map.getClass();
        this.a = arrayList;
        this.b = piVar;
        this.c = yk0Var;
        this.d = i;
        this.e = map;
        this.f = num;
        this.g = l82Var;
        this.h = xiVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k82) {
                k82 k82Var = (k82) obj;
                if (this.a.equals(k82Var.a) && this.b == k82Var.b && nb3.k(this.c, k82Var.c) && this.d == k82Var.d && nb3.k(this.e, k82Var.e) && this.f.equals(k82Var.f) && this.g == k82Var.g && nb3.k(this.h, k82Var.h)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode();
        int hashCode3 = this.b.hashCode();
        int hashCode4 = this.c.hashCode();
        int a = lb1.a(this.d, (hashCode4 + ((hashCode3 + ((hashCode2 + (Integer.hashCode(2) * 31)) * 31)) * 31)) * 31, 31);
        int hashCode5 = this.f.hashCode();
        int hashCode6 = (this.g.hashCode() + ((hashCode5 + ((this.e.hashCode() + a) * 31)) * 31)) * 31;
        xi xiVar = this.h;
        if (xiVar == null) {
            hashCode = 0;
        } else {
            hashCode = xiVar.hashCode();
        }
        return hashCode6 + hashCode;
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.a + ", executor=" + this.b + ", stateCallback=" + this.c + ", sessionTemplateId=" + this.d + ", sessionParameters=" + this.e + ", extensionMode=" + this.f + ", extensionStateCallback=" + this.g + ", postviewOutputConfiguration=" + this.h + ')';
    }
}
