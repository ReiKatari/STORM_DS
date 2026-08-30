package defpackage;

import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: do5  reason: default package */
/* loaded from: classes.dex */
public final class do5 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ a L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do5(a aVar, int i) {
        super(0);
        this.B = i;
        this.L = aVar;
    }

    @Override // defpackage.ki2
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
