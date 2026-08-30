package defpackage;

import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rk5  reason: default package */
/* loaded from: classes.dex */
public final class rk5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomDetailsActivity B;

    public /* synthetic */ rk5(RomDetailsActivity romDetailsActivity, int i) {
        this.A = i;
        this.B = romDetailsActivity;
    }

    @Override // defpackage.ki2
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
