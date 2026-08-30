package b5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ l f2055b0;

    public k(l lVar) {
        this.f2055b0 = lVar;
    }

    @Override // b5.h
    public final String g() {
        i iVar = (i) this.f2055b0.A.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f2051a + "]";
    }
}
