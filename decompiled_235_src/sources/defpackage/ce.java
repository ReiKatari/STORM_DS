package defpackage;

import android.content.ClipData;
import android.os.Build;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce  reason: default package */
/* loaded from: classes.dex */
public final class ce implements tr0 {
    public final de a;

    public ce(de deVar) {
        this.a = deVar;
    }

    public final void a(sr0 sr0Var) {
        de deVar = this.a;
        if (sr0Var == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                deVar.a().clearPrimaryClip();
                return;
            } else {
                deVar.a().setPrimaryClip(ClipData.newPlainText("", ""));
                return;
            }
        }
        deVar.a().setPrimaryClip(sr0Var.a);
    }
}
