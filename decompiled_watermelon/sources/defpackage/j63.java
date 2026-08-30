package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j63  reason: default package */
/* loaded from: classes.dex */
public final class j63 implements ay2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(j63.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(j63.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater R;
    public static final /* synthetic */ long X;
    public static final /* synthetic */ long Y;
    public final o74 A;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    static {
        Unsafe unsafe = ys5.a;
        Y = unsafe.objectFieldOffset(j63.class.getDeclaredField("_rootCause$volatile"));
        R = AtomicReferenceFieldUpdater.newUpdater(j63.class, Object.class, "_exceptionsHolder$volatile");
        X = unsafe.objectFieldOffset(j63.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public j63(o74 o74Var, Throwable th) {
        this.A = o74Var;
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
                f81.p(b, "State is ");
            }
        }
    }

    public final Object b() {
        R.getClass();
        return ys5.a.getObjectVolatile(this, X);
    }

    public final Throwable c() {
        L.getClass();
        return (Throwable) ys5.a.getObjectVolatile(this, Y);
    }

    @Override // defpackage.ay2
    public final boolean d() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ay2
    public final o74 e() {
        return this.A;
    }

    public final boolean f() {
        if (c() != null) {
            return true;
        }
        return false;
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
            f81.p(b, "State is ");
            return null;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        h(q63.e);
        return arrayList;
    }

    public final void h(Object obj) {
        R.getClass();
        ys5.a.putObjectVolatile(this, X, obj);
    }

    public final void i(Throwable th) {
        L.getClass();
        ys5.a.putObjectVolatile(this, Y, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
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
