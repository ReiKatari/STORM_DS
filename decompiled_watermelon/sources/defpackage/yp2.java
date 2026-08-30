package defpackage;

import android.util.Log;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yp2 extends lj2 implements aj2 {
    public static final yp2 c0 = new lj2(2, iq2.class, "logHardcoreSubmissionQueueTrace", "logHardcoreSubmissionQueueTrace(Ljava/lang/String;Ljava/util/List;)V", 1);

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        String str = (String) obj;
        List<ti4> list = (List) obj2;
        str.getClass();
        list.getClass();
        StringBuilder sb = new StringBuilder("event_type=");
        sb.append(str);
        sb.append(" submit_path=hardcore_queue");
        for (ti4 ti4Var : list) {
            String str2 = (String) ti4Var.A;
            Object obj3 = ti4Var.B;
            if (obj3 != null) {
                sb.append(' ');
                sb.append(str2);
                sb.append('=');
                sb.append(gh6.k0(obj3.toString(), ' ', '_'));
            }
        }
        Log.i("RATrace", sb.toString());
        return o27.a;
    }
}
