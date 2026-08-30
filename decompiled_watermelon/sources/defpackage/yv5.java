package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yv5  reason: default package */
/* loaded from: classes.dex */
public final class yv5 {
    public final xv5 a;

    /* JADX WARN: Type inference failed for: r3v1, types: [xv5, java.lang.Object] */
    public yv5(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new wv5(nestedScrollView);
        } else {
            this.a = new Object();
        }
    }
}
