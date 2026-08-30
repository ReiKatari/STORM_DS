package tf;

import android.view.Display;
import java.util.List;
import p7.t;
import sf.c;
import ve.g;
import ve.h;
import ve.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public static final List f13184b = t.y("Built-in Screen", "Screen-2");

    @Override // sf.c
    public final i b(Display display, Display display2) {
        g gVar;
        h hVar;
        g gVar2;
        String name = display.getName();
        List list = f13184b;
        if (list.contains(name)) {
            gVar = g.BUILT_IN;
        } else {
            gVar = g.EXTERNAL;
        }
        h a10 = a(display, gVar);
        if (display2 != null) {
            if (list.contains(display2.getName())) {
                gVar2 = g.BUILT_IN;
            } else {
                gVar2 = g.EXTERNAL;
            }
            hVar = a(display2, gVar2);
        } else {
            hVar = null;
        }
        return new i(a10, hVar);
    }
}
