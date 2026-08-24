package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvd implements zbvy {
    private static final zbvk zba = new zbvb();
    private final zbvk zbb;

    public zbvd() {
        zbty zba2 = zbty.zba();
        int i = zbvu.zba;
        zbvc zbvcVar = new zbvc(zba2, zba);
        byte[] bArr = zbuo.zbb;
        this.zbb = zbvcVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvy
    public final zbvx zba(Class cls) {
        zbtq zbtqVar;
        int i = zbvz.zba;
        if (!zbuf.class.isAssignableFrom(cls)) {
            int i2 = zbvu.zba;
        }
        zbvj zbb = this.zbb.zbb(cls);
        if (!zbb.zbb()) {
            int i3 = zbvu.zba;
            zbvs zba2 = zbvt.zba();
            zbuy zba3 = zbuz.zba();
            zbwl zbm = zbvz.zbm();
            if (zbb.zbc() - 1 != 1) {
                zbtqVar = zbts.zba();
            } else {
                zbtqVar = null;
            }
            return zbvp.zbl(cls, zbb, zba2, zba3, zbm, zbtqVar, zbvi.zba());
        }
        int i4 = zbvu.zba;
        return zbvq.zbc(zbvz.zbm(), zbts.zba(), zbb.zba());
    }
}
