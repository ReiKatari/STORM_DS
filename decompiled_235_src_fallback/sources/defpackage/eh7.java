package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh7  reason: default package */
/* loaded from: classes.dex */
public final class eh7 extends defpackage.fh7 {
    @Override // defpackage.fh7
    public final boolean c(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            boolean r0 = r0.getBoolean(r3, r1)
            return r0
    }

    @Override // defpackage.fh7
    public final byte d(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            byte r0 = r0.getByte(r3, r1)
            return r0
    }

    @Override // defpackage.fh7
    public final double e(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            double r0 = r0.getDouble(r3, r1)
            return r0
    }

    @Override // defpackage.fh7
    public final float f(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            float r0 = r0.getFloat(r3, r1)
            return r0
    }

    @Override // defpackage.fh7
    public final void k(java.lang.Object r1, long r2, boolean r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putBoolean(r1, r2, r4)
            return
    }

    @Override // defpackage.fh7
    public final void l(java.lang.Object r1, long r2, byte r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putByte(r1, r2, r4)
            return
    }

    @Override // defpackage.fh7
    public final void m(java.lang.Object r1, long r2, double r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putDouble(r1, r2, r4)
            return
    }

    @Override // defpackage.fh7
    public final void n(java.lang.Object r1, long r2, float r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putFloat(r1, r2, r4)
            return
    }
}
