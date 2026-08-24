package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p23  reason: default package */
/* loaded from: classes.dex */
public final class p23 implements r23 {
    public final /* synthetic */ int A = 0;
    public final ByteBuffer B;
    public final int L;

    public p23(int i, ByteBuffer byteBuffer) {
        this.L = i;
        this.B = byteBuffer;
    }

    @Override // defpackage.r23
    public final int C() {
        switch (this.A) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    @Override // defpackage.r23
    public final ByteBuffer a() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    @Override // defpackage.r23
    public final int m() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L;
        }
    }

    public p23(ByteBuffer byteBuffer, int i) {
        this.B = byteBuffer;
        this.L = i;
    }
}
