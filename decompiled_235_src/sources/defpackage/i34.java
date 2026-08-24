package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i34  reason: default package */
/* loaded from: classes.dex */
public final class i34 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final d40 e;
    public final kk3 f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public i34(int i, int i2, List list, long j, Object obj, lo4 lo4Var, d40 d40Var, kk3 kk3Var) {
        boolean z;
        int i3;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = d40Var;
        this.f = kk3Var;
        if (lo4Var == lo4.Vertical) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            dx4 dx4Var = (dx4) list.get(i5);
            if (!this.g) {
                i3 = dx4Var.B;
            } else {
                i3 = dx4Var.A;
            }
            i4 = Math.max(i4, i3);
        }
        this.h = i4;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        int i5;
        this.j = i;
        boolean z = this.g;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.k = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            dx4 dx4Var = (dx4) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.i;
            if (z) {
                float f = (i2 - dx4Var.A) / 2.0f;
                kk3 kk3Var = kk3.Ltr;
                kk3 kk3Var2 = this.f;
                float f2 = RecyclerView.B1;
                if (kk3Var2 != kk3Var) {
                    f2 = RecyclerView.B1 * (-1.0f);
                }
                iArr[i7] = Math.round((1.0f + f2) * f);
                iArr[i7 + 1] = i;
                i5 = dx4Var.B;
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                d40 d40Var = this.e;
                if (d40Var != null) {
                    iArr[i8] = d40Var.a(dx4Var.B, i3);
                    i5 = dx4Var.A;
                } else {
                    throw lb1.c("null verticalAlignment");
                }
            }
            i += i5;
        }
    }
}
