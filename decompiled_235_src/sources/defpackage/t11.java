package defpackage;

import android.util.Log;
import com.github.junrar.unpack.decode.Compress;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t11  reason: default package */
/* loaded from: classes.dex */
public final class t11 {
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

    public final void e(u11 u11Var) {
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
                                                                                                            u11Var.e.Q = i3;
                                                                                                            continue;
                                                                                                        case 12:
                                                                                                            u11Var.e.R = i3;
                                                                                                            continue;
                                                                                                        case 13:
                                                                                                            u11Var.e.N = i3;
                                                                                                            continue;
                                                                                                        case 14:
                                                                                                            u11Var.e.P = i3;
                                                                                                            continue;
                                                                                                        case 15:
                                                                                                            u11Var.e.S = i3;
                                                                                                            continue;
                                                                                                        case 16:
                                                                                                            u11Var.e.O = i3;
                                                                                                            continue;
                                                                                                        case 17:
                                                                                                            u11Var.e.e = i3;
                                                                                                            continue;
                                                                                                        case 18:
                                                                                                            u11Var.e.f = i3;
                                                                                                            continue;
                                                                                                        default:
                                                                                                            switch (i2) {
                                                                                                                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                                                                                                    u11Var.e.d = i3;
                                                                                                                    continue;
                                                                                                                case 22:
                                                                                                                    u11Var.c.b = i3;
                                                                                                                    continue;
                                                                                                                case ConnectionResult.API_DISABLED /* 23 */:
                                                                                                                    u11Var.e.c = i3;
                                                                                                                    continue;
                                                                                                                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                                                                                                    u11Var.e.G = i3;
                                                                                                                    continue;
                                                                                                                default:
                                                                                                                    switch (i2) {
                                                                                                                        case 54:
                                                                                                                            u11Var.e.Y = i3;
                                                                                                                            continue;
                                                                                                                        case 55:
                                                                                                                            u11Var.e.Z = i3;
                                                                                                                            continue;
                                                                                                                        case 56:
                                                                                                                            u11Var.e.a0 = i3;
                                                                                                                            continue;
                                                                                                                        case 57:
                                                                                                                            u11Var.e.b0 = i3;
                                                                                                                            continue;
                                                                                                                        case 58:
                                                                                                                            u11Var.e.c0 = i3;
                                                                                                                            continue;
                                                                                                                        case 59:
                                                                                                                            u11Var.e.d0 = i3;
                                                                                                                            continue;
                                                                                                                        default:
                                                                                                                            switch (i2) {
                                                                                                                                case 82:
                                                                                                                                    u11Var.d.c = i3;
                                                                                                                                    continue;
                                                                                                                                case 83:
                                                                                                                                    u11Var.f.i = i3;
                                                                                                                                    continue;
                                                                                                                                case 84:
                                                                                                                                    u11Var.d.j = i3;
                                                                                                                                    continue;
                                                                                                                                default:
                                                                                                                                    switch (i2) {
                                                                                                                                        case 87:
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                            continue;
                                                                                                                                        case 88:
                                                                                                                                            u11Var.d.l = i3;
                                                                                                                                            continue;
                                                                                                                                        case 89:
                                                                                                                                            u11Var.d.m = i3;
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
                                                                                                    u11Var.e.T = i3;
                                                                                                }
                                                                                            } else {
                                                                                                u11Var.e.M = i3;
                                                                                            }
                                                                                        } else {
                                                                                            u11Var.e.p0 = i3;
                                                                                        }
                                                                                    } else {
                                                                                        u11Var.c.c = i3;
                                                                                    }
                                                                                } else {
                                                                                    u11Var.d.e = i3;
                                                                                }
                                                                            } else {
                                                                                u11Var.d.f = i3;
                                                                            }
                                                                        } else {
                                                                            u11Var.d.b = i3;
                                                                        }
                                                                    } else {
                                                                        u11Var.a = i3;
                                                                    }
                                                                } else {
                                                                    u11Var.e.I = i3;
                                                                }
                                                            } else {
                                                                u11Var.e.L = i3;
                                                            }
                                                        } else {
                                                            u11Var.e.J = i3;
                                                        }
                                                    } else {
                                                        u11Var.e.h0 = i3;
                                                    }
                                                } else {
                                                    u11Var.e.g0 = i3;
                                                }
                                            } else {
                                                u11Var.e.B = i3;
                                            }
                                        } else {
                                            u11Var.e.A = i3;
                                        }
                                    } else {
                                        u11Var.e.X = i3;
                                    }
                                } else {
                                    u11Var.e.W = i3;
                                }
                            } else {
                                u11Var.e.H = i3;
                            }
                        } else {
                            u11Var.e.F = i3;
                        }
                    } else {
                        u11Var.e.K = i3;
                    }
                } else {
                    u11Var.e.E = i3;
                }
            } else {
                u11Var.e.D = i3;
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
                                                            u11Var.c.d = f;
                                                            continue;
                                                        case 44:
                                                            y11 y11Var = u11Var.f;
                                                            y11Var.n = f;
                                                            y11Var.m = true;
                                                            continue;
                                                        case 45:
                                                            u11Var.f.c = f;
                                                            continue;
                                                        case 46:
                                                            u11Var.f.d = f;
                                                            continue;
                                                        case 47:
                                                            u11Var.f.e = f;
                                                            continue;
                                                        case Compress.DC20 /* 48 */:
                                                            u11Var.f.f = f;
                                                            continue;
                                                        case 49:
                                                            u11Var.f.g = f;
                                                            continue;
                                                        case 50:
                                                            u11Var.f.h = f;
                                                            continue;
                                                        case 51:
                                                            u11Var.f.j = f;
                                                            continue;
                                                        case 52:
                                                            u11Var.f.k = f;
                                                            continue;
                                                        case 53:
                                                            u11Var.f.l = f;
                                                            continue;
                                                        default:
                                                            switch (i5) {
                                                                case 67:
                                                                    u11Var.d.h = f;
                                                                    continue;
                                                                case 68:
                                                                    u11Var.c.e = f;
                                                                    continue;
                                                                case 69:
                                                                    u11Var.e.e0 = f;
                                                                    continue;
                                                                case 70:
                                                                    u11Var.e.f0 = f;
                                                                    continue;
                                                                default:
                                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                    continue;
                                                                    continue;
                                                            }
                                                    }
                                                } else {
                                                    u11Var.e.U = f;
                                                }
                                            } else {
                                                u11Var.e.V = f;
                                            }
                                        }
                                    } else {
                                        u11Var.d.i = f;
                                    }
                                } else {
                                    u11Var.d.g = f;
                                }
                            } else {
                                u11Var.e.C = f;
                            }
                        } else {
                            u11Var.f.b = f;
                        }
                    } else {
                        u11Var.e.y = f;
                    }
                } else {
                    u11Var.e.x = f;
                }
            } else {
                u11Var.e.g = f;
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
                                    u11Var.d.k = str;
                                }
                            }
                        } else {
                            u11Var.e.l0 = str;
                        }
                    } else {
                        v11 v11Var = u11Var.e;
                        v11Var.k0 = str;
                        v11Var.j0 = null;
                    }
                } else {
                    u11Var.d.d = str;
                }
            } else {
                u11Var.e.z = str;
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
                                u11Var.e.n0 = z;
                            }
                        } else {
                            u11Var.e.m0 = z;
                        }
                    }
                } else {
                    u11Var.e.o0 = z;
                }
            } else {
                u11Var.f.m = z;
            }
        }
    }
}
