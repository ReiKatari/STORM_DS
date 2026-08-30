package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od  reason: default package */
/* loaded from: classes.dex */
public final class od implements ip0 {
    public final Context a;
    public ClipboardManager b;

    public od(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager == null) {
            Object systemService = this.a.getSystemService("clipboard");
            systemService.getClass();
            ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
            this.b = clipboardManager2;
            return clipboardManager2;
        }
        return clipboardManager;
    }
}
