package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl2  reason: default package */
/* loaded from: classes.dex */
public abstract class wl2 {
    public static final bm2 a = new Object();
    public static final dm2 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [bm2, java.lang.Object] */
    static {
        dm2 dm2Var = null;
        try {
            dm2Var = (dm2) jm2.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = dm2Var;
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
