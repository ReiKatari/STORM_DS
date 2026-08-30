package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ir  reason: default package */
/* loaded from: classes.dex */
public final class ir extends jf2 {
    public final /* synthetic */ pr e0;
    public final /* synthetic */ sr f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir(sr srVar, sr srVar2, pr prVar) {
        super(srVar2);
        this.f0 = srVar;
        this.e0 = prVar;
    }

    @Override // defpackage.jf2
    public final y56 b() {
        return this.e0;
    }

    @Override // defpackage.jf2
    public final boolean c() {
        sr srVar = this.f0;
        if (!srVar.getInternalPopup().a()) {
            srVar.d0.k(srVar.getTextDirection(), srVar.getTextAlignment());
            return true;
        }
        return true;
    }
}
