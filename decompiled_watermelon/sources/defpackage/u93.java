package defpackage;

import android.view.View;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u93  reason: default package */
/* loaded from: classes.dex */
public final class u93 {
    public final HashMap a;

    public u93(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap(3);
                return;
            case 2:
                this.a = new HashMap();
                return;
            case 3:
                this.a = new HashMap(3);
                return;
            default:
                this.a = new HashMap();
                return;
        }
    }

    public float a(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = this.a;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public void b(Class cls, du3 du3Var) {
        this.a.put(cls, du3Var);
    }

    public void c(Class cls, k30 k30Var) {
        this.a.put(cls, k30Var);
    }
}
