package mg;

import n2.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s9.a f9649a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9650b;

    public i(s9.a aVar, boolean z10) {
        this.f9649a = aVar;
        this.f9650b = z10;
    }

    @Override // n2.g0
    public final void dispose() {
        a0.b bVar = this.f9649a.f12850b;
        if (bVar == null) {
            return;
        }
        bVar.X(this.f9650b);
    }
}
