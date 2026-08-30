package defpackage;

import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xn5  reason: default package */
/* loaded from: classes.dex */
public final class xn5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomListActivity B;

    public /* synthetic */ xn5(RomListActivity romListActivity, int i) {
        this.A = i;
        this.B = romListActivity;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        RomListActivity romListActivity = this.B;
        switch (i) {
            case 0:
                return romListActivity.getDefaultViewModelProviderFactory();
            case 1:
                return romListActivity.getViewModelStore();
            case 2:
                return romListActivity.getDefaultViewModelCreationExtras();
            case 3:
                return romListActivity.getDefaultViewModelProviderFactory();
            case 4:
                return romListActivity.getViewModelStore();
            default:
                return romListActivity.getDefaultViewModelCreationExtras();
        }
    }
}
