package tf;

import android.view.Display;
import nc.k;
import sf.c;
import ve.g;
import ve.h;
import ve.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends c {
    @Override // sf.c
    public final i b(Display display, Display display2) {
        g gVar;
        h hVar;
        g gVar2;
        if (k.a(display.getName(), "Built-in Screen")) {
            gVar = g.BUILT_IN;
        } else {
            gVar = g.EXTERNAL;
        }
        h a10 = a(display, gVar);
        if (display2 != null) {
            if (k.a(display2.getName(), "Built-in Screen")) {
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
