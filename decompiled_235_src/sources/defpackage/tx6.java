package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx6  reason: default package */
/* loaded from: classes.dex */
public final class tx6 {
    public static final String d = ga0.h("SystemJobInfoConverter");
    public final ComponentName a;
    public final q61 b;
    public final boolean c;

    public tx6(Context context, q61 q61Var, boolean z) {
        this.b = q61Var;
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
        this.c = z;
    }
}
