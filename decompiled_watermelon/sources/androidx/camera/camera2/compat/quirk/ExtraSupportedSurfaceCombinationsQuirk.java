package androidx.camera.camera2.compat.quirk;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ExtraSupportedSurfaceCombinationsQuirk implements kx4 {
    public static final kj6 a;
    public static final kj6 b;
    public static final Set c;
    public static final Set d;

    static {
        kj6 kj6Var = new kj6();
        cg6 cg6Var = pj6.e;
        nj6 nj6Var = nj6.YUV;
        lj6 lj6Var = lj6.VGA;
        cg6 cg6Var2 = pj6.e;
        kj6Var.a(jo1.r(nj6Var, lj6Var, cg6Var2));
        nj6 nj6Var2 = nj6.PRIV;
        lj6 lj6Var2 = lj6.PREVIEW;
        kj6Var.a(jo1.r(nj6Var2, lj6Var2, cg6Var2));
        lj6 lj6Var3 = lj6.MAXIMUM;
        kj6Var.a(jo1.r(nj6Var, lj6Var3, cg6Var2));
        a = kj6Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(jo1.r(nj6Var, lj6Var, cg6Var2));
        arrayList.add(jo1.r(nj6Var, lj6Var2, cg6Var2));
        arrayList.add(jo1.r(nj6Var, lj6Var3, cg6Var2));
        kj6 kj6Var2 = new kj6();
        wh1.v(kj6Var2, jo1.r(nj6Var2, lj6Var2, cg6Var2), nj6Var2, lj6Var, cg6Var2);
        kj6Var2.a(jo1.r(nj6Var, lj6Var3, cg6Var2));
        b = kj6Var2;
        c = nu.H0(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = nu.H0(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
