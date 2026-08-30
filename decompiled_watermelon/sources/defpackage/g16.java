package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g16  reason: default package */
/* loaded from: classes.dex */
public final class g16 {
    public final int a;
    public final List b;
    public final ArrayList c;
    public final Executor d;
    public final cc0 e;
    public final int f;
    public final Map g;

    public g16(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, qi0 qi0Var, int i2, Map map) {
        executor.getClass();
        qi0Var.getClass();
        map.getClass();
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = executor;
        this.e = qi0Var;
        this.f = i2;
        this.g = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g16) {
                g16 g16Var = (g16) obj;
                if (this.a != g16Var.a || !b53.x(this.b, g16Var.b) || !this.c.equals(g16Var.c) || !b53.x(this.d, g16Var.d) || !b53.x(this.e, g16Var.e) || this.f != g16Var.f || !b53.x(this.g, g16Var.g)) {
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
        return (this.g.hashCode() + wh1.a(this.f, (hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + hashCode) * 31)) * 31)) * 31)) * 31, 31)) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.a + ", inputConfiguration=" + this.b + ", outputConfigurations=" + this.c + ", executor=" + this.d + ", stateCallback=" + this.e + ", sessionTemplateId=" + this.f + ", sessionParameters=" + this.g + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
