package defpackage;

import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xz  reason: default package */
/* loaded from: classes.dex */
public final class xz implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ BackgroundsActivity B;

    public /* synthetic */ xz(BackgroundsActivity backgroundsActivity, int i) {
        this.A = i;
        this.B = backgroundsActivity;
    }

    @Override // defpackage.ki2
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
