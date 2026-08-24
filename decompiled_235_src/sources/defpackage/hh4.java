package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh4  reason: default package */
/* loaded from: classes.dex */
public class hh4 extends gh4 {
    @Override // defpackage.gh4, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        lf5 lf5Var = this.b;
        if (lf5Var != null) {
            return lf5Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
