package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final x1 f1414a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final z1 f1415b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.x1, java.lang.Object] */
    static {
        z1 z1Var = null;
        try {
            z1Var = (z1) c8.n.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f1415b = z1Var;
    }

    public static final void a(int i2, ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(i2);
        }
    }
}
