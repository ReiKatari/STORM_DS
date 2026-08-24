package me.magnum.melonds;

import java.util.Iterator;
import me.magnum.melonds.MelonRomDecryptor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b {
    public static MelonRomDecryptor.b a(int i) {
        Object obj;
        Iterator<E> it = MelonRomDecryptor.b.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((MelonRomDecryptor.b) obj).getCode() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MelonRomDecryptor.b bVar = (MelonRomDecryptor.b) obj;
        if (bVar == null) {
            return MelonRomDecryptor.b.ERROR_READING_FILE;
        }
        return bVar;
    }
}
