package qc;

import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends d implements Serializable {
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;
    public int Z;

    @Override // qc.d
    public final int a(int i2) {
        return ((-i2) >> 31) & (d() >>> (32 - i2));
    }

    @Override // qc.d
    public final int d() {
        int i2 = this.B;
        int i10 = i2 ^ (i2 >>> 2);
        this.B = this.L;
        this.L = this.R;
        this.R = this.X;
        int i11 = this.Y;
        this.X = i11;
        int i12 = ((i10 ^ (i10 << 1)) ^ i11) ^ (i11 << 4);
        this.Y = i12;
        int i13 = this.Z + 362437;
        this.Z = i13;
        return i12 + i13;
    }
}
