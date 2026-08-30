package l6;

import a0.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public double f8958a;

    /* renamed from: b  reason: collision with root package name */
    public double f8959b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8960c;

    /* renamed from: d  reason: collision with root package name */
    public double f8961d;

    /* renamed from: e  reason: collision with root package name */
    public double f8962e;

    /* renamed from: f  reason: collision with root package name */
    public double f8963f;

    /* renamed from: g  reason: collision with root package name */
    public double f8964g;

    /* renamed from: h  reason: collision with root package name */
    public double f8965h;

    /* renamed from: i  reason: collision with root package name */
    public double f8966i;

    /* renamed from: j  reason: collision with root package name */
    public final aa.f f8967j;

    /* JADX WARN: Type inference failed for: r0v5, types: [aa.f, java.lang.Object] */
    public g() {
        this.f8958a = Math.sqrt(1500.0d);
        this.f8959b = 0.5d;
        this.f8960c = false;
        this.f8966i = Double.MAX_VALUE;
        this.f8967j = new Object();
    }

    public final void a(float f8) {
        if (f8 >= 0.0f) {
            this.f8959b = f8;
            this.f8960c = false;
            return;
        }
        j.h("Damping ratio must be non-negative");
    }

    public final void b(float f8) {
        if (f8 > 0.0f) {
            this.f8958a = Math.sqrt(f8);
            this.f8960c = false;
            return;
        }
        j.h("Spring stiffness constant must be positive.");
    }

    public final aa.f c(double d4, double d10, long j2) {
        double sin;
        double cos;
        if (!this.f8960c) {
            if (this.f8966i != Double.MAX_VALUE) {
                double d11 = this.f8959b;
                if (d11 > 1.0d) {
                    double d12 = this.f8958a;
                    this.f8963f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.f8959b;
                    double d14 = this.f8958a;
                    this.f8964g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.f8965h = Math.sqrt(1.0d - (d11 * d11)) * this.f8958a;
                }
                this.f8960c = true;
            } else {
                j.p("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
        }
        double d15 = j2 / 1000.0d;
        double d16 = d4 - this.f8966i;
        double d17 = this.f8959b;
        int i2 = (d17 > 1.0d ? 1 : (d17 == 1.0d ? 0 : -1));
        if (i2 > 0) {
            double d18 = this.f8964g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f8963f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f8963f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f8964g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f8963f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (i2 == 0) {
            double d23 = this.f8958a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f8958a) * d15) * d25;
            double d26 = -this.f8958a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.f8965h;
            double d28 = this.f8958a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.f8965h * d15) * d29) + (Math.cos(this.f8965h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f8958a;
            double d31 = this.f8959b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.f8965h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.f8965h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        aa.f fVar = this.f8967j;
        fVar.f685a = (float) (sin + this.f8966i);
        fVar.f686b = (float) cos;
        return fVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aa.f, java.lang.Object] */
    public g(float f8) {
        this.f8958a = Math.sqrt(1500.0d);
        this.f8959b = 0.5d;
        this.f8960c = false;
        this.f8967j = new Object();
        this.f8966i = f8;
    }
}
