package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m8  reason: default package */
/* loaded from: classes.dex */
public final class m8 {
    public final hd a;
    public final Set b;
    public nc7 c;
    public final l24 d;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, l24] */
    public m8(hd hdVar, Set set, o31 o31Var, kb2 kb2Var) {
        hdVar.getClass();
        o31Var.getClass();
        this.a = hdVar;
        this.b = set;
        p6 p6Var = new p6(5, kb2Var, this);
        o31Var.getClass();
        ?? obj = new Object();
        obj.d = o31Var;
        obj.e = p6Var;
        Object obj2 = new Object();
        obj.c = obj2;
        synchronized (obj2) {
            obj.f = tq5.w(o31Var, null, null, new ys3(obj, null, 19), 3);
        }
        this.d = obj;
        tq5.w(o31Var, null, null, new a6(this, null, 1), 3);
    }

    public final d34 a() {
        l24 l24Var = this.d;
        synchronized (l24Var.c) {
            try {
                if (l24Var.b) {
                    return null;
                }
                int i = l24Var.a + 1;
                l24Var.a = i;
                if (i == 1) {
                    kd6 kd6Var = (kd6) l24Var.f;
                    if (kd6Var != null) {
                        kd6Var.i(null);
                    }
                    l24Var.f = null;
                }
                return new d34(l24Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(k11 k11Var) {
        Object v = se.v(this.a.u, new l8(2, 1, null), k11Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        o27 o27Var = o27.a;
        if (v != p31Var) {
            v = o27Var;
        }
        if (v == p31Var) {
            return v;
        }
        return o27Var;
    }

    public final void c() {
        this.d.c();
        this.a.a();
    }

    public final o27 d(nc7 nc7Var, d34 d34Var) {
        o27 o27Var = o27.a;
        nc7 nc7Var2 = this.c;
        this.c = nc7Var;
        if (nc7Var2 != null) {
            nc7Var2.a(null);
        }
        ee6 ee6Var = this.a.u;
        synchronized (nc7Var.e) {
            if (nc7Var.f) {
                d34Var.b();
            } else {
                nc7Var.k = tq5.w(nc7Var.c, null, null, new v74(ee6Var, nc7Var, null, 26), 3);
                nc7Var.l = d34Var;
            }
        }
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        return o27Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) od0.b(this.a.a));
        sb.append(")@");
        int hashCode = hashCode();
        iq2.g(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }
}
