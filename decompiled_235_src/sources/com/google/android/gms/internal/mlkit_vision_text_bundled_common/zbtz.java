package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbtz<MessageType extends zbuf<MessageType, BuilderType>, BuilderType extends zbtz<MessageType, BuilderType>> extends zbsi<MessageType, BuilderType> {
    protected zbuf zba;
    private final zbuf zbb;

    public zbtz(MessageType messagetype) {
        this.zbb = messagetype;
        if (!messagetype.zbG()) {
            this.zba = messagetype.zbt();
        } else {
            i.h("Default instance must be immutable.");
            throw null;
        }
    }

    private static void zba(Object obj, Object obj2) {
        zbvu.zba().zbb(obj.getClass()).zbg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi
    /* renamed from: zbg */
    public final zbtz zbf() {
        zbtz zbtzVar = (zbtz) this.zbb.zbb(5, null, null);
        zbtzVar.zba = zbl();
        return zbtzVar;
    }

    public final zbtz zbh(zbuf zbufVar) {
        if (!this.zbb.equals(zbufVar)) {
            if (!this.zba.zbG()) {
                zbo();
            }
            zba(this.zba, zbufVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl
    /* renamed from: zbi */
    public final MessageType zbk() {
        MessageType zbl = zbl();
        if (zbuf.zbF(zbl, true)) {
            return zbl;
        }
        throw new zbwk(zbl);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvl
    /* renamed from: zbj */
    public MessageType zbl() {
        boolean zbG = this.zba.zbG();
        MessageType messagetype = (MessageType) this.zba;
        if (!zbG) {
            return messagetype;
        }
        messagetype.zbB();
        return (MessageType) this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final /* bridge */ /* synthetic */ zbvm zbm() {
        throw null;
    }

    public final void zbn() {
        if (!this.zba.zbG()) {
            zbo();
        }
    }

    public void zbo() {
        zbuf zbt = this.zbb.zbt();
        zba(zbt, this.zba);
        this.zba = zbt;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn
    public final boolean zbp() {
        return zbuf.zbF(this.zba, false);
    }
}
