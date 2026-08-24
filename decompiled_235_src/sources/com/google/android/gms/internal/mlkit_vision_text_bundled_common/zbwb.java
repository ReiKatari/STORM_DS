package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbwb implements Map.Entry, Comparable {
    final /* synthetic */ zbwh zba;
    private final Comparable zbb;
    private Object zbc;

    public zbwb(zbwh zbwhVar, Comparable comparable, Object obj) {
        this.zba = zbwhVar;
        this.zbb = comparable;
        this.zbc = obj;
    }

    private static final boolean zbb(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zbb.compareTo(((zbwb) obj).zbb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zbb(this.zbb, entry.getKey()) && zbb(this.zbc, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zbb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zbc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.zbb;
        int i = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.zbc;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        zbwh.zbi(this.zba);
        Object obj2 = this.zbc;
        this.zbc = obj;
        return obj2;
    }

    public final String toString() {
        return lb1.m(String.valueOf(this.zbb), "=", String.valueOf(this.zbc));
    }

    public final Comparable zba() {
        return this.zbb;
    }
}
