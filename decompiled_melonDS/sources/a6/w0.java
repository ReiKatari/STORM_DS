package a6;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: d  reason: collision with root package name */
    public static final ArrayList f519d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f520a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f521b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f522c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f520a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a10 = a(viewGroup.getChildAt(childCount));
                    if (a10 != null) {
                        return a10;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                m9.o.b();
                return null;
            }
            return null;
        }
        return null;
    }
}
