package vj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a extends v8.e {
    @Override // v8.e
    public final v8.e c() {
        return (a) ((v8.e) this.f13763b);
    }

    @Override // v8.e
    public final void e(v8.e eVar) {
        if (eVar instanceof a) {
            this.f13763b = eVar;
        } else {
            a0.j.h("Parent of block must also be block (can not be inline)");
        }
    }
}
