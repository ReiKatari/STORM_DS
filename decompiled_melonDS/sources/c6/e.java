package c6;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ah.e f2616a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, ah.e eVar) {
        super(inputConnection, false);
        this.f2616a = eVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        a0.b bVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            bVar = new a0.b(16, new g(inputContentInfo));
        }
        if (this.f2616a.g(bVar, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
