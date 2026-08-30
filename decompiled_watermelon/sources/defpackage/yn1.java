package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yn1  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class yn1 {
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
