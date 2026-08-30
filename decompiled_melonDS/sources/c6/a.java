package c6;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ ShortcutInfo.Builder a(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    public static /* bridge */ /* synthetic */ ShortcutManager e(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return ShortcutManager.class;
    }

    public static /* synthetic */ void g() {
    }
}
