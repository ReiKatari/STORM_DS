package a6;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class v0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo H = gVar.f455a.H();
        Objects.requireNonNull(H);
        ContentInfo performReceiveContent = view.performReceiveContent(H);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == H) {
            return gVar;
        }
        return new g(new a0.b(performReceiveContent));
    }
}
