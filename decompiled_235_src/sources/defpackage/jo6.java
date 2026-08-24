package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jo6  reason: default package */
/* loaded from: classes.dex */
public final class jo6 implements xq6 {
    public double a;
    public double b;
    public double c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;

    @Override // defpackage.xq6
    public final boolean a() {
        double d = this.e - this.c;
        double d2 = this.b;
        double d3 = this.f;
        if (Math.sqrt((((d2 * d) * d) + ((d3 * d3) * this.g)) / d2) <= this.h) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xq6
    public final float b() {
        return RecyclerView.B1;
    }

    @Override // defpackage.xq6
    public final float getInterpolation(float f) {
        double d = f - this.d;
        if (d > 0.0d) {
            double d2 = this.b;
            double d3 = this.a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.g) * d) * 4.0d)) + 1.0d);
            double d4 = d / sqrt;
            int i = 0;
            while (i < sqrt) {
                float f2 = this.e;
                double d5 = f2;
                double d6 = this.c;
                double d7 = d4;
                float f3 = this.f;
                double d8 = f3;
                double d9 = ((-d2) * (d5 - d6)) - (d3 * d8);
                double d10 = this.g;
                double d11 = (((d9 / d10) * d7) / 2.0d) + d8;
                double d12 = ((((-((((d7 * d11) / 2.0d) + d5) - d6)) * d2) - (d11 * d3)) / d10) * d7;
                float f4 = f3 + ((float) d12);
                this.f = f4;
                float f5 = f2 + ((float) (((d12 / 2.0d) + d8) * d7));
                this.e = f5;
                int i2 = this.i;
                if (i2 > 0) {
                    if (f5 < RecyclerView.B1 && (i2 & 1) == 1) {
                        this.e = -f5;
                        this.f = -f4;
                    }
                    float f6 = this.e;
                    if (f6 > 1.0f && (i2 & 2) == 2) {
                        this.e = 2.0f - f6;
                        this.f = -this.f;
                    }
                }
                i++;
                d4 = d7;
            }
        }
        this.d = f;
        if (a()) {
            this.e = (float) this.c;
        }
        return this.e;
    }
}
