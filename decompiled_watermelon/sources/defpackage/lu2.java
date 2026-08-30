package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lu2  reason: default package */
/* loaded from: classes.dex */
public final class lu2 extends io2 {
    public final long j;
    public long k;
    public final /* synthetic */ mu2 l;

    public lu2(mu2 mu2Var, long j) {
        this.l = mu2Var;
        this.j = j;
    }

    @Override // defpackage.io2
    public final boolean P() {
        if (this.k < this.j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.io2
    public final int g() {
        o20 o20Var = this.l.L;
        return (int) Math.min(this.j - this.k, ((o20Var.A.available() * 8) + o20Var.R) / 8);
    }

    @Override // defpackage.io2
    public final int i0(byte[] bArr, int i, int i2) {
        o20 o20Var;
        mu2 mu2Var = this.l;
        p pVar = mu2Var.X;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int min = (int) Math.min(this.j - this.k, i2);
        while (i3 < min) {
            int i4 = 1;
            if (mu2Var.L.R > 0) {
                byte w = (byte) mu2.w(o20Var, 8);
                int i5 = i + i3;
                int i6 = pVar.a;
                ((byte[]) pVar.c)[i6] = w;
                int i7 = 65535 & (i6 + 1);
                if (!pVar.b && i7 < i6) {
                    pVar.b = true;
                }
                pVar.a = i7;
                bArr[i5] = w;
            } else {
                int i8 = i + i3;
                int read = mu2Var.R.read(bArr, i8, min - i3);
                if (read != -1) {
                    for (int i9 = i8; i9 < i8 + read; i9++) {
                        byte b = bArr[i9];
                        int i10 = pVar.a;
                        ((byte[]) pVar.c)[i10] = b;
                        int i11 = (i10 + 1) & 65535;
                        if (!pVar.b && i11 < i10) {
                            pVar.b = true;
                        }
                        pVar.a = i11;
                    }
                    i4 = read;
                } else {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
            }
            this.k += i4;
            i3 += i4;
        }
        return min;
    }

    @Override // defpackage.io2
    public final nu2 n0() {
        if (this.k < this.j) {
            return nu2.STORED;
        }
        return nu2.INITIAL;
    }
}
