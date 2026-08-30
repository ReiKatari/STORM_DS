package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f7349a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f7350b;

    /* renamed from: c  reason: collision with root package name */
    public static final r f7351c;

    /* renamed from: d  reason: collision with root package name */
    public static final r f7352d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f7353e;

    /* renamed from: f  reason: collision with root package name */
    public static final q f7354f;

    /* renamed from: g  reason: collision with root package name */
    public static final q f7355g;

    /* renamed from: h  reason: collision with root package name */
    public static final q f7356h;

    /* renamed from: i  reason: collision with root package name */
    public static final q f7357i;

    /* renamed from: j  reason: collision with root package name */
    public static final q f7358j;

    /* renamed from: k  reason: collision with root package name */
    public static final q f7359k;

    /* renamed from: l  reason: collision with root package name */
    public static final q f7360l;
    public static final q m;

    /* renamed from: n  reason: collision with root package name */
    public static final q f7361n;

    /* renamed from: o  reason: collision with root package name */
    public static final q f7362o;

    /* renamed from: p  reason: collision with root package name */
    public static final q f7363p;

    /* renamed from: q  reason: collision with root package name */
    public static final q f7364q;

    /* renamed from: r  reason: collision with root package name */
    public static final q f7365r;

    /* renamed from: s  reason: collision with root package name */
    public static final k f7366s;

    /* renamed from: t  reason: collision with root package name */
    public static final k f7367t;

    /* renamed from: u  reason: collision with root package name */
    public static final q f7368u;

    /* renamed from: v  reason: collision with root package name */
    public static final q f7369v;

    /* renamed from: w  reason: collision with root package name */
    public static final q f7370w;

    /* renamed from: x  reason: collision with root package name */
    public static final l f7371x;

    /* renamed from: y  reason: collision with root package name */
    public static final c[] f7372y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [j3.l, j3.c] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f7349a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f7350b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f7351c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f7352d = rVar4;
        s sVar = j.f7384d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f7353e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f7354f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new fj.j(14), new fj.j(15), -0.799f, 2.399f, rVar, 2);
        f7355g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f7356h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f7357i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f7358j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f7359k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f7360l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f7381a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f7361n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f7362o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f7382b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f7363p = qVar12;
        s sVar2 = j.f7383c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f7364q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f7365r = qVar14;
        k kVar = new k(14, 1, b.f7342b, "Generic XYZ");
        f7366s = kVar;
        long j2 = b.f7343c;
        k kVar2 = new k(15, 0, j2, "Generic L*a*b*");
        f7367t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f7368u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new fj.j(16), new fj.j(17), 0.0f, 1.0f, rVar3, 17);
        f7369v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new fj.j(18), new fj.j(19), 0.0f, 1.0f, rVar4, 18);
        f7370w = qVar17;
        ?? cVar = new c("Oklab", 19, j2);
        f7371x = cVar;
        f7372y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, cVar};
    }

    public static double a(r rVar, double d4) {
        double d10;
        double exp;
        if (d4 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = d4 * d10;
        double d12 = rVar.f7406b;
        double d13 = rVar.f7407c;
        double d14 = rVar.f7408d;
        double d15 = rVar.f7409e;
        double d16 = rVar.f7410f;
        double d17 = rVar.f7411g + 1.0d;
        double d18 = d12 * d11;
        if (d18 <= 1.0d) {
            exp = Math.pow(d18, d13);
        } else {
            exp = Math.exp((d11 - d16) * d14) + d15;
        }
        return d17 * d10 * exp;
    }

    public static double b(r rVar, double d4) {
        double d10;
        double log;
        if (d4 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = 1.0d / rVar.f7406b;
        double d12 = 1.0d / rVar.f7407c;
        double d13 = 1.0d / rVar.f7408d;
        double d14 = rVar.f7409e;
        double d15 = rVar.f7410f;
        double d16 = (d4 * d10) / (rVar.f7411g + 1.0d);
        if (d16 <= 1.0d) {
            log = Math.pow(d16, d12) * d11;
        } else {
            log = (Math.log(d16 - d14) * d13) + d15;
        }
        return d10 * log;
    }

    public static double c(r rVar, double d4) {
        double d10;
        double d11 = 0.0d;
        if (d4 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d12 = d4 * d10;
        double d13 = rVar.f7406b;
        double d14 = rVar.f7408d;
        double pow = (Math.pow(d12, d14) * rVar.f7407c) + d13;
        if (pow >= 0.0d) {
            d11 = pow;
        }
        return Math.pow(d11 / ((Math.pow(d12, d14) * rVar.f7410f) + rVar.f7409e), rVar.f7411g) * d10;
    }

    public static double d(r rVar, double d4) {
        double d10;
        if (d4 < 0.0d) {
            d10 = -1.0d;
        } else {
            d10 = 1.0d;
        }
        double d11 = d4 * d10;
        double d12 = rVar.f7409e;
        double d13 = 1.0d / rVar.f7411g;
        return Math.pow(Math.max((Math.pow(d11, d13) * d12) + (-rVar.f7406b), 0.0d) / ((Math.pow(d11, d13) * (-rVar.f7410f)) + rVar.f7407c), 1.0d / rVar.f7408d) * d10;
    }
}
