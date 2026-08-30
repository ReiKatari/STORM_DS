package d0;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 implements x0 {
    public final /* synthetic */ int A = 0;
    public final ByteBuffer B;
    public final int L;

    public v0(int i2, ByteBuffer byteBuffer) {
        this.L = i2;
        this.B = byteBuffer;
    }

    @Override // d0.x0
    public final ByteBuffer b() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    @Override // d0.x0
    public final int u() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L;
        }
    }

    @Override // d0.x0
    public final int v() {
        switch (this.A) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    public v0(ByteBuffer byteBuffer, int i2) {
        this.B = byteBuffer;
        this.L = i2;
    }
}
