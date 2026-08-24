package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha7  reason: default package */
/* loaded from: classes.dex */
public final class ha7 {
    public final i92 a;
    public final pj6 b;
    public final sl0 c;
    public final z56 d;
    public final boolean e;
    public final Map f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [zt1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ha7(i92 i92Var, pj6 pj6Var, sl0 sl0Var, z56 z56Var, LinkedHashMap linkedHashMap, int i) {
        this(i92Var, pj6Var, sl0Var, z56Var, r0, (i & 64) != 0 ? zt1.A : linkedHashMap);
        boolean z;
        i92Var = (i & 1) != 0 ? null : i92Var;
        pj6Var = (i & 2) != 0 ? null : pj6Var;
        sl0Var = (i & 4) != 0 ? null : sl0Var;
        z56Var = (i & 8) != 0 ? null : z56Var;
        if ((i & 32) != 0) {
            z = false;
        } else {
            z = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha7)) {
            return false;
        }
        ha7 ha7Var = (ha7) obj;
        if (nb3.k(this.a, ha7Var.a) && nb3.k(this.b, ha7Var.b) && nb3.k(this.c, ha7Var.c) && nb3.k(this.d, ha7Var.d) && this.e == ha7Var.e && nb3.k(this.f, ha7Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        i92 i92Var = this.a;
        if (i92Var == null) {
            hashCode = 0;
        } else {
            hashCode = i92Var.hashCode();
        }
        int i2 = hashCode * 31;
        pj6 pj6Var = this.b;
        if (pj6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = pj6Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        sl0 sl0Var = this.c;
        if (sl0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = sl0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        z56 z56Var = this.d;
        if (z56Var != null) {
            i = z56Var.hashCode();
        }
        return this.f.hashCode() + xg6.e((i4 + i) * 961, this.e, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public ha7(i92 i92Var, pj6 pj6Var, sl0 sl0Var, z56 z56Var, boolean z, Map map) {
        this.a = i92Var;
        this.b = pj6Var;
        this.c = sl0Var;
        this.d = z56Var;
        this.e = z;
        this.f = map;
    }
}
