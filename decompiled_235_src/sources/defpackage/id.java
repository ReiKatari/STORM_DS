package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id  reason: default package */
/* loaded from: classes.dex */
public final class id implements i2 {
    public final AccessibilityManager a;

    public id(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
