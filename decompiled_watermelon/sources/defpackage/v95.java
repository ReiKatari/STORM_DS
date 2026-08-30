package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v95  reason: default package */
/* loaded from: classes.dex */
public final class v95 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public v95(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v95)) {
            return false;
        }
        v95 v95Var = (v95) obj;
        if (this.a == v95Var.a && this.b == v95Var.b && this.c == v95Var.c && this.d == v95Var.d && this.e == v95Var.e && this.f == v95Var.f && this.g == v95Var.g && this.h == v95Var.h && this.i == v95Var.i && this.j == v95Var.j && this.k == v95Var.k && this.l == v95Var.l && this.m == v95Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + wh1.a(this.l, wh1.a(this.k, wh1.a(this.j, wh1.a(this.i, wh1.a(this.h, wh1.a(this.g, wh1.a(this.f, wh1.a(this.e, wh1.a(this.d, wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        int i11 = this.k;
        int i12 = this.l;
        int i13 = this.m;
        StringBuilder s = b31.s(i, i2, "Renderer2DDebugControlState(mainForcedMode=", ", subForcedMode=", ", topForcedCompMode=");
        b31.A(s, i3, ", bottomForcedCompMode=", i4, ", disabledMainBgMask=");
        b31.A(s, i5, ", disabledSubBgMask=", i6, ", disabledMainBgPriorityMask=");
        b31.A(s, i7, ", disabledSubBgPriorityMask=", i8, ", disabledMainObjPriorityMask=");
        b31.A(s, i9, ", disabledSubObjPriorityMask=", i10, ", disabledMainObjOrderMask=");
        b31.A(s, i11, ", disabledSubObjOrderMask=", i12, ", featureMask=");
        return wh1.m(s, i13, ")");
    }

    public /* synthetic */ v95() {
        this(-1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 524287);
    }
}
