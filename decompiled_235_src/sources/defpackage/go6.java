package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: go6  reason: default package */
/* loaded from: classes.dex */
public final class go6 {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final gv j;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, gv] */
    public go6() {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new Object();
    }

    public final void a(float f) {
        if (f >= RecyclerView.B1) {
            this.b = f;
            this.c = false;
            return;
        }
        i.h("Damping ratio must be non-negative");
    }

    public final void b(float f) {
        if (f > RecyclerView.B1) {
            this.a = Math.sqrt(f);
            this.c = false;
            return;
        }
        i.h("Spring stiffness constant must be positive.");
    }

    public final gv c(double d, double d2, long j) {
        double sin;
        double cos;
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                double d3 = this.b;
                if (d3 > 1.0d) {
                    double d4 = this.a;
                    this.f = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                    double d5 = this.b;
                    double d6 = this.a;
                    this.g = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
                } else if (d3 >= 0.0d && d3 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d3 * d3)) * this.a;
                }
                this.c = true;
            } else {
                i.m("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.i;
        double d9 = this.b;
        int i = (d9 > 1.0d ? 1 : (d9 == 1.0d ? 0 : -1));
        if (i > 0) {
            double d10 = this.g;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f);
            double d12 = d8 - d11;
            sin = (Math.pow(2.718281828459045d, this.f * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.g;
            double pow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f;
            cos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + pow;
        } else if (i == 0) {
            double d15 = this.a;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double pow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d7) * d17;
            double d18 = -this.a;
            cos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (pow3 * d18);
            sin = pow2;
        } else {
            double d19 = 1.0d / this.h;
            double d20 = this.a;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            sin = ((Math.sin(this.h * d7) * d21) + (Math.cos(this.h * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.a;
            double d23 = this.b;
            double d24 = (-d22) * sin * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.h;
            double sin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.h;
            cos = (((Math.cos(d26 * d7) * d21 * d26) + sin2) * pow4) + d24;
        }
        gv gvVar = this.j;
        gvVar.a = (float) (sin + this.i);
        gvVar.b = (float) cos;
        return gvVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, gv] */
    public go6(float f) {
        this.a = Math.sqrt(1500.0d);
        this.b = 0.5d;
        this.c = false;
        this.j = new Object();
        this.i = f;
    }
}
