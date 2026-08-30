package defpackage;

import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v56  reason: default package */
/* loaded from: classes.dex */
public final class v56 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ShortcutSetupActivity B;

    public /* synthetic */ v56(ShortcutSetupActivity shortcutSetupActivity, int i) {
        this.A = i;
        this.B = shortcutSetupActivity;
    }

    @Override // defpackage.ki2
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
