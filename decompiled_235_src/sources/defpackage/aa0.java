package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa0  reason: default package */
/* loaded from: classes.dex */
public final class aa0 extends ca0 {
    public final int X;
    public final int Y;

    public aa0(byte[] bArr, int i, int i2) {
        super(bArr);
        ea0.b(i, i + i2, bArr.length);
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final byte a(int i) {
        int i2 = this.Y;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(lb1.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(lb1.j("Index > length: ", i, i2, ", "));
        }
        return this.R[this.X + i];
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.R, this.X, bArr, 0, i);
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final byte f(int i) {
        return this.R[this.X + i];
    }

    @Override // defpackage.ca0
    public final int g() {
        return this.X;
    }

    @Override // defpackage.ca0, defpackage.ea0
    public final int size() {
        return this.Y;
    }
}
