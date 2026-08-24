package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n8  reason: default package */
/* loaded from: classes.dex */
public final class n8 {
    public final vd a;
    public final Set b;
    public pq7 c;
    public final ra4 d;

    /* JADX WARN: Type inference failed for: r3v1, types: [ra4, java.lang.Object] */
    public n8(vd vdVar, Set set, w61 w61Var, bg2 bg2Var) {
        vdVar.getClass();
        w61Var.getClass();
        this.a = vdVar;
        this.b = set;
        q6 q6Var = new q6(5, bg2Var, this);
        w61Var.getClass();
        ?? obj = new Object();
        obj.d = w61Var;
        obj.e = q6Var;
        Object obj2 = new Object();
        obj.c = obj2;
        synchronized (obj2) {
            obj.f = hv.L(w61Var, null, null, new ns3(obj, null, 20), 3);
        }
        this.d = obj;
        hv.L(w61Var, null, null, new a6(this, null, 1), 3);
    }

    public final jb4 a() {
        ra4 ra4Var = this.d;
        synchronized (ra4Var.c) {
            try {
                if (ra4Var.b) {
                    return null;
                }
                int i = ra4Var.a + 1;
                ra4Var.a = i;
                if (i == 1) {
                    ap6 ap6Var = (ap6) ra4Var.f;
                    if (ap6Var != null) {
                        ap6Var.h(null);
                    }
                    ra4Var.f = null;
                }
                return new jb4(ra4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(s41 s41Var) {
        Object C = f04.C(this.a.u, new m8(2, null, 1), s41Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        jg7 jg7Var = jg7.a;
        if (C != x61Var) {
            C = jg7Var;
        }
        if (C == x61Var) {
            return C;
        }
        return jg7Var;
    }

    public final void c() {
        this.d.c();
        this.a.a();
    }

    public final jg7 d(pq7 pq7Var, jb4 jb4Var) {
        jg7 jg7Var = jg7.a;
        pq7 pq7Var2 = this.c;
        this.c = pq7Var;
        if (pq7Var2 != null) {
            pq7Var2.a(null);
        }
        tp6 tp6Var = this.a.u;
        synchronized (pq7Var.e) {
            if (pq7Var.f) {
                jb4Var.b();
            } else {
                pq7Var.k = hv.L(pq7Var.c, null, null, new bf4(tp6Var, pq7Var, null, 26), 3);
                pq7Var.l = jb4Var;
            }
        }
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return jg7Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) xf0.b(this.a.a));
        sb.append(")@");
        int hashCode = hashCode();
        g04.y(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }
}
