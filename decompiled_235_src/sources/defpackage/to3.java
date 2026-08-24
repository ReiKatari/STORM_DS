package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to3  reason: default package */
/* loaded from: classes.dex */
public final class to3 {
    public final ap3 a;
    public final int b;
    public final int c;
    public final so3 d;
    public final dp3 e;
    public final /* synthetic */ ap3 f;

    public to3(ap3 ap3Var, int i, int i2, so3 so3Var, dp3 dp3Var) {
        this.f = ap3Var;
        this.a = ap3Var;
        this.b = i;
        this.c = i2;
        this.d = so3Var;
        this.e = dp3Var;
    }

    public final long a(int i, int i2) {
        int i3;
        ap3 ap3Var = this.a;
        int[] iArr = (int[]) ap3Var.B;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) ap3Var.L;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            r53.a("width must be >= 0");
        }
        return s21.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    public final yo3 b(int i) {
        int i2;
        qj2 c = this.e.c(i);
        int i3 = c.a;
        int size = c.b.size();
        int i4 = 0;
        if (size != 0 && i3 + size != this.b) {
            i2 = this.c;
        } else {
            i2 = 0;
        }
        xo3[] xo3VarArr = new xo3[size];
        int i5 = 0;
        int i6 = i2;
        while (true) {
            List list = c.b;
            if (i4 < size) {
                int i7 = (int) ((ju2) list.get(i4)).a;
                int i8 = i6;
                xo3 o = this.d.o(i3 + i4, i5, i7, i8, a(i5, i7));
                i6 = i8;
                i5 += i7;
                xo3VarArr[i4] = o;
                i4++;
            } else {
                return new yo3(i, xo3VarArr, this.f, list, i6);
            }
        }
    }
}
