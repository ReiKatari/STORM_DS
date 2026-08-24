package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        sb7.b(context);
        bt a2 = fz.a();
        if (queryParameter != null) {
            a2.B = queryParameter;
            a2.R = d35.b(intValue);
            if (queryParameter2 != null) {
                a2.L = Base64.decode(queryParameter2, 0);
            }
            p87 p87Var = sb7.a().d;
            ((Executor) p87Var.e).execute(new rh7(p87Var, a2.A(), i, sb.B));
            return;
        }
        u34.x("Null backendName");
    }
}
