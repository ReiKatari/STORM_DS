package defpackage;

import androidx.preference.Preference;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wx0  reason: default package */
/* loaded from: classes.dex */
public final class wx0 implements x05 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.x05
    public final boolean a(Preference preference, Object obj) {
        preference.getClass();
        ArrayList arrayList = this.a;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (!((x05) obj2).a(preference, obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
