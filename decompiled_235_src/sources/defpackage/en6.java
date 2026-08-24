package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en6  reason: default package */
/* loaded from: classes.dex */
public final class en6 implements Comparable {
    public boolean A;
    public float X;
    public dn6 e0;
    public int B = -1;
    public int L = -1;
    public int R = 0;
    public boolean Y = false;
    public final float[] Z = new float[9];
    public final float[] d0 = new float[9];
    public yu[] f0 = new yu[16];
    public int g0 = 0;
    public int h0 = 0;

    public en6(dn6 dn6Var) {
        this.e0 = dn6Var;
    }

    public final void a(yu yuVar) {
        int i = 0;
        while (true) {
            int i2 = this.g0;
            yu[] yuVarArr = this.f0;
            if (i < i2) {
                if (yuVarArr[i] == yuVar) {
                    return;
                }
                i++;
            } else {
                if (i2 >= yuVarArr.length) {
                    this.f0 = (yu[]) Arrays.copyOf(yuVarArr, yuVarArr.length * 2);
                }
                yu[] yuVarArr2 = this.f0;
                int i3 = this.g0;
                yuVarArr2[i3] = yuVar;
                this.g0 = i3 + 1;
                return;
            }
        }
    }

    public final void b(yu yuVar) {
        int i = this.g0;
        int i2 = 0;
        while (i2 < i) {
            if (this.f0[i2] == yuVar) {
                while (i2 < i - 1) {
                    yu[] yuVarArr = this.f0;
                    int i3 = i2 + 1;
                    yuVarArr[i2] = yuVarArr[i3];
                    i2 = i3;
                }
                this.g0--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.e0 = dn6.UNKNOWN;
        this.R = 0;
        this.B = -1;
        this.L = -1;
        this.X = RecyclerView.B1;
        this.Y = false;
        int i = this.g0;
        for (int i2 = 0; i2 < i; i2++) {
            this.f0[i2] = null;
        }
        this.g0 = 0;
        this.h0 = 0;
        this.A = false;
        Arrays.fill(this.d0, (float) RecyclerView.B1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.B - ((en6) obj).B;
    }

    public final void d(jv3 jv3Var, float f) {
        this.X = f;
        this.Y = true;
        int i = this.g0;
        this.L = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f0[i2].h(jv3Var, this, false);
        }
        this.g0 = 0;
    }

    public final void e(jv3 jv3Var, yu yuVar) {
        int i = this.g0;
        for (int i2 = 0; i2 < i; i2++) {
            this.f0[i2].i(jv3Var, yuVar, false);
        }
        this.g0 = 0;
    }

    public final String toString() {
        return "" + this.B;
    }
}
