package zc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 implements v0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(e1.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(e1.class, Object.class, "_exceptionsHolder$volatile");
    public final h1 A;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    public e1(h1 h1Var, Throwable th2) {
        this.A = h1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable b10 = b();
        if (b10 == null) {
            L.set(this, th2);
        } else if (th2 != b10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
            } else if (obj instanceof Throwable) {
                if (th2 == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th2);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
            } else {
                wa.b.e(obj, "State is ");
            }
        }
    }

    public final Throwable b() {
        return (Throwable) L.get(this);
    }

    public final boolean c() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    @Override // zc.v0
    public final boolean d() {
        if (b() == null) {
            return true;
        }
        return false;
    }

    @Override // zc.v0
    public final h1 e() {
        return this.A;
    }

    public final ArrayList f(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            wa.b.e(obj, "State is ");
            return null;
        }
        Throwable b10 = b();
        if (b10 != null) {
            arrayList.add(0, b10);
        }
        if (th2 != null && !th2.equals(b10)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, x.f15038h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(c());
        sb2.append(", completing=");
        boolean z10 = true;
        if (B.get(this) != 1) {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", rootCause=");
        sb2.append(b());
        sb2.append(", exceptions=");
        sb2.append(R.get(this));
        sb2.append(", list=");
        sb2.append(this.A);
        sb2.append(']');
        return sb2.toString();
    }
}
