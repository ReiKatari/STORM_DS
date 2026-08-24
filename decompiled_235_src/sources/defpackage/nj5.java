package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj5  reason: default package */
/* loaded from: classes.dex */
public final class nj5 {
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

    public nj5(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
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
        if (!(obj instanceof nj5)) {
            return false;
        }
        nj5 nj5Var = (nj5) obj;
        if (this.a == nj5Var.a && this.b == nj5Var.b && this.c == nj5Var.c && this.d == nj5Var.d && this.e == nj5Var.e && this.f == nj5Var.f && this.g == nj5Var.g && this.h == nj5Var.h && this.i == nj5Var.i && this.j == nj5Var.j && this.k == nj5Var.k && this.l == nj5Var.l && this.m == nj5Var.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + lb1.a(this.l, lb1.a(this.k, lb1.a(this.j, lb1.a(this.i, lb1.a(this.h, lb1.a(this.g, lb1.a(this.f, lb1.a(this.e, lb1.a(this.d, lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
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
        StringBuilder q = i61.q(i, i2, "Renderer2DDebugControlState(mainForcedMode=", ", subForcedMode=", ", topForcedCompMode=");
        lb1.x(q, i3, ", bottomForcedCompMode=", i4, ", disabledMainBgMask=");
        lb1.x(q, i5, ", disabledSubBgMask=", i6, ", disabledMainBgPriorityMask=");
        lb1.x(q, i7, ", disabledSubBgPriorityMask=", i8, ", disabledMainObjPriorityMask=");
        lb1.x(q, i9, ", disabledSubObjPriorityMask=", i10, ", disabledMainObjOrderMask=");
        lb1.x(q, i11, ", disabledSubObjOrderMask=", i12, ", featureMask=");
        return lb1.o(q, i13, ")");
    }

    public /* synthetic */ nj5() {
        this(-1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 524287);
    }
}
