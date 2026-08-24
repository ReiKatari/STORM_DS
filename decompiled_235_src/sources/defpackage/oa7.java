package defpackage;

import android.view.ViewGroup;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa7  reason: default package */
/* loaded from: classes.dex */
public abstract class oa7 {
    public static final nx a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    /* JADX WARN: Type inference failed for: r0v0, types: [qa7, nx] */
    static {
        ?? qa7Var = new qa7();
        qa7Var.B0 = false;
        qa7Var.Q(new h92(2));
        qa7Var.Q(new ea7());
        qa7Var.Q(new h92(1));
        a = qa7Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [na7, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, ea7 ea7Var) {
        ArrayList arrayList = c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (ea7Var == null) {
                ea7Var = a;
            }
            ea7 clone = ea7Var.clone();
            c(viewGroup, clone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj = new Object();
            obj.A = clone;
            obj.B = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ci6, java.lang.Object, wu] */
    public static wu b() {
        wu wuVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (wuVar = (wu) weakReference.get()) != null) {
            return wuVar;
        }
        ?? ci6Var = new ci6(0);
        threadLocal.set(new WeakReference(ci6Var));
        return ci6Var;
    }

    public static void c(ViewGroup viewGroup, ea7 ea7Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ea7) obj).B(viewGroup);
            }
        }
        if (ea7Var != null) {
            ea7Var.i(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) == null) {
            return;
        }
        u34.a();
    }
}
