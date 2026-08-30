package nd;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j1 implements ld.e, l {

    /* renamed from: a  reason: collision with root package name */
    public final ld.e f10323a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10324b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f10325c;

    public j1(ld.e eVar) {
        eVar.getClass();
        this.f10323a = eVar;
        this.f10324b = eVar.b() + '?';
        this.f10325c = a1.b(eVar);
    }

    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        return this.f10323a.a(str);
    }

    @Override // ld.e
    public final String b() {
        return this.f10324b;
    }

    @Override // ld.e
    public final d0.d c() {
        return this.f10323a.c();
    }

    @Override // ld.e
    public final int d() {
        return this.f10323a.d();
    }

    @Override // ld.e
    public final String e(int i2) {
        return this.f10323a.e(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        if (nc.k.a(this.f10323a, ((j1) obj).f10323a)) {
            return true;
        }
        return false;
    }

    @Override // ld.e
    public final boolean f() {
        return this.f10323a.f();
    }

    @Override // nd.l
    public final Set g() {
        return this.f10325c;
    }

    @Override // ld.e
    public final List getAnnotations() {
        return this.f10323a.getAnnotations();
    }

    @Override // ld.e
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.f10323a.hashCode() * 31;
    }

    @Override // ld.e
    public final List i(int i2) {
        return this.f10323a.i(i2);
    }

    @Override // ld.e
    public final ld.e j(int i2) {
        return this.f10323a.j(i2);
    }

    @Override // ld.e
    public final boolean k(int i2) {
        return this.f10323a.k(i2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10323a);
        sb2.append('?');
        return sb2.toString();
    }
}
