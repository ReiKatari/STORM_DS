package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rx6  reason: default package */
/* loaded from: classes.dex */
public abstract class rx6 {
    public static final ow a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    /* JADX WARN: Type inference failed for: r0v0, types: [tx6, ow] */
    static {
        ?? tx6Var = new tx6();
        tx6Var.A0 = false;
        tx6Var.Q(new o42(2));
        tx6Var.Q(new ix6());
        tx6Var.Q(new o42(1));
        a = tx6Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, qx6] */
    public static void a(ViewGroup viewGroup, ix6 ix6Var) {
        ArrayList arrayList = c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (ix6Var == null) {
                ix6Var = a;
            }
            ix6 clone = ix6Var.clone();
            c(viewGroup, clone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj = new Object();
            obj.A = clone;
            obj.B = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [eu, java.lang.Object, m66] */
    public static eu b() {
        eu euVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (euVar = (eu) weakReference.get()) != null) {
            return euVar;
        }
        ?? m66Var = new m66(0);
        threadLocal.set(new WeakReference(m66Var));
        return m66Var;
    }

    public static void c(ViewGroup viewGroup, ix6 ix6Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ix6) obj).B(viewGroup);
            }
        }
        if (ix6Var != null) {
            ix6Var.j(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) == null) {
            return;
        }
        c44.b();
    }
}
