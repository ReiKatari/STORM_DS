package v3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13687a = new a(1000);

    /* renamed from: b  reason: collision with root package name */
    public static final a f13688b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f13689c;

    /* renamed from: d  reason: collision with root package name */
    public static final StackTraceElement[] f13690d;

    static {
        new a(1007);
        f13688b = new a(1008);
        f13689c = new a(1002);
        f13690d = new StackTraceElement[0];
    }

    public static final boolean a(t tVar) {
        if (!tVar.b() && !tVar.f13698h && tVar.f13694d) {
            return true;
        }
        return false;
    }

    public static final boolean b(t tVar) {
        if (!tVar.f13698h && tVar.f13694d) {
            return true;
        }
        return false;
    }

    public static final boolean c(t tVar) {
        if (!tVar.b() && tVar.f13698h && !tVar.f13694d) {
            return true;
        }
        return false;
    }

    public static final boolean d(t tVar) {
        if (tVar.f13698h && !tVar.f13694d) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final boolean f(t tVar, long j2, long j10) {
        int i2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (tVar.f13699i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        long j11 = tVar.f13693c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f8 = i2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) * f8;
        float f10 = ((int) (j2 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f8;
        float f11 = ((int) (j2 & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (intBitsToFloat > f10) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z11 | z10;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z15 = z14 | z12;
        if (intBitsToFloat2 > f11) {
            z13 = true;
        }
        return z15 | z13;
    }

    public static b3.p g(b3.p pVar, a aVar) {
        return pVar.f(new n(aVar));
    }

    public static final long h(t tVar, boolean z10) {
        long d4 = h3.b.d(tVar.f13693c, tVar.f13697g);
        if (!z10 && tVar.b()) {
            return 0L;
        }
        return d4;
    }

    public static String i(long j2) {
        return "PointerId(value=" + j2 + ')';
    }
}
