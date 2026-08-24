package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc3  reason: default package */
/* loaded from: classes.dex */
public final class yc3 implements e43 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(yc3.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(yc3.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater R;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public final gg4 A;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = v36.a;
        Y = unsafe.objectFieldOffset(yc3.class.getDeclaredField("_rootCause$volatile"));
        R = AtomicReferenceFieldUpdater.newUpdater(yc3.class, Object.class, "_exceptionsHolder$volatile");
        X = unsafe.objectFieldOffset(yc3.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public yc3(gg4 gg4Var, Throwable th) {
        this.A = gg4Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c = c();
        if (c == null) {
            i(th);
        } else if (th != c) {
            Object b = b();
            if (b == null) {
                h(th);
            } else if (b instanceof Throwable) {
                if (th == b) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(b);
                arrayList.add(th);
                h(arrayList);
            } else if (b instanceof ArrayList) {
                ((ArrayList) b).add(th);
            } else {
                e41.h(b, "State is ");
            }
        }
    }

    public final Object b() {
        R.getClass();
        return v36.a.getObjectVolatile(this, X);
    }

    public final Throwable c() {
        L.getClass();
        return (Throwable) v36.a.getObjectVolatile(this, Y);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e43
    public final boolean e() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e43
    public final gg4 f() {
        return this.A;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object b = b();
        if (b == null) {
            arrayList = new ArrayList(4);
        } else if (b instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(b);
            arrayList = arrayList2;
        } else if (b instanceof ArrayList) {
            arrayList = (ArrayList) b;
        } else {
            e41.h(b, "State is ");
            return null;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        h(fd3.e);
        return arrayList;
    }

    public final void h(Object obj) {
        R.getClass();
        v36.a.putObjectVolatile(this, X, obj);
    }

    public final void i(Throwable th) {
        L.getClass();
        v36.a.putObjectVolatile(this, Y, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(d());
        sb.append(", completing=");
        boolean z = true;
        if (B.get(this) != 1) {
            z = false;
        }
        sb.append(z);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(b());
        sb.append(", list=");
        sb.append(this.A);
        sb.append(']');
        return sb.toString();
    }
}
