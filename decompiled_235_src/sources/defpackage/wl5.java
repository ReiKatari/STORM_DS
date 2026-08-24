package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl5  reason: default package */
/* loaded from: classes.dex */
public final class wl5 implements Closeable {
    public final pa A;
    public final k55 B;
    public final String L;
    public final int R;
    public final pv2 X;
    public final yw2 Y;
    public final yl5 Z;
    public final rm6 d0;
    public final wl5 e0;
    public final wl5 f0;
    public final wl5 g0;
    public final long h0;
    public final long i0;
    public final bk1 j0;
    public final a97 k0;
    public ma0 l0;
    public final boolean m0;

    public wl5(pa paVar, k55 k55Var, String str, int i, pv2 pv2Var, yw2 yw2Var, yl5 yl5Var, rm6 rm6Var, wl5 wl5Var, wl5 wl5Var2, wl5 wl5Var3, long j, long j2, bk1 bk1Var, a97 a97Var) {
        paVar.getClass();
        k55Var.getClass();
        str.getClass();
        yl5Var.getClass();
        a97Var.getClass();
        this.A = paVar;
        this.B = k55Var;
        this.L = str;
        this.R = i;
        this.X = pv2Var;
        this.Y = yw2Var;
        this.Z = yl5Var;
        this.d0 = rm6Var;
        this.e0 = wl5Var;
        this.f0 = wl5Var2;
        this.g0 = wl5Var3;
        this.h0 = j;
        this.i0 = j2;
        this.j0 = bk1Var;
        this.k0 = a97Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.m0 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Z.close();
    }

    public final ma0 e() {
        ma0 ma0Var = this.l0;
        if (ma0Var == null) {
            ma0 ma0Var2 = ma0.n;
            ma0 C = u24.C(this.Y);
            this.l0 = C;
            return C;
        }
        return ma0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ul5] */
    public final ul5 h() {
        ?? obj = new Object();
        obj.c = -1;
        obj.g = yl5.A;
        obj.o = a97.F;
        obj.a = this.A;
        obj.b = this.B;
        obj.c = this.R;
        obj.d = this.L;
        obj.e = this.X;
        obj.f = this.Y.c();
        obj.g = this.Z;
        obj.h = this.d0;
        obj.i = this.e0;
        obj.j = this.f0;
        obj.k = this.g0;
        obj.l = this.h0;
        obj.m = this.i0;
        obj.n = this.j0;
        obj.o = this.k0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.B + ", code=" + this.R + ", message=" + this.L + ", url=" + ((i03) this.A.B) + '}';
    }
}
