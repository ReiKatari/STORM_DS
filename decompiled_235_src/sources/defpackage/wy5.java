package defpackage;

import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wy5  reason: default package */
/* loaded from: classes.dex */
public final class wy5 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy5(a aVar, int i) {
        super(0);
        this.B = i;
        this.L = aVar;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.B;
        a aVar = this.L;
        switch (i) {
            case 0:
                return aVar.requireActivity().getViewModelStore();
            case 1:
                return aVar.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return aVar.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
