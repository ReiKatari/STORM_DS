package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kj7  reason: default package */
/* loaded from: classes.dex */
public final class kj7 extends c45 implements Serializable {
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;
    public int Z;

    @Override // defpackage.c45
    public final int a(int i) {
        return (d() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.c45
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
