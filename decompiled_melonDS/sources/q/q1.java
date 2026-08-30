package q;

import android.widget.AbsListView;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f11992a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e6) {
            e6.printStackTrace();
        }
        f11992a = field;
    }
}
