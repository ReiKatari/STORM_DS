package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f1471a;

    /* renamed from: b  reason: collision with root package name */
    public final k0.e f1472b;

    /* renamed from: c  reason: collision with root package name */
    public int f1473c = -1;

    public e0(d0 d0Var, k0.e eVar) {
        this.f1471a = d0Var;
        this.f1472b = eVar;
    }

    @Override // androidx.lifecycle.g0
    public final void a(Object obj) {
        int i2 = this.f1473c;
        int i10 = this.f1471a.f1466g;
        if (i2 != i10) {
            this.f1473c = i10;
            this.f1472b.a(obj);
        }
    }
}
