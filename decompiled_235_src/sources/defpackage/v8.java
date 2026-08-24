package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@pd4("activity")
/* renamed from: v8  reason: default package */
/* loaded from: classes.dex */
public class v8 extends qd4 {
    public final Activity c;

    public v8(Context context) {
        Object obj;
        context.getClass();
        Iterator it = sb6.Z(context, new k4(8)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.c = (Activity) obj;
    }

    @Override // defpackage.qd4
    public final ic4 a() {
        return new ic4(this);
    }

    @Override // defpackage.qd4
    public final ic4 c(ic4 ic4Var) {
        throw new IllegalStateException(lb1.o(new StringBuilder("Destination "), ((u8) ic4Var).B.a, " does not have an Intent set.").toString());
    }

    @Override // defpackage.qd4
    public final boolean f() {
        Activity activity = this.c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
