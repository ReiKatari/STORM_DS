package c9;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2747a;

    /* renamed from: b  reason: collision with root package name */
    public final u f2748b;

    /* renamed from: c  reason: collision with root package name */
    public final b9.h f2749c;

    public n(Object obj, u uVar, b9.h hVar) {
        this.f2747a = obj;
        this.f2748b = uVar;
        this.f2749c = hVar;
    }

    public final boolean equals(Object obj) {
        boolean a10;
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                Object obj2 = nVar.f2747a;
                this.f2748b.getClass();
                Object obj3 = this.f2747a;
                if (obj3 != obj2) {
                    if ((obj3 instanceof m9.j) && (obj2 instanceof m9.j)) {
                        m9.j jVar = (m9.j) obj3;
                        m9.j jVar2 = (m9.j) obj2;
                        if (!nc.k.a(jVar.f9403a, jVar2.f9403a) || !jVar.f9404b.equals(jVar2.f9404b) || jVar.f9407e != jVar2.f9407e || !nc.k.a(jVar.f9409g, jVar2.f9409g) || !nc.k.a(jVar.f9411i, jVar2.f9411i) || jVar.f9413k != jVar2.f9413k || jVar.f9414l != jVar2.f9414l || jVar.m != jVar2.m || jVar.f9415n != jVar2.f9415n || jVar.f9416o != jVar2.f9416o || jVar.f9417p != jVar2.f9417p || jVar.f9418q != jVar2.f9418q || !jVar.f9424w.equals(jVar2.f9424w) || jVar.f9425x != jVar2.f9425x || jVar.f9408f != jVar2.f9408f || !jVar.f9426y.equals(jVar2.f9426y)) {
                            a10 = false;
                        }
                    } else {
                        a10 = nc.k.a(obj3, obj2);
                    }
                    if (a10 || !this.f2749c.equals(nVar.f2749c)) {
                    }
                }
                a10 = true;
                if (a10) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        this.f2748b.getClass();
        Object obj = this.f2747a;
        if (!(obj instanceof m9.j)) {
            if (obj != null) {
                hashCode = obj.hashCode();
            } else {
                hashCode = 0;
            }
        } else {
            m9.j jVar = (m9.j) obj;
            int hashCode2 = jVar.f9404b.hashCode();
            int hashCode3 = jVar.f9407e.hashCode();
            int e6 = w.d.e(w.d.e(w.d.e(w.d.e((((jVar.f9409g.hashCode() + ((hashCode3 + ((hashCode2 + (jVar.f9403a.hashCode() * 31)) * 923521)) * 961)) * 31) + Arrays.hashCode(jVar.f9411i.A)) * 31, jVar.f9413k, 31), jVar.f9414l, 31), jVar.m, 31), jVar.f9415n, 31);
            int hashCode4 = jVar.f9417p.hashCode();
            int hashCode5 = jVar.f9418q.hashCode();
            int hashCode6 = jVar.f9424w.hashCode();
            int hashCode7 = jVar.f9425x.hashCode();
            int hashCode8 = jVar.f9408f.hashCode();
            hashCode = jVar.f9426y.A.hashCode() + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((jVar.f9416o.hashCode() + e6) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }
        return this.f2749c.hashCode() + (hashCode * 31);
    }
}
