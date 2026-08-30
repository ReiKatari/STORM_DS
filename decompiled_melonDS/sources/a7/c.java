package a7;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@l0("activity")
/* loaded from: classes.dex */
public class c extends m0 {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f548c;

    public c(Context context) {
        Object obj;
        context.getClass();
        Iterator it = uc.h.J(context, new a(0)).iterator();
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
        this.f548c = (Activity) obj;
    }

    @Override // a7.m0
    public final x a() {
        return new x(this);
    }

    @Override // a7.m0
    public final x c(x xVar) {
        throw new IllegalStateException(w.d.q(new StringBuilder("Destination "), ((b) xVar).B.f248a, " does not have an Intent set.").toString());
    }

    @Override // a7.m0
    public final boolean f() {
        Activity activity = this.f548c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
