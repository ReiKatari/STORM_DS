package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtr extends zbtq {
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq
    public final void zba(Object obj) {
        ((zbub) obj).zbb.zbh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq
    public final void zbb(zbwy zbwyVar, Map.Entry entry) {
        zbww zbwwVar = zbww.zba;
        switch (((zbuc) entry.getKey()).zbb.ordinal()) {
            case 0:
                zbwyVar.zbf(32149011, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zbwyVar.zbo(32149011, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zbwyVar.zbt(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zbwyVar.zbL(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zbwyVar.zbr(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zbwyVar.zbm(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zbwyVar.zbk(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zbwyVar.zbb(32149011, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zbwyVar.zbH(32149011, (String) entry.getValue());
                return;
            case 9:
                zbwyVar.zbq(32149011, entry.getValue(), zbvu.zba().zbb(entry.getValue().getClass()));
                return;
            case 10:
                zbwyVar.zbw(32149011, entry.getValue(), zbvu.zba().zbb(entry.getValue().getClass()));
                return;
            case 11:
                zbwyVar.zbd(32149011, (zbtc) entry.getValue());
                return;
            case 12:
                zbwyVar.zbJ(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zbwyVar.zbr(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zbwyVar.zby(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zbwyVar.zbA(32149011, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zbwyVar.zbC(32149011, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zbwyVar.zbE(32149011, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
