package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bd0  reason: default package */
/* loaded from: classes.dex */
public final class bd0 {
    public final String a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final ag0 e;
    public final int f;
    public final Map g;
    public final int h;
    public final int i;
    public final Map j;
    public final List k;
    public final List l;
    public final Map m;
    public final zx3 n;
    public final dd0 o;

    public bd0(String str, List list, List list2, ArrayList arrayList, ag0 ag0Var, int i, LinkedHashMap linkedHashMap, int i2, mt3 mt3Var, List list3, List list4, dd0 dd0Var) {
        zx3 zx3Var = new zx3();
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = ag0Var;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = 1;
        this.j = mt3Var;
        this.k = list3;
        this.l = list4;
        this.m = qp1.A;
        this.n = zx3Var;
        this.o = dd0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bd0) {
                bd0 bd0Var = (bd0) obj;
                if (b53.x(this.a, bd0Var.a) && b53.x(this.b, bd0Var.b) && b53.x(this.c, bd0Var.c) && b53.x(this.d, bd0Var.d) && b53.x(this.e, bd0Var.e) && this.f == bd0Var.f && b53.x(this.g, bd0Var.g) && this.h == bd0Var.h && this.i == bd0Var.i && b53.x(this.j, bd0Var.j) && b53.x(this.k, bd0Var.k) && b53.x(this.l, bd0Var.l) && b53.x(this.m, bd0Var.m) && b53.x(this.n, bd0Var.n) && b53.x(this.o, bd0Var.o)) {
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
        int b = b31.b(b31.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        ag0 ag0Var = this.e;
        if (ag0Var != null) {
            i = ag0Var.hashCode();
        }
        int b2 = b31.b(b31.b((this.j.hashCode() + wh1.a(this.i, wh1.a(this.h, (this.g.hashCode() + wh1.a(this.f, (i2 + i) * 31, 31)) * 31, 31), 31)) * 31, 31, this.k), 31, this.l);
        return (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + b2) * 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) od0.b(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) jb5.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) mh7.i0(this.h)) + ", defaultTemplate=" + ((Object) jb5.b(this.i)) + ", defaultParameters=" + this.j + ", defaultListeners=" + this.k + ", graphStateListeners=" + this.l + ", requiredParameters=" + this.m + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=null, metadataTransform=" + this.n + ", flags=" + this.o + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
