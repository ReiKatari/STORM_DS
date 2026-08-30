package b4;

import android.content.ClipboardManager;
import android.content.Context;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements n1 {

    /* renamed from: a  reason: collision with root package name */
    public final ClipboardManager f1864a;

    public j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.f1864a = (ClipboardManager) systemService;
    }
}
