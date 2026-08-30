package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ec5  reason: default package */
/* loaded from: classes.dex */
public final class ec5 implements Closeable {
    public final ka A;
    public final dw4 B;
    public final String L;
    public final int R;
    public final op2 X;
    public final xq2 Y;
    public final gc5 Z;
    public final cb6 c0;
    public final ec5 d0;
    public final ec5 e0;
    public final ec5 f0;
    public final long g0;
    public final long h0;
    public final xf1 i0;
    public final nw6 j0;
    public e80 k0;
    public final boolean l0;

    public ec5(ka kaVar, dw4 dw4Var, String str, int i, op2 op2Var, xq2 xq2Var, gc5 gc5Var, cb6 cb6Var, ec5 ec5Var, ec5 ec5Var2, ec5 ec5Var3, long j, long j2, xf1 xf1Var, nw6 nw6Var) {
        kaVar.getClass();
        dw4Var.getClass();
        str.getClass();
        gc5Var.getClass();
        nw6Var.getClass();
        this.A = kaVar;
        this.B = dw4Var;
        this.L = str;
        this.R = i;
        this.X = op2Var;
        this.Y = xq2Var;
        this.Z = gc5Var;
        this.c0 = cb6Var;
        this.d0 = ec5Var;
        this.e0 = ec5Var2;
        this.f0 = ec5Var3;
        this.g0 = j;
        this.h0 = j2;
        this.i0 = xf1Var;
        this.j0 = nw6Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.l0 = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Z.close();
    }

    public final e80 d() {
        e80 e80Var = this.k0;
        if (e80Var == null) {
            e80 e80Var2 = e80.n;
            e80 C = w81.C(this.Y);
            this.k0 = C;
            return C;
        }
        return e80Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cc5, java.lang.Object] */
    public final cc5 i() {
        ?? obj = new Object();
        obj.c = -1;
        obj.g = gc5.A;
        obj.o = nw6.E;
        obj.a = this.A;
        obj.b = this.B;
        obj.c = this.R;
        obj.d = this.L;
        obj.e = this.X;
        obj.f = this.Y.d();
        obj.g = this.Z;
        obj.h = this.c0;
        obj.i = this.d0;
        obj.j = this.e0;
        obj.k = this.f0;
        obj.l = this.g0;
        obj.m = this.h0;
        obj.n = this.i0;
        obj.o = this.j0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.B + ", code=" + this.R + ", message=" + this.L + ", url=" + ((hu2) this.A.B) + '}';
    }
}
