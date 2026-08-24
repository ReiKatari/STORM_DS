package me.magnum.melonds;

import java.util.Iterator;
import me.magnum.melonds.MelonRomDecryptor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class a {
    public static MelonRomDecryptor.a a(int i) {
        Object obj;
        Iterator<E> it = MelonRomDecryptor.a.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((MelonRomDecryptor.a) obj).getCode() == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        MelonRomDecryptor.a aVar = (MelonRomDecryptor.a) obj;
        if (aVar == null) {
            return MelonRomDecryptor.a.ERROR_READING_FILE;
        }
        return aVar;
    }
}
