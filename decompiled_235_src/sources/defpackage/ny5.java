package defpackage;

import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny5  reason: default package */
/* loaded from: classes.dex */
public final class ny5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ RomListActivity B;

    public /* synthetic */ ny5(RomListActivity romListActivity, int i) {
        this.A = i;
        this.B = romListActivity;
    }

    @Override // defpackage.on2
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
