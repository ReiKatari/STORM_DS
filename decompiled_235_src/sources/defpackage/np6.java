package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np6  reason: default package */
/* loaded from: classes.dex */
public final class np6 {
    public final oa a;
    public final qb b;
    public final xz c;
    public final pd2 d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public np6(oa oaVar, qb qbVar, xz xzVar, pd2 pd2Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = oaVar;
        this.b = qbVar;
        this.c = xzVar;
        this.d = pd2Var;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = bool;
        this.i = bool2;
        this.j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np6)) {
            return false;
        }
        np6 np6Var = (np6) obj;
        if (nb3.k(this.a, np6Var.a) && nb3.k(this.b, np6Var.b) && nb3.k(this.c, np6Var.c) && nb3.k(this.d, np6Var.d) && nb3.k(this.e, np6Var.e) && nb3.k(this.f, np6Var.f) && nb3.k(this.g, np6Var.g) && nb3.k(this.h, np6Var.h) && nb3.k(this.i, np6Var.i) && nb3.k(this.j, np6Var.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int i = 0;
        oa oaVar = this.a;
        if (oaVar == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(oaVar.a);
        }
        int i2 = hashCode * 31;
        qb qbVar = this.b;
        if (qbVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Integer.hashCode(qbVar.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        xz xzVar = this.c;
        if (xzVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Integer.hashCode(xzVar.a);
        }
        int i4 = (i3 + hashCode3) * 31;
        pd2 pd2Var = this.d;
        if (pd2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = Integer.hashCode(pd2Var.a);
        }
        int i5 = (i4 + hashCode4) * 31;
        List list = this.e;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List list2 = this.f;
        if (list2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List list3 = this.g;
        if (list3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list3.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Boolean bool = this.h;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Boolean bool2 = this.i;
        if (bool2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool2.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Boolean bool3 = this.j;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        return "State3A(aeMode=" + this.a + ", afMode=" + this.b + ", awbMode=" + this.c + ", flashMode=" + this.d + ", aeRegions=" + this.e + ", afRegions=" + this.f + ", awbRegions=" + this.g + ", aeLock=" + this.h + ", afLock=" + this.i + ", awbLock=" + this.j + ')';
    }
}
