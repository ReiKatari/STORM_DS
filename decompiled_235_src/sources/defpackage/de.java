package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de  reason: default package */
/* loaded from: classes.dex */
public final class de implements ur0 {
    public final Context a;
    public ClipboardManager b;

    public de(Context context) {
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
