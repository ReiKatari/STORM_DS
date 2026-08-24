package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbua extends zbtz implements zbvn {
    public zbua(zbub zbubVar) {
        super(zbubVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl
    /* renamed from: zbd */
    public final zbub zbl() {
        boolean zbG = ((zbub) this.zba).zbG();
        zbuf zbufVar = this.zba;
        if (!zbG) {
            return (zbub) zbufVar;
        }
        ((zbub) zbufVar).zbb.zbh();
        return (zbub) super.zbl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz
    public final void zbo() {
        super.zbo();
        if (((zbub) this.zba).zbb != zbtu.zbe()) {
            zbub zbubVar = (zbub) this.zba;
            zbubVar.zbb = zbubVar.zbb.clone();
        }
    }
}
