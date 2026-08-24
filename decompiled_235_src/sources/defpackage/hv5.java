package defpackage;

import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hv5  reason: default package */
/* loaded from: classes.dex */
public final class hv5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomDetailsActivity B;

    public /* synthetic */ hv5(RomDetailsActivity romDetailsActivity, int i) {
        this.A = i;
        this.B = romDetailsActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        RomDetailsActivity romDetailsActivity = this.B;
        switch (i) {
            case 0:
                return romDetailsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return romDetailsActivity.getViewModelStore();
            case 2:
                return romDetailsActivity.getDefaultViewModelCreationExtras();
            case 3:
                return romDetailsActivity.getDefaultViewModelProviderFactory();
            case 4:
                return romDetailsActivity.getViewModelStore();
            default:
                return romDetailsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
