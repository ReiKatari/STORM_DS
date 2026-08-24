package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy7  reason: default package */
/* loaded from: classes.dex */
public final class fy7 extends defpackage.md5 implements java.io.Serializable {
    public int B;
    public int L;
    public int R;
    public int X;
    public int Y;
    public int Z;

    @Override // defpackage.md5
    public final int a(int r2) {
            r1 = this;
            int r1 = r1.d()
            int r0 = 32 - r2
            int r1 = r1 >>> r0
            int r2 = -r2
            int r2 = r2 >> 31
            r1 = r1 & r2
            return r1
    }

    @Override // defpackage.md5
    public final int d() {
            r3 = this;
            int r0 = r3.B
            int r1 = r0 >>> 2
            r0 = r0 ^ r1
            int r1 = r3.L
            r3.B = r1
            int r1 = r3.R
            r3.L = r1
            int r1 = r3.X
            r3.R = r1
            int r1 = r3.Y
            r3.X = r1
            int r2 = r0 << 1
            r0 = r0 ^ r2
            r0 = r0 ^ r1
            int r1 = r1 << 4
            r0 = r0 ^ r1
            r3.Y = r0
            int r1 = r3.Z
            r2 = 362437(0x587c5, float:5.07882E-40)
            int r1 = r1 + r2
            r3.Z = r1
            int r0 = r0 + r1
            return r0
    }
}
