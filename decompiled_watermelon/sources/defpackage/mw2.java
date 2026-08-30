package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mw2  reason: default package */
/* loaded from: classes.dex */
public final class mw2 extends hf2 {
    public final nw2[] R;
    public final int X;
    public final int Y;

    public mw2(ow2 ow2Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2) {
        super(ow2Var);
        this.R = new nw2[]{new lw2(i, byteBuffer), new lw2(byteBuffer2, i), new lw2(byteBuffer3, i)};
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.hf2, defpackage.ow2
    public final int a() {
        return this.Y;
    }

    @Override // defpackage.hf2, defpackage.ow2
    public final int c() {
        return this.X;
    }

    @Override // defpackage.hf2, defpackage.ow2
    public final nw2[] m() {
        return this.R;
    }
}
