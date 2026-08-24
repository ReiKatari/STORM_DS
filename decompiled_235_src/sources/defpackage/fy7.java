package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy7  reason: default package */
/* loaded from: classes.dex */
public final class fy7 extends md5 implements Serializable {
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;
    public int Z;

    @Override // defpackage.md5
    public final int a(int i) {
        return (d() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.md5
    public final int d() {
        int i = this.B;
        int i2 = i ^ (i >>> 2);
        this.B = this.L;
        this.L = this.R;
        this.R = this.X;
        int i3 = this.Y;
        this.X = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.Y = i4;
        int i5 = this.Z + 362437;
        this.Z = i5;
        return i4 + i5;
    }
}
