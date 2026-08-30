package defpackage;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gb7  reason: default package */
/* loaded from: classes.dex */
public abstract class gb7 {
    public tf0 a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    /* JADX WARN: Type inference failed for: r12v30, types: [db7, gb7] */
    /* JADX WARN: Type inference failed for: r12v6, types: [fb7, gb7] */
    public static gb7 b(String str) {
        if (str.startsWith("CUSTOM")) {
            ?? gb7Var = new gb7();
            gb7Var.g = new float[1];
            return gb7Var;
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
                return new cb7(3);
            case 1:
                return new cb7(4);
            case 2:
                return new cb7(7);
            case 3:
                return new cb7(8);
            case 4:
                return new cb7(9);
            case 5:
                ?? gb7Var2 = new gb7();
                gb7Var2.g = false;
                return gb7Var2;
            case ig7.b /* 6 */:
                return new cb7(5);
            case 7:
                return new cb7(6);
            case '\b':
                return new cb7(0);
            case '\t':
                return new cb7(2);
            case '\n':
                return new cb7(1);
            case 11:
                return new gb7();
            case mj2.L /* 12 */:
                return new cb7(0);
            case '\r':
                return new cb7(0);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r25) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb7.a(float):float");
    }

    public abstract void d(View view, float f);

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, tf0] */
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
        Collections.sort(arrayList, new hd2(17));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance(cls, size, 3);
        int i7 = this.c;
        String str = this.d;
        ?? obj = new Object();
        vh0 vh0Var = new vh0(4);
        vh0Var.d = new float[0];
        vh0Var.e = new double[0];
        obj.A = vh0Var;
        vh0Var.c = i7;
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
            vh0Var.f = new fz3(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        obj.B = new float[size];
        obj.L = new double[size];
        obj.R = new float[size];
        obj.X = new float[size];
        obj.Y = new float[size];
        float[] fArr4 = new float[size];
        this.a = obj;
        int i13 = i4;
        int i14 = i13;
        for (int size2 = arrayList.size(); i14 < size2; size2 = size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            y93 y93Var = (y93) obj2;
            float f = y93Var.d;
            dArr[i13] = f * 0.01d;
            double[] dArr6 = dArr2[i13];
            float f2 = y93Var.b;
            dArr6[i4] = f2;
            float f3 = y93Var.c;
            dArr6[i2] = f3;
            float f4 = y93Var.e;
            dArr6[i] = f4;
            tf0 tf0Var = this.a;
            ((double[]) tf0Var.L)[i13] = y93Var.a / 100.0d;
            ((float[]) tf0Var.R)[i13] = f;
            ((float[]) tf0Var.X)[i13] = f3;
            ((float[]) tf0Var.Y)[i13] = f4;
            ((float[]) tf0Var.B)[i13] = f2;
            i13++;
            arrayList = arrayList;
        }
        tf0 tf0Var2 = this.a;
        float[] fArr5 = (float[]) tf0Var2.R;
        vh0 vh0Var2 = (vh0) tf0Var2.A;
        double[] dArr7 = (double[]) tf0Var2.L;
        int length3 = dArr7.length;
        int i15 = i;
        int[] iArr = new int[i15];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance(cls, iArr);
        float[] fArr6 = (float[]) tf0Var2.B;
        tf0Var2.c0 = new double[fArr6.length + i15];
        double[] dArr9 = new double[fArr6.length + i15];
        double d6 = 0.0d;
        if (dArr7[i4] > 0.0d) {
            vh0Var2.e(0.0d, fArr5[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            vh0Var2.e(d, fArr5[length4]);
        }
        for (int i16 = i4; i16 < dArr8.length; i16++) {
            double[] dArr10 = dArr8[i16];
            dArr10[i4] = ((float[]) tf0Var2.X)[i16];
            dArr10[i2] = ((float[]) tf0Var2.Y)[i16];
            dArr10[2] = fArr6[i16];
            vh0Var2.e(dArr7[i16], fArr5[i16]);
        }
        double d7 = 0.0d;
        int i17 = i4;
        while (true) {
            if (i17 >= ((float[]) vh0Var2.d).length) {
                break;
            }
            d7 += fArr[i17];
            i17++;
        }
        double d8 = 0.0d;
        int i18 = i2;
        while (true) {
            if (i18 >= ((float[]) vh0Var2.d).length) {
                break;
            }
            double[] dArr11 = (double[]) vh0Var2.e;
            d8 = ((dArr11[i18] - dArr11[i18 - 1]) * ((fArr2[i6] + fArr2[i18]) / 2.0f)) + d8;
            i18++;
        }
        int i19 = i4;
        while (true) {
            float[] fArr7 = (float[]) vh0Var2.d;
            if (i19 >= fArr7.length) {
                break;
            }
            fArr7[i19] = fArr7[i19] * ((float) (d7 / d8));
            i19++;
            d6 = d6;
        }
        ((double[]) vh0Var2.b)[i4] = d6;
        int i20 = i2;
        while (true) {
            if (i20 >= ((float[]) vh0Var2.d).length) {
                break;
            }
            int i21 = i20 - 1;
            double[] dArr12 = (double[]) vh0Var2.e;
            double d9 = dArr12[i20] - dArr12[i21];
            double[] dArr13 = (double[]) vh0Var2.b;
            dArr13[i20] = (d9 * ((fArr3[i21] + fArr3[i20]) / 2.0f)) + dArr13[i21];
            i20++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            tf0Var2.Z = jv3.v(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            tf0Var2.Z = null;
        }
        jv3.v(i5, dArr, dArr2);
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
            y93 y93Var = (y93) obj;
            StringBuilder t = b31.t(str, "[");
            t.append(y93Var.a);
            t.append(" , ");
            t.append(decimalFormat.format(y93Var.b));
            t.append("] ");
            str = t.toString();
        }
        return str;
    }

    public void c(ey0 ey0Var) {
    }
}
