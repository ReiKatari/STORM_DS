package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lw2  reason: default package */
/* loaded from: classes.dex */
public final class lw2 implements nw2 {
    public final /* synthetic */ int A = 0;
    public final ByteBuffer B;
    public final int L;

    public lw2(int i, ByteBuffer byteBuffer) {
        this.L = i;
        this.B = byteBuffer;
    }

    @Override // defpackage.nw2
    public final ByteBuffer b() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }

    @Override // defpackage.nw2
    public final int r() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L;
        }
    }

    @Override // defpackage.nw2
    public final int u() {
        switch (this.A) {
            case 0:
                return 1;
            default:
                return 2;
        }
    }

    public lw2(ByteBuffer byteBuffer, int i) {
        this.B = byteBuffer;
        this.L = i;
    }
}
