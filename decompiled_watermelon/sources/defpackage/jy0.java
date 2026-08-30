package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jy0  reason: default package */
/* loaded from: classes.dex */
public class jy0 extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public boolean d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public int k0;
    public int l;
    public float l0;
    public int m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public float o0;
    public int p;
    public gz0 p0;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public jy0() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = RecyclerView.A1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = 0.5f;
        this.F = 0.5f;
        this.G = null;
        this.H = -1.0f;
        this.I = -1.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = false;
        this.X = false;
        this.Y = null;
        this.Z = 0;
        this.a0 = true;
        this.b0 = true;
        this.c0 = false;
        this.d0 = false;
        this.e0 = false;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = Integer.MIN_VALUE;
        this.k0 = Integer.MIN_VALUE;
        this.l0 = 0.5f;
        this.p0 = new gz0();
    }

    public final void a() {
        this.d0 = false;
        this.a0 = true;
        this.b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.X) {
            this.b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.b0 = false;
            if (i2 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.d0 = true;
        this.a0 = true;
        this.b0 = true;
        if (!(this.p0 instanceof yo2)) {
            this.p0 = new yo2();
        }
        ((yo2) this.p0).T(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy0.resolveLayoutDirection(int):void");
    }
}
