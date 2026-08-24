package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvf {
    private final zbve zba;

    private zbvf(zbww zbwwVar, Object obj, zbww zbwwVar2, Object obj2) {
        this.zba = new zbve(zbwwVar, obj, zbwwVar2, obj2);
    }

    public static int zbb(zbve zbveVar, Object obj, Object obj2) {
        return zbtu.zba(zbveVar.zba, 1, obj) + zbtu.zba(zbveVar.zbc, 2, obj2);
    }

    public static zbvf zbd(zbww zbwwVar, Object obj, zbww zbwwVar2, Object obj2) {
        return new zbvf(zbwwVar, obj, zbwwVar2, obj2);
    }

    public static void zbe(zbtk zbtkVar, zbve zbveVar, Object obj, Object obj2) {
        zbtu.zbk(zbtkVar, zbveVar.zba, 1, obj);
        zbtu.zbk(zbtkVar, zbveVar.zbc, 2, obj2);
    }

    public final int zba(int i, Object obj, Object obj2) {
        zbve zbveVar = this.zba;
        int zbD = zbtk.zbD(i << 3);
        int zbb = zbb(zbveVar, obj, obj2);
        return xg6.b(zbb, zbb, zbD);
    }

    public final zbve zbc() {
        return this.zba;
    }
}
