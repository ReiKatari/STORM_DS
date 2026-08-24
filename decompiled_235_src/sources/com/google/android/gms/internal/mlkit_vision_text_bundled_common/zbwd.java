package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwd implements Iterator {
    final /* synthetic */ zbwh zba;
    private int zbb = -1;
    private boolean zbc;
    private Iterator zbd;

    private final Iterator zba() {
        Map map;
        if (this.zbd == null) {
            map = this.zba.zbc;
            this.zbd = map.entrySet().iterator();
        }
        return this.zbd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zbb + 1;
        zbwh zbwhVar = this.zba;
        i = zbwhVar.zbb;
        if (i2 >= i) {
            map = zbwhVar.zbc;
            if (!map.isEmpty() && zba().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zbc = true;
        int i2 = this.zbb + 1;
        this.zbb = i2;
        zbwh zbwhVar = this.zba;
        i = zbwhVar.zbb;
        if (i2 < i) {
            objArr = zbwhVar.zba;
            return (zbwb) objArr[i2];
        }
        return (Map.Entry) zba().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (this.zbc) {
            this.zbc = false;
            this.zba.zbo();
            int i2 = this.zbb;
            zbwh zbwhVar = this.zba;
            i = zbwhVar.zbb;
            if (i2 < i) {
                this.zbb = i2 - 1;
                zbwhVar.zbm(i2);
                return;
            }
            zba().remove();
            return;
        }
        i.m("remove() was called before next()");
    }
}
