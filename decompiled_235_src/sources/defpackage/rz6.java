package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz6  reason: default package */
/* loaded from: classes.dex */
public final class rz6 implements Iterable {
    public final ArrayList A = new ArrayList();
    public final Context B;

    public rz6(Context context) {
        this.B = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.B;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        try {
            for (Intent E = ej2.E(context, componentName); E != null; E = ej2.E(context, E.getComponent())) {
                arrayList.add(size, E);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
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
        i.m("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
