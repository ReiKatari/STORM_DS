package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr  reason: default package */
/* loaded from: classes.dex */
public final class vr extends ik2 {
    public final /* synthetic */ cs f0;
    public final /* synthetic */ fs g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(fs fsVar, fs fsVar2, cs csVar) {
        super(fsVar2);
        this.g0 = fsVar;
        this.f0 = csVar;
    }

    @Override // defpackage.ik2
    public final lh6 b() {
        return this.f0;
    }

    @Override // defpackage.ik2
    public final boolean c() {
        fs fsVar = this.g0;
        if (!fsVar.getInternalPopup().a()) {
            fsVar.e0.l(fsVar.getTextDirection(), fsVar.getTextAlignment());
            return true;
        }
        return true;
    }
}
