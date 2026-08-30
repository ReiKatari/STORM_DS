package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l03  reason: default package */
/* loaded from: classes.dex */
public final class l03 extends InputConnectionWrapper {
    public final /* synthetic */ a31 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l03(InputConnection inputConnection, a31 a31Var) {
        super(inputConnection, false);
        this.a = a31Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        t71 t71Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            t71Var = new t71(27, new n03(inputContentInfo));
        }
        if (this.a.h(t71Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
