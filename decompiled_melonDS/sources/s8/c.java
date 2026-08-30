package s8;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p8.v;
import p8.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final String f12845d = v.g("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f12846a;

    /* renamed from: b  reason: collision with root package name */
    public final x f12847b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12848c;

    public c(Context context, x xVar, boolean z10) {
        this.f12847b = xVar;
        this.f12846a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.f12848c = z10;
    }
}
