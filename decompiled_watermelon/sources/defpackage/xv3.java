package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xv3  reason: default package */
/* loaded from: classes.dex */
public final class xv3 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final i20 e;
    public final sd3 f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public xv3(int i, int i2, List list, long j, Object obj, jf4 jf4Var, i20 i20Var, sd3 sd3Var) {
        boolean z;
        int i3;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = i20Var;
        this.f = sd3Var;
        if (jf4Var == jf4.Vertical) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            yn4 yn4Var = (yn4) list.get(i5);
            if (!this.g) {
                i3 = yn4Var.B;
            } else {
                i3 = yn4Var.A;
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
            yn4 yn4Var = (yn4) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.i;
            if (z) {
                float f = (i2 - yn4Var.A) / 2.0f;
                sd3 sd3Var = sd3.Ltr;
                sd3 sd3Var2 = this.f;
                float f2 = RecyclerView.A1;
                if (sd3Var2 != sd3Var) {
                    f2 = RecyclerView.A1 * (-1.0f);
                }
                iArr[i7] = Math.round((1.0f + f2) * f);
                iArr[i7 + 1] = i;
                i5 = yn4Var.B;
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                i20 i20Var = this.e;
                if (i20Var != null) {
                    iArr[i8] = i20Var.a(yn4Var.B, i3);
                    i5 = yn4Var.A;
                } else {
                    throw wh1.c("null verticalAlignment");
                }
            }
            i += i5;
        }
    }
}
