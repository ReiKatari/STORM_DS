package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.common.InputImage;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v11  reason: default package */
/* loaded from: classes.dex */
public final class v11 {
    public static final SparseIntArray q0;
    public int A;
    public int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public boolean b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public float e0;
    public int f;
    public float f0;
    public float g;
    public int g0;
    public boolean h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int[] j0;
    public int k;
    public String k0;
    public int l;
    public String l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public boolean o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public String z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void a(v11 v11Var) {
        this.a = v11Var.a;
        this.c = v11Var.c;
        this.b = v11Var.b;
        this.d = v11Var.d;
        this.e = v11Var.e;
        this.f = v11Var.f;
        this.g = v11Var.g;
        this.h = v11Var.h;
        this.i = v11Var.i;
        this.j = v11Var.j;
        this.k = v11Var.k;
        this.l = v11Var.l;
        this.m = v11Var.m;
        this.n = v11Var.n;
        this.o = v11Var.o;
        this.p = v11Var.p;
        this.q = v11Var.q;
        this.r = v11Var.r;
        this.s = v11Var.s;
        this.t = v11Var.t;
        this.u = v11Var.u;
        this.v = v11Var.v;
        this.w = v11Var.w;
        this.x = v11Var.x;
        this.y = v11Var.y;
        this.z = v11Var.z;
        this.A = v11Var.A;
        this.B = v11Var.B;
        this.C = v11Var.C;
        this.D = v11Var.D;
        this.E = v11Var.E;
        this.F = v11Var.F;
        this.G = v11Var.G;
        this.H = v11Var.H;
        this.I = v11Var.I;
        this.J = v11Var.J;
        this.K = v11Var.K;
        this.L = v11Var.L;
        this.M = v11Var.M;
        this.N = v11Var.N;
        this.O = v11Var.O;
        this.P = v11Var.P;
        this.Q = v11Var.Q;
        this.R = v11Var.R;
        this.S = v11Var.S;
        this.T = v11Var.T;
        this.U = v11Var.U;
        this.V = v11Var.V;
        this.W = v11Var.W;
        this.X = v11Var.X;
        this.Y = v11Var.Y;
        this.Z = v11Var.Z;
        this.a0 = v11Var.a0;
        this.b0 = v11Var.b0;
        this.c0 = v11Var.c0;
        this.d0 = v11Var.d0;
        this.e0 = v11Var.e0;
        this.f0 = v11Var.f0;
        this.g0 = v11Var.g0;
        this.h0 = v11Var.h0;
        this.i0 = v11Var.i0;
        this.l0 = v11Var.l0;
        int[] iArr = v11Var.j0;
        if (iArr != null && v11Var.k0 == null) {
            this.j0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            this.j0 = null;
        }
        this.k0 = v11Var.k0;
        this.m0 = v11Var.m0;
        this.n0 = v11Var.n0;
        this.o0 = v11Var.o0;
        this.p0 = v11Var.p0;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        SparseIntArray sparseIntArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.j);
        this.b = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = q0.get(index);
            switch (i2) {
                case 1:
                    this.q = z11.l(obtainStyledAttributes, index, this.q);
                    break;
                case 2:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 3:
                    this.p = z11.l(obtainStyledAttributes, index, this.p);
                    break;
                case 4:
                    this.o = z11.l(obtainStyledAttributes, index, this.o);
                    break;
                case 5:
                    this.z = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 7:
                    this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                    break;
                case 8:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 9:
                    this.w = z11.l(obtainStyledAttributes, index, this.w);
                    break;
                case 10:
                    this.v = z11.l(obtainStyledAttributes, index, this.v);
                    break;
                case 11:
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 12:
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 13:
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 14:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 15:
                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    break;
                case 16:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 17:
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 18:
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                    break;
                case 19:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 20:
                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                    break;
                case 22:
                    this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    this.i = z11.l(obtainStyledAttributes, index, this.i);
                    break;
                case 25:
                    this.j = z11.l(obtainStyledAttributes, index, this.j);
                    break;
                case SubAllocator.N4 /* 26 */:
                    this.F = obtainStyledAttributes.getInt(index, this.F);
                    break;
                case 27:
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case 28:
                    this.k = z11.l(obtainStyledAttributes, index, this.k);
                    break;
                case 29:
                    this.l = z11.l(obtainStyledAttributes, index, this.l);
                    break;
                case 30:
                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                    break;
                case 31:
                    this.t = z11.l(obtainStyledAttributes, index, this.t);
                    break;
                case 32:
                    this.u = z11.l(obtainStyledAttributes, index, this.u);
                    break;
                case 33:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 34:
                    this.n = z11.l(obtainStyledAttributes, index, this.n);
                    break;
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    this.m = z11.l(obtainStyledAttributes, index, this.m);
                    break;
                case 36:
                    this.y = obtainStyledAttributes.getFloat(index, this.y);
                    break;
                case 37:
                    this.V = obtainStyledAttributes.getFloat(index, this.V);
                    break;
                case SubAllocator.N_INDEXES /* 38 */:
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 39:
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                case 40:
                    this.X = obtainStyledAttributes.getInt(index, this.X);
                    break;
                case 41:
                    z11.m(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    z11.m(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.A = z11.l(obtainStyledAttributes, index, this.A);
                            continue;
                        case 62:
                            this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                            continue;
                        case 63:
                            this.C = obtainStyledAttributes.getFloat(index, this.C);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 70:
                                    this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                    continue;
                                case 73:
                                    this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                    continue;
                                case 74:
                                    this.k0 = obtainStyledAttributes.getString(index);
                                    continue;
                                case 75:
                                    this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                    continue;
                                case 76:
                                    this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                                    continue;
                                case 77:
                                    this.r = z11.l(obtainStyledAttributes, index, this.r);
                                    continue;
                                case 78:
                                    this.s = z11.l(obtainStyledAttributes, index, this.s);
                                    continue;
                                case 79:
                                    this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                    continue;
                                case 80:
                                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                    continue;
                                case 81:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    continue;
                                case 82:
                                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                    continue;
                                case 83:
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    continue;
                                case 84:
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    continue;
                                case 85:
                                    this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                    continue;
                                case 86:
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    continue;
                                case 87:
                                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                    continue;
                                case 88:
                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                    continue;
                                case 89:
                                    this.l0 = obtainStyledAttributes.getString(index);
                                    continue;
                                case 90:
                                    this.h = obtainStyledAttributes.getBoolean(index, this.h);
                                    continue;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    continue;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    continue;
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
