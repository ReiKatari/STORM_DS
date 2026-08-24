package defpackage;

import android.database.Cursor;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng3  reason: default package */
/* loaded from: classes.dex */
public final class ng3 implements g36 {
    public final HashMap A;

    public ng3(int i) {
        switch (i) {
            case 1:
                this.A = new HashMap(3);
                return;
            case 2:
                this.A = new HashMap();
                return;
            case 3:
                this.A = new HashMap(3);
                return;
            default:
                this.A = new HashMap();
                return;
        }
    }

    public float a(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = this.A;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    @Override // defpackage.g36
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        c42 c42Var = i36.X;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = this.A;
            Set set = (Set) hashMap.get(valueOf);
            if (set == null) {
                set = new HashSet();
                hashMap.put(Long.valueOf(j), set);
            }
            set.add(new h36(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public void b(Class cls, g14 g14Var) {
        this.A.put(cls, g14Var);
    }

    public void c(Class cls, i50 i50Var) {
        this.A.put(cls, i50Var);
    }

    public ng3(HashMap hashMap) {
        this.A = hashMap;
    }
}
