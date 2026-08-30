package ld;

import java.util.List;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final f f9016a;

    /* renamed from: b  reason: collision with root package name */
    public final nc.e f9017b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9018c;

    public b(f fVar, nc.e eVar) {
        eVar.getClass();
        this.f9016a = fVar;
        this.f9017b = eVar;
        this.f9018c = fVar.f9030a + '<' + eVar.c() + '>';
    }

    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        return this.f9016a.a(str);
    }

    @Override // ld.e
    public final String b() {
        return this.f9018c;
    }

    @Override // ld.e
    public final d0.d c() {
        return this.f9016a.f9031b;
    }

    @Override // ld.e
    public final int d() {
        return this.f9016a.f9032c;
    }

    @Override // ld.e
    public final String e(int i2) {
        return this.f9016a.f9035f[i2];
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && this.f9016a.equals(bVar.f9016a) && k.a(bVar.f9017b, this.f9017b)) {
            return true;
        }
        return false;
    }

    @Override // ld.e
    public final boolean f() {
        return false;
    }

    @Override // ld.e
    public final List getAnnotations() {
        return this.f9016a.f9033d;
    }

    @Override // ld.e
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f9018c.hashCode() + (this.f9017b.hashCode() * 31);
    }

    @Override // ld.e
    public final List i(int i2) {
        return this.f9016a.f9037h[i2];
    }

    @Override // ld.e
    public final e j(int i2) {
        return this.f9016a.f9036g[i2];
    }

    @Override // ld.e
    public final boolean k(int i2) {
        return this.f9016a.f9038i[i2];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f9017b + ", original: " + this.f9016a + ')';
    }
}
