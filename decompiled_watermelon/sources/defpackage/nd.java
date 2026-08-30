package defpackage;

import android.content.ClipData;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nd  reason: default package */
/* loaded from: classes.dex */
public final class nd implements hp0 {
    public final od a;

    public nd(od odVar) {
        this.a = odVar;
    }

    public final void a(gp0 gp0Var) {
        od odVar = this.a;
        if (gp0Var == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                odVar.a().clearPrimaryClip();
                return;
            } else {
                odVar.a().setPrimaryClip(ClipData.newPlainText("", ""));
                return;
            }
        }
        odVar.a().setPrimaryClip(gp0Var.a);
    }
}
