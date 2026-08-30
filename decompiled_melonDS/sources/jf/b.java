package jf;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.squareup.picasso.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7866a;

    /* renamed from: b  reason: collision with root package name */
    public Long f7867b;

    public b(Context context) {
        this.f7866a = context;
        l lVar = new l(1, this);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(lVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        } else {
            context.registerReceiver(lVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }
}
