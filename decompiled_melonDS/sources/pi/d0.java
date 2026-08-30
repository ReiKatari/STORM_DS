package pi;

import java.io.Closeable;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 implements Closeable {
    public final x0 A;
    public final z B;
    public final String L;
    public final int R;
    public final p X;
    public final q Y;
    public final g0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final fj.f0 f11701b0;

    /* renamed from: c0  reason: collision with root package name */
    public final d0 f11702c0;

    /* renamed from: d0  reason: collision with root package name */
    public final d0 f11703d0;

    /* renamed from: e0  reason: collision with root package name */
    public final d0 f11704e0;

    /* renamed from: f0  reason: collision with root package name */
    public final long f11705f0;

    /* renamed from: g0  reason: collision with root package name */
    public final long f11706g0;

    /* renamed from: h0  reason: collision with root package name */
    public final e9.a f11707h0;

    /* renamed from: i0  reason: collision with root package name */
    public final k0 f11708i0;

    /* renamed from: j0  reason: collision with root package name */
    public g f11709j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f11710k0;

    public d0(x0 x0Var, z zVar, String str, int i2, p pVar, q qVar, g0 g0Var, fj.f0 f0Var, d0 d0Var, d0 d0Var2, d0 d0Var3, long j2, long j10, e9.a aVar, k0 k0Var) {
        x0Var.getClass();
        zVar.getClass();
        str.getClass();
        g0Var.getClass();
        k0Var.getClass();
        this.A = x0Var;
        this.B = zVar;
        this.L = str;
        this.R = i2;
        this.X = pVar;
        this.Y = qVar;
        this.Z = g0Var;
        this.f11701b0 = f0Var;
        this.f11702c0 = d0Var;
        this.f11703d0 = d0Var2;
        this.f11704e0 = d0Var3;
        this.f11705f0 = j2;
        this.f11706g0 = j10;
        this.f11707h0 = aVar;
        this.f11708i0 = k0Var;
        boolean z10 = false;
        if (200 <= i2 && i2 < 300) {
            z10 = true;
        }
        this.f11710k0 = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.Z.close();
    }

    public final g d() {
        g gVar = this.f11709j0;
        if (gVar == null) {
            g gVar2 = g.f11711n;
            g B = p7.j.B(this.Y);
            this.f11709j0 = B;
            return B;
        }
        return gVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pi.c0, java.lang.Object] */
    public final c0 i() {
        ?? obj = new Object();
        obj.f11677c = -1;
        obj.f11681g = g0.B;
        obj.f11688o = k0.f11750a;
        obj.f11675a = this.A;
        obj.f11676b = this.B;
        obj.f11677c = this.R;
        obj.f11678d = this.L;
        obj.f11679e = this.X;
        obj.f11680f = this.Y.c();
        obj.f11681g = this.Z;
        obj.f11682h = this.f11701b0;
        obj.f11683i = this.f11702c0;
        obj.f11684j = this.f11703d0;
        obj.f11685k = this.f11704e0;
        obj.f11686l = this.f11705f0;
        obj.m = this.f11706g0;
        obj.f11687n = this.f11707h0;
        obj.f11688o = this.f11708i0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.B + ", code=" + this.R + ", message=" + this.L + ", url=" + ((r) this.A.f14089b) + '}';
    }
}
