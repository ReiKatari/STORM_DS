package defpackage;

import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i37  reason: default package */
/* loaded from: classes.dex */
public final class i37 extends k37 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i37(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.k37
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (l37.h) {
                    if (l37.g(j, obj) == 0) {
                        return false;
                    }
                } else if (l37.h(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (l37.h) {
                    if (l37.g(j, obj) == 0) {
                        return false;
                    }
                } else if (l37.h(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.k37
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (l37.h) {
                    return l37.g(j, obj);
                }
                return l37.h(j, obj);
            default:
                if (l37.h) {
                    return l37.g(j, obj);
                }
                return l37.h(j, obj);
        }
    }

    @Override // defpackage.k37
    public final double e(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(h(j, obj));
            default:
                return Double.longBitsToDouble(h(j, obj));
        }
    }

    @Override // defpackage.k37
    public final float f(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(g(j, obj));
            default:
                return Float.intBitsToFloat(g(j, obj));
        }
    }

    @Override // defpackage.k37
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (l37.h) {
                    l37.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    l37.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (l37.h) {
                    l37.k(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    l37.l(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.k37
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (l37.h) {
                    l37.k(obj, j, b);
                    return;
                } else {
                    l37.l(obj, j, b);
                    return;
                }
            default:
                if (l37.h) {
                    l37.k(obj, j, b);
                    return;
                } else {
                    l37.l(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.k37
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

    @Override // defpackage.k37
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(Float.floatToIntBits(f), j, obj);
                return;
            default:
                o(Float.floatToIntBits(f), j, obj);
                return;
        }
    }
}
