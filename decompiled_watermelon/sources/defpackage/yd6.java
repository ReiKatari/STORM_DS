package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yd6  reason: default package */
/* loaded from: classes.dex */
public final class yd6 {
    public final ja a;
    public final kb b;
    public final gy c;
    public final x82 d;
    public final List e;
    public final List f;
    public final List g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;

    public yd6(ja jaVar, kb kbVar, gy gyVar, x82 x82Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = jaVar;
        this.b = kbVar;
        this.c = gyVar;
        this.d = x82Var;
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
        if (!(obj instanceof yd6)) {
            return false;
        }
        yd6 yd6Var = (yd6) obj;
        if (b53.x(this.a, yd6Var.a) && b53.x(this.b, yd6Var.b) && b53.x(this.c, yd6Var.c) && b53.x(this.d, yd6Var.d) && b53.x(this.e, yd6Var.e) && b53.x(this.f, yd6Var.f) && b53.x(this.g, yd6Var.g) && b53.x(this.h, yd6Var.h) && b53.x(this.i, yd6Var.i) && b53.x(this.j, yd6Var.j)) {
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
        ja jaVar = this.a;
        if (jaVar == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(jaVar.a);
        }
        int i2 = hashCode * 31;
        kb kbVar = this.b;
        if (kbVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Integer.hashCode(kbVar.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        gy gyVar = this.c;
        if (gyVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Integer.hashCode(gyVar.a);
        }
        int i4 = (i3 + hashCode3) * 31;
        x82 x82Var = this.d;
        if (x82Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = Integer.hashCode(x82Var.a);
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
