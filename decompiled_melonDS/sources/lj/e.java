package lj;

import java.io.EOFException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends k0.d {

    /* renamed from: e  reason: collision with root package name */
    public final long f9179e;

    /* renamed from: f  reason: collision with root package name */
    public long f9180f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f9181g;

    public e(f fVar, long j2) {
        this.f9181g = fVar;
        this.f9179e = j2;
    }

    @Override // k0.d
    public final boolean C() {
        if (this.f9180f < this.f9179e) {
            return true;
        }
        return false;
    }

    @Override // k0.d
    public final int D(byte[] bArr, int i2, int i10) {
        mj.a aVar;
        f fVar = this.f9181g;
        b bVar = fVar.X;
        int i11 = 0;
        if (i10 == 0) {
            return 0;
        }
        int min = (int) Math.min(this.f9179e - this.f9180f, i10);
        while (i11 < min) {
            int i12 = 1;
            if (fVar.L.R > 0) {
                byte t5 = (byte) f.t(aVar, 8);
                int i13 = i2 + i11;
                int i14 = bVar.f9169b;
                ((byte[]) bVar.f9170c)[i14] = t5;
                int i15 = 65535 & (i14 + 1);
                if (!bVar.f9168a && i15 < i14) {
                    bVar.f9168a = true;
                }
                bVar.f9169b = i15;
                bArr[i13] = t5;
            } else {
                int i16 = i2 + i11;
                int read = fVar.R.read(bArr, i16, min - i11);
                if (read != -1) {
                    for (int i17 = i16; i17 < i16 + read; i17++) {
                        byte b10 = bArr[i17];
                        int i18 = bVar.f9169b;
                        ((byte[]) bVar.f9170c)[i18] = b10;
                        int i19 = (i18 + 1) & 65535;
                        if (!bVar.f9168a && i19 < i18) {
                            bVar.f9168a = true;
                        }
                        bVar.f9169b = i19;
                    }
                    i12 = read;
                } else {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
            }
            this.f9180f += i12;
            i11 += i12;
        }
        return min;
    }

    @Override // k0.d
    public final g L() {
        if (this.f9180f < this.f9179e) {
            return g.STORED;
        }
        return g.INITIAL;
    }

    @Override // k0.d
    public final int l() {
        long j2 = this.f9179e - this.f9180f;
        mj.a aVar = this.f9181g.L;
        return (int) Math.min(j2, ((aVar.A.available() * 8) + aVar.R) / 8);
    }
}
