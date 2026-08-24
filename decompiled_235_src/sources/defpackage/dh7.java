package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh7  reason: default package */
/* loaded from: classes.dex */
public final class dh7 extends fh7 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh7(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.fh7
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (gh7.h) {
                    if (gh7.g(j, obj) == 0) {
                        return false;
                    }
                } else if (gh7.h(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (gh7.h) {
                    if (gh7.g(j, obj) == 0) {
                        return false;
                    }
                } else if (gh7.h(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.fh7
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (gh7.h) {
                    return gh7.g(j, obj);
                }
                return gh7.h(j, obj);
            default:
                if (gh7.h) {
                    return gh7.g(j, obj);
                }
                return gh7.h(j, obj);
        }
    }

    @Override // defpackage.fh7
    public final double e(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(h(j, obj));
            default:
                return Double.longBitsToDouble(h(j, obj));
        }
    }

    @Override // defpackage.fh7
    public final float f(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(g(j, obj));
            default:
                return Float.intBitsToFloat(g(j, obj));
        }
    }

    @Override // defpackage.fh7
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (gh7.h) {
                    gh7.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    gh7.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (gh7.h) {
                    gh7.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    gh7.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.fh7
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (gh7.h) {
                    gh7.k(obj, j, b);
                    return;
                } else {
                    gh7.l(obj, j, b);
                    return;
                }
            default:
                if (gh7.h) {
                    gh7.k(obj, j, b);
                    return;
                } else {
                    gh7.l(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.fh7
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // defpackage.fh7
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(obj, j, Float.floatToIntBits(f));
                return;
            default:
                o(obj, j, Float.floatToIntBits(f));
                return;
        }
    }
}
