package defpackage;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp7  reason: default package */
/* loaded from: classes.dex */
public abstract class hp7 {
    public ci0 a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    /* JADX WARN: Type inference failed for: r12v30, types: [ep7, hp7] */
    /* JADX WARN: Type inference failed for: r12v6, types: [hp7, gp7] */
    public static hp7 b(String str) {
        if (str.startsWith("CUSTOM")) {
            ?? hp7Var = new hp7();
            hp7Var.g = new float[1];
            return hp7Var;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = '\b';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new dp7(3);
            case 1:
                return new dp7(4);
            case 2:
                return new dp7(7);
            case 3:
                return new dp7(8);
            case 4:
                return new dp7(9);
            case 5:
                ?? hp7Var2 = new hp7();
                hp7Var2.g = false;
                return hp7Var2;
            case 6:
                return new dp7(5);
            case 7:
                return new dp7(6);
            case '\b':
                return new dp7(0);
            case '\t':
                return new dp7(2);
            case '\n':
                return new dp7(1);
            case 11:
                return new hp7();
            case '\f':
                return new dp7(0);
            case '\r':
                return new dp7(0);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        char c;
        double d;
        double signum;
        double abs;
        ci0 ci0Var = this.a;
        ak7 ak7Var = (ak7) ci0Var.g;
        double[] dArr = (double[]) ci0Var.h;
        if (ak7Var != null) {
            ak7Var.a0(f, dArr);
        } else {
            dArr[0] = ((float[]) ci0Var.e)[0];
            dArr[1] = ((float[]) ci0Var.f)[0];
            dArr[2] = ((float[]) ci0Var.b)[0];
        }
        double[] dArr2 = (double[]) ci0Var.h;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        dk0 dk0Var = (dk0) ci0Var.a;
        double d4 = f;
        dk0Var.getClass();
        double d5 = 0.0d;
        if (d4 <= 0.0d) {
            c = 2;
        } else if (d4 >= 1.0d) {
            c = 2;
            d5 = 1.0d;
        } else {
            int binarySearch = Arrays.binarySearch((double[]) dk0Var.X, d4);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            float[] fArr = (float[]) dk0Var.R;
            float f2 = fArr[binarySearch];
            int i = binarySearch - 1;
            float f3 = fArr[i];
            c = 2;
            double[] dArr3 = (double[]) dk0Var.X;
            double d6 = dArr3[binarySearch];
            double d7 = dArr3[i];
            double d8 = (f2 - f3) / (d6 - d7);
            d = 2.0d;
            d5 = ((((d4 * d4) - (d7 * d7)) * d8) / 2.0d) + ((d4 - d7) * (f3 - (d8 * d7))) + ((double[]) dk0Var.B)[i];
            double d9 = d5 + d3;
            switch (dk0Var.L) {
                case 1:
                    signum = Math.signum(0.5d - (d9 % 1.0d));
                    break;
                case 2:
                    abs = Math.abs((((d9 * 4.0d) + 1.0d) % 4.0d) - d);
                    signum = 1.0d - abs;
                    break;
                case 3:
                    signum = (((d9 * d) + 1.0d) % d) - 1.0d;
                    break;
                case 4:
                    signum = 1.0d - (((d9 * d) + 1.0d) % d);
                    break;
                case 5:
                    signum = Math.cos((d3 + d9) * 6.283185307179586d);
                    break;
                case 6:
                    double abs2 = 1.0d - Math.abs(((d9 * 4.0d) % 4.0d) - d);
                    abs = abs2 * abs2;
                    signum = 1.0d - abs;
                    break;
                case 7:
                    signum = ((g74) dk0Var.Y).Z(d9 % 1.0d);
                    break;
                default:
                    signum = Math.sin(6.283185307179586d * d9);
                    break;
            }
            return (float) ((signum * ((double[]) ci0Var.h)[c]) + d2);
        }
        d = 2.0d;
        double d92 = d5 + d3;
        switch (dk0Var.L) {
        }
        return (float) ((signum * ((double[]) ci0Var.h)[c]) + d2);
    }

    public abstract void d(View view, float f);

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ci0] */
    public final void e() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i5;
        int i6;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new zh2(18));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance(cls, size, 3);
        int i7 = this.c;
        String str = this.d;
        ?? obj = new Object();
        dk0 dk0Var = new dk0(5);
        dk0Var.R = new float[0];
        dk0Var.X = new double[0];
        obj.a = dk0Var;
        dk0Var.L = i7;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int indexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i8 = 0;
            d = 1.0d;
            while (indexOf2 != -1) {
                dArr3[i8] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i8++;
            }
            dArr3[i8] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr3, i8 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d2 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance(cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i9 = 0;
            while (i9 < copyOf.length) {
                double d3 = copyOf[i9];
                int i10 = i9 + length2;
                dArr4[i10][0] = d3;
                double d4 = d2;
                double d5 = i9 * d4;
                dArr5[i10] = d5;
                if (i9 > 0) {
                    int i11 = (length2 * 2) + i9;
                    dArr4[i11][0] = d3 + 1.0d;
                    dArr5[i11] = d5 + 1.0d;
                    int i12 = i9 - 1;
                    dArr4[i12][0] = (d3 - 1.0d) - d4;
                    dArr5[i12] = (d5 - 1.0d) - d4;
                }
                i9++;
                d2 = d4;
            }
            dk0Var.Y = new g74(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        obj.b = new float[size];
        obj.c = new double[size];
        obj.d = new float[size];
        obj.e = new float[size];
        obj.f = new float[size];
        float[] fArr4 = new float[size];
        this.a = obj;
        int i13 = i4;
        int i14 = i13;
        for (int size2 = arrayList.size(); i14 < size2; size2 = size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            rg3 rg3Var = (rg3) obj2;
            float f = rg3Var.d;
            dArr[i13] = f * 0.01d;
            double[] dArr6 = dArr2[i13];
            float f2 = rg3Var.b;
            dArr6[i4] = f2;
            float f3 = rg3Var.c;
            dArr6[i2] = f3;
            float f4 = rg3Var.e;
            dArr6[i] = f4;
            ci0 ci0Var = this.a;
            ((double[]) ci0Var.c)[i13] = rg3Var.a / 100.0d;
            ((float[]) ci0Var.d)[i13] = f;
            ((float[]) ci0Var.e)[i13] = f3;
            ((float[]) ci0Var.f)[i13] = f4;
            ((float[]) ci0Var.b)[i13] = f2;
            i13++;
            arrayList = arrayList;
        }
        ci0 ci0Var2 = this.a;
        float[] fArr5 = (float[]) ci0Var2.d;
        dk0 dk0Var2 = (dk0) ci0Var2.a;
        double[] dArr7 = (double[]) ci0Var2.c;
        int length3 = dArr7.length;
        int i15 = i;
        int[] iArr = new int[i15];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance(cls, iArr);
        float[] fArr6 = (float[]) ci0Var2.b;
        ci0Var2.h = new double[fArr6.length + i15];
        double[] dArr9 = new double[fArr6.length + i15];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            dk0Var2.f(0.0d, fArr5[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            dk0Var2.f(d, fArr5[length4]);
        }
        for (int i16 = i4; i16 < dArr8.length; i16++) {
            double[] dArr10 = dArr8[i16];
            dArr10[i4] = ((float[]) ci0Var2.e)[i16];
            dArr10[i2] = ((float[]) ci0Var2.f)[i16];
            dArr10[2] = fArr6[i16];
            dk0Var2.f(dArr7[i16], fArr5[i16]);
        }
        double d7 = 0.0d;
        int i17 = i4;
        while (true) {
            if (i17 >= ((float[]) dk0Var2.R).length) {
                break;
            }
            d7 += fArr[i17];
            i17++;
        }
        double d8 = 0.0d;
        int i18 = i2;
        while (true) {
            if (i18 >= ((float[]) dk0Var2.R).length) {
                break;
            }
            double[] dArr11 = (double[]) dk0Var2.X;
            d8 = ((dArr11[i18] - dArr11[i18 - 1]) * ((fArr2[i6] + fArr2[i18]) / 2.0f)) + d8;
            i18++;
        }
        int i19 = i4;
        while (true) {
            float[] fArr7 = (float[]) dk0Var2.R;
            if (i19 >= fArr7.length) {
                break;
            }
            fArr7[i19] = fArr7[i19] * ((float) (d7 / d8));
            i19++;
            d6 = d6;
        }
        ((double[]) dk0Var2.B)[i4] = d6;
        int i20 = i2;
        while (true) {
            if (i20 >= ((float[]) dk0Var2.R).length) {
                break;
            }
            int i21 = i20 - 1;
            double[] dArr12 = (double[]) dk0Var2.X;
            double d9 = dArr12[i20] - dArr12[i21];
            double[] dArr13 = (double[]) dk0Var2.B;
            dArr13[i20] = (d9 * ((fArr3[i21] + fArr3[i20]) / 2.0f)) + dArr13[i21];
            i20++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            ci0Var2.g = ak7.U(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            ci0Var2.g = null;
        }
        ak7.U(i5, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rg3 rg3Var = (rg3) obj;
            StringBuilder r = i61.r(str, "[");
            r.append(rg3Var.a);
            r.append(" , ");
            r.append(decimalFormat.format(rg3Var.b));
            r.append("] ");
            str = r.toString();
        }
        return str;
    }

    public void c(j11 j11Var) {
    }
}
