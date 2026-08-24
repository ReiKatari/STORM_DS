package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbsj<MessageType extends zbsj<MessageType, BuilderType>, BuilderType extends zbsi<MessageType, BuilderType>> implements zbvm {
    protected int zba = 0;

    public int zbj(zbvx zbvxVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final zbtc zbk() {
        try {
            int zbo = zbo();
            zbtc zbtcVar = zbtc.zbb;
            byte[] bArr = new byte[zbo];
            zbth zbthVar = new zbth(bArr, 0, zbo);
            zbL(zbthVar);
            return zbsy.zba(zbthVar, bArr);
        } catch (IOException e) {
            u34.p(lb1.A("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] zbl() {
        try {
            int zbo = zbo();
            byte[] bArr = new byte[zbo];
            zbth zbthVar = new zbth(bArr, 0, zbo);
            zbL(zbthVar);
            zbthVar.zbF();
            return bArr;
        } catch (IOException e) {
            u34.p(lb1.A("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
