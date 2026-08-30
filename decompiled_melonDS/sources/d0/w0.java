package d0;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 extends d0 {
    public final x0[] R;
    public final int X;
    public final int Y;

    public w0(y0 y0Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i10) {
        super(y0Var);
        this.R = new x0[]{new v0(i2, byteBuffer), new v0(byteBuffer2, i2), new v0(byteBuffer3, i2)};
        this.X = i2;
        this.Y = i10;
    }

    @Override // d0.d0, d0.y0
    public final int a() {
        return this.Y;
    }

    @Override // d0.d0, d0.y0
    public final int c() {
        return this.X;
    }

    @Override // d0.d0, d0.y0
    public final x0[] l() {
        return this.R;
    }
}
