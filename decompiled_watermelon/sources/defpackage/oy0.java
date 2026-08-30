package defpackage;

import android.util.Log;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oy0  reason: default package */
/* loaded from: classes.dex */
public final class oy0 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int i, float f) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public final void e(py0 py0Var) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.a[i];
            int i3 = this.b[i];
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        if (i2 != 27) {
                            if (i2 != 28) {
                                if (i2 != 41) {
                                    if (i2 != 42) {
                                        if (i2 != 61) {
                                            if (i2 != 62) {
                                                if (i2 != 72) {
                                                    if (i2 != 73) {
                                                        if (i2 != 2) {
                                                            if (i2 != 31) {
                                                                if (i2 != 34) {
                                                                    if (i2 != 38) {
                                                                        if (i2 != 64) {
                                                                            if (i2 != 66) {
                                                                                if (i2 != 76) {
                                                                                    if (i2 != 78) {
                                                                                        if (i2 != 97) {
                                                                                            if (i2 != 93) {
                                                                                                if (i2 != 94) {
                                                                                                    switch (i2) {
                                                                                                        case 11:
                                                                                                            py0Var.e.Q = i3;
                                                                                                            continue;
                                                                                                        case mj2.L /* 12 */:
                                                                                                            py0Var.e.R = i3;
                                                                                                            continue;
                                                                                                        case 13:
                                                                                                            py0Var.e.N = i3;
                                                                                                            continue;
                                                                                                        case 14:
                                                                                                            py0Var.e.P = i3;
                                                                                                            continue;
                                                                                                        case ig7.e /* 15 */:
                                                                                                            py0Var.e.S = i3;
                                                                                                            continue;
                                                                                                        case 16:
                                                                                                            py0Var.e.O = i3;
                                                                                                            continue;
                                                                                                        case 17:
                                                                                                            py0Var.e.e = i3;
                                                                                                            continue;
                                                                                                        case 18:
                                                                                                            py0Var.e.f = i3;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            switch (i2) {
                                                                                                                case 21:
                                                                                                                    py0Var.e.d = i3;
                                                                                                                    continue;
                                                                                                                case 22:
                                                                                                                    py0Var.c.b = i3;
                                                                                                                    continue;
                                                                                                                case 23:
                                                                                                                    py0Var.e.c = i3;
                                                                                                                    continue;
                                                                                                                case 24:
                                                                                                                    py0Var.e.G = i3;
                                                                                                                    continue;
                                                                                                                default:
                                                                                                                    switch (i2) {
                                                                                                                        case 54:
                                                                                                                            py0Var.e.Y = i3;
                                                                                                                            continue;
                                                                                                                        case 55:
                                                                                                                            py0Var.e.Z = i3;
                                                                                                                            continue;
                                                                                                                        case 56:
                                                                                                                            py0Var.e.a0 = i3;
                                                                                                                            continue;
                                                                                                                        case 57:
                                                                                                                            py0Var.e.b0 = i3;
                                                                                                                            continue;
                                                                                                                        case 58:
                                                                                                                            py0Var.e.c0 = i3;
                                                                                                                            continue;
                                                                                                                        case 59:
                                                                                                                            py0Var.e.d0 = i3;
                                                                                                                            continue;
                                                                                                                        default:
                                                                                                                            switch (i2) {
                                                                                                                                case 82:
                                                                                                                                    py0Var.d.c = i3;
                                                                                                                                    continue;
                                                                                                                                case 83:
                                                                                                                                    py0Var.f.i = i3;
                                                                                                                                    continue;
                                                                                                                                case 84:
                                                                                                                                    py0Var.d.j = i3;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    switch (i2) {
                                                                                                                                        case 87:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case 88:
                                                                                                                                            py0Var.d.l = i3;
                                                                                                                                            continue;
                                                                                                                                        case 89:
                                                                                                                                            py0Var.d.m = i3;
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
                                                                                                    py0Var.e.T = i3;
                                                                                                }
                                                                                            } else {
                                                                                                py0Var.e.M = i3;
                                                                                            }
                                                                                        } else {
                                                                                            py0Var.e.p0 = i3;
                                                                                        }
                                                                                    } else {
                                                                                        py0Var.c.c = i3;
                                                                                    }
                                                                                } else {
                                                                                    py0Var.d.e = i3;
                                                                                }
                                                                            } else {
                                                                                py0Var.d.f = i3;
                                                                            }
                                                                        } else {
                                                                            py0Var.d.b = i3;
                                                                        }
                                                                    } else {
                                                                        py0Var.a = i3;
                                                                    }
                                                                } else {
                                                                    py0Var.e.I = i3;
                                                                }
                                                            } else {
                                                                py0Var.e.L = i3;
                                                            }
                                                        } else {
                                                            py0Var.e.J = i3;
                                                        }
                                                    } else {
                                                        py0Var.e.h0 = i3;
                                                    }
                                                } else {
                                                    py0Var.e.g0 = i3;
                                                }
                                            } else {
                                                py0Var.e.B = i3;
                                            }
                                        } else {
                                            py0Var.e.A = i3;
                                        }
                                    } else {
                                        py0Var.e.X = i3;
                                    }
                                } else {
                                    py0Var.e.W = i3;
                                }
                            } else {
                                py0Var.e.H = i3;
                            }
                        } else {
                            py0Var.e.F = i3;
                        }
                    } else {
                        py0Var.e.K = i3;
                    }
                } else {
                    py0Var.e.E = i3;
                }
            } else {
                py0Var.e.D = i3;
            }
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            int i5 = this.d[i4];
            float f = this.e[i4];
            if (i5 != 19) {
                if (i5 != 20) {
                    if (i5 != 37) {
                        if (i5 != 60) {
                            if (i5 != 63) {
                                if (i5 != 79) {
                                    if (i5 != 85) {
                                        if (i5 != 87) {
                                            if (i5 != 39) {
                                                if (i5 != 40) {
                                                    switch (i5) {
                                                        case 43:
                                                            py0Var.c.d = f;
                                                            continue;
                                                        case 44:
                                                            ty0 ty0Var = py0Var.f;
                                                            ty0Var.n = f;
                                                            ty0Var.m = true;
                                                            continue;
                                                        case 45:
                                                            py0Var.f.c = f;
                                                            continue;
                                                        case 46:
                                                            py0Var.f.d = f;
                                                            continue;
                                                        case 47:
                                                            py0Var.f.e = f;
                                                            continue;
                                                        case 48:
                                                            py0Var.f.f = f;
                                                            continue;
                                                        case 49:
                                                            py0Var.f.g = f;
                                                            continue;
                                                        case 50:
                                                            py0Var.f.h = f;
                                                            continue;
                                                        case 51:
                                                            py0Var.f.j = f;
                                                            continue;
                                                        case 52:
                                                            py0Var.f.k = f;
                                                            continue;
                                                        case 53:
                                                            py0Var.f.l = f;
                                                            continue;
                                                        default:
                                                            switch (i5) {
                                                                case 67:
                                                                    py0Var.d.h = f;
                                                                    continue;
                                                                case 68:
                                                                    py0Var.c.e = f;
                                                                    continue;
                                                                case 69:
                                                                    py0Var.e.e0 = f;
                                                                    continue;
                                                                case 70:
                                                                    py0Var.e.f0 = f;
                                                                    continue;
                                                                default:
                                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                    continue;
                                                                    continue;
                                                            }
                                                    }
                                                } else {
                                                    py0Var.e.U = f;
                                                }
                                            } else {
                                                py0Var.e.V = f;
                                            }
                                        }
                                    } else {
                                        py0Var.d.i = f;
                                    }
                                } else {
                                    py0Var.d.g = f;
                                }
                            } else {
                                py0Var.e.C = f;
                            }
                        } else {
                            py0Var.f.b = f;
                        }
                    } else {
                        py0Var.e.y = f;
                    }
                } else {
                    py0Var.e.x = f;
                }
            } else {
                py0Var.e.g = f;
            }
        }
        for (int i6 = 0; i6 < this.i; i6++) {
            int i7 = this.g[i6];
            String str = this.h[i6];
            if (i7 != 5) {
                if (i7 != 65) {
                    if (i7 != 74) {
                        if (i7 != 77) {
                            if (i7 != 87) {
                                if (i7 != 90) {
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                } else {
                                    py0Var.d.k = str;
                                }
                            }
                        } else {
                            py0Var.e.l0 = str;
                        }
                    } else {
                        qy0 qy0Var = py0Var.e;
                        qy0Var.k0 = str;
                        qy0Var.j0 = null;
                    }
                } else {
                    py0Var.d.d = str;
                }
            } else {
                py0Var.e.z = str;
            }
        }
        for (int i8 = 0; i8 < this.l; i8++) {
            int i9 = this.j[i8];
            boolean z = this.k[i8];
            if (i9 != 44) {
                if (i9 != 75) {
                    if (i9 != 87) {
                        if (i9 != 80) {
                            if (i9 != 81) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                            } else {
                                py0Var.e.n0 = z;
                            }
                        } else {
                            py0Var.e.m0 = z;
                        }
                    }
                } else {
                    py0Var.e.o0 = z;
                }
            } else {
                py0Var.f.m = z;
            }
        }
    }
}
