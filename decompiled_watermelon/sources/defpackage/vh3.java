package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh3  reason: default package */
/* loaded from: classes.dex */
public final class vh3 {
    public final ci3 a;
    public final int b;
    public final int c;
    public final uh3 d;
    public final fi3 e;
    public final /* synthetic */ ci3 f;

    public vh3(ci3 ci3Var, int i, int i2, uh3 uh3Var, fi3 fi3Var) {
        this.f = ci3Var;
        this.a = ci3Var;
        this.b = i;
        this.c = i2;
        this.d = uh3Var;
        this.e = fi3Var;
    }

    public final long a(int i, int i2) {
        int i3;
        ci3 ci3Var = this.a;
        int[] iArr = (int[]) ci3Var.B;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) ci3Var.L;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            oz2.a("width must be >= 0");
        }
        return nz0.h(i3, i3, 0, Preference.DEFAULT_ORDER);
    }

    public final ai3 b(int i) {
        int i2;
        re2 c = this.e.c(i);
        int i3 = c.a;
        int size = c.b.size();
        int i4 = 0;
        if (size != 0 && i3 + size != this.b) {
            i2 = this.c;
        } else {
            i2 = 0;
        }
        zh3[] zh3VarArr = new zh3[size];
        int i5 = 0;
        while (true) {
            List list = c.b;
            if (i4 < size) {
                int i6 = (int) ((fo2) list.get(i4)).a;
                int i7 = i2;
                zh3 o = this.d.o(i3 + i4, a(i5, i6), i5, i6, i7);
                i5 += i6;
                zh3VarArr[i4] = o;
                i4++;
                i2 = i7;
            } else {
                return new ai3(i, zh3VarArr, this.f, list, i2);
            }
        }
    }
}
