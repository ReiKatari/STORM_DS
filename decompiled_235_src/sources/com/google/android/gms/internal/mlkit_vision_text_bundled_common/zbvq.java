package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvq implements zbvx {
    private final zbvm zba;
    private final zbwl zbb;
    private final boolean zbc;
    private final zbtq zbd;

    private zbvq(zbwl zbwlVar, zbtq zbtqVar, zbvm zbvmVar) {
        this.zbb = zbwlVar;
        this.zbc = zbvmVar instanceof zbub;
        this.zbd = zbtqVar;
        this.zba = zbvmVar;
    }

    public static zbvq zbc(zbwl zbwlVar, zbtq zbtqVar, zbvm zbvmVar) {
        return new zbvq(zbwlVar, zbtqVar, zbvmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(Object obj) {
        int zbb = ((zbuf) obj).zbc.zbb();
        if (this.zbc) {
            return zbb + ((zbub) obj).zbb.zbc();
        }
        return zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(Object obj) {
        int hashCode = ((zbuf) obj).zbc.hashCode();
        if (this.zbc) {
            return (hashCode * 53) + ((zbub) obj).zbb.zba.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final Object zbe() {
        zbvm zbvmVar = this.zba;
        if (zbvmVar instanceof zbuf) {
            return ((zbuf) zbvmVar).zbt();
        }
        return zbvmVar.zbJ().zbl();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(Object obj) {
        this.zbb.zbb(obj);
        this.zbd.zba(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(Object obj, Object obj2) {
        zbvz.zbp(this.zbb, obj, obj2);
        if (this.zbc) {
            zbvz.zbo(this.zbd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8 A[EDGE_INSN: B:59:0x00b8->B:33:0x00b8 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zbh(Object obj, byte[] bArr, int i, int i2, zbsq zbsqVar) {
        int i3;
        zbuf zbufVar = (zbuf) obj;
        zbwm zbwmVar = zbufVar.zbc;
        if (zbwmVar == zbwm.zbc()) {
            zbwmVar = zbwm.zbf();
            zbufVar.zbc = zbwmVar;
        }
        zbwm zbwmVar2 = zbwmVar;
        zbtu zbg = ((zbub) obj).zbg();
        zbud zbudVar = null;
        while (i < i2) {
            int zbk = zbsr.zbk(bArr, i, zbsqVar);
            int i4 = zbsqVar.zba;
            if (i4 != 11) {
                if ((i4 & 7) == 2) {
                    zbudVar = zbsqVar.zbd.zbc(this.zba, i4 >>> 3);
                    if (zbudVar != null) {
                        i = zbsr.zbe(zbvu.zba().zbb(zbudVar.zba.getClass()), bArr, zbk, i2, zbsqVar);
                        zbg.zbj(zbudVar.zbb, zbsqVar.zbc);
                    } else {
                        i = zbsr.zbj(i4, bArr, zbk, i2, zbwmVar2, zbsqVar);
                    }
                } else {
                    i = zbsr.zbq(i4, bArr, zbk, i2, zbsqVar);
                }
            } else {
                int i5 = i2;
                zbsq zbsqVar2 = zbsqVar;
                int i6 = 0;
                zbtc zbtcVar = null;
                while (true) {
                    if (zbk < i5) {
                        i3 = zbsr.zbk(bArr, zbk, zbsqVar2);
                        int i7 = zbsqVar2.zba;
                        int i8 = i7 >>> 3;
                        int i9 = i7 & 7;
                        if (i8 != 2) {
                            if (i8 == 3) {
                                if (zbudVar != null) {
                                    zbk = zbsr.zbe(zbvu.zba().zbb(zbudVar.zba.getClass()), bArr, i3, i5, zbsqVar2);
                                    zbg.zbj(zbudVar.zbb, zbsqVar2.zbc);
                                } else if (i9 == 2) {
                                    zbk = zbsr.zba(bArr, i3, zbsqVar2);
                                    zbtcVar = (zbtc) zbsqVar2.zbc;
                                }
                            }
                            if (i7 != 12) {
                                break;
                            }
                            zbk = zbsr.zbq(i7, bArr, i3, i5, zbsqVar2);
                        } else if (i9 == 0) {
                            zbk = zbsr.zbk(bArr, i3, zbsqVar2);
                            i6 = zbsqVar2.zba;
                            zbudVar = zbsqVar2.zbd.zbc(this.zba, i6);
                        } else if (i7 != 12) {
                        }
                    } else {
                        i3 = zbk;
                        break;
                    }
                }
                if (zbtcVar != null) {
                    zbwmVar2.zbj((i6 << 3) | 2, zbtcVar);
                }
                i = i3;
                i2 = i5;
                zbsqVar = zbsqVar2;
            }
        }
        if (i == i2) {
            return;
        }
        fa6.j("Failed to parse the message.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbi(Object obj, zbwy zbwyVar) {
        Iterator zbg = ((zbub) obj).zbb.zbg();
        while (zbg.hasNext()) {
            Map.Entry entry = (Map.Entry) zbg.next();
            zbtt zbttVar = (zbtt) entry.getKey();
            if (zbttVar.zbe() == zbwx.MESSAGE) {
                zbttVar.zbg();
                zbttVar.zbf();
                if (entry instanceof zbut) {
                    zbttVar.zba();
                    zbwyVar.zbx(32149011, ((zbut) entry).zba().zbb());
                } else {
                    zbttVar.zba();
                    zbwyVar.zbx(32149011, entry.getValue());
                }
            } else {
                i.m("Found invalid MessageSet item.");
                return;
            }
        }
        ((zbuf) obj).zbc.zbk(zbwyVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(Object obj, Object obj2) {
        if (!((zbuf) obj).zbc.equals(((zbuf) obj2).zbc)) {
            return false;
        }
        if (this.zbc) {
            return ((zbub) obj).zbb.equals(((zbub) obj2).zbb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(Object obj) {
        return ((zbub) obj).zbb.zbm();
    }
}
