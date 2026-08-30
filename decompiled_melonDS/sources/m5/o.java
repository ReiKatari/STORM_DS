package m5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o implements Iterable {
    public final ArrayList A = new ArrayList();
    public final Context B;

    public o(Context context) {
        this.B = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.B;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        try {
            for (Intent a10 = c.a(context, componentName); a10 != null; a10 = c.a(context, a10.getComponent())) {
                arrayList.add(size, a10);
            }
        } catch (PackageManager.NameNotFoundException e6) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e6);
        }
    }

    public final void b() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.B.startActivities(intentArr, null);
            return;
        }
        a0.j.p("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
