package g5;

import ah.b0;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public d5.f f5569a;

    /* renamed from: b  reason: collision with root package name */
    public String f5570b;

    /* renamed from: c  reason: collision with root package name */
    public int f5571c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String f5572d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f5573e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f5574f = new ArrayList();

    /* JADX WARN: Type inference failed for: r12v30, types: [g5.g, g5.d] */
    /* JADX WARN: Type inference failed for: r12v6, types: [g5.g, g5.f] */
    public static g b(String str) {
        if (str.startsWith("CUSTOM")) {
            ?? gVar = new g();
            gVar.f5566g = new float[1];
            return gVar;
        }
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c4 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c4 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c4 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c4 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c4 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c4 = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c4 = '\b';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c4 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c4 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c4 = '\r';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                return new c(3);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c(4);
            case 2:
                return new c(7);
            case 3:
                return new c(8);
            case 4:
                return new c(9);
            case l1.c.f8511g /* 5 */:
                ?? gVar2 = new g();
                gVar2.f5568g = false;
                return gVar2;
            case l1.c.f8509e /* 6 */:
                return new c(5);
            case 7:
                return new c(6);
            case '\b':
                return new c(0);
            case l1.c.f8508d /* 9 */:
                return new c(2);
            case l1.c.f8510f /* 10 */:
                return new c(1);
            case 11:
                return new g();
            case '\f':
                return new c(0);
            case '\r':
                return new c(0);
            default:
                return null;
        }
    }

    public final float a(float f8) {
        char c4;
        double signum;
        double abs;
        d5.f fVar = this.f5569a;
        ij.a aVar = (ij.a) fVar.f3846h;
        double[] dArr = (double[]) fVar.f3845g;
        if (aVar != null) {
            aVar.a0(f8, dArr);
        } else {
            dArr[0] = ((float[]) fVar.f3842d)[0];
            dArr[1] = ((float[]) fVar.f3843e)[0];
            dArr[2] = ((float[]) fVar.f3840b)[0];
        }
        double[] dArr2 = (double[]) fVar.f3845g;
        double d4 = dArr2[0];
        double d10 = dArr2[1];
        d5.j jVar = (d5.j) fVar.f3839a;
        double d11 = f8;
        jVar.getClass();
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            c4 = 2;
        } else if (d11 >= 1.0d) {
            c4 = 2;
            d12 = 1.0d;
        } else {
            int binarySearch = Arrays.binarySearch((double[]) jVar.f3862d, d11);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            float[] fArr = (float[]) jVar.f3861c;
            float f10 = fArr[binarySearch];
            int i2 = binarySearch - 1;
            float f11 = fArr[i2];
            c4 = 2;
            double[] dArr3 = (double[]) jVar.f3862d;
            double d13 = dArr3[binarySearch];
            double d14 = dArr3[i2];
            double d15 = (f10 - f11) / (d13 - d14);
            d12 = ((((d11 * d11) - (d14 * d14)) * d15) / 2.0d) + ((d11 - d14) * (f11 - (d15 * d14))) + ((double[]) jVar.f3863e)[i2];
        }
        double d16 = d12 + d10;
        switch (jVar.f3860b) {
            case DSiCameraSource.FrontCamera /* 1 */:
                signum = Math.signum(0.5d - (d16 % 1.0d));
                break;
            case 2:
                abs = Math.abs((((d16 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = 1.0d - abs;
                break;
            case 3:
                signum = (((d16 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                signum = 1.0d - (((d16 * 2.0d) + 1.0d) % 2.0d);
                break;
            case l1.c.f8511g /* 5 */:
                signum = Math.cos((d10 + d16) * 6.283185307179586d);
                break;
            case l1.c.f8509e /* 6 */:
                double abs2 = 1.0d - Math.abs(((d16 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = 1.0d - abs;
                break;
            case 7:
                signum = ((d5.i) jVar.f3864f).Z(d16 % 1.0d);
                break;
            default:
                signum = Math.sin(6.283185307179586d * d16);
                break;
        }
        return (float) ((signum * ((double[]) fVar.f3845g)[c4]) + d4);
    }

    public abstract void d(View view, float f8);

    /* JADX WARN: Type inference failed for: r10v0, types: [d5.f, java.lang.Object] */
    public final void e() {
        int i2;
        int i10;
        int i11;
        int i12;
        double d4;
        float[] fArr;
        float[] fArr2;
        int i13;
        ArrayList arrayList = this.f5574f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new b0(2));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance(cls, size, 3);
        int i14 = this.f5571c;
        String str = this.f5572d;
        ?? obj = new Object();
        d5.j jVar = new d5.j();
        jVar.f3861c = new float[0];
        jVar.f3862d = new double[0];
        obj.f3839a = jVar;
        jVar.f3860b = i14;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i11 = 3;
            int indexOf = str.indexOf(40) + 1;
            i12 = 0;
            i10 = 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i15 = 0;
            d4 = 1.0d;
            while (indexOf2 != -1) {
                dArr3[i15] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i15++;
            }
            dArr3[i15] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr3, i15 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d10 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance(cls, length, 1);
            double[] dArr5 = new double[length];
            i2 = 2;
            int i16 = 0;
            while (i16 < copyOf.length) {
                double d11 = copyOf[i16];
                int i17 = i16 + length2;
                dArr4[i17][0] = d11;
                double d12 = d10;
                double d13 = i16 * d12;
                dArr5[i17] = d13;
                if (i16 > 0) {
                    int i18 = (length2 * 2) + i16;
                    dArr4[i18][0] = d11 + 1.0d;
                    dArr5[i18] = d13 + 1.0d;
                    int i19 = i16 - 1;
                    dArr4[i19][0] = (d11 - 1.0d) - d12;
                    dArr5[i19] = (d13 - 1.0d) - d12;
                }
                i16++;
                d10 = d12;
            }
            jVar.f3864f = new d5.i(dArr5, dArr4);
        } else {
            i2 = 2;
            i10 = 1;
            i11 = 3;
            i12 = 0;
            d4 = 1.0d;
        }
        obj.f3840b = new float[size];
        obj.f3844f = new double[size];
        obj.f3841c = new float[size];
        obj.f3842d = new float[size];
        obj.f3843e = new float[size];
        float[] fArr3 = new float[size];
        this.f5569a = obj;
        int i20 = i12;
        int i21 = i20;
        for (int size2 = arrayList.size(); i21 < size2; size2 = size2) {
            Object obj2 = arrayList.get(i21);
            i21++;
            d5.g gVar = (d5.g) obj2;
            float f8 = gVar.f3850d;
            dArr[i20] = f8 * 0.01d;
            double[] dArr6 = dArr2[i20];
            float f10 = gVar.f3848b;
            dArr6[i12] = f10;
            float f11 = gVar.f3849c;
            dArr6[i10] = f11;
            float f12 = gVar.f3851e;
            dArr6[i2] = f12;
            d5.f fVar = this.f5569a;
            ((double[]) fVar.f3844f)[i20] = gVar.f3847a / 100.0d;
            ((float[]) fVar.f3841c)[i20] = f8;
            ((float[]) fVar.f3842d)[i20] = f11;
            ((float[]) fVar.f3843e)[i20] = f12;
            ((float[]) fVar.f3840b)[i20] = f10;
            i20++;
            arrayList = arrayList;
        }
        d5.f fVar2 = this.f5569a;
        float[] fArr4 = (float[]) fVar2.f3841c;
        d5.j jVar2 = (d5.j) fVar2.f3839a;
        double[] dArr7 = (double[]) fVar2.f3844f;
        int length3 = dArr7.length;
        int i22 = i2;
        int[] iArr = new int[i22];
        iArr[i10] = i11;
        iArr[i12] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance(cls, iArr);
        float[] fArr5 = (float[]) fVar2.f3840b;
        fVar2.f3845g = new double[fArr5.length + i22];
        double[] dArr9 = new double[fArr5.length + i22];
        double d14 = 0.0d;
        if (dArr7[i12] > 0.0d) {
            jVar2.a(0.0d, fArr4[i12]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d4) {
            jVar2.a(d4, fArr4[length4]);
        }
        for (int i23 = i12; i23 < dArr8.length; i23++) {
            double[] dArr10 = dArr8[i23];
            dArr10[i12] = ((float[]) fVar2.f3842d)[i23];
            dArr10[i10] = ((float[]) fVar2.f3843e)[i23];
            dArr10[2] = fArr5[i23];
            jVar2.a(dArr7[i23], fArr4[i23]);
        }
        double d15 = 0.0d;
        int i24 = i12;
        while (true) {
            if (i24 >= ((float[]) jVar2.f3861c).length) {
                break;
            }
            d15 += fArr[i24];
            i24++;
        }
        double d16 = 0.0d;
        int i25 = i10;
        while (true) {
            float[] fArr6 = (float[]) jVar2.f3861c;
            if (i25 >= fArr6.length) {
                break;
            }
            int i26 = i25 - 1;
            float f13 = (fArr6[i26] + fArr6[i25]) / 2.0f;
            double d17 = d14;
            double[] dArr11 = (double[]) jVar2.f3862d;
            d16 = ((dArr11[i25] - dArr11[i26]) * f13) + d16;
            i25++;
            d14 = d17;
        }
        double d18 = d14;
        int i27 = i12;
        while (true) {
            float[] fArr7 = (float[]) jVar2.f3861c;
            if (i27 >= fArr7.length) {
                break;
            }
            fArr7[i27] = fArr7[i27] * ((float) (d15 / d16));
            i27++;
        }
        ((double[]) jVar2.f3863e)[i12] = d18;
        int i28 = i10;
        while (true) {
            if (i28 >= ((float[]) jVar2.f3861c).length) {
                break;
            }
            int i29 = i28 - 1;
            double[] dArr12 = (double[]) jVar2.f3862d;
            double d19 = dArr12[i28] - dArr12[i29];
            double[] dArr13 = (double[]) jVar2.f3863e;
            dArr13[i28] = (d19 * ((fArr2[i29] + fArr2[i28]) / 2.0f)) + dArr13[i29];
            i28++;
        }
        if (dArr7.length > i10) {
            i13 = i12;
            fVar2.f3846h = ij.a.O(i13, dArr7, dArr8);
        } else {
            i13 = i12;
            fVar2.f3846h = null;
        }
        ij.a.O(i13, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f5570b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        ArrayList arrayList = this.f5574f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d5.g gVar = (d5.g) obj;
            str = str + "[" + gVar.f3847a + " , " + decimalFormat.format(gVar.f3848b) + "] ";
        }
        return str;
    }

    public void c(i5.b bVar) {
    }
}
