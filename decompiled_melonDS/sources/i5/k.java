package i5;

import android.util.Log;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int[] f6890a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f6891b;

    /* renamed from: c  reason: collision with root package name */
    public int f6892c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f6893d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f6894e;

    /* renamed from: f  reason: collision with root package name */
    public int f6895f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f6896g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f6897h;

    /* renamed from: i  reason: collision with root package name */
    public int f6898i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6899j;

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f6900k;

    /* renamed from: l  reason: collision with root package name */
    public int f6901l;

    public final void a(int i2, float f8) {
        int i10 = this.f6895f;
        int[] iArr = this.f6893d;
        if (i10 >= iArr.length) {
            this.f6893d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f6894e;
            this.f6894e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f6893d;
        int i11 = this.f6895f;
        iArr2[i11] = i2;
        float[] fArr2 = this.f6894e;
        this.f6895f = i11 + 1;
        fArr2[i11] = f8;
    }

    public final void b(int i2, int i10) {
        int i11 = this.f6892c;
        int[] iArr = this.f6890a;
        if (i11 >= iArr.length) {
            this.f6890a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f6891b;
            this.f6891b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f6890a;
        int i12 = this.f6892c;
        iArr3[i12] = i2;
        int[] iArr4 = this.f6891b;
        this.f6892c = i12 + 1;
        iArr4[i12] = i10;
    }

    public final void c(int i2, String str) {
        int i10 = this.f6898i;
        int[] iArr = this.f6896g;
        if (i10 >= iArr.length) {
            this.f6896g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f6897h;
            this.f6897h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f6896g;
        int i11 = this.f6898i;
        iArr2[i11] = i2;
        String[] strArr2 = this.f6897h;
        this.f6898i = i11 + 1;
        strArr2[i11] = str;
    }

    public final void d(int i2, boolean z10) {
        int i10 = this.f6901l;
        int[] iArr = this.f6899j;
        if (i10 >= iArr.length) {
            this.f6899j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f6900k;
            this.f6900k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f6899j;
        int i11 = this.f6901l;
        iArr2[i11] = i2;
        boolean[] zArr2 = this.f6900k;
        this.f6901l = i11 + 1;
        zArr2[i11] = z10;
    }

    public final void e(l lVar) {
        for (int i2 = 0; i2 < this.f6892c; i2++) {
            int i10 = this.f6890a[i2];
            int i11 = this.f6891b[i2];
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        if (i10 != 27) {
                            if (i10 != 28) {
                                if (i10 != 41) {
                                    if (i10 != 42) {
                                        if (i10 != 61) {
                                            if (i10 != 62) {
                                                if (i10 != 72) {
                                                    if (i10 != 73) {
                                                        if (i10 != 2) {
                                                            if (i10 != 31) {
                                                                if (i10 != 34) {
                                                                    if (i10 != 38) {
                                                                        if (i10 != 64) {
                                                                            if (i10 != 66) {
                                                                                if (i10 != 76) {
                                                                                    if (i10 != 78) {
                                                                                        if (i10 != 97) {
                                                                                            if (i10 != 93) {
                                                                                                if (i10 != 94) {
                                                                                                    switch (i10) {
                                                                                                        case 11:
                                                                                                            lVar.f6906e.Q = i11;
                                                                                                            continue;
                                                                                                        case 12:
                                                                                                            lVar.f6906e.R = i11;
                                                                                                            continue;
                                                                                                        case 13:
                                                                                                            lVar.f6906e.N = i11;
                                                                                                            continue;
                                                                                                        case 14:
                                                                                                            lVar.f6906e.P = i11;
                                                                                                            continue;
                                                                                                        case l1.c.f8512h /* 15 */:
                                                                                                            lVar.f6906e.S = i11;
                                                                                                            continue;
                                                                                                        case 16:
                                                                                                            lVar.f6906e.O = i11;
                                                                                                            continue;
                                                                                                        case 17:
                                                                                                            lVar.f6906e.f6919e = i11;
                                                                                                            continue;
                                                                                                        case 18:
                                                                                                            lVar.f6906e.f6921f = i11;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            switch (i10) {
                                                                                                                case 21:
                                                                                                                    lVar.f6906e.f6917d = i11;
                                                                                                                    continue;
                                                                                                                case 22:
                                                                                                                    lVar.f6904c.f6965b = i11;
                                                                                                                    continue;
                                                                                                                case 23:
                                                                                                                    lVar.f6906e.f6915c = i11;
                                                                                                                    continue;
                                                                                                                case 24:
                                                                                                                    lVar.f6906e.G = i11;
                                                                                                                    continue;
                                                                                                                default:
                                                                                                                    switch (i10) {
                                                                                                                        case 54:
                                                                                                                            lVar.f6906e.Y = i11;
                                                                                                                            continue;
                                                                                                                        case 55:
                                                                                                                            lVar.f6906e.Z = i11;
                                                                                                                            continue;
                                                                                                                        case 56:
                                                                                                                            lVar.f6906e.f6912a0 = i11;
                                                                                                                            continue;
                                                                                                                        case 57:
                                                                                                                            lVar.f6906e.f6914b0 = i11;
                                                                                                                            continue;
                                                                                                                        case 58:
                                                                                                                            lVar.f6906e.f6916c0 = i11;
                                                                                                                            continue;
                                                                                                                        case 59:
                                                                                                                            lVar.f6906e.f6918d0 = i11;
                                                                                                                            continue;
                                                                                                                        default:
                                                                                                                            switch (i10) {
                                                                                                                                case 82:
                                                                                                                                    lVar.f6905d.f6954c = i11;
                                                                                                                                    continue;
                                                                                                                                case 83:
                                                                                                                                    lVar.f6907f.f6978i = i11;
                                                                                                                                    continue;
                                                                                                                                case 84:
                                                                                                                                    lVar.f6905d.f6961j = i11;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    switch (i10) {
                                                                                                                                        case 87:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case 88:
                                                                                                                                            lVar.f6905d.f6963l = i11;
                                                                                                                                            continue;
                                                                                                                                        case 89:
                                                                                                                                            lVar.f6905d.m = i11;
                                                                                                                                            continue;
                                                                                                                                        default:
                                                                                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                                                                            continue;
                                                                                                                                    }
                                                                                                                            }
                                                                                                                    }
                                                                                                            }
                                                                                                    }
                                                                                                } else {
                                                                                                    lVar.f6906e.T = i11;
                                                                                                }
                                                                                            } else {
                                                                                                lVar.f6906e.M = i11;
                                                                                            }
                                                                                        } else {
                                                                                            lVar.f6906e.p0 = i11;
                                                                                        }
                                                                                    } else {
                                                                                        lVar.f6904c.f6966c = i11;
                                                                                    }
                                                                                } else {
                                                                                    lVar.f6905d.f6956e = i11;
                                                                                }
                                                                            } else {
                                                                                lVar.f6905d.f6957f = i11;
                                                                            }
                                                                        } else {
                                                                            lVar.f6905d.f6953b = i11;
                                                                        }
                                                                    } else {
                                                                        lVar.f6902a = i11;
                                                                    }
                                                                } else {
                                                                    lVar.f6906e.I = i11;
                                                                }
                                                            } else {
                                                                lVar.f6906e.L = i11;
                                                            }
                                                        } else {
                                                            lVar.f6906e.J = i11;
                                                        }
                                                    } else {
                                                        lVar.f6906e.f6926h0 = i11;
                                                    }
                                                } else {
                                                    lVar.f6906e.f6924g0 = i11;
                                                }
                                            } else {
                                                lVar.f6906e.B = i11;
                                            }
                                        } else {
                                            lVar.f6906e.A = i11;
                                        }
                                    } else {
                                        lVar.f6906e.X = i11;
                                    }
                                } else {
                                    lVar.f6906e.W = i11;
                                }
                            } else {
                                lVar.f6906e.H = i11;
                            }
                        } else {
                            lVar.f6906e.F = i11;
                        }
                    } else {
                        lVar.f6906e.K = i11;
                    }
                } else {
                    lVar.f6906e.E = i11;
                }
            } else {
                lVar.f6906e.D = i11;
            }
        }
        for (int i12 = 0; i12 < this.f6895f; i12++) {
            int i13 = this.f6893d[i12];
            float f8 = this.f6894e[i12];
            if (i13 != 19) {
                if (i13 != 20) {
                    if (i13 != 37) {
                        if (i13 != 60) {
                            if (i13 != 63) {
                                if (i13 != 79) {
                                    if (i13 != 85) {
                                        if (i13 != 87) {
                                            if (i13 != 39) {
                                                if (i13 != 40) {
                                                    switch (i13) {
                                                        case 43:
                                                            lVar.f6904c.f6967d = f8;
                                                            continue;
                                                        case 44:
                                                            p pVar = lVar.f6907f;
                                                            pVar.f6982n = f8;
                                                            pVar.m = true;
                                                            continue;
                                                        case 45:
                                                            lVar.f6907f.f6972c = f8;
                                                            continue;
                                                        case 46:
                                                            lVar.f6907f.f6973d = f8;
                                                            continue;
                                                        case 47:
                                                            lVar.f6907f.f6974e = f8;
                                                            continue;
                                                        case 48:
                                                            lVar.f6907f.f6975f = f8;
                                                            continue;
                                                        case 49:
                                                            lVar.f6907f.f6976g = f8;
                                                            continue;
                                                        case 50:
                                                            lVar.f6907f.f6977h = f8;
                                                            continue;
                                                        case 51:
                                                            lVar.f6907f.f6979j = f8;
                                                            continue;
                                                        case 52:
                                                            lVar.f6907f.f6980k = f8;
                                                            continue;
                                                        case 53:
                                                            lVar.f6907f.f6981l = f8;
                                                            continue;
                                                        default:
                                                            switch (i13) {
                                                                case 67:
                                                                    lVar.f6905d.f6959h = f8;
                                                                    continue;
                                                                case 68:
                                                                    lVar.f6904c.f6968e = f8;
                                                                    continue;
                                                                case 69:
                                                                    lVar.f6906e.f6920e0 = f8;
                                                                    continue;
                                                                case 70:
                                                                    lVar.f6906e.f6922f0 = f8;
                                                                    continue;
                                                                default:
                                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                    continue;
                                                                    continue;
                                                            }
                                                    }
                                                } else {
                                                    lVar.f6906e.U = f8;
                                                }
                                            } else {
                                                lVar.f6906e.V = f8;
                                            }
                                        }
                                    } else {
                                        lVar.f6905d.f6960i = f8;
                                    }
                                } else {
                                    lVar.f6905d.f6958g = f8;
                                }
                            } else {
                                lVar.f6906e.C = f8;
                            }
                        } else {
                            lVar.f6907f.f6971b = f8;
                        }
                    } else {
                        lVar.f6906e.f6949y = f8;
                    }
                } else {
                    lVar.f6906e.f6948x = f8;
                }
            } else {
                lVar.f6906e.f6923g = f8;
            }
        }
        for (int i14 = 0; i14 < this.f6898i; i14++) {
            int i15 = this.f6896g[i14];
            String str = this.f6897h[i14];
            if (i15 != 5) {
                if (i15 != 65) {
                    if (i15 != 74) {
                        if (i15 != 77) {
                            if (i15 != 87) {
                                if (i15 != 90) {
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                } else {
                                    lVar.f6905d.f6962k = str;
                                }
                            }
                        } else {
                            lVar.f6906e.f6934l0 = str;
                        }
                    } else {
                        m mVar = lVar.f6906e;
                        mVar.f6932k0 = str;
                        mVar.f6930j0 = null;
                    }
                } else {
                    lVar.f6905d.f6955d = str;
                }
            } else {
                lVar.f6906e.f6950z = str;
            }
        }
        for (int i16 = 0; i16 < this.f6901l; i16++) {
            int i17 = this.f6899j[i16];
            boolean z10 = this.f6900k[i16];
            if (i17 != 44) {
                if (i17 != 75) {
                    if (i17 != 87) {
                        if (i17 != 80) {
                            if (i17 != 81) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                            } else {
                                lVar.f6906e.f6937n0 = z10;
                            }
                        } else {
                            lVar.f6906e.f6935m0 = z10;
                        }
                    }
                } else {
                    lVar.f6906e.f6939o0 = z10;
                }
            } else {
                lVar.f6907f.m = z10;
            }
        }
    }
}
