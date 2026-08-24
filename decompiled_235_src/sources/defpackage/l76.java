package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l76  reason: default package */
/* loaded from: classes.dex */
public final class l76 {
    public final k76 a;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k76] */
    public l76(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new j76(nestedScrollView);
        } else {
            this.a = new Object();
        }
    }
}
