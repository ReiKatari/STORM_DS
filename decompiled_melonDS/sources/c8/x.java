package c8;

import a1.w0;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2717a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f2718b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f2719c;

    /* JADX WARN: Type inference failed for: r0v0, types: [c8.a, c8.z] */
    static {
        ?? zVar = new z();
        zVar.f2723z0 = false;
        zVar.Q(new h(2));
        zVar.Q(new t());
        zVar.Q(new h(1));
        f2717a = zVar;
        f2718b = new ThreadLocal();
        f2719c = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [c8.w, android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = f2719c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (tVar == null) {
                tVar = f2717a;
            }
            t clone = tVar.clone();
            c(viewGroup, clone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj = new Object();
            obj.A = clone;
            obj.B = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [a1.w0, java.lang.Object, a1.e] */
    public static a1.e b() {
        a1.e eVar;
        ThreadLocal threadLocal = f2718b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (a1.e) weakReference.get()) != null) {
            return eVar;
        }
        ?? w0Var = new w0(0);
        threadLocal.set(new WeakReference(w0Var));
        return w0Var;
    }

    public static void c(ViewGroup viewGroup, t tVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((t) obj).B(viewGroup);
            }
        }
        if (tVar != null) {
            tVar.j(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) == null) {
            return;
        }
        m9.o.b();
    }
}
