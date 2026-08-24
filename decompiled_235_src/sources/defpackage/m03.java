package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m03  reason: default package */
/* loaded from: classes.dex */
public final class m03 extends oi2 {
    public final long e;
    public long f;
    public final /* synthetic */ n03 g;

    public m03(n03 n03Var, long j) {
        this.g = n03Var;
        this.e = j;
    }

    @Override // defpackage.oi2
    public final boolean G() {
        if (this.f < this.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oi2
    public final int T(byte[] bArr, int i, int i2) {
        n40 n40Var;
        n03 n03Var = this.g;
        q qVar = n03Var.X;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int min = (int) Math.min(this.e - this.f, i2);
        while (i3 < min) {
            int i4 = 1;
            if (n03Var.L.R > 0) {
                byte n = (byte) n03.n(n40Var, 8);
                int i5 = i + i3;
                int i6 = qVar.a;
                ((byte[]) qVar.c)[i6] = n;
                int i7 = 65535 & (i6 + 1);
                if (!qVar.b && i7 < i6) {
                    qVar.b = true;
                }
                qVar.a = i7;
                bArr[i5] = n;
            } else {
                int i8 = i + i3;
                int read = n03Var.R.read(bArr, i8, min - i3);
                if (read != -1) {
                    for (int i9 = i8; i9 < i8 + read; i9++) {
                        byte b = bArr[i9];
                        int i10 = qVar.a;
                        ((byte[]) qVar.c)[i10] = b;
                        int i11 = (i10 + 1) & 65535;
                        if (!qVar.b && i11 < i10) {
                            qVar.b = true;
                        }
                        qVar.a = i11;
                    }
                    i4 = read;
                } else {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
            }
            this.f += i4;
            i3 += i4;
        }
        return min;
    }

    @Override // defpackage.oi2
    public final o03 W() {
        if (this.f < this.e) {
            return o03.STORED;
        }
        return o03.INITIAL;
    }

    @Override // defpackage.oi2
    public final int j() {
        n40 n40Var = this.g.L;
        return (int) Math.min(this.e - this.f, ((n40Var.A.available() * 8) + n40Var.R) / 8);
    }
}
