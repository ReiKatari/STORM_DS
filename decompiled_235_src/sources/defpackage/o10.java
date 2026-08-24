package defpackage;

import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o10  reason: default package */
/* loaded from: classes.dex */
public final class o10 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ BackgroundsActivity B;

    public /* synthetic */ o10(BackgroundsActivity backgroundsActivity, int i) {
        this.A = i;
        this.B = backgroundsActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        BackgroundsActivity backgroundsActivity = this.B;
        switch (i) {
            case 0:
                return backgroundsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return backgroundsActivity.getViewModelStore();
            default:
                return backgroundsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
