package androidx.camera.camera2.compat.quirk;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ExtraSupportedSurfaceCombinationsQuirk implements u65 {
    public static final ev6 a;
    public static final ev6 b;
    public static final Set c;
    public static final Set d;

    static {
        ev6 ev6Var = new ev6();
        tr6 tr6Var = jv6.e;
        hv6 hv6Var = hv6.YUV;
        fv6 fv6Var = fv6.VGA;
        tr6 tr6Var2 = jv6.e;
        ev6Var.a(w31.m(hv6Var, fv6Var, tr6Var2));
        hv6 hv6Var2 = hv6.PRIV;
        fv6 fv6Var2 = fv6.PREVIEW;
        ev6Var.a(w31.m(hv6Var2, fv6Var2, tr6Var2));
        fv6 fv6Var3 = fv6.MAXIMUM;
        ev6Var.a(w31.m(hv6Var, fv6Var3, tr6Var2));
        a = ev6Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(w31.m(hv6Var, fv6Var, tr6Var2));
        arrayList.add(w31.m(hv6Var, fv6Var2, tr6Var2));
        arrayList.add(w31.m(hv6Var, fv6Var3, tr6Var2));
        ev6 ev6Var2 = new ev6();
        lb1.u(ev6Var2, w31.m(hv6Var2, fv6Var2, tr6Var2), hv6Var2, fv6Var, tr6Var2);
        ev6Var2.a(w31.m(hv6Var, fv6Var3, tr6Var2));
        b = ev6Var2;
        c = fv.V0(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = fv.V0(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
