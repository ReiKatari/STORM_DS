package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c72  reason: default package */
/* loaded from: classes.dex */
public final class c72 implements f92 {
    public final /* synthetic */ int a;

    public /* synthetic */ c72(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [wr0, java.lang.Object] */
    @Override // defpackage.n55
    public final Object get() {
        switch (this.a) {
            case 0:
                return new lx2(Executors.newSingleThreadExecutor());
            default:
                ?? obj = new Object();
                HashMap hashMap = new HashMap();
                b35 b35Var = b35.DEFAULT;
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(b35Var, new vy(30000L, 86400000L, set));
                    b35 b35Var2 = b35.HIGHEST;
                    if (set != null) {
                        hashMap.put(b35Var2, new vy(1000L, 86400000L, set));
                        b35 b35Var3 = b35.VERY_LOW;
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(f66.NETWORK_UNMETERED, f66.DEVICE_IDLE)));
                            if (unmodifiableSet != null) {
                                hashMap.put(b35Var3, new vy(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= b35.values().length) {
                                    new HashMap();
                                    return new uy(obj, hashMap);
                                }
                                i.m("Not all priorities have been configured");
                                return null;
                            }
                            u34.x("Null flags");
                            return null;
                        }
                        u34.x("Null flags");
                        return null;
                    }
                    u34.x("Null flags");
                    return null;
                }
                u34.x("Null flags");
                return null;
        }
    }
}
