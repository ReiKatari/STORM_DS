package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh7  reason: default package */
/* loaded from: classes.dex */
public abstract class fh7 {
    public final sun.misc.Unsafe a;

    public fh7(sun.misc.Unsafe r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final int a(java.lang.Class r1) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            int r0 = r0.arrayBaseOffset(r1)
            return r0
    }

    public final int b(java.lang.Class r1) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            int r0 = r0.arrayIndexScale(r1)
            return r0
    }

    public abstract boolean c(long r1, java.lang.Object r3);

    public abstract byte d(long r1, java.lang.Object r3);

    public abstract double e(long r1, java.lang.Object r3);

    public abstract float f(long r1, java.lang.Object r3);

    public final int g(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            int r0 = r0.getInt(r3, r1)
            return r0
    }

    public final long h(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            long r0 = r0.getLong(r3, r1)
            return r0
    }

    public final java.lang.Object i(long r1, java.lang.Object r3) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            java.lang.Object r0 = r0.getObject(r3, r1)
            return r0
    }

    public final long j(java.lang.reflect.Field r1) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            long r0 = r0.objectFieldOffset(r1)
            return r0
    }

    public abstract void k(java.lang.Object r1, long r2, boolean r4);

    public abstract void l(java.lang.Object r1, long r2, byte r4);

    public abstract void m(java.lang.Object r1, long r2, double r4);

    public abstract void n(java.lang.Object r1, long r2, float r4);

    public final void o(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putInt(r1, r2, r4)
            return
    }

    public final void p(java.lang.Object r1, long r2, long r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putLong(r1, r2, r4)
            return
    }

    public final void q(java.lang.Object r1, long r2, java.lang.Object r4) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.a
            r0.putObject(r1, r2, r4)
            return
    }
}
