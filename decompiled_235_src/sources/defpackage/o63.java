package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o63  reason: default package */
/* loaded from: classes.dex */
public final class o63 extends InputConnectionWrapper {
    public final /* synthetic */ h61 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o63(InputConnection inputConnection, h61 h61Var) {
        super(inputConnection, false);
        this.a = h61Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        s63 s63Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            s63Var = new s63(new q63(inputContentInfo), 0);
        }
        if (this.a.g(s63Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
