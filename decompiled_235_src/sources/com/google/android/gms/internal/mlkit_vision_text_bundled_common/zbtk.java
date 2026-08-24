package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbtk extends zbst {
    private static final Logger zbb = Logger.getLogger(zbtk.class.getName());
    private static final boolean zbc = zbws.zbx();
    zbtl zba;

    public /* synthetic */ zbtk(zbtj zbtjVar) {
    }

    public static int zbA(zbvm zbvmVar) {
        int zbo = zbvmVar.zbo();
        return zbD(zbo) + zbo;
    }

    public static int zbB(zbvm zbvmVar, zbvx zbvxVar) {
        int zbj = ((zbsj) zbvmVar).zbj(zbvxVar);
        return zbD(zbj) + zbj;
    }

    public static int zbC(String str) {
        int length;
        try {
            length = zbwv.zbc(str);
        } catch (zbwu unused) {
            length = str.getBytes(zbuo.zba).length;
        }
        return zbD(length) + length;
    }

    public static int zbD(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zbE(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int zbz(int i, zbvm zbvmVar, zbvx zbvxVar) {
        int zbD = zbD(i << 3);
        return ((zbsj) zbvmVar).zbj(zbvxVar) + zbD + zbD;
    }

    public final void zbF() {
        if (zba() == 0) {
            return;
        }
        i.m("Did not write as much data as expected.");
    }

    public final void zbG(String str, zbwu zbwuVar) {
        zbb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zbwuVar);
        byte[] bytes = str.getBytes(zbuo.zba);
        try {
            int length = bytes.length;
            zbw(length);
            zbn(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zbti(e);
        }
    }

    public abstract int zba();

    public abstract void zbb(byte b);

    public abstract void zbd(int i, boolean z);

    public abstract void zbe(byte[] bArr, int i, int i2);

    public abstract void zbf(int i, zbtc zbtcVar);

    public abstract void zbg(zbtc zbtcVar);

    public abstract void zbh(int i, int i2);

    public abstract void zbi(int i);

    public abstract void zbj(int i, long j);

    public abstract void zbk(long j);

    public abstract void zbl(int i, int i2);

    public abstract void zbm(int i);

    public abstract void zbn(byte[] bArr, int i, int i2);

    public abstract void zbo(int i, zbvm zbvmVar, zbvx zbvxVar);

    public abstract void zbp(zbvm zbvmVar);

    public abstract void zbq(int i, zbvm zbvmVar);

    public abstract void zbr(int i, zbtc zbtcVar);

    public abstract void zbs(int i, String str);

    public abstract void zbt(String str);

    public abstract void zbu(int i, int i2);

    public abstract void zbv(int i, int i2);

    public abstract void zbw(int i);

    public abstract void zbx(int i, long j);

    public abstract void zby(long j);

    private zbtk() {
        throw null;
    }
}
