package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xl6  reason: default package */
/* loaded from: classes.dex */
public final class xl6 {
    public static final String d = y70.h("SystemJobInfoConverter");
    public final ComponentName a;
    public final hm1 b;
    public final boolean c;

    public xl6(Context context, hm1 hm1Var, boolean z) {
        this.b = hm1Var;
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.c = z;
    }
}
