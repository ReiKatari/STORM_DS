package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wg2  reason: default package */
/* loaded from: classes.dex */
public abstract class wg2 {
    public static final bh2 a = new Object();
    public static final dh2 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bh2] */
    static {
        dh2 dh2Var = null;
        try {
            dh2Var = (dh2) jh2.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = dh2Var;
    }

    public static final void a(int i, ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((View) obj).setVisibility(i);
        }
    }
}
