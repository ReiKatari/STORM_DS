package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf0  reason: default package */
/* loaded from: classes.dex */
public final class kf0 {
    public final String a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final ji0 e;
    public final int f;
    public final Map g;
    public final int h;
    public final int i;
    public final Map j;
    public final List k;
    public final List l;
    public final Map m;
    public final s54 n;
    public final mf0 o;

    public kf0(String str, List list, List list2, ArrayList arrayList, ji0 ji0Var, int i, LinkedHashMap linkedHashMap, int i2, p04 p04Var, List list3, List list4, mf0 mf0Var) {
        s54 s54Var = new s54();
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = ji0Var;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = 1;
        this.j = p04Var;
        this.k = list3;
        this.l = list4;
        this.m = zt1.A;
        this.n = s54Var;
        this.o = mf0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kf0) {
                kf0 kf0Var = (kf0) obj;
                if (nb3.k(this.a, kf0Var.a) && nb3.k(this.b, kf0Var.b) && nb3.k(this.c, kf0Var.c) && nb3.k(this.d, kf0Var.d) && nb3.k(this.e, kf0Var.e) && this.f == kf0Var.f && nb3.k(this.g, kf0Var.g) && this.h == kf0Var.h && this.i == kf0Var.i && nb3.k(this.j, kf0Var.j) && nb3.k(this.k, kf0Var.k) && nb3.k(this.l, kf0Var.l) && nb3.k(this.m, kf0Var.m) && nb3.k(this.n, kf0Var.n) && nb3.k(this.o, kf0Var.o)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b = i61.b(i61.b(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        int i = 0;
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        ji0 ji0Var = this.e;
        if (ji0Var != null) {
            i = ji0Var.hashCode();
        }
        int b2 = i61.b(i61.b((this.j.hashCode() + lb1.a(this.i, lb1.a(this.h, (this.g.hashCode() + lb1.a(this.f, (i2 + i) * 31, 31)) * 31, 31), 31)) * 31, this.k, 31), this.l, 31);
        return (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + b2) * 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) xf0.b(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) bl5.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) q60.Z(this.h)) + ", defaultTemplate=" + ((Object) bl5.b(this.i)) + ", defaultParameters=" + this.j + ", defaultListeners=" + this.k + ", graphStateListeners=" + this.l + ", requiredParameters=" + this.m + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.n + ", flags=" + this.o + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
