package defpackage;

import android.util.Log;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zv2 extends po2 implements eo2 {
    public static final zv2 d0 = new po2(2, jw2.class, "logHardcoreSubmissionQueueTrace", "logHardcoreSubmissionQueueTrace(Ljava/lang/String;Ljava/util/List;)V", 1);

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        String str = (String) obj;
        List<vr4> list = (List) obj2;
        str.getClass();
        list.getClass();
        StringBuilder sb = new StringBuilder("event_type=");
        sb.append(str);
        sb.append(" submit_path=hardcore_queue");
        for (vr4 vr4Var : list) {
            String str2 = (String) vr4Var.A;
            Object obj3 = vr4Var.B;
            if (obj3 != null) {
                sb.append(' ');
                sb.append(str2);
                sb.append('=');
                sb.append(xs6.d0(obj3.toString(), ' ', '_'));
            }
        }
        Log.i("RATrace", sb.toString());
        return jg7.a;
    }
}
