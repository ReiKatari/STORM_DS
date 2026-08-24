package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtl implements zbwy {
    private final zbtk zba;

    private zbtl(zbtk zbtkVar) {
        byte[] bArr = zbuo.zbb;
        this.zba = zbtkVar;
        zbtkVar.zba = this;
    }

    public static zbtl zba(zbtk zbtkVar) {
        zbtl zbtlVar = zbtkVar.zba;
        if (zbtlVar != null) {
            return zbtlVar;
        }
        return new zbtl(zbtkVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbA(int i, long j) {
        this.zba.zbj(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbB(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbvaVar.size(); i4++) {
                    zbvaVar.zbe(i4);
                    i3 += 8;
                }
                this.zba.zbw(i3);
                while (i2 < zbvaVar.size()) {
                    this.zba.zbk(zbvaVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbvaVar.size()) {
                this.zba.zbj(i, zbvaVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).getClass();
                i5 += 8;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbk(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbC(int i, int i2) {
        zbtk zbtkVar = this.zba;
        zbtkVar.zbv(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbD(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbugVar.size(); i4++) {
                    int zbe = zbugVar.zbe(i4);
                    i3 += zbtk.zbD((zbe >> 31) ^ (zbe + zbe));
                }
                this.zba.zbw(i3);
                while (i2 < zbugVar.size()) {
                    zbtk zbtkVar = this.zba;
                    int zbe2 = zbugVar.zbe(i2);
                    zbtkVar.zbw((zbe2 >> 31) ^ (zbe2 + zbe2));
                    i2++;
                }
                return;
            }
            while (i2 < zbugVar.size()) {
                zbtk zbtkVar2 = this.zba;
                int zbe3 = zbugVar.zbe(i2);
                zbtkVar2.zbv(i, (zbe3 >> 31) ^ (zbe3 + zbe3));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                i5 += zbtk.zbD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                zbtk zbtkVar3 = this.zba;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zbtkVar3.zbw((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zbtk zbtkVar4 = this.zba;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zbtkVar4.zbv(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbE(int i, long j) {
        zbtk zbtkVar = this.zba;
        zbtkVar.zbx(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbF(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbvaVar.size(); i4++) {
                    long zbe = zbvaVar.zbe(i4);
                    i3 += zbtk.zbE((zbe >> 63) ^ (zbe + zbe));
                }
                this.zba.zbw(i3);
                while (i2 < zbvaVar.size()) {
                    zbtk zbtkVar = this.zba;
                    long zbe2 = zbvaVar.zbe(i2);
                    zbtkVar.zby((zbe2 >> 63) ^ (zbe2 + zbe2));
                    i2++;
                }
                return;
            }
            while (i2 < zbvaVar.size()) {
                zbtk zbtkVar2 = this.zba;
                long zbe3 = zbvaVar.zbe(i2);
                zbtkVar2.zbx(i, (zbe3 >> 63) ^ (zbe3 + zbe3));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long longValue = ((Long) list.get(i6)).longValue();
                i5 += zbtk.zbE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                zbtk zbtkVar3 = this.zba;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zbtkVar3.zby((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zbtk zbtkVar4 = this.zba;
                long longValue3 = ((Long) list.get(i2)).longValue();
                zbtkVar4.zbx(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @Deprecated
    public final void zbG(int i) {
        this.zba.zbu(i, 3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbH(int i, String str) {
        this.zba.zbs(i, str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbI(int i, List list) {
        int i2 = 0;
        if (list instanceof zbux) {
            zbux zbuxVar = (zbux) list;
            while (i2 < list.size()) {
                Object zba = zbuxVar.zba();
                boolean z = zba instanceof String;
                zbtk zbtkVar = this.zba;
                if (z) {
                    zbtkVar.zbs(i, (String) zba);
                } else {
                    zbtkVar.zbf(i, (zbtc) zba);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zba.zbs(i, (String) list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbJ(int i, int i2) {
        this.zba.zbv(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbK(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbugVar.size(); i4++) {
                    i3 += zbtk.zbD(zbugVar.zbe(i4));
                }
                this.zba.zbw(i3);
                while (i2 < zbugVar.size()) {
                    this.zba.zbw(zbugVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbugVar.size()) {
                this.zba.zbv(i, zbugVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zbtk.zbD(((Integer) list.get(i6)).intValue());
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbw(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbv(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbL(int i, long j) {
        this.zba.zbx(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbM(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbvaVar.size(); i4++) {
                    i3 += zbtk.zbE(zbvaVar.zbe(i4));
                }
                this.zba.zbw(i3);
                while (i2 < zbvaVar.size()) {
                    this.zba.zby(zbvaVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbvaVar.size()) {
                this.zba.zbx(i, zbvaVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zbtk.zbE(((Long) list.get(i6)).longValue());
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zby(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbx(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbb(int i, boolean z) {
        this.zba.zbd(i, z);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbc(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbss) {
            zbss zbssVar = (zbss) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbssVar.size(); i4++) {
                    zbssVar.zbf(i4);
                    i3++;
                }
                this.zba.zbw(i3);
                while (i2 < zbssVar.size()) {
                    this.zba.zbb(zbssVar.zbf(i2) ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < zbssVar.size()) {
                this.zba.zbd(i, zbssVar.zbf(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Boolean) list.get(i6)).getClass();
                i5++;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbd(int i, zbtc zbtcVar) {
        this.zba.zbf(i, zbtcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbe(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zba.zbf(i, (zbtc) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbf(int i, double d) {
        this.zba.zbj(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbg(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbtm) {
            zbtm zbtmVar = (zbtm) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbtmVar.size(); i4++) {
                    zbtmVar.zbe(i4);
                    i3 += 8;
                }
                this.zba.zbw(i3);
                while (i2 < zbtmVar.size()) {
                    this.zba.zbk(Double.doubleToRawLongBits(zbtmVar.zbe(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zbtmVar.size()) {
                this.zba.zbj(i, Double.doubleToRawLongBits(zbtmVar.zbe(i2)));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Double) list.get(i6)).getClass();
                i5 += 8;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    @Deprecated
    public final void zbh(int i) {
        this.zba.zbu(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbi(int i, int i2) {
        this.zba.zbl(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbj(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbugVar.size(); i4++) {
                    i3 += zbtk.zbE(zbugVar.zbe(i4));
                }
                this.zba.zbw(i3);
                while (i2 < zbugVar.size()) {
                    this.zba.zbm(zbugVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbugVar.size()) {
                this.zba.zbl(i, zbugVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zbtk.zbE(((Integer) list.get(i6)).intValue());
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbk(int i, int i2) {
        this.zba.zbh(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbl(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbugVar.size(); i4++) {
                    zbugVar.zbe(i4);
                    i3 += 4;
                }
                this.zba.zbw(i3);
                while (i2 < zbugVar.size()) {
                    this.zba.zbi(zbugVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbugVar.size()) {
                this.zba.zbh(i, zbugVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbi(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbm(int i, long j) {
        this.zba.zbj(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbn(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbvaVar.size(); i4++) {
                    zbvaVar.zbe(i4);
                    i3 += 8;
                }
                this.zba.zbw(i3);
                while (i2 < zbvaVar.size()) {
                    this.zba.zbk(zbvaVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbvaVar.size()) {
                this.zba.zbj(i, zbvaVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).getClass();
                i5 += 8;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbk(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbo(int i, float f) {
        this.zba.zbh(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbp(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbtw) {
            zbtw zbtwVar = (zbtw) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbtwVar.size(); i4++) {
                    zbtwVar.zbe(i4);
                    i3 += 4;
                }
                this.zba.zbw(i3);
                while (i2 < zbtwVar.size()) {
                    this.zba.zbi(Float.floatToRawIntBits(zbtwVar.zbe(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zbtwVar.size()) {
                this.zba.zbh(i, Float.floatToRawIntBits(zbtwVar.zbe(i2)));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Float) list.get(i6)).getClass();
                i5 += 4;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbq(int i, Object obj, zbvx zbvxVar) {
        zbtk zbtkVar = this.zba;
        zbtkVar.zbu(i, 3);
        zbvxVar.zbi((zbvm) obj, zbtkVar.zba);
        zbtkVar.zbu(i, 4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbr(int i, int i2) {
        this.zba.zbl(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbs(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbugVar.size(); i4++) {
                    i3 += zbtk.zbE(zbugVar.zbe(i4));
                }
                this.zba.zbw(i3);
                while (i2 < zbugVar.size()) {
                    this.zba.zbm(zbugVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbugVar.size()) {
                this.zba.zbl(i, zbugVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zbtk.zbE(((Integer) list.get(i6)).intValue());
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbt(int i, long j) {
        this.zba.zbx(i, j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbu(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbva) {
            zbva zbvaVar = (zbva) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbvaVar.size(); i4++) {
                    i3 += zbtk.zbE(zbvaVar.zbe(i4));
                }
                this.zba.zbw(i3);
                while (i2 < zbvaVar.size()) {
                    this.zba.zby(zbvaVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbvaVar.size()) {
                this.zba.zbx(i, zbvaVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zbtk.zbE(((Long) list.get(i6)).longValue());
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zby(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbx(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbv(int i, zbve zbveVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.zba.zbu(i, 2);
            this.zba.zbw(zbvf.zbb(zbveVar, entry.getKey(), entry.getValue()));
            zbvf.zbe(this.zba, zbveVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbw(int i, Object obj, zbvx zbvxVar) {
        this.zba.zbo(i, (zbvm) obj, zbvxVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbx(int i, Object obj) {
        boolean z = obj instanceof zbtc;
        zbtk zbtkVar = this.zba;
        if (z) {
            zbtkVar.zbr(i, (zbtc) obj);
        } else {
            zbtkVar.zbq(i, (zbvm) obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zby(int i, int i2) {
        this.zba.zbh(i, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy
    public final void zbz(int i, List list, boolean z) {
        int i2 = 0;
        if (list instanceof zbug) {
            zbug zbugVar = (zbug) list;
            if (z) {
                this.zba.zbu(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zbugVar.size(); i4++) {
                    zbugVar.zbe(i4);
                    i3 += 4;
                }
                this.zba.zbw(i3);
                while (i2 < zbugVar.size()) {
                    this.zba.zbi(zbugVar.zbe(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zbugVar.size()) {
                this.zba.zbh(i, zbugVar.zbe(i2));
                i2++;
            }
        } else if (z) {
            this.zba.zbu(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).getClass();
                i5 += 4;
            }
            this.zba.zbw(i5);
            while (i2 < list.size()) {
                this.zba.zbi(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zba.zbh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }
}
