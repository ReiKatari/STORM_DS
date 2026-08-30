package b4;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements m1 {

    /* renamed from: a  reason: collision with root package name */
    public final j f1856a;

    public i(j jVar) {
        this.f1856a = jVar;
    }

    public final void a(l1 l1Var) {
        ClipboardManager clipboardManager = this.f1856a.f1864a;
        if (l1Var == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
                return;
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                return;
            }
        }
        clipboardManager.setPrimaryClip(l1Var.f1876a);
    }
}
