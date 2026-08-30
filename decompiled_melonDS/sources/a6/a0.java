package a6;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final z f441a;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, a6.z] */
    public a0(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f441a = new y(nestedScrollView);
        } else {
            this.f441a = new Object();
        }
    }
}
