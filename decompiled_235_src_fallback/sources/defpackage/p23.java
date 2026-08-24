package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p23  reason: default package */
/* loaded from: classes.dex */
public final class p23 implements defpackage.r23 {
    public final /* synthetic */ int A;
    public final java.nio.ByteBuffer B;
    public final int L;

    public p23(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public p23(java.nio.ByteBuffer r2, int r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    @Override // defpackage.r23
    public final int C() {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 2
            return r0
        L7:
            r0 = 1
            return r0
    }

    @Override // defpackage.r23
    public final java.nio.ByteBuffer a() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.nio.ByteBuffer r1 = r1.B
            return r1
        L8:
            java.nio.ByteBuffer r1 = r1.B
            return r1
    }

    @Override // defpackage.r23
    public final int m() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.L
            return r1
        L8:
            int r1 = r1.L
            return r1
    }
}
