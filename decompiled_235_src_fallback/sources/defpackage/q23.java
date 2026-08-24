package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q23  reason: default package */
/* loaded from: classes.dex */
public final class q23 extends defpackage.gk2 {
    public final defpackage.r23[] R;
    public final int X;
    public final int Y;

    public q23(defpackage.s23 r2, java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, java.nio.ByteBuffer r5, int r6, int r7) {
            r1 = this;
            r1.<init>(r2)
            p23 r2 = new p23
            r2.<init>(r6, r3)
            p23 r3 = new p23
            r3.<init>(r4, r6)
            p23 r4 = new p23
            r4.<init>(r5, r6)
            r5 = 3
            r23[] r5 = new defpackage.r23[r5]
            r0 = 0
            r5[r0] = r2
            r2 = 1
            r5[r2] = r3
            r2 = 2
            r5[r2] = r4
            r1.R = r5
            r1.X = r6
            r1.Y = r7
            return
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getHeight() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getWidth() {
            r0 = this;
            int r0 = r0.X
            return r0
    }

    @Override // defpackage.gk2, defpackage.s23
    public final defpackage.r23[] j() {
            r0 = this;
            r23[] r0 = r0.R
            return r0
    }
}
