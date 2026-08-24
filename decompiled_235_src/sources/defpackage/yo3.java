package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo3  reason: default package */
/* loaded from: classes.dex */
public final class yo3 {
    public final int a;
    public final xo3[] b;
    public final ap3 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public yo3(int i, xo3[] xo3VarArr, ap3 ap3Var, List list, int i2) {
        this.a = i;
        this.b = xo3VarArr;
        this.c = ap3Var;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (xo3 xo3Var : xo3VarArr) {
            i3 = Math.max(i3, xo3Var.k);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final xo3[] a(int i, int i2, int i3) {
        xo3[] xo3VarArr = this.b;
        int length = xo3VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            xo3 xo3Var = xo3VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((ju2) this.d.get(i5)).a;
            xo3Var.k(i, ((int[]) this.c.L)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return xo3VarArr;
    }
}
