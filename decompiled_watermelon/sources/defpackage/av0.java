package defpackage;

import androidx.preference.Preference;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: av0  reason: default package */
/* loaded from: classes.dex */
public final class av0 implements ur4 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.ur4
    public final boolean a(Preference preference, Object obj) {
        preference.getClass();
        ArrayList arrayList = this.a;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (!((ur4) obj2).a(preference, obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
