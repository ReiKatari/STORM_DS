package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@j54("activity")
/* renamed from: u8  reason: default package */
/* loaded from: classes.dex */
public class u8 extends k54 {
    public final Activity c;

    public u8(Context context) {
        Object obj;
        context.getClass();
        Iterator it = d06.x0(context, new k4(8)).iterator();
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

    @Override // defpackage.k54
    public final b44 a() {
        return new b44(this);
    }

    @Override // defpackage.k54
    public final b44 c(b44 b44Var) {
        throw new IllegalStateException(wh1.m(new StringBuilder("Destination "), ((t8) b44Var).B.a, " does not have an Intent set.").toString());
    }

    @Override // defpackage.k54
    public final boolean f() {
        Activity activity = this.c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
