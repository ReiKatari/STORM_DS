package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t70  reason: default package */
/* loaded from: classes.dex */
public final class t70 extends v70 {
    public final int X;
    public final int Y;

    public t70(byte[] bArr, int i, int i2) {
        super(bArr);
        x70.c(i, i + i2, bArr.length);
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.v70, defpackage.x70
    public final byte b(int i) {
        int i2 = this.Y;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(wh1.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(wh1.f(i, i2, "Index > length: ", ", "));
        }
        return this.R[this.X + i];
    }

    @Override // defpackage.v70, defpackage.x70
    public final void i(int i, byte[] bArr) {
        System.arraycopy(this.R, this.X, bArr, 0, i);
    }

    @Override // defpackage.v70, defpackage.x70
    public final byte j(int i) {
        return this.R[this.X + i];
    }

    @Override // defpackage.v70
    public final int k() {
        return this.X;
    }

    @Override // defpackage.v70, defpackage.x70
    public final int size() {
        return this.Y;
    }
}
