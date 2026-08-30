package q4;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class n extends m {
    @Override // q4.m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        d2.v vVar = this.f12259b;
        if (vVar != null) {
            return vVar.commitContent(inputContentInfo, i2, bundle);
        }
        return false;
    }
}
