package me.magnum.melonds;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b {
    public static me.magnum.melonds.MelonRomDecryptor.b a(int r3) {
            t52 r0 = me.magnum.melonds.MelonRomDecryptor.b.getEntries()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            r2 = r1
            me.magnum.melonds.MelonRomDecryptor$b r2 = (me.magnum.melonds.MelonRomDecryptor.b) r2
            int r2 = r2.getCode()
            if (r2 != r3) goto L8
            goto L1d
        L1c:
            r1 = 0
        L1d:
            me.magnum.melonds.MelonRomDecryptor$b r1 = (me.magnum.melonds.MelonRomDecryptor.b) r1
            if (r1 != 0) goto L24
            me.magnum.melonds.MelonRomDecryptor$b r3 = me.magnum.melonds.MelonRomDecryptor.b.ERROR_READING_FILE
            return r3
        L24:
            return r1
    }
}
