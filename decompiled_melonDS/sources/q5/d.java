package q5;

import android.graphics.Path;
import android.util.Log;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public char f12288a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f12289b;

    public d(d dVar) {
        this.f12288a = dVar.f12288a;
        float[] fArr = dVar.f12289b;
        this.f12289b = p7.a.l(fArr, fArr.length);
    }

    public static void a(Path path, float f8, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d4;
        double d10;
        boolean z12;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f8;
        double d12 = f10;
        double d13 = f13;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f14;
        double d16 = ((d12 * cos) + ((-f8) * sin)) / d15;
        double d17 = f12;
        double d18 = ((d17 * sin) + (f11 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f11) * sin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f8, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z10 == z11) {
            d4 = d22 - d27;
            d10 = d23 + d26;
        } else {
            d4 = d22 + d27;
            d10 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d10, d14 - d4);
        double atan22 = Math.atan2(d19 - d10, d18 - d4) - atan2;
        int i2 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (i2 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            if (i2 > 0) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d28 = d4 * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = -d13;
        double d33 = d32 * cos2;
        double d34 = d15 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d15 * cos2;
        double d38 = atan22 / ceil;
        double d39 = (cos3 * d37) + (sin3 * d36);
        double d40 = d11;
        double d41 = d12;
        int i10 = 0;
        double d42 = atan2;
        while (i10 < ceil) {
            double d43 = d42 + d38;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            int i11 = ceil;
            double d44 = (((d13 * cos2) * cos4) + d30) - (d34 * sin4);
            double d45 = (d37 * sin4) + (d13 * sin2 * cos4) + d31;
            double d46 = (d33 * sin4) - (d34 * cos4);
            double d47 = (cos4 * d37) + (sin4 * d36);
            double d48 = d43 - d42;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            double d49 = (d39 * sqrt3) + d41;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d40), (float) d49, (float) (d44 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d44, (float) d45);
            i10++;
            d41 = d45;
            cos2 = cos2;
            d36 = d36;
            d42 = d43;
            d39 = d47;
            d40 = d44;
            ceil = i11;
            d35 = d46;
            d38 = d38;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i2;
        float[] fArr;
        int i10;
        d dVar;
        int i11;
        char c4;
        boolean z10;
        boolean z11;
        float f8;
        float f10;
        d dVar2;
        boolean z12;
        boolean z13;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i12 = 0;
        int i13 = 0;
        char c10 = 'm';
        while (i13 < length) {
            d dVar3 = dVarArr2[i13];
            char c11 = dVar3.f12288a;
            float[] fArr3 = dVar3.f12289b;
            float f19 = fArr2[i12];
            float f20 = fArr2[1];
            float f21 = fArr2[2];
            float f22 = fArr2[3];
            float f23 = fArr2[4];
            int i14 = i12;
            float f24 = fArr2[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                default:
                    i2 = 2;
                    break;
            }
            float f25 = f23;
            float f26 = f24;
            float f27 = f19;
            float f28 = f20;
            int i15 = i14;
            while (i15 < fArr3.length) {
                if (c11 != 'A') {
                    if (c11 != 'C') {
                        if (c11 != 'H') {
                            if (c11 != 'Q') {
                                if (c11 != 'V') {
                                    if (c11 != 'a') {
                                        if (c11 != 'c') {
                                            if (c11 != 'h') {
                                                if (c11 != 'q') {
                                                    if (c11 != 'v') {
                                                        if (c11 != 'L') {
                                                            if (c11 != 'M') {
                                                                if (c11 != 'S') {
                                                                    if (c11 != 'T') {
                                                                        if (c11 != 'l') {
                                                                            if (c11 != 'm') {
                                                                                if (c11 != 's') {
                                                                                    if (c11 != 't') {
                                                                                        fArr = fArr3;
                                                                                        i10 = i15;
                                                                                        dVar = dVar3;
                                                                                        f10 = f27;
                                                                                    } else {
                                                                                        if (c10 != 'q' && c10 != 't' && c10 != 'Q' && c10 != 'T') {
                                                                                            f18 = 0.0f;
                                                                                            f17 = 0.0f;
                                                                                        } else {
                                                                                            f17 = f27 - f21;
                                                                                            f18 = f28 - f22;
                                                                                        }
                                                                                        int i16 = i15 + 1;
                                                                                        path2.rQuadTo(f17, f18, fArr3[i15], fArr3[i16]);
                                                                                        float f29 = f17 + f27;
                                                                                        float f30 = f18 + f28;
                                                                                        float f31 = f27 + fArr3[i15];
                                                                                        f28 += fArr3[i16];
                                                                                        f22 = f30;
                                                                                        fArr = fArr3;
                                                                                        i10 = i15;
                                                                                        dVar = dVar3;
                                                                                        f10 = f31;
                                                                                        f21 = f29;
                                                                                    }
                                                                                    f8 = f28;
                                                                                } else {
                                                                                    if (c10 != 'c' && c10 != 's' && c10 != 'C' && c10 != 'S') {
                                                                                        f16 = 0.0f;
                                                                                        f15 = 0.0f;
                                                                                    } else {
                                                                                        f15 = f28 - f22;
                                                                                        f16 = f27 - f21;
                                                                                    }
                                                                                    int i17 = i15;
                                                                                    int i18 = i17 + 1;
                                                                                    int i19 = i17 + 2;
                                                                                    int i20 = i17 + 3;
                                                                                    fArr = fArr3;
                                                                                    i10 = i17;
                                                                                    path2.rCubicTo(f16, f15, fArr3[i17], fArr3[i18], fArr3[i19], fArr3[i20]);
                                                                                    f11 = fArr[i10] + f27;
                                                                                    f12 = fArr[i18] + f28;
                                                                                    f27 += fArr[i19];
                                                                                    f13 = fArr[i20];
                                                                                }
                                                                            } else {
                                                                                fArr = fArr3;
                                                                                i10 = i15;
                                                                                float f32 = fArr[i10];
                                                                                f27 += f32;
                                                                                float f33 = fArr[i10 + 1];
                                                                                f28 += f33;
                                                                                if (i10 > 0) {
                                                                                    path2.rLineTo(f32, f33);
                                                                                } else {
                                                                                    path2.rMoveTo(f32, f33);
                                                                                    dVar = dVar3;
                                                                                    f10 = f27;
                                                                                    f25 = f10;
                                                                                    f8 = f28;
                                                                                    f26 = f8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            fArr = fArr3;
                                                                            i10 = i15;
                                                                            int i21 = i10 + 1;
                                                                            path2.rLineTo(fArr[i10], fArr[i21]);
                                                                            f27 += fArr[i10];
                                                                            f14 = fArr[i21];
                                                                        }
                                                                    } else {
                                                                        fArr = fArr3;
                                                                        i10 = i15;
                                                                        if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                                            f27 = (f27 * 2.0f) - f21;
                                                                            f28 = (f28 * 2.0f) - f22;
                                                                        }
                                                                        int i22 = i10 + 1;
                                                                        path2.quadTo(f27, f28, fArr[i10], fArr[i22]);
                                                                        f10 = fArr[i10];
                                                                        f8 = fArr[i22];
                                                                        dVar = dVar3;
                                                                        f21 = f27;
                                                                        f22 = f28;
                                                                    }
                                                                    i11 = i13;
                                                                    c4 = c11;
                                                                } else {
                                                                    fArr = fArr3;
                                                                    i10 = i15;
                                                                    if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                                        f27 = (f27 * 2.0f) - f21;
                                                                        f28 = (f28 * 2.0f) - f22;
                                                                    }
                                                                    float f34 = f27;
                                                                    float f35 = f28;
                                                                    int i23 = i10 + 1;
                                                                    int i24 = i10 + 2;
                                                                    int i25 = i10 + 3;
                                                                    path2.cubicTo(f34, f35, fArr[i10], fArr[i23], fArr[i24], fArr[i25]);
                                                                    float f36 = fArr[i10];
                                                                    f21 = f36;
                                                                    f22 = fArr[i23];
                                                                    f10 = fArr[i24];
                                                                    f8 = fArr[i25];
                                                                }
                                                            } else {
                                                                fArr = fArr3;
                                                                i10 = i15;
                                                                f10 = fArr[i10];
                                                                f8 = fArr[i10 + 1];
                                                                if (i10 > 0) {
                                                                    path2.lineTo(f10, f8);
                                                                } else {
                                                                    path2.moveTo(f10, f8);
                                                                    f25 = f10;
                                                                    f26 = f8;
                                                                }
                                                            }
                                                        } else {
                                                            fArr = fArr3;
                                                            i10 = i15;
                                                            int i26 = i10 + 1;
                                                            path2.lineTo(fArr[i10], fArr[i26]);
                                                            f10 = fArr[i10];
                                                            f8 = fArr[i26];
                                                        }
                                                        i11 = i13;
                                                        dVar = dVar3;
                                                        c4 = c11;
                                                    } else {
                                                        fArr = fArr3;
                                                        i10 = i15;
                                                        path2.rLineTo(0.0f, fArr[i10]);
                                                        f14 = fArr[i10];
                                                    }
                                                    f28 += f14;
                                                } else {
                                                    fArr = fArr3;
                                                    i10 = i15;
                                                    int i27 = i10 + 1;
                                                    int i28 = i10 + 2;
                                                    int i29 = i10 + 3;
                                                    path2.rQuadTo(fArr[i10], fArr[i27], fArr[i28], fArr[i29]);
                                                    f11 = fArr[i10] + f27;
                                                    f12 = fArr[i27] + f28;
                                                    f27 += fArr[i28];
                                                    f13 = fArr[i29];
                                                }
                                                f28 += f13;
                                                f21 = f11;
                                                f22 = f12;
                                            } else {
                                                fArr = fArr3;
                                                i10 = i15;
                                                path2.rLineTo(fArr[i10], 0.0f);
                                                f27 += fArr[i10];
                                            }
                                        } else {
                                            fArr = fArr3;
                                            i10 = i15;
                                            int i30 = i10 + 2;
                                            int i31 = i10 + 3;
                                            int i32 = i10 + 4;
                                            int i33 = i10 + 5;
                                            path2.rCubicTo(fArr[i10], fArr[i10 + 1], fArr[i30], fArr[i31], fArr[i32], fArr[i33]);
                                            float f37 = fArr[i30] + f27;
                                            float f38 = fArr[i31] + f28;
                                            f27 += fArr[i32];
                                            f28 += fArr[i33];
                                            f21 = f37;
                                            f22 = f38;
                                        }
                                        dVar = dVar3;
                                        f10 = f27;
                                        f8 = f28;
                                        i11 = i13;
                                        c4 = c11;
                                    } else {
                                        fArr = fArr3;
                                        i10 = i15;
                                        int i34 = i10 + 5;
                                        float f39 = fArr[i34] + f27;
                                        int i35 = i10 + 6;
                                        float f40 = fArr[i35] + f28;
                                        float f41 = fArr[i10];
                                        float f42 = fArr[i10 + 1];
                                        float f43 = fArr[i10 + 2];
                                        if (fArr[i10 + 3] != 0.0f) {
                                            dVar2 = dVar3;
                                            z12 = 1;
                                        } else {
                                            dVar2 = dVar3;
                                            z12 = i14;
                                        }
                                        dVar = dVar2;
                                        float f44 = f27;
                                        c4 = c11;
                                        if (fArr[i10 + 4] != 0.0f) {
                                            z13 = 1;
                                        } else {
                                            z13 = i14;
                                        }
                                        float f45 = f28;
                                        i11 = i13;
                                        a(path, f44, f45, f39, f40, f41, f42, f43, z12, z13);
                                        f10 = f44 + fArr[i34];
                                        f8 = f45 + fArr[i35];
                                        f21 = f10;
                                        f22 = f8;
                                    }
                                } else {
                                    fArr = fArr3;
                                    i10 = i15;
                                    i11 = i13;
                                    dVar = dVar3;
                                    f10 = f27;
                                    c4 = c11;
                                    path2.lineTo(f10, fArr[i10]);
                                    f8 = fArr[i10];
                                }
                            } else {
                                fArr = fArr3;
                                i10 = i15;
                                i11 = i13;
                                dVar = dVar3;
                                c4 = c11;
                                int i36 = i10 + 1;
                                int i37 = i10 + 2;
                                int i38 = i10 + 3;
                                path2.quadTo(fArr[i10], fArr[i36], fArr[i37], fArr[i38]);
                                float f46 = fArr[i10];
                                float f47 = fArr[i36];
                                float f48 = fArr[i37];
                                float f49 = fArr[i38];
                                f21 = f46;
                                f22 = f47;
                                f10 = f48;
                                f8 = f49;
                            }
                        } else {
                            fArr = fArr3;
                            i10 = i15;
                            dVar = dVar3;
                            c4 = c11;
                            f8 = f28;
                            i11 = i13;
                            path2.lineTo(fArr[i10], f8);
                            f10 = fArr[i10];
                        }
                    } else {
                        fArr = fArr3;
                        i10 = i15;
                        i11 = i13;
                        dVar = dVar3;
                        c4 = c11;
                        int i39 = i10 + 2;
                        int i40 = i10 + 3;
                        int i41 = i10 + 4;
                        int i42 = i10 + 5;
                        path2.cubicTo(fArr[i10], fArr[i10 + 1], fArr[i39], fArr[i40], fArr[i41], fArr[i42]);
                        float f50 = fArr[i41];
                        float f51 = fArr[i42];
                        f21 = fArr[i39];
                        f22 = fArr[i40];
                        f8 = f51;
                        f10 = f50;
                    }
                } else {
                    fArr = fArr3;
                    i10 = i15;
                    dVar = dVar3;
                    float f52 = f27;
                    float f53 = f28;
                    i11 = i13;
                    c4 = c11;
                    int i43 = i10 + 5;
                    float f54 = fArr[i43];
                    int i44 = i10 + 6;
                    float f55 = fArr[i44];
                    float f56 = fArr[i10];
                    float f57 = fArr[i10 + 1];
                    float f58 = fArr[i10 + 2];
                    if (fArr[i10 + 3] != 0.0f) {
                        z10 = 1;
                    } else {
                        z10 = i14;
                    }
                    if (fArr[i10 + 4] != 0.0f) {
                        z11 = 1;
                    } else {
                        z11 = i14;
                    }
                    a(path, f52, f53, f54, f55, f56, f57, f58, z10, z11);
                    f21 = fArr[i43];
                    f8 = fArr[i44];
                    f22 = f8;
                    f10 = f21;
                }
                i15 = i10 + i2;
                path2 = path;
                dVar3 = dVar;
                c11 = c4;
                i13 = i11;
                f27 = f10;
                f28 = f8;
                c10 = c11;
                fArr3 = fArr;
            }
            fArr2[i14] = f27;
            fArr2[1] = f28;
            fArr2[2] = f21;
            fArr2[3] = f22;
            fArr2[4] = f25;
            fArr2[5] = f26;
            c10 = dVar3.f12288a;
            i13++;
            dVarArr2 = dVarArr;
            path2 = path;
            i12 = i14;
        }
    }

    public d(char c4, float[] fArr) {
        this.f12288a = c4;
        this.f12289b = fArr;
    }
}
