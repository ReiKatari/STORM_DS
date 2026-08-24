package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt3  reason: default package */
/* loaded from: classes.dex */
public final class zt3 {
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public ze0 e;

    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[Catch: all -> 0x0021, TryCatch #3 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:45:0x0089, B:46:0x008c, B:48:0x009c, B:49:0x009f, B:52:0x00a2, B:53:0x00a7, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:29:0x0068, B:30:0x006a, B:37:0x0076, B:39:0x007a, B:40:0x007e, B:41:0x0085, B:31:0x006b, B:35:0x0073, B:34:0x0071, B:14:0x0033), top: B:58:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(vt3 vt3Var, qi1 qi1Var, ze0 ze0Var) {
        boolean z;
        int i;
        synchronized (this.a) {
            try {
                np2.t(!((List) qi1Var.g).isEmpty());
                this.e = ze0Var;
                hu3 d = vt3Var.d();
                e(d);
                yt3 c = c(d);
                if (c == null) {
                    return;
                }
                Set<my> set = (Set) this.c.get(c);
                ze0 ze0Var2 = this.e;
                try {
                    if (ze0Var2 != null) {
                        synchronized (ze0Var2.b) {
                            i = ze0Var2.e;
                        }
                        if (i != 2) {
                        }
                        vt3Var.b(qi1Var);
                        if (d.getLifecycle().b().isAtLeast(tt3.STARTED)) {
                            g(d);
                        }
                        return;
                    }
                    vt3Var.b(qi1Var);
                    if (d.getLifecycle().b().isAtLeast(tt3.STARTED)) {
                    }
                    return;
                } catch (si0 e) {
                    throw new IllegalArgumentException(e);
                }
                for (my myVar : set) {
                    vt3 vt3Var2 = (vt3) this.b.get(myVar);
                    vt3Var2.getClass();
                    if (!vt3Var2.equals(vt3Var) && !vt3Var2.g().isEmpty()) {
                        synchronized (vt3Var2.A) {
                            qi1 qi1Var2 = vt3Var2.X;
                            if (qi1Var2 == null) {
                                z = false;
                            } else {
                                z = qi1Var2.b;
                            }
                        }
                        if (!z && !qi1Var.b) {
                            vt3Var2.s();
                        } else {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final vt3 b(hu3 hu3Var, zi0 zi0Var, t16 t16Var) {
        boolean z;
        synchronized (this.a) {
            try {
                if (this.b.get(new my(System.identityHashCode(hu3Var), zi0Var.R)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                np2.s("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z);
                vt3 vt3Var = new vt3(hu3Var, zi0Var, t16Var);
                if (((ArrayList) zi0Var.z()).isEmpty()) {
                    vt3Var.r();
                }
                if (hu3Var.getLifecycle().b() == tt3.DESTROYED) {
                    return vt3Var;
                }
                f(vt3Var);
                return vt3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yt3 c(hu3 hu3Var) {
        synchronized (this.a) {
            try {
                for (yt3 yt3Var : this.c.keySet()) {
                    if (hu3Var.equals(yt3Var.B)) {
                        return yt3Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(hu3 hu3Var) {
        synchronized (this.a) {
            try {
                yt3 c = c(hu3Var);
                if (c == null) {
                    return false;
                }
                for (my myVar : (Set) this.c.get(c)) {
                    vt3 vt3Var = (vt3) this.b.get(myVar);
                    vt3Var.getClass();
                    if (!vt3Var.g().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(hu3 hu3Var) {
        HashMap hashMap;
        x9 x9Var;
        yt3 c = c(hu3Var);
        if (c != null) {
            HashSet hashSet = new HashSet();
            Set set = (Set) this.c.get(c);
            Objects.requireNonNull(set);
            Iterator it = set.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = this.b;
                if (!hasNext) {
                    break;
                }
                my myVar = (my) it.next();
                vt3 vt3Var = (vt3) hashMap.get(myVar);
                if (vt3Var != null) {
                    zi0 zi0Var = vt3Var.L;
                    if (zi0Var.A.A.k() || ((x9Var = zi0Var.B) != null && x9Var.A.k())) {
                        hashSet.add(myVar);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                kj2.f0("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    vt3 vt3Var2 = (vt3) hashMap.get((my) it2.next());
                    Objects.requireNonNull(vt3Var2);
                    k(vt3Var2);
                }
            }
        }
    }

    public final void f(vt3 vt3Var) {
        Set hashSet;
        synchronized (this.a) {
            try {
                hu3 d = vt3Var.d();
                my myVar = new my(System.identityHashCode(d), vt3Var.L.R);
                yt3 c = c(d);
                if (c != null) {
                    hashSet = (Set) this.c.get(c);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(myVar);
                this.b.put(myVar, vt3Var);
                if (c == null) {
                    yt3 yt3Var = new yt3(d, this);
                    this.c.put(yt3Var, hashSet);
                    d.getLifecycle().a(yt3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(hu3 hu3Var) {
        int i;
        synchronized (this.a) {
            try {
                if (!d(hu3Var)) {
                    return;
                }
                if (this.d.isEmpty()) {
                    this.d.push(hu3Var);
                } else {
                    ze0 ze0Var = this.e;
                    if (ze0Var != null) {
                        synchronized (ze0Var.b) {
                            i = ze0Var.e;
                        }
                        if (i != 2) {
                        }
                    }
                    hu3 hu3Var2 = (hu3) this.d.peek();
                    if (!hu3Var.equals(hu3Var2)) {
                        i(hu3Var2);
                        this.d.remove(hu3Var);
                        this.d.push(hu3Var);
                    }
                }
                m(hu3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(hu3 hu3Var) {
        synchronized (this.a) {
            try {
                this.d.remove(hu3Var);
                i(hu3Var);
                if (!this.d.isEmpty()) {
                    m((hu3) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(hu3 hu3Var) {
        synchronized (this.a) {
            try {
                yt3 c = c(hu3Var);
                if (c == null) {
                    return;
                }
                for (my myVar : (Set) this.c.get(c)) {
                    vt3 vt3Var = (vt3) this.b.get(myVar);
                    vt3Var.getClass();
                    vt3Var.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Set] */
    public final void j(HashSet hashSet) {
        HashSet<my> hashSet2 = hashSet;
        synchronized (this.a) {
            if (hashSet == null) {
                try {
                    hashSet2 = this.b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (my myVar : hashSet2) {
                vt3 vt3Var = (vt3) this.b.get(myVar);
                if (vt3Var != null) {
                    vt3Var.s();
                    h(vt3Var.d());
                }
            }
        }
    }

    public final void k(vt3 vt3Var) {
        synchronized (this.a) {
            try {
                hu3 d = vt3Var.d();
                my myVar = new my(System.identityHashCode(d), vt3Var.L.R);
                this.b.remove(myVar);
                HashSet hashSet = new HashSet();
                for (yt3 yt3Var : this.c.keySet()) {
                    if (d.equals(yt3Var.B)) {
                        Set set = (Set) this.c.get(yt3Var);
                        set.remove(myVar);
                        if (set.isEmpty()) {
                            hashSet.add(yt3Var.B);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((hu3) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(hu3 hu3Var) {
        synchronized (this.a) {
            try {
                yt3 c = c(hu3Var);
                if (c == null) {
                    return;
                }
                h(hu3Var);
                for (my myVar : (Set) this.c.get(c)) {
                    this.b.remove(myVar);
                }
                this.c.remove(c);
                c.B.getLifecycle().c(c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(hu3 hu3Var) {
        synchronized (this.a) {
            try {
                for (my myVar : (Set) this.c.get(c(hu3Var))) {
                    vt3 vt3Var = (vt3) this.b.get(myVar);
                    vt3Var.getClass();
                    if (!vt3Var.g().isEmpty()) {
                        vt3Var.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
