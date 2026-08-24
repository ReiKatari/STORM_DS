package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvg extends LinkedHashMap {
    private static final zbvg zba;
    private boolean zbb;

    static {
        zbvg zbvgVar = new zbvg();
        zba = zbvgVar;
        zbvgVar.zbb = false;
    }

    private zbvg() {
        this.zbb = true;
    }

    public static zbvg zba() {
        return zba;
    }

    private static int zbf(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int zbb = zbuo.zbb(length, bArr, 0, length);
            if (zbb == 0) {
                return 1;
            }
            return zbb;
        } else if (!(obj instanceof zbuh)) {
            return obj.hashCode();
        } else {
            e41.t();
            return 0;
        }
    }

    private final void zbg() {
        if (this.zbb) {
            return;
        }
        e41.t();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zbg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                                continue;
                            } else {
                                equals = value.equals(obj2);
                                continue;
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += zbf(entry.getValue()) ^ zbf(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zbg();
        byte[] bArr = zbuo.zbb;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zbg();
        for (Object obj : map.keySet()) {
            byte[] bArr = zbuo.zbb;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zbg();
        return super.remove(obj);
    }

    public final zbvg zbb() {
        if (isEmpty()) {
            return new zbvg();
        }
        return new zbvg(this);
    }

    public final void zbc() {
        this.zbb = false;
    }

    public final void zbd(zbvg zbvgVar) {
        zbg();
        if (!zbvgVar.isEmpty()) {
            putAll(zbvgVar);
        }
    }

    public final boolean zbe() {
        return this.zbb;
    }

    private zbvg(Map map) {
        super(map);
        this.zbb = true;
    }
}
