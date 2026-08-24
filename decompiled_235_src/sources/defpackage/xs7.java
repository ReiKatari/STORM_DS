package defpackage;

import java.io.Closeable;
import java.util.Random;
import java.util.zip.Deflater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs7  reason: default package */
/* loaded from: classes.dex */
public final class xs7 implements Closeable {
    public final y80 A;
    public final Random B;
    public final boolean L;
    public final boolean R;
    public final long X;
    public final k80 Y;
    public final k80 Z;
    public boolean d0;
    public f54 e0;
    public final byte[] f0;
    public final i80 g0;

    /* JADX WARN: Type inference failed for: r2v1, types: [k80, java.lang.Object] */
    public xs7(y80 y80Var, Random random, boolean z, boolean z2, long j) {
        y80Var.getClass();
        this.A = y80Var;
        this.B = random;
        this.L = z;
        this.R = z2;
        this.X = j;
        this.Y = new Object();
        this.Z = y80Var.a();
        this.f0 = new byte[4];
        this.g0 = new i80();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f54 f54Var = this.e0;
        if (f54Var != null) {
            yy7.b(f54Var);
        }
        yy7.b(this.A);
    }

    public final void e(int i, da0 da0Var) {
        if (!this.d0) {
            int d = da0Var.d();
            if (d <= 125) {
                k80 k80Var = this.Z;
                k80Var.n0(i | 128);
                k80Var.n0(d | 128);
                byte[] bArr = this.f0;
                bArr.getClass();
                this.B.nextBytes(bArr);
                k80Var.l0(bArr, bArr.length);
                if (d > 0) {
                    long j = k80Var.B;
                    k80Var.k0(da0Var);
                    i80 i80Var = this.g0;
                    i80Var.getClass();
                    k80Var.J(i80Var);
                    i80Var.h(j);
                    vs7.f(i80Var, bArr);
                    i80Var.close();
                }
                this.A.flush();
                return;
            }
            i.h("Payload size must be less than or equal to 125");
            return;
        }
        e41.i("closed");
    }

    public final void h(da0 da0Var) {
        int i;
        if (!this.d0) {
            k80 k80Var = this.Y;
            k80Var.k0(da0Var);
            if (this.L && da0Var.A.length >= this.X) {
                f54 f54Var = this.e0;
                if (f54Var == null) {
                    f54Var = new f54(this.R, 0);
                    this.e0 = f54Var;
                }
                tg1 tg1Var = (tg1) f54Var.X;
                k80 k80Var2 = f54Var.L;
                if (k80Var2.B == 0) {
                    if (f54Var.B) {
                        ((Deflater) f54Var.R).reset();
                    }
                    tg1Var.O(k80Var, k80Var.B);
                    tg1Var.flush();
                    da0 da0Var2 = g54.a;
                    if (k80Var2.F(da0Var2.d(), k80Var2.B - da0Var2.A.length, da0Var2)) {
                        long j = k80Var2.B - 4;
                        i80 J = k80Var2.J(hf.a);
                        try {
                            J.e(j);
                            J.close();
                        } finally {
                        }
                    } else {
                        k80Var2.n0(0);
                    }
                    k80Var.O(k80Var2, k80Var2.B);
                    i = 193;
                } else {
                    i.h("Failed requirement.");
                    return;
                }
            } else {
                i = 129;
            }
            long j2 = k80Var.B;
            k80 k80Var3 = this.Z;
            k80Var3.n0(i);
            if (j2 <= 125) {
                k80Var3.n0(((int) j2) | 128);
            } else if (j2 <= 65535) {
                k80Var3.n0(254);
                k80Var3.r0((int) j2);
            } else {
                k80Var3.n0(255);
                o96 j0 = k80Var3.j0(8);
                byte[] bArr = j0.a;
                int i2 = j0.c;
                bArr[i2] = (byte) ((j2 >>> 56) & 255);
                bArr[i2 + 1] = (byte) ((j2 >>> 48) & 255);
                bArr[i2 + 2] = (byte) ((j2 >>> 40) & 255);
                bArr[i2 + 3] = (byte) ((j2 >>> 32) & 255);
                bArr[i2 + 4] = (byte) ((j2 >>> 24) & 255);
                bArr[i2 + 5] = (byte) ((j2 >>> 16) & 255);
                bArr[i2 + 6] = (byte) ((j2 >>> 8) & 255);
                bArr[i2 + 7] = (byte) (j2 & 255);
                j0.c = i2 + 8;
                k80Var3.B += 8;
            }
            byte[] bArr2 = this.f0;
            bArr2.getClass();
            this.B.nextBytes(bArr2);
            k80Var3.l0(bArr2, bArr2.length);
            if (j2 > 0) {
                i80 i80Var = this.g0;
                i80Var.getClass();
                k80Var.J(i80Var);
                i80Var.h(0L);
                vs7.f(i80Var, bArr2);
                i80Var.close();
            }
            k80Var3.O(k80Var, j2);
            this.A.flush();
            return;
        }
        e41.i("closed");
    }
}
