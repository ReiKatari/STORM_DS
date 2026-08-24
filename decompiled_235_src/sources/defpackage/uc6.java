package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uc6  reason: default package */
/* loaded from: classes.dex */
public final class uc6 {
    public final int a;
    public final List b;
    public final ArrayList c;
    public final Executor d;
    public final le0 e;
    public final int f;
    public final Map g;

    public uc6(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, yk0 yk0Var, int i2, Map map) {
        executor.getClass();
        yk0Var.getClass();
        map.getClass();
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = yk0Var;
        this.f = i2;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uc6) {
                uc6 uc6Var = (uc6) obj;
                if (this.a != uc6Var.a || !nb3.k(this.b, uc6Var.b) || !this.c.equals(uc6Var.c) || !nb3.k(this.d, uc6Var.d) || !nb3.k(this.e, uc6Var.e) || this.f != uc6Var.f || !nb3.k(this.g, uc6Var.g)) {
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
        int hashCode2 = Integer.hashCode(this.a) * 31;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        int hashCode5 = this.e.hashCode();
        return (this.g.hashCode() + lb1.a(this.f, (hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31, 31)) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
