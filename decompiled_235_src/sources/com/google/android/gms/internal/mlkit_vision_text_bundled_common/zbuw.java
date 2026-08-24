package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbuw {
    protected volatile zbvm zba;
    private volatile zbtc zbb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbuw)) {
            return false;
        }
        zbuw zbuwVar = (zbuw) obj;
        zbvm zbvmVar = this.zba;
        zbvm zbvmVar2 = zbuwVar.zba;
        if (zbvmVar == null && zbvmVar2 == null) {
            return zbb().equals(zbuwVar.zbb());
        }
        if (zbvmVar != null && zbvmVar2 != null) {
            return zbvmVar.equals(zbvmVar2);
        }
        if (zbvmVar != null) {
            zbuwVar.zbd(zbvmVar.zbm());
            return zbvmVar.equals(zbuwVar.zba);
        }
        zbd(zbvmVar2.zbm());
        return this.zba.equals(zbvmVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zba() {
        if (this.zbb != null) {
            return ((zbtb) this.zbb).zba.length;
        }
        if (this.zba != null) {
            return this.zba.zbo();
        }
        return 0;
    }

    public final zbtc zbb() {
        if (this.zbb != null) {
            return this.zbb;
        }
        synchronized (this) {
            try {
                if (this.zbb != null) {
                    return this.zbb;
                }
                if (this.zba == null) {
                    this.zbb = zbtc.zbb;
                } else {
                    this.zbb = this.zba.zbk();
                }
                return this.zbb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zbvm zbc(zbvm zbvmVar) {
        zbvm zbvmVar2 = this.zba;
        this.zbb = null;
        this.zba = zbvmVar;
        return zbvmVar2;
    }

    public final void zbd(zbvm zbvmVar) {
        if (this.zba == null) {
            synchronized (this) {
                if (this.zba != null) {
                    return;
                }
                try {
                    this.zba = zbvmVar;
                    this.zbb = zbtc.zbb;
                } catch (zbuq unused) {
                    this.zba = zbvmVar;
                    this.zbb = zbtc.zbb;
                }
            }
        }
    }
}
