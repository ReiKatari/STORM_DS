package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ob6  reason: default package */
/* loaded from: classes.dex */
public final class ob6 implements Comparable {
    public boolean A;
    public float X;
    public nb6 d0;
    public int B = -1;
    public int L = -1;
    public int R = 0;
    public boolean Y = false;
    public final float[] Z = new float[9];
    public final float[] c0 = new float[9];
    public gu[] e0 = new gu[16];
    public int f0 = 0;
    public int g0 = 0;

    public ob6(nb6 nb6Var) {
        this.d0 = nb6Var;
    }

    public final void a(gu guVar) {
        int i = 0;
        while (true) {
            int i2 = this.f0;
            gu[] guVarArr = this.e0;
            if (i < i2) {
                if (guVarArr[i] == guVar) {
                    return;
                }
                i++;
            } else {
                if (i2 >= guVarArr.length) {
                    this.e0 = (gu[]) Arrays.copyOf(guVarArr, guVarArr.length * 2);
                }
                gu[] guVarArr2 = this.e0;
                int i3 = this.f0;
                guVarArr2[i3] = guVar;
                this.f0 = i3 + 1;
                return;
            }
        }
    }

    public final void b(gu guVar) {
        int i = this.f0;
        int i2 = 0;
        while (i2 < i) {
            if (this.e0[i2] == guVar) {
                while (i2 < i - 1) {
                    gu[] guVarArr = this.e0;
                    int i3 = i2 + 1;
                    guVarArr[i2] = guVarArr[i3];
                    i2 = i3;
                }
                this.f0--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.d0 = nb6.UNKNOWN;
        this.R = 0;
        this.B = -1;
        this.L = -1;
        this.X = RecyclerView.A1;
        this.Y = false;
        int i = this.f0;
        for (int i2 = 0; i2 < i; i2++) {
            this.e0[i2] = null;
        }
        this.f0 = 0;
        this.g0 = 0;
        this.A = false;
        Arrays.fill(this.c0, (float) RecyclerView.A1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.B - ((ob6) obj).B;
    }

    public final void d(ho3 ho3Var, float f) {
        this.X = f;
        this.Y = true;
        int i = this.f0;
        this.L = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.e0[i2].h(ho3Var, this, false);
        }
        this.f0 = 0;
    }

    public final void e(ho3 ho3Var, gu guVar) {
        int i = this.f0;
        for (int i2 = 0; i2 < i; i2++) {
            this.e0[i2].i(ho3Var, guVar, false);
        }
        this.f0 = 0;
    }

    public final String toString() {
        return "" + this.B;
    }
}
