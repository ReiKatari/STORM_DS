package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt0  reason: default package */
/* loaded from: classes.dex */
public final class qt0 {
    public static final float[] a;
    public static final float[] b;
    public static final e97 c;
    public static final e97 d;
    public static final cq5 e;
    public static final cq5 f;
    public static final cq5 g;
    public static final cq5 h;
    public static final cq5 i;
    public static final cq5 j;
    public static final cq5 k;
    public static final cq5 l;
    public static final cq5 m;
    public static final cq5 n;
    public static final cq5 o;
    public static final cq5 p;
    public static final cq5 q;
    public static final cq5 r;
    public static final zi3 s;
    public static final zi3 t;
    public static final cq5 u;
    public static final cq5 v;
    public static final cq5 w;
    public static final yk4 x;
    public static final nt0[] y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [yk4, nt0] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        e97 e97Var = new e97(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        e97 e97Var2 = new e97(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        e97 e97Var3 = new e97(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = e97Var3;
        e97 e97Var4 = new e97(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = e97Var4;
        ys7 ys7Var = jw2.t;
        cq5 cq5Var = new cq5("sRGB IEC61966-2.1", fArr, ys7Var, e97Var, 0);
        e = cq5Var;
        cq5 cq5Var2 = new cq5("sRGB IEC61966-2.1 (Linear)", fArr, ys7Var, 1.0d, RecyclerView.B1, 1.0f, 1);
        f = cq5Var2;
        cq5 cq5Var3 = new cq5("scRGB-nl IEC 61966-2-2:2003", fArr, ys7Var, null, new i(15), new i(16), -0.799f, 2.399f, e97Var, 2);
        g = cq5Var3;
        cq5 cq5Var4 = new cq5("scRGB IEC 61966-2-2:2003", fArr, ys7Var, 1.0d, -0.5f, 7.499f, 3);
        h = cq5Var4;
        cq5 cq5Var5 = new cq5("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, ys7Var, new e97(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = cq5Var5;
        cq5 cq5Var6 = new cq5("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, ys7Var, new e97(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = cq5Var6;
        cq5 cq5Var7 = new cq5("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new ys7(0.314f, 0.351f), 2.6d, RecyclerView.B1, 1.0f, 6);
        k = cq5Var7;
        cq5 cq5Var8 = new cq5("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, ys7Var, e97Var, 7);
        l = cq5Var8;
        cq5 cq5Var9 = new cq5("NTSC (1953)", fArr2, jw2.q, new e97(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = cq5Var9;
        cq5 cq5Var10 = new cq5("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, ys7Var, new e97(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = cq5Var10;
        cq5 cq5Var11 = new cq5("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, ys7Var, 2.2d, RecyclerView.B1, 1.0f, 10);
        o = cq5Var11;
        cq5 cq5Var12 = new cq5("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, jw2.r, new e97(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = cq5Var12;
        float[] fArr4 = {0.7347f, 0.2653f, RecyclerView.B1, 1.0f, 1.0E-4f, -0.077f};
        ys7 ys7Var2 = jw2.s;
        cq5 cq5Var13 = new cq5("SMPTE ST 2065-1:2012 ACES", fArr4, ys7Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = cq5Var13;
        cq5 cq5Var14 = new cq5("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, ys7Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = cq5Var14;
        zi3 zi3Var = new zi3(14, 1, 12884901889L, "Generic XYZ");
        s = zi3Var;
        zi3 zi3Var2 = new zi3(15, 0, 12884901890L, "Generic L*a*b*");
        t = zi3Var2;
        cq5 cq5Var15 = new cq5("None", fArr, ys7Var, e97Var2, 16);
        u = cq5Var15;
        cq5 cq5Var16 = new cq5("Hybrid Log Gamma encoding", fArr3, ys7Var, null, new i(17), new i(18), RecyclerView.B1, 1.0f, e97Var3, 17);
        v = cq5Var16;
        cq5 cq5Var17 = new cq5("Perceptual Quantizer encoding", fArr3, ys7Var, null, new i(19), new i(20), RecyclerView.B1, 1.0f, e97Var4, 18);
        w = cq5Var17;
        ?? nt0Var = new nt0("Oklab", 19, 12884901890L);
        x = nt0Var;
        y = new nt0[]{cq5Var, cq5Var2, cq5Var3, cq5Var4, cq5Var5, cq5Var6, cq5Var7, cq5Var8, cq5Var9, cq5Var10, cq5Var11, cq5Var12, cq5Var13, cq5Var14, zi3Var, zi3Var2, cq5Var15, cq5Var16, cq5Var17, nt0Var};
    }

    public static double a(e97 e97Var, double d2) {
        double d3;
        double exp;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = e97Var.b;
        double d6 = e97Var.c;
        double d7 = e97Var.d;
        double d8 = e97Var.e;
        double d9 = e97Var.f;
        double d10 = e97Var.g + 1.0d;
        double d11 = d5 * d4;
        if (d11 <= 1.0d) {
            exp = Math.pow(d11, d6);
        } else {
            exp = Math.exp((d4 - d9) * d7) + d8;
        }
        return d10 * d3 * exp;
    }

    public static double b(e97 e97Var, double d2) {
        double d3;
        double log;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = 1.0d / e97Var.b;
        double d5 = 1.0d / e97Var.c;
        double d6 = 1.0d / e97Var.d;
        double d7 = e97Var.e;
        double d8 = e97Var.f;
        double d9 = (d2 * d3) / (e97Var.g + 1.0d);
        if (d9 <= 1.0d) {
            log = Math.pow(d9, d5) * d4;
        } else {
            log = (Math.log(d9 - d7) * d6) + d8;
        }
        return d3 * log;
    }

    public static double c(e97 e97Var, double d2) {
        double d3;
        double d4 = 0.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = e97Var.b;
        double d7 = e97Var.d;
        double pow = (Math.pow(d5, d7) * e97Var.c) + d6;
        if (pow >= 0.0d) {
            d4 = pow;
        }
        return Math.pow(d4 / ((Math.pow(d5, d7) * e97Var.f) + e97Var.e), e97Var.g) * d3;
    }

    public static double d(e97 e97Var, double d2) {
        double d3;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = e97Var.e;
        double d6 = 1.0d / e97Var.g;
        return Math.pow(Math.max((Math.pow(d4, d6) * d5) + (-e97Var.b), 0.0d) / ((Math.pow(d4, d6) * (-e97Var.f)) + e97Var.c), 1.0d / e97Var.d) * d3;
    }
}
