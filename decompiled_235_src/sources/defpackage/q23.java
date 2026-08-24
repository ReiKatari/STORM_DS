package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q23  reason: default package */
/* loaded from: classes.dex */
public final class q23 extends gk2 {
    public final r23[] R;
    public final int X;
    public final int Y;

    public q23(s23 s23Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(s23Var);
        this.R = new r23[]{new p23(i, byteBuffer), new p23(byteBuffer2, i), new p23(byteBuffer3, i)};
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getHeight() {
        return this.Y;
    }

    @Override // defpackage.gk2, defpackage.s23
    public final int getWidth() {
        return this.X;
    }

    @Override // defpackage.gk2, defpackage.s23
    public final r23[] j() {
        return this.R;
    }
}
