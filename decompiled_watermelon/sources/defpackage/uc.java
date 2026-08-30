package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uc  reason: default package */
/* loaded from: classes.dex */
public final class uc implements g2 {
    public final AccessibilityManager a;

    public uc(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
