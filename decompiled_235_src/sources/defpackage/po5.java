package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po5  reason: default package */
/* loaded from: classes.dex */
public final class po5 {
    public final String a;
    public final hp5 b;
    public final int c;
    public final long d;
    public final Map e;
    public final boolean f;

    public po5(String str, hp5 hp5Var, int i, long j, Map map, boolean z) {
        hp5Var.getClass();
        map.getClass();
        this.a = str;
        this.b = hp5Var;
        this.c = i;
        this.d = j;
        this.e = map;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po5)) {
            return false;
        }
        po5 po5Var = (po5) obj;
        if (nb3.k(this.a, po5Var.a) && this.b == po5Var.b && this.c == po5Var.c && this.d == po5Var.d && nb3.k(this.e, po5Var.e) && this.f == po5Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        int c = i61.c(this.d, lb1.a(this.c, (hashCode2 + (hashCode * 31)) * 31, 31), 31);
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + c) * 31);
    }

    public final String toString() {
        return "RetroArchShaderConfiguration(presetPath=" + this.a + ", sourceResolution=" + this.b + ", passCount=" + this.c + ", sourceBytes=" + this.d + ", parameterOverrides=" + this.e + ", clearHistory=" + this.f + ")";
    }
}
