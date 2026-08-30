package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s9  reason: default package */
/* loaded from: classes.dex */
public final class s9 {
    public static final s9 c = new s9(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public final /* synthetic */ int a = 1;
    public float[] b;

    public s9(float[] fArr) {
        this.b = fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList a(s9 s9Var, String str) {
        int i;
        char charAt;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char c2;
        long X;
        float intBitsToFloat;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && b53.E(str.charAt(i4), 32) <= 0) {
            i4++;
        }
        while (length > i4 && b53.E(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i5 = 0;
        while (i4 < length) {
            while (true) {
                i = i4 + 1;
                charAt = str.charAt(i4);
                int i6 = charAt | ' ';
                if ((i6 - 122) * (i6 - 97) > 0 || i6 == 101) {
                    if (i >= length) {
                        charAt = i3;
                    } else {
                        i4 = i;
                    }
                }
            }
            if (charAt != 0) {
                int i7 = charAt | ' ';
                if (i7 != 122) {
                    while (i < length && b53.E(str.charAt(i), 32) <= 0) {
                        i++;
                    }
                    if (i7 == 97) {
                        c2 = 1;
                    } else {
                        c2 = i3;
                    }
                    int i8 = i3;
                    do {
                        if (c2 != 0 && 3 <= i8 && i8 < 5) {
                            X = n40.X(i, Math.min(i + 1, length), str);
                        } else {
                            X = n40.X(i, length, str);
                        }
                        i = (int) (X >>> 32);
                        intBitsToFloat = Float.intBitsToFloat((int) (X & 4294967295L));
                        if (!Float.isNaN(intBitsToFloat)) {
                            float[] fArr = s9Var.b;
                            int i9 = i8 + 1;
                            fArr[i8] = intBitsToFloat;
                            if (i9 >= fArr.length) {
                                float[] fArr2 = new float[i9 * 2];
                                s9Var.b = fArr2;
                                System.arraycopy(fArr, i3, fArr2, i3, fArr.length);
                            }
                            i8 = i9;
                        }
                        while (i < length && (b53.E(str.charAt(i), 32) <= 0 || str.charAt(i) == ',')) {
                            i++;
                        }
                        if (i < length) {
                        }
                        i5 = i8;
                    } while (!Float.isNaN(intBitsToFloat));
                    i5 = i8;
                }
                float[] fArr3 = s9Var.b;
                int i10 = 2;
                switch (charAt) {
                    case 'A':
                        i2 = i3;
                        int i11 = i5 - 7;
                        for (int i12 = i2; i12 <= i11; i12 += 7) {
                            float f = fArr3[i12];
                            float f2 = fArr3[i12 + 1];
                            float f3 = fArr3[i12 + 2];
                            if (Float.compare(fArr3[i12 + 3], RecyclerView.A1) != 0) {
                                z = 1;
                            } else {
                                z = i2;
                            }
                            if (Float.compare(fArr3[i12 + 4], RecyclerView.A1) != 0) {
                                z2 = 1;
                            } else {
                                z2 = i2;
                            }
                            arrayList.add(new mk4(f, f2, f3, z, z2, fArr3[i12 + 5], fArr3[i12 + 6]));
                        }
                        break;
                    case 'C':
                        i2 = i3;
                        int i13 = i5 - 6;
                        for (int i14 = i2; i14 <= i13; i14 += 6) {
                            arrayList.add(new ok4(fArr3[i14], fArr3[i14 + 1], fArr3[i14 + 2], fArr3[i14 + 3], fArr3[i14 + 4], fArr3[i14 + 5]));
                        }
                        break;
                    case 'H':
                        i2 = i3;
                        int i15 = i5 - 1;
                        for (int i16 = i2; i16 <= i15; i16++) {
                            arrayList.add(new pk4(fArr3[i16]));
                        }
                        break;
                    case 'L':
                        i2 = i3;
                        int i17 = i5 - 2;
                        for (int i18 = i2; i18 <= i17; i18 += 2) {
                            arrayList.add(new qk4(fArr3[i18], fArr3[i18 + 1]));
                        }
                        break;
                    case 'M':
                        i2 = i3;
                        int i19 = i5 - 2;
                        if (i19 >= 0) {
                            arrayList.add(new rk4(fArr3[i2], fArr3[1]));
                            while (i10 <= i19) {
                                arrayList.add(new qk4(fArr3[i10], fArr3[i10 + 1]));
                                i10 += 2;
                            }
                            break;
                        }
                        break;
                    case 'Q':
                        i2 = i3;
                        int i20 = i5 - 4;
                        for (int i21 = i2; i21 <= i20; i21 += 4) {
                            arrayList.add(new sk4(fArr3[i21], fArr3[i21 + 1], fArr3[i21 + 2], fArr3[i21 + 3]));
                        }
                        break;
                    case 'S':
                        i2 = i3;
                        int i22 = i5 - 4;
                        for (int i23 = i2; i23 <= i22; i23 += 4) {
                            arrayList.add(new tk4(fArr3[i23], fArr3[i23 + 1], fArr3[i23 + 2], fArr3[i23 + 3]));
                        }
                        break;
                    case 'T':
                        i2 = i3;
                        int i24 = i5 - 2;
                        for (int i25 = i2; i25 <= i24; i25 += 2) {
                            arrayList.add(new uk4(fArr3[i25], fArr3[i25 + 1]));
                        }
                        break;
                    case 'V':
                        i2 = i3;
                        int i26 = i5 - 1;
                        for (int i27 = i2; i27 <= i26; i27++) {
                            arrayList.add(new el4(fArr3[i27]));
                        }
                        break;
                    case 'Z':
                    case 'z':
                        i2 = i3;
                        arrayList.add(nk4.c);
                        break;
                    case 'a':
                        int i28 = i5 - 7;
                        int i29 = i3;
                        while (i29 <= i28) {
                            float f4 = fArr3[i29];
                            float f5 = fArr3[i29 + 1];
                            float f6 = fArr3[i29 + 2];
                            char c3 = i3;
                            if (Float.compare(fArr3[i29 + 3], RecyclerView.A1) != 0) {
                                z3 = 1;
                            } else {
                                z3 = c3;
                            }
                            if (Float.compare(fArr3[i29 + 4], RecyclerView.A1) != 0) {
                                z4 = 1;
                            } else {
                                z4 = c3;
                            }
                            arrayList.add(new vk4(f4, f5, f6, z3, z4, fArr3[i29 + 5], fArr3[i29 + 6]));
                            i29 += 7;
                            i3 = c3;
                        }
                        i2 = i3;
                        break;
                    case 'c':
                        int i30 = i5 - 6;
                        for (int i31 = i3; i31 <= i30; i31 += 6) {
                            arrayList.add(new wk4(fArr3[i31], fArr3[i31 + 1], fArr3[i31 + 2], fArr3[i31 + 3], fArr3[i31 + 4], fArr3[i31 + 5]));
                        }
                        i2 = i3;
                        break;
                    case 'h':
                        int i32 = i5 - 1;
                        for (int i33 = i3; i33 <= i32; i33++) {
                            arrayList.add(new xk4(fArr3[i33]));
                        }
                        i2 = i3;
                        break;
                    case 'l':
                        int i34 = i5 - 2;
                        for (int i35 = i3; i35 <= i34; i35 += 2) {
                            arrayList.add(new yk4(fArr3[i35], fArr3[i35 + 1]));
                        }
                        i2 = i3;
                        break;
                    case 'm':
                        int i36 = i5 - 2;
                        if (i36 >= 0) {
                            arrayList.add(new zk4(fArr3[i3], fArr3[1]));
                            while (i10 <= i36) {
                                arrayList.add(new yk4(fArr3[i10], fArr3[i10 + 1]));
                                i10 += 2;
                            }
                        }
                        i2 = i3;
                        break;
                    case 'q':
                        int i37 = i5 - 4;
                        for (int i38 = i3; i38 <= i37; i38 += 4) {
                            arrayList.add(new al4(fArr3[i38], fArr3[i38 + 1], fArr3[i38 + 2], fArr3[i38 + 3]));
                        }
                        i2 = i3;
                        break;
                    case 's':
                        int i39 = i5 - 4;
                        for (int i40 = i3; i40 <= i39; i40 += 4) {
                            arrayList.add(new bl4(fArr3[i40], fArr3[i40 + 1], fArr3[i40 + 2], fArr3[i40 + 3]));
                        }
                        i2 = i3;
                        break;
                    case 't':
                        int i41 = i5 - 2;
                        for (int i42 = i3; i42 <= i41; i42 += 2) {
                            arrayList.add(new cl4(fArr3[i42], fArr3[i42 + 1]));
                        }
                        i2 = i3;
                        break;
                    case 'v':
                        int i43 = i5 - 1;
                        for (int i44 = i3; i44 <= i43; i44++) {
                            arrayList.add(new dl4(fArr3[i44]));
                        }
                        i2 = i3;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command for: " + charAt);
                }
                i4 = i;
                i3 = i2;
            } else {
                i4 = i;
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s9() {
    }
}
