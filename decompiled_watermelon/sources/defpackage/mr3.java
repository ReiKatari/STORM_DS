package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mr3  reason: default package */
/* loaded from: classes.dex */
public final class mr3 {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(mr3.class, Object.class, "_next$volatile");
    public static final /* synthetic */ long h = ys5.a.objectFieldOffset(mr3.class.getDeclaredField("_next$volatile"));
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(mr3.class, "_state$volatile");
    public static final an1 g = new an1("REMOVE_FROZEN", 9);

    public mr3(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            i.n("Check failed.");
            throw null;
        }
        i.n("Check failed.");
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
                    mr3 mr3Var = this;
                    if (f.compareAndSet(mr3Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        mr3 mr3Var2 = mr3Var;
                        while ((atomicLongFieldUpdater.get(mr3Var2) & 1152921504606846976L) != 0) {
                            mr3Var2 = mr3Var2.d();
                            AtomicReferenceArray atomicReferenceArray2 = mr3Var2.d;
                            int i5 = mr3Var2.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i5);
                            if ((obj2 instanceof lr3) && ((lr3) obj2).a == i2) {
                                atomicReferenceArray2.set(i5, obj);
                                continue;
                            } else {
                                mr3Var2 = null;
                                continue;
                            }
                            if (mr3Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this = mr3Var;
                }
            } else {
                return 1;
            }
        }
    }

    public final mr3 b(long j) {
        mr3 mr3Var;
        while (true) {
            e.getClass();
            Unsafe unsafe = ys5.a;
            long j2 = h;
            mr3 mr3Var2 = (mr3) unsafe.getObjectVolatile(this, j2);
            if (mr3Var2 != null) {
                return mr3Var2;
            }
            mr3 mr3Var3 = new mr3(this.a * 2, this.b);
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
                    obj = new lr3(i);
                }
                mr3Var3.d.set(mr3Var3.c & i, obj);
                i++;
            }
            f.set(mr3Var3, (-1152921504606846977L) & j);
            while (true) {
                Unsafe unsafe2 = ys5.a;
                mr3Var = this;
                if (!unsafe2.compareAndSwapObject(mr3Var, h, (Object) null, mr3Var3) && unsafe2.getObjectVolatile(mr3Var, j2) == null) {
                    this = mr3Var;
                }
            }
            this = mr3Var;
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
            mr3 mr3Var = this;
            if (atomicLongFieldUpdater.compareAndSet(mr3Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = mr3Var;
        }
    }

    public final mr3 d() {
        long j;
        mr3 mr3Var;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                mr3Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            mr3Var = this;
            if (atomicLongFieldUpdater.compareAndSet(mr3Var, j, j2)) {
                j = j2;
                break;
            }
            this = mr3Var;
        }
        return mr3Var.b(j);
    }

    public final Object e() {
        mr3 mr3Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(mr3Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = mr3Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mr3Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = mr3Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else if (obj instanceof lr3) {
                break;
            } else {
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(mr3Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                mr3Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(mr3Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            mr3Var = mr3Var.d();
                        } else {
                            mr3 mr3Var2 = mr3Var;
                            if (f.compareAndSet(mr3Var2, j3, (j3 & (-1073741824)) | j2)) {
                                mr3Var2.d.set(i4 & mr3Var2.c, null);
                                mr3Var = null;
                            } else {
                                mr3Var = mr3Var2;
                            }
                        }
                        if (mr3Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
