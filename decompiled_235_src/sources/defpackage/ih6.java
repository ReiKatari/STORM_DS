package defpackage;

import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih6  reason: default package */
/* loaded from: classes.dex */
public final class ih6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ShortcutSetupActivity B;

    public /* synthetic */ ih6(ShortcutSetupActivity shortcutSetupActivity, int i) {
        this.A = i;
        this.B = shortcutSetupActivity;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        ShortcutSetupActivity shortcutSetupActivity = this.B;
        switch (i) {
            case 0:
                return shortcutSetupActivity.getDefaultViewModelProviderFactory();
            case 1:
                return shortcutSetupActivity.getViewModelStore();
            default:
                return shortcutSetupActivity.getDefaultViewModelCreationExtras();
        }
    }
}
