package l;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: e  reason: collision with root package name */
    public static f0 f8413e;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8414a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f8415b;

    /* renamed from: c  reason: collision with root package name */
    public long f8416c;

    /* renamed from: d  reason: collision with root package name */
    public long f8417d;

    public f0(int i2) {
        this.f8415b = i2;
    }

    public static void c(f0 f0Var, long j2, long j10, int i2) {
        if ((i2 & 1) != 0) {
            j2 = 0;
        }
        if ((i2 & 2) != 0) {
            j10 = 0;
        }
        synchronized (f0Var) {
            try {
                if (j2 >= 0) {
                    if (j10 >= 0) {
                        long j11 = f0Var.f8416c + j2;
                        f0Var.f8416c = j11;
                        long j12 = f0Var.f8417d + j10;
                        f0Var.f8417d = j12;
                        if (j12 > j11) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(double d4, double d10, long j2) {
        float f8;
        float f10;
        double d11;
        double d12 = (0.01720197f * (((float) (j2 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((f8 - 9.0E-4f) - d11)) + 9.0E-4f + ((-d10) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d4;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f8415b = 1;
            this.f8416c = -1L;
            this.f8417d = -1L;
        } else if (sin3 <= -1.0d) {
            this.f8415b = 0;
            this.f8416c = -1L;
            this.f8417d = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f8416c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f8417d = round;
            if (round < j2 && this.f8416c > j2) {
                this.f8415b = 0;
            } else {
                this.f8415b = 1;
            }
        }
    }

    public synchronized long b() {
        return this.f8416c - this.f8417d;
    }

    public String toString() {
        switch (this.f8414a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return "WindowCounter(streamId=" + this.f8415b + ", total=" + this.f8416c + ", acknowledged=" + this.f8417d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f0() {
    }
}
