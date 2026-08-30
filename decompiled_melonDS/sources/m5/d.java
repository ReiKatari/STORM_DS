package m5;

import android.app.Notification;
import android.content.Context;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static void b(Notification.Builder builder, boolean z10) {
        builder.setAllowSystemGeneratedContextualActions(z10);
    }

    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }
}
