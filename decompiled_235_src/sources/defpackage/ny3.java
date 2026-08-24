package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny3  reason: default package */
/* loaded from: classes.dex */
public final class ny3 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ny3.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = v36.a.objectFieldOffset(ny3.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(ny3.class, "_state$volatile");
    public static final gr1 g = new gr1("REMOVE_FROZEN", 9);

    public ny3(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            i.m("Check failed.");
            throw null;
        }
        i.m("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = this.b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = this.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    ny3 ny3Var = this;
                    if (f.compareAndSet(ny3Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        ny3 ny3Var2 = ny3Var;
                        while ((atomicLongFieldUpdater.get(ny3Var2) & 1152921504606846976L) != 0) {
                            ny3Var2 = ny3Var2.d();
                            AtomicReferenceArray atomicReferenceArray2 = ny3Var2.d;
                            int i5 = ny3Var2.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i5);
                            if ((obj2 instanceof my3) && ((my3) obj2).a == i2) {
                                atomicReferenceArray2.set(i5, obj);
                                continue;
                            } else {
                                ny3Var2 = null;
                                continue;
                            }
                            if (ny3Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this = ny3Var;
                }
            } else {
                return 1;
            }
        }
    }

    public final ny3 b(long j) {
        ny3 ny3Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = v36.a;
            long j2 = h;
            ny3 ny3Var2 = (ny3) unsafe.getObjectVolatile(this, j2);
            if (ny3Var2 != null) {
                return ny3Var2;
            }
            ny3 ny3Var3 = new ny3(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new my3(i);
                }
                ny3Var3.d.set(ny3Var3.c & i, obj);
                i++;
            }
            f.set(ny3Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = v36.a;
                ny3Var = this;
                if (!unsafe2.compareAndSwapObject(ny3Var, h, (Object) null, ny3Var3) && unsafe2.getObjectVolatile(ny3Var, j2) == null) {
                    this = ny3Var;
                }
            }
            this = ny3Var;
        }
    }

    public final boolean c() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            ny3 ny3Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ny3Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = ny3Var;
        }
    }

    public final ny3 d() {
        long j;
        ny3 ny3Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                ny3Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            ny3Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ny3Var, j, j2)) {
                j = j2;
                break;
            }
            this = ny3Var;
        }
        return ny3Var.b(j);
    }

    public final Object e() {
        ny3 ny3Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(ny3Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = ny3Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = ny3Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = ny3Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else if (obj instanceof my3) {
                break;
            } else {
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(ny3Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                ny3Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(ny3Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            ny3Var = ny3Var.d();
                        } else {
                            ny3 ny3Var2 = ny3Var;
                            if (f.compareAndSet(ny3Var2, j3, (j3 & (-1073741824)) | j2)) {
                                ny3Var2.d.set(i4 & ny3Var2.c, null);
                                ny3Var = null;
                            } else {
                                ny3Var = ny3Var2;
                            }
                        }
                        if (ny3Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
