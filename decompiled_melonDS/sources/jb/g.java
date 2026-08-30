package jb;

import androidx.lifecycle.a1;
import androidx.lifecycle.y0;
import m9.o;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements a1 {

    /* renamed from: d  reason: collision with root package name */
    public static final x8.e f7789d = new x8.e(29);

    /* renamed from: a  reason: collision with root package name */
    public final nb.b f7790a;

    /* renamed from: b  reason: collision with root package name */
    public final a1 f7791b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7792c;

    public g(nb.b bVar, a1 a1Var, a0 a0Var) {
        this.f7790a = bVar;
        this.f7791b = a1Var;
        this.f7792c = new e(0, a0Var);
    }

    @Override // androidx.lifecycle.a1
    public final y0 a(Class cls) {
        if (!this.f7790a.containsKey(cls)) {
            return this.f7791b.a(cls);
        }
        o.v("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }

    @Override // androidx.lifecycle.a1
    public final y0 b(Class cls, w6.d dVar) {
        if (this.f7790a.containsKey(cls)) {
            return this.f7792c.b(cls, dVar);
        }
        return this.f7791b.b(cls, dVar);
    }
}
