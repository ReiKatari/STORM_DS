package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gn6  reason: default package */
/* loaded from: classes.dex */
public final class gn6 implements Iterable {
    public final ArrayList A = new ArrayList();
    public final Context B;

    public gn6(Context context) {
        this.B = context;
    }

    public final void b(ComponentName componentName) {
        Context context = this.B;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        try {
            for (Intent A = me2.A(context, componentName); A != null; A = me2.A(context, A.getComponent())) {
                arrayList.add(size, A);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void c() {
        ArrayList arrayList = this.A;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            this.B.startActivities(intentArr, null);
            return;
        }
        i.n("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
