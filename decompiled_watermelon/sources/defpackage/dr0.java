package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dr0  reason: default package */
/* loaded from: classes.dex */
public final class dr0 {
    public static final float[] a;
    public static final float[] b;
    public static final rw6 c;
    public static final rw6 d;
    public static final eg5 e;
    public static final eg5 f;
    public static final eg5 g;
    public static final eg5 h;
    public static final eg5 i;
    public static final eg5 j;
    public static final eg5 k;
    public static final eg5 l;
    public static final eg5 m;
    public static final eg5 n;
    public static final eg5 o;
    public static final eg5 p;
    public static final eg5 q;
    public static final eg5 r;
    public static final hc3 s;
    public static final hc3 t;
    public static final eg5 u;
    public static final eg5 v;
    public static final eg5 w;
    public static final ac4 x;
    public static final ar0[] y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [ac4, ar0] */
    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        rw6 rw6Var = new rw6(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        rw6 rw6Var2 = new rw6(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        rw6 rw6Var3 = new rw6(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = rw6Var3;
        rw6 rw6Var4 = new rw6(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = rw6Var4;
        xd7 xd7Var = dk7.g;
        eg5 eg5Var = new eg5("sRGB IEC61966-2.1", fArr, xd7Var, rw6Var, 0);
        e = eg5Var;
        eg5 eg5Var2 = new eg5("sRGB IEC61966-2.1 (Linear)", fArr, xd7Var, 1.0d, RecyclerView.A1, 1.0f, 1);
        f = eg5Var2;
        eg5 eg5Var3 = new eg5("scRGB-nl IEC 61966-2-2:2003", fArr, xd7Var, null, new i(14), new i(15), -0.799f, 2.399f, rw6Var, 2);
        g = eg5Var3;
        eg5 eg5Var4 = new eg5("scRGB IEC 61966-2-2:2003", fArr, xd7Var, 1.0d, -0.5f, 7.499f, 3);
        h = eg5Var4;
        eg5 eg5Var5 = new eg5("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, xd7Var, new rw6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = eg5Var5;
        eg5 eg5Var6 = new eg5("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, xd7Var, new rw6(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = eg5Var6;
        eg5 eg5Var7 = new eg5("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new xd7(0.314f, 0.351f), 2.6d, RecyclerView.A1, 1.0f, 6);
        k = eg5Var7;
        eg5 eg5Var8 = new eg5("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, xd7Var, rw6Var, 7);
        l = eg5Var8;
        eg5 eg5Var9 = new eg5("NTSC (1953)", fArr2, dk7.d, new rw6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = eg5Var9;
        eg5 eg5Var10 = new eg5("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, xd7Var, new rw6(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = eg5Var10;
        eg5 eg5Var11 = new eg5("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, xd7Var, 2.2d, RecyclerView.A1, 1.0f, 10);
        o = eg5Var11;
        eg5 eg5Var12 = new eg5("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, dk7.e, new rw6(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = eg5Var12;
        float[] fArr4 = {0.7347f, 0.2653f, RecyclerView.A1, 1.0f, 1.0E-4f, -0.077f};
        xd7 xd7Var2 = dk7.f;
        eg5 eg5Var13 = new eg5("SMPTE ST 2065-1:2012 ACES", fArr4, xd7Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = eg5Var13;
        eg5 eg5Var14 = new eg5("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, xd7Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = eg5Var14;
        hc3 hc3Var = new hc3(14, 1, 12884901889L, "Generic XYZ");
        s = hc3Var;
        hc3 hc3Var2 = new hc3(15, 0, 12884901890L, "Generic L*a*b*");
        t = hc3Var2;
        eg5 eg5Var15 = new eg5("None", fArr, xd7Var, rw6Var2, 16);
        u = eg5Var15;
        eg5 eg5Var16 = new eg5("Hybrid Log Gamma encoding", fArr3, xd7Var, null, new i(16), new i(17), RecyclerView.A1, 1.0f, rw6Var3, 17);
        v = eg5Var16;
        eg5 eg5Var17 = new eg5("Perceptual Quantizer encoding", fArr3, xd7Var, null, new i(18), new i(19), RecyclerView.A1, 1.0f, rw6Var4, 18);
        w = eg5Var17;
        ?? ar0Var = new ar0("Oklab", 19, 12884901890L);
        x = ar0Var;
        y = new ar0[]{eg5Var, eg5Var2, eg5Var3, eg5Var4, eg5Var5, eg5Var6, eg5Var7, eg5Var8, eg5Var9, eg5Var10, eg5Var11, eg5Var12, eg5Var13, eg5Var14, hc3Var, hc3Var2, eg5Var15, eg5Var16, eg5Var17, ar0Var};
    }

    public static double a(rw6 rw6Var, double d2) {
        double d3;
        double exp;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = rw6Var.b;
        double d6 = rw6Var.c;
        double d7 = rw6Var.d;
        double d8 = rw6Var.e;
        double d9 = rw6Var.f;
        double d10 = rw6Var.g + 1.0d;
        double d11 = d5 * d4;
        if (d11 <= 1.0d) {
            exp = Math.pow(d11, d6);
        } else {
            exp = Math.exp((d4 - d9) * d7) + d8;
        }
        return d10 * d3 * exp;
    }

    public static double b(rw6 rw6Var, double d2) {
        double d3;
        double log;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = 1.0d / rw6Var.b;
        double d5 = 1.0d / rw6Var.c;
        double d6 = 1.0d / rw6Var.d;
        double d7 = rw6Var.e;
        double d8 = rw6Var.f;
        double d9 = (d2 * d3) / (rw6Var.g + 1.0d);
        if (d9 <= 1.0d) {
            log = Math.pow(d9, d5) * d4;
        } else {
            log = (Math.log(d9 - d7) * d6) + d8;
        }
        return d3 * log;
    }

    public static double c(rw6 rw6Var, double d2) {
        double d3;
        double d4 = 0.0d;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d5 = d2 * d3;
        double d6 = rw6Var.b;
        double d7 = rw6Var.d;
        double pow = (Math.pow(d5, d7) * rw6Var.c) + d6;
        if (pow >= 0.0d) {
            d4 = pow;
        }
        return Math.pow(d4 / ((Math.pow(d5, d7) * rw6Var.f) + rw6Var.e), rw6Var.g) * d3;
    }

    public static double d(rw6 rw6Var, double d2) {
        double d3;
        if (d2 < 0.0d) {
            d3 = -1.0d;
        } else {
            d3 = 1.0d;
        }
        double d4 = d2 * d3;
        double d5 = rw6Var.e;
        double d6 = 1.0d / rw6Var.g;
        return Math.pow(Math.max((Math.pow(d4, d6) * d5) + (-rw6Var.b), 0.0d) / ((Math.pow(d4, d6) * (-rw6Var.f)) + rw6Var.c), 1.0d / rw6Var.d) * d3;
    }
}
